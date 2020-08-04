window.addEventListener("load", function(){

	var inputMessage = document.getElementById('input_message');

	var inputCount = document.getElementById('input_count');

	

	var textc=document.getElementById('tc');
	var bgc=document.getElementById('bc');

	var buttonPrint = document.getElementById('button_print');
var cl=document.getElementById('cbtn');
	var outputContxt = document.getElementById('contxt');

	
	buttonPrint.addEventListener("click",function(){
	
	createElements(inputCount.value, inputMessage.value,textc.value,bgc.value,outputContxt);

	});
});


   function createElements(count, message, tc,bc,outputContxt)
 {
	var i;
	for (i = 0; i < count; i++)
 {
		var pTag = document.createElement("p");
	
	var text = document.createTextNode(message);
	
	pTag.appendChild(text);
		
outputContxt.appendChild(pTag);
	}
}


function myFum(){
	
	
	var text=document.getElementById("tc").value;
	var btext=document.getElementById("bc").value;

	document.getElementById('contxt').style.color=text;
	document.getElementById('contxt').style.backgroundColor=btext;
	
}
           
           
           
 function clear(){
                document.getElementById("input_message").value="";
                document.getElementById("input_count").value="";
                document.getElementById("tc").value="";
                document.getElementById("bc").value="";
                document.getElementById("contxt").value=""; 
            }