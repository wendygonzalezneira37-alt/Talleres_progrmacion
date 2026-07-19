numeros = [] ##Variable para la lista de resultados

xanterior = (int(input("Ingrese un número"))) #para ingresar un valor "input"
numeros.append(xanterior) #Guarda los datos de la variable y los ordena de forma ascendente
contador = 0
if xanterior % 2 != 0: ## % es equivalente a MOD y != quiere decir diferente
    contador = contador + 1

xactual = (int(input("Ingrese un número"))) #para ingresar un valor "input"
while xactual > xanterior:
    if xactual % 2 != 0:
        contador = contador + 1
    numeros.append(xactual)
    xactual = (int(input("Ingrese un número"))) #para ingresar un valor "input"    
    
print("La cantidad de números impares es:", contador)
print("Lista de númeres en orden ascendente", numeros)