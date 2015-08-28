// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;



public class Le extends ReqlExpr {


    public Le(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Le(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Le(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.LE, args, optargs);
    }
    protected Le(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Le fromArgs(Object... args){
        return new Le(new Arguments(args), null);
    }


}