<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/style.css">
	<title>Página não encontrada </title>
</head>
<body>

	<c:import url="menu.jsp"/>
	
	<div class="container">
	
		<div class="row">
		
				
			<div class="alert alert-danger" role="alert">
				  <h4 class="alert-heading"> Página não encontrada !</h4>
				  <p>A página que você solicitou não existe ou está em manutenção ! </p>
				  <hr>
				  <p class="mb-0"> Em caso de dúvidas envie um e-mail para:adm@admsys.com </p>				
			</div>
			  <a href="index.jsp" class="btn btn-primary"> Voltar a Página inicial </a>		
			
		
		
		</div>
	
	
	
	</div>


</body>
</html>