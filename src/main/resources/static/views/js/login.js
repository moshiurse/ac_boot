
$(document).ready(function(){
	
//	-------------  Method Called ----------------
	showCompany();
	
	
//	---------------  End Method Called ------------
	
// --------------- ShowCompany  ----------------
	function showCompany(){
		$.post("showCompany", function(cm){
			
var option = '<select id="company" name="company" class="form-control"><option value="0">Select Company</option>';
			
			for(var key in cm){
				option += '<option value="'+cm[key].id+'"> '+cm[key].companyName+'</option>';
			}
			
			option += '</select>';
			alert(option);
			$("#divcompany").html(option);

			
		});
		
	}
	
//	-------------- end Show Company  -------------
	
	
	
});