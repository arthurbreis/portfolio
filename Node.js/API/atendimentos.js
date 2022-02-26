const moment = require('moment')
const conection = require('../infraestrutura/conection')

class Atendimento {
    adiciona(atendimento){
        const dataCriacao = moment().format('YYYY-MM-DD HH:mm:ss')
        const data = moment(atendimento.data, 'DD/MM/YYYY').format('YYYY-MM-DD HH:mm:ss')
        const dataValida = moment(data).isSameOrAfter(dataCriacao)
        const clienteValido = atendimento.cliente.length >= 5

        const validacoes = [
            {
                nome: 'data',
                valido: dataValida,
                mensagem: ' Data atual ok'
            },
            {
                nome: 'cliente',
                valido: clienteValido,
                mensagem: 'Cliente ok'
            }
        ]

        const erros =  validacoes.filter(campo => !campo.valido)
        const existemErros = erros.length
        
        if(existemErros){
            res.status(400).json(erros)
        } else{

               
        const atedimentoDatado = {...atendimento, data, dataCriacao}
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
}
module.exports = new Atendimento