package cn.mlgj.artisticconception.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class ArtArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户外键
     */
    private Integer userid;

    /**
     * 内容
     */
    private String articleContent;

    /**
     * 标题
     */
    private String title;

    /**
     * 谁可见
     */
    private Integer visiblestate;

    /**
     * 发布时间
     */
    private LocalDate time;

    /**
     * 被赞次数
     */
    private Integer praisecount;

    /**
     * 浏览次数
     */
    private Integer browsecount;

    /**
     * 是否为转发
     */
    private Integer type;

    /**
     * 评论次数
     */
    private Integer commentcount;

    /**
     * 封面
     */
    private String cover;

    /**
     * 状态
     */
    private String status;

    private String userName;


    public ArtArticle() {

    }



    public ArtArticle(Integer id, Integer userid, String articleContent, String title, Integer visiblestate, LocalDate time, Integer praisecount, Integer browsecount, Integer type, Integer commentcount, String cover, String status) {
        this.id = id;
        this.userid = userid;
        this.articleContent = articleContent;
        this.title = title;
        this.visiblestate = visiblestate;
        this.time = time;
        this.praisecount = praisecount;
        this.browsecount = browsecount;
        this.type = type;
        this.commentcount = commentcount;
        this.cover = cover;
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

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getVisiblestate() {
        return visiblestate;
    }

    public void setVisiblestate(Integer visiblestate) {
        this.visiblestate = visiblestate;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public Integer getPraisecount() {
        return praisecount;
    }

    public void setPraisecount(Integer praisecount) {
        this.praisecount = praisecount;
    }

    public Integer getBrowsecount() {
        return browsecount;
    }

    public void setBrowsecount(Integer browsecount) {
        this.browsecount = browsecount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
