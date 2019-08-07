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
public class Forward implements Serializable {

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


}
