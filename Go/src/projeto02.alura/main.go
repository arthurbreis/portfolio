package main

import (
	"fmt"
	"strconv"

	"projeto02.alura/contas"
)

func main() {

	conta01 := contas.ContaCorrente{"Arthur", 589, 123456, 100.0}
	conta02 := contas.ContaCorrente{"Leticia", 0, 0, 100.0}

	fmt.Println(conta01)
	fmt.Println(conta02)

	fmt.Println(conta02.Sacar(10.))
	fmt.Println("Saldo atual: ", strconv.FormatFloat(conta02.Saldo, 'f', 2, 64))

	transferencia := contas.conta01.Transferir(50, contas.conta02)
	fmt.Println(transferencia)
	fmt.Println(conta01, conta02)
}
