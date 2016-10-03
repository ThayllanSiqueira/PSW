<%-- 
    Document   : condenadosPresos
    Created on : 29/09/2016, 22:13:12
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
        <h1>Lista de Condenados</h1>
        
        <c:forEach items="${requestScope.condenadosPresos}" var="condenados">
            <h4>Condenado: <h4>
             ${condenados.nome} 
            <br/> ${condenados.crime} 
            <br/> ${condenados.Tempo_Prisao}
        </c:forEach>
    </body>
</html>
