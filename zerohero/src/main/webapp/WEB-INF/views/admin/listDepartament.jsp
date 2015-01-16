<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="includes/admin-head.jsp" />
<body>

<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse"
              data-target=".navbar-collapse">
        <span class="sr-only">Toggle navigation</span> <span
              class="icon-bar"></span> <span class="icon-bar"></span> <span
              class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="<c:url value="/admin/"/>">Zero To
        Hero</a>
    </div>
    <div class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li><a href="<c:url value="/admin/list/"/>">Lista
          utilizatori</a></li>
        <li><a href="<c:url value="/admin/listRole/"/>">Lista
          roluri</a></li>
        <li><a href="#">Lista Departament</a></li>
        <li><a href="<c:url value="/j_spring_security_logout"/>">Iesire</a></li>
      </ul>
    </div>
    <!--/.nav-collapse -->
  </div>
</div>

<div class="container-fluid">
  <div class="row-fluid">
    <div class="span12">
      <fieldset>
        <legend>Lista departamente</legend>
        <table class="table table-striped">
          <tr>
            <td>Nume departament</td>
            <td>Functie</td>
            <td colspan="2" style="text-align: center"><a
                    href="<c:url value="/admin/newDepartament/" />"><img
                    src="<c:url value="/resources/img/add.png" />"
                    style="height: 20px; width: 20px;" /></td>
          </tr>
          <c:forEach var="departament" items="${Departament}">
            <tr>
              <td>${departament.nameDep}</td>
              <td>${departament.position}</td>
              <td style="text-align: center"><a
                      href="<c:url value="/admin/editDepartament/"/>${departament.departamentId}"><img
                      src="<c:url value="/resources/img/edit.png" />"
                      style="height: 20px; width: 20px;" /></a></td>
              <td style="text-align: center"><a
                      href="<c:url value="/admin/deleteDepartament/"/>${departament.departamentId}"><img
                      src="<c:url value="/resources/img/delete.png"/>"
                      style="height: 20px; width: 20px;" /></a></td>
            </tr>
          </c:forEach>
        </table>
      </fieldset>
    </div>
  </div>
</div>
</body>
</html>