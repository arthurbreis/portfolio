package main

import (
	"bufio"
	"fmt"
	"io"
	"io/ioutil"
	"net/http"
	"os"
	"strconv"
	"strings"
	"time"
)

const timetest = 5

func main() {

	inicio()

	for {
		exibeMenu()

		comando := capture()

		switch comando {
		case 1:
			monit()

		case 2:
			imprimeLogs()

		case 0:
			fmt.Println("saindo...")
			os.Exit(0)

		default:
			fmt.Println("Inválido")
			os.Exit(-1)
		}
	}

}

func inicio() {
	nome := "monitoramento"
	ver := 1.1
	fmt.Println(nome)
	fmt.Println(ver)
}

func exibeMenu() {
	fmt.Println("1 - iniciar")
	fmt.Println("2 - Exibir logs")
	fmt.Println("0 - Sair")
}

func capture() int {
	var captured int
	fmt.Scan(&captured)

	return captured
}

func monit() {
	fmt.Println("Monitorando...")
	sites := readSites()
	for i := 0; i < 5; i++ {
		for i, site := range sites {
			fmt.Println(i, "site: ", site)
			testaSite(site)
		}
		time.Sleep(timetest * time.Second)
	}
}

func testaSite(site string) {

	resp, err := http.Get(site)

	if err != nil {
		fmt.Println("Erro: ", err)
	}
	if resp.StatusCode == 200 {
		fmt.Println("OK!", resp.StatusCode)
		registraLog(site, true)
	} else {
		fmt.Println("Down", resp.StatusCode)
		registraLog(site, false)
	}
}

func readSites() []string {
	//cria slice string
	var sites []string

	//abre arquivo e verifica se existe
	arquivo, err := os.Open("sites.txt")
	if err != nil {
		fmt.Println("Erro: ", err)
	}
	//le a linha do arquivo
	leitor := bufio.NewReader(arquivo)

	//repete a leitura até final do arquivo
	for {
		linha, err := leitor.ReadString('\n') //lê até quebra de linha
		linha = strings.TrimSpace(linha)      //remove o /n
		sites = append(sites, linha)          //adiciona no slice
		if err == io.EOF {
			break
		}

	}
	arquivo.Close() //fecha arquivo
	return sites
}

func registraLog(site string, status bool) {

	arquivo, err := os.OpenFile("log.txt", os.O_RDWR|os.O_CREATE|os.O_APPEND, 0666)

	if err != nil {
		fmt.Println("Error: ", err)
	}

	arquivo.WriteString(time.Now().Format("02/01/2006 15:04:05") + "-" + site + " online " + strconv.FormatBool(status) + "\n")

	arquivo.Close()
}

func imprimeLogs() {

	arquivo, err := ioutil.ReadFile("log.txt")

	if err != nil {

		fmt.Println("Error: ", err)
	}

	fmt.Println(string(arquivo))
}
