<!DOCTYPE html>
<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <title>Login Page</title>
</head>
<body>
    <div class="container">
        <h1>Login to my page</h1>
        <form method="post">
            <label for="username">Username:</label>
            <input type="text" id="name" name="name"><br><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password"><br><br>
            <input type="submit" value="Login">
        </form>
        <p>${errorMessage}</p>
    </div>
</body>
</html>