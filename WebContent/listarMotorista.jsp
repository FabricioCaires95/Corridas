<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Motoristas Cadastrados </title>	
	<link href="DataTables/datatables.css" rel="stylesheet">
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">	
</head>
<body>

	<!-- Menu -->
	<c:import url="/menu.jsp"/>		

	<div class="container">
	
		<div class="row">
		
			<div class="col-lg-12">
				<hr>
					<h2> Motoristas Cadastrados </h2>
				
					<div class="clearfix"></div>
					<c:if test="${not empty sucesso }">
						<div class="alert alert-success" role="alert">${sucesso }</div>
					</c:if>
					
					
				<hr>
				
				<form method="GET" action="controller.do">
					<table id="list-cadastrados" class="table table-striped table-bordered table-hover" style="width: 100%;">
						<thead>
							<tr>
								<th> Identificação  </th>
								<th>Nome </th>
								<th>CPF </th>
								<th>Sexo </th>
								<th>Modelo do Veículo </th>
								<th>Status  </th>								
								<th>Nascimento </th>
								<th>Alterar Status </th>								
							</tr>						
						</thead>
						
						<tbody>
							<c:forEach var="motorista" items="${lista}">
								<tr data-href="controller.do?command=ListarMotorista">
									<td> ${motorista.getId() } </td>
									<td> ${motorista.getNome() }</td>
									<td> ${motorista.getCpf() }</td>
									<td> ${motorista.getSexo() }</td>
									<td> ${motorista.getModeloCarro() }</td>
									<td> ${motorista.getStatus() }</td>
									<td><fmt:formatDate value="${motorista.getNascimento() }" pattern="dd/MM/yyyy"/></td>				
									<td><a class="btn btn-warning btn-xs"  href="controller.do?command=EditarMotorista&id=${motorista.getId()}&status=${motorista.getStatus()}">Alterar Status</a>	</td>
									
									</c:forEach>	
											
						</tbody>				
					</table>											
				</form>				
			</div>		
		</div>
			
	</div>

	<!-- Footer  -->
	<c:import url="footer.jsp"/>


	<!-- Scripts -->
	
	<script src="js/jquery.js"></script>
	<script src="popper/popper.js"></script>	
	<script src="js/bootstrap.js"></script>
	<script src="DataTables/datatables.js"></script>
	<script src="DataTables/sorting/date-euro.js"></script>
	<script src="js/table.js"></script>
	


</body>
</html>