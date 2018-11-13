<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<script type="text/javascript" src="/views/js/employee.js"></script>

<div class="row">

	<div class="col-md-5">
	
	<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Create Employee</h1>
            <hr>
        </div>
        <div class="card-body text-center">
            <form action="">
            
                <div class="form-group">
                	
                	<label class="control-label" for="empname">Employee Name</label>
                    <input id="empname" name="empname" placeholder="Insert Employee Name" class="form-control" type="text" />
					
                	<span class="error" id="ername"></span>
                </div>
                
                 <div class="form-group">
                	<label class="control-label" for="empemail">Employee Email</label>
                    <input id="empemail" name="empemail" placeholder="Insert Employee Email" class="form-control" type="text" />
					<span class="error" id="eremail"></span>
                </div>                
                <div class="form-group">
                	<label>Employee Username </label>
                    <input type="text" class="form-control form-control-lg" placeholder="Username" name="empusername" id="emusername">
                    <span class="error" id="erusername"></span>
                </div>
                
                <div class="form-group">
                <label>Password </label>
                    <input required type="password" class="form-control form-control-lg" placeholder="Password" name="empassword" id="empassword">
                     <span class="error" id="erpass"></span>
                </div>

                <div class="form-group">
                    <label>Role</label> <br>
                    <input type="checkbox" name="role" value="1"> <label>Admin</label>
                    <input type="checkbox" name="role" value="1"> <label>Accountant</label>
                    <input type="checkbox" name="role" value="1"> <label>Manager</label>
                    <span class="error" id="errole"></span>
                </div>
                
                <div class="form-group">
                	<label>Enable?</label>
                    <input required type="checkbox" class="" name="enabled" id="enabled">
                </div>
                      
                <input type="submit" class="btn btn-lg btn-acc" value="Create Employee" id="create">
            </form>
        </div>
    </div>
	</div>

    <div class="col-md-7">
        <div class="card mx-auto text-center">
            <div class="card-header">
                <h1>Employee Information</h1>
                <hr>

                <div class="row" style="margin:20px 0 20px 0;">
                    <div class="col-lg-4" align="right"><h4>Search</h4></div>
                    <div class="col-lg-8">
                        <div class="input-group">
                            <input type="text" id="empSearch" class="form-control" placeholder="Enter Employee Id">
                            <span class="input-group-btn">
				        	<button class="btn btn-info" type="button">Go!</button>
				      	</span>
                        </div>
                    </div>
                </div>

                <div id="employeeTable">

                </div>

            </div>
        </div>
    </div>
</div>
	
	