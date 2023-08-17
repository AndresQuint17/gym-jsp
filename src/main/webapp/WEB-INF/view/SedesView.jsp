<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/styles/estiloGeneral.css"/>">
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/styles/estiloSedes.css"/>">
	</head>
	<body>
		<header>
			<ul>
				<li>
					<a href="${pageContext.request.contextPath}/principal">GYM</a>
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
			<div class="divP1">
				<h1>
					Sedes Principales
				</h1>
				
				<p>
					Primera sede de la tabla es: ${listaSedes.get(0).getNombre()}
				</p>
				<table class="tablaSedes">
					<tr>
						<th>Nombre</th>
						<th>Dirección</th>
						<th>Teléfono</th>
						<th>Correo</th>
					</tr>
					<c:forEach var="sedeTemp" items="${listaSedes}">
						<!-- Link para actualizar registro -->
						<c:url var="linkMasDatos" value="infoSede">
							<c:param name="idSede" value="${sedeTemp.idSede}"></c:param>
						</c:url>
						<tr>
							<td>${sedeTemp.nombre}</td>
							<td>${sedeTemp.direccion}</td>
							<td>${sedeTemp.phone}</td>
							<td>${sedeTemp.email}</td>
							<td><a href="${linkMasDatos}"> <input type="button" value="mas info"/></a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		
		<footer>
			pie de página
		</footer>
		
	</body>
</html>