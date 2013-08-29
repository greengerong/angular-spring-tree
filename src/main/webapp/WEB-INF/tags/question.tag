<%@ attribute name="prefix" type="java.lang.String" %>
<%@ attribute name="tree" type="com.github.greengerong.TreeType" %>

<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div ng-init="setKey(${prefix},'${tree.name}',${tree.hasChild})">
    <label>question : ${tree.name}</label>
    <input name="${tree.name}" type="radio" ng-model="${prefix}.value"
           value="Yes" ng-click="reset(${prefix},'${tree.selectedValue}');"> Yes</input>
    <input name="${tree.name}" type="radio" ng-model="${prefix}.value"
           value="No" ng-click="reset(${prefix},'${tree.selectedValue}');"> No</input>
    <c:if test="${tree.hasChild}">
        <div ng-show="${prefix}.value == '${tree.selectedValue}'">
            <tag:question tree="${tree.tree}" prefix="${prefix}.tree"></tag:question>
        </div>
    </c:if>
</div>