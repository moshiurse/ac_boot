var updateCa;
var deleteCa

$(document).ready(function(){
	
//	-----------  Called Function --------------
	showParent();
    showActiveCa();
	
	
//	----------- End Called Function ------------
	
	
//	-------------  Show Parent Method ------------------
	function showParent(){
		
		$.post("ca/showActive", function(ca){
			
			var option = '<select id="parent" name="parent" class="form-control"><option value="">Select Head</option>';
			
			for(var key in ca){
				option += '<option value="'+ca[key].caId+'"> '+ca[key].caName+'</option>';
			}
			
			option += '</select>';
			
			$("#cadiv").html(option);
		});
	}
	
//	-----------  End show parent --------------


    //	-------------  Show ALL Chart Of Account Method in Table------------------
    function showALLCa(){

        $.post("ca/showAll", function(ca){

            var option = '<table class="table"><thead><tr><th>ID</th><th>Name</th><th>Parent</th>'+
                '<th>Type</th><th>Actions</th></tr></thead><tbody>';

            for(var key in ca){

                option += '<tr><td>'+ca[key].caId+'</td><td>'+ca[key].caName+'</td><td>'+ca[key].caParent+
                    '</td><td>'+ca[key].type+'</td><td><a href=""  onclick="update('+ ca[key].id+",'" + ca[key].caId+ ", '"+ ca[key].caName+", '"+ ca[key].caParent+" '" + ca[key].type+"'" +')"><i class="glyphicon glyphicon-edit"></i>'+
                    '</a><a href=""  onclick="deleteCa('+ ca[key].id+ ')"><i class="glyphicon glyphicon-trash"></i></a></td></tr>';

            }

            option += '</tbody></table>';

            $("#").html(option);
        });
    }

    //	------------- End Show All Chart Of Account Method in Table------------------

/*
    //	-------------  Show Active Chart Of Account Method in Table------------------
    function showActiveCa(){

        $.post("ca/showActive", function(ca){

            var option = '<table class="table"><thead><tr><th>ID</th><th>Name</th><th>Parent</th>'+
                '<th>Type</th><th>Actions</th></tr></thead><tbody>';


            for(var key in ca){
                if(ca[key].caParent == null) {
                    ca[key].caParent = "Head";

                }
                if(ca[key].type == 1){
                    ca[key].type = "Debit";
                }else {
                    ca[key].type = "Credit";

                }
                option += '<tr><td>'+ca[key].caId+'</td><td>'+ca[key].caName+'</td><td>'+ca[key].caParent+
                    '</td><td>'+ca[key].type+'</td><td><a class="btn btn-warning" href="" onclick="updateCa('+ ca[key].id+",'" + ca[key].caId+ ", '"+ ca[key].caName+", '"+ ca[key].caParent+" '" + ca[key].type+"'" +')"><i class="glyphicon glyphicon-edit"></i>'+
                    '</a><a class="btn btn-danger" href=""  onclick="deleteCa('+ ca[key].id+ ')"><i class="glyphicon glyphicon-trash"></i></a></td></tr>';


            }

            option += '</tbody></table>';

            $("#caTable").html(option);
        });
    }

    //	------------- End Show Active Chart Of Account Method in Table------------------

*/


//	------------ Validation Method  ------------------
	
	function validation(){
		
//		----------- Variable Declaration   ---------------
		var headId = $.trim($("#headid").val());
		var headName = $.trim($("#headname").val());
		var parent = $.trim($("#parent").val());
		var type = $.trim($("#type").val());
		
//		-------------  End Variable Declaration ---------------
	
		if(headId <= 0){
			$("#erheadid").val("No Negetive value accepted as Head ID");
			return false;
		}else if(type == 0){
			alert("Plz select a type");
			return false;
		}else{
			return true;	
		}
		
	}
	
	
//	------------ End Validation -------------
	
//	-------------  Save Button Click ---------------- 
	
	$("#create").click(function(event){

		event.preventDefault();

			if(validation()){
				
				var data = {};
				data["caId"] = $.trim($("#headid").val());
				data["caName"] = $.trim($("#headname").val());
				data["caParent"] = $.trim($("#parent").val());
				data["type"] = $.trim($("#type").val());
				data["enable"] = 1;
				data["caCode"] = "ACC";
				// alert(JSON.stringify(data));
				
				$.ajax({
					type: "POST",
					url: "ca/save",
					data: JSON.stringify(data),
					contentType: "application/json; charset=utf-8",
					success: function(){
						$("#successmsg").removeClass("hidden");
						$("#errormsg").addClass("hidden");
						// alert(JSON.stringify(data));
                        showActiveCa();
					},
					error: function(error){
						$("#errormsg").removeClass("hidden");
						$("#successmsg").addClass("hidden");
						alert(error);

					}
				});
			}
				
	});
	
	
//	-------------  Save Button Click ----------------

//	Function Update Chart Of Account

	updateCa =  function(id, caId, caName, type) {

        alert("Update");
        var id = id;
        $("#headid").val(caId);
        $("#headname").val(caName);
        // $("#parent select").val(caParent);
        $("#type").val(type);


    }


// 	End Function Update Chart Of Account

    //	Function Update Chart Of Account

    function deleteca(cId) {

        var id = $("#id").val(cId);
        alert("Are you sure about to delete?");

        $.post("ca/delete",{id:cId},function(data){

            showActiveCa();

            $("#msg").html("Data Deleted Successfully!!");
            $("#msg").removeClass("hidden");
        });
    }


// 	End Function Update Chart Of Account

    //	-------------  Show Active Chart Of Account Method in Table------------------
    function showActiveCa(){

        $.post("ca/showActive", function(ca){

            var option = '<table class="table"><thead><tr><th>ID</th><th>Name</th><th>Parent</th>'+
                '<th>Type</th><th>Actions</th></tr></thead><tbody>';
				var parent,type;
            for(var key in ca){
                if(ca[key].caParent == null) {
					parent = "Head";
                }else{
                    parent = ca[key].caParent;
				}
                if(ca[key].type == 1){
                    type = "Debit";
                }else {
                    type = "Credit";

                }
                option += '<tr><td>'+ca[key].caId+'</td><td>'+ca[key].caName+'</td><td>'+parent+
                    '</td><td>'+type+'</td><td><a class="btn btn-warning" href="" onclick="updateCa('+ca[key].id+','+ca[key].caId+', '+'"+ca[key].caName+"'+', '+ca[key].type+')"><i class="glyphicon glyphicon-edit"></i>'+
                    '</a><a class="btn btn-danger" href=""  onclick="deleteCa('+ ca[key].id+ ')"><i class="glyphicon glyphicon-trash"></i></a></td></tr>';


            }

            option += '</tbody></table>';

            $("#caTable").html(option);
        });
    }

    //	------------- End Show Active Chart Of Account Method in Table------------------


});