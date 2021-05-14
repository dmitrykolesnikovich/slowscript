package compiler

import java.lang.StringBuilder

class ASTPrinter :  Expression.Visitor<String> {

    fun print(expression: Expression): String {
      return expression.accept(this)
    }



    private fun parenthesize(name: String, vararg expression: Expression): String {
        val builder = StringBuilder().run { append("(").append(name) }
        for (expr in expression) {

            builder.append(" ")
            builder.append(expr.accept(this))

        }
        builder.append(')')

        return builder.toString()
    }

    override fun <R> visit(expression: Expression.Binary): String {
     return parenthesize(expression.operator.lexeme, expression.left, expression.right)
    }

    override fun <R> visit(expression: Expression.Ternary): String {
        return parenthesize("${expression.questionMark}${expression.colon}", expression.left, expression.middle, expression.right)
    }

    override fun <R> visit(expression: Expression.Unary): String {
        return parenthesize(expression.prefix.lexeme, expression.expression)
    }

    override fun <R> visit(expression: Expression.Literal): String {
        if(expression.value.toString() == "null") return "null"
        return expression.value.toString()
    }

    override fun <R> visit(expression: Expression.Grouping): String {
        return parenthesize("group", expression.expression)
    }
}