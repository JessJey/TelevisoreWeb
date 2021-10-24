<%@page import="it.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dettaglio abitante</title>
</head>
<body>


		<% Televisore televisoreDaServlet = (Televisore) request.getAttribute("televisoreDaInviareAPaginaDettalio"); %>
		
		Marca : <%= televisoreDaServlet.getMarca()%>
		<br>
		Modello : <%= televisoreDaServlet.getModello()%>
		<br>
		Numero Seriale : <%= televisoreDaServlet.getNumeroSeriale() %>
		<br>
		Prezzo : <%= televisoreDaServlet.getPrezzo() %>
		
		<br>
		<br>
		<br>
		<br>
		<a href="searchForm.jsp"> Search Page </a>
</body>
</html>