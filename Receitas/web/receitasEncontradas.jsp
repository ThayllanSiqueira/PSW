<%-- 
    Document   : receitasEncontradas
    Created on : 15/09/2016, 21:57:58
    Author     : RA21551794
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sugestões de receitas com base nos ingredientes selecionados</h1>
    
        <c:forEach items="${requestScope.receita}" var="receita">
             ${receita.nome} <br/>
        </c:forEach>
    </body>
</html>
