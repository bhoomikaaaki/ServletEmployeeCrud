<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title> Employees Management Application</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
            	
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div class="row">
                         <h1 class="text-center"> Employee Management Application </h1> 
                    </div>
                </nav>
                
            </header>
            
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                        
                      <form action="insert" method="post">         
                        
                            <h2>  Add New Employee  </h2>
                           
                        <fieldset class="form-group">
                            <label>Employee Name</label> <input type="text" class="form-control" name="empName" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Employee Job</label> <input type="text"  class="form-control" name="empJob">
                        </fieldset>

                         <fieldset class="form-group">
                            <label>Employee Salary</label> <input type="text" class="form-control" name="empSalary">
                        </fieldset>
                        
                         <fieldset class="form-group">
                            <label>Employee Dept Number</label> <input type="text"  class="form-control" name="empDeptNum">
                        </fieldset>
                        
                         <fieldset class="form-group">
                         
                            <label>Employee Gender</label>  <br>                 
                            
                            <input type="radio" name="empGender" value="male" checked>
      						<label >Male</label>
      						
     						 <input type="radio" name="empGender" value="female">
      						<label >Female</label>  
      						    
      						<input type="radio" name="empGender" value="others">
      						<label >Others</label>
                        </fieldset>
                        
                         <fieldset class="form-group">
                            <label>Employee Age</label> <input type="text" class="form-control" name="empAge">
                        </fieldset>

                        <button type="submit" class="btn btn-success">Save</button>
                        </form>
                    </div>
                </div>
            </div>
        </body>

        </html>

