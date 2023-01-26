package main

import "fmt"

type ContaCorrente struct {
	titular    string
	numAgencia int
	numConta   int
	saldo      float64
}

func main() {

	conta01 := ContaCorrente{"Arthur", 589, 123456, 15000.5}
	fmt.Println(conta01)
}
