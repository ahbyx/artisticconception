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
public class ArtFollow implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关注主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 关注人
     */
    private Integer followUserid;

    /**
     * 被关注人
     */
    private Integer followedUserid;

    /**
     * 状态
     */
    private String status;

    public ArtFollow() {

    }

    public ArtFollow(Integer id, Integer followUserid, Integer followedUserid, String status) {
        this.id = id;
        this.followUserid = followUserid;
        this.followedUserid = followedUserid;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFollowUserid() {
        return followUserid;
    }

    public void setFollowUserid(Integer followUserid) {
        this.followUserid = followUserid;
    }

    public Integer getFollowedUserid() {
        return followedUserid;
    }

    public void setFollowedUserid(Integer followedUserid) {
        this.followedUserid = followedUserid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
