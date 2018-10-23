<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="/views/js/chartofaccount.js"></script>
<link href="views/css/common.css" rel="stylesheet"></link>
<link href="views/css/chartofaccount.css" rel="stylesheet"></link>

</head>
<body>
<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-8">
	
	<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Create Chart Of Account!</h1>
            <hr>
            <div class="hidden alert-success" id="successmsg">Successfully Inserted Data</div>
            <div class="hidden alert-danger" id="errormsg">Failed to Insert</div>
        </div>
        <div class="card-body text-center">
            <form action="">
            
            	<div class="form-group">
                	<label>Head Id </label>
                    <input required type="number" class="form-control form-control-lg" placeholder="Head ID" name="headid" id="headid">
                    <span class="error" id="erheadid"></span>
           		</div>
                <div class="form-group">
                	<label>Head Title</label>
                    <input required type="text" class="form-control form-control-lg" placeholder="Head name" name="headname" id="headname">
                    <span class="error" id="erheadname"></span>
                </div>
                
                <div class="form-group">
                	<label>Parent</label>
                	<div id="cadiv"></div>
                    <span class="error" id="erparent"></span>
                </div>
                <div class="form-group">
                	<label>Type</label>
                	<select id="type" class="form-control">
                	<option value="0">Select</option>
                	<option value="1">debit</option>
                	<option value="2">credit</option>
                	</select>
                    <span class="error" id="ertype"></span>
                </div>
                          
                <input type="submit" class="btn btn-lg btn-acc" value="Create Head" id="createhead">
            </form>
        </div>
    </div>
	
	
	</div>
</div>

</body>
</html>