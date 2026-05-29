import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes unitários com JUnit para verificar se a lista contém apenas mulheres.
 *
 * @author Natalia
 *
 * @version 1.0
 */
class FiltroMulheresTest {

    @Test
    void deveFiltrarApenasMulheres() {
        String entrada = "Ana-F,Joao-M,Maria-F,Pedro-M,Carla-F";
        List<String> resultado = FiltroMulheres.filtrarMulheres(entrada);

        List<String> esperado = List.of("Ana", "Maria", "Carla");
        assertEquals(esperado, resultado);
    }

    @Test
    void deveRetornarListaVaziaQuandoNaoHaMulheres() {
        String entrada = "Joao-M,Pedro-M,Jose-M";
        List<String> resultado = FiltroMulheres.filtrarMulheres(entrada);

        assertTrue(resultado.isEmpty());
    }

    @Test
    void deveRetornarListaVaziaQuandoEntradaVazia() {
        String entrada = "";
        List<String> resultado = FiltroMulheres.filtrarMulheres(entrada);

        assertTrue(resultado.isEmpty());
    }

    @Test
    void deveRetornarListaVaziaQuandoEntradaNula() {
        List<String> resultado = FiltroMulheres.filtrarMulheres(null);

        assertTrue(resultado.isEmpty());
    }

    @Test
    void deveGarantirQueTodosSaoMulheres() {
        String entrada = "Ana-F,Joao-M,Maria-F,Carla-F";
        List<String> resultado = FiltroMulheres.filtrarMulheres(entrada);

        for (String nome : resultado) {
            assertNotEquals("Joao", nome);
            assertNotEquals("Pedro", nome);
        }
    }
}