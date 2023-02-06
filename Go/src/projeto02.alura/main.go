package main

import (
	"fmt"
	"strconv"

	c "projeto02.alura/cliente"
	cc "projeto02.alura/contas"
	p "projeto02.alura/pagamento"
)

func main() {

	conta01 := cc.ContaCorrente{Titular: c.Titular{
		Nome: "Arthur",
		CPF:  "999.999.999-95"},
		NumAgencia: 589, NumConta: 123456, Saldo: 100.0}

	conta02 := cc.ContaCorrente{Titular: c.Titular{
		Nome: "Leticia",
		CPF:  "888.888.888-88"},
		NumAgencia: 0, NumConta: 0, Saldo: 100.0}

	conta03 := cc.ContaPoupanca{Titular: c.Titular{
		Nome: "Lulu",
		CPF:  "888.888.888-88"},
		NumAgencia: 0, NumConta: 0, Saldo: 200.0}

	fmt.Println(conta01)
	fmt.Println(conta02)
	fmt.Println(conta03)

	fmt.Println(conta02.Sacar(10.))
	fmt.Println("Saldo atual: ", strconv.FormatFloat(conta02.Saldo, 'f', 2, 64))

	transferencia := conta01.Transferir(50, &conta02)
	fmt.Println(transferencia)
	fmt.Println(conta01, conta02)

	p.PagarBoleto(&conta03, 150)
	fmt.Println(conta03)
}
