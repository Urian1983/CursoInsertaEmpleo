# CursoJavaInsertaEmpleo

Colección de **11 ejercicios de programación en Java**, implementados de dos formas diferentes:

- **Versión orientada a objetos:** separa la lógica de negocio de la interfaz de consola mediante los paquetes `model` y `cli`.
- **Versión estructurada:** cada ejercicio está implementado de forma independiente en una única clase dentro del paquete `structured`.

El proyecto incluye además tests unitarios para la versión orientada a objetos y configuración Maven para generar un JAR ejecutable independiente para cada ejercicio de `structured`.

## Contenido

- **11 ejercicios** de dificultad fácil y difícil.
- **Dos implementaciones** por ejercicio.
- **Tests unitarios** para verificar la lógica de la versión orientada a objetos.
- **Logging** integrado en la versión orientada a objetos.
- **JAR independientes** para cada ejercicio de `structured`.

## Estructura

```text
src/main/java/
├── Main.java                    # Punto de entrada de la aplicación principal
├── cli/                         # Interfaz de consola
│   ├── Menu.java
│   ├── EuroConversorCLI.java
│   ├── DistanceUnitsConversorCLI.java
│   ├── DistanceCLI.java
│   ├── TriangleCLI.java
│   ├── CircleCLI.java
│   ├── PowerCalculatorCLI.java
│   ├── DiscountCalculatorCLI.java
│   └── TimeConversorCLI.java
├── model/                       # Lógica de negocio
│   ├── EuroConversor.java
│   ├── DistanceUnitsConversor.java
│   ├── DistanceCalculator.java
│   ├── Triangle.java
│   ├── Circle.java
│   ├── PowerCalculator.java
│   ├── DiscountCalculator.java
│   └── TimeConversor.java
└── structured/                  # Ejercicios independientes
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

src/test/java/model/             # Tests unitarios
    ├── EuroConversorTest.java
    ├── DistanceUnitsConversorTest.java
    ├── DistanceCalculatorTest.java
    ├── TriangleTest.java
    ├── CircleTest.java
    ├── PowerCalculatorTest.java
    ├── DiscountCalculatorTest.java
    └── TimeConversorTest.java
```

## Diferencias entre las dos implementaciones

### Versión orientada a objetos (`cli/` + `model/`)

- **Separación de responsabilidades:** `*CLI` gestiona la entrada y salida por consola, mientras que `model/*` contiene la lógica de negocio.
- **Logging:** registra operaciones y errores.
- **Tests:** incluye pruebas unitarias con JUnit.
- **Menú interactivo:** la aplicación se inicia desde `Main.java`.
- **Validación:** incluye gestión de errores y validación de entradas.

### Versión estructurada (`structured/`)

Cada ejercicio es completamente independiente y está contenido en una única clase.

- **Un archivo por ejercicio.**
- **Cada clase tiene su propio `main`.**
- **Sin separación de responsabilidades:** entrada, lógica y salida están integradas en la misma clase.
- **Sin logging.**
- **Sin tests unitarios.**
- **Código lineal y directo**, orientado a mostrar una implementación sencilla de cada ejercicio.

Los ejercicios de `structured` **no dependen de `model`, `cli` ni de `Main.java`** y pueden ejecutarse individualmente.

## Requisitos

- Java 21 o superior.
- Maven 3.8.1 o superior.

## Uso

### Aplicación principal

La versión orientada a objetos se ejecuta mediante el menú interactivo de `Main.java`.

Para ejecutarla directamente desde Maven:

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="Main"
```

También puede generarse el JAR principal mediante:

```bash
mvn clean package
```

El JAR se generará en:

```text
target/CursoJavaInsertaEmpleo-1.0-SNAPSHOT.jar
```

Y puede ejecutarse con:

```bash
java -jar target/CursoJavaInsertaEmpleo-1.0-SNAPSHOT.jar
```

### Ejercicios estructurados

Los ejercicios de `structured` son independientes. Cada uno dispone de su propio `main` y Maven genera un JAR ejecutable individual para cada ejercicio.

Para generar los JAR:

```bash
mvn clean package
```

Los archivos se generarán en:

```text
target/structured/
```

Por ejemplo:

```text
target/structured/
├── CircleArea.jar
├── CirclePerimeter.jar
├── DiscountCalculator.jar
├── DistanceCalculator.jar
├── EuroToPeseta.jar
├── KilometersToMiles.jar
├── MilesToKilometers.jar
├── PesetaToEuro.jar
├── PowerCalculator.jar
├── TimeConversor.jar
└── Triangle.jar
```

Cada ejercicio puede ejecutarse de forma independiente.

Por ejemplo:

```bash
java -jar target/structured/CircleArea.jar
```

o:

```bash
java -jar target/structured/Triangle.jar
```

No es necesario ejecutar Maven para ejecutar los JAR una vez que han sido generados.

Los archivos generados dentro de `target/` no forman parte del repositorio y están excluidos mediante `.gitignore`.

### Tests

Para ejecutar los tests unitarios:

```bash
mvn test
```

También se ejecutan automáticamente durante:

```bash
mvn package
```

## Ejercicios

### Dificultad: Fácil

| # | Ejercicio |
|---|-----------|
| 1 | Crear un programa que, dada una cantidad en euros, la transforme en pesetas. Hay que tener en cuenta que 1 € = 166,386 ptas. |
| 2 | Crear un programa que haga el proceso contrario (pesetas a euros). |
| 3 | Crear un programa que, dada una distancia (en km) y el tiempo (en horas) que se ha tardado en recorrerla, calcule la velocidad media empleada. Fórmula: `v = e / t`. |
| 4 | Crear un programa que, dada la base y altura de un triángulo rectángulo, calcule el área. |
| 5 | Escribir un programa que, dada una distancia en millas marinas, la transforme en metros. Una milla marina equivale a 1.852 metros. |
| 6 | Escribir un programa que calcule la longitud y el área de una circunferencia y muestre los resultados por pantalla. |
| 7 | Calcular la potencia a partir del voltaje y la intensidad. Fórmula: `P = V × I`. |
| 8 | Crear un programa que obtenga el descuento, tanto en cantidad como en porcentaje, aplicado a un producto cuando el usuario introduce el precio original y el precio pagado. |

### Dificultad: Difícil

| # | Ejercicio |
|---|-----------|
| 9 | Escribir un programa que, dado un número de segundos, calcule el número de horas, minutos y segundos. |

> **Nota:** La versión actual del proyecto contiene 11 clases en `structured`, ya que algunos ejercicios se han dividido en implementaciones independientes.

## Tecnologías

- Java 21
- Maven
- JUnit
- AssertJ
- Logback / SLF4J
