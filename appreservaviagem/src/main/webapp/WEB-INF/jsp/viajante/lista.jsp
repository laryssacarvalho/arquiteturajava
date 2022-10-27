<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastramento de viajantes</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">	
</head>
<body>
	<div class="container mt-3">
	  <h3>Viajantes</h3>
	  
	  <table class="table table-striped">
		<thead>
	      <tr>
	        <th>Nome</th>
	        <th>Documento</th>
	        <th>Data de Nascimento</th>
	      </tr>
	    </thead>
	    <tbody>
			<c:forEach var="viajante" items="${listagem}">	  		
				<tr>
			        <td>${viajante.nome}</td>
			        <td>${viajante.documento}</td>
			        <td>${viajante.dataNascimento}</td>
	      		</tr>
		  	</c:forEach>
	    </tbody>
	  </table>	  
	</div>	
</body>
</html>