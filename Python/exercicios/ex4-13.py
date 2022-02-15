print ("seu numero da sorte!!!")
dt = int(input('digite sua data de nascimento (ddmmaaaa): '))

soma = 0

for i in range(8):
    soma += dt % 10
    dt //= 10
print('Seu numero da sorte é: ', soma)
