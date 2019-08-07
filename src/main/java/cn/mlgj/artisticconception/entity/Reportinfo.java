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
public class Reportinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 举报信息主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 举报人
     */
    private Integer userid;

    /**
     * 举报内容
     */
    private String reportContent;

    /**
     * 被举报人
     */
    private Integer reportUserid;

    /**
     * 举报时间
     */
    private LocalDate reportTime;

    /**
     * 举报类型
     */
    private Integer reportTypeid;

    /**
     * 是否被处理
     */
    private Integer ishandle;

    /**
     * 状态
     */
    private String status;


}
