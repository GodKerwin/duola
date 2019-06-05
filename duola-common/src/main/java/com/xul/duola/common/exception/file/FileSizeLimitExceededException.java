package com.xul.duola.common.exception.file;

/**
 * 文件名大小限制异常类
 * 
 * Created by lxu on 2019/06/03.
 */
public class FileSizeLimitExceededException extends FileException
{
    private static final long serialVersionUID = 1L;

    public FileSizeLimitExceededException(long defaultMaxSize)
    {
        super("upload.exceed.maxSize", new Object[] { defaultMaxSize });
    }
}
