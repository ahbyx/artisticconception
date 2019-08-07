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
public class ArtForward implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收藏主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户外键
     */
    private Integer userid;

    /**
     * 转发时间
     */
    private LocalDate forwardtime;

    /**
     * 文章外键
     */
    private Integer articleid;

    /**
     * 状态
     */
    private String status;


    public ArtForward() {

    }

    public ArtForward(Integer id, Integer userid, LocalDate forwardtime, Integer articleid, String status) {
        this.id = id;
        this.userid = userid;
        this.forwardtime = forwardtime;
        this.articleid = articleid;
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

    public LocalDate getForwardtime() {
        return forwardtime;
    }

    public void setForwardtime(LocalDate forwardtime) {
        this.forwardtime = forwardtime;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
