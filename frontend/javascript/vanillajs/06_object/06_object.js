String.prototype.contains = function (findText) {
  console.log(findText);
  console.log(this);
  return this.indexOf(findText) >= 0;
};

Object.prototype.print = function () {
  console.log("print; ", this);
};
var tempObject = {};
tempObject.print();
console.dir(tempObject);

window.onload = function () {
  var text = "asdasdasd asdasdasd";
  //   console.log(String);

  console.log(text.contains("a"));
  console.log(text.constructor);

  var list = document.querySelector(".list");
  var listItems = [
    { tagName: "li", text: "first", class: "list-item" },
    { tagName: "li", text: "second", class: "list-item" },
    { tagName: "li", text: "third", class: "list-item" },
  ];

  for (var i = 0; i < listItems.length; i++) {
    var item = listItems[i];
    var eachItem = document.createElement(item.tagName);
    eachItem.className = item.class;
    eachItem.innerText = item.text;

    list.appendChild(eachItem);
  }
  //   function calc(param) {
  //     return (param.n1 || 0) + (param.n2 || 0) + (param.n3 || 0);
  //   }

  //   var result = calc({ n1: 1, n3: 3 });
  //   console.log(result);

  //   function getObject() {
  //     return {
  //       price: 10_000,
  //       name: "선풍기",
  //       modelNum: "Q162745",
  //       fan: 5,
  //       chanin: ["GS", "CU", "CJ", "lotte"],
  //       address: {
  //         city: "seoul",
  //         state: "guro",
  //       },
  //     };
  //   }

  //   var headphone = {
  //     model_name: "px7",
  //     "model-name": "qc",
  //     modelName: "XM-5",
  //     manufacture: "Sony",
  //     type: "over-ear",
  //     power: false,
  //     powerOn: function () {
  //       console.log(modelName, "이 켜집니다.");
  //       this.power = true;
  //     },
  //     powerOff: function () {
  //       console.log(modelName, "이 켜집니다.");
  //       this.power = false;
  //     },
  //   };
  //   console.log(headphone, typeof headphone);

  //   console.log(headphone.model_name);
  //   console.log(headphone["model-name"]);
  //   console.log(headphone.modelName);

  //   console.log(headphone.powerOn);
  //   console.log(headphone.powerOff);
};
