package com.evy.core.service;

import com.evy.core.base.BaseService;
import com.evy.core.bean.Account;
import com.evy.core.mapper.AccountMapper;
import com.evy.core.utils.NumberUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Jonny
 * @Description:
 * @date 2018/9/16上午11:12
 */
@Service
public class AccountService extends BaseService {

    @Resource
    AccountMapper accountMapper;

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public Account get(Long id) {
        if(NumberUtils.isNullOrZero(id)) {
            return null;
        }
       return accountMapper.selectByPrimaryKey(id);
    }
}
