<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Listagem de reservas</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>	
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
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
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
			<c:forEach var="r" items="${listagem}">	  		
				<tr>
			        <td>${r.codigo}</td>
			        <td>${r.data}</td>
			        <td>${r.viajante}</td>
			        <td>${r.passagens.size()}</td>
			        <td>${r.total}</td>
			        <td><a href="/reserva/${r.id}/excluir">Excluir</a></td>
	      		</tr>
		  	</c:forEach>
	    </tbody>
	  </table>	  
	</div>	
</body>
</html>