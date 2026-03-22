$().ready(function () {
    var itemNum = 0;
    var item = [];

    $(".header__add").on("click", function () {
        var addDiv = $("<div>");
        var addItem = $("<div>");
        var deleteBtn = $("<div>");
        deleteBtn.text("X");

        if (item.length < 10) {
            item.push(itemNum);
            addItem.text("아이템 목록 " + ++itemNum);
            addDiv.append(addItem);
            addDiv.append(deleteBtn);
            $(".content").append(addDiv);
        } else {
            alert("더 이상 추가할 수 없습니다.")
        }
        console.log(item);

        $(".footer").text("총 " + item.length + "개의 아이템이 등록되었습니다");
    });
    $(".header__removeall").on("click", function () {
        if (!item.length) {
            alert("이미 모든 아이템이 제거되었습니다.");
            return;
        }
        $(".content > div").remove();

        item = [];
        console.log(item);

        $(".footer").text("총 " + item.length + "개의 아이템이 등록되었습니다");
        
    });
    $(".footer").text("총 " + item.length + "개의 아이템이 등록되었습니다");
})
