<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastramento de passagem de avião</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">	
</head>
<body>
	<div class="container mt-3">
	  <h3>Passagens de avião</h3>
	  
	  <table class="table table-striped">
		<thead>
	      <tr>
	      	<th>ID</th>
	        <th>Vôo</th>
	        <th>Portão</th>
	        <th>Assento</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
			<c:forEach var="a" items="${listagem}">	  		
				<tr>
					<td>${a.id}</td>
			        <td>${a.voo}</td>
			        <td>${a.portao}</td>
			        <td>${a.assento}</td>
			        <td><a href="/aviao/${a.id}/excluir">Excluir</a></td>
	      		</tr>
		  	</c:forEach>
	    </tbody>
	  </table>	  
	</div>	
</body>
</html>