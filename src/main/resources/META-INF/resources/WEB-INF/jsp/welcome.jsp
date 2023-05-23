<!DOCTYPE html>
<html>
<head>
  <title>Welcome Page</title>
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
      text-align: center;
    }

    .container h2 {
      color: #4caf50;
    }
    #message {color: #4caf50;}
  </style>
</head>
<body>
	
  <div class="container">
    <h2>Welcome to Future</h2>
    <div id=message>Your name is ${name} and password is ${password}</div>
    <div><a href="list-todos">My Todos</a></div>
  </div>
</body>
</html>
