<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Cliente</title>
</head>
<body>
    <h1>Cadastro de Cliente</h1>
    <form action="CadastroClienteServlet" method="post">
        <label for="matricula">Matrícula:</label>
        <input type="number" name="matricula" required><br>
        <label for="nome">Nome:</label>
        <input type="text" name="nome" required><br>
        <label for="endereco">Endereço:</label>
        <input type="text" name="endereco" required><br>
        <label for="modalidade">Modalidade:</label>
        <input type="text" name="modalidade" required><br>
        <input type="submit" value="Cadastrar">
    </form>
</body>
</html>