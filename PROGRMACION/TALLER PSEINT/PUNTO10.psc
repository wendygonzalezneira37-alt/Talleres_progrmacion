Algoritmo Punto10
	
    Definir numeroSecreto, intento, numeroUsuario Como Entero
	
    numeroSecreto = Aleatorio(1,50)
	
    Para intento = 1 Hasta 5 Hacer
		
        Escribir "Intento ", intento, " de 5"
        Escribir "Ingrese un número entre 1 y 50:"
        Leer numeroUsuario
		
        Si numeroUsuario = numeroSecreto Entonces
            Escribir "Adivinaste el número."
            intento = 5
        SiNo
            Si numeroUsuario < numeroSecreto Entonces
                Escribir "El número es MAYOR."
            SiNo
                Escribir "El número es MENOR."
            FinSi
        FinSi
		
    FinPara
	
    Escribir "El número era: ", numeroSecreto
	
FinAlgoritmo
