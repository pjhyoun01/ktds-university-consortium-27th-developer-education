$().ready(function () {
    // 새로운 p태그를 만든다 내용은 after라고 한다
    // 새로운 p태그 wrapper 바깥 아래쪽에 위치한다
    var newP1 = $("<p>");
    newP1.text("after");
    $(".wrapper").after(newP1);
    
    // 새로운 p태그를 만든다 내용은 before라고 한다
    // 새로운 p태그 wrapper 바깥 위쪽에 위치한다
    var newP2 = $("<p>");
    newP2.text("before");
    $(".wrapper").before(newP2);
    
    // 새로운 p태그를 만든다 내용은 prepend라고 한다
    // 새로운 p태그 wrapper 안쪽 아래에 위치한다
    var newP3 = $("<p>");
    newP3.text("prepend");
    $(".wrapper").prepend(newP3);
    
    // 새로운 p태그를 만든다 내용은 append라고 한다
    // 새로운 p태그 wrapper 안쪽 위에 위치한다
    var newP4 = $("<p>");
    newP4.text("append");
    $(".wrapper").append(newP4);
    

    var newDiv = $("<div>");
    newDiv.text("newDiv")
    $(".a").after(newDiv);
    
    var newDiv2 = $("<div>");
    newDiv2.text("newDiv2")
    $(".c").before(newDiv2);
    
    var newSpan = $("<span>");
    newSpan.text("newSpan")
    $(".b").append(newSpan);

});