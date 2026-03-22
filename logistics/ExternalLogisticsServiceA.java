package logistics;

public class ExternalLogisticsServiceA {
    public void shipItem(int itemId) {
        System.out.println("External A: Отправка товара " + itemId);
    }

    public String trackShipment(int shipmentId) {
        return "External A: Статус отправки " + shipmentId;
    }
}
