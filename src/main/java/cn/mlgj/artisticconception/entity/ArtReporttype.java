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
public class ArtReporttype implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 举报类型主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类型名称
     */
    private String name;

    /**
     * 状态
     */
    private String status;


    public ArtReporttype() {
    }

    public ArtReporttype(Integer id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
