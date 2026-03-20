$().ready(function () {
    $("li").text("서울");
    //   클래스가 promo인 것의 텍스트를 부산으로 변경
    $(".promo").text("부산");

    $("#destinations > li:nth-child(2)").text("경주");

});

// window.onload = function () {
//   var listItems = document.querySelectorAll("li");

//   for (var i = 0; i < listItems.length; i++) {
//     listItems[i].innerText = "서울";
//   }
// };
