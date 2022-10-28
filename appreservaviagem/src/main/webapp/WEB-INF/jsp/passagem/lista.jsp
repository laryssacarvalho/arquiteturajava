<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastramento de passagem</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">	
</head>
<body>
	<div class="container mt-3">
	  <h3>Passagens</h3>
	  
	  <table class="table table-striped">
		<thead>
	      <tr>
	        <th>Origem</th>
	        <th>Destino</th>
	        <th>Data</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
			<c:forEach var="p" items="${listagem}">	  		
				<tr>
			        <td>${p.origem}</td>
			        <td>${p.destino}</td>
			        <td>${p.data}</td>
			        <td><a href="/passagem/${p.id}/excluir">Excluir</a></td>
	      		</tr>
		  	</c:forEach>
	    </tbody>
	  </table>	  
	</div>	
</body>
</html>