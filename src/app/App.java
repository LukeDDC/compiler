package app;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import app.antlr.RUBYBaseListener;
import app.antlr.RUBYLexer;
import app.antlr.RUBYParser;

public class App {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream("teste.rb");

        RUBYLexer lexer = new RUBYLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        RUBYParser parser = new RUBYParser(tokens);

        RUBYBaseListener listener = new RUBYBaseListener();

        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, tree);
    }
}