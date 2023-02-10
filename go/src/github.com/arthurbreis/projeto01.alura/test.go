package main

import "fmt"

// HelloWorld greets the world.
func HelloWorld() string {
	return "Hello World!"
}
func main() {

	h := HelloWorld()
	fmt.Println(h)

}
