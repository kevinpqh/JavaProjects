mkdir classes
javac src/Calculator.java -d classes
mkdir test-classes
javac -cp .;junit-4.13.jar;classes test-src/CalculatorTest.java -d test-classes
java -javaagent:jacoco-0.8.5/lib/jacocoagent.jar -cp .;junit-4.13.jar;hamcrest-core-1.3.jar;classes;test-classes org.junit.runner.JUnitCore CalculatorTest
java -jar jacoco-0.8.5/lib/jacococli.jar report jacoco.exec --classfiles classes --sourcefiles src --html report




javac -cp .;junit-4.13.jar;hamcrest-core-1.3.jar CalculatorTest.java
