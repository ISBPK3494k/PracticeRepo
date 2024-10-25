<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h3 class=" pb-3 pt-3">Reports Application</h3>
<form:form action="search" modelAttribute="search" method="POST">
<table>
<tr>
<td>PlanName:</td>
<td>
<form:select path="planName">
<form:option value="">Select-</form:option>
<form:options items="${names}" />
</form:select>
</td>
<td>PlanStatus</td>
<td>
<form:select path="planStatus">
<form:option value="">Select</form:option>
<form:options items="${status}" />
</form:select>
</td>
<td>Gender:</td>
<td>
<form:radiobutton path="gender" value="male"/>Male
<form:radiobutton  path="gender" value="female"/>Female

</td>
<tr>
<td>StartDate:</td>
<td>
<form:input type="date" path="startDate" data-date-format="yyyy-mm-dd"/>

</td>
</tr>
<tr>
<td>EndDate:</td>
<td>
<form:input  type="date" path="endDate" data-date-format="yyyy-mm-dd"/>

</td>
<tr>
<td>
<input type="submit" value="search" class="btn btn-primary"/>
</td>

</tr>






</table>



</form:form>



<hr/>
<table class ="table table-striped">
<thead>
<tr>
<th>Id</th>
<th>Holder Name</th>
<th>plan Name</th>
<th>Start Date</th>
<th>End Date</th>
</tr>
</thead>

</table>
<hr/>

export:<a herf="">EXCEL</a> <a href="">PDF</a>
</div>



 <script 
 src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
 integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" 
 crossorigin="anonymous">
 </script>
</body>
</html>