# CursoJavaInsertaEmpleo
 
Colección de 9 ejercicios de programación en Java. Cada ejercicio está implementado de dos formas diferentes.

Las carpetas /model y /cli incluyen la versión orientada objetos, la cual:
-usa logging.
-test unitarios integrados.
-seperación de funciones.

La carpeta /structured incluye la versión en programación estructurada simple:
-Una clase por ejercicio.
-No hay metodos/funciones, esta todo integrado en el main.
 
## Contenido
 
- **9 ejercicios** de dificultad fácil y difícil
- **Dos implementaciones** por ejercicio
- **Tests unitarios** para verificación
- **Logging** integrado en la versión profesional
## Estructura
 
```
src/main/java/
├── Main.java                    # Punto de entrada
├── cli/                         # Interfaz y logging (versión profesional)
│   ├── Menu.java
│   ├── EuroConversorCLI.java
│   ├── DistanceUnitsConversorCLI.java
│   ├── DistanceCLI.java
│   ├── TriangleCLI.java
│   ├── CircleCLI.java
│   ├── PowerCalculatorCLI.java
│   ├── DiscountCalculatorCLI.java
│   └── TimeConversorCLI.java
├── model/                       # Lógica (versión profesional)
│   ├── EuroConversor.java
│   ├── DistanceUnitsConversor.java
│   ├── DistanceCalculator.java
│   ├── Triangle.java
│   ├── Circle.java
│   ├── PowerCalculator.java
│   ├── DiscountCalculator.java
│   └── TimeConversor.java
└── structured/                  # Todo en una clase (versión simple)
    ├── EuroToPeseta.java
    ├── PesetaToEuro.java
    ├── DistanceCalculator.java
    ├── Triangle.java
    ├── KilometersToMiles.java
    ├── MilesToKilometers.java
    ├── CircleArea.java
    ├── CirclePerimeter.java
    ├── PowerCalculator.java
    ├── DiscountCalculator.java
    └── TimeConversor.java
 
src/test/java/model/            # Tests unitarios
    ├── EuroConversorTest.java
    ├── DistanceUnitsConversorTest.java
    ├── DistanceCalculatorTest.java
    ├── TriangleTest.java
    ├── CircleTest.java
    ├── PowerCalculatorTest.java
    ├── DiscountCalculatorTest.java
    └── TimeConversorTest.java
```
 
## Diferencias Entre Las Dos Implementaciones
 
### Versión Profesional (`cli/` + `model/`)
 
- **Separación de responsabilidades**: `*CLI` maneja entrada/salida, `model/*` contiene lógica
- **Logging**: Registra operaciones y errores
- **Tests**: Incluye pruebas unitarias con JUnit 5
- **Menú interactivo**: Ejecución desde `Main.java`
- **Validación**: Manejo robusto de excepciones
### Versión Simple (`structured/`)
 
- **Un archivo por ejercicio**: Todo el código junto
- **Sin separación**: Entrada, lógica y salida en la misma clase
- **Sin logging**: Solo salida a consola
- **Sin tests**: Ejecución directa
- **Fácil de leer**: Código lineal y directo
## Requisitos
 
- Java 21
- Maven 3.8.1+
## Uso
 
**Versión profesional (menú interactivo):**
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="Main"
```
 
**Versión simple (ejecución directa):**
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="structured.EuroToPeseta"
```
 
**Tests:**
```bash
mvn test
```
 
## Ejercicios
 
### Dificultad: Fácil
 
| # | Ejercicio |
|---|-----------|
| 1 | Crear un programa que, dada una cantidad en euros, la transforme en pesetas. Hay que tener en cuenta que 1€ = 166,386 ptas. |
| 2 | Crear un programa que haga el proceso contrario (pesetas a euros). |
| 3 | Crear un programa que dada una distancia (en km) y el tiempo (en horas) que se ha tardado en recorrerla, calcule la velocidad media que se ha empleado. Fórmula: v = e / t |
| 4 | Crear un programa que dada la base y altura de un triángulo rectángulo, calcule el área. |
| 5 | Escribir un programa que dado una distancia en millas marinas la transforme en metros. Una milla marina es igual a 1.852 metros. |
| 6 | Escribir un programa que calcule la longitud y el área de una circunferencia y muestre los resultados por pantalla. |
| 7 | Calcular la potencia a partir del voltaje y la intensidad. Fórmula: P = V × I |
| 8 | Programa que obtenga el descuento (en cantidad y en porcentaje) aplicado a un producto si el usuario introduce el precio original y el precio pagado. |
 
### Dificultad: Difícil
 
| # | Ejercicio |
|---|-----------|
| 9 | Escribir un programa que dado un número de segundos, calcule el número de horas, minutos y segundos. |
 
## Tecnologías
 
- Java 21
- Maven
- JUnit 5
- AssertJ
- Logback + SLF4J
