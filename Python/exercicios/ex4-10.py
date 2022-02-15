a = int(input('Entre com valor de a: '))
b = int(input('Entre com valor de b: '))
n = int(input('Entre com valor de n: '))

soma = 0

for i in range(1,n+1):
    soma += a - b*i + i**2
print(soma)