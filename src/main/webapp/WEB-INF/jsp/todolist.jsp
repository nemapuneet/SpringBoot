<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
   <title>List of TODOs for ${name}</title>
</head>
<body>
Here is the list of ${name} TODOs :
</br>
<table>
   <tr>
      <th>Description</th>
      <th>End Date</th>
      <th>Is Done ?</th>
   </tr>
   <c:forEach items="${todos}" var="todo">
      <tr>
         <th>${todo.desc}</th>
         <th>${todo.targetDate}</th>
         <th>${todo.getDone()}</th>
      </tr>
   </c:forEach>
</table>
</br>
<a href="/add-todo">Click Here</a> to add new TODO
</body>
</html>