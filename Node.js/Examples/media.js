//Array Globais

const notas = [10, 6.5, 8, 7.5]

//media soma simples

let media = (notas[0] + notas[1] + notas[2] + notas[3])/notas.length

console.log('Mádia soma simples: ' + media)


//media com for
let somaNotas = 0
for (let i = 0; i < notas.length; i++){
    somaNotas += notas[i];
}

let mediaFor = somaNotas/notas.length

console.log('Média com For: ' + mediaFor)

//media com forEach
let somaNotasFE = 0
notas.forEach( nota => {
    somaNotasFE += nota
})

let mediaFE = somaNotasFE/notas.length

console.log('Média com ForEach: ' + mediaFE)