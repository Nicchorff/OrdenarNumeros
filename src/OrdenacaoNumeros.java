import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void addNum(int num){
        numeros.add(num);
    }

    public List<Integer> ordernarAscendente(){
        List<Integer> novaLista = new ArrayList<>(numeros);
        Collections.sort(novaLista);
        return novaLista;
    }

    public List<Integer> ordernarDescendente(){
        List<Integer> novaLista = new ArrayList<>(numeros);
        novaLista.sort(Collections.reverseOrder());
        return novaLista;
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
