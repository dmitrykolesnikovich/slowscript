package compiler.interpreter

import tokens.Token
import java.lang.RuntimeException

 class RuntimeError(override val message: String?, val token: Token) : RuntimeException(message)