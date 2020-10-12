<html>

<head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}

body {
  font-size: 200%;
}

</style>
</head>

<body>

<table border: 1px solid black>
<% for(int x = 2; x<10; x++){
	out.print("<tr>");
	for (int y = 1; y<10; y++){
	out.print("<td>");s
		out.print(y*x);
	out.print("</td>");
	}
out.print("</tr>");
}
%>
</table>

</form>
</body>
</html>
