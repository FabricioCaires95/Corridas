<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Motorista - Cadastro </title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/style.css">

</head>
<body>

	<!-- Menu  -->
	<c:import url="menu.jsp"/>
	
	<div class="container" id="main">
			
		<h2 class="page-header"> Cadastre um Motorista </h2>
		
		<form name="formMotorista" action="controller.do" method="POST">
		
		<div class="row">
			<div class="form-group col-md-12">
				<label for="nome"> Nome </label>
				<input type="text" class="form-control" id="nome" name="nome" placeholder="Informe o nome Completo" maxlength="150" required >
			</div>		
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label for="cpf"> CPF </label>
				<input type="text" class="form-control" id="cpf" name="cpf"  placeholder="Informe o CPF"  required data-mask="999.999.999-99" required="required">
			</div>		
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<input type="radio" name="sexo" value="M" checked> Masculino
				<input type="radio" name="sexo" value="F"> Feminino
			</div>		
		</div>
		
		
		<div class="row">
			<div class="form-group col-md-12">
				<label for="modelo"> Modelo do veículo </label>
				<input type="text" class="form-control" id="modelo" name="modelo" placeholder="Informe o modelo e fabricante do Veículo" maxlength="150" required>
			</div>		
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<input type="radio" name="status" value="ativo" checked> Ativo
				<input type="radio" name="status" value="inativo"> Inativo
			</div>		
		</div>
		
		
		<div class="row">
			<div class="form-group col-md-6">
				<label for="nascimento"> Data de Nascimento </label>
				<input type="date" class="form-control" id="nascimento" name="nascimento" required>
			</div>		
		</div>		
		
		
		<div class="row">
			<div class="form-group col-md-6">
				<button type="submit" name="command" value="CadastrarMotorista" class="btn btn-primary"> Cadastrar </button>
				<button type="reset" class="btn btn-primary"> Limpar </button>
			</div>					
		</div>	
		
		</form>
	
	</div>
	
	<!-- Footer  -->
	<c:import url="footer.jsp"/>

	<!-- Scripts -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/inputmask-plugin.js"></script>
</body>
</html>