package org.eginez.gravy.type

import groovy.transform.CompileStatic
import groovy.transform.ToString
import org.codehaus.groovy.ast.expr.ConstantExpression

@CompileStatic
@ToString
class GravyConstantExpression {
    ConstantExpression constantExpression

    public GravyConstantExpression(ConstantExpression exp) {
        this.constantExpression = exp
    }
}
