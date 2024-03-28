
package ua_project.main;

public class Funciones { //Clase funciones
    private int num1;
    private int num2;

    public Funciones(int num1, int num2) { //Constructor de la clase
        this.num1 = num1;
        this.num2 = num2;
    }
    //getter and setters
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    //metodos de la clase, su funcion debe ser simple y no deberian hacer mas de una sola cosa.
    public int suma(){
        return (num1 + num2);
    }
    public int resta(){
        return (num1 - num2);
    }
    public int multi(){
        return (num1 * num2);
    }
    public double divi(){
        return (num1 / num2);
    }
    public double resto(){
        return (num1 % num2);
    }
}
