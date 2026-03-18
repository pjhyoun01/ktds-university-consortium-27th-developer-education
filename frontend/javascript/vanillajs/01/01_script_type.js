var button = document.querySelector(".clickable-button");

button.addEventListener("click", function () {
  console.log("버튼 클릭");
});

var div = document.querySelector(".clickable-div");
div.addEventListener("click", function () {
  alert("클릭했습니다");
});
