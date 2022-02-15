inf = int(input('Entre com o limite inferior: '))
sup = int(input('Entre com o limite superior: '))
soma = 0

for i in range(inf, sup+1):
    soma += i
print(soma)