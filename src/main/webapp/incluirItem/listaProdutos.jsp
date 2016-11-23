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

<input id="demo1" type="text" value="55" name="demo1">
	<jsp:include page="/resources/templates/navbar.jsp" />

    <!-- Begin page content -->
    <div class="container">
      <div class="page-header">
        <h1>Lista de Produtos</h1>
      </div>
		<div class="row">
		</div>
		<table class="table">

			<thead>
			
				<tr>
					<th>Codigo</th>
					<th>Nome</th>
					<th>Pre�o</th>
					<th>Quantidade</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${produto}" var="x">
					<tr>
						<td>${x.codProduto}</td>
						<td>${x.nome}</td>
						<td>${x.preco}</td>
						<td><script>
						   $("input[name='demo1']").TouchSpin({
				                min: 0,
				                max: 100,
				                step: 0.1,
				                decimals: 2,
				                boostat: 5,
				                maxboostedstep: 10,
				                postfix: '%'
				            });
				        </script></td>
	
						
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