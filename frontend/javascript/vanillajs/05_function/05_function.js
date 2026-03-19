// ss

window.onload = function () {
  for (var i = 0; i < dataCount; i++) {
    (function (num) {
      var eachItem = document.createElement("li");
      eachItem.innerText = num;

      eachItem.addEventListener("click", function () {
        alert("추가됨", eachItem);
      });
    })(100);
  }

  function clac(num1, num2) {
    return num1 + num2;
  }

  // printCalcResult(20, 10, "+");
  // printCalcResult(20, 10, "-");
  // printCalcResult(20, 10, "*");
  // printCalcResult(20, 10, "/");

  // getAddResult(100, 200);

  // 호출
  function printCalcResult(num1, num2, operator) {
    if (operator == "+") {
      console.log(getAddResult(num1, num2));
    } else if (operator == "-") {
      console.log(getSubResult(num1, num2));
    } else if (operator == "*") {
      console.log(getMulResult(num1, num2));
    } else if (operator == "/") {
      console.log(getDevResult(num1, num2));
    }

    // 임시
    function getAddResult(num1, num2) {
      return num1 + num2;
    }
    function getSubResult(num1, num2) {
      return num1 - num2;
    }
    function getMulResult(num1, num2) {
      return num1 * num2;
    }
    function getDevResult(num1, num2) {
      return num1 / num2;
    }
  }

  // function printSumResult(from, to) {
  //   var sum = 0;
  //   for (var i = from; i < to; i++) {
  //     sum += i;
  //   }
  //   return sum;
  // }

  // if (confirm("결과 확인?")) {
  //   alert(printSumResult(1, 19));
  // }
};
