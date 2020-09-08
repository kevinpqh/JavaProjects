# JUnit Test
_Proyecto de Consola Java para pruebas unitarias y coverage_

## Instalación
1. _Descomprimir `jacoco-0.8.5.zip`_
2. _Ejecutar los siguientes comandos_
```
mkdir classes
```
```
javac main/Calculator.java -d classes
```
```
mkdir test-classes
```
```
javac -cp .;junit-4.13.jar;classes test/CalculatorTest.java -d test-classes
```
```
java -javaagent:jacoco-0.8.5/lib/jacocoagent.jar -cp .;junit-4.13.jar;hamcrest-core-1.3.jar;classes;test-classes org.junit.runner.JUnitCore CalculatorTest
```
```
java -jar jacoco-0.8.5/lib/jacococli.jar report jacoco.exec --classfiles classes --sourcefiles src --html report
```


## Opcional: Para ejecutar JUnit en windows
```
javac -cp .;junit-4.13.jar;hamcrest-core-1.3.jar CalculatorTest.java
```
```
java -cp .;junit-4.13.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest
```