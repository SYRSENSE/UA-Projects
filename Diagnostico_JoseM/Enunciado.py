from classes.Profesion import *
#1. Nombre y explique brevemente los pilares de la POO.
 #1| Clases: La programacion orientada a objetos esta constituida por clases, que representan diferentes cosas las cuales puedan contener informacion y funciones
 #2| Herencia: Donde una clase puede heredar datos y funciones de una clase padre, eso es util para simplificar el codigo y que sea más legible
 #3| Polimorfismo: 
 #4|
#2. Explique y ejemplifique el concepto de clase.
 #1| Una clase es una "funcion" la cual contiene datos y funciones.
#3. Explique y ejemplifique el concepto de objeto.
#4. Implemente el siguiente enunciado utilizando el lenguaje que más le acomode.

#Se le solicita, crear un programa que permita a una compañía de encuestas, caracterizar a un
#grupo de personas, por cada persona el programa debe solicitar el nombre, edad (número entero
#mayor a 0) y sexo (Masculino - Femenino), además se le preguntará al usuario que escoja cuál es
#su profesión de entre las siguientes (“Ingeniero”,” Abogado”, “Otra”) cada profesión además del
#nombre, contempla el sueldo y un atributo que le permita almacenar la cantidad de personas
#pertenecientes a esa profesión, la cantidad de personas a encuestar es indeterminada, por ende
#al finalizar la captura de datos, debe preguntar si desea continuar con otra persona, en caso de
#ingresar que no, usted desplegará por pantalla la cantidad de el porcentaje de ingenieros,
#abogados y otra, así mismo el promedio de sueldo por profesión.
lista_prof = []
while True:
    
    nombre = input("Porfavor ingrese su nombre: \n")
    edad = int(input("Porfavor ingrese su edad: \n"))
    while edad <= 0:
        print("Su edad no puede ser menor a 0") 
        edad = int(input("Porfavor ingrese su edad: \n"))
    sexo = input("Porfavor ingrese su sexo |M||F|: \n")
    while sexo.upper() != "F" or "M":
        print("Dato incorrecto")
        sexo = input("Porfavor ingrese su sexo |M||F|: \n")
    prof = input("Ingrese su profesión, Ingeniero|I|, Abogado|A|, Otro|O|: \n")
    while prof.upper()  != "I" or prof.upper()  != "A" or prof.upper()  != "O":
        print("Dato incorrecto")
        prof = input("Ingrese su profesión, Ingeniero|I|, Abogado|A|, Otro|O|: \n")
    sueldo = int(input("Ingrese su sueldo"))

    obj_prof = Profesion(nombre,edad,sexo,prof,sueldo)
    lista_prof.append(obj_prof)
    print("Datos guardados con exito")
    op = input("Desea continuar con otra persona?|S||N|")
    if op.upper() == "S":
        break