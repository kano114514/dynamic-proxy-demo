package jdk_dynamic_proxy;

/**
 * @author wuhaoyu
 * @date 2024/8/29  下午10:29
 * @description:短信发送接口，用来做被代理类的接口，模拟被代理的类实现了接口的情况
 */
public interface SmsService {
    public void sendSms(String phoneNumber, String message);

}
