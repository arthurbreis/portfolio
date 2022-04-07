const customExpress = require('./config/customExpress')
//const port = 3000
const app = customExpress()
//importando conexao com db
const conection = require('./config/conection')


//testando conexao e listando a porta
conection.connect(erro => {
    if(erro){
        console.log(erro)
    } else
        console.log('conect DB!')
        app.listen(process.env.port, () => console.log(` in ${process.env.port}!`))
})
