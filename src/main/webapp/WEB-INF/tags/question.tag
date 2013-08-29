<%@ attribute name="tree" type="com.github.greengerong.TreeType" %>

<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div>
    <label>question : ${tree.name}</label>
    <input name="${tree.name}" type="radio" ng-model="question.${tree.name}" value="Yes"> Yes</input>
    <input name="${tree.name}" type="radio" ng-model="question.${tree.name}" value="No"> No</input>
    <c:if test="${tree.hasChild}">
        <div ng-show="question.${tree.name} == '${tree.selectedValue}'">
            <tag:question tree="${tree.tree}"></tag:question>
        </div>
    </c:if>
</div>