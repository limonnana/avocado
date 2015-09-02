<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	hola
</h1>

<P>  Mi saludo es: ${serverTime}. </P>

<br><br>

<form action="http://localhost:8080/backend/saveperson"   method="post">
    
        <p>First Name: <input type="text" name="person.firstName" id="person.firstName" /></p>
        <p>Last Name: <input type="text" name="person.lastName" id="person.lastName" /></p>
        <p><input type="submit" value="Submit" /> </p>
</form>


</body>
</html>
