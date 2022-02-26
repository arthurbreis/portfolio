const customExpress = require('./config/customExpress')
const port = 3000
const app = customExpress()
//importando conexao com db
const conection = require('./infraestrutura/conection')
const Tables = require('./infraestrutura/tables')

//testando conexao e listando a porta
conection.connect(erro => {
    if(erro){
        console.log(erro)
    } else
        console.log('conect DB!')
        Tables.init(conection)
        app.listen(port, () => console.log(`project01 in ${port}!`))
})
