<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title> Employees Management Application</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                     <form action="update" method="get">

                            <h2>   Edit Emplyee Details   </h2>
                            
                        <fieldset class="form-group">
                        
                        	<label>Employee Id</label>                       	 
                   
                            <input type="text" name="empId" value="<c:out value='${emp.empId}'/>" readonly/>
                      										
						 </fieldset>
						 
                        <fieldset class="form-group">
                        
                            <label>Employee Name</label> 
                            
                            <input type="text" class="form-control" name="empName" value="<c:out value='${emp.empName}'/>"   />
                        
                        </fieldset>                     
                        

                        <fieldset class="form-group">
                            <label>Employee Job</label> <input type="text"  class="form-control" name="empJob" value="<c:out value='${emp.empJob}'/>" />
                        </fieldset>
																
                         <fieldset class="form-group">
                            <label>Employee Salary</label> <input type="text" class="form-control" name="empSalary" value="<c:out value='${emp.empSalary}'/>" />
                        </fieldset>
                        
                         <fieldset class="form-group">
                            <label>Employee Dept Number</label> <input type="text"  class="form-control" name="empDeptNum" value="<c:out value='${emp.empDeptNum}'/>" />
                        </fieldset>
                        
                         <fieldset class="form-group">
                         
                            <label>Employee Gender</label>  <br>  
                            
                            <c:set var="empGender" value='${emp.empGender}'/>
                            
          
							<c:choose>
								<c:when test="${(empGender == 'male')}">
									<input type="radio" name="empGender" value="male" checked />
								</c:when>
								<c:otherwise>
								<input type="radio" name="empGender" value="male" />
								</c:otherwise>
							</c:choose>							
							<label >Male</label> 
							
							<c:choose>
								<c:when test="${(empGender == 'female')}">
									<input type="radio" name="empGender" value="female" checked />
								</c:when>
								<c:otherwise>
								<input type="radio" name="empGender" value="female" />
								</c:otherwise>
							</c:choose>							
							<label >Female</label> 
							
							<c:choose>
								<c:when test="${(empGender == 'others')}">
									<input type="radio" name="empGender" value="others" checked />
								</c:when>
								<c:otherwise>
								<input type="radio" name="empGender" value="others" />
								</c:otherwise>
							</c:choose>							
							<label >Others</label> 
                            
                        </fieldset>
                        
                          <fieldset class="form-group">
                            <label>Employee Age</label> <input type="text"  class="form-control" name="empAge" value="<c:out value='${emp.empAge}'/>" />
                        </fieldset>

                        <button type="submit" class="btn btn-success">Save</button>
                     </form>
                    </div>
                </div>
            </div>
        </body>

        </html>
