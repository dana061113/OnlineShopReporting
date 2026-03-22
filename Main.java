import reports.*;
import logistics.*;

public class Main {
    public static void main(String[] args) {
        // --- Декораторы ---
        IReport report = new SalesReport();
        report = new DateFilterDecorator(report, "2026-03-01", "2026-03-22");
        report = new SortingDecorator(report, "Сумма продажи");
        report = new CsvExportDecorator(report);
        report = new PdfExportDecorator(report);

        System.out.println(report.generate());

        System.out.println("------------------------------------------------");

        // --- Адаптеры и фабрика ---
        IInternalDeliveryService internalService = DeliveryServiceFactory.getService("internal");
        internalService.deliverOrder("101");
        System.out.println(internalService.getDeliveryStatus("101"));

        IInternalDeliveryService externalAService = DeliveryServiceFactory.getService("external_a");
        externalAService.deliverOrder("202");
        System.out.println(externalAService.getDeliveryStatus("202"));

        IInternalDeliveryService externalBService = DeliveryServiceFactory.getService("external_b");
        externalBService.deliverOrder("TRACK-303");
        System.out.println(externalBService.getDeliveryStatus("TRACK-303"));
    }
}
