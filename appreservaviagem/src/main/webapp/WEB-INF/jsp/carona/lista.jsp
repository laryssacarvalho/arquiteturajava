<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Listagem de caronas</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>	
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
	  <h3>Caronas</h3>
	  <h4><a href="/carona">Nova carona</a></h4>
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