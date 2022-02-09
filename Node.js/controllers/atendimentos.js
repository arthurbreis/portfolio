//Rotas
module.exports = app => {
    app.get('/atendimento', (req, res) => res.send('atendimento'))

    app.post('/atendimento', (req, res) => {
        console.log(req.body)
        res.send('atendimento POST')

    })   
}