package jdk_dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * @author wuhaoyu
 * @date 2024/8/29  下午10:30
 * @description:进行动态代理
 */
public class DynamicProxyUse {

    public static void main(String[] args) {
        SmsService smsService=new SmsServiceImpl();
        smsService.sendSms("","");
        SmsService smsProxy= (SmsService) getProxy(smsService);
        smsProxy.sendSms("","");
    }

    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new MyInvocationHandler(target));
    }
}
