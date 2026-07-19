def numero_primo(numero):    
    resultado = True
    
    for divisor in range(2, numero):
        
        if numero % divisor==0:  # si el residuo entre el numero y el divisor es cero, no es primo
            resultado = False
            return resultado
    return resultado
numero= (int(input("Ingrese un numero")))

if numero_primo(numero):
    print("El número es primo")
else:
    print("El núnmero no es primo")