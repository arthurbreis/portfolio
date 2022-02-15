QUANTIDADE = 10 
print('Somatório e média de {0} números'.format(QUANTIDADE)) 

somatório = 0 

for i in range(QUANTIDADE): 
    número = int(input('Entre com um valor:')) 
    somatório += número 
print('Somatório:', somatório) 
print('Média:', somatório/QUANTIDADE)