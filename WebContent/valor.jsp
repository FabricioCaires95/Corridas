<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/style.css">
	<title>Cadastro Corrida | Selecione o valor </title>
</head>
<body>

	<!-- Menu  -->
	<c:import url="menu.jsp"/>

	<div class="container">
	
		<div class="row">
		
			<h3> Passo 3 - Inforne o Valor da Corrida </h3>
		
			<div class="col-lg-12">
			<form action="controller.do" method="POST">
			
				<input type="hidden" name="pagina" value="3">
				
				<label> Valor da Corrida </label>
				<input type="text" class="form-control" name="preco" placeholder="Informe o Valor da Corrida ">
				
				<button type="submit" class="btn btn-default" name="command" value="CadastrarCorrida"> Enviar </button>
			
			</form>
			</div>
		</div>	
	
	
	
	
	
	</div>


</body>
</html>