package logistics;

public class LogisticsAdapterA implements IInternalDeliveryService {
    private ExternalLogisticsServiceA serviceA;

    public LogisticsAdapterA(ExternalLogisticsServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public void deliverOrder(String orderId) {
        serviceA.shipItem(Integer.parseInt(orderId));
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return serviceA.trackShipment(Integer.parseInt(orderId));
    }
}
