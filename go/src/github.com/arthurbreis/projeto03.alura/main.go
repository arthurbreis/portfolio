package main

import (
	"html/template"
	"net/http"

	_ "github.com/lib/pq"
)

var templates = template.Must(template.ParseGlob("templates/*.html"))

func main() {
	http.HandleFunc("/", index)
	http.ListenAndServe(":8000", nil)
}

func index(w http.ResponseWriter, r *http.Request) {
	produtos := []Produto{
		{"Camiseta", "Azul, bem bonita", 39, 5},
		{"Tenis", "Confortável", 89, 3},
		{"Fone", "Muito bom", 59, 2},
		{"Produto novo", "Muito legal", 1.99, 1},
	}

	templates.ExecuteTemplate(w, "Index", produtos)
}

type Produto struct {
	Nome, Descricao string
	Preco           float64
	Quantidade      int
}
