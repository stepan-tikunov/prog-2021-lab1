#!/bin/bash

cd "$(dirname "$0")" ;

rm $(find bin -name "*.class") 2>/dev/null ;
mkdir bin 2>/dev/null ;
javac -s src/ -d bin/ -cp "$(cat .classpath)" $(find src -name "*.java") &&
# cd bin && jar xf pokemon.jar && cd .. &&
jar cfm bin/app.jar MANIFEST.mf $(cd bin/ && find . -name "*.class" -printf "-C bin/ %h/%f ") &&
echo "Compiled successfully, app.jar and *.class files are stored in bin/ directory." ;
