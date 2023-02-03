package contas

type ContaCorrente struct {
	Titular    string
	NumAgencia int
	NumConta   int
	Saldo      float64
}

func (c *ContaCorrente) Sacar(valorSaque float64) string {
	saqueTrue := valorSaque > 0 && valorSaque <= c.Saldo
	if saqueTrue {
		c.Saldo -= valorSaque
		return "Saque realizado"
	} else {
		return "Saldo insuficiente"
	}
}

func (c *ContaCorrente) Depositar(valorDeposito float64) (string, float64) {
	if valorDeposito > 0 {
		c.Saldo += valorDeposito
		return "Deposito efetuado", c.Saldo
	} else {
		return "Falha", c.Saldo
	}
}

func (c *ContaCorrente) Transferir(valorTransferir float64, contaDestino *ContaCorrente) bool {
	if valorTransferir < c.Saldo && valorTransferir > 0 {
		c.Saldo -= valorTransferir
		contaDestino.Depositar(valorTransferir)
		return true
	} else {
		return false
	}
}
