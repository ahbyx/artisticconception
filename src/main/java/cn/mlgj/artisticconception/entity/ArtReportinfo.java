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
public class ArtReportinfo implements Serializable {

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

    public ArtReportinfo() {
    }

    public ArtReportinfo(Integer id, Integer userid, String reportContent, Integer reportUserid, LocalDate reportTime, Integer reportTypeid, Integer ishandle, String status) {
        this.id = id;
        this.userid = userid;
        this.reportContent = reportContent;
        this.reportUserid = reportUserid;
        this.reportTime = reportTime;
        this.reportTypeid = reportTypeid;
        this.ishandle = ishandle;
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

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Integer getReportUserid() {
        return reportUserid;
    }

    public void setReportUserid(Integer reportUserid) {
        this.reportUserid = reportUserid;
    }

    public LocalDate getReportTime() {
        return reportTime;
    }

    public void setReportTime(LocalDate reportTime) {
        this.reportTime = reportTime;
    }

    public Integer getReportTypeid() {
        return reportTypeid;
    }

    public void setReportTypeid(Integer reportTypeid) {
        this.reportTypeid = reportTypeid;
    }

    public Integer getIshandle() {
        return ishandle;
    }

    public void setIshandle(Integer ishandle) {
        this.ishandle = ishandle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
