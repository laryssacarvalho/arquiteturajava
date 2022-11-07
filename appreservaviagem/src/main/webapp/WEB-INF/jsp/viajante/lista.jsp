<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Listagem de viajantes</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>	
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
	  <h3>Viajantes</h3>
	  <h4><a href="/viajante">Novo viajante</a></h4>
	  
	  <table class="table table-striped">
		<thead>
	      <tr>
	        <th>Nome</th>
	        <th>Documento</th>
	        <th>Data de Nascimento</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
			<c:forEach var="v" items="${listagem}">	  		
				<tr>
			        <td>${v.nome}</td>
			        <td>${v.documento}</td>
			        <td>${v.dataNascimento}</td>
			        <td><a href="/viajante/${v.id}/excluir">Excluir</a></td>
	      		</tr>
		  	</c:forEach>
	    </tbody>
	  </table>	  
	</div>	
</body>
</html>