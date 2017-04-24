package main.java.core.process;

import java.io.ByteArrayOutputStream;
import java.io.File;

import org.apache.commons.exec.*;

import static org.apache.commons.lang.StringUtils.EMPTY;

public class ApacheCommonExec {
    public static void main(String...args) {
        final String[] arguments = { "stopAllOperationOnFlsDB", "true", "false" };
        final String result = new ApacheCommonExec().execute("C:/temp/hello.bat", new Long(15000),arguments);
        System.out.println(result);
    }

    public String execute(final String script, final long timeoutInMilliSec, final String... argument) {
        try (final ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            final DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
            final PumpStreamHandler streamHandler = new PumpStreamHandler(outputStream);
            final File file = new File(script);
            final CommandLine commandLine = new CommandLine(file.getAbsolutePath());
            for (final String arg : argument) {
                commandLine.addArgument(arg);
            }
            final DefaultExecutor executor = new DefaultExecutor();
            executor.setStreamHandler(streamHandler);
            executor.setWorkingDirectory(file.getParentFile());
            executor.setWatchdog(new ExecuteWatchdog(timeoutInMilliSec));
            executor.execute(commandLine, resultHandler);
            resultHandler.waitFor();
            if( resultHandler.getExitValue() == 1){
                resultHandler.hasResult();
                throw resultHandler.getException();
            }
            // executor.execute(commandLine, resultHandler);
            return outputStream.toString();
        } catch (final ExecuteException executeException) {
            executeException.printStackTrace();
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
        return EMPTY;
    }
}
