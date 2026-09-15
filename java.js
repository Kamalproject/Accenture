function clicktounable(){
    var text=document.getElementById("text");

    var btn=document.getElementById("btn");

    btn.disabled=!text.checked;
}