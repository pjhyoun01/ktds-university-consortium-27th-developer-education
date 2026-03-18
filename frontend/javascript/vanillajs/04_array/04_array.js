window.onload = function () {
  // var a = {};
  // console.log(a);
  // a = {
  //   a: "aaa",
  //   b: "asd",
  //   c: 1,
  //   b: { a: "da", b: "db", c: 2 },
  // };
  // console.log(a);

  // console.log(a.a);

  // console.log(a.b);

  var a = [];
  var push = document.querySelector(".push");
  var pop = document.querySelector(".pop");
  var unshift = document.querySelector(".unshift");
  var shift = document.querySelector(".shift");

  push.addEventListener("click", function () {
    a.push(a.length + 1);
    console.log(a);
  });
  pop.addEventListener("click", function () {
    var value = a.pop();
    console.log(value, a);
  });
  unshift.addEventListener("click", function () {
    a.unshift(a.length + 1);
    console.log(a);
  });
  shift.addEventListener("click", function () {
    var value = a.shift();
    console.log(value, a);
  });
};
