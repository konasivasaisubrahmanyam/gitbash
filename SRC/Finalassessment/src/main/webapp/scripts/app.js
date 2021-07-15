/**
 * 
 */
document.getElementById("update").disabled=true;
function update(ticketid,byusername,status){
	document.getElementById("update").disabled=false;
	document.getElementById("save").disabled=true;
	console.log(ticketid,byusername,status)
	document.forms[0].ticketid.value=ticketid;
	document.forms[0].byusername.value=byusername;
	document.forms[0].status.value=status;
}

