# Prueba escrita de la unidad 1 · pregunta 14

Completa los dos métodos de `src/main/java/prueba/Prueba.java`. Cada método recibe los datos en sus
parámetros y devuelve el resultado con `return`: no uses `Scanner` ni muestres nada en pantalla.

Solo modificas `Prueba.java`, y de cada método **solo su contenido**: no modifiques la firma (nombre,
parámetros y tipo de retorno) ni las pruebas. Con otra firma, las pruebas ocultas no compilan.

## Cómo se califica

- **De forma automática, con pruebas ocultas.** Incluyen las pruebas visibles de este proyecto (los
  ejemplos del enunciado) y agregan valores límite y casos extremos. Cada prueba que pasa suma su
  puntaje: que pasen las visibles no asegura los 5 puntos.
- **De ese resultado se resta 0.25, 0.5, 0.75 o 1 punto por cada falencia de calidad básica del
  código**, según su gravedad. Cuenta todo lo conversado en clase: valores fijos en constantes con nombre, nombres que dicen qué guardan, primero las constantes, luego las variables y al final el proceso, llaves e indentación, condiciones simples y nada de código repetido.
- **El proyecto debe compilar.** Si no compila, la nota de toda la pregunta 14 es 0, aunque uno de
  los métodos esté bien resuelto: un error de compilación en un método impide ejecutar las pruebas de
  todo el proyecto. Si no terminas un método, déjalo como vino en la plantilla (con su `return` y su
  `// TODO`) para que el proyecto siga compilando, y comprueba que compila antes de enviarlo.

## a. `categoriaTemperatura(temperatura)` (2 puntos)

Devuelve la categoría de una temperatura en °C:

| Si `temperatura`… | Devuelve |
|---|---|
| no está entre -50 y 60 | `"Dato inválido"` |
| es menor que 10 | `"Frío"` |
| es menor que 25 | `"Templado"` |
| en otro caso | `"Caluroso"` |

## b. `promedioMultiplos(limite, divisor)` (3 puntos)

Devuelve el promedio de los números de 1 a `limite` que son múltiplos de `divisor`. Si no hay
ninguno, devuelve 0. Supón que `divisor` es mayor que 0.

| Llamada | Devuelve | Por qué |
|---|---|---|
| `promedioMultiplos(12, 3)` | `7.5` | (3 + 6 + 9 + 12) / 4 |
| `promedioMultiplos(10, 4)` | `6.0` | (4 + 8) / 2 |
| `promedioMultiplos(2, 5)` | `0.0` | no hay múltiplos de 5 entre 1 y 2 |

## Entrega

Envía el proyecto completo comprimido (zip o rar, sin la carpeta `target/`) al correo
**uce.backup.dx@gmail.com**, a la hora indicada por el docente: no se calificará después de esa hora.
El asunto del correo debe ser `Nombre Apellido - Prueba 2026-11-12`, con tu nombre y tu apellido.

Es tu responsabilidad enviar bien el archivo: si no se puede descomprimir o abrir, no se calificará.
Antes de enviarlo, comprueba que el proyecto compila y que el comprimido se abre.

## Cómo trabajar

1. Abre el proyecto desde el `pom.xml` y ejecuta las pruebas (`mvn test` o desde el IDE): al inicio
   fallan todas.
2. Completa un método y vuelve a ejecutar sus pruebas.
3. Antes de entregar, revisa la calidad del código: es lo que se descuenta del puntaje de las pruebas.
