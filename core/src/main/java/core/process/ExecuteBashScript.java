package main.java.core.process;

import java.io.File;

/**
 * Created by ehimnay on 29/03/2017.
 */
public class ExecuteBashScript {
    public static void main(String... args) {
        final String script = "C:/temp/hello.bat";
        new ExecuteBashScript().execute(script);
    }

    private void execute(final String script) {
        final ProcessBuilder processBuilder = new ProcessBuilder(script);
        processBuilder.directory(new File(script).getParentFile());
        Process process = null;
        try {
            process = processBuilder.start();
            process.waitFor();
            if(process.exitValue() == 1){
                System.out.println("Not good");
            }
        } catch (final Exception exception) {
            exception.printStackTrace();
            if (process != null && process.isAlive()) {
                process.destroy();
            }

        }
    }
}
