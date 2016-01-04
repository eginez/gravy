package org.eginez.gravy.type

import org.codehaus.groovy.ast.expr.VariableExpression

class GravyVariableExpression {
    VariableExpression expression
    def GravyVariableExpression(VariableExpression variableExpression) {
        this.expression = variableExpression
    }
}
