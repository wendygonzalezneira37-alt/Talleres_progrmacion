
Algoritmo Punto2
	Definir xanterior, conteoImpares, xactual como entero

	Imprimir "Ingresa un número"
	leer xanterior
	conteoImpares= 0
	si xanterior MOD 2 <> 0 entonces
		conteoImpares = conteoImpares+1
	FinSi
	leer xactual
	Mientras xactual>xanterior Hacer
		si xactual MOD 2 <> 0 entonces
			conteoImpares = conteoImpares+1
		FinSi
		xanterior = xactual
		leer xactual
	FinMientras
	
	Escribir "La cantidad de numeros impares fue: ",conteoImpares,""

FinAlgoritmo
