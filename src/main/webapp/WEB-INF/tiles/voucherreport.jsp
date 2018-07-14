<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
	<head>
		<title><c:out value="${title}"/></title>
		<style type="text/css">
			@media print {    
				.no-print, .no-print * {
					display: none !important;
				}
			}
			
			@media screen {
			  table.divFooter {
				display: none;
			  }
			}
			@media print {
			  table.divFooter {
				position: fixed;
				bottom: 0;
			  }
			}
			
			.pagebreak { page-break-before: always; }
			
			table.gridtable {
				font-family: "Times New Roman", Times, serif;	
				font-size:12px;
				color: #000000;
				border-width: 1px;
				border-color: #000000;
				border-collapse: collapse;
				width:800px;
				margin-top:10px;
			}
			
			table.gridtable th {
				border-width: 1px;
				padding: 3px;
				border-style: solid;
				border-color: #000000;
				background-color: #dedede;
			}
			
			table.gridtable td {
				border-width: 1px;
				padding: 3px;
				color: #000000;
				border-style: solid;
				border-color: #000000;
				background-color: #ffffff;
			}
			
			
			</style>
	</head>

	

<body>
	
	<table align="center" width="800px">
		<tr>
			<td align="left" width="10%">
				<button class='no-print' onclick="window.print()">Print</button>
			</td>
			<td width="80%" align="center">			
				<table>
					<tr><td align="center"><img src="<c:url value='/static/images/diulogo.png' />"  style="width:230px;margin-left:0px;height:50px;"/></td></tr>
					<tr><td align="center"><b style="font-size:18px;">Report Title</b><td></tr>					
				</table>		
			</td>
			<td width="10%">
				
			</td>
		</tr>
		
	</table>
	
	
	<table align="center" class="gridtable">	
	
		<tr>		
			<th align="center" width="15%">SL. NO.</th>
			<th align="center" width="15%">Account Head</th>
			<th align="center" width="15%">Project</th>	
<!-- 			<th align="center" width="40%">Debit</th>
			<th align="center" width="30%">Credit</th>	 -->	
		</tr>
		
		<c:set var="count" value="0" scope="page" />
		
		<c:forEach var="itm" items="${headList}">
           	<c:set var="count" value="${count + 1}" scope="page"/>           	
           	<tr>
           	  
           	  <%-- <td align="center"><c:out value="${count}"/></td> --%>
           	  <td align="center"><c:out value="${itm.serialNo}"/></td>
           	  <td align="center"><c:out value="${itm.chartOfAccId}"/></td>
              <td align="center"><c:out value="${itm.projectCode}"/></td>
              <td align="center"><c:out value="${itm.debit}"/></td>
              <td align="center"><c:out value="${itm.credit}"/></td>     
            </tr>           
         </c:forEach> 
	
	</table>
	
	


	

		
		
	
	
	
	

</body>

</html>





