<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"%>
    		
<!DOCTYPE 	html 
			PUBLIC 
			"-//W3C//DTD HTML 4.01 Transitional//EN" 
			"http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Calculatrice</title>
	
</head>

<body>
	<p>
		<!-- to display result if it isn't empty -->
		<span>
			${ !empty reponse ? reponse : ''}
		</span>
	</p>
	
	<!--  form with 2 inputs, 1 select and 1 submit -->
	<form action="calculatrice" method="post">
		<input type="number" name="number1">
		<select name="operations">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
			<option value="%">%</option>		
		</select>
		<input type="number" name="number2">
		<input type="submit" value="=">
	</form>

</body>

</html>