$(document).ready(function(){
	
//	-------------  Make PDF -------------------
	
	var doc = new jsPDF('p', 'mm', 'a4');

	// We'll make our own renderer to skip this editor


	    $('#pdf').click(function () {
	        doc.fromHTML($('#content').get(0), 15,15 , {
		'width': 170
	});
	        doc.save('Trial.pdf');
	    });

	
//	------------ End Make Pdf -------------------
	
	$("#showtrial").click(function(event){
		
		var startdate = $("#")
		
		$.post("/report/trialbalance", function(tb){
		var table = '<table class="table table-bordered text-center" id="showtable"><thead><tr><th>Account Name</th><th>Debit</th><th>Credit</th></tr></thead>';
		for(var key in tb){
			table += '<tbody><tr><td>'+tb.caName+'</td><td>'+tb.debit+'</td><td>'+tb.credit+'</td>';
		}
	    var debit= 0;
	    var credit= 0;
		$("#showtable tbody tr").each(function(){
			var db = $(this).find('td:eq(1)').text();
			var cb = $(this).find('td:eq(2)').text();
			
			debit += parseFloat(db);
			credit += parseFloat(cb);
		});
		
		table+= '<tr><td><b>Totals</b></td><td>+debit+</td><td>+credit+</td></tr></tbody></table>';
		$("#dataTable").html(table);
		});
		
		
	});
});