import kotlin.system.exitProcess
import java.io.File
import java.io.BufferedReader

class piekLite {

    companion object {
        var hadError = false;



        fun run( args : Array<String>) {

            if(args.size > 1) {

                println("Usage: piekL [script]")
                exitProcess(64);

            } else if( args.size == 1) {
                runFile(args[0])
            }



        }


        private fun runFile(path: String) {
            val bufRead : BufferedReader = File(path).bufferedReader()

            tokenCreator(bufRead)
        }

        fun error  (line: Int, message: String, where: String ) {
            println(Error("[line $line] Error $where: $message"));
            hadError = true
        }

        fun error(line: Int, message: String,) {
            println(Error("[line $line] Error $message"));
            hadError = true
        }

        fun reservedKeywords() : HashMap<String, TOKEN_TYPES> {
            val reservedKeywords = hashMapOf<String, TOKEN_TYPES>()
            reservedKeywords["super"] = TOKEN_TYPES.SUPER
            reservedKeywords["class"] = TOKEN_TYPES.CLASS
            reservedKeywords["return"] = TOKEN_TYPES.RETURN
            reservedKeywords["var"] = TOKEN_TYPES.MUTABLE_VARIABLE
            reservedKeywords["val"] = TOKEN_TYPES.IMMUTABLE_VARIABLE
            reservedKeywords["task"] = TOKEN_TYPES.TASK
            reservedKeywords["null"] = TOKEN_TYPES.NULL
            reservedKeywords["true"] = TOKEN_TYPES.TRUE
            reservedKeywords["null"] = TOKEN_TYPES.FALSE

            return reservedKeywords
        }


    }






}