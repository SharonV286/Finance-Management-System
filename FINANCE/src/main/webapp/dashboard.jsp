<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="com.lti.repository.DashBoardImp" %>
<%@ page import="com.lti.component.DashBoard" %>
     

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DASHBOARD</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="border"><h1 id="d4" align="center">DASHBOARD</h1>
		<div class="box">
				 <h3 align="center"> Card No </h3>
				  <h3 align="center"> Name  </h3>
				  <h3 align="center"> Valid Till </h3>
				   <h3 align="center">Card Type </h3>
<% 
ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
DashBoardImp di = ctx.getBean(DashBoardImp.class);
List<DashBoard> li = (List<DashBoard>)di.getCardDetailsbyId(12345);
%>
<%for(DashBoard db: li){ %>
	<%out.println(db.getCARD_NO()) ;%>
	<%out.println(db.getUS_NAME()) ;%>
	<%out.println(db.getVALID_TILL()) ;%>
	<%out.println(db.getCARD_TYPE()) ;%>				   


<%} %>		</div>
		<!--  <div class="box2">
			<p>ACTIVATED</p>
		</div>
		<div >
				<pre>Total Credit </pre>
				<pre>Credits Used </pre>
				<pre>Remaining Credit</pre>
		</div>

		<div id="d4">
			<h2 align="center ">PRODUCTS PURCHASED</h2>
		</div>
		<div >
				<pre>Amount:</pre>
				<pre>Product Name </pre>
				<pre>Paid</pre>
				<pre>Balance</pre>
		</div>

		<div >
			<h2 id="d4" align="left">RECENT TRANSACTIONS</h2>
			<table border="1px" id="tbl">
				<th>PRODUCT</th>
				<th>DATE</th>
				<th>AMOUNT PAID</th>
				<tr>
					<td>Mobile</td>
					<td>17/11/2019</td>
					<td>20,000</td>
				</tr>	
				<tr >
					<td>Watch</td>
					<td>27/12/2019</td>
					<td>10,000</td>
				</tr>
				
	
			</table>

		</div>
		-->




	</div>

</body>
</html>