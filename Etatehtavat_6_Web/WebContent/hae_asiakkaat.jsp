<%@page import="dao.DaoAsiakas"%>
<%@page import="model.Asiakas"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Asiakkaiden listaus</title>
<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
<h2>Asiakkaiden listaus kannasta</h2>

<table border="1" cellpadding="5">
<tr>
<th>AsiakasId</th>
<th>Etunimi</th>
<th>Sukunimi</th>
<th>Puhelin</th>
<th>Sposti</th>
</tr>
<%
DaoAsiakas daoAsiakas = new DaoAsiakas();
ArrayList<Asiakas> asiakkaat = daoAsiakas.listaaKaikki();
for (int i=0; i<asiakkaat.size(); i++) {
	out.print("<tr>");
	out.print("<td>" +asiakkaat.get(i).getAsiakasId() +"</td>");
	out.print("<td>" +asiakkaat.get(i).getEtunimi() +"</td>");
	out.print("<td>" +asiakkaat.get(i).getSukunimi() +"</td>");
	out.print("<td>" +asiakkaat.get(i).getPuhelin() +"</td>");
	out.print("<td>" +asiakkaat.get(i).getSposti() +"</td>");
	out.print("</tr>");
}
%>
</table>
<p>
<a href="lisaa_asiakas_a1505210.jsp">takaisin</a>
</body>
</html>