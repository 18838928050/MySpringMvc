<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>this title</title>
</head>
<body>

<form action="product_save.action" method="post">
	<fieldset>
		<legend>Add a Product</legend>
		<label for="name">Product Name:</label>
		<input type="text" id="name" name="name" tabindex="1">
		<label for="description">Description</label>
		<input type="text" id="description" name="description" tabindex="2"><br>
		
		<label for="price">Price:</label>
		<input type="text" id="price" name="price" tabindex="3"><br>
		<div>
		  <input id="reset" type="reset" tabindex="4">
		  <input id="submit" type="submit" tabindex="5" value="Add Product"><br>
		</div>
	</fieldset>


</form>
</body>
</html>