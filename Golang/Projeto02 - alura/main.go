package main

import (
	"fmt"
)

type ContaCorrente struct {
	titular    string
	numAgencia int
	numConta   int
	saldo      float64
}

func (c *ContaCorrente) Sacar(valorSaque float64) string {
	saqueTrue := valorSaque > 0 && valorSaque <= c.saldo
	if saqueTrue {
		c.saldo -= valorSaque
		return "Saque realizado"
	} else {
		return "Saldo insuficiente"
	}
}

func (c *ContaCorrente) Depositar(valorDeposito float64) (string, float64) {
	if valorDeposito > 0 {
		c.saldo += valorDeposito
		return "Deposito efetuado", c.saldo
	} else {
		return "Falha", c.saldo
	}
}

func (c *ContaCorrente) Trasferir(valorTransferir float64, contaDestino *ContaCorrente) bool {
	if valorTransferir < c.saldo && valorTransferir > 0 {
		c.saldo -= valorTransferir
		contaDestino.Depositar(valorTransferir)
		return true
	} else {
		return false
	}
}
func main() {

	conta01 := ContaCorrente{"Arthur", 589, 123456, 100.}
	fmt.Println(conta01)

	var conta02 *ContaCorrente
	conta02 = new(ContaCorrente)
	conta02.titular = "Leticia"
	conta02.saldo = 100.

	fmt.Println(conta02)

	//fmt.Println(conta02.Sacar(10.))
	//fmt.Println("Saldo atual: ", strconv.FormatFloat(conta02.saldo, 'f', 2, 64))

	transferencia := conta01.Trasferir(50, conta02)
	fmt.Println(transferencia)
	fmt.Println(conta01, conta02)
}
