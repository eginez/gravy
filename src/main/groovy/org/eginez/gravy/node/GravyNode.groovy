package org.eginez.gravy.node

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo
import com.oracle.truffle.api.nodes.UnexpectedResultException
import groovy.transform.CompileStatic
import org.eginez.gravy.type.GravyConstantExpression
import org.eginez.gravy.type.GravyTypesGen


/**
 * Base node class for all nodes in groovy
 */
@NodeInfo(language = "gravy", description = "The root node for gravy")
@CompileStatic
public abstract class GravyNode extends Node {
    public abstract Object execute(VirtualFrame vFrame);

    public long executeLong(VirtualFrame vFrame) throws UnexpectedResultException {
        return GravyTypesGen.expectLong(this.execute(vFrame))
    }

    public GravyConstantExpression executeConstantExpression(VirtualFrame virtualFrame) throws  UnexpectedResultException {
        return GravyTypesGen.expectGravyConstantExpression(this.execute(virtualFrame))
    }
}
