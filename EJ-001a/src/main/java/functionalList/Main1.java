package functionalList;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<String> listaNombres = new ArrayList();
        listaNombres.add("Juan");
        listaNombres.add("Carlos");
        listaNombres.add("Luis");
        listaNombres.add("Jorge");
        printList(listaNombres);
        System.out.println("-----------------------------------");
        listaNombres =removeElement(listaNombres, "Juan");
        printList(listaNombres);
    }

    public static void printList(List<String> listaNombres) {
        listaNombres.forEach(x-> System.out.println(x));
    }

    public static List<String> removeElement(List<String> listaNombres, String nombre) {
        listaNombres.removeIf(x-> x.equals(nombre));
        return listaNombres;
    }
}
