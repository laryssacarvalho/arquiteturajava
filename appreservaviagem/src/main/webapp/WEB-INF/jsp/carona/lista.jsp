<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastramento de carona</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">	
</head>
<body>
	<div class="container mt-3">
	  <h3>Caronas</h3>
	  
	  <table class="table table-striped">
		<thead>
	      <tr>
	      	<th>ID</th>
	        <th>Marca</th>
	        <th>Modelo</th>
	        <th>Placa</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
			<c:forEach var="c" items="${listagem}">	  		
				<tr>
					<td>${c.id}</td>
			        <td>${c.marca}</td>
			        <td>${c.modelo}</td>
			        <td>${c.placa}</td>
			        <td><a href="/carona/${c.id}/excluir">Excluir</a></td>
	      		</tr>
		  	</c:forEach>
	    </tbody>
	  </table>	  
	</div>	
</body>
</html>