$().ready(function () {
    $(".package-green-button").on("click", function () {
    var eachPrice = $(this).closest(".package").data("price");
    // var eachPrice = $(this).parent().parent().parent().data("price");

    var price = $("<p>");
    price.text(eachPrice);
    price.addClass("white-color");

    $(this).after(price);
    $(this).remove();
  });
})