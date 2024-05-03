package org.springmvc.stereotype;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: Controller
 * Description: 用来标注控制器，被标注的控制器纳入IoC容器的管理。
 */
@Target(ElementType.TYPE) // 表示该注解只能标注类
@Retention(RetentionPolicy.RUNTIME) // 表示该注解可以被反射机制读取
public @interface Controller {
}
