//config modulo express, consign e body parser

const express = require('express')
const consign = require('consign')
const bodyParser = require('body-parser')
const app = express()


// config modulo consign para rotas

module.exports = () => {
    app.use(bodyParser.urlencoded({extended: true}))
    app.use(bodyParser.json())
    consign()
        .include('controllers')
        .into(app)
    return app
}