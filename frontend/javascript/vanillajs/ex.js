window.onload = function () {
  // function clac() {
  //   for (var i = 0; i < arguments.length; i++) {
  //     arguments[i] = 100 + i;
  //     arguments[arguments.length + i] = 1000 + i;
  //   }
  //   arguments.length = 1;
  //   console.log("arguments: ", arguments);
  //   console.log("arguments type: ", typeof arguments);
  //   console.log("arguments prototype: ", arguments.prototype);
  //   return arguments;
  // }
  // var result = clac(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  // var a = [11, "22", 11];
  // console.log("array", a);
  // console.log("array type: ", typeof a);
  // console.log("array prototype: ", a.prototype);
  // var b = {
  //   a: 11,
  //   b: "asd",
  //   1: "asd",
  // };
  // console.log("object", b);
  // console.log("object type: ", typeof b);
  // console.log("object prototype: ", b.__proto__.constructor);

  var a = [11, 12, 13];
  var b = [11, "aa", 12, "bb"];
  var c = [];
  var d = { 0: 11, 1: 12, 2: 13 };
  var e = {};
  var f;
  var g = null;
  var h = undefined;

  console.log(typeof a);
  console.log(typeof b);
  console.log(typeof c);
  console.log(typeof d);
  console.log(typeof e);
  console.log(typeof f);
  console.log(typeof g);
  console.log(typeof h);

  console.log(a.__proto__.constructor);
  console.log(b.__proto__.constructor);
  console.log(c.__proto__.constructor);
  console.log(d.__proto__.constructor);
  console.log(e.__proto__.constructor);
  console.log(f.__proto__.constructor);
  console.log(g.__proto__.constructor);
  console.log(h.__proto__.constructor);

  // var value = 0;
  // var add = document.querySelector(".up");
  // var down = document.querySelector(".down");
  // var num = document.querySelector(".num");
  // num.innerText = value;

  // add.addEventListener("click", function () {
  //   value++;
  //   num.innerText = value;
  // });
  // down.addEventListener("click", function () {
  //   value--;
  //   num.innerText = value;
  // });
};
