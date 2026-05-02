<%@ page import="java.util.*" %>
<%@ page import="com.klef.fsad.exam.Booking" %>

<html>

<head>

<title>Booking Records</title>

<style>

table
{
    border-collapse: collapse;
    width: 80%;
}

th, td
{
    border: 1px solid black;
    padding: 10px;
    text-align: center;
}

th
{
    background-color: lightgray;
}

</style>

</head>

<body>

<h2>Booking Records</h2>

<table>

<tr>
<th>ID</th>
<th>Name</th>
<th>Date</th>
<th>Status</th>
<th>Location</th>
<th>Amount</th>
</tr>

<%

List<Booking> bookings =
(List<Booking>)request.getAttribute("bookinglist");

for(Booking b : bookings)
{
%>

<tr>

<td><%= b.getId() %></td>
<td><%= b.getName() %></td>
<td><%= b.getDate() %></td>
<td><%= b.getStatus() %></td>
<td><%= b.getLocation() %></td>
<td><%= b.getAmount() %></td>

</tr>

<%
}
%>

</table>

</body>

</html>