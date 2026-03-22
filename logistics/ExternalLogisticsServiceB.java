package logistics;

public class ExternalLogisticsServiceB {
    public void sendPackage(String packageInfo) {
        System.out.println("External B: Отправка пакета " + packageInfo);
    }

    public String checkPackageStatus(String trackingCode) {
        return "External B: Статус пакета " + trackingCode;
    }
}
