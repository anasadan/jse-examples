package core.file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ehimnay on 18/03/2017.
 */
public class ReadMillionFiles {
    public static void main(String... args) throws IOException {
        for (String filePath : listFiles("C:/Mercury/github/postgres/1million", 200000)) {
            System.out.println(new String(Files.readAllBytes(Paths.get(filePath))));
        }
    }

    private static List<String> listFiles(String filePath, int maxFiles) throws IOException {
        final List<String> resources = new ArrayList<>(maxFiles);
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(filePath), getDirectoriesFilter())) {
            Iterator<Path> paths = directoryStream.iterator();
            for (int count = 0; paths.hasNext() && count < maxFiles; count++) {
                final Path path = paths.next();
                resources.add(path.toAbsolutePath().toString());
            }
        }
        return resources;
    }

    /**
     * Creates a filter for directories only
     * 
     * @return Object which implements DirectoryStream.Filter interface and that accepts directories only.
     */
    public static DirectoryStream.Filter<Path> getDirectoriesFilter() {

        final DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                return entry.toString().endsWith("csv");
            }
        };
        return filter;
    }
}
