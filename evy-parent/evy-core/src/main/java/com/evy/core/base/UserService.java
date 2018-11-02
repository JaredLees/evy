package com.evy.core.base;

import com.evy.core.bean.User;
import com.evy.core.exception.BusinessException;
import com.evy.core.mapper.UserMapper;
import com.evy.core.utils.NumberUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Jonny
 * @Description:
 * @date 2018/6/18上午7:39
 */
@Service
public class UserService extends BaseService{

    @Resource private UserMapper userMapper;

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public User findByAccountIdAndOpenId(String openId, Long accountId) {
        if(StringUtils.isEmpty(openId) || NumberUtils.isNullOrZero(accountId)) {
            throw new BusinessException("参数异常");
        }
       return  userMapper.findByAccountIdAndOpenId(openId, accountId);
    }

    public void createUser(String openId, Long id) {

    }
}
