package logistics;

public class DeliveryServiceFactory {
    public static IInternalDeliveryService getService(String type) {
        switch (type.toLowerCase()) {
            case "internal":
                return new InternalDeliveryService();
            case "external_a":
                return new LogisticsAdapterA(new ExternalLogisticsServiceA());
            case "external_b":
                return new LogisticsAdapterB(new ExternalLogisticsServiceB());
            default:
                throw new IllegalArgumentException("Неизвестный тип службы доставки: " + type);
        }
    }
}
