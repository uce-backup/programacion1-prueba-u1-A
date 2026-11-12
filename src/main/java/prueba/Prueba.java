package prueba;

/**
 * Pregunta 14 de la prueba escrita de la unidad 1. Completa el cuerpo de los dos métodos:
 * cada uno recibe los datos en sus parámetros y devuelve el resultado con return (sin Scanner y sin
 * mostrar nada en pantalla). No modifiques la firma de los métodos (nombre, parámetros y tipo de
 * retorno): solo su contenido.
 *
 * Cada método tiene pruebas en src/test/java. Ejecútalas con "mvn test" o desde el IDE.
 * Mientras un método no esté completo, sus pruebas fallan: es lo esperado.
 *
 * Se califica de forma automática con pruebas ocultas, que incluyen las visibles y agregan valores
 * límite y casos extremos. De ese puntaje se resta 0.25, 0.5, 0.75 o 1 punto por cada falencia de
 * calidad básica del código (constantes con nombre, nombres claros, primero constantes, luego
 * variables y al final el proceso, llaves e indentación, sin código repetido).
 *
 * El proyecto debe compilar: si no compila, la nota de toda la pregunta 14 es 0, aunque uno de los
 * métodos esté bien resuelto. Si no terminas un método, déjalo con su return y su TODO para que el
 * proyecto siga compilando.
 */
public class Prueba {

    /**
     * a. Categoría de una temperatura en °C.
     * Si no está entre -50 y 60, devuelve "Dato inválido"; si es menor que 10, "Frío";
     * si es menor que 25, "Templado"; en otro caso, "Caluroso".
     * Ejemplos: 70 → "Dato inválido"; 10 → "Templado".
     */
    public static String categoriaTemperatura(double temperatura) {
        return ""; // TODO
    }

    /**
     * b. Promedio de los números de 1 a limite que son múltiplos de divisor.
     * Si no hay ninguno, devuelve 0. El divisor siempre es mayor que 0.
     * Ejemplos: (12, 3) → 7.5; (10, 4) → 6.0; (2, 5) → 0.0.
     */
    public static double promedioMultiplos(int limite, int divisor) {
        return -1; // TODO
    }
}
