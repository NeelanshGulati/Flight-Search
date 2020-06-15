<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<%@page isELIgnored="false"%>
<body bgcolor="pink">
<a style="float: right;" href="index.jsp" class="btn btn-info" role="button">LOGOUT</a>
<h1 style="color:white"><b>YOU HAVE SUCCESSFULLY LOGGED IN</b></h1>

<div class="container">
<h2><u>FLIGHT SEARCH</u></h2>
<form action="flightsearch" method="post">
	<div class="form-group">
	DEPARTURE LOCATION:<br>
	 <input type="text" name = "deploc" placeholder="Enter Departure Location" required><br>
	 </div>
	 <div class="form-group">
	ARRIVAL LOCATION: <br>
	<input type="text" name = "arrloc" placeholder="Enter Arrival Location" required><br>
	</div>
	<div class="form-group">
	FLIGHT CLASS:<br>
	<select name="flightclass">
  		<option value="E">E</option>
  		<option value="B">B</option>
  	</select>
  	<br>
  	</div>
  	<div class="form-group">
  	FLIGHT DATE:<br>
  	<input type="date" name="flightdate" required>
  	<br>
  	</div>
  	<div class="form-group">
  	OUTPUT PREFERENCE:<br>
  	<select name="outputpref">
  		<option value="fare">Fare</option>
  		<option value="flightduration">Flight Duration</option>
  	</select>
  	<br>
  	</div>
  	<input type="submit" value="submit">
  	<br>
  	<br>
  	
  	<table class="table table-striped" border="1" cellspacing ="10" cellpadding="10">
  		<tr>
  			<th>FLIGHT NO.</th>
  			<th>DEPARTURE LOCATION </th>
  			<th>ARRIVAL LOCATION </th>
  			<th>FLIGHT DATE </th>
  			<th>FLIGHT TIME </th>
  			<th>FLIGHT DURATION </th>
  			<th>FARE</th>
  			<th>FLIGHT CLASS </th>
  		</tr>
  		<c:forEach items="${lists}" var="lists"> 
  		<tr>
  			<td>${lists.flightNo}</td>
  			<td>${lists.depLoc}</td>
  			<td>${lists.arrLoc}</td>
  			<td>${lists.flightDate}</td>
  			<td>${lists.flightTime}</td>
  			<td>${lists.flightDur}</td>
  			<td>${lists.fare}</td>
  			<td>${lists.flightClass}</td>
  		</tr>
  		</c:forEach>
  	</table>
</form>
</div>
</body>
</html>