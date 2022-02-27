const alunos = ['João', 'Juliana', 'Caio', 'Ana']
const mediaAlunos = [10, 7, 9, 6]

let listaNotasAlunos = [alunos, mediaAlunos]

const exibeNomeNotas = (nomeAluno) => {
    if(listaNotasAlunos[0].includes(nomeAluno)){
        let indice = listaNotasAlunos[0].indexOf (nomeAluno)

        return listaNotasAlunos[0][indice] + ' - média: ' + listaNotasAlunos[1][indice]

    }else{
        return "Not found"
    }
}
console.log(exibeNomeNotas("Ana"))
