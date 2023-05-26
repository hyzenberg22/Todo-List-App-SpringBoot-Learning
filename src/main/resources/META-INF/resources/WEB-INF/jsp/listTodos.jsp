<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
  <title>Todo Page</title>
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
      color: #ff0000;
    }

    .container p {
      color: #555555;
    }
  </style>
</head>
<body>
  <div class="container">
    <h2>Welcome to the to do page ${name}</h2>
    <hr>
    <h1>Your Todo's </h1>
    <table>
    	<thead>
    		<tr>
    			<th>id</th>
    			<th>Description</th>
    			<th>Target Date</th>
    			<th>Is Done?</th>
    		</tr>
    	</thead>
    	<tbody>
    		<c:forEach items="${todos}" var="todo">
	    		<tr>
	    			<td>${todo.id}</td>
		    		<td>${todo.description}</td>
		    		<td>${todo.targetdate}</td>
		    		<td>${todo.done}</td>
	    		</tr>
    		</c:forEach>
    	</tbody>
    </table>
  </div>
</body>
</html>
