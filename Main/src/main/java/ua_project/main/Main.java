
package ua_project.main;
public class Main { //Archivo principal, aqui debe ir solo lo escencial

    public static void main(String[] args) { //metodo principal de la clase,es el punto de entrada para la ejecución de un programa.
        Menu menu = new Menu(); //Se crea un objeto con la clase Menu
        menu.Menu(); //Se llama a la funcion menu() que internamente llama a las demas funciones

    }
}
