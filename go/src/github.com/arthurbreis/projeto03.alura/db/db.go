package db

import (
	"database/sql"

	_ "github.com/lib/pq"
)

func ConectaBd() *sql.DB {
	conexao := "user=mypost dbname=postgres password=1921681254 host=localhost sslmode=disable"
	db, err := sql.Open("postgres", conexao)
	if err != nil {
		panic(err.Error())
	}
	return db
}
