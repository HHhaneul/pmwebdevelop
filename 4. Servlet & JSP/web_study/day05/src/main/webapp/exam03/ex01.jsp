<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set var="date" value="<%=new Date()%>" />

<fmt:formatDate value="${date}" type="date" dateStyle="full"/><br>
<fmt:formatDate value="${date}" type="date" dateStyle="long"/><br>
<fmt:formatDate value="${date}" type="date" dateStyle="short"/><br><br>

<fmt:formatDate value="${date}" type="time" timeStyle="full"/><br>
<fmt:formatDate value="${date}" type="time" timeStyle="long"/><br>
<fmt:formatDate value="${date}" type="time" timeStyle="short"/><br><br>

<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full"/><br>
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="long"/><br>
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="short"/><br><br>

<fmt:formatDate value="${date}" type="both" dateStyle="long" timeStyle="full"/><br>
<fmt:formatDate value="${date}" type="both" dateStyle="long" timeStyle="long"/><br>
<fmt:formatDate value="${date}" type="both" dateStyle="long" timeStyle="short"/><br><br>

<fmt:formatDate value="${date}" type="both" dateStyle="short"/><br>
<fmt:formatDate value="${date}" type="both" dateStyle="short" timeStyle="full"/><br>
<fmt:formatDate value="${date}" type="both" dateStyle="short" timeStyle="long"/><br>
<fmt:formatDate value="${date}" type="both" dateStyle="short" timeStyle="short"/><br><br>

<h1>pattern</h1>
<fmt:formatDate value="${date}" type="both" pattern="yyyy.MM.dd a hh:mm" />