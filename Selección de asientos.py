import numpy as np
import os

#Determinación de Matriz
aNormal=int(input('Ingrese numero de filas asientos normales: '))
bNormal=int(input('Ingrese numero de columnas asientos normales: '))
aVip=int(input('Ingrese numero de filas asientos VIP: '))
bVip=int(input('Ingrese numero de columnas asientos VIP: '))
asientoNormal=np.zeros(shape=(aNormal,bNormal), dtype=int)
asientoVip=np.zeros(shape=(aVip,bVip), dtype=int)

#Precios
pAN = 78900; pANdes = pAN*0.3; pAV = 240000; pAVdes = pAV*0.3

#Datos cliente
nombreN=list(); rutN=list(); telefonoN=list(); bancoN=list()
pasajeroN=[nombreN, rutN, telefonoN, bancoN]
nombreV=list(); rutV=list(); telefonoV=list(); bancoV=list()
pasajeroV=[nombreV, rutV, telefonoV, bancoV]

#Menu
while True:
    os.system("cls")
    print('Menu')
    print('1.- Asientos disponibles')
    print('2.- Compra de pasaje')
    print('3.- Comprobante de comprar')
    print('4.- Eliminar compra')
    print('5.- Mostrar todas las compras')
    print('9.- Salir')
    op=input("Ingrese opción: ")
    if op=='1':
        print('Asientos normales',asientoNormal)
        print('Asientos VIP', asientoVip)
        print('Valor asiento normal $', pAN)
        print('Valor asiento VIP $', pAV)
        input("Pulse cualquier tecla para continuar...")
    elif op =='2':
        print('Compra de pasaje')
        asiento = input('Ingrese tipo de asiento: 1 = Normal y 2 = VIP: ')
        if asiento == '1':
            while True:
                try:
                    xnombre=(input('Ingrese nombre: '))
                    xrut=(input('Ingrese rut sin DV: '))
                    xtelefono=(input('Ingrese telefono: '))
                    xbanco=(input('Ingrese banco: '))
                    if xbanco == 'Banco':
                        print('Precio convenio: $', pANdes)
                    if len(xnombre)>3 and len(xnombre)<=120:
                        if len(xrut) >=7 and len(xrut) <=8:
                            break
                    input("Datos mal ingresados")
                except Exception as error:
                    print(error)
                    input('Pulse cualquier tecla para continuar...')
            nombreN.append(xnombre);rutN.append(xrut);telefonoN.append(xtelefono);bancoN.append(xbanco)
            print('Asientos normales: 0=Disponibe y 1=Ocupado',asientoNormal)
            filaN = int(input('Fila: '))
            columnaN = int(input('Columna: '))
            if (asientoNormal[filaN,columnaN]==0):
                asientoNormal[filaN,columnaN] = 1
            else:
                input('Asiento ocupado, presione cualquier tecla para continuar: ')
        elif asiento == '2':
            while True:
                try:
                    ynombre=(input('Ingrese nombre: '))
                    yrut=(input('Ingrese rut sin DV: '))
                    ytelefono=(input('Ingrese telefono: '))
                    ybanco=(input('Ingrese banco: '))
                    if ybanco == 'Banco':
                        print(pAVdes)
                    if len(ynombre)>3 and len(ynombre)<=120:
                        if len(yrut) >=7 and len(yrut) <=8:
                            break
                    input("Datos mal ingresados")
                except Exception as error:
                    print(error)
                    input('Pulse cualquier tecla para continuar...')
            nombreV.append(ynombre);rutV.append(yrut);telefonoV.append(ytelefono);bancoV.append(ybanco)
            print('Asientos VIP: 0=Disponibe y 1=Ocupado', asientoVip)
            filaV = int(input('Fila: '))
            columnaV = int(input('Columna: '))
            if (asientoVip[filaV,columnaV]==0):
                asientoVip[filaV,columnaV] = 1
            else:
                input('Asiento ocupado, presione cualquier tecla para continuar: ')
    elif op=='3':
        print('Comprobante de Compra')
        cat1 = input('Tipo de asiento: 1 = Normal y 2 = VIP: ')
        if cat1 == '1':
            try:
                xrut=(input("Ingrese rut: "))
                i = rutN.index(xrut)
                print(f"{pasajeroN[0][i]} {pasajeroN[1][i]} {pasajeroN[2][i]} {pasajeroN[3][i]}")
                if (pasajeroN[3][i]) == 'Banco':
                    print('Precio final: $',pANdes)
                else:
                    print('Precio Final: $',pAN)
                    input('Pulse cualquier tecla para continuar...')
            except:
                print("Rut no existe en la lista")
        elif cat1 == '2':
            try:
                xrut=(input("Ingrese rut: "))
                i = rutV.index(xrut)
                print(f"{pasajeroV[0][i]} {pasajeroV[1][i]} {pasajeroV[2][i]} {pasajeroV[3][i]}")
                if (pasajeroV[3][i]) == 'banco':
                    print('Precio final: $',pAVdes)
                else:
                    print('Precio Final: $',pAV)
                input('Pulse cualquier tecla para continuar...')
            except:
                print("Rut no existe en la lista")
    elif op =='4':
        print('Eliminar compra')
        cat = input('Tipo de asiento: 1 = Normal y 2 = VIP: ')
        if cat == '1':
            print('Asientos normales: 0=Disponibe y 1=Ocupado',asientoNormal)
            filaN = int(input('Fila: '))
            columnaN = int(input('Columna: '))
            if (asientoNormal[filaN,columnaN]==1):
                asientoNormal[filaN,columnaN] = 0
                print('Asiento eliminado correctamente')
            else:
                input('Asiento libre, presione cualquier tecla para continuar: ')
        elif cat == '2':
            print('Asientos VIP: 0=Disponibe y 1=Ocupado', asientoVip)
            filaV = int(input('Fila: '))
            columnaV = int(input('Columna: '))
            if (asientoVip[filaV,columnaV]==1):
                asientoVip[filaV,columnaV] = 0
                print('Asiento eliminado correctamente')
            else:
                input('Asiento libre, presione cualquier tecla para continuar: ')
    elif op =='5':
        consulta=input('Que compras desea consultar: 1 = Compras Normales y 2 = Compras VIP: ')
        if consulta == '1':
            n=len(rutN)
            print('Todas las compras Normales...')
            for i in range(n):
                print(f"{pasajeroN[0][i]} {pasajeroN[1][i]} {pasajeroN[2][i]} {pasajeroN[3][i]}")
            input('Pulse cualquier tecla para continuar...')
        if consulta == '2':
            n=len(rutV)
            print('Todas las compras VIP')
            for i in range(n):
                print(f"{pasajeroV[0][i]} {pasajeroV[1][i]} {pasajeroV[2][i]} {pasajeroV[3][i]}")
            input('Pulse cualquier tecla para continuar...')
    elif op=='9':
        break