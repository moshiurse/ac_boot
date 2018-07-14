	$(document).ready(function(){
		
		//viewData();
		function validator(){
			
			var voucherid	= $.trim($("#voucherid").val());
			var date	= $.trim($("#date").val());
			var project	= $.trim($("#project").val());
			var client	= $.trim($("#client").val());
			var dept	= $.trim($("#dept").val());
			var invno	= $.trim($("#invno").val());
			var chead	= $.trim($("#chead").val());
			var debit	= $.trim($("#debit").val());
			var credit	= $.trim($("#credit").val());
			
			if(voucherid == ""){		
		   	 	$("#errorMessage").html("Please enter Voucher Id.");
		   	    $("#errorMessage").removeClass("hidden");
		   	 	
		   	    
		   	    $("#successMessage").addClass("hidden");	         	      	 
		        return false;		                
			}
			if(date == ""){		
		   	 	$("#errorMessage").html("Please enter Date.");
		   	    $("#errorMessage").removeClass("hidden");
		   	 	
		   	    
		   	    $("#successMessage").addClass("hidden");	         	      	 
		        return false;		                
			}
			if(project == ""){		
		   	 	$("#errorMessage").html("Please enter Project Data.");
		   	    $("#errorMessage").removeClass("hidden");
		   	 	
		   	    
		   	    $("#successMessage").addClass("hidden");	         	      	 
		        return false;		                
			}
			if(client == "none"){		
		   	 	$("#errorMessage").html("Please Selcet a Client.");
		   	    $("#errorMessage").removeClass("hidden");
		   	 	
		   	    
		   	    $("#successMessage").addClass("hidden");	         	      	 
		        return false;		                
			}
			if(dept == "none"){		
		   	 	$("#errorMessage").html("Please Select a Department.");
		   	    $("#errorMessage").removeClass("hidden");
		   	 	
		   	    
		   	    $("#successMessage").addClass("hidden");	         	      	 
		        return false;		                
			}
			if(invno == ""){		
		   	 	$("#errorMessage").html("Please enter Invoice No.");
		   	    $("#errorMessage").removeClass("hidden");
		   	 	
		   	    
		   	    $("#successMessage").addClass("hidden");	         	      	 
		        return false;		                
			}
			if(chead == ""){		
		   	 	$("#errorMessage").html("Please enter Control Head number.");
		   	    $("#errorMessage").removeClass("hidden");
		   	 	
		   	    
		   	    $("#successMessage").addClass("hidden");	         	      	 
		        return false;		                
			}
			if(debit == ""){		
		   	 	$("#errorMessage").html("Please enter Debit number.");
		   	    $("#errorMessage").removeClass("hidden");
		   	 	
		   	    
		   	    $("#successMessage").addClass("hidden");	         	      	 
		        return false;		                
			}
			if(credit == ""){		
		   	 	$("#errorMessage").html("Please enter Credit number.");
		   	    $("#errorMessage").removeClass("hidden");
		   	 	
		   	    
		   	    $("#successMessage").addClass("hidden");	         	      	 
		        return false;		                
			}
			return true;
		}
		
		
		/* Submitting form to controller*/
		$("#submit").click(function(event) {		
			
			event.preventDefault();
			
			
			if (validator()){
				var data = {};
				data["voucherid"] = $("#voucherid").val();
				data["date"] = $("#date").val();
				data["project"] = $("#project").val();
				data["client"] = $("#client").val();
				data["dept"] = $("#dept").val();
				data["invno"] = $("#invno").val();
				data["chead"] = $("#chead").val();
				data["debit"] = $("#debit").val();
				data["credit"] = $("#credit").val();
				alert(JSON.stringify(data));
				$("#successMessage").removeClass("hidden");
	
			} // End of validation		
		}); // End of form submission
	
	
	}); // End of document ready()
