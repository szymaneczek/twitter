package pl.sda.twitter.services;

import pl.sda.twitter.model.TbUser;

public class UserServiceImpl implements UserService{
    @Override
    public TbUser getUserByUserName(String username) {

        return new TbUser((long) 1,"admin", "password");
    }
}
