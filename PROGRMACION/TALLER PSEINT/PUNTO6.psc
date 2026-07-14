subproceso Descomponer(x) //Este comando devulve más de un valor
	definir divisor como entero 
	
	divisor = 2 //inicializar con el primer valor primo
	Mientras x > 0 Hacer 
		si x MOD divisor = 0 entonces 
			Escribir divisor
			x = x/divisor //El x obtenido se divide nuevamente por el divisor anterior y entral ciblo del mientras de nuevo
		sino
			divisor = divisor + 1
		FinSi
		
	FinMientras
	
FinSubProceso

Algoritmo PUNTO6
	definir x como entero 
	Imprimir "Ingrese un número"
	Leer x
	Descomponer(x)
FinAlgoritmo
