<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
     <script src="http://localhost:8080/resources/hola.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<br><br>
<a href="web">web</a>
<br><br>

       <div>
            <p class="greeting-id">The ID is </p>  
            <p class="greeting-content">The content is </p>
        </div>
</body>
</html>
