<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>welcome to result page</h2>
    <%
    out.println("Math:" + request.getParameter("tbMath"));
    out.println("<br>");
    out.println("phy:" + request.getParameter("tbphy"));
    out.println("<br>");
    out.println("chem:" + request.getParameter("tbchem"));
    out.println("<br>");
    
    out.println("percentage result:");
    out.println("<br>");
    out.println(request.getAttribute("percentage"));
    out.println("<br>");
    out.println("grade result:");
    out.println("<br>");
    out.println(request.getAttribute("grade"));
    
    
    
    %>
</body>
</html>