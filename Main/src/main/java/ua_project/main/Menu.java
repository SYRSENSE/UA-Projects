package ua_project.main;
import java.util.Scanner;

public class Menu {
    public void Menu() { //Procedimiento Menu, aqui se llaman las demas funciones y procedimientos directa o indirectamente (Funciones; validarDivision, validarNumeros, etc...)
    //Recuerda, Procemdimiento es un bloque de codigo parecido a metodos y funciones, pero no retornan un valor (Estan definidos con el "void")
    int op;
    do{
        System.out.println("===Menu===");
        System.out.println("[1] sumar 2 numeros=============|");
        System.out.println("[2] restar 2 numeros============|");
        System.out.println("[3] multiplicar 2 numeros=======|");
        System.out.println("[4] Dividir 2 numeros===========|");
        System.out.println("[5] resto de 2 numeros==========|");
        System.out.println("[6] Salir=======================|");
        op = validarOpcion(); //Funcion para validar que el dato esté entre 1 y 6
        if (op != 6) {
            Opcion(op); //Se le entrega el valor ingresado por usuario a la funcion si se cumple la condicion
        } else {
            System.out.println("Finalizando programa");
        }
       } while (op != 6);
    }
    public void Opcion(int op){
        int[] valores = validarNumeros(); //Se le piden ambos numeros al usuario y se guardan en una lista
        Funciones funcs = new Funciones(valores[0],valores[1]); //Se le entregar nos valores de la lista al objeto funcs
        //funcs contiene los metodos suma, resta, multi etc...
        switch(op){ //Dependiendo del caso, se llama a uno u otro metodo del objeto funcs
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
                validarDivision(valores[0],valores[1]); //Funcion para validar si hay division entre 0
                break;
            case 5:
                validarResto(valores[0],valores[1]); //Funcion para validar si hay division entre 0
                break;
            }                                        
    }   
    public int validarOpcion(){  //Aqui se valida si los datos ingresados por el usuario son validos
        Scanner scan = new Scanner(System.in);
        do {
            try { //try and catch, sirve para evitar que el programa se caiga cuando el usuario ingrese datos erroneos
                //ej: Cuando el usuario ingresa una letra en una variable de numeros, generalmente el programa se cuelga
                System.out.println("Eliga una opcion: ");
                int op = Integer.parseInt(scan.nextLine()); //scan.nextLine te devuelve un String
                //Integer.parseInt transforma ese String en un Int, si no se puede, lanza el error NumberFormatException (linea 58)
                if (op >= 1 && op <= 6) {
                    return op;
                } else {
                    System.out.println("El numero debe estar entre 1 y 6. Intentelo de nuevo.");
                }
            } catch (NumberFormatException e) { //Catch atrapa el error y en vez de cerrar el programa, hace lo que esta dentro de las llaves (linea 59)
                System.out.println("Error: Ingrese un numero valido.");
            }
        } while (true); //Este bucle siempre se ejecuta, solo termina si se cumple la condicion de la linea 53
        
    }
    public int[] validarNumeros(){//Aqui se valida los 2 numeros ingresados por el usuario
      Scanner scan = new Scanner(System.in);
      int[] numeros = new int[2]; //Se crea un arreglo con 2 indices (0 y 1)
       do {
            try {
                System.out.println("Ingrese el primer numero: ");
                int num1 = Integer.parseInt(scan.nextLine());
                System.out.println("Ingrese el segundo numero: ");
                int num2 = Integer.parseInt(scan.nextLine());

                if (num1 >= 0 && num2 >= 0) { //Si la condicion se cumple, el arreglo guarda ambos valores en sus dos indices
                    // y los retorna, es decir, si num1 y num2 son 30 y 9 respectivamente, el arreglo es [30,9].
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
    public void validarDivision(double num1, double num2){ //Se valida que el division (num2) no sea 0 (no se puede dividir por 0)    
        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("La division de " + num1 + " entre " + num2 + " es: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

    }
    public void validarResto(double num1, double num2){ //Se valida lo mismo que en la funcion anterior   
            if (num2 != 0) {
            double resultado = num1 % num2;
            System.out.println("El resto de " + num1 + " dividido por " + num2 + " es: " + resultado);
        } else {
            System.out.println("No se puede calcular el resto si el divisor es cero.");
        }
    }
}



