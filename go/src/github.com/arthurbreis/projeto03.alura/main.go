package main

import (
	"net/http"

	"github.com/arthurbreis/projeto03.alura/routes"
)

func main() {
	routes.CarregaRotas()
	http.ListenAndServe(":8000", nil)
}
