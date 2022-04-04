const Webhook = require('../models/webhook')
//Rotas
module.exports = app => {
    app.post('/webhook', (req, res) => {
        const webhook = req.body
        
        Webhook.adiciona(webhook)
        res.sendStatus(200)

    })   
}