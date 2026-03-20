$().ready(function () {
    $(".add-row-button").on("click", function () {
        if ($(this).next()[0].value) {
            $(".list").append($("<li>").text($(this).next()[0].value));
        }
        $(this).next()[0].value = null;
    })

    $(".list").on("dblclick", 'li', function () {
        $(this).remove();
    })
});

// window.onload = function () {
//   var button = document.querySelector(".add-row-button");

//   var inputText = document.querySelector("input[type='text']");
//   button.addEventListener("click", function () {
//     var value = inputText.value;
//     var list = document.querySelector(".list");
//     var listItem = document.createElement("li");
//     listItem.innerText = value;

//     listItem.addEventListener("dblclick", function (event) {
//       list.removeChild(event.target);
//     });

//     list.appendChild(listItem);
//     inputText.value = ""; // null or ""
//   });
// };
