const mysql = require('mysql2')

const conection = mysql.createConnection({
    host: 'localhost',
    port: 3306,
    user: 'root',
    password: '1921681254',
    database: 'project01',
    insecureAuth : true
})

module.exports = conection