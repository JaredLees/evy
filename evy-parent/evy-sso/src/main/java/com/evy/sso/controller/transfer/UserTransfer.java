package com.evy.sso.controller.transfer;

import com.evy.core.bean.User;
import com.evy.sso.controller.vo.UserIN;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Jonny
 * @Description:
 * @date 2018/4/11上午11:00
 */
@Mapper
public interface UserTransfer {
    UserTransfer INSTANCE = Mappers.getMapper(UserTransfer.class);
    User map(UserIN account);
}
