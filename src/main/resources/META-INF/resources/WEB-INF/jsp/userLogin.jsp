<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		
		<h2>Login</h2>
		<pre>${errorMessage}</pre>
		<form method="post">
			<label for="username">Name:</label> 
			<input type="text" id="username" name="username" required> 
			<label for="password">Password:</label> 
			<input type="password" id="password" name="password" required> 
			<input type="submit" value="Submit">
		</form> 
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
  	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>
