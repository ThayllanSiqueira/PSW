<%-- 
    Document   : selecaoIngredientes
    Created on : 13/09/2016, 20:16:35
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
        
        <h1>Quais ingredientes voce tem?</h1>
        
        <form action="ListarReceitas">
            
            <c:forEach items="${requestScope.ingredientesSelecionaveis}" var="ingrediente">
             <br/> <input type="checkbox" name="ingrediente" value="${ingrediente.nome}" /> ${ingrediente.nome}
            </c:forEach>
             
            <br/> <input type="submit" value="Listar">
            
        </form>
        
        
    </body>
</html>
