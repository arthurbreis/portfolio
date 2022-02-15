valor = int (input('digite um valor:'))
for i in range (1,25,1):
    par = valor/i  
    print (i,'x','{:.0f}'.format(par))