package com.xul.duola.common.annotation;

import java.lang.annotation.*;

/**
 * 数据权限过滤注解
 * 
 * Created by lxu on 2019/06/03.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataScope
{
    /**
     * 表的别名
     */
    public String tableAlias() default "";
}
