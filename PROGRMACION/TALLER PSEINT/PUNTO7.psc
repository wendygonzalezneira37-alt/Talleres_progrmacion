Funcion respuesta <- Factorial (numero)
	Definir contador, acumulador Como Entero
	acumulador = 1 // para empezar a multiplicar desde 1
	para contador = 1 hasta numero Hacer
		acumulador = acumulador*contador
		respuesta = acumulador //devuelve un valor a la función
	FinPara

Fin Funcion

Algoritmo PUNTO7
	Definir n, r, combiancion, permutacion como enteros
	Definir factorialN, factorialNR, factorialR como entero
	Imprimir "Ingresa n:"
	Leer n
	Imprimir "Ingresa r:"
	Leer r
	factorialN = Factorial(n) //creo una variable en donde se va a guardar n!
	factorialR = Factorial(r)
	factorialNR = Factorial(n-r)
	combinacion = (factorialN/(factorialR*factorialNR)) 
	permutacion = (factorialN/factorialNR)
	Imprimir "Combinación:" , combinacion
	Imprimir "Permutación:" , permutacion
	
FinAlgoritmo
