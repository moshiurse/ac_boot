<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="views/js/journal.js"></script>
<link href="views/css/common.css" rel="stylesheet"></link>
<link href="views/css/journal.css" rel="stylesheet"></link>

</head>
<body>

<div class="row">
	<div class="col-md-2"></div>
	<div class="col-md-8">
	
	<div class="card mx-auto text-center card-lg">
        <div class="card-header">
            <h1>Create Journal</h1>
           	<hr>
        </div>
        <div class="card-body">
            <form action="">
            <div class="row">
            <h3></h3>
            </div>   
             <div class="form-group">
                	<div class="row">
                	<div class="text-center">
                	<input name="transactiontype" type="radio" value="1" checked><label>Cash</label>
                	<input name="transactiontype" type="radio" value="2"><label>Bank</label>
                	</div>
                </div>
            
            
            <div class="form-group">
            <label class="col-md-2 control-label">voucher No: </label>
            <div class="col-md-4">
            <input type="number" name="voucherno" id="voucherno" class="form-control">
            </div>
            <label class="col-md-2 control-label">Voucher Date: </label>
            <div class="col-md-4">
            <input required type="text" name="vdate" placeholder="Voucher Date"
             id="vdate" class="form-control">
            <span class="error" id="ervdate"></span>
            </div>
            </div>
            
            <div class="form-group">
			<label class="col-md-2 control-label">Account Head: </label>
            <div class="col-md-4">
            <div id="journalca"></div>
            <span class="error" id="erca"></span>
            </div>
            <label class="col-md-2 control-label">Project: </label>
            <div class="col-md-4">
            <div id="journalproject"></div>
            <span class="error" id="erproject"></span>
            </div>            
            </div>
            
            <div class="form-group">
			<label class="col-md-2 control-label">Department: </label>
            <div class="col-md-4">
            <select id="dept" name="dept" class="form-control">
            <option value="0">Select Department</option>
            <option value="0">Accounts</option>
            <option value="0">Human Resource</option>
            <option value="0">Marketing</option>
            <option value="0">Advertising</option>
            </select>
            <span class="error" id="erdept"></span>
            </div>
            <label class="col-md-2 control-label">Bank Name: </label>
            <div class="col-md-4">
            <select id="bank" name="bank" class="form-control">
            <option value="0">Select Bank</option>
            </select>
            <span class="error" id="erbank"></span>
            </div>
            </div>
            
            <div class="form-group">
			<label class="col-md-2 control-label">Cheque No: </label>
            <div class="col-md-4">
            <input required type="number" name="chequeno" id="chequeno" class="form-control">
            <span class="error" id="erchequeno"></span>
            </div>
            <label class="col-md-2 control-label">Reciept No:  </label>
            <div class="col-md-4">
            <input required type="text" name="mrno" id="mrno" class="form-control">
            <span class="error" id="ermrno"></span>
            </div>            
            </div>
            
            <div class="form-group">
			<label class="col-md-2 control-label">Amount: </label>
            <div class="col-md-10">
            <input required type="number" name="amount" id="amount" class="form-control">
            <span class="error" id="eramount"></span>
            </div>
            </div>
            
            <div class="form-group">
			<label class="col-md-2 control-label">Narration: </label>
            <div class="col-md-10">
            <textarea rows="4" name="narration" id="narration" class="form-control"></textarea>
            <span class="error" id="ernarration"></span>
            </div>
            </div>
                 <input type="submit" class="btn btn-lg btn-acc" value="ADD" id="add">
                 <input type="submit" class="btn btn-lg btn-acc" value="Finish" id="finish">
            
   <table class="table table-bordered text-center">
    <thead>
      <tr>
        <th>Account Head</th>
        <th>Project</th>
        <th>Department</th>
        <th>Debit</th>
        <th>Credit</th>
      </tr>
    </thead>
       <div id="journalTable"></div>
    </table>
    
    <input type="submit" class="btn btn-lg btn-acc" value="Submit to Journal">
    
    </form>
    </div>
    </div>
	</div>
	
	<div class="col-md-2"></div>
</div>


</body>
</html>