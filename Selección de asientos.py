import numpy as np
import os

#Creación de la Matriz
fNormal=int(input('Ingrese numero de filas: '))
cNormal=int(input('Ingrese numero de columnas: '))
fVip=int(input('Ingrese numero de filas: '))
cVip=int(input('Ingrese numero de columnas: '))
aNormal=np.zeros(shape=(fNormal,cNormal), dtype=int)
aVip=np.zeros(shape=(fVip,cVip), dtype=int)

#Precios pasajes
pAN=78900; pANdes=pAN*0.3; pAV=240000; pAVdes=pAV*0.3

#Almacenamiento de datos de clientes
nombreN=list(); rutN=list(); telefonoN=list(); bancoN=list()
pasajeroN=[nombreN, rutN, telefonoN, bancoN]
nombreV=list(); rutV=list(); telefonoV=list(); bancoV=list()
pasajeroV=[nombreV, rutV, telefonoV, bancoV]

#Creación del Menú
while True:
    os.system('cls')
    print('Menú')
    print('1- Asientos disponibles')
    print('2.- Compra de pasajes')
    print('3.- Comprobante de compra')
    print('4.- Eliminar compra')
    print('5.- Mostrar todas las compras')
    print('9.- Salir')
    op=input('Ingrese opció: ')
    if op =='1':
        print('Asientos normales',aNormal )
        print('Asientos VIP', aVip)
        print('Valor asiento normal: $', pAN)
        print('Valor asiento VIP: $', pAV)
        input('Pulse cualquier tecla para continuar...')
    elif op =='2':
        print('Compra de pasajes')
        a1 = input('Tipo de asiento: 1=Normal y 2=VIP: ') 
        if a1 =='1':
            while True:
                try:
                    print('Ingrese datos del pasajero')
                    xnom=(input('Ingrese nombre: '))
                    xrut=(input('Ingrese rut sin DV: '))
                    xtel=(input('Ingrese telefono: '))
                    xban=(input('Ingrese nombre de su Banco: '))
                    if xban == 'Banco':
                        print('Precio convenio: $', pANdes)
                        if len(xnom)>=3 and len(xnom)<=120:
                            if len(xrut)>=7 and len(xrut)<=8:
                                break
                    input('Datos mal ingresados')
                except Exception as error:
                    print(error)
                    input('Pulse cualquier tecla para continuar...')    