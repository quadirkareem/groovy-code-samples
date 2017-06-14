public class Execute {
    public static void main(String[] args) {
        //println "cmd /C java -version".execute().text
        
        def command = "cmd /C groovy -v" // Create the String
        //command = "cmd /C java -version"
        def proc = command.execute()  // Call *execute* on the string
        //proc.waitFor() // Wait for the command to finish
        
        println "${proc.in.text}"
        // Obtain status and output
       // println "return code: ${ proc.exitValue()}"
       // println "stderr: ${proc.err.text}"
       // println "stdout: ${proc.in.text}"
        // *out* from the external program is *in* for groovy
        
        def str = null
        // java.lang.NullPointerException: Cannot invoke method reverse() on null object
        // println str.reverse()
        // The ?. operator calls the method or property only if reference is not null
        println str?.reverse()
    }
}