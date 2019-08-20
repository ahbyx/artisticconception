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
public class ArtComment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论主键
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
    private String content;

    /**
     * 文章外键
     */
    private Integer articleid;

    /**
     * 评论时间
     */
    private LocalDate time;

    /**
     * 状态
     */
    private String status;

    private ArtUserinfo artUserinfo;

    public ArtComment() {
    }

    public ArtComment(Integer id, Integer userid, String content, Integer articleid, LocalDate time, String status) {
        this.id = id;
        this.userid = userid;
        this.content = content;
        this.articleid = articleid;
        this.time = time;
        this.status = status;
    }

    public ArtUserinfo getArtUserinfo() {
        return artUserinfo;
    }

    public void setArtUserinfo(ArtUserinfo artUserinfo) {
        this.artUserinfo = artUserinfo;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
