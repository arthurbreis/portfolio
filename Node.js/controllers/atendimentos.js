const Atendimento = require('../models/atendimentos')
//Rotas
module.exports = app => {
    app.get('/atendimentos', (req, res) => res.send('atendimentos'))

    app.post('/atendimentos', (req, res) => {
        const atendimento = req.body
        
        Atendimento.adiciona(atendimento)
        res.send('atendimento POST')

    })   
}