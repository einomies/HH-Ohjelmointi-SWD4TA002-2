<%@include file="onkokirjauduttu.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Vene"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/jquery.validate.min.js"></script>
<link rel="stylesheet" type="text/css" href="main.css">
<title>Veneen tietojen muutos</title>
</head>
<%
Vene vene = null;
if(request.getAttribute("vene")!=null){
	vene = (Vene)request.getAttribute("vene");
}else{
	response.sendRedirect("haeveneet.jsp");
}
%>
<body>
<%
out.print("Kirjautuneena: " + session.getAttribute("kayttaja") + "<br> <hr>");
%>
<form action="MuutaVene" method="post" name="muutaLomake" id="muutaLomake">
<table>
<tr>
<th align="right" style="width:33%" class="pysty">Nimi:</th>
<td><input type="text" name="nimi" id="nimi" value="<%=vene.getNimi()%>"></td>
</tr>
<tr>
<th align="right" class="pysty">Merkki ja malli:</th>
<td><input type="text" name="merkkimalli" id="merkkimalli" value="<%=vene.getMerkkimalli()%>"></td>
</tr>
<tr>
<th align="right" class="pysty">Pituus:</th>
<td><input type="number" name="pituus" id="pituus" value="<%=vene.getPituus()%>"></td>
</tr>
<tr>
<th align="right" class="pysty">Leveys:</th>
<td><input type="number" name="leveys" id="leveys" value="<%=vene.getLeveys()%>"></td>
</tr>
<tr>
<th align="right" class="pysty">Hinta:</th>
<td><input type="number" name="hinta" id="hinta" value="<%=vene.getHinta()%>"></td>
</tr>
<tr>
<td colspan="2" class="nappiSarake"><input type="submit" value="Vahvista muutos">
<input type="button" value="Kaikki veneet" id="kaikki"></td>
</tr>
</table>
<input type="hidden" name="tunnus" value="<%=request.getParameter("tunnus")%>">
</form>
<script>
	$(document).ready(function(){
		$("#nimi").focus();
	    $("#kaikki").click(function(){
	    	window.location.href = 'HaeVeneet';
	    });
	    $("#muutaLomake").validate({
			rules: {
				nimi:  {
					required: true,
					minlength: 2,
					maxlength: 50
				},
				merkkimalli:  {
					required: true,
					minlength: 2,
					maxlength: 50
				},
				pituus:  {
					required: true,
					number: true,
					min: 1
				},
				leveys:  {
					required: true,
					number: true,
					min: 1
				},
				hinta:  {
					required: true,
					number: true,
				}
			},
			messages: {
				nimi: {
					required: "Pakollinen",
					minlength: "Pituus ei riitä",
					maxlength: "Liian pitkä"

				},
				merkkimalli: {
					required: "Pakollinen",
					minlength: "Pituus ei riitä",
					maxlength: "Liian pitkä"
				},
				pituus: {
					required: "Pakollinen",
					number: "Anna pituus",
					min: "Pituus liian pieni"
				},
				leveys: {
					required: "Pakollinen",
					number: "Anna leveys",
					min: "Leveys liian pieni"
				},
				hinta: {
					required: "Pakollinen",
					number: "Anna hinta"
				}
			},
			submitHandler: function (form) {
				document.forms["muutaLomake"].submit();
			}
		});
	    //Muita ehtoja/rules
	    	//email: true,
	    	//equalTo: #pwd1,
	    	//url: true
	});

</script>
</body>
</html>