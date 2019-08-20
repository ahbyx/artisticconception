function getArticleList(){
    $.ajax({
        url:"getArticleList",
        dataType:"JSON",
        type:"POST",
        success:function (data) {
            if(data!=null){
                $("#articleList").empty().append("<div class=\"title-wrap\"><h3 class=\"section-title\">Latest News</h3><a href=\"searchresults\" class=\"all-posts-url\"></a></div>");
                for(var i=0;i<data.articleList.length;i++){
                    var $article="<article class=\"entry post-list\">\n" +
                        "              <div class=\"entry__img-holder post-list__img-holder\">\n" +
                        "                <a href=\"article/getArticleById?id="+data.articleList[i].id+"\">\n" +
                        "                  <div class=\"thumb-container thumb-75\">\n" +
                        "                    <img  src=\"img/blog/"+data.articleList[i].cover+"\"  class=\"entry__img lazyload\" alt=\"\">\n" +
                        "                  </div>\n" +
                        "                </a>\n" +
                        "              </div>\n" +
                        "\n" +
                        "              <div class=\"entry__body post-list__body\">\n" +
                        "                <div class=\"entry__header\">\n" +
                        "                  <a href=\"#\" class=\"entry__meta-category\" >"+data.articleList[i].userName+"</a>\n" +
                        "                  <h2 class=\"entry__title\">\n" +
                        "                    <a  href=\"article/getArticleById?id="+data.articleList[i].id+"\" >"+data.articleList[i].title+"</a>\n" +
                        "                  </h2>\n" +
                        "                  <ul class=\"entry__meta\">\n" +
                        "                    <li class=\"entry__meta-author\">\n" +
                        "                      <i class=\"ui-author\"></i>\n" +
                        "                      <span >"+data.articleList[i].time+"</span>\n" +
                        "                    </li>\n" +
                        "                    <li class=\"entry__meta-date\">\n" +
                        "                      <i class=\"ui-date\"></i>\n" +
                        "                      <!--21 October, 2017-->\n" +
                        "                      <span >"+data.articleList[i].browsecount+"</span>\n" +
                        "                    </li>\n" +
                        "                    <li class=\"entry__meta-comments\">\n" +
                        "                      <i class=\"ui-comments\"></i>\n" +
                        "                     <!-- <a href=\"#\">115</a>-->\n" +
                        "                      <span >"+data.articleList[i].praisecount+"</span>\n" +
                        "                    </li>\n" +
                        "                  </ul>\n" +
                        "                </div>\n" +
                        "                <!--<div class=\"entry__excerpt\">\n" +
                        "                  <p>Point of Sale hardware, the till at a shop check out, has become very complex over the past ten years. Modern POS hardware includes the cash till, bar-code readers...</p>\n" +
                        "                </div>-->\n" +
                        "              </div>\n" +
                        "            </article>";
                    $("#articleList").append($article);

                }

                $("#pb").empty();
                var shouye=$("<a href=\"javascript:;\" class=\"pagination__page\">首页</a>").click(function(){getArticleListFY(1)});
                $("#pb").append(shouye);
                if(data.pb.currPageNo > 1){
                    var prev=$("<a href=\"javascript:;\" class=\"pagination__page pagination__icon pagination__page--next\"><i class=\"ui-arrow-left\"></i></a>").click(function(){getArticleListFY(data.pb.currPageNo-1)});
                    $("#pb").append(prev);
                }
                for(var i=0;i<data.pb.totalPageCount;i++){
                    $("#pb").append("<a href=\"javascript:;\" class=\"pagination__page\" onclick='getArticleListFY("+(i+1)+")'>"+(i+1)+"</a>");
                }
                if(data.pb.currPageNo <data.pb.totalPageCount){
                    var next=$("<a href=\"javascript:;\" class=\"pagination__page pagination__icon pagination__page--next\"><i class=\"ui-arrow-right\"></i></a>").click(function(){getArticleListFY(data.pb.currPageNo+1)});
                    $("#pb").append(next);
                }
                var last=$("<a href=\"javascript:;\" class=\"pagination__page\">末页</a>").click(function(){getArticleListFY(data.pb.totalPageCount)});
                $("#pb").append(last);

            }
        }
    });
}

function  getArticleListFY(currPageNo){
   var data={currPageNo:currPageNo};
    $.ajax({
        url:"getArticleList",
        data:data,
        dataType:"JSON",
        type:"POST",
        success:function (data) {
            if(data!=null){
                $("#articleList").empty().append("<div class=\"title-wrap\"><h3 class=\"section-title\">Latest News</h3><a href=\"searchresults\" class=\"all-posts-url\"></a></div>");
                for(var i=0;i<data.articleList.length;i++){
                    var $article="<article class=\"entry post-list\">\n" +
                        "              <div class=\"entry__img-holder post-list__img-holder\">\n" +
                        "                <a href=\"article/getArticleById?id="+data.articleList[i].id+"\">\n" +
                        "                  <div class=\"thumb-container thumb-75\">\n" +
                        "                    <img   src=\"img/blog/"+data.articleList[i].cover+"\" class=\"entry__img lazyload\" alt=\"\">\n" +
                        "                  </div>\n" +
                        "                </a>\n" +
                        "              </div>\n" +
                        "\n" +
                        "              <div class=\"entry__body post-list__body\">\n" +
                        "                <div class=\"entry__header\">\n" +
                        "                  <a href=\"#\" class=\"entry__meta-category\" >"+data.articleList[i].userName+"</a>\n" +
                        "                  <h2 class=\"entry__title\">\n" +
                        "                    <a  href=\"article/getArticleById?id="+data.articleList[i].id+"\" >"+data.articleList[i].title+"</a>\n" +
                        "                  </h2>\n" +
                        "                  <ul class=\"entry__meta\">\n" +
                        "                    <li class=\"entry__meta-author\">\n" +
                        "                      <i class=\"ui-author\"></i>\n" +
                        "                      <span >"+data.articleList[i].time+"</span>\n" +
                        "                    </li>\n" +
                        "                    <li class=\"entry__meta-date\">\n" +
                        "                      <i class=\"ui-date\"></i>\n" +
                        "                      <!--21 October, 2017-->\n" +
                        "                      <span >"+data.articleList[i].browsecount+"</span>\n" +
                        "                    </li>\n" +
                        "                    <li class=\"entry__meta-comments\">\n" +
                        "                      <i class=\"ui-comments\"></i>\n" +
                        "                     <!-- <a href=\"#\">115</a>-->\n" +
                        "                      <span >"+data.articleList[i].praisecount+"</span>\n" +
                        "                    </li>\n" +
                        "                  </ul>\n" +
                        "                </div>\n" +
                        "                <!--<div class=\"entry__excerpt\">\n" +
                        "                  <p>Point of Sale hardware, the till at a shop check out, has become very complex over the past ten years. Modern POS hardware includes the cash till, bar-code readers...</p>\n" +
                        "                </div>-->\n" +
                        "              </div>\n" +
                        "            </article>";
                    $("#articleList").append($article);

                }

                $("#pb").empty();
                var shouye=$("<a href=\"javascript:;\" class=\"pagination__page\">首页</a>").click(function(){getArticleListFY(1)});
                $("#pb").append(shouye);
                if(data.pb.currPageNo > 1){
                    var prev=$("<a href=\"javascript:;\" class=\"pagination__page pagination__icon pagination__page--next\"><i class=\"ui-arrow-left\"></i></a>").click(function(){getArticleListFY(data.pb.currPageNo-1)});
                    $("#pb").append(prev);
                }
                for(var i=0;i<data.pb.totalPageCount;i++){
                    $("#pb").append("<a href=\"javascript:;\" class=\"pagination__page\" onclick='getArticleListFY("+(i+1)+")'>"+(i+1)+"</a>");
                }
                if(data.pb.currPageNo <data.pb.totalPageCount){
                    var next=$("<a href=\"javascript:;\" class=\"pagination__page pagination__icon pagination__page--next\"><i class=\"ui-arrow-right\"></i></a>").click(function(){getArticleListFY(data.pb.currPageNo+1)});
                    $("#pb").append(next);
                }
                var last=$("<a href=\"javascript:;\" class=\"pagination__page\">末页</a>").click(function(){getArticleListFY(data.pb.totalPageCount)});
                $("#pb").append(last);

            }
        }
    });
}

$("#getBrowseArticle").click(function () {
   $.ajax({
      url:"article/getBrowseArticle",
      dataType:"JSON",
      type:"POST",
      success:function (data) {
          if(data!=null){
              $("#tab-comments").empty();
              var ul=$("<ul class=\"post-list-small\"></ul>");
              for (var i=0;i<data.length;i++) {
                   ul.append("<li class=\"post-list-small__item\">\n" +
                      "                      <article class=\"post-list-small__entry clearfix\">\n" +
                      "                        <div class=\"post-list-small__img-holder\">\n" +
                      "                          <div class=\"thumb-container thumb-75\">\n" +
                      "                            <a href=\"article/getArticleById?id="+data[i].id+"\">\n" +
                      "                              <img   src=\"img/blog/"+data[i].cover+"\" alt=\"\" class=\" lazyload\">\n" +
                      "                            </a>\n" +
                      "                          </div>\n" +
                      "                        </div>\n" +
                      "                        <div class=\"post-list-small__body\">\n" +
                      "                          <h3 class=\"post-list-small__entry-title\">\n" +
                      "                            <a  href=\"article/getArticleById?id="+data[i].id+"\" >"+data[i].title+"</a>\n" +
                      "                          </h3>\n" +
                      "                          <ul class=\"entry__meta\">\n" +
                      "                            <li class=\"entry__meta-date\">\n" +
                      "                              <i class=\"ui-date\"></i>\n" +
                      "                              <span >"+data[i].browsecount+"</span>\n" +
                      "                            </li>\n" +
                      "                          </ul>\n" +
                      "                        </div>                  \n" +
                      "                      </article>\n" +
                      "                    </li>");
              }
              $("#tab-comments").append(ul);
          }
      }
   });
});

$("#getNewestArticle").click(function () {
   $.ajax({
       url:"article/getNewestArticle",
       type:"POST",
       dataType:"JSON",
       success:function (data) {
           if(data!=null){
               $("#tab-trending").empty();
               var ul=$("<ul class=\"post-list-small\"></ul>");
               for(var i=0;i<data.length;i++){
                    ul.append(" <li class=\"post-list-small__item\">\n" +
                        "                      <article class=\"post-list-small__entry clearfix\">\n" +
                        "                        <div class=\"post-list-small__img-holder\">\n" +
                        "                          <div class=\"thumb-container thumb-75\">\n" +
                        "                            <a href=\"article/getArticleById?id="+data[i].id+"\">\n" +
                        "                              <img  src=\"img/blog/"+data[i].cover+"\" alt=\"\" class=\" lazyload\">\n" +
                        "                            </a>\n" +
                        "                          </div>\n" +
                        "                        </div>\n" +
                        "                        <div class=\"post-list-small__body\">\n" +
                        "                          <h3 class=\"post-list-small__entry-title\">\n" +
                        "                            <a  href=\"article/getArticleById?id="+data[i].id+"\">"+data[i].title+"</a>\n" +
                        "                          </h3>\n" +
                        "                          <ul class=\"entry__meta\">\n" +
                        "                            <!--<li class=\"entry__meta-author\">\n" +
                        "                              <i class=\"ui-author\"></i>\n" +
                        "                              <span th:text=\"${newestArticle.userName}\"></span>\n" +
                        "                            </li>-->\n" +
                        "                            <li class=\"entry__meta-date\">\n" +
                        "                              <i class=\"ui-date\"></i>\n" +
                        "                              <span >"+data[i].time+"</span>\n" +
                        "                            </li>\n" +
                        "                           <!-- <li class=\"entry__meta-comments\">\n" +
                        "                              <i class=\"ui-comments\"></i>\n" +
                        "                              <span th:text=\"${newestArticle.praisecount}\"></span>\n" +
                        "                            </li>-->\n" +
                        "\n" +
                        "                          </ul>\n" +
                        "                        </div>                  \n" +
                        "                      </article>\n" +
                        "                    </li>");
               }
               $("#tab-trending").append(ul);
           }
       }
   })
});

$("#getHottesttArticle").click(function () {
    $.ajax({
        url:"article/getHottesttArticle",
        dataType:"JSON",
        type:"POST",
        success:function (data) {
            if(data!=null){
                $("#tab-latest").empty();
                var ul=$("<ul class=\"post-list-small\"></ul>");
                for(var i=0;i<data.length;i++){
                     ul.append("<li class=\"post-list-small__item\">\n" +
                        "                      <article class=\"post-list-small__entry clearfix\">\n" +
                        "                        <div class=\"post-list-small__img-holder\">\n" +
                        "                          <div class=\"thumb-container thumb-75\">\n" +
                        "                            <a href=\"article/getArticleById?id="+data[i].id+"\">\n" +
                        "                              <img  src=\"img/blog/"+data[i].cover+"\" alt=\"\" class=\" lazyload\">\n" +
                        "                            </a>\n" +
                        "                          </div>\n" +
                        "                        </div>\n" +
                        "                        <div class=\"post-list-small__body\">\n" +
                        "                          <h3 class=\"post-list-small__entry-title\">\n" +
                        "                            <a href=\"article/getArticleById?id="+data[i].id+"\" >"+data[i].title+"</a>\n" +
                        "                          </h3>\n" +
                        "                          <ul class=\"entry__meta\">\n" +
                        "                            <li class=\"entry__meta-date\">\n" +
                        "                              <i class=\"ui-date\"></i>\n" +
                        "                              <span >"+data[i].praisecount+"</span>\n" +
                        "                            </li>\n" +
                        "                          </ul>\n" +
                        "                        </div>                  \n" +
                        "                      </article>\n" +
                        "                    </li>");

                }
                $("#tab-latest").append(ul);
            }
        }
    })
});

function  getNewestArticle() {
    $.ajax({
        url:"article/getNewestArticle",
        type:"POST",
        dataType:"JSON",
        success:function (data) {
            if(data!=null){
                $("#tab-trending").empty();
                var ul=$("<ul class=\"post-list-small\"></ul>");
                for(var i=0;i<data.length;i++){
                    ul.append(" <li class=\"post-list-small__item\">\n" +
                        "                      <article class=\"post-list-small__entry clearfix\">\n" +
                        "                        <div class=\"post-list-small__img-holder\">\n" +
                        "                          <div class=\"thumb-container thumb-75\">\n" +
                        "                            <a href=\"article/getArticleById?id="+data[i].id+"\">\n" +
                        "                              <img  src=\"img/blog/"+data[i].cover+"\" alt=\"\" class=\" lazyload\">\n" +
                        "                            </a>\n" +
                        "                          </div>\n" +
                        "                        </div>\n" +
                        "                        <div class=\"post-list-small__body\">\n" +
                        "                          <h3 class=\"post-list-small__entry-title\">\n" +
                        "                            <a  href=\"article/getArticleById?id="+data[i].id+"\">"+data[i].title+"</a>\n" +
                        "                          </h3>\n" +
                        "                          <ul class=\"entry__meta\">\n" +
                        "                            <!--<li class=\"entry__meta-author\">\n" +
                        "                              <i class=\"ui-author\"></i>\n" +
                        "                              <span th:text=\"${newestArticle.userName}\"></span>\n" +
                        "                            </li>-->\n" +
                        "                            <li class=\"entry__meta-date\">\n" +
                        "                              <i class=\"ui-date\"></i>\n" +
                        "                              <span >"+data[i].time+"</span>\n" +
                        "                            </li>\n" +
                        "                           <!-- <li class=\"entry__meta-comments\">\n" +
                        "                              <i class=\"ui-comments\"></i>\n" +
                        "                              <span th:text=\"${newestArticle.praisecount}\"></span>\n" +
                        "                            </li>-->\n" +
                        "\n" +
                        "                          </ul>\n" +
                        "                        </div>                  \n" +
                        "                      </article>\n" +
                        "                    </li>");
                }
                $("#tab-trending").append(ul);
            }
        }
    })
}


getArticleList();
getNewestArticle();