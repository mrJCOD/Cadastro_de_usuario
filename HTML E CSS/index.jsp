<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novoUsuario" var="linkServletNovoUsuario"/>


<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Cadastro de Usuario</title>
</head>
<body>
<form action="${linkServletNovoUsuario}" method="post">

	<div>
		<h1>E2E TREINAMENTOS</h1>
		<label>Nome: </label><input id="nome"placeholder="Nome Completo">
	</div>
	<div>
		<label>Telefone: </label><input id="tel" placeholder="(11)11111-1111">
	</div>
	<div>
		<label>E-mail: </label><input id="email" placeholder="exemplo@exemplo.com">
	</div>
	<div>
	<label>Mensagem: </label>
	<textarea placeholder="Deixa aqui sua mensagem" id="mensagem"></textarea>
	</div>
	<div>
	<button id="send">Enviar</button>
	</div>
</form>
</body>
</html>