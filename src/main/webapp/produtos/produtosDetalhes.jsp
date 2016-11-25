<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Filmes</title>
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
			<h1>Detalhes do Produto</h1>
		</div>

		<div>
			<ul class="list-group">
				<li class="list-group-item">C�digo: ${item.codProduto}</li>
				<li class="list-group-item">Nome: ${item.nome}</li>
				<li class="list-group-item">Pre�o: ${item.preco}</li>
			</ul>
		</div>
	</div>

	<div class="container">
		<div class="page-header">
			<h2>Fornecedores</h2>
		</div>

		<div>
			<table class="table">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Fone</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${item.fornecedor}" var="x">
					<tr>
						<td>${x.nome}</td>
						<td>${x.fone}</td>
						<td>${x.email}</td>
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