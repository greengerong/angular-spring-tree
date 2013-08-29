<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html id="ng-app" ng-app>
<head>
    <script type="text/javascript" src="js/angularjs.js"></script>
    <script type="text/javascript">
        function ctr($scope) {
            $scope.question = [];
            $scope.reset = function (question, selectedValue) {
                if (question && question.value !== selectedValue && question.tree) {
                    question.tree.value = undefined;
                }
            };

            $scope.setKey = function (obj, key, hasChild) {
                obj.key = key;
                if (hasChild) {
                    obj.tree = {};
                }
            };

            $scope.initArray = function (length) {
                for (var i = 0; i < length; i++) {
                    $scope.question[i] = {};
                }
            }
        }
    </script>
</head>
<body ng-controller="ctr">
<h2>Hello World!</h2>

<div ng-init="initArray(${trees.treeCount})">
    <c:forEach items="${trees.tree}" var="tree" varStatus="status">
        <hr/>
        <tag:question tree="${tree}" prefix="question[${status.index}]"></tag:question>
    </c:forEach>
</div>
<hr>
<pre>{{question | json}}</pre>
</body>
</html>
