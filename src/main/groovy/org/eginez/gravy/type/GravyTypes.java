package org.eginez.gravy.type;

import com.oracle.truffle.api.dsl.TypeSystem;

@TypeSystem({long.class, GravyConstantExpression.class, GravyVariableExpression.class})
public abstract class GravyTypes {
}
