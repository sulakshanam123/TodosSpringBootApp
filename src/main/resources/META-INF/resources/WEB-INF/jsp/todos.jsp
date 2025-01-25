<!DOCTYPE html>
<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <title>welcome Page</title>
</head>
<body>
    <div class="container">
        <div>Here are your Todos ${name}</div>
        <table>
            <thead>

                    <td>ID</td>
                    <td>User</dh
                    <td>Description</td>
                    <td>Target Date</td>

            </thead>
            <tbody>
                <tr>
                    <td>${todos[0].id}</td>
                    <td>${todos[0].user}</td>
                    <td>${todos[0].desc}</td>
                    <td>${todos[0].targetDate}</td>

                </tr>
                <tr>
                    <td>${todos[1].id}</td>
                    <td>${todos[1].user}</td>
                    <td>${todos[1].desc}</td>
                    <td>${todos[1].targetDate}</td>

                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>