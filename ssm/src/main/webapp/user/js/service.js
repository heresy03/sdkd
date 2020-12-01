

$(".arrow").click(function (){

    $(this).attr(" background",' url("../images/down-arrow.png") no-repeat')
    $(".menu").toggle()
})
$(".menu li").hover(function () {
    var style=$(this).attr("class")
    console.log(style)
    if(style){

        $(this).removeClass("change")
    }else {
        $(this).addClass("change")
        $(this).attr(" background",' url("../../images/right-arrow.png") no-repeat')
    }
})