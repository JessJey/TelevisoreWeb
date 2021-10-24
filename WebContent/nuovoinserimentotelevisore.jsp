<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserimento televisore</title>
</head>
<body>
Inserisci nuovo Televisore: 
<form action="ExecuteInserimentoTelevisore" method="post">
		<label for="marcaInputId">Marca: </label><br>
		<input type="text" name="marcaInput" id="marcaInputId">
		<br>
		<label for="modelloInputId">Modello: </label><br>
		<input type="text" name="modelloInput" id="modelloInputId">
		<br>
		<label for="prezzoInputId">Prezzo: </label><br>
		<input type="text" name="prezzoInput" id="prezzoInputId">
		<br>
		<label for="numeroSerialeInputId">Numero Seriale: </label><br>
		<input type="text" name="numeroSerialeInput" id="numeroSerialeInputId">
		<br>
		
		<input type="submit" value="SALVA">
	
	</form>

</body>
</html>