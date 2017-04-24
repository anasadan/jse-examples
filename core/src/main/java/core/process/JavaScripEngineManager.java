package main.java.core.process;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Created by ehimnay on 30/03/2017.
 */
public class JavaScripEngineManager {
    public static void main(String[] args) {
        final ScriptEngineManager manager = new ScriptEngineManager();
        final ScriptEngine engine = manager.getEngineByName("js");
        final String script = "print ('Hello World')";
        try {
            engine.eval(script);
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
    }
}
