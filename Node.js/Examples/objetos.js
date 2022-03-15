//printar nome do objeto Cliente e  primeiros digitos CPF

const cliente = {
    nome: "André",
    idade: 36,
    cpf: "12365242625",
    email: "andre@email.com"
}

console.log(`Nome: ${cliente.nome}`)
console.log(`CPF : ${cliente.cpf.substring(0,3)}.***.***-**`)

//Acessar chaves com colchetes

const chaves = ["nome", "idade", "cpf", "email"]

//print posição 0
console.log(cliente[chaves[0]])

//print todo array que contem o objeto
chaves.forEach(info=>console.log(cliente[info]))

//Adicionar campos ao objeto
cliente.tel = "999999999"
console.log(cliente)

//deletar tel cliente
delete cliente.tel
console.log(cliente)
