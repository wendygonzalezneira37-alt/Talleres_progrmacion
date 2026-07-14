Funcion respuesta <- MCD ( x1, x2 )
	Definir divisor, menor Como Entero
	respuesta = 1
	
	si x1 < x2 entonces 
		menor = x1
	sino 
		menor = x2
	FinSi
	para divisor = 1 hasta menor hacer 
		si x1 MOD divisor = 0 y x2 MOD divisor = 0 entonces 
			respuesta = divisor
		FinSi
	FinPara
Fin Funcion

Algoritmo PUNTO5
	Definir x1, x2, menor, mcm, divisor como entero
	Imprimir "Ingresa el primer número"
	leer x1
	Imprimir "Ingresa el segundo número"
	leer x2
	
	mientras x1>0 y x2 > 0 hacer 
		resultado = MCD (x1, x2)
		mcm = (x1*x2)/MCD(x1,x2)
		Imprimir "El mcm es: ",mcm,""
		Imprimir "Ingresa el primer número"
		leer x1
		Imprimir "Ingresa el segundo número"
		leer x2
	FinMientras
	
FinAlgoritmo

