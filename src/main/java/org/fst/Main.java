package org.fst;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fst.parser.helloLexer;
import org.fst.parser.helloParser;


public class Main {
    public static void main(String[] args)  throws IOException{ 
        

        CharStream cs =null;

        if (args.length>0) {
                 // create a CharStream that reads from file
                cs=CharStreams.fromFileName(args[0]);
                
        } else {
                 // create a CharStream that reads from standard input
                cs = CharStreams.fromStream(System.in);
        }


       

                // create a lexer that feeds off of input CharStream
        helloLexer lexer = new helloLexer(cs);

        
                // create a buffer of tokens pulled from the lexer
        CommonTokenStream cts = new CommonTokenStream(lexer);


                // create a parser that feeds off the tokens buffer
        helloParser parser = new helloParser(cts);


        // begin parsing at r rule
        ParseTree tree =parser.r();


        // print LISP-style tree
        System.out.println(tree.toStringTree(parser));


    }

}
