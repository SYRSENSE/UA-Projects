package moris.lab_06_jmoris;
import java.util.Scanner;
public class Funciones {
    Scanner scan = new Scanner(System.in);
    public void distancia(){
        int op = 0;
        do{
            try{
            System.out.println("Porfavor ingrese una medida en centimetros");
            int dis = Integer.parseInt(scan.next()) ;
            System.out.println(dis +" son " + dis/100000 + " kilometros " + (dis % 100000) / 100 +" metros y "+ dis%100 +" centimetros");
            System.out.println("Quiere calcular otra medida? No = 0| Si = presiona cualquier tecla");
            op = Integer.parseInt(scan.next());
            }
            catch(NumberFormatException e){
                System.out.println("Error: Solo puede ingresar numeros");
            }
        }while(op == 0);
        
    }
    public void ciclo1(){
        int n = 1;
       while(n <= 10){
           System.out.println("n"+n +" = " + n);
           n++;
       }
        
    }
    public void ciclo2(){
        int n = 1;
        int acc = 1;
       while(acc <= 10){
           System.out.println("n"+acc +" = " + n);
           acc++;
           n = n + acc; 
       }
        
    }
    public void parimpar(){
        while(true){
            try{
            System.out.println("Porfavor ingrese un numero para verificar si es par o impar");
            int num = Integer.parseInt(scan.next()) ;
            if (num%2 == 0){
                System.out.println("Su numero es par");
            }else{
               System.out.println("Su numero es impar"); 
            }
            System.out.println("Quiere calcular otro numero? Si|N  No|N");
                String op = scan.next().toUpperCase();
            if ("N".equals(op)|| "No".equals(op)){
                break;
            }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Solo puede ingresar numeros");
            }
        }
        
    }
    public void promedio(){
        int sum = 0;
        for (int i = 1; i <= 30;i++){
            try{
            System.out.println("Porfavor ingrese el num"+ i);
            sum = sum + Integer.parseInt(scan.next());
            }
            catch(NumberFormatException e){
                System.out.println("Error: Solo puede ingresar numeros");
            }  
        }
        System.out.println("El promedio de "+ sum + " es: "+ sum/30);
             
    }
    public void parimpar2(){
        int i = 1;
        while (i <= 20){
            if (i%2 == 0){
                System.out.println(i);
            }
            i++;
        }
             
    }
    public void impar(){
        int i = 1;
        int sum = 0;
        while (i <= 400){
            if (i%2 != 0){
                sum = sum + i;
            }
            i++;
        }
        System.out.println("La suma de los impares entre 1 y 400 es: "+ sum);        
    }
    public void areaCirculo(){
        while(true){
            try{
            System.out.println("Porfavor ingrese el valor del radio para calcular el area del circulo");
            double num = Integer.parseInt(scan.next()) ;
            if (num < 0){
                System.out.println("El radio no puede ser negativo");
                areaCirculo();
            }else{
               num = (Math.pow(num,2))*Math.PI;
               System.out.println("El area de su circulo es: "+ num );
            }
            System.out.println("Quiere calcular otra area? Si|N  No|N");
                String op = scan.next().toUpperCase();
            if ("N".equals(op)|| "No".equals(op)){
                break;
            }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Solo puede ingresar numeros");
            }
        }
        
    }
     public void perimetroCirculo(){
        while(true){
            try{
            System.out.println("Porfavor ingrese el valor del diametro para calcular el perimetro del circulo");
            double num = Integer.parseInt(scan.next()) ;
            if (num < 0){
                System.out.println("El diametro no puede ser negativo");
                perimetroCirculo();
            }else{
               num = (num)*Math.PI;
               System.out.println("El perimetro de su circulo es: "+ num );
            }
            System.out.println("Quiere calcular otro perimetro? Si|N  No|N");
                String op = scan.next().toUpperCase();
            if ("N".equals(op)|| "No".equals(op)){
                break;
            }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Solo puede ingresar numeros");
            }
        }
        
    }
     public void areaRectangulo(){
        while(true){
            try{
            System.out.println("Porfavor ingrese el valor del lado del largo del rectangulo");
            double a = Integer.parseInt(scan.next()) ;
            System.out.println("Porfavor ingrese el valor del lado del ancho del rectangulo");
            double b = Integer.parseInt(scan.next()) ;
            if (a < 0 && a < 0){
                System.out.println("Los lados no pueden ser negativos");
                areaRectangulo();
            }else{
               double area = a*b ;
               System.out.println("El area de su rectangulo es: "+ area );
            }
            System.out.println("Quiere calcular otra area? Si|N  No|N");
                String op = scan.next().toUpperCase();
            if ("N".equals(op)|| "No".equals(op)){
                break;
            }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Solo puede ingresar numeros");
            }
        }
        
    }
     public void volEsfera(){
        while(true){
            try{
            System.out.println("Porfavor ingrese el valor del lado del radio de la esfera");
            double radio = Integer.parseInt(scan.next()) ;
            if (radio < 0){
                System.out.println("El radio no puede ser negativo");
                volEsfera();
            }else{
               double volumen = (((4*Math.pow(radio,3))/3))*Math.PI;
               System.out.println("El volumen de su esfera es: "+ volumen );
            }
            System.out.println("Quiere calcular otro volumen? Si|N  No|N");
                String op = scan.next().toUpperCase();
            if ("N".equals(op)|| "No".equals(op)){
                break;
            }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Solo puede ingresar numeros");
            }
        }
        
    }
     public void apCubo(){
        while(true){
            try{
            System.out.println("Porfavor ingrese la logitud de la cara de un cubo");
            double Longitud = Integer.parseInt(scan.next()) ;
            if (Longitud < 0){
                System.out.println("La longitud no puede ser negativa");
                apCubo();
            }else{
               double area = 6 * Math.pow(Longitud, 2);
               double perimetro = 12 * Longitud;
               System.out.println("El area de su cubo es: " + area );
               System.out.println("El perimetro de su cubo es: " + perimetro );
            }
            System.out.println("Quiere calcular el area y perimetro de otro cubo? Si|N  No|N");
                String op = scan.next().toUpperCase();
            if ("N".equals(op)|| "No".equals(op)){
                break;
            }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Solo puede ingresar numeros");
            }
        }
        
    }
     public void multiplo3(){
            System.out.println("1 al 100 sin los multiplos de 3: ");
            for (int i = 1; i <= 100; i++){
                if(i%3 != 0){
                    System.out.println(i);
                }
            }
            
     }
    public void multiplo5(){
        System.out.println("1 al 100 sin los multiplos de 5: ");
        int i = 1;
        while(i <= 100){
            if(i%5 != 0){
                System.out.println(i);
            }
          i++;
        }
            
    }
    public void multiplo3y5(){
        System.out.println("1 al 100 sin los multiplos de 5 y 3: ");
        int i = 1;
        while(i <= 100){
            if(i%5 != 0 && i%3 != 0){
                System.out.println(i);
            }
          i++;
        }
            
    }
    public void multiplo3cuek(){
            System.out.println("1 al 100 sin los multiplos de 3 remplazados con Cuek: ");
            for (int i = 1; i <= 100; i++){
                if(i%3 != 0){
                    System.out.println(i);
                }else{
                   System.out.println("Cuek"); 
                }
            }
            
    }
    public void factorial(){
         while(true){
            try{
            System.out.println("Porfavor ingrese un numero para calcular el factorial");
            int factorial = Integer.parseInt(scan.next()) ;
            int i = factorial-1;
            if (factorial < 0){
                System.out.println("No existe factorial negativo");
                factorial();
            }
            while(i != 1){
                factorial = factorial * i;
                i = i -1;
            }
               System.out.println("El factorial es: " + factorial );
            System.out.println("Quiere calcular otro factorial? Si|N  No|N");
                String op = scan.next().toUpperCase();
            if ("N".equals(op)|| "No".equals(op)){
                break;
            }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Solo puede ingresar numeros");
            }
            
        }
    }
    public void digitos(){
    while(true){
            try{
            System.out.println("Porfavor ingrese un numero para calcular la cantidad de digitos de este");
            int digitos = Integer.parseInt(scan.next());
            int i = 0;
            while(digitos !=0) {
                digitos = digitos/10;
                i++;
            } 
               System.out.println("Cantidad de digitos: " + i);
            System.out.println("Quiere ver la cantidad de digitos de otro numero? Si|N  No|N");
                String op = scan.next().toUpperCase();
            if ("N".equals(op)|| "No".equals(op)){
                break;
            }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Solo puede ingresar numeros");
            }
            
        }
}
    public void apCuadrado(){
        while(true){
            try{
            System.out.println("Porfavor ingrese la longitud del lado de su cuadrado");
            double Longitud = Integer.parseInt(scan.next()) ;
            if (Longitud < 0){
                System.out.println("La longitud del lado del cuadrado no puede ser negativa");
                apCuadrado();
            }else{
               double area = Math.pow(Longitud,2);
               double perimetro = 4 * Longitud;
               System.out.println("El area de su cuadrado es: " + area );
               System.out.println("El perimetro de su cuadrado es: " + perimetro );
            }
            System.out.println("Quiere calcular el area y perimetro de otro cuadrado? Si|N  No|N");
                String op = scan.next().toUpperCase();
            if ("N".equals(op)|| "No".equals(op)){
                break;
            }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Solo puede ingresar numeros");
            }
        }
    }
    public void potencia(){
        while(true){
            try{
            System.out.println("Porfavor ingrese la base a elevar");
            int base = Integer.parseInt(scan.next()) ;
            System.out.println("Porfavor ingrese el exponente");
            int exponente = Integer.parseInt(scan.next()) ;
            int resultado = base;
            if (base < 0 && exponente <0){
                System.out.println("No puede usar valores negativos");
                potencia();
            }else{
               for (int i = 1; i < exponente; i++){
                  resultado = resultado * base;      
               }
               System.out.println(base+ " elevado a "+exponente+" es: " + resultado);
            }
            System.out.println("Quiere calcular otra potencia? Si|N  No|N");
                String op = scan.next().toUpperCase();
            if ("N".equals(op)|| "No".equals(op)){
                break;
            }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Solo puede ingresar numeros");
            }
        }
    }
}

