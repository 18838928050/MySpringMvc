<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>this title</title>
</head>
<body>

<form:form action="" commandName="" method="post">

input:<form:input path="" cssErrorClass="errorBox"/>
<br>
password:<form:password path="password" />
<br>
hidden:<form:hidden path="productId"/>
<br>
<%-- textarea:<form:textarea path="note" rows="5" cols="80"> --%>
<br>
checkbox:<form:checkbox path="outOfStock" value="Out of Stock"/>
<br>

redioButton:<form:radiobutton path="newsletter" value="Computing Now"/>
Modern Health<form:radiobutton path="newsletter" value="Modern Heath"/>


</form:form>

</body>
</html>