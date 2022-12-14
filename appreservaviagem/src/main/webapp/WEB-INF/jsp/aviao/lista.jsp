<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Listagem de passagens de avião</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>	
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
	  <h3>Passagens de avião</h3>
	  <h4><a href="/aviao">Nova passagem de avião</a></h4>
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