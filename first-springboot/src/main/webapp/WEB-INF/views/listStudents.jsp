<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table align="left" border="1" cellspacing="0">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>age</td>
    </tr>
        <c:forEach items="${student}" var="s" varStatus="st">
           <tr>
                   <td>
                       ${s.id}
                   </td>
                   <td>
                        ${s.name}
                   </td>
                   <td>
                       ${s.age}
                   </td>
           </tr>
        </c:forEach>
</table>