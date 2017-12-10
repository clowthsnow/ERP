<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuevo Art&iacute;culo</title>
</head>
<body>

	<form:form modelAttribute="articuloForm" method="POST" enctype="multipart/form-data">
		<table style="text-align: left;">
			<tr>
				<td>Codigo</td>
				<td><form:input path="codigo" /></td>
			</tr>
			<tr>
				<td>Descripcion</td>
				<td><form:input path="descripcion" /></td>
			</tr>
			<tr>
				<td>Stock</td>
				<td><form:input path="stock" /></td>
			</tr>
			<tr>
				<td>Precio</td>
				<td><form:input path="precio" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Guardar" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>