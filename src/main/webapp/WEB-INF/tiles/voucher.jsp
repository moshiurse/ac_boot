
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Deposit Voucher</title>

<link href="<c:url value='/static/css/voucher.css' />" rel="stylesheet">
<script src="<c:url value='/static/js/voucher.js' />"></script>

</head>
<body>


	
<div class="container">
	
 <div class="row">
 
 <!-- Page Header -->
 <div class="col-lg-12">
 	<div class="card">    
    <h2 class="card-header">Payment Deposit Voucher </h2> 
    </div>
    </div>
    <!-- ALert -->
    <div class="col-lg-12">
    <div id="successMessage" align="center" class="invisible alert alert-success"></div>
	<div id="errorMessage" align="center" class="invisible alert alert-danger"></div>  
    </div>
    
    <!-- Check Voucher Type & Name -->
    <div class="card col-lg-12 headvoucher">
    <div class="form-inline ">
    
 
    <input type="radio" class="voucher form-control" name="voucher" value="1" checked="checked">Payment
    <input type="radio" name="voucher form-control" class="voucher" value="2">Receive

            <label class="control-label">Vno</label>
            <input class="form-control" type="text" name="voucherid" id="voucherid">
            <label class="control-label">Date</label>
            <input class="form-control" type="text" name="date" id="date">
            
            
        <input type="radio" name="transaction" class="transaction form-control" value="1" checked="checked">Cash 
        <input type="radio" name="transaction" class="transaction form-control" value="2">Bank
            
    </div>
    </div>
           
 
<!-- 
         
        
        
        <div class="panel-body">
            <div class="col-md-12">
            
            <div class="col-md-2" style="padding-bottom: 5px">
            <label>Project : </label></div>
            <div class="col-md-10" id="projectdiv"></div>
           
            </div>
            
            <div class="col-md-12">
            
            <div class="col-md-2" style="align-content: right">
                <label>Department : </label></div>
            <div class="col-md-10">
				<select name="department" class="form-control" id="department">
				    <option value="">Select...</option>
				    <option value="SWE">SWE</option>
				    <option value="CSE">CSE</option>
				    <option value="EEE">EEE</option>
                </select>
				</div>
				</div>
            
            <div class="col-md-12">
            
            <div class="col-sm-2" style="padding: 5px">
            <label>Bank Account :</label></div>
            <div class="col-sm-10" id="bankaccdiv">
            <input type="text" id="bankacc" class="form-control" name="bankacc">
            </div>
            </div>
            
            <div class="col-md-12">
                
                
                <div class="col-md-2" >
				<label>Cheque No: </label></div>
				<div class="col-md-4">
				<input type="text" class="form-control" name="chequeno" id="chequeno"></div>

				
				<div class="col-md-2">
				<label>MR. No :</label></div>
				<div class="col-md-4">
				<input type="text" class="form-control" name="mrno" id="mrno"></div>

            </div>
            
            <div class="col-md-12">
            <div class="form-group">
                <div class="col-md-2">
				<label>Control Head : </label></div>
				<div class="col-md-10" id="controllheaddiv">
				
				</div>
            </div>
            </div>
            
             <div class="col-md-12">
                 
				<div class="col-md-2">
                    <label>Amount</label></div>
				<div class="col-md-10">
				<input type="text" class="form-control" name="amount" id="amount">
				</div>
        </div>
        
            <div class="col-md-12">
            <input type="submit" value="Add" name="add" id="add" class="btn btn-lg btn-success col-md-offset-5 col-md-3">
            </div>
                 
        </div>
        
        <div class="col-md-12">
        
			<div class="panel panel-body">
					<table class="table" id="showtable">
					<thead>
						<tr>
							<th>ACCOUNT HEAD</th>
							<th>DEBIT</th>
							<th>CREDIT</th>
							<th>CHEQUE</th>
							<th>PROJECT NAME</th>
							<th>MR.NO</th>
							<th>DEPT NAME</th>
						</tr>
						<tr class="hidden">
							<td id="ch"></td>
							<td id="opdebit"></td>
							<td id="opcredit"></td>
							<td id="opcheque"></td>
							<td id="opproject"></td>
							<td id="opmrno"></td>
							<td id="opdept"></td>
						</tr>
						</thead>
					</table>
                    </div>
            </div>
        
        <div class="row">
        <div class="panel-body">
            <div class="col-md-6"></div>
            <div class="col-md-3">
            <label>Total Balance : </label>
            <label id="total">0</label>
            </div>
            <div class="col-md-3"></div>
        </div>
        </div>
        
        <div class="col-md-12">
        <div class="panel panel-body">
        <div class="col-sm-2">
        <label>Narration: </label></div>
        <div class="col-sm-10">
		<textarea class="form-control" name="narration" rows="5" id="narration" class="col-sm-10"></textarea>
		</div>
            
        </div>
        </div>
        
        <div class="col-md-12">
        <div class="panel panel-body">
            
        <div class="col-sm-5"></div>
        <div class="col-sm-1">
        <input type="submit" class="btn btn-danger" name="clear" value="CLEAR" id="clear">
        </div>
        <div class="col-sm-3">
        <input type="submit" name="save" value="SAVE"
        class="btn btn-success" id="save">
        </div>
        <div class="col-sm-3"></div>
        </div>
        </div>
        
       </div> 
    </div>
    <div class="col-md-1"></div> -->
    </div>
	</div>
</body>
</html>

<!-- 
Journal


<div class="col-md-8 col-md-offset-2">
	<form>
<div class="panel panel-primary">
      <div class="panel-heading"><b>JOURNAL</b></div>
      <div class="panel-body">
      
	      <div class="col-md-12">
	      			<div id="successMessage" align="center" class="hidden alert alert-success"></div>
					<div id="errorMessage" align="center" class="hidden alert alert-danger"></div>
		      <div class="row">
		      		<div class="form-group">
		      			<div class="col-md-6">
			      			<label class="control-label col-md-4" style="padding-top:5px; align:right;">Voucher ID:</label>
			      			<div class="col-md-8">
			      			<input type="text" id="voucherid" class="form-control">
			      			</div>
		      			</div>
		      			<div class="col-md-6">
			      			<label class="control-label col-md-4" style="padding-top:5px; align:right;">Date:</label>
			      			<div class="col-md-8">
			      			<input type="text" id="date" class="form-control">
			      			</div>
		      			</div>		
		      		</div>
		      </div>
	      </div>
	      <div class="col-md-12" style="padding-top:5px;">
		      <div class="row">
		      		<div class="form-group">
		      			<div class="col-md-6">
			      			<label class="control-label col-md-4" style="padding-top:5px; align:right;">Project:</label>
			      			<div class="col-md-8">
			      			<input type="text" id="project" class="form-control">
			      			</div>
		      			</div>
		      			<div class="col-md-6">
			      			<label class="control-label col-md-4" style="padding-top:5px; align:right;">Client:</label>
			      			<div class="col-md-8">
			      			<select name="parent" id="client" class="form-control">
					      			<option value="none">Select</option>
					      			<option value="1">1</option>
					      			<option value="1">1</option>
					      		</select>
			      			</div>
		      			</div>		
		      		</div>
		      </div>
	      </div>
	      <div class="col-md-12" style="padding-top:5px;">
		      <div class="row">
		      		<div class="form-group">
		      			<div class="col-md-6">
			      			<label class="control-label col-md-4" style="padding-top:5px; align:right;">Department:</label>
			      			<div class="col-md-8">
			      			<select name="parent" id="dept" class="form-control">
					      			<option value="none">Select..</option>
					      			<option value="1">1</option>
					      			<option value="1">1</option>
					      		</select>
			      			</div>
		      			</div>
		      			<div class="col-md-6">
			      			<label class="control-label col-md-4" style="padding-top:5px; align:right;">Bill/Inv.No:</label>
			      			<div class="col-md-8">
			      			<input type="text" id="invno" class="form-control">
			      			</div>
		      			</div>
		      					
		      		</div>
		      </div>
	      </div>
	      <div class="col-md-12" style="padding-top:5px;">
	      		<div class="row">
		      		<div class="form-group">
		      			<div class="col-md-12">
			      			<label class="control-label col-md-2" style="padding-top:5px; align:right;">Control Head:</label>
			      			<div class="col-md-10">
			      			<input type="text" id="chead" class="form-control">
			      			</div>
		      			</div>
		      					
		      		</div>
		      </div>
	      </div>
	      <div class="col-md-12" style="padding-top:5px;">
		      <div class="row">
		      		<div class="form-group">
		      			<div class="col-md-6">
			      			<label class="control-label col-md-4" style="padding-top:5px; align:right;">Debit:</label>
			      			<div class="col-md-8">
			      			<input type="text" id="debit" class="form-control">
			      			</div>
		      			</div>
		      			<div class="col-md-6">
			      			<label class="control-label col-md-4" style="padding-top:5px; align:right;">Credit:</label>
			      			<div class="col-md-8">
			      			<input type="text" id="credit" class="form-control">
			      			</div>
		      			</div>		
		      		</div>
		      </div>
	      </div>
      
      </div>
    </div>
    <div class="col-md-12">
    <div class="panel panel-info">
      <div class="panel-body">
		      <table class="table table-bordered" style="height:100%;">
		    <thead>
		      <tr>
		        <th>ACCOUNT HEAD</th>
		        <th>DEBIT</th>
		        <th>CREDIT</th>
		        <th>PROJECT NAME</th>
		        <th>CLIENT</th>
		        <th>DEPT. NAME</th>
		        <th>BILL</th>
		      </tr>
		    </thead>
		    <tbody>
		      <tr>
		        <td>John</td>
		        <td>Doe</td>
		        <td>John</td>
		        <td>Doe</td>
		        <td>Doe</td>
		        <td>John</td>
		        <td>Doe</td>
		        
		      </tr>
		      <tr>
		        <td>Mary</td>
		        <td>John</td>
		        <td>Doe</td>
		        <td>Doe</td>
		        <td>John</td>
		        <td>Doe</td>
		        <td>Moe</td>
		        
		      </tr>
		      <tr>
		        <td>July</td>
		        <td>Dooley</td>
		        <td>John</td>
		        <td>Doe</td>
		        <td>Doe</td>
		        <td>John</td>
		        <td>Doe</td>
		        
		      </tr>
		    </tbody>
		  </table>
      </div>
    </div>
    </div>
    <div class="col-md-12">
    <div class="panel panel-info">
      <div class="panel-body">
		     <div class="row">
		      		<div class="form-group">
		      			<div class="col-md-6">
			      			<label class="control-label col-md-4" style="padding-top:5px; align:right;"></label>
			      			<div class="col-md-8">
			      			<input type="text" class="form-control">
			      			</div>
		      			</div>
		      			<div class="col-md-6">
		      				<div class="col-md-8">
			      			<input type="text" class="form-control">
			      			</div>
			      			<label class="control-label col-md-4" style="padding-top:5px; align:right;"></label>
			      			
		      			</div>		
		      		</div>
		      </div>
      </div>
    </div>
    </div>
    <div class="col-md-12">
    <div class="panel panel-info">
      <div class="panel-body">
		     <div class="row">
		      		<div class="form-group">
		      			<div class="col-md-12">
			      			<label class="control-label col-md-2" style="padding-top:5px; align:right;">Naration:</label>
			      			<div class="col-md-10">
			      			<input type="text" class="form-control">
			      			</div>
		      			</div>	
		      		</div>
		      </div>
      </div>
    </div>
    </div>
    <div class="col-md-12">
    		<div class="panel-body">
					<div class="row">
						<div class="col-md-6 col-md-offset-5">
						<button id="submit" name="submit" class="btn btn-primary">Save</button>
						<input id="btnClear" type="button" name="btnClear" value="Clear" class="btn btn-warning" />
						</div>
					</div>
				</div>
    </div>
    </form>
</div>


 -->
