<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de passagens de ônibus</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">	
		<h2>Passagem de ônibus</h2>
		<form action="/onibus/incluir" method="post">
			<c:import url="/WEB-INF/jsp/passagem/cadastro.jsp" />
			<div class="form-group">
				<label>Linha:</label>
				<input type="text" class="form-control" name="linha">
			</div>
			<div class="form-group">
				<label>Plataforma:</label>
				<input type="text" class="form-control" name="plataforma">
			</div>
			<div class="form-group">
				<label>Poltrona:</label>
				<input type="text" class="form-control" name="poltrona">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>