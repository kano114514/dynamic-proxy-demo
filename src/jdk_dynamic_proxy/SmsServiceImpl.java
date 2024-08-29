package jdk_dynamic_proxy;

/**
 * @author wuhaoyu
 * @date 2024/8/29  下午10:29
 * @description:实现短信发送接口
 */
public class SmsServiceImpl implements SmsService{

    @Override
    public void sendSms(String phoneNumber, String message) {
        System.out.println("发送短信");
    }
}
