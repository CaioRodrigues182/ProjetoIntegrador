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
			<h1>Inserir Produtos</h1>
		</div>

		<form method="get" name="myform" class="form-horizontal"
			action="<%=request.getContextPath()%>/filme/resultado">

			<div class="form-group">
				<label class="col-sm-2 control-label" for="artista">Selecione
					o Produto:</label>
				<div class="col-sm-5">
					<select name="codArtista" class="form-control">
						<option value="">-- Selecione o produto--</option>
						<c:forEach items="${produto}" var="x">
							<option value="${x.codProduto}" <c:if test="${x == produtoSelecionado}">selected="selected"</c:if>>
								${x.nome}   
							</option>
						</c:forEach>
					</select>
				</div>
			</div>
			

			<div class="form-group">
				<label class="col-sm-2 control-label" for="anoMin">Quantidade:</label>
				<div class="col-sm-5">
					<input type="number" name="quantidade" id="quantidade"
						value="" required="required"
						class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-primary">Inserir</button>
					<a href="<%=request.getContextPath()%>"
						class="btn btn-default">Voltar</a>
				</div>
			</div>
		</form>
	</div>

	<jsp:include page="/resources/templates/rodape.jsp"></jsp:include>

	<!-- Core JS -->
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</body>
</html>