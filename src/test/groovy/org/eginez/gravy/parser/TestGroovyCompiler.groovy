package org.eginez.gravy.parser

import spock.lang.*

class TestGroovyCompiler extends Specification {
    def GroovyParser parser = new GroovyParser()

    def "test simple compilation" () {
        when:
        def cu = parser.parse("1")

        then:
        assert !cu.empty
    }
}
