package cn.mlgj.artisticconception.controller;


import cn.mlgj.artisticconception.entity.*;
import cn.mlgj.artisticconception.service.IArtArticleService;
import cn.mlgj.artisticconception.service.IArtCommentService;
import cn.mlgj.artisticconception.service.IArtReplyService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *
 *
 *
 * @author zjh
 * @since 2019-08-07
 *
 */
@Controller
@RequestMapping("/article")
public class ArtArticleController {

    @Resource
    IArtArticleService artArticleService;

    @Resource
    IArtCommentService artCommentService;

    @Resource
    IArtReplyService artReplyService;


    /**
     * 发布文章
     * @param title
     * @param cover
     * @param content
     * @param session
     * @return
     */
    @RequestMapping("publishArticle")
    @ResponseBody
    public String publishArticle(@RequestParam("title")String title, @RequestParam("cover")String cover, @RequestParam("content")String content, HttpSession session){
        ArtUser artUser = (ArtUser)session.getAttribute("artUser");
        int result = artArticleService.publishArticle(artUser.getId(), title, content, cover.substring(12));
        return JSON.toJSONString(result);
    }

    @RequestMapping("getBrowseArticle")
    @ResponseBody
    public Object getBrowseArticle(){
        return JSON.toJSON(artArticleService.getBrowseArticle());
    }

    @RequestMapping("getNewestArticle")
    @ResponseBody
    public Object getNewestArticle(){
        return JSON.toJSON(artArticleService.getNewestArticle());
    }

    @RequestMapping("getHottesttArticle")
    @ResponseBody
    public Object getHottesttArticle(){
        return JSON.toJSON(artArticleService.getHottesttArticle());
    }


    @RequestMapping("getArticleById")
    public  String getArticleById(Integer id, Model model){
        ArtArticle articleById = artArticleService.findById(id);
        ArtUserinfo userInfo = artArticleService.findByUserId(articleById.getUserid());
        List<ArtComment> commentList = artCommentService.getCommentByArticleId(id);
        Integer commentCount = artCommentService.getCommentCount(id);
        List<ArtReply> replyList = artReplyService.getAllReplyByCommentId();
        ArtArticle prevArticle = artArticleService.getPrevArticle(id - 1);
        ArtArticle nextArticle = artArticleService.getNextArticle(id + 1);
        Integer maxArtcleId = artArticleService.getMaxArtcleId();
        Integer minArtcleId = artArticleService.getMinArtcleId();
        ArtArticle firstArticle = artArticleService.getFirstArticle();
        ArtArticle lastArticle = artArticleService.getLastArticle();
        artArticleService.browseArtcle(id);
        model.addAttribute("articleById",articleById);
        model.addAttribute("userInfo",userInfo);
        model.addAttribute("commentList",commentList);
        model.addAttribute("commentCount",commentCount);
        model.addAttribute("replyList",replyList);
        model.addAttribute("prevArticle",prevArticle);
        model.addAttribute("nextArticle",nextArticle);
        model.addAttribute("maxArtcleId",maxArtcleId);
        model.addAttribute("minArtcleId",minArtcleId);
        model.addAttribute("firstArticle",firstArticle);
        model.addAttribute("lastArticle",lastArticle);
        return "singlepost";
    }

    @RequestMapping("commentArticle")
    @ResponseBody
    public  Object commentArticle(@RequestParam("comment") String comment,@RequestParam("articleId") Integer articleId,HttpSession session){
        ArtUser artUser = (ArtUser)session.getAttribute("artUser");
        Integer result = artCommentService.commentArticle(artUser.getId(), comment, articleId);
       /* Map<String,Object> map=new HashMap<String, Object>();
        map.put("result",result);
        if(result>0){
            ArtComment lastComment = artCommentService.getLastCommentByArticleId(articleId);
            map.put("lastComment",lastComment);
        }*/
        return JSON.toJSONString(result);
    }

    @ResponseBody
    @RequestMapping("reply")
    public Object reply(@RequestParam("replyContent")String replyContent,@RequestParam("replyUserid")Integer replyUserid,@RequestParam("commentId")Integer commentId){
        return artReplyService.reply(replyUserid, replyContent, commentId);
    }





}
