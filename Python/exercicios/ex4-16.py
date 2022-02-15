print('Este programa calcula o enésimo número de Tribonacci') 
ordem = int(input('Qual Tribonacci você quer saber? ')) 
atual = 1  
último = 1
penultimo = 0 
for i in range (2, ordem): 
    antepenúltimo = penultimo
    penultimo= último 
    último = atual 
    atual = último+penultimo+antepenúltimo

print('Resposta:', atual)