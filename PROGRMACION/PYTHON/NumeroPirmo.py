def numero_primo(numero):    
    resultado = True
numero= (int(input("Ingrese un numero")))
for divisor in range(2, numero):
    if numero % divisor==0:  # si el residuo entre el numero y el divisor es cero, no es primo
        resultado = False

if numero_primo:
    print("El número es primo")
else:
    print("El núnmero no es primo")