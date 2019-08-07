package cn.mlgj.artisticconception.service.impl;

import cn.mlgj.artisticconception.entity.Chat;
import cn.mlgj.artisticconception.mapper.ChatMapper;
import cn.mlgj.artisticconception.service.IChatService;
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
public class ChatServiceImpl extends ServiceImpl<ChatMapper, Chat> implements IChatService {

}
