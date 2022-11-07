<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Listagem de passagens de ônibus</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>	
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
	  <h3>Passagens de ônibus</h3>
	  <h4><a href="/onibus">Nova passagem de ônibus</a></h4>
	  <table class="table table-striped">
		<thead>
	      <tr>
	      	<th>ID</th>
	        <th>Linha</th>
	        <th>Plataforma</th>
	        <th>Poltrona</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
			<c:forEach var="o" items="${listagem}">	  		
				<tr>
					<td>${o.id}</td>
			        <td>${o.linha}</td>
			        <td>${o.plataforma}</td>
			        <td>${o.poltrona}</td>
			        <td><a href="/onibus/${o.id}/excluir">Excluir</a></td>
	      		</tr>
		  	</c:forEach>
	    </tbody>
	  </table>	  
	</div>	
</body>
</html>