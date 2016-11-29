<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Entregas</title>
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css"
	rel="stylesheet">
</head>

<body>

	<jsp:include page="/resources/templates/navbar.jsp" />

	<!-- Begin page content -->
	<div class="container">
		<div class="page-header">
			<h1>Detalhes do Item</h1>
		</div>

		<div>
			<ul class="list-group">
				<li class="list-group-item">C�digo: ${x.codItemEntregue}</li>
				<li class="list-group-item">Quantidade: ${x.quantidade}</li>
				<li class="list-group-item">Pre�o: ${x.preco}</li>
				<li class="list-group-item">Sub Total do Item: ${x.subTotalDoItem}</li>
			</ul>
		</div>
	</div>

	<div class="container">
		<div class="page-header">
			<h2>Detalhes da Entrega</h2>
		</div>

		<div>
			<table class="table">
			<thead>
				<tr>
					<th>Codigo</th>
					<th>Data</th>
					<th>Valor Total</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${entrega.itens}" var="x">
					<tr>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>

	<jsp:include page="/resources/templates/rodape.jsp"></jsp:include>

	<!-- Core JS -->
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</body>
</html>