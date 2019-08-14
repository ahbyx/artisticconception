package cn.mlgj.artisticconception.controller;


import cn.mlgj.artisticconception.entity.ArtUser;
import cn.mlgj.artisticconception.service.IArtUserService;
import cn.mlgj.artisticconception.service.IArtUserinfoService;
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

    @RequestMapping("/home")
    public String index() {
        return "index";
    }

    //登录
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    //登录

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
    public Object artLogin(@RequestParam("accountNo") String accountNo, @RequestParam("password") String password, HttpSession req){
        ArtUser artUser=iArtUserService.findUser(accountNo,password);
        req.setAttribute("artUser",artUser);
        return artUser;
    }
}




