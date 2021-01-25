package com.kunchi.tmsprocore.service.impl;

import com.kunchi.tmsprocore.po.SettlementOrder;
import com.kunchi.tmsprocore.dao.SettlementOrderMapper;
import com.kunchi.tmsprocore.service.ISettlementOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 运单（结算运单）表 服务实现类
 * </p>
 *
 * @author dongping
 * @since 2020-09-24
 */
@Service
public class SettlementOrderServiceImpl extends ServiceImpl<SettlementOrderMapper, SettlementOrder> implements ISettlementOrderService {

}
