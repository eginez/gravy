package org.eginez.gravy.parser

import groovy.transform.CompileStatic
import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.control.CompilePhase
import org.eginez.gravy.node.GravyNode

@CompileStatic
class GroovyParser {
     GravyVisitor visitor = new GravyVisitor()
     public List<GravyNode> parse(String source) {
          def ast = new AstBuilder().buildFromString(CompilePhase.FINALIZATION, source)
          ast.each {it.visit(visitor)}
          visitor.nodes
     }
}
