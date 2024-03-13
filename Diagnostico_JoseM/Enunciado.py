"""
1. Nombre y explique brevemente los pilares de la POO.
 1| Abstraccion: Poder representar caracteristicas de un objeto real dentro de la programacion.
 2| Herencia: Mecanismo el cual permite a una clase dar atributos y comportamientos a una clase diferente (subclase)
 3| Polimorfismo: Capacidad de un objeto para poder responder a una misma situacion de diferentes formas
 4| Encapsulamiento: Ocultamiento de datos de un objeto para que no se puedan acceder de forma externa a este si no hay un metodo asociado a este.
2. Explique y ejemplifique el concepto de clase.
    Una clase es un plano para crear objetos.
    class Persona():
    def __init__(self, nombre = "",edad = 0,sexo = ""):
        self.__nombre = nombre
        self.__edad = edad
        self.__sexo = sexo
    De esta misma clase se pueden crear objetos con diferentes datos que entren en la misma categoria
3. Explique y ejemplifique el concepto de objeto.
    Un objeto es una instancia especifica de una clase:
    Persona_1 = Persona("Juan", 12, "M")
4. Implemente el siguiente enunciado utilizando el lenguaje que más le acomode.

Se le solicita, crear un programa que permita a una compañía de encuestas, caracterizar a un
grupo de personas, por cada persona el programa debe solicitar el nombre, edad (número entero
mayor a 0) y sexo (Masculino - Femenino), además se le preguntará al usuario que escoja cuál es
su profesión de entre las siguientes (“Ingeniero”,” Abogado”, “Otra”) cada profesión además del
nombre, contempla el sueldo y un atributo que le permita almacenar la cantidad de personas
pertenecientes a esa profesión, la cantidad de personas a encuestar es indeterminada, por ende
al finalizar la captura de datos, debe preguntar si desea continuar con otra persona, en caso de
ingresar que no, usted desplegará por pantalla la cantidad de el porcentaje de ingenieros,
abogados y otra, así mismo el promedio de sueldo por profesión.
"""
from classes.Profesion import Profesion
list_trabajos= []
def datos_entrada():
    nombre = input("Ingrese su nombre: ")
    while True:
        edad = int(input("Ingrese su edad: "))
        if edad > 0:
            break
        else:
            print("Error: La edad no puede ser negativa.")

    while True:
        sexo = input("Ingrese su sexo (M/F): ").capitalize()
        if sexo == 'M' or sexo == 'F':
            break
        else:
            print("Error: Ingrese 'M' para masculino o 'F' para femenino.")

    while True:
        profesion = input("Ingrese su profesión (I/A/O): ").capitalize()
        if profesion in ['I', 'A', 'O']:
            break
        else:
            print("Error: Ingrese 'I' para Ingeniero, 'A' para Abogado, o 'O' para Obrero.")
    while True:
        try:
            sueldo = float(input("Ingrese su sueldo: "))
            break
        except ValueError:
            print("Error: Por favor ingrese un valor numérico para el sueldo.")

    return Profesion(nombre, edad, sexo, profesion, sueldo)

def datos_salida(lista):
    cont_I = 0
    cont_A = 0
    cont_O = 0
    sueldo_I = 0
    sueldo_A = 0
    sueldo_O = 0
    for obj in lista:
        if obj.get_profesion()== "I":
            cont_I += 1
            sueldo_I += obj.get_sueldo()
        elif obj.get_profesion()== "A":
            cont_A += 1
            sueldo_A += obj.get_sueldo()
        elif obj.get_profesion()== "O":
            cont_O += 1
            sueldo_O += obj.get_sueldo()
    print(f"Porcentaje de Ingenieros: {(cont_I/len(lista))*100}")
    print(f"Promedio de sueldo: {sueldo_I/cont_I}")
    print(f"Porcentaje de abogados: {(cont_A/len(lista))*100}")
    print(f"Promedio de sueldo: {sueldo_A/cont_I}")
    print(f"Porcentaje de otras profesiones: {(cont_O/len(lista))*100}")
    print(f"Promedio de sueldo: {sueldo_O/cont_I}")
    
while True:
    obj = datos_entrada()
    list_trabajos.append(obj)
    salir = input("Desea continuar? |Si||No|: ") .capitalize()
    if salir == "No":
        break

datos_salida(list_trabajos)