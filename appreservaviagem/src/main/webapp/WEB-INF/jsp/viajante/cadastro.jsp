<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de viajantes</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">	
		<h2>Viajante</h2>
		<form action="/viajante/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label>
				<input type="text" class="form-control" name="nome">
			</div>
			<div class="form-group">
				<label>Documento:</label>
				<input type="text" class="form-control" name="documento">
			</div>
			<div class="form-group">
				<label>Data de Nascimento:</label>
				<input type="date" class="form-control" name="dataNascimento">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>