package logistics;

import java.util.HashMap;
import java.util.Map;

public class InternalDeliveryService implements IInternalDeliveryService {
    private Map<String, String> orders = new HashMap<>();

    @Override
    public void deliverOrder(String orderId) {
        orders.put(orderId, "В пути");
        System.out.println("Internal: Заказ " + orderId + " отправлен.");
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return orders.getOrDefault(orderId, "Не найден заказ");
    }
}
