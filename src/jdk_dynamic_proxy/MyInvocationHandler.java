package jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wuhaoyu
 * @date 2024/8/29  下午10:31
 * @description:用来对函数进行封装和代理
 */
public class MyInvocationHandler implements InvocationHandler {
    private final Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("发短信之前！");
        Object result = method.invoke(target, args);
        System.out.println("发短信之后！");
        return result;
    }
}
