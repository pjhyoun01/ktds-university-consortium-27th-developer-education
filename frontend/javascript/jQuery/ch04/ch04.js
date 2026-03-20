$().ready(function () {
  $(".package-green-button").on("click", function () {
    var price = $("<p>");
    price.text("From $339.99");
    $(".package-green-button").after(price);
    $(".package-green-button").remove();
  });

  $(".contact").on("click", function () {
    // var result = $(".package").children().children(".package-deal-comment");
    // for (var i = 0; i < result.length; i++) {
    //   console.log(result[i].textContent);
    // }

    // $(this).prev().find(".package-deal-comment").each(function(){
    //     console.log($(this).text());
        
    // })
  });
});
