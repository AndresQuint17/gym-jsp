<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/estiloGeneral.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/estiloInfoSede.css">
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
					<a href="${pageContext.request.contextPath}/registroUsuario">REGISTRO</a>
				</li>
			</ul>
		</header>
		
		<div class="division1">
			<div class="divP1">
				${datosSede}
				<br/>
				${datosSede.idSede}
				<br/>
				${datosSede.nombre}
				<br/>
				${datosSede.direccion}
				<br/>
				${datosSede.phone}
				<br/>
				${datosSede.email}
			</div>
		</div>
		
		<footer>
			pie de pagina
		</footer>
	</body>
</html>