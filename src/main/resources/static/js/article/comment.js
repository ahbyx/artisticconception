function plArticle(articleId){
    var comment=replace_em($("#comment").val());
    if(comment==null||comment==""){
        alert("请填写评论内容");
    }else {
        var data={comment:comment,articleId:articleId};
        $.ajax({
            url:"/artisticconception/article/commentArticle",
            data:data,
            dataType:"JSON",
            type:"POST",
            success:function (data) {
                if(data>0){
                    alert("评论成功");
                    location.href="/artisticconception/article/getArticleById?id="+articleId;
                }else {
                    alert("评论失败");
                }
            }
        });
    }
}


function replymeg(replyUserid,commentId,articleId){
    var replyContent=replace_em($(".replyContent"+commentId).val());
    var data={replyUserid:replyUserid,replyContent:replyContent,commentId:commentId};
    $.ajax({
        url:"reply",
        data:data,
        dataType:"JSON",
        type:"POST",
        success:function (data) {
            if(data>0){
                alert("回复成功");
                location.href="/artisticconception/article/getArticleById?id="+articleId;
            }else {
                alert("回复失败");
            }
        }
    });


}

function toreply(commentId){
    $('.form'+commentId).css("display","block").focus();
}


$("#tologin").click(function () {
    location.href="/artisticconception/login";
});

function replace_em(str){

    str = str.replace(/\</g,'&lt;');

    str = str.replace(/\>/g,'&gt;');

    str = str.replace(/\n/g,'<br/>');

    str = str.replace(/\[em_([0-9]*)\]/g,'<img src="/artisticconception/arclist/$1.gif" border="0" />');

    return str;

}