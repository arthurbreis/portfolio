//Listar telefones do cliente, caso tenha mais de um, imprime todos
const cliente = {
    nome: "André",
    idade: 36,
    cpf: "12365242625",
    email: "andre@email.com",
    telefones: ["(21)999999999", "(32)888888888"]
}
cliente.telefones.forEach(tel => console.log(tel))

