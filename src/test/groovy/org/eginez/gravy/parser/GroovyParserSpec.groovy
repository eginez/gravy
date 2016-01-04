package org.eginez.gravy.parser

import com.oracle.truffle.api.frame.VirtualFrame
import org.eginez.gravy.node.GravyContantExpressionNode
import org.eginez.gravy.node.GravyVariableExpressionNode
import spock.lang.*

class GroovyParserSpec extends Specification {
    def GroovyParser parser = new GroovyParser()

    def "test simple int value" () {
        when:
        def cu = parser.parse("1")

        then:
        assert !cu.empty
    }

    def "string value"() {
        VirtualFrame vf = Mock(VirtualFrame.class)
        when:
        def cu = parser.parse("este")

        then:
        assert !cu.empty
        def node = cu.find { it instanceof GravyVariableExpressionNode}
        assert node.execute(vf) instanceof String

    }
}
