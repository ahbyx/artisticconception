$(function () {
    var step = $("#myStep").step({
        animate: true,
        initStep: 1,
        speed: 1000
    });
    $("#preBtn").click(function (event) {
        var yes = step.preStep();
    });
    $("#xiayibu").click(function (event) {
        var userName = $.trim($("#userName").val());
        var code = $.trim($("#Verification").val());
        var phone = /^1([38]\d|5[0-35-9]|7[3678])\d{8}$/;  //11位手机号
        var phones = $.trim($("#phone").val());
        if (userName == "") {
            Tip('请填写用户名！');
            $("#userName").focus();
            return;
        }
        if ($.trim(phones) == "") {
            Tip('请填写手机号码！');
            $("#phone").focus();
            return;
        }
        if (!phone.exec(phones)) {
            Tip('手机输入格式不正确,请重新输入');
            $("#phone").focus();
            return;
        }
        if ($.trim(code) == "") {
            Tip('动态密码未填写！');
            $("#Verification").focus();
            return;
        }
        var yes = step.nextStep();
        return;
    });
    $("#submitBtn").click(function (event) {
        var txtconfirm = $.trim($("#confirmpwd").val());
        var txtPwd = $("#password").val();
        var pwd = /^(?!\d+$)(?![A-Za-z]+$)[a-zA-Z0-9]{6,}$/;

        if ($.trim(txtPwd) == "") {
            Tips('请输入密码！');
            $("#password").focus();
            return false;
        }
        if (!pwd.exec(txtPwd))
            if ($.trim(txtconfirm) == "") {
                Tips('至少6位并由数字和字母！');
                $("#password").focus();
                return false;
            }
        if ($.trim(txtconfirm) == "") {
            Tips("请输入确认密码");
            $("#confirmpwd").focus();
            return false;
        }
        if ($.trim(txtconfirm) != $.trim(txtPwd)) {
            Tips('两次密码不一致，请重新输入！');
            $("#confirmpwd").focus();
            return false;
        }
        var accountNo = $("#userName").val();
        var phone = $("#phone").val();
        var password = $("#password").val();
        $.post("zhuce", {accountNo: accountNo, password: password, phone: phone}, function (data) {
            if (data != null) {
                Tips("添加成功");
                /* lazyGo();*/
            } else {
                Tips("添加失败");
            }
        }, 'json');

        var yes = step.nextStep();

    });

    $("#userName").blur(function () {
        var userName = $("#userName").val();
        $.post("judgeName", {accountNo: userName}, function (data) {
            if (data > 0) {
                alert("用户名已存在！");
            } else {
                alert("用户名可用！");
            }
        }, 'text');

    });
    $("#goBtn").click(function (event) {
        var yes = step.goStep(3);
    });
    function lazyGo() {
        var sec = $("#sec").text();
        if (sec > 0) {
            $("#sec").text(--sec);
        } else {
            window.location.href = "home";
        }
        setTimeout(lazyGo(), 5000);
    }
});
(function (factory) {
        "use strict";
        if (typeof define === 'function') {
            // using CMD; register as anon module
            define.cmd && define('jquery-step', ['static/js/regist'], function (require, exports, moudles) {
                var $ = require("static/js/regist");
                factory($);
                return $;
            });
            define.amd && define(['static/js/regist'], factory);
        } else {
            // no CMD; invoke directly
            factory((typeof (jQuery) != 'undefined') ? jQuery : window.Zepto);
        }
    }
    (function ($) {
        $.fn.step = function (options) {
            var opts = $.extend({}, $.fn.step.defaults, options);
            var size = this.find(".step-header li").length;
            var barWidth = opts.initStep < size ? 100 / (2 * size) + 100 * (opts.initStep - 1) / size : 100;
            var curPage = opts.initStep;

            this.find(".step-header").prepend("<div class=\"step-bar\"><div class=\"step-bar-active\"></div></div>");
            this.find(".step-list").eq(opts.initStep - 1).show();
            if (size < opts.initStep) {
                opts.initStep = size;
            }
            if (opts.animate == false) {
                opts.speed = 0;
            }
            this.find(".step-header li").each(function (i, li) {
                if (i < opts.initStep) {
                    $(li).addClass("step-active");
                }
                //$(li).prepend("<span>"+(i+1)+"</span>");
                $(li).append("<span>" + (i + 1) + "</span>");
            });
            this.find(".step-header li").css({
                "width": 100 / size + "%"
            });
            this.find(".step-header").show();
            this.find(".step-bar-active").animate({
                    "width": barWidth + "%"
                },
                opts.speed, function () {

                });

            this.nextStep = function () {
                if (curPage >= size) {
                    return false;
                }
                return this.goStep(curPage + 1);
            }

            this.preStep = function () {
                if (curPage <= 1) {
                    return false;
                }
                return this.goStep(curPage - 1);
            }

            this.goStep = function (page) {
                if (page == undefined || isNaN(page) || page < 0) {
                    if (window.console && window.console.error) {
                        console.error('the method goStep has a error,page:' + page);
                    }
                    return false;
                }
                curPage = page;
                this.find(".step-list").hide();
                this.find(".step-list").eq(curPage - 1).show();
                this.find(".step-header li").each(function (i, li) {
                    $li = $(li);
                    $li.removeClass('step-active');
                    if (i < page) {
                        $li.addClass('step-active');
                        if (opts.scrollTop) {
                            $('html,body').animate({scrollTop: 0}, 'slow');
                        }
                    }
                });
                barWidth = page < size ? 100 / (2 * size) + 100 * (page - 1) / size : 100;
                this.find(".step-bar-active").animate({
                        "width": barWidth + "%"
                    },
                    opts.speed, function () {

                    });
                return true;
            }
            return this;
        };
        $.fn.step.defaults = {
            animate: true,
            speed: 500,
            initStep: 1,
            scrollTop: true
        };
    })
);