package org.eginez.gravy.node

import com.oracle.truffle.api.frame.VirtualFrame
import org.eginez.gravy.type.GravyVariableExpression

class GravyVariableExpressionNode extends GravyNode {
    GravyVariableExpression expression

    GravyVariableExpressionNode(GravyVariableExpression expression) {
        this.expression = expression
    }
    @Override
    Object execute(VirtualFrame vFrame) {
        return expression.expression.name
    }
}
