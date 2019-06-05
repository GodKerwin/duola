package com.xul.duola.common.exception.file;

import com.xul.duola.common.exception.base.BaseException;

/**
 * 文件信息异常类
 * 
 * Created by lxu on 2019/06/03.
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
