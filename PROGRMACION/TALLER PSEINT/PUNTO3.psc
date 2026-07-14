
Funcion resultado <- NumeroPrimo ( numero )
	Definir divisor como entero
	
	resultado = verdadero
	
	Para divisor = 2 Hasta numero-1 hacer //indica el rango de los divisores (2 hasta n-1)
		Si numero MOD divisor = 0 Entonces //Si el residuo de la division entre numero y divisor es 0 entonces no es primo
			resultado = falso 
		FinSi
	FinPara
Fin Funcion

Algoritmo PUNTO3
	definir numero Como Entero
	Imprimir "Ingrese un número"
	Leer numero
	
	si NumeroPrimo(numero) Entonces  //si la funcion numero primo es verdadera
		Escribir "El número es primo"
	SiNo
		Escribir "El número no es primo"// si no es verdadera
		
	FinSi
	
	
FinAlgoritmo
