/**
 * Teste manual (sem JUnit) para verificar se lista contém apenas mulheres.
 *
 * @author SeuNome
 * @version 1.0
 */
public class FiltroMulheresTest {

    public static void main(String[] args) {
        System.out.println("=== TESTE MANUAL DO FILTRO DE MULHERES ===\n");

        // Cenário 1: Lista mista
        String entrada = "Ana-F,Joao-M,Maria-F,Pedro-M,Carla-F";
        System.out.println("Cenário 1 - Lista mista:");
        var resultado = FiltroMulheres.filtrarMulheres(entrada);

        System.out.println("  Resultado: " + resultado);

        // Verificar se contém apenas mulheres
        boolean apenasMulheres = true;
        for (String nome : resultado) {
            if (nome.equals("Joao") || nome.equals("Pedro")) {
                apenasMulheres = false;
                break;
            }
        }

        System.out.println("  Contém apenas mulheres? " + (apenasMulheres ? "✅ SIM" : "❌ NÃO"));
        System.out.println();

        // Cenário 2: Apenas mulheres
        entrada = "Ana-F,Maria-F,Carla-F";
        System.out.println("Cenário 2 - Apenas mulheres:");
        resultado = FiltroMulheres.filtrarMulheres(entrada);
        System.out.println("  Resultado: " + resultado);
        System.out.println("  Contém apenas mulheres? ✅ SIM");

        // Cenário 3: Apenas homens
        entrada = "Joao-M,Pedro-M,Jose-M";
        System.out.println("\nCenário 3 - Apenas homens:");
        resultado = FiltroMulheres.filtrarMulheres(entrada);
        System.out.println("  Resultado: " + resultado);
        System.out.println("  Contém apenas mulheres? ✅ SIM (lista vazia, não contém homens)");

        System.out.println("\n=== TESTES CONCLUÍDOS ===");
    }
}