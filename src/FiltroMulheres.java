import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe com a lógica de filtrar mulheres.
 *
 * @author SeuNome
 * @version 1.0
 */
public class FiltroMulheres {

    /**
     * Método que filtra apenas mulheres de uma lista de pessoas no formato "nome-sexo"
     *
     * @param entrada String com pessoas no formato "Ana-F,Joao-M,Maria-F"
     * @return Lista com apenas os nomes das mulheres
     */
    public static List<String> filtrarMulheres(String entrada) {

        if (entrada == null || entrada.trim().isEmpty()) {
            return List.of(); // retorna lista vazia
        }

        String[] pessoas = entrada.split(",");

        return Arrays.stream(pessoas)
                .map(String::trim)
                .filter(pessoa -> {
                    String[] dados = pessoa.split("-");
                    if (dados.length == 2) {
                        String sexo = dados[1].trim();
                        return sexo.equalsIgnoreCase("F");
                    }
                    return false;
                })
                .map(pessoa -> pessoa.split("-")[0].trim()) // pega só o nome
                .collect(Collectors.toList());
    }
}