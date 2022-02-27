//ForEach

const nomes = ["Ana", "Ju", "Leo", "Paula"]

function imprimeNomes(nome){
    console.log(nome)
}

nomes.forEach(imprimeNomes)

//Map

const notas = [10, 9, 8, 7, 6]

const notasAtualizadas = notas.map(nota => nota == 10 ? nota : ++nota)

console.log(notasAtualizadas)
