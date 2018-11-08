<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>this title</title>
</head>
<body>
	<div>
		<!-- commandName显式指定绑定的表单对象名称。 -->
		<form:form action="employee_save" commandName="employee" method="post">
		<fieldset>
			<p>
				<!-- //规定元素的 tab 键控制次序（1 是第一个）。 -->
				<label for="firstName">FirstName:</label>
				<form:input path="firstName" tabindex="1" />
			</p>
			<p>
				<label for="lastName">lastName：</label>
				<form:input path="lastName" tabindex="2" />
			</p>
			<p>
				<form:errors path="birthDate" cssClass="error"></form:errors>
			</p>
			<p>
				<label for="birthDate">Date of Birth:</label>
				<form:input path="birthDate" tabindex="3" />
			</p>
			<p id="buttons">
				<input id="reset" type="reset" tabindex="4"> 
				<input id="submit" type="submit" tabindex="5" value="Add Employee">

			</p>
			</fieldset>
		</form:form>

	</div>

</body>
</html>