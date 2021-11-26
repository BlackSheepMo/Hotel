package com.ln.impl;

import com.ln.pojo.entity.TOrders;
import com.ln.mapper.TOrdersMapper;
import com.ln.service.TOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxg
 * @since 2021-11-26
 */
@Service
public class TOrdersServiceImpl extends ServiceImpl<TOrdersMapper, TOrders> implements TOrdersService {

}
