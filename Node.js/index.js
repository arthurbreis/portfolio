const customExpress = require('./config/customExpress')
const port = 3000
const app = customExpress()

//importando conexao com db, testando conexao e listando a porta
const conection = require('./infraestrutura/conection')
conection.connect(erro => {
    if(erro){
        console.log(erro)
    } else
    
        console.log('conect DB!')

        app.listen(port, () => console.log(`project01 in ${port}!`))
})
