	$(document).ready(function(){
		
//		------- Function Calling   ----------------
		initial();
		checkedBox();
		
//		---------- End Function Calling--------------
		
//		------------ Function Unitial UI - -----------------
		
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
		
//		-------------- Add Click event  -------- ----
		$('#add').click(function(event){
			
			if(validation()){
				
				alert("successfull");
			}else {
				alert("Failed");
			}
		});
		
//		------------ End Add Click Event   ----------------
	
	}); // End of document ready()
