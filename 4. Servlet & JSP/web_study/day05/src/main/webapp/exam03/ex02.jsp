<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<c:set var="num1" value="10000.12" />
<h1>groupingUsed="false"</h1>
<fmt:formatNumber value="10000000" groupingUsed="false" /><br>
<h1># pattern</h1>
<fmt:formatNumber value="${num1}" pattern="#,###.####" /><br>
<h1>0 pattern</h1>
<fmt:formatNumber value="${num1}" pattern="0,000.0000" /><br>
