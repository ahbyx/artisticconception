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
public class ArtChat implements Serializable {

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

    public ArtChat() {

    }

    public ArtChat(Integer id, Integer sendid, Integer toid, String content, LocalDate time, String status) {
        this.id = id;
        this.sendid = sendid;
        this.toid = toid;
        this.content = content;
        this.time = time;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSendid() {
        return sendid;
    }

    public void setSendid(Integer sendid) {
        this.sendid = sendid;
    }

    public Integer getToid() {
        return toid;
    }

    public void setToid(Integer toid) {
        this.toid = toid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
