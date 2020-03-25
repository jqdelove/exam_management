<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<body>

<%--    <a href="${pageContext.request.contextPath}/product/findAll.do">查询所有的产品</a>--%>
<%--    <h1>登录</h1>--%>
<%--    <form action="${pageContext.request.contextPath}/login.do">--%>
<%--        用户名：<input type="text" name="name" /><br/>--%>
<%--        密码：<input type="password" name="pwd" /><br/>--%>
<%--        <input type="submit" name="登录" />--%>
<%--    </form>--%>

<%--    <a href="${pageContext.request.contextPath}/select.do">aaa</a>--%>

    <%--  访问学生首页  --%>
    <jsp:forward page="/WEB-INF/student/login.jsp"></jsp:forward>
</body>
</html>
