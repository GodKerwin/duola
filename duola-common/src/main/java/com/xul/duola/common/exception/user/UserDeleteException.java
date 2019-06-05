package com.xul.duola.common.exception.user;

/**
 * 用户账号已被删除
 * 
 * Created by lxu on 2019/06/03.
 */
public class UserDeleteException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserDeleteException()
    {
        super("user.password.delete", null);
    }
}
