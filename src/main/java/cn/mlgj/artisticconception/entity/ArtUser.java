package cn.mlgj.artisticconception.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class ArtUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账号
     */
    private String accountNo;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private Integer phone;

    /**
     * 角色
     */
    private Integer role;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastLogintime;

    /**
     * 状态
     */
    private String status;

    public ArtUser() {
    }

    public ArtUser(Integer id, String accountNo, String password, Integer phone, Integer role, LocalDateTime lastLogintime, String status) {
        this.id = id;
        this.accountNo = accountNo;
        this.password = password;
        this.phone = phone;
        this.role = role;
        this.lastLogintime = lastLogintime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public LocalDateTime getLastLogintime() {
        return lastLogintime;
    }

    public void setLastLogintime(LocalDateTime lastLogintime) {
        this.lastLogintime = lastLogintime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
