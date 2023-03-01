package controllers

import (
	"html/template"
	"log"
	"net/http"
	"strconv"

	"github.com/arthurbreis/projeto03.alura/models"
)

var templates = template.Must(template.ParseGlob("templates/*.html"))

func Index(w http.ResponseWriter, r *http.Request) {
	TodosProdutos := models.BuscaProdutos()
	templates.ExecuteTemplate(w, "Index", TodosProdutos)
}

func New(w http.ResponseWriter, r *http.Request) {
	templates.ExecuteTemplate(w, "New", nil)
}

func Insert(w http.ResponseWriter, r *http.Request) {
	if r.Method == "POST" {
		nome := r.FormValue("nome")
		descricao := r.FormValue("descricao")
		preco := r.FormValue("preco")
		quantidade := r.FormValue("quantidade")

		precoFloat, err := strconv.ParseFloat(preco, 64)
		if err != nil {
			log.Println("Erro conversão preço", err)
		}

		quantidadeInt, err := strconv.Atoi(quantidade)
		if err != nil {
			log.Println("Erro conversão quantidade", err)
		}

		models.CriaProduto(nome, descricao, precoFloat, quantidadeInt)
	}
	http.Redirect(w, r, "/", 301)
}

func Delete(w http.ResponseWriter, r *http.Request) {
	idDoProduto := r.URL.Query().Get("id")
	models.DeletaProduto(idDoProduto)
	http.Redirect(w, r, "/", 301)
}
