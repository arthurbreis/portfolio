<?php
echo "Testando conexao <br /> <br />";
$servername = "192.168.1.24";
$username = "phpuser";
$password = "pass";

// Create connection
$conn = new mysqli($servername, $username, $password);

// Check connection
if ($conn->connect_error) {
    die("Conexão falhou: " . $conn->connect_error);
}
echo "Connetado com sucesso";
?>
