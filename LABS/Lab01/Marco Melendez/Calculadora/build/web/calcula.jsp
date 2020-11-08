<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SUMA</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    </head>
    <body>
        <div class="table table-striped">

            <h1>Calculadora - Resultado</h1>

            <table class="table">

                <thead class="thead-dark">
                    <tr>
                        <th>Números a calcular</th>
                        <th>Valor a calcular</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Número 1</td>
                        <td><%= request.getAttribute("n1")%></td>
                    </tr>
                    <tr>
                        <td>Número 2</td>
                        <td><%= request.getAttribute("n2")%></td>
                    </tr>
                </tbody>
            </table>

            <table class="table">

                <thead class="thead-dark">
                    <tr>
                        <th>Operación calculada</th>
                        <th>Resultado calculado</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Suma</td>
                        <td><%= request.getAttribute("suma")%></td>
                    </tr>
                    <tr>
                        <td>Resta</td>
                        <td><%= request.getAttribute("resta")%></td>
                    </tr>
                    <tr>
                        <td>Multiplicación</td>
                        <td><%= request.getAttribute("multiplicacion")%></td>
                    </tr>
                    <tr>
                        <td>División</td>
                        <td><%= request.getAttribute("division")%></td>
                    </tr>                <tr>
                        <td>Resto</td>
                        <td><%= request.getAttribute("resto")%></td>
                    </tr>
                </tbody>
            </table>
            <a href="index.html" class="btn btn-primary">Nueva operación</a>
        </div>
    </body>
</html>
