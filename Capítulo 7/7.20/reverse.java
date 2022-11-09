import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverse {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        push(1, lista);
        push(2, lista);
        push(3, lista);
        push(4, lista);
        push(5, lista);
        push(6, lista);
        push(7, lista);
        push(8, lista);
        push(9, lista);
        push(10, lista);
        System.out.println(lista);
        reve(lista);
        System.out.println(lista);
    }

    public static void push(int i, List<Integer> array) {
        array.add(i);
    }

    public static void reve(List<Integer> array) {
        Collections.reverse(array);
    }
}



