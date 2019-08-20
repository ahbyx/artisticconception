function check() {
    var title=$("#title").val();
    var cover=$("#cover").val();
    var content= CKEDITOR.instances.content.getData();
    if(title==null||title==""){
        alert("标题不能为空");
        return false;
    }else if (cover==null||cover==""){
        alert("请选择封面");
        return false;
    } else if(content==null||content==""){
        alert("内容不能为空");
        return false;
    }else  if(content.length>=8000){
        alert("内容过长");
        return false;
    }
    return  true;
}

$("#publish").click(function () {
   if(check()) {
       var title = $("#title").val();
       var cover = $("#cover").val();
       var content = CKEDITOR.instances.content.getData();
       var data = {title: title, cover: cover, content: content};
       $.ajax({
           url:"article/publishArticle",
           data:data,
           type:"POST",
           dataType:"JSON",
           success:function (data) {
               if(data>0){
                   alert("发布成功");
               }else {
                   alert("发布失败");
               }
           }
       })
   }

});



$("#tologin").click(function () {
    location.href="/artisticconception/login";
});