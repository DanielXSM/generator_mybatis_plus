package com.kunchi.tmsprocore.service.impl;

import com.kunchi.tmsprocore.po.EmailList;
import com.kunchi.tmsprocore.dao.EmailListMapper;
import com.kunchi.tmsprocore.service.IEmailListService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邮件发送地址列表 服务实现类
 * </p>
 *
 * @author dongping
 * @since 2020-10-21
 */
@Service
public class EmailListServiceImpl extends ServiceImpl<EmailListMapper, EmailList> implements IEmailListService {

}
