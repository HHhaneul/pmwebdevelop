<%@ page contentType="text/html; charset=utf-8" %>

<%
    pageContext.setAttribute("num1", 100);
    pageContext.setAttribute("num2", 200);
%>
${num1 + num2}
${num1}
${num1 < num2}