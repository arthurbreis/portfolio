print ('Calendario de 2017 a 2020')
for ano in range (2017, 2021):
    for mes in range (1, 13):
        for dia in range (1, 31):
            print ('{0}/{1}/{2}'.format(dia,mes,ano))