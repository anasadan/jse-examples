package core.instrumentation;

import java.util.HashMap;

/**
 * Created by ehimnay on 28/02/2017.
 * jvm parameter -javaagent:path to program.jar
 */
public class ObjectSizeMain {

        public static void main(String[] args) {
                long memory = MemoryMeasurer.measureBytes(new HashMap());

        }

}
