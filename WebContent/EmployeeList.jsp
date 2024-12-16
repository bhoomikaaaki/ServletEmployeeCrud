<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
     
            <title>Employee Management Application</title>
            
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
            
            	
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div class="row">
                         <h1 class="text-center"> Employee Management Application </h1> 
                    </div>
                </nav>
                
                <nav class="navbar navbar-expand-md navbar-dark" style=" background-color: #C9C0BB">
                   	 <ul class="navbar-nav">
                        <li> <a href="<%=request.getContextPath()%>/list" class="nav-link"  style="color:#454545"> Employees </a></li>
                   	 </ul>
                </nav>
                
            </header>
            <br>

            <div class="row">
                <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

                <div class="container">
                    <h3 class="text-center">List of Employees</h3>
                    <hr>
                    <div class="container text-left">

                       <a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
     New Employee</a>
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>EMP ID</th>
                                <th>EMP NAME</th>
                                <th>EMP JOB </th>
                                <th>EMP SALARY</th>
                                <th>EMP DEPT NUM</th>
                                <th>EMP GENDER</th>
                                <th>EMP AGE</th>
                                <th>ACTION</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="employee" items="${emplist}">

                                <tr>
                                    <td>
                                        <c:out value="${employee.empId}" />
                                    </td>
                                    <td>
                                        <c:out value="${employee.empName}"/>
                                    </td>
                                    <td>
                                        <c:out value="${employee.empJob}"/>
                                    </td>
                                    <td>
                                        <c:out value="${employee.empSalary}"/>
                                    </td>
                                    
                                    <td>
                                        <c:out value="${employee.empDeptNum}"/>
                                    </td>
                                    
                                    <td>
                                        <c:out value="${employee.empGender}"/>
                                    </td>
                                    
                                    <td>
                                        <c:out value="${employee.empAge}"/>
                                    </td>
                                    <td><a href="edit?empId=<c:out value='${employee.empId}'/>">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?empId=<c:out value='${employee.empId}' />">Delete</a></td>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
            </div>
        </body>

	
	
        </html>
    