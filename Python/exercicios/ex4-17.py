n = int(input('Entre com n: '))

fatorial = 1

for i in range (1, n+1):
    fatorial *= i
    print ('{0} != {1}'.format(i, fatorial))
