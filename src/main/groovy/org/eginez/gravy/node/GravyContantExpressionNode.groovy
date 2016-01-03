package org.eginez.gravy.node

import com.oracle.truffle.api.frame.VirtualFrame
import groovy.transform.CompileStatic
import groovy.transform.ToString
import org.eginez.gravy.type.GravyConstantExpression

@CompileStatic
@ToString
class GravyContantExpressionNode extends GravyNode {
    final GravyConstantExpression expression;

    GravyContantExpressionNode(GravyConstantExpression exp) {
        this.expression = exp
    }

    @Override
    Object execute(VirtualFrame vFrame) {
        return expression.constantExpression.value
    }
}
