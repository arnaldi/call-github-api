<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search GitHub Repo</title>

<script src="<c:url value="js/jquery-3.5.1.min.js" />"></script>
<script src="<c:url value="js/pagination.215.min.js" />"></script>
<script src="<c:url value="js/search.js" />"></script>
</head>
<body>
<div>
   <form id="get-user-form">
         <input id="topic" type="text" placeholder="Enter github repository topic" autocomplete="off">
         <input id="language" type="text" placeholder="Enter github repository language" autocomplete="off">
         <a href="#" id="ghsubmitbtn">Pull User Data</a>
   </form>
</div>

<div id="msg"></div>
<div id="page"></div>
</body>
</html>