<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastramento de reservas</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">	
</head>
<body>
	<div class="container mt-3">
	  <h3>Reservas</h3>
	  
	  <table class="table table-striped">
		<thead>
	      <tr>
	        <th>Código</th>
	        <th>Data</th>
	        <th>Viajante</th>
	        <th>Qtd Passagens</th>
	        <th>Total</th>
	      </tr>
	    </thead>
	    <tbody>
			<c:forEach var="reserva" items="${listagem}">	  		
				<tr>
			        <td>${reserva.codigo}</td>
			        <td>${reserva.data}</td>
			        <td>${reserva.viajante}</td>
			        <td>${reserva.passagens.size()}</td>
			        <td>${reserva.total}</td>
	      		</tr>
		  	</c:forEach>
	    </tbody>
	  </table>	  
	</div>	
</body>
</html>