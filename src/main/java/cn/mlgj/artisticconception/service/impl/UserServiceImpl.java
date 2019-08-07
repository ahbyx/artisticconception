package cn.mlgj.artisticconception.service.impl;

import cn.mlgj.artisticconception.entity.User;
import cn.mlgj.artisticconception.mapper.UserMapper;
import cn.mlgj.artisticconception.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
