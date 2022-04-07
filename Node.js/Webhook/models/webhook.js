const conection = require('../config/conection')

class Webhook {
    adiciona(webhook){
        const sql = 'INSERT INTO arrangements SET ?'

        conection.query(sql, webhook, (erro, resultados) =>{
            if(erro){
                console.log(erro)
            }else{
                console.log(resultados)
            }
        })

    }
}

module.exports = new Webhook