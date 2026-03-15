function darkMode() {
    document.getElementsByTagName("body")[0].style.color = "white";
    document.getElementsByTagName("body")[0].style.backgroundColor = "black";
}
function lightMode() {
    document.getElementsByTagName("body")[0].style.color = "black";
    document.getElementsByTagName("body")[0].style.backgroundColor = "white";
}
function buyult() {
    document.getElementById("resim").style.width = "600px";
    document.getElementById("resim").style.height = "600px";
}
function orta() {
    document.getElementById("resim").style.width = "400px";
    document.getElementById("resim").style.height = "400px";
}
function kucult() {
    document.getElementById("resim").style.width = "200px";
    document.getElementById("resim").style.height = "200px";
}
function resmiGoster1(){
    document.getElementById("resim1").style.zIndex = "2";
    document.getElementById("resim2").style.zIndex = "1";
    document.getElementById("resim3").style.zIndex = "1";
}
function resmiGoster2(){
    document.getElementById("resim1").style.zIndex = "1";
    document.getElementById("resim2").style.zIndex = "2";
    document.getElementById("resim3").style.zIndex = "1";
}
function resmiGoster3(){
    document.getElementById("resim1").style.zIndex = "1";
    document.getElementById("resim2").style.zIndex = "1";
    document.getElementById("resim3").style.zIndex = "2";
}
function kenarYuvarla(derece){
    document.getElementById("cerceve").style.borderRadius = derece;
}
function kenarYuvarla0(){
    document.getElementById("cerceve2").style.borderRadius = "0px";
}
function kenarYuvarla10(){
    document.getElementById("cerceve2").style.borderRadius = "10px";
}
function kenarYuvarla25(){
    document.getElementById("cerceve2").style.borderRadius = "25px";
}
function kenarYuvarla50(){
    document.getElementById("cerceve2").style.borderRadius = "50px";
}