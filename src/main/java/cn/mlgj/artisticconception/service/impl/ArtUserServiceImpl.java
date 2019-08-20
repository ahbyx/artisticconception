package cn.mlgj.artisticconception.service.impl;

import cn.mlgj.artisticconception.entity.ArtUser;
import cn.mlgj.artisticconception.mapper.ArtUserMapper;
import cn.mlgj.artisticconception.service.IArtUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
@Service
public class ArtUserServiceImpl extends ServiceImpl<ArtUserMapper, ArtUser> implements IArtUserService {

    @Resource
    private ArtUserMapper artUserMapper;

    @Override
    public int finRegist(String accountNo, String password, String phone) {
        return artUserMapper.regist(accountNo, password, phone);
    }

    @Override
    public ArtUser findUser(String accountNo, String password) {
        return artUserMapper.findUser(accountNo,password);
    }

    @Override
    public int finHaveUser(String accountNo) {
        return artUserMapper.haveUser(accountNo);
    }

}
