<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Autenticação</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h2>Autenticação</h2>
		<form action="/login" method="post">

			<div class="form-group">
				<label>Email:</label>
				<input type="email" class="form-control" name="email">
			</div>
			<div class="form-group">
				<label>Senha:</label> 
				<input type="password" class="form-control" name="senha">
			</div>
			<button type="submit" class="btn btn-primary">Acessar</button>
		</form>
	</div>
</body>
</html>