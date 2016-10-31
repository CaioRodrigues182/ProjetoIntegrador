<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Sistema de Filmes</title>
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css" rel="stylesheet">
  </head>

  <body>

	<jsp:include page="/resources/templates/navbar.jsp" />

    <!-- Begin page content -->
    <div class="container">
      <div class="page-header">
        <h1>Lista de Endere�os</h1>
      </div>
		<div class="row">
			<div class="col-sm-2">
				<form class="navbar-form" action="<%=request.getContextPath()%>/enderecos/novo">
				<button type="submit" class="btn btn-primary" >Inserir Novo</button>
				</form>
			</div>
		</div>
		<table class="table">

			<thead>
				<tr>
					<th>Logadouro</th>
					<th>Numero</th>
					<th>Complemento</th>
					<th>Bairro</th>
					<th>CEP</th>
					<th>A��o</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${enderecos}" var="x">
					<tr>
						<td>${x.logadouro}</td>
						<td>${x.numero}</td>
						<td>${x.complemento}</td>
						<td>${x.bairro}</td>
						<td>${x.cep}</td>
						<td><a href="<%=request.getContextPath()%>enderecos/editar?cod=${x.codEndereco}" class="btn btn-primary btn-xs">Editar</a>
						<a href="<%=request.getContextPath()%>/enderecos/remover?cod=${x.codEndereco}" class="btn btn-danger btn-xs">Excluir</a></td>
					</tr>

				</c:forEach>

			</tbody>

		</table>
		


    </div>

	<jsp:include page="/resources/templates/rodape.jsp"></jsp:include>

    <!-- Core JS -->
    <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
  </body>
</html>