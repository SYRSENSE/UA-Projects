package metodos;
import java.util.Scanner;
public class Menu {
    Ordenamientos m = new Ordenamientos();
    public void Menu(int [] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Burbuja");
        System.out.println("[2] Insercion");
        System.out.println("[3] Seleccion");
        System.out.println("[4] ShellSort");
        System.out.println("[5] MergeSort");
        System.out.println("[6] QuickSort");
        int op = sc.nextInt();
        Opciones(op,array);
    }
    public void Opciones(int op, int[] array){
        switch (op){
            case 1:
                System.out.println("Array Original: ");
                m.BubleSort(array);
                break;
            case 2:
                System.out.println("Array Original: ");
                m.InsertionSort(array);
                break;
            case 3:
                System.out.println("Array Original: ");
                m.SelectionSort(array);
                break;
            case 4:
                System.out.println("Array Original: ");
                m.ShellSort(array);
                break;
            case 5:
                System.out.println("Array Original: ");
                m.mergeSort(array);
                break;
            case 6:
                break;
            default:
                break;
                    
        }
    }
}
