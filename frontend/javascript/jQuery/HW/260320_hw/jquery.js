$().ready(function () {
    var itemNum = 0;

    $(".header__add").on("click", function () {
        var addDiv = $("<div>");
        if (itemNum < 10) {
            addDiv.text("아이템 목록 " + ++itemNum);
            $(".content").append(addDiv);
        } else {
            alert("더 이상 추가할 수 없습니다.")
        }

        $(".footer").text("총 " + itemNum + "개의 아이템이 등록되었습니다");
    });
    $(".header__removeall").on("click", function () {
        if (!itemNum) {
            alert("이미 모든 아이템이 제거되었습니다.");
            return;
        }
        $(".content > div").remove();
        itemNum = 0;
        $(".footer").text("총 " + itemNum + "개의 아이템이 등록되었습니다");
    });
    $(".footer").text("총 " + itemNum + "개의 아이템이 등록되었습니다");
})
