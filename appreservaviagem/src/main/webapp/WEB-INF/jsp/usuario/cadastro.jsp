<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastramento de usuários</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	</head>
	<body>
		<c:import url="/WEB-INF/jsp/menu.jsp" />
		<div class="container mt-3">	
			<form action="/cep" class="form-inline" method="post">
			    <div class="form-group">
			      <label>CEP:</label>
			      <input type="text" class="form-control" placeholder="Entre com o seu CEP" name="cep">
			    </div>
	    		<button type="submit" class="btn btn-default">Buscar</button>
			</form>
			<h2>Usuário</h2>
			<form action="/usuario/incluir" method="post">
				<div class="form-group">
					<label>Nome:</label>
					<input type="text" class="form-control" name="nome">
				</div>
				<div class="form-group">
					<label>Email:</label>
					<input type="email" class="form-control" name="email">
				</div>
				<div class="form-group">
					<label>Senha:</label>
					<input type="password" class="form-control" name="senha">
				</div>
				<c:import url="/WEB-INF/jsp/endereco.jsp" />
				<button type="submit" class="btn btn-primary">Cadastrar</button>
			</form>
		</div>
	</body>
</html>