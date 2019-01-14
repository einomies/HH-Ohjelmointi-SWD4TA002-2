<%@include file="onkokirjauduttu.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/jquery.validate.min.js"></script>
<link rel="stylesheet" type="text/css" href="main.css">
<title>Veneen lisääminen</title>
</head>
<body>
<%
out.print("Kirjautuneena: " + session.getAttribute("kayttaja") + "<br> <hr>");
%>
<form action="LisaaVene" method="post" name="lisaaLomake" id="lisaaLomake">
<table>
<tr>
<th align="right" style="width:33%" class="pysty">Nimi:</th>
<td><input type="text" name="nimi" id="nimi"></td>
</tr>
<tr>
<th align="right" class="pysty">Merkki ja malli:</th>
<td><input type="text" name="merkkimalli" id="merkkimalli"></td>
</tr>
<tr>
<th align="right" class="pysty">Pituus:</th>
<td><input type="number" placeholder="0.00" name="pituus" id="pituus"></td>
</tr>
<tr>
<th align="right" class="pysty">Leveys:</th>
<td><input type="number" placeholder="0.00" name="leveys" id="leveys"></td>
</tr>
<tr>
<th align="right" class="pysty">Hinta:</th>
<td><input type="number" name="hinta" id="hinta"></td>
</tr>
<tr>
<td colspan="2" class="nappiSarake"><input type="submit" value="Lisää">
<input type="button" value="Kaikki veneet" id="kaikki"></td>
</tr>
</table>
</form>
<%
if(request.getParameter("ilmo")!=null){
	if(request.getParameter("ilmo").equals("1")){
		out.print("Veneen lisääminen onnistui");
	}else if(request.getParameter("ilmo").equals("0")){
		out.print("Veneen lisääminen ei onnistunut");
	}
}
%>
<script>
	$(document).ready(function(){
		$("#rekno").focus();
	    $("#kaikki").click(function(){
	    	window.location.href = 'HaeVeneet';
	    });
	    var d = new Date();
	    $("#lisaaLomake").validate({
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
					number: true
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