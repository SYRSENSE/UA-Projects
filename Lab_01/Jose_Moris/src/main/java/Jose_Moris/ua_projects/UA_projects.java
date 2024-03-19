package Jose_Moris.ua_projects;
import java.util.Random;
import java.util.Scanner;
// Jose Moris y Paolo Ferreria
public class UA_projects {
    private static Random random = new Random();
    
    public static void main(String[] args) {
      Scanner escaner = new Scanner(System.in);
      int opcion;
      do{
          Generar_menu();
          opcion = escaner.nextInt();
          switch(opcion){
              case 1:
                  Matriz_diagonal();
                  break;
              case 2:
                  Matriz_triangularInferior();
                  break;
              case 3:
                  Matriz_triangularSuperior();
                  break;
              case 4:
                  System.out.println("Saliendo.");
                  break;
              default:
                  System.out.println("Error, porfavor ingrese un numero entre el 1 y el 4");
          }
      }while(opcion !=4);
      } 
    
    
    public static void Generar_menu(){
    System.out.println("=====Generador matrices=====");
    System.out.println("Matriz de 4x4, con la diagonal principal              [1]");
    System.out.println("Matriz de 4x4, con la triangular inferior izquierda.  [2]");
    System.out.println("Matriz de 4x4, con la triangular superior derecha.    [3]");
    System.out.println("Fin                                                   [4]");
    System.out.println("Eliga una opcion: ");
}
    public static void Matriz_diagonal(){
        int[][] matriz = new int[4][4];
        for(int i=0; i<4;i++){
            matriz[i][i] = random.nextInt(10);
        }
        Matriz_imprimir(matriz);
    }
    public static void Matriz_triangularInferior(){
        int[][] matriz = new int[4][4];
        for(int i=0; i<4;i++){
            for(int j=0; j<= i;j++){
                matriz[i][j] = random.nextInt(10);
            }
        } 
        Matriz_imprimir(matriz);
    }
    public static void Matriz_triangularSuperior(){
        int[][] matriz = new int[4][4];
        for(int i=0; i<4;i++){
            for(int j= i; j<4;j++){
                matriz[i][j] = random.nextInt(10);
            }
        }  
        Matriz_imprimir(matriz);
    }
    public static void Matriz_imprimir(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
