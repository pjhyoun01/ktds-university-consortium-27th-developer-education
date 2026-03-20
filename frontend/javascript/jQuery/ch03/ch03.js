$().ready(function () {
    //   var dest = document.querySelectorAll("#destinations");
    //   console.log(dest);
    //   var listItems = dest.children;

    // #destinations > li
    var listItems = $("#destinations").children("li");
    console.log(listItems);
    
    // listItems[i].addEventListener("click", function (event){
        listItems.on("click", function() {
        // console.log(event.target.previousElementSibling.innerText);
        console.log($(this).prev().text());
        // console.log(event.target.nextElementSibling.innerText);
        console.log($(this).next().text());
        //부모
        console.log($(this).parent().parent().text());
        
    })
});


// window.onload = function (){
//     var listItems = document.querySelectorAll("#destinations > li");
//     var li = document.querySelectorAll("li");

//     for (var i= 0; i < listItems.length; i++){
//         listItems[i].addEventListener("click", function (event){
//             console.log(event);
//             console.log(event.target);
//             console.log(event.target.innerText);
            
//             console.log(event.target.previousElementSibling.innerText);
//         })
//     }
// }