package com.ln.impl;

import com.ln.pojo.entity.TAccount;
import com.ln.mapper.TAccountMapper;
import com.ln.service.TAccountService;
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
public class TAccountServiceImpl extends ServiceImpl<TAccountMapper, TAccount> implements TAccountService {

}
