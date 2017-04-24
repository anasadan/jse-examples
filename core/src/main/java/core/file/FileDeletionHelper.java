/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package core.file;

import static java.nio.file.FileVisitResult.CONTINUE;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;

import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileDeletionHelper {

    private final Logger logger = LoggerFactory.getLogger(FileDeletionHelper.class);

    public static void main(String[] args) {
        FileDeletionHelper fdh = new FileDeletionHelper();
        System.out.println(fdh.deleteFiles("C:\\temp\\1millionbk - Copy", 1));
    }

    /**
     * Delete files older than retention period.
     *
     * @param parentPath
     *            - directory path of the parent directory
     * @param retentionPeriodInMinutes
     *            - file retention period in minutes
     * @return no of files deleted
     */
    public int deleteFiles(final String parentPath, final int retentionPeriodInMinutes) {
        final Path directoryPath = Paths.get(parentPath);
        final AtomicInteger count = new AtomicInteger(0);
        if (Files.exists(directoryPath)) {
            try {
                Files.walkFileTree(directoryPath, new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult visitFile(final Path path, final BasicFileAttributes attributes) {
                        try {
                            final long lastModifiedTimed = attributes.lastModifiedTime().toMillis();
                            if (isOlderThanRetentionPeriod(lastModifiedTimed, retentionPeriodInMinutes)) {
                                Files.delete(path);
                                count.incrementAndGet();
                                System.out.println("path = [" + path + "], attributes = [" + lastModifiedTimed + "]");
                            }
                        } catch (final IOException ioException) {
                            logger.error("IOException while deleting file {} ", path, ioException.getMessage());
                        }
                        return CONTINUE;
                    }
                });
            } catch (final Exception exception) {
                logger.error("Exception while removing files ", exception.getMessage());
            }
        }
        return count.get();
    }

    private boolean isOlderThanRetentionPeriod(final long modifiedTime, final int retentionPeriodInMinutes) {
        final DateTime fileModifiedTime = new DateTime(modifiedTime);
        final DateTime currentTime = new DateTime(System.currentTimeMillis());
        return Minutes.minutesBetween(fileModifiedTime, currentTime).getMinutes() >= retentionPeriodInMinutes;
    }
}
