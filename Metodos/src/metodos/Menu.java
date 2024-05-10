package metodos;
import java.util.Scanner;
public class Menu {
    Ordenamientos m = new Ordenamientos();
    Scanner sc = new Scanner(System.in);
    public void Menu(){
        while (true){
            int array[] = {54,26,93,17,77,31,44,55,20}; 
            System.out.println("[1] Burbuja");
            System.out.println("[2] Insercion");
            System.out.println("[3] Seleccion");
            System.out.println("[4] ShellSort");
            System.out.println("[5] MergeSort");
            System.out.println("[6] QuickSort");
            System.out.println("[7] Salir");
            int op = sc.nextInt();
            if (op == 7) {
                System.out.println("Saliendo del programa.");
                break;
            }
            Opciones(op,array);
        }
 }
    public void Opciones(int op, int[] array){
        switch (op){
            case 1: 
                m.BubleSort(array);
                System.out.println("Complejidad O(n^2)");
                break;
            case 2:
                m.InsertionSort(array);
                System.out.println("Complejidad O(n^2)");
                break;
            case 3:
                m.SelectionSort(array);
                System.out.println("Complejidad O(n^2)");
                break;
            case 4:
                m.ShellSort(array);
                System.out.println("Complejidad O(n(log(n))^2");
                break;
            case 5:
                System.out.println("Array Original: ");
                m.MuestraArray(array);
                m.mergeSort(array);
                System.out.println("Complejidad O(n(log(n))");
                break;
            case 6:
                System.out.println("Array Original: ");
                m.MuestraArray(array);
                m.quicksort(array,0,array.length-1);
                System.out.println("\nArray ordenado:");
                m.MuestraArray(array);
                System.out.println("Total comparaciones: " + m.get_comparisons_2());
                System.out.println("Complejidad O(n(log(n))");
                break;
            default:
                break;   
        }
    }
}
