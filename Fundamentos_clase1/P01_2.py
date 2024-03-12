valor_Asiento = int(input("Ingrese valor de los asientos: "))
perdida = 0
while True:
    edad = int(input("Porfavor ingrese su edad: "))
    
    if (edad < 5) :
        print("Usted no puede entrar al teatro, no cumple con la edad suficiente")
    else:
        if (edad <= 14):
            print("Usted tiene un descuento del 35%")
            print(f"Valor ticket: {valor_Asiento* 0.35}")
            perdida =+ valor_Asiento* 0.65
        if (edad >= 15 and edad <= 19):
            print("Usted tiene un descuento del 25%")
            print(f"Valor ticket: {valor_Asiento* 0.25}")
            perdida =+ valor_Asiento* 0.75
        if (edad >= 20 and edad <= 45):
            print("Usted tiene un descuento del 10%")
            print(f"Valor ticket: {valor_Asiento* 0.10}")
            perdida =+ valor_Asiento* 0.90
        if (edad >= 46 and edad <= 65):
            print("Usted tiene un descuento del 25%")
            print(f"Valor ticket: {valor_Asiento* 0.25}")
            perdida =+ valor_Asiento* 0.75
        if (edad >= 66):
            print("Usted tiene un descuento del 35%")
            print(f"Valor ticket: {valor_Asiento* 0.35}")
            perdida =+ valor_Asiento* 0.65
    salir = input("Desea salir? |Si||No|") .capitalize()
    if salir == "Si":
        break
    else: 
        print("Reiniciando programa")

print(f"El total de perdida es de: {perdida}")    