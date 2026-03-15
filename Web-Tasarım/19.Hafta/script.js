function hesapla() {
    var sayi1 = document.getElementById("sayi1").value;
    var sayi2 = document.getElementById("sayi2").value;
    var sayi3 = document.getElementById("sayi3").value;
    sayi1 = parseInt(sayi1);
    sayi2 = parseInt(sayi2);
    sayi3 = parseInt(sayi3);
    var toplam =sayi1+sayi2+sayi3;
    var fark =sayi1-sayi2-sayi3;
    var carp =sayi1*sayi2*sayi3;
    var bol =sayi1/sayi2/sayi3;
    var ort =(sayi1+sayi2+sayi3)/3;
    if (isNaN(sayi1) || isNaN(sayi2) || isNaN(sayi3)) {
        alert("Lütfen geçerli sayılar giriniz.");
        return;
    }
    document.getElementById("toplam").innerHTML = "Toplam: " + toplam;
    document.getElementById("fark").innerHTML = "Farkı: " + fark;
    document.getElementById("carp").innerHTML = "Çarpım: " + carp;
    document.getElementById("bol").innerHTML = "Bölüm: " + bol;
    document.getElementById("ort").innerHTML = "Ortalaması: " + ort;
}