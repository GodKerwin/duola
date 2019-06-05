package com.xul.duola.common.exception.user;

/**
 * 角色锁定异常类
 * 
 * Created by lxu on 2019/06/03.
 */
public class RoleBlockedException extends UserException
{
    private static final long serialVersionUID = 1L;

    public RoleBlockedException()
    {
        super("role.blocked", null);
    }
}
