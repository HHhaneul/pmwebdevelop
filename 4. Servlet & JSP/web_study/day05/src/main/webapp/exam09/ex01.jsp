<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value="/file/upload" />
<form method="POST" action="ex01_ps.jsp" enctype="multipart/form-data">
    제목: <input type="text" name="subject"><br>
    파일: <input type="file" name="file">
    <button type="submit">업로드</button>
</form>