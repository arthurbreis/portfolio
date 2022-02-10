const moment = require('moment')
const conection = require('../infraestrutura/conection')

class Atendimento {
    adiciona(atendimento){
        const dataCriacao = moment().format('YYYY-MM-DD HH:MM:SS')
        const data = moment(atendimento.data, 'DD/MM/YYYY').format('YYYY-MM-DD HH:MM:SS')
        const atedimentoDatado = {...atendimento, dataCriacao, data}
        const sql = 'INSERT INTO Atendimentos SET ?'

        conection.query(sql,atendimento,(erro, resultados) =>{
            if(erro){
                console.log(erro)
            }else{
                console.log(resultados)
            }
        })

    }
}
module.exports = new Atendimento