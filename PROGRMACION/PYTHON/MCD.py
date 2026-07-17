def MCD(x1,x2):

    if x1 < x2:
        menor=x1
    else:
        menor=x2
    for divisor in range(1, menor + 1):
        if x1 % divisor == 0 and x2 % divisor == 0: 
            respuesta = divisor
    return respuesta

x1=(int(input("Escribir el primer número")))
x2=(int(input("Escribir el segundo numero")))

while x1>0 and x2>0:
     resultado = MCD(x1,x2)
     print("El MCD es:", resultado)
     x1=(int(input("Escribir el primer número")))
     x2=(int(input("Escribir el segundo numero")))