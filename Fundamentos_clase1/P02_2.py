
while True:
    costo_casa = float(input("Porfavor ingrese el costo de la casa: "))
    ingresos = int(input("Ingrese la cantidad de ingresos del comprador: "))
    if ingresos < 80_000:
        pie = costo_casa * 0.3
        pago_mensual = (costo_casa-pie)/(7*12)
        print("El pie corresponde al 30% del costo de la casa")
        print(f"Valor de la casa: {costo_casa}")
        print(f"Valor pie: {pie}")
        print(f"Pago mensual de {pago_mensual}$ por 7 años")
    else:
        pie = costo_casa * 0.15
        pago_mensual = (costo_casa-pie)/(10*12)
        print("El pie corresponde al 15% del costo de la casa")
        print(f"Valor de la casa: {costo_casa}")
        print(f"Valor pie: {pie}")
        print(f"Pago mensual de {pago_mensual}$ por 10 años")
    
    salir = input("Desea continuar?: |Si||No|")
    if salir == "Si":
        break
    else: 
        print("Reiniciando programa")