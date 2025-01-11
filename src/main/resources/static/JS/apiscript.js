console.log("hare krishna")
let element=document.querySelector("#left");

let nodisp=document.querySelector("#nodisp");

let current=document.querySelector("#current");
let forcast=document.querySelector("#forcast");
let astronomy=document.querySelector("#astronomy");

let first=document.querySelector("#first");
let second=document.querySelector("#second");
let third=document.querySelector("#third");

current.addEventListener("click",()=>{
	first.classList.remove("nodisp")	
	first.classList.add("disp");
	
	if(second.classList.contains("disp")){	
		second.classList.remove("disp");	
		second.classList.add("nodisp");	
	}

	if(third.classList.contains("disp")){	
		third.classList.remove("disp");	
		third.classList.add("nodisp");	
	}
})
	
forcast.addEventListener("click",()=>{
	second.classList.remove("nodisp")	
	second.classList.add("disp");	

	if(first.classList.contains("disp")){	
		first.classList.remove("disp");	
		first.classList.add("nodisp");	
	}

	if(third.classList.contains("disp")){	
		third.classList.remove("disp");	
		third.classList.add("nodisp");	
	}

})

astronomy.addEventListener("click",()=>{
	third.classList.remove("nodisp")	
	third.classList.add("disp");	

	if(second.classList.contains("disp")){	
		second.classList.remove("disp");	
		second.classList.add("nodisp");	
	}

	if(first.classList.contains("disp")){	
		first.classList.remove("disp");	
		first.classList.add("nodisp");	
	}

})