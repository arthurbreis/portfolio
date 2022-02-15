print('Este programa calcula o enésimo número de Fibonacci') 
ordem = int(input('Qual Fibonacci você quer saber? ')) 
atual = 1 
último = 1 
for i in range (2, ordem): 
    penúltimo = último 
    último = atual 
    atual = último+penúltimo 
print('Resposta:', atual)