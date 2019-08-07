package cn.mlgj.artisticconception.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ArtUserinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户信息主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户外键
     */
    private Integer userid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 图片存放目录
     */
    private String imgPath;

    /**
     * 图片名称
     */
    private String imgName;

    /**
     * 描述
     */
    private String describe;

    /**
     * 信誉分
     */
    private Integer creditscore;

    /**
     * 性别
     */
    private String gender;

    /**
     * 地址
     */
    private String address;

    /**
     * qq
     */
    private String qq;

    /**
     * email
     */
    private String email;

    /**
     * 状态
     */
    private String status;

    public ArtUserinfo() {
    }

    public ArtUserinfo(Integer id, Integer userid, String username, String imgPath, String imgName, String describe, Integer creditscore, String gender, String address, String qq, String email, String status) {
        this.id = id;
        this.userid = userid;
        this.username = username;
        this.imgPath = imgPath;
        this.imgName = imgName;
        this.describe = describe;
        this.creditscore = creditscore;
        this.gender = gender;
        this.address = address;
        this.qq = qq;
        this.email = email;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getCreditscore() {
        return creditscore;
    }

    public void setCreditscore(Integer creditscore) {
        this.creditscore = creditscore;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
