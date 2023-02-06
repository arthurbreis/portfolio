package main

import (
	"fmt"
	"strconv"

	c "projeto02.alura/contas"
)

func main() {

	conta01 := c.ContaCorrente{Titular: "Arthur", NumAgencia: 589, NumConta: 123456, Saldo: 100.0}
	conta02 := c.ContaCorrente{Titular: "Leticia", NumAgencia: 0, NumConta: 0, Saldo: 100.0}

	fmt.Println(conta01)
	fmt.Println(conta02)

	fmt.Println(conta02.Sacar(10.))
	fmt.Println("Saldo atual: ", strconv.FormatFloat(conta02.Saldo, 'f', 2, 64))

	transferencia := conta01.Transferir(50, &conta02)
	fmt.Println(transferencia)
	fmt.Println(conta01, conta02)
}
