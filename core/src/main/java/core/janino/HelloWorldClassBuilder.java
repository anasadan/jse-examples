package core.janino;

/**
 * Created by himansu on 24/05/2017.
 */
public class HelloWorldClassBuilder {

    public static String helloWorld() {
        final StringBuilder builder = new StringBuilder();
        builder.append("package core.janino;");
        builder.append("public class HelloWorld implements RuntimeClassInterface {");
        builder.append("    public void printHelloWorld() {");
        builder.append("        System.out.println( \"Hello World Janino!\");");
        builder.append("    }");
        builder.append("}");
        return builder.toString();
    }
}
