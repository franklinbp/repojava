import java.util.*;
import java.utils.stream.Collectors;

public class filtraryordenar{
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(10, 3, 5, 5,7);
        List<Integer> resultado = filtraryordenar(numeros);

        System.out.print("Lista Original" + numeros);
        system.out.print("lista filtrado y ordenada" + resultado);
    }

    public static List<Integer> filtraryordenar(List<Integer> numeros){
        return numeros.stream()
                    .filter(n->n % 2 != 0)
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
    }
}