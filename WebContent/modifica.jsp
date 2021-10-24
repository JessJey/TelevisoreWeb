<%@page import="it.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(request.getAttribute("messaggioDiErrore") != null){ %>
		<p style="color: red;"><%=request.getAttribute("messaggioDiErrore") %></p>
	<%  }else{ %>
		Inserire dati da ricercare<br>
	<%}    %>

	<% Televisore televisoreDaServlet = (Televisore) request.getAttribute("televisoreDaInviareAPaginaDettalio"); %>

	<form action="ExecuteModificaServlet" method="post">
	
	<input type="hidden" name="id" value="<%=televisoreDaServlet.getId() %>">
		Nome :
		<input type="text" name="marcaTelevisore" value="<%=televisoreDaServlet.getMarca() %>">
		<br> Cognome :
		<input type="text" name="modelloTelevisore" value="<%=televisoreDaServlet.getModello() %>">
		<br> Prezzo :
		<input type="text" name="prezzoTelevisore" value="<%=televisoreDaServlet.getPrezzo() %>">
		<br> Numero Seriale :
		<input type="text" name="numeroSerialeTelevisore" value="<%=televisoreDaServlet.getNumeroSeriale() %>">
		
		<br> <br> <br> <br> <input type="submit" value="Esegui modifica"> 
		<a href="searchForm.jsp"> Search Page </a>
	</form>

</body>
</html>