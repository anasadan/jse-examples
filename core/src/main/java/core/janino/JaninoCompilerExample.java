package core.janino;

import org.codehaus.janino.CompileException;
import org.codehaus.janino.Parser;
import org.codehaus.janino.Scanner;
import org.codehaus.janino.SimpleCompiler;

/**
 * Created by himansu on 24/05/2017.
 */
public class JaninoCompilerExample {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, CompileException,
                                                  Scanner.ScanException, Parser.ParseException, ClassNotFoundException {
        String helloWorldClass = HelloWorldClassBuilder.helloWorld();

        // create the compiler and "cook" the text
        SimpleCompiler compiler = new SimpleCompiler();
        compiler.cook(helloWorldClass);

        // get a reference to the Class
        Class<RuntimeClassInterface> clazz = (Class<RuntimeClassInterface>) Class.forName(
                "core.janino.HelloWorld", true, compiler
                        .getClassLoader());

        // instantiate and call methods
        RuntimeClassInterface instance = clazz.newInstance();
        instance.printHelloWorld();
    }

}
