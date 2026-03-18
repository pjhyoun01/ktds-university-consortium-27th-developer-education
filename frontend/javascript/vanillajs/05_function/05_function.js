window.onload = function () {
  function clac(num1, num2) {
    return num1 + num2;
  }

  var result = clac(10, 30);
  console.log(result);

  result = clac(10, 30, 100);
  console.log(result);

  result = clac("", "");
  console.log(result);

  result = clac("", 0);
  console.log(result);

  result = clac("", null);
  console.log(result);

  result = clac("", undefined);
  console.log(result);

  result = clac(undefined, null);
  console.log(result);

  result = clac(0, null);
  console.log(result);

  result = clac(0, undefined);
  console.log(result);
};
