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
			<h1>Confirmar Exclusão</h1>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<form class="navbar-form"
						action="<%=request.getContextPath()%>/enderecos/excluir?cod=${x.codEndereco}">
						<button type="submit" class="btn btn-danger">Excluir</button>
					</form>
					<a href="<%=request.getContextPath()%>/manter/enderecos"
						class="btn btn-default">Voltar</a>
				</div>
			</div>

		</div>
		</div>

		<jsp:include page="/resources/templates/rodape.jsp"></jsp:include>

		<!-- Core JS -->
		<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
		<script
			src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</body>
</html>