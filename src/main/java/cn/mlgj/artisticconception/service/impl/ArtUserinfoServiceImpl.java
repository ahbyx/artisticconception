package cn.mlgj.artisticconception.service.impl;

import cn.mlgj.artisticconception.entity.ArtUserinfo;
import cn.mlgj.artisticconception.mapper.ArtUserinfoMapper;
import cn.mlgj.artisticconception.service.IArtUserinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
@Service
public class ArtUserinfoServiceImpl extends ServiceImpl<ArtUserinfoMapper, ArtUserinfo> implements IArtUserinfoService {

    @Resource
    ArtUserinfoMapper artUserinfoMapper;

    @Override
    public int addUserInfo(Integer userId, String name) {
        return artUserinfoMapper.addUserInfo(userId,name);
    }
}
