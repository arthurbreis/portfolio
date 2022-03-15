const cliente = {
    nome: "André",
    idade: 36,
    cpf: "12365242625",
    email: "andre@email.com",
    telefones: ["(21)999999999", "(32)888888888"],
    dependentes:[
        {
            nome: "Sara",
            parentesco: "filha",
            dataNasc: "03/03/2020"},
        {
            nome: "Maria",
            parentesco: "filha",
            dataNasc: "03/03/2000"
        }
],
    saldo: 100,

    depositar: function(valor)
    {
        this.saldo += valor
    }
}

console.log(`saldo: `+ cliente.saldo)
cliente.depositar(30)
console.log(`saldo atual: ` + cliente.saldo)