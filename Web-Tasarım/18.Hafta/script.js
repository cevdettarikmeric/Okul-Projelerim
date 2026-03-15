function kareAl(a) {
    var sayi = a.value;
    var sonuc = sayi * sayi;
    document.getElementById("sonuc").innerHTML = sonuc;
}

function hesapla() {
    var sayi1 = document.getElementById("sayi1").value;
    var sayi2 = document.getElementById("sayi2").value;
    sayi1 = parseInt(sayi1);
    sayi2 = parseInt(sayi2);
    var toplam =sayi1+sayi2;
    var fark =sayi1-sayi2;
    var carp =sayi1*sayi2;
    if (isNaN(sayi1) || isNaN(sayi2)) {
        alert("Lütfen geçerli sayılar giriniz.");
        return;
    }
    document.getElementById("toplam").innerHTML = "Toplam: " + toplam;
    document.getElementById("fark").innerHTML = "Farkı: " + fark;
    document.getElementById("carp").innerHTML = "Çarpım: " + carp;
}

function megaBayt(a){
    var sonuc=0;
    sonuc = a * 1024; 
    return sonuc;
}
var x = megaBayt(5);
alert(x);

function birlestir(ad,soyad){ 
    var adSoyad=ad+" "+soyad; 
    return adSoyad;
}
var y=birlestir("Cevper","Koç");
alert(y);

function islem() {
    var sayi4 = document.getElementById("sayi4").value;
    var sayi5 = document.getElementById("sayi5").value;
    var sayi6 = document.getElementById("sayi6").value;
    var sonuc = hesapla2(sayi4, sayi5, sayi6);
    alert("Çarpım: " + sonuc);
}
function hesapla2(a,b,c){
    var islem=a*b*c;
    return islem;
}

function mesajGonder(){
    var mesaj=document.getElementById("mesaj").value;
    var d = new Date();
    var saat=d.getHours();
    var dakika=d.getMinutes();
    document.getElementById("mesajKutulari").innerHTML+=
    "<div class='gidenMesaj'> <img src='profile.jfif'>"
    + mesaj +
    "<span id='tarih'>"+saat+":"+dakika+"</span></div>";
    document.getElementById("mesaj").value="";
}
