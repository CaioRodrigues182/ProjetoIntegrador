<!-- Fixed navbar -->
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="<%=request.getContextPath()%>/">Sistema
				de Entregas</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li><a href="<%=request.getContextPath()%>/manter/enderecos">Endere�os
						de Clientes</a></li>
				<li><a href="<%=request.getContextPath()%>/produtos/manter">Pesquisar
						Produtos</a></li>
				<li><a href="<%=request.getContextPath()%>/clientes/listar">Inserir Itens na
						Entregas</a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>