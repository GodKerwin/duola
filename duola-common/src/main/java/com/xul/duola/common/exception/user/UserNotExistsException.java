package com.xul.duola.common.exception.user;

/**
 * 用户不存在异常类
 * 
 * Created by lxu on 2019/06/03.
 */
public class UserNotExistsException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserNotExistsException()
    {
        super("user.not.exists", null);
    }
}
