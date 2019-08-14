package cn.mlgj.artisticconception.mapper;

import cn.mlgj.artisticconception.entity.ArtUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
public interface ArtUserMapper extends BaseMapper<ArtUser> {
    /**
     * 注册
     * @param accountNo
     * @param password
     * @param phone
     * @return
     */
    public int regist(@Param("accountNo") String accountNo,@Param("password") String password,@Param("phone")String phone);

    ArtUser findUser(@Param("accountNo")String accountNo,@Param("password") String password);


}
