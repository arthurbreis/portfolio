//adiciona objeto dentro do objeto

const cliente = {
    nome: "André",
    idade: 36,
    cpf: "12365242625",
    email: "andre@email.com",
    telefones: ["(21)999999999", "(32)888888888"]
}

cliente.dependentes = {
    nome: "Sara",
    parentesco: "filha",
    dataNasc: "03/03/2020"
}

console.log(cliente)

//altera objeto:

cliente.dependentes.nome = "Sara Silva"

console.log(cliente)