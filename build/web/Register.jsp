<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tag" uri="/WEB-INF/tlds/my_jdbc_tag" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <tag:registerData driver="${param.driver}" url="${param.url}" dbUsername="${param.dbUsername}" dbPassword="${param.dbPassword}" user="${param.user}" age="${param.age}"/>
    </body>
</html>
