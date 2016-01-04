package org.eginez.gravy.parser

import groovy.transform.CompileStatic
import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.control.CompilePhase
import org.eginez.gravy.node.GravyNode

@CompileStatic
class GroovyParser {
     public List<GravyNode> parse(String source) {
          def visitor = new GravyVisitor()
          def ast = new AstBuilder().buildFromString(CompilePhase.CONVERSION, source)
          ast.each {it.visit(visitor)}
          visitor.nodes
     }
}
