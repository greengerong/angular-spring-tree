<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html id="ng-app" ng-app>
<head>
    <script type="text/javascript" src="js/angularjs.js"></script>
</head>
<body>
<h2>Hello World!</h2>
${tree}
<c:forEach items="${trees.tree}" var="tree">
    <hr/>
    <tag:question tree="${tree}"></tag:question>
</c:forEach>

<hr>
<pre>{{question | json}}</pre>
</body>
</html>
