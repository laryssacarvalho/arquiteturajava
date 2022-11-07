<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">AppReservaViagem</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active">
      	<a href="#">Home</a>
      </li>
      <c:if test="${not empty user}">
	      <li class="nav-item">
	        <a class="nav-link" href="/usuario/lista">Usuário</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/reserva/lista">Reserva</a>
	      </li>
	      
	      <li class="nav-item">
	        <a class="nav-link" href="/viajante/lista">Viajante</a>
	      </li>
	      
	      <li class="nav-item">
	        <a class="nav-link" href="/passagem/lista">Passagem</a>
	      </li>
	      
	      <li class="nav-item">
	        <a class="nav-link" href="/onibus/lista">Ônibus</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/aviao/lista">Avião</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/carona/lista">Carona</a>
	      </li>
      </c:if>
    </ul>
    <ul class="nav navbar-nav navbar-right">
	    <c:if test="${empty user}">
	    	<li><a href="/usuario"><span class="glyphicon glyphicon-user"> Sign Up</span></a></li>
	    	<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	    </c:if>
	    <c:if test="${not empty user}">
	    	<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout ${user.nome}</a></li>
	    </c:if>	    	
    </ul>
  </div>
</nav>