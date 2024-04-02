package ua_project.main;
import java.util.Scanner;

public class Menu {
    public void Menu(){
    int op;
    do{
        System.out.println("===Menu===");
        System.out.println("[1] sumar 2 numeros=============|");
        System.out.println("[2] restar 2 numeros============|");
        System.out.println("[3] multiplicar 2 numeros=======|");
        System.out.println("[4] Dividir 2 numeros===========|");
        System.out.println("[5] resto de 2 numeros==========|");
        System.out.println("[6] Validar palindromo==========|");
        System.out.println("[7] Salir=======================|");
        op = validarOpcion();
        if (op < 6) {
            Opcion(op);
        } else if(op == 6) {
            ingresarPalabra();
        }else{
            System.out.println("Finalizando programa");
        }
       } while (op != 7);
    }
    public void Opcion(int op){
        int[] valores = validarNumeros();
        Funciones funcs = new Funciones(valores[0],valores[1]);
        
        switch(op){
            case 1:
                System.out.println("La suma de "+ valores[0]+ " y "+valores[1]+" es:" + funcs.suma());
                break;
            case 2:
                System.out.println("La resta de "+ valores[0]+ " y "+valores[1]+" es:" + funcs.resta());
                break;
            case 3:
                System.out.println("La multiplicacion de "+ valores[0]+ " y "+valores[1]+" es:" + funcs.multi());
                break;
            case 4:
                validarDivision(valores[0],valores[1]);
                break;
            case 5:
                validarResto(valores[0],valores[1]);
                break;
            }                                        
    }   
    public int validarOpcion(){
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.println("Eliga una opcion: ");
                int op = Integer.parseInt(scan.nextLine());
                if (op >= 1 && op <= 6) {
                    return op;
                } else {
                    System.out.println("El numero debe estar entre 1 y 7. Intentelo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
            }
        } while (true);
        
    }
    public int[] validarNumeros(){
      Scanner scan = new Scanner(System.in);
      int[] numeros = new int[2];
       do {
            try {
                System.out.println("Ingrese el primer numero: ");
                int num1 = Integer.parseInt(scan.nextLine());
                System.out.println("Ingrese el segundo numero: ");
                int num2 = Integer.parseInt(scan.nextLine());

                if (num1 >= 0 && num2 >= 0) {
                    numeros[0] = num1;
                    numeros[1] = num2;
                    return (numeros);
                } else {
                    System.out.println("Ambos numeros deben ser positivos. Intentelo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
            }
        } while (true);
    }
    public void validarDivision(double num1, double num2){
        Funciones func = new Funciones((int) num1, (int) num2);
        if (num2 != 0) {
            System.out.println("La division de " + num1 + " entre " + num2 + " es: " + func.divi());
        } else {
            System.out.println("No se puede dividir por cero.");
        }

    }
    public void validarResto(double num1, double num2){
        Funciones func = new Funciones((int) num1, (int) num2);
            if (num2 != 0) {
            System.out.println("El resto de " + num1 + " dividido por " + num2 + " es: " + func.resto());
        } else {
            System.out.println("No se puede calcular el resto si el divisor es cero.");
        }
    }
    public void palindromo(String palabra){ 
        if (palabra.length() == 0 || palabra.length() == 1) {
           System.out.println("Es palindromo");
        }else if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)){
            palindromo(palabra.substring(1, palabra.length() - 1));
        }else{
            System.out.println("No es palindromo");
        }
    }
    public void ingresarPalabra(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese palabra a validar: ");
        String palabra = scan.next();
        palindromo(palabra.toUpperCase().replaceAll("\\s", ""));   
    }
}



