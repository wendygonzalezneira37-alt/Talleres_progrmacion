Algoritmo PUNTO8
	Definir monto, meses  Como Entero
	Definir valorInteres, Interes, TotalAPagar  como Real
	Imprimir "Ingrese el monto:"
	Leer monto
	Imprimir "Ingrese el número de meses:"
	Leer meses
	Imprimir "Ingrese el valor del interes mensual (Decimales separados por punto):"
	Leer valorInteres
	Interes = monto*valorInteres*meses
	TotalAPagar = monto +Interes
	Imprimir "Total a pagar:" , TotalAPagar
	
FinAlgoritmo
