package models

import db "github.com/arthurbreis/projeto03.alura/db"

type Produto struct {
	Nome, Descricao string
	Preco           float64
	Quantidade, Id  int
}

func BuscaProdutos() []Produto {
	db := db.ConectaBd()

	selectAll, err := db.Query("select * from produtos")
	if err != nil {
		panic(err.Error())
	}

	p := Produto{}
	produtos := []Produto{}

	for selectAll.Next() {
		var id, quantidade int
		var nome, descricao string
		var preco float64

		err = selectAll.Scan(&id, &nome, &descricao, &preco, &quantidade)
		if err != nil {
			panic(err.Error())
		}
		p.Id = id
		p.Nome = nome
		p.Descricao = descricao
		p.Preco = preco
		p.Quantidade = quantidade

		produtos = append(produtos, p)

	}

	defer db.Close()
	return produtos
}

func CriaProduto(nome, descricao string, preco float64, quantidade int) {
	db := db.ConectaBd()

	insereDadosNoBanco, err := db.Prepare("insert into produtos(nome, descricao, preco, quantidade) values($1, $2, $3, $4)")
	if err != nil {
		panic(err.Error())
	}

	insereDadosNoBanco.Exec(nome, descricao, preco, quantidade)
	defer db.Close()

}

func DeletaProduto(id string) {
	db := db.ConectaBd()

	deletarOProduto, err := db.Prepare("delete from produtos where id=$1")
	if err != nil {
		panic(err.Error())
	}

	deletarOProduto.Exec(id)
	defer db.Close()

}
