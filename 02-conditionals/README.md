# 02 - Conditional Statements

Ejercicios prácticos de Java enfocados en el uso de estructuras condicionales, operadores de comparación y operadores lógicos.

## Objetivos

- Comprender el funcionamiento de `if`, `else if` y `else`.
- Utilizar operadores de comparación: `==`, `!=`, `>`, `<`, `>=` y `<=`.
- Combinar condiciones mediante `&&`, `||` y `!`.
- Aplicar estructuras `switch` para evaluar diferentes casos.
- Resolver problemas utilizando lógica condicional.

## Ejercicios

### Ejercicio 01 - Número positivo, negativo o cero

Solicita al usuario un número entero e indica si es positivo, negativo o igual a cero.

### Ejercicio 02 - Número par o impar

Solicita al usuario un número entero y determina si es par o impar.

### Ejercicio 03 - Mayor de dos números

Solicita dos números enteros e indica cuál es mayor.

Si ambos números son iguales, muestra un mensaje informándolo.

### Ejercicio 04 - Mayor de tres números

Solicita tres números enteros y determina cuál es el mayor.

El programa debe funcionar correctamente incluso cuando dos o más números sean iguales.

### Ejercicio 05 - Mayoría de edad

Solicita la edad del usuario e indica si es mayor o menor de edad.

Considera que una persona es mayor de edad a partir de los 18 años.

Si se introduce una edad negativa, muestra un mensaje de error.

### Ejercicio 06 - Clasificación de notas

Solicita una nota numérica entre 0 y 10 y muestra su clasificación:

| Nota | Clasificación |
|---|---|
| 0 - 4,99 | Suspenso |
| 5 - 5,99 | Suficiente |
| 6 - 6,99 | Bien |
| 7 - 8,99 | Notable |
| 9 - 10 | Sobresaliente |

Si la nota está fuera del intervalo permitido, muestra un mensaje de error.

### Ejercicio 07 - Año bisiesto

Solicita un año entero e indica si es bisiesto.

Un año es bisiesto cuando:

- Es divisible entre 4.
- No es divisible entre 100, excepto si también es divisible entre 400.

### Ejercicio 08 - Calculadora básica

Solicita dos números y una operación matemática.

El programa debe permitir realizar las siguientes operaciones mediante `switch`:

- Suma (`+`)
- Resta (`-`)
- Multiplicación (`*`)
- División (`/`)

Si el usuario intenta dividir entre cero, muestra un mensaje de error.

Si introduce una operación no válida, informa de ello.

### Ejercicio 09 - Clasificación de triángulos

Solicita las longitudes de los tres lados de un triángulo.

Primero, comprueba que los lados sean positivos y que puedan formar un triángulo.

Para formar un triángulo, la suma de dos lados cualesquiera debe ser mayor que el tercer lado.

Si el triángulo es válido, clasifícalo como:

- **Equilátero:** los tres lados son iguales.
- **Isósceles:** exactamente dos lados son iguales.
- **Escaleno:** los tres lados son diferentes.

Si los lados no forman un triángulo válido, muestra un mensaje de error.

### Ejercicio 10 - Descuentos por importe de compra

Solicita al usuario el importe total de una compra.

Aplica un descuento según las siguientes condiciones:

| Importe de compra | Descuento |
|---|---|
| Menos de 50 € | 0 % |
| Desde 50 € hasta menos de 100 € | 5 % |
| Desde 100 € hasta menos de 200 € | 10 % |
| 200 € o más | 15 % |

El programa debe mostrar:

- Importe original.
- Porcentaje de descuento aplicado.
- Cantidad descontada.
- Precio final.

Muestra los importes monetarios con dos decimales.

Si el importe introducido es negativo, muestra un mensaje de error.

## Recomendaciones

- Utiliza `Scanner` para solicitar los datos al usuario.
- Selecciona la estructura condicional más adecuada para cada ejercicio.
- Evita condiciones innecesarias o repetidas.
- Comprueba los casos límite y las entradas no válidas.
- Mantén el código organizado y utiliza nombres de variables descriptivos.
- Resuelve cada ejercicio de forma independiente.