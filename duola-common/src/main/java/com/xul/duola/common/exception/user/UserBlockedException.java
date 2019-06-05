package com.xul.duola.common.exception.user;

/**
 * 用户锁定异常类
 * 
 * Created by lxu on 2019/06/03.
 */
public class UserBlockedException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserBlockedException()
    {
        super("user.blocked", null);
    }
}
