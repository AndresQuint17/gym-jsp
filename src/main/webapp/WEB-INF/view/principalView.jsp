<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>MY GYM</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/estiloGeneral.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/miEstilo.css">
	</head>
	<body>
		<header>
			<ul>
				<li>
					<a href="">GYM</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath}/tarifas/tipoTarifas">TARIFAS</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath}/sedes/listaSedes">SEDES</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath}/clases/horarios">CLASES</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath}/registro/registroUsuario">REGISTRO</a>
				</li>
			</ul>
		</header>
		<div class="division1">
			<h1>
				My GYM
			</h1>
			
			<img alt="aquí va una imagen" src="resources/img/fondoGym.jpg">
			
			<p class="recuadro">
				Organiza las rutinas y enfoca tus objetivos!
			</p>
			
		</div>
		
		<footer>
			Este es el pie de página
		</footer>
	</body>
</html>