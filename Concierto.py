import numpy as np
import os

#Escenario
escenario=np.zeros([10,11], dtype=object)

#Datos clientes
nombre=list(); run=list(); edad=list()
cliente=[nombre, run, edad]

#Precios
platinum=120000; gold=80000; silver=50000

#Menú
def menu():
    print("1.- Comprar entradas")
    print("2.- Mostrar ubicaciones disponibles")
    print("3.- Ver listado de asistentes")
    print("4.- Ganancias totales")
    print("5.- Salir")

#Asientos disponibles
def disp():
    escenario[0,0] = "10"
    escenario[1,0] = "09"
    escenario[2,0] = "08"
    escenario[3,0] = "07"
    escenario[4,0] = "06"
    escenario[5,0] = "05"
    escenario[6,0] = "04"
    escenario[7,0] = "03"
    escenario[8,0] = "02"
    escenario[9,0] = "01"
    print('Concierto VIP de “Michael Jam” ')
    print('-------Escenario-------')
    print(escenario)
    print('   Col-------Filas--------')
    print("Asientos disponibles = 0")
    print("Asientos comprados   = X")
    print('Valor entradas: \nPlatinum: $120.000 (Filas 10 y 9) \nGold: $80.000 (Filas del 8 al 6) \nSilver: $50.000 (Filas de 5 al 1)')

while True:
    os.system('cls')
    menu()
    op=input('Ingrese opción: ')

    if op=='1':
        disp()
        while True:
            try:
                xnom=input('Ingrese nombre: ')
                xrun=input('Ingrese run sin DV: ')
                xedad=int(input('Ingrese edad: '))
                col = int(input("Seleccione Columna(1-10): "))
                fila = int(input("Seleccione Fila(1-10): "))
                escenario [10-col,fila] = "X"
                if escenario [10-col,fila] == "X":
                    input('Compra exitosa! \nPulse cualquier tecla para continuar...')
                elif escenario [10-col,fila] == 0:
                    input('No disponible, intente nuevamente')
                break
            except Exception as error:
                print(error)
                input('Pulse cualquier tecla para continuar...')
        nombre.append(xnom);run.append(xrun);edad.append(xedad)
    elif op=='2':
        disp()
        input("Pulse cualquier tecla para continuar...")
    elif op=='3':
        run.sort()
        n=len(run)
        print('Listado de asistentes...')
        for i in range(n):
            print(f"Nombre: {cliente[0][i]} RUN: {cliente[1][i]} Edad: {cliente[2][i]}")
        input('Pulse cualquier tecla para continuar...')
    elif op=='4':
        disp()
        A=0; B=0; C=0 #Acumuladores
        for i in range(len(escenario)):
           if "X" == escenario[0][i]:
               A=A+1
           if "X" == escenario[1][i]:
               A=A+1
           if "X" == escenario[2][i]:
               B=B+1
           if "X" == escenario[3][i]:
               B=B+1
           if "X" == escenario[4][i]:
               B=B+1
           if "X" == escenario[5][i]:
               C=C+1
           if "X" == escenario[6][i]:
               C=C+1
           if "X" == escenario[7][i]:
               C=C+1
           if "X" == escenario[8][i]:
               C=C+1
           if "X" == escenario[9][i]:
               C=C+1

         #totales
        P=platinum*A; G=gold*B; S=silver*C
        tEntradas=A+B+C
        ganancias=P+G+S
        print(f'Entradas vendidas: \nPlatinum: {A} \nGold: {B} \nSilver: {C}')
        print(f'Cantidad de entradas vendidad: {tEntradas}')
        print(f'Ganancias: \nPlatinum: {P} \nGold: {G} \nSilver: {S}')
        print(f'Ganancias totales: {ganancias}')
        input('Pulse cualquier tecla para continuar...')
    elif op=='5':
        print('Gracias por preferirnos \nCreativos.cl \nJoel Gutierrez A. \nVersion 3.5.12')
        break