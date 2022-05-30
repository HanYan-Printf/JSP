var cur = $(".active");
$(".treeview").click(function(event){
    console.log(event);
    cur.removeClass("active")
    var t = event.currentTarget;
    $(t).addClass("active")
    cur = $(t);
})