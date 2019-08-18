alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'

alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'

export CLASSPATH="/usr/local/lib/antlr-4.7.1-complete.jar;~/bin:$CLASSPATH"

antlr4 RUBY.g4
javac *.java