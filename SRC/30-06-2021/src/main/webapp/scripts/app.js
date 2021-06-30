/**
 * 
 */
document.getElementById("update").disabled=true;
function update(sno,name,place){
	document.getElementById("update").disabled=false;
	document.getElementById("save").disabled=true;
	console.log(sno,name,place)
	document.forms[0].sno.value=sno;
	document.forms[0].name.value=name;
	document.forms[0].place.value=place;
}

function deletedata(sno){
	location.href="simpleform.do?id="+sno+"&method=delete";
}