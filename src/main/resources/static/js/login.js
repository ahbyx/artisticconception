$(function () {
    createCode();
    $("#btn_yzm").click(function () {
        createCode();
    });
})

var code;/*定义一个验证码的全局变量*/
function createCode(){/* 生成验证码的函数 */
    code="";
    var codeLength=4;
    var btn_yzm=document.getElementById("btn_yzm");
    btn_yzm.value="";
    var selectChar=new Array(1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
    for(var i=0;i<codeLength;i++){
        var charIndex=Math.floor(Math.random()*61);
        code+= selectChar[charIndex];
    }
    if (code.length != codeLength) {
        createCode();
    }
    btn_yzm.value=code;
    // alert(code);
}

$("#login").click(function () {
   var data={accountNo:$("#accountNo").val(),password:$("#password").val()};
    $.ajax({
       url:"artLogin",
       data:data,
       type:"POST",
       dataType:"JSON",
       success:function (data) {
           if(data!=null){
               alert("登录成功");
               location.href="/artisticconception/home";
           }else {
               alert("用户名密码错误");
           }
       }
    });

});



