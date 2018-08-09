	$(document).ready(function(){
		
//		------- Function Calling   ----------------
		initial();
		checkedBox();
		
//		---------- End Function Calling--------------
		
//		------------ Function Initial UI - -----------------
		
		function initial(){
			$("#bank").prop('disabled', true);
			$("#chequeno").prop('disabled', true);
			$("#mrno").prop('disabled', true);

		}		
//		----------End Of Initial Ui  ---------------

//	-----	CheckBox Event-------------

		function checkedBox(){
			
			$('input[name="transactiontype"]').change(function(){
				if(this.value == 1){
					$("#bank").prop('disabled', true);
					$("#chequeno").prop('disabled', true);
					$("#mrno").prop('disabled', true);
				}else if(this.value == 2){
					$("#bank").prop('disabled', false);
					$("#chequeno").prop('disabled', false);
					$("#mrno").prop('disabled', false);
				}
			});
			
		}
		

//		-------- End CheckBox Event-------------
		
//		-------- Validation -  ---------------
		function validation(){
			var voucherno = $.trim($('#voucherno').val());
			var voucherdate = $.trim($('#vdate').val());
			var chartofaccount = $.trim($('#ca').val());
			var project = $.trim($('#project').val());
			var department = $.trim($('#dept').val());
			var bankname = $.trim($('#bank').val());
			var chequeno = $.trim($('#chequeno').val());
			var mrno = $.trim($('#mrno').val());
			var amount = $.trim($('#amount').val());
			var narration = $.trim($('#narration').val());
			
			var today = new Date();
			alert("Vouycher" + voucherdate);
			alert("today" + today);
			var inputDate = new Date(voucherdate);
			
			if(voucherdate == ""){
				$('#ervdate').text("Date");
				return false;
			}else if(today > inputDate){
				$('#ervdate').text("Date Must be before today");
				return false;
			}else if(chartofaccount == ""){
				$('#ervdate').text("Date");
				return false;
			}else if(project == ""){
				$('#ervdate').text("Date");
				return false;
			}else if(department == ""){
				$('#ervdate').text("Date");
				return false;
			}else if(chartofaccount == ""){
				$('#ervdate').text("Date");
				return false;
			}
			return true;
		}
//		--------- End Validation --------------
		

//--------------------Start - Project Code to combo box----------------------
		function showProject() {
			
			$.post("showProject", function(project){
				
				var option = '<select class="form-control" id="project" name="project"><option value="0">Select</option>';
				
				for(var key in project){
					option += '<option value="'+project[key].projectCode+'"> '+project[key].projectName+'</option>'
				}
				
				option += '</select>';
				
				$("#projectdiv").html(option);
			
			});
		}
//--------------------End - Project Code to combo box----------------------
		
//--------------------Start - Show Bank Account to combo box----------------------
		function showBankAccount() {
			
			$.post("showBankAccount", function(bank){
				
				var option = '<select class="form-control" id="bankacc" name="bankacc"><option value="0">Select</option>';
				
				for(var key in bank){
					option += '<option value="'+bank[key].accountId+'"> '+bank[key].accountId+'</option>'
				}
				
				option += '</select>';
				
				$("#bankaccdiv").html(option);
			
			});
		}
//--------------------End - Show Bank Account to combo box----------------------
		
		// ------------------- Start- Save Button function----------------------------- 
 		 $("#add").click(function(event){
 			 if(validator()){
 				 
 				var row = {};
 				
				 var element = {chartOfAccId:[], debit:[], credit:[],
				 	 chequeNo:[], projectCode:[], mrNo:[], departmentId:[]};
				 	
				 	var data= [];
		 			
		 			element["chartOfAccId"] = $("#controllhead").val();
		 		element["debit"] = $("#debit").val();
		 		element["credit"] = $("#credit").val();
		 		element["chequeNo"] = $("#chequeno").val();
		 		element["projectCode"] = $("#project").val();
		 		element["mrNo"] = $("#mrno").val();
		 		element["departmentId"] = $("#department").val();
		 		
		 		data.push(element);
		 		
		 		alert(JSON.stringify(data));
		 		var duplicate = false;
		 		$('#showtable tbody tr').each(function () {
		        	
			        $controllhead = $(this).find('td:eq(0)').text();
			        if ($controllhead == $('#controllhead').val()) {
			            alert('ERROR DUPLICATE CH');
			           duplicate = true;
			            return;
			        }
			        
			    });
		        
		 		if(duplicate == false ){
		 			var dataTable = '<tbody><tr><td>'+element["chartOfAccId"]+'</td><td>'
						+element["debit"]+'</td><td>'+element["credit"]
						+'</td><td>'+element["chequeNo"]+'</td><td>'+element["projectCode"]
						+'</td><td>'+element["mrNo"]+'</td><td>'+element["departmentId"]
						+'</td></tr></tbody>';
					
 		 		  $("#showtable").append(dataTable);
		 		} else {
		 			alert("You cant add same head more then one");
		 		}
				
			}		
});

// ---------------- End of - Save Button function----------------------


// ------------------ Start - SaveVoucher Button---------------------
	 $("#save").click(function(event){
	 	event.preventDefault();
	
	var data = {};
	var getVoucherDetails= [];
	
	
	
	var i = 1;
	
	$('#showtable tbody tr').each(function(){
		var element = {serialNo:[], chartOfAccId:[],projectCode:[],departmentId:[],debit:[],credit:[], chequeNo:[],mrNo:[]};
		element["serialNo"] = i;
		element["chartOfAccId"] = $(this).find('td:eq(0)').text();
		element["debit"] = $(this).find('td:eq(1)').text();
		element["credit"] = $(this).find('td:eq(2)').text();
		element["chequeNo"] = $(this).find('td:eq(3)').text();
		element["projectCode"] = $(this).find('td:eq(4)').text();
		element["mrNo"] = $(this).find('td:eq(5)').text();
		element["departmentId"] = $(this).find('td:eq(6)').text();
		getVoucherDetails.push(element);
		i++;
	});
	
	
	data["voucherNo"] = $("#voucherid").val();
	data["voucherDate"] = $("#date").val();
	data["narration"] = $("#narration").val();
	data["voucherDetails"] = getVoucherDetails;
	alert(JSON.stringify(data));
	$.ajax({
        type: "POST",
        url: "saveVoucher",
        data: JSON.stringify(data),
        contentType: "application/json; charset=utf-8",             
        success: function (successData) {
       	 alert("Voucher inserted successfully!!");
        },
        error: function (error) {
            alert("FAILED!!!");
            
        }
	}); 
	
	 			
})
// ------------------- End Of  SaveVoucher Button

	
	}); // End of document ready()
