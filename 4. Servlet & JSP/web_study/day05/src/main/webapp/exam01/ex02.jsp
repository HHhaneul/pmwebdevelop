<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="models.Book" %>
<%
    Book book = new Book("책1", "저자1", "출판사1");
    pageContext.setAttribute("book", book);
%>

제목: ${book.title}<br>
저자: ${book.author}<br>
출판사: ${book.publisher}<br>
${10 ne 11}<br>