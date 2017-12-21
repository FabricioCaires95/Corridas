<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>	
	
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/style.css">
	<title> Sistema de Corridas  </title>
</head>
<body>
	
	<!-- Menu  -->
	<c:import url="menu.jsp"/>

	<div id="main" class="container"> 

		<div class="row"> 
		
			<hr>
				<div class="clearfix"></div>
						<c:if test="${not empty sucesso }">
							<div class="alert alert-success" role="alert">${sucesso }</div>
				</c:if>
			
			</hr>
		
		
			<h2 class="page-header"> Bem vindo ao Nosso sistema de Corridas </h2>
		</div>

		<div class="row">
			
			<div class="content"> 
				
				<a class="btn btn-success" href="passageiro.jsp"> Cadastrar Passageiro </a>
				<a class="btn btn-success" href="motorista.jsp"> Cadastrar Motorista </a>
				<a class="btn btn-success" href="corrida.jsp"> Cadastrar Corrida </a>
			</div>

		</div>
	
	<!-- Footer  -->
	<c:import url="footer.jsp"/>
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.js"></script>

</body>
</html>