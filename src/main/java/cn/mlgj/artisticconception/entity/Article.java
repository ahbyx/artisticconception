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
public class Article implements Serializable {

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


}
