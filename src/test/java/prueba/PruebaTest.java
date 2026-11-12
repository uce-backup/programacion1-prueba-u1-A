package prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/**
 * Pruebas visibles de la pregunta 14: los ejemplos del enunciado. No las modifiques.
 *
 * La pregunta se califica de forma automática con pruebas ocultas, que incluyen estas y agregan los
 * valores límite y los casos extremos: que estas pasen no asegura todo el puntaje.
 * Un ciclo que no termina falla por tiempo.
 */
@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PruebaTest {

    private static final double TOLERANCIA = 1e-9;

    // a. Selección

    @Test
    @DisplayName("a1. 5 → Frío")
    void categoria1() {
        assertEquals("Frío", Prueba.categoriaTemperatura(5));
    }

    @Test
    @DisplayName("a2. 18 → Templado")
    void categoria2() {
        assertEquals("Templado", Prueba.categoriaTemperatura(18));
    }

    @Test
    @DisplayName("a3. 30 → Caluroso")
    void categoria3() {
        assertEquals("Caluroso", Prueba.categoriaTemperatura(30));
    }

    @Test
    @DisplayName("a4. 70 → Dato inválido")
    void categoria4() {
        assertEquals("Dato inválido", Prueba.categoriaTemperatura(70));
    }

    // b. Ciclos

    @Test
    @DisplayName("b1. (12, 3) → 7.5: (3 + 6 + 9 + 12) / 4")
    void promedio1() {
        assertEquals(7.5, Prueba.promedioMultiplos(12, 3), TOLERANCIA);
    }

    @Test
    @DisplayName("b2. (10, 4) → 6.0: (4 + 8) / 2")
    void promedio2() {
        assertEquals(6.0, Prueba.promedioMultiplos(10, 4), TOLERANCIA);
    }

    @Test
    @DisplayName("b3. (2, 5) → 0.0: no hay múltiplos de 5 entre 1 y 2")
    void promedio3() {
        assertEquals(0.0, Prueba.promedioMultiplos(2, 5), TOLERANCIA);
    }
}
