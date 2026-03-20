window.onload = function () {
  var a = document.querySelector(".count");
  var number = parseInt(a.innerText);

  var add = document.querySelector(".add");
  add.addEventListener("click", function () {
    a.innerText = ++number;
  });

  var sub = document.querySelector(".sub");
  sub.addEventListener("click", function () {
    a.innerText = --number;
  });
};
