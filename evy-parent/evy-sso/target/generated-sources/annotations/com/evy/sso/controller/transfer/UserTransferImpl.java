package com.evy.sso.controller.transfer;

import com.evy.core.bean.User;
import com.evy.sso.controller.vo.UserIN;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-10-28T19:19:28+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_152 (Oracle Corporation)"
)
public class UserTransferImpl implements UserTransfer {

    @Override
    public User map(UserIN account) {
        if ( account == null ) {
            return null;
        }

        User user = new User();

        user.setAvatar( account.getAvatar() );
        user.setTelephone( account.getTelephone() );
        user.setUsername( account.getUsername() );
        user.setNickname( account.getNickname() );
        user.setProvince( account.getProvince() );
        user.setCity( account.getCity() );
        user.setSource( account.getSource() );
        user.setOpenId( account.getOpenId() );

        return user;
    }
}
