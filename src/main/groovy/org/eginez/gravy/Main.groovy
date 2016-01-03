package org.eginez.gravy

import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.frame.FrameDescriptor
import groovy.transform.CompileStatic
import org.eginez.gravy.parser.GroovyParser

@CompileStatic
class Main {
    public static void main(String[] args) {
        mainLoop()
    }

    public static mainLoop() {
        Console console = System.console()
        while(true) {
            String src = console.readLine('>')
            def parser = new GroovyParser()
            def nodes = parser.parse(src)
            def fm = new FrameDescriptor()
            def vf = Truffle.runtime.createVirtualFrame([] as Object[], fm)
            nodes.each {println it.execute(vf)}
        }
    }
}
