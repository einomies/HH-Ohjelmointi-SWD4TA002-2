<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Asiakkaan lisääminen</title>
<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
<p>
<h2>Lisää asiakas tietokantaan</h2>
<p>
<form action="LisaaAsiakas" method="post">
<table border="1">
<tr>
<th align="right">etunimi:</th>
<td><input type="text" name="etunimi"></td>
</tr>
<tr>
<th align="right">sukunimi:</th>
<td><input type="text" name="sukunimi"></td>
</tr>
<tr>
<th align="right">puhelin:</th>
<td><input type="text" name="puhelin"></td>
</tr>
<tr>
<th align="right">sposti:</th>
<td><input type="text" name="sposti"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Lisää" style="width:180px"></td>
</tr>
</table>
</form>
<%
if(request.getParameter("ilmo")!=null){
	if(request.getParameter("ilmo").equals("1")){
		out.print("Asiakkaan lisääminen onnistui");
	}else if(request.getParameter("ilmo").equals("0")){
		out.print("Asiakkaan lisääminen ei onnistunut");
	}
}
%>
<br>
<a href="hae_asiakkaat.jsp">Näytä kaikki asiakkaat</a>
</body>
</html>