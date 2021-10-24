<%@page import="it.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rimuovi Abitante</title>
</head>
<body>


	<% Televisore televisoreDaServlet = (Televisore) request.getAttribute("televisoreDaInviareAPaginaDettalio"); %>

	<form action="ExecuteRimuoviTelevisore" method="post">
	
	<input type="hidden" name="id" value="<%=televisoreDaServlet.getId() %>">
		Marca :
		<%=televisoreDaServlet.getMarca()%>
		<br> Modello :
		<%=televisoreDaServlet.getModello()%>
		<br> Prezzo :
		<%=televisoreDaServlet.getPrezzo()%>
		<br> Numero Seriale :
		<%=televisoreDaServlet.getNumeroSeriale()%>
		
		
		Se sei sicuro premi OK CANCELLA
		<br> <br> <br> <br> <input type="submit" value="OK CANCELLA"> <a href="searchForm.jsp"> Search
			Page </a>
	</form>
</body>
</html>