// window.onload에 대응되는 코드
// jQuery(document).ready(function () {
// });

// Shorten 표현식
// $(document).ready(function () {});

// $().ready(function () {});

// $(function () {});

$().ready(function () {
  // var h1 = document.querySelector("h1");
  var h1 = $("h1");
  // console.log(h1.innerText);
  console.log(h1.text());
  // h1.innerText = "어디로 가고 싶으신가요?";
  h1.text("어디로 가고 싶으신가요?");

  // p태그의 내용을 가져와 alert으로 출력
  var p = $("p");
  alert(p.text());
  // p태그의 내용을 "다음 여행을 계획해보세요"라고 변경
  p.text("다음 여행을 계획해보세요");
});

// window.onload = function () {
// var h1 = document.querySelector("h1");
// console.log(h1.innerText);

// h1.innerText = "어디로 가고 싶으신가요?";
// };
