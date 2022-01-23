<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <!-- While using expression language if not working use this-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Result : <%=request.getAttribute("result") %>
<!-- Expression Language EL use isELIgnored on top if it is not working -->
Result : ${result}
</body>
</html>