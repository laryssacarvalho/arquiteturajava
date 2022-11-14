<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastramento de reservas</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	</head>
	<body>
		<c:import url="/WEB-INF/jsp/menu.jsp" />
		<div class="container mt-3">
			<h2>Reserva</h2>
			<form action="/reserva/incluir" method="post">
				<div class="form-group">
					<label>Código:</label>
					<input type="text" class="form-control" name="codigo">
				</div>
				<div class="form-group">
					<label>Total:</label>
					<input type="text" class="form-control" name="total">
				</div>
				<div class="form-group">
					<label>Viajante:</label>
					<select name="viajante" class="form-control">
						<c:forEach var="v" items="${viajantes}">
							<option value="${v.id}">${v.nome}</option>
						</c:forEach>
					</select>
				</div>	
				<div class="form-group">
					<label>Passagens:</label>
					<c:forEach var="p" items="${passagens}">
						<div class="form-check">
							<input class="form-check-input" type="checkbox" name="passagens" value="${p.id}">
							<label class="form-check-label">Data: ${p.data} - Origem: ${p.origem} Destino: ${p.destino}</label>
						</div>
					</c:forEach>
				</div>
				<button type="submit" class="btn btn-primary">Cadastrar</button>
			</form>
		</div>
	</body>
</html>