package com.kunchi.smart.tool.service.impl;

import com.kunchi.smart.tool.po.SenWordPO;
import com.kunchi.smart.tool.dao.SenWordMapper;
import com.kunchi.smart.tool.service.ISenWordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 敏感词过滤-敏感词及说明 服务实现类
 * </p>
 *
 * @author carrey
 * @since 2020-08-06
 */
@Service
public class SenWordServiceImpl extends ServiceImpl<SenWordMapper, SenWordPO> implements ISenWordService {

}
