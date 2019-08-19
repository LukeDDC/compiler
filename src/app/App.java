package app;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import app.antlr.DefinitionPhase;
import app.antlr.RUBYLexer;
import app.antlr.RUBYParser;
import app.antlr.ReferencePhase;

public class App {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream("teste.rb");

        RUBYLexer lexer = new RUBYLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        RUBYParser parser = new RUBYParser(tokens);

        DefinitionPhase defPhaseListener = new DefinitionPhase();

        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(defPhaseListener, tree);

        ReferencePhase referencePhaseListener = new ReferencePhase(defPhaseListener.globalScope, defPhaseListener.scopes);

        walker.walk(referencePhaseListener, tree);

        System.out.println("fim");
    }
}