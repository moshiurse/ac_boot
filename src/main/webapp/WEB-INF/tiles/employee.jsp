<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<script type="text/javascript" src="/views/js/employee.js"></script>
<link href="views/css/common.css" rel="stylesheet"></link>
<link href="views/css/employee.css" rel="stylesheet"></link>

<div class="row">
	<div class="col-md-7">
		<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Employee Information</h1>
            <hr>
            
            <div class="row alert alert-info" style="margin:20px 0 20px 0;">
				<div class="col-lg-4" align="right"><h4>Search</h4></div>
				<div class="col-lg-8">
					<div class="input-group">
				      	<input type="text" id="empSearch" class="form-control" placeholder="Enter Employee Id">
				      	<span class="input-group-btn">
				        	<button class="btn btn-info" type="button" onclick="funSearchEmployee()">Go!</button>
				      	</span>
					</div>
				</div>
			</div>
			<div id="divDataTable">
				
			</div>	
	
        </div>
        </div>
	</div>
	<div class="col-md-5">
	
	<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Create Employee</h1>
            <hr>
        </div>
        <div class="card-body text-center">
            <form action="">
            
                <div class="form-group">
                	
                	<label class="control-label" for="emname">Employee Name</label>	
                    <input id="empname" name="emname" placeholder="Insert Employee Name" class="form-control" type="text" />
					
                	<span class="error" id="eremname"></span>
                </div>
                
                 <div class="form-group">
                	<label class="control-label" for="emname">Employee Email</label>
                    <input id="empname" name="ememail" placeholder="Insert Employee Email" class="form-control" type="text" />
					<span class="error" id="erememail"></span>
                </div>                
                <div class="form-group">
                	<label>Employee Username </label>
                    <input type="text" class="form-control form-control-lg" placeholder="Username" name="emusername" id="emusername">
                    <span class="error" id="eremusername"></span>
                </div>
                
                <div class="form-group">
                <label>Password </label>
                    <input required type="password" class="form-control form-control-lg" placeholder="Password" name="empassword" id="empassword">
                     <span class="error" id="erempassword"></span>
                </div>
                
                <div class="form-group">
                	<label>Enable</label>
                    <input required type="checkbox" class="" name="enable" id="enable">
                </div>
                      
                <input type="submit" class="btn btn-lg btn-acc" value="Create Employee" id="createuser">
            </form>
        </div>
    </div>
	
	
	</div>
</div>
	
	