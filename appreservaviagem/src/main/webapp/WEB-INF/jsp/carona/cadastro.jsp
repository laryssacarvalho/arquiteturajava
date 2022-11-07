<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de caronas</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h2>Carona</h2>	
		<form action="/carona/incluir" method="post">
			<c:import url="/WEB-INF/jsp/passagem/cadastro.jsp" />
			<div class="form-group">
				<label>Marca:</label>
				<input type="text" class="form-control" name="marca">
			</div>
			<div class="form-group">
				<label>Modelo:</label>
				<input type="text" class="form-control" name="modelo">
			</div>
			<div class="form-group">
				<label>Placa:</label>
				<input type="text" class="form-control" name="placa">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>