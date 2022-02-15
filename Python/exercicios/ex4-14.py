print('Pagamento pelo jogo de xadrez') 
grãos = 0 
for i in range(64): 
    grãos += 2**i 

print('Grãos de arroz:', grãos) 
quilos = grãos//170000 
print('Quilos:', quilos) 
quilômetros_quadrados = quilos//550000 
print('Quilômetros quadrados:', quilômetros_quadrados) 
brasis = quilômetros_quadrados//8514876 
print('Brasis:', brasis)