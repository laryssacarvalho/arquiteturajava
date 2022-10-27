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
	        <th>Vôo</th>
	        <th>Portão</th>
	        <th>Assento</th>
	      </tr>
	    </thead>
	    <tbody>
			<c:forEach var="aviao" items="${listagem}">	  		
				<tr>
			        <td>${aviao.voo}</td>
			        <td>${aviao.portao}</td>
			        <td>${aviao.assento}</td>
	      		</tr>
		  	</c:forEach>
	    </tbody>
	  </table>	  
	</div>	
</body>
</html>