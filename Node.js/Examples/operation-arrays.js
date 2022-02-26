//concat

const concat_um = [10, 20, 30]
const concat_dois = [40, 50, 60]

let group = concat_um.concat(concat_dois)

console.log(`concatenação: ${group}`)

//filter

function valMenorDez(valores){
    return valores < 10;
}

const valores_um = [1, 1, 2, 3, 5, 8, 13, 21, 34]

let valores_filtrados = valores_um.filter(valMenorDez)

console.log(`filtro < 10 : ${valores_filtrados}`)

//find
const valor = [0, 5, 10, 20, 30]
const valDez = valores => valores > 10

let valorMaiorDez = valor.find(element => element > 10)

console.log(`find primeiro valor > 10 : ${valorMaiorDez}`)


//reverse

const numbers = [10, 20, 30]

let contrario = numbers.reverse();

console.log(`reverse: ${contrario}`)

//Push and Pop

jantarDeHoje = ['🍔', '🌭', '🍕']

jantarDeHoje.pop() //remover o ultimo
jantarDeHoje.pop() // remove o antipenultimo
//add
jantarDeHoje.push('🍳') 
jantarDeHoje.push('🥗') 
jantarDeHoje.push('🍏')

console.log(`retirando(pop) add(push): ${jantarDeHoje}`)

//Slice
               //0       1
const nomes = ['João', 'Juliana', 'Ana', 'Caio', 'Lara', 'Marjorie', 'Guilherme', 
'Aline', 'Fabiana', 'Andre', 'Carlos', 'Paulo', 'Bia', 'Vivian', 'Isabela', 'Vinícius', 
'Renan', 'Renata', 'Daisy', 'Camilo']

                        //0, 10
const sala1 = nomes.slice(0,nomes.length/2)
                        //10
const sala2 = nomes.slice(nomes.length/2)

console.log(`Alunos da sala 1: ${sala1}`)
console.log(`Alunos da sala 2: ${sala2}`)

// Splice

const listaDeChamada = ['João', 'Ana', 'Caio', 'Lara', 'Marjorie', 'Leo']

listaDeChamada.splice(1,2,'Rodrigo')

console.log(`Lista de chamada: ${listaDeChamada}`)

//Splice2
animaisDoAquario = ['🐋', '🐙', '🐬', '🦈']

animaisDoAquario.splice(1,0,'🐠') //inicia da posição 1, nao remove nada (0), add peixe amarelo na posição 2
animaisDoAquario.splice(3,2,'🐟') //iniciar da posição 3, remove 2 (posição 3 e 4), add o peixe azul na posição 3

console.log(`splice no aquario: ${animaisDoAquario}`)