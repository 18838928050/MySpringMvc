<!DOCTYPE HTML>
<html>
<head>
<title>View Product</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<div>
    <h4>${message}</h4>
        <h5>Details:</h5>
        Product Name: ${product.name}<br/>
        Description: ${product.description}<br/>
        Price: $${product.price}
</div>
</body>
</html>