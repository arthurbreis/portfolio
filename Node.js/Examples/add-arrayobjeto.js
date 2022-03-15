const cliente = {
    nome: "André",
    idade: 36,
    cpf: "12365242625",
    email: "andre@email.com",
    telefones: ["(21)999999999", "(32)888888888"],
    dependentes:[{
        nome: "Sara",
        parentesco: "filha",
        dataNasc: "03/03/2020"
    }]
}
cliente.dependentes.push({
    nome: "Maria",
    parentesco: "filha",
    dataNasc: "03/03/2000"
})


console.log(cliente)

//altera objeto:

cliente.dependentes.nome = "Sara Silva"

console.log(cliente)

//filtro data de nascimento

const filhaMaisNova = cliente.dependentes.filter(dependente => dependente.dataNasc ==="03/03/2020" )

console.log(`Mais nova: ` + filhaMaisNova[0].nome)