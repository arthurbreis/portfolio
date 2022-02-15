qtd = int(input('Quantos valores serão digitados?: '))  
print('Somatório e média de {0} números'.format(qtd)) 

soma = 0

for i in range(qtd): 
    número = int(input('Entre com um valor:')) 
    soma += número 

print('Média:', soma/qtd)