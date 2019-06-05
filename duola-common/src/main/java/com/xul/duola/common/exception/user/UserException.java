package com.xul.duola.common.exception.user;

import com.xul.duola.common.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * Created by lxu on 2019/06/03.
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
