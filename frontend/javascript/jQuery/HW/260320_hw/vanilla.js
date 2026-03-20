window.onload = function () {
    var addButton = document.querySelector(".header__add");
    var removeButton = document.querySelector(".header__removeall");
    var content = document.querySelector(".content");
    var footer = document.querySelector(".footer");
    var itemNum = 0;

    addButton.addEventListener("click", function () {
        var addItem = document.createElement("div");
        if (itemNum < 10) {
            addItem.innerText = "아이템 목록 " + (++itemNum);
            content.appendChild(addItem);
        } else {
            alert("더 이상 추가할 수 없습니다.")
        }
        footer.innerText = "총 " + itemNum + "개의 아이템이 등록되었습니다";
    });
    
    removeButton.addEventListener("click", function () {
        var removeItems = document.querySelectorAll(".content > *");
        
        if (!itemNum) {
            alert("이미 모든 아이템이 제거되었습니다.");
            return;
        }

        for (var i = 0; i < removeItems.length; i++) {
            content.removeChild(removeItems[i]);
        }
        itemNum = 0;
        footer.innerText = "총 " + itemNum + "개의 아이템이 등록되었습니다";
    });
    footer.innerText = "총 " + itemNum + "개의 아이템이 등록되었습니다";


}