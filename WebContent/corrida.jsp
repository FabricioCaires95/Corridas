<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/style.css">
	<title>Cadastro Corridas</title>
</head>
<body>
	<!-- Menu  -->
	<c:import url="menu.jsp"/>
	
	<div class="container">
		
		<div class="row">
			<h2 class="page-header"> Cadastro de Corrida </h2>
			
			<h3> Passo 1: Selecione o Passageiro </h3>		
		</div>
	
		<div class="row">
		
			<div class="col-lg-12">
			
				<form method="GET" action="controller.do" >
					
					<table id="list-cadastrados" class="table table-striped table-bordered table-hover" style="width: 100%;">
						
						<thead>
							<tr>
								<th> Identificação  </th>
								<th> Nome </th>
								<th> Selecionar </th>
								
							</tr>						
						</thead>
						
						<tbody>
							<c:forEach var="passageiro" items="${lista}">
								<tr data-href="controller.do?command=CorridaListar">
									<td> ${passageiro.getId() } </td>
									<td> ${passageiro.getNome() }</td>	
									<td><a class="btn btn-success" href="controller.do?command=GuardarDado&id=${passageiro.id }&pagina=1"> Selecionar</a> </td>	
														 
							</c:forEach>						
						</tbody>				
					</table>	
															
				</form>	
							
			</div>		
		</div>	
	</div>
	
	<!-- Footer  -->
	<c:import url="footer.jsp"/>
	
	<script src="js/jquery.js"></script>
	<script src="popper/popper.js"></script>	
	<script src="js/bootstrap.js"></script>
	<script src="DataTables/datatables.js"></script>
	<script src="DataTables/sorting/date-euro.js"></script>
	<script src="js/table.js"></script>
	
</body>
</html>