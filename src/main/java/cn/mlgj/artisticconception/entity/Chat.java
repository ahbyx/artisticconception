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
public class Chat implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 交流主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 发送人
     */
    private Integer sendid;

    /**
     * 接收人
     */
    private Integer toid;

    /**
     * 内容
     */
    private String content;

    /**
     * 发布时间
     */
    private LocalDate time;

    /**
     * 状态
     */
    private String status;


}
