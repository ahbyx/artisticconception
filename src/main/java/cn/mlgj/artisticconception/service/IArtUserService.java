package cn.mlgj.artisticconception.service;

import cn.mlgj.artisticconception.entity.ArtUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
public interface IArtUserService extends IService<ArtUser> {
    public int finRegist(String accountNo,String password,String phone);
    ArtUser findUser(String accountNo,String password);
    public int finHaveUser(String accountNo);


}
