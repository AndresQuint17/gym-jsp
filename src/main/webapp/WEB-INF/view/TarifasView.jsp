<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>MY GYM</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/estiloGeneral.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/estiloTarifas.css">
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
					Tarifas
				</h1>
				
				<div class="divCardUp">
					<div class="tarjeta">
						<div class="titulo">TARIFA MENSUAL</div>
						<div class="cuerpo">
							<img alt="aquí va una imagen" src="${pageContext.request.contextPath}/resources/img/fondoGym.jpg">
						</div>
						<div class="pie"></div>
					</div>
				</div>
			
				<div class="divCardDown">
					<div class="tarjeta">
						<div class="titulo">TARIFA DIARIO</div>
						<div class="cuerpo">
							lorem ipsum
						</div>
						<div class="pie"></div>
					</div>
					
					<div class="tarjeta">
						<div class="titulo">TARIFA SEMANAL</div>
						<div class="cuerpo">
							lorem ipsum
						</div>
						<div class="pie"></div>
					</div>
					
					<div class="tarjeta">
						<div class="titulo">TARIFA ANUAL</div>
						<div class="cuerpo">
							lorem ipsum
						</div>
						<div class="pie"></div>
					</div>
				</div>
			</div>
		</div>
		
		<footer>
			pie de página
		</footer>
	</body>
</html>