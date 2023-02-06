package contas

import "projeto02.alura/cliente"

type ContaPoupanca struct {
	Titular    cliente.Titular
	NumAgencia int
	NumConta   int
	Saldo      float64
}

func (c *ContaPoupanca) Sacar(valorSaque float64) string {
	saqueTrue := valorSaque > 0 && valorSaque <= c.Saldo
	if saqueTrue {
		c.Saldo -= valorSaque
		return "Saque realizado"
	} else {
		return "Saldo insuficiente"
	}
}

func (c *ContaPoupanca) Depositar(valorDeposito float64) (string, float64) {
	if valorDeposito > 0 {
		c.Saldo += valorDeposito
		return "Deposito efetuado", c.Saldo
	} else {
		return "Falha", c.Saldo
	}
}

func (c *ContaPoupanca) Transferir(valorTransferir float64, contaDestino *ContaPoupanca) bool {
	if valorTransferir < c.Saldo && valorTransferir > 0 {
		c.Saldo -= valorTransferir
		contaDestino.Depositar(valorTransferir)
		return true
	} else {
		return false
	}
}
