package cn.mlgj.artisticconception.controller;


import cn.mlgj.artisticconception.entity.ArtArticle;
import cn.mlgj.artisticconception.entity.ArtUser;
import cn.mlgj.artisticconception.service.IArtArticleService;
import cn.mlgj.artisticconception.service.IArtUserService;
import cn.mlgj.artisticconception.service.IArtUserinfoService;
import cn.mlgj.artisticconception.util.PageBean;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
@Controller
public class ArtUserController {
    @Resource
    private IArtUserService iArtUserService;
    @Resource
    private IArtUserinfoService iArtUserinfoService;

    @Resource
    private IArtArticleService artArticleService;

    @RequestMapping("/index")
    public String index(Model model) {
        List<ArtArticle> hottesttArticle = artArticleService.getHottesttArticle();
        List<ArtArticle> newestArticle = artArticleService.getNewestArticle();
        List<ArtArticle> browseArticle = artArticleService.getBrowseArticle();
        model.addAttribute("hottesttArticle",hottesttArticle);
        model.addAttribute("newestArticle",newestArticle);
        model.addAttribute("browseArticle",browseArticle);
        return "index";
    }




    @ResponseBody
    @RequestMapping("/getArticleList")
    public Object getArticleList(Model model,
                        @RequestParam(value = "pageSize", required = false) String pageSize,
                        @RequestParam(value = "currPageNo", required = false) String currPageNo) {

        PageBean pb = new PageBean();
        if (pageSize == null || "0".equals(pageSize) || "".equals(pageSize)) {
            pb.setPageSize(3);
        } else {
            pb.setPageSize(Integer.parseInt(pageSize));
        }

        int totalCount = artArticleService.getTotalCount();
        pb.setTotalCount(totalCount);
        int pageIndex = 1;
        if (currPageNo != null && !"".equals(currPageNo)) {
            pageIndex = Integer.parseInt(currPageNo);
            if (pageIndex < 1) {
                pageIndex = 1;
            } else if (pageIndex > pb.getTotalPageCount()) {
                pageIndex = pb.getTotalPageCount();
            }
        }
        pb.setCurrPageNo(pageIndex);
        List<ArtArticle> articleList = artArticleService.findList((pageIndex - 1) * pb.getPageSize(), pb.getPageSize());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("articleList",articleList);
        map.put("pb",pb);
        return JSON.toJSONString(map);
    }

    //登录
    @RequestMapping("/login")
    public String login() {
        return "login";
    }




    @RequestMapping("registered")
    public String registered() {
        return "registered";
    }

    /**
     * 注册
     * @param accountNo
     * @param password
     * @param phone
     * @return
     */
    @RequestMapping(value = "zhuce", method = RequestMethod.POST)
    @ResponseBody
    public String registered(@RequestParam("accountNo") String accountNo,
                             @RequestParam("password") String password, @RequestParam("phone") String phone) {
        Map<String, Object> map = new HashMap<String, Object>();
        int result = iArtUserService.finRegist(accountNo, password,phone);
        if(result>0){
            ArtUser user=iArtUserService.findUser(accountNo,password);
            int artuser = iArtUserinfoService.addUserInfo(user.getId(), user.getAccountNo());
            map.put("artuser", artuser);
        }
        return JSON.toJSONString(map);


    }
    //登录
    @RequestMapping("artLogin")
    @ResponseBody
    public Object artLogin(@RequestParam("accountNo") String accountNo, @RequestParam("password") String password, HttpSession req) {
        ArtUser artUser = iArtUserService.findUser(accountNo, password);
        req.setAttribute("artUser", artUser);
        Map<String, Object> map = new HashMap<>();
        map.put("artUser", artUser);
        return JSON.toJSONString(map);
    }


    @RequestMapping("contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping("searchresults")
    public String searchresults(){
        return "searchresults";
    }

    @RequestMapping("categories")
    public String categories(){
        return "categories";
    }

    @RequestMapping("singlepost")
    public String singlepost(){
        return "singlepost";
    }



    /**
     * 判断用户名是否重复
     * @param accountNo
     * @return
     */
    @RequestMapping("judgeName")
    @ResponseBody
    public int judgeName(String accountNo) {
        ArtUser artUser = new ArtUser();
        artUser.setAccountNo(accountNo);
        int um=iArtUserService.finHaveUser(accountNo);
        return um;
    }

    /**
     * 注销
     * @param session
     * @return
     */
    @RequestMapping("zuXiao")
    public String zuXiao(HttpSession session){
        session.removeAttribute("artUser");
        return "index";

    }


}




