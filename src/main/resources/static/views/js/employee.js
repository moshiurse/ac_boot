$(document).ready(function(){
		
		
		$("#btnClear").click(function(){
			clearForm();
		});
		
		var form = $('#submit_form');
		form.submit(function () {	
			
			var employeeId = document.forms["submit_form"]["employeeId"].value;
		    var employeeName = document.forms["submit_form"]["employeeName"].value;
		    var email = document.forms["submit_form"]["email"].value;
		    var countryId = document.forms["submit_form"]["countryId"].value;
		    
		    if (employeeId == "") {
		        alert("Insert Employee ID ???");
		        $('#employeeId').focus();
		        return false;
		    } else if(employeeName == ""){
		    	alert("Insert Employee Name ???");
		    	$('#employeeName').focus();
		        return false;
		    } else if(email==""){
		    	alert("Insert Valid Email Address ???");
		    	$('#email').focus();
		        return false;
		    }  else if(countryId == "0"){
		    	alert("Select Country ???");
		    	$('#countryId').focus();
		        return false;
		    } else {
		    	$('#btnSubmit').prop('disabled',true);
		    	$.ajax({
					type: form.attr('method'),
					url: form.attr('action'),
					data: form.serialize(),
					success: function (data) {
						$('#btnSubmit').prop('disabled',false);
						if(data==="1"){
						
						//loadGrid();
						clearForm();
						alert("Record Submitted Successfully.");
					} else if(data==="2"){
						
						//loadGrid();
						clearForm();
						alert("Record Updated Successfully.");
					} else {
						alert("Error...");
						}
					}
				});			 
				return false;		    	
		    }		
			
		});
	
	
	function clearForm(){
	    $('#btnSubmit').prop('disabled',false);
	    $("#submit_form").trigger('reset'); 
	    $("#tempId").val('');	    
	}

});