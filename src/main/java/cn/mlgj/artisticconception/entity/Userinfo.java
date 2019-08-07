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
public class Userinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户信息主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户外键
     */
    private Integer userid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 图片存放目录
     */
    private String imgPath;

    /**
     * 图片名称
     */
    private String imgName;

    /**
     * 描述
     */
    private String describe;

    /**
     * 信誉分
     */
    private Integer creditscore;

    /**
     * 性别
     */
    private String gender;

    /**
     * 地址
     */
    private String address;

    /**
     * qq
     */
    private String qq;

    /**
     * email
     */
    private String email;

    /**
     * 状态
     */
    private String status;


}
