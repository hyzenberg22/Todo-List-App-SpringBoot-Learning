<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f1f1f1;
}

.container {
	max-width: 400px;
	margin: 0 auto;
	padding: 20px;
	background-color: #ffffff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.container h2 {
	text-align: center;
}

.container input[type="text"], .container input[type="password"] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
	border-radius: 4px;
}

.container input[type="submit"] {
	width: 100%;
	background-color: #4caf50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.container input[type="submit"]:hover {
	background-color: #45a049;
}
</style>
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
</body>
</html>
