package reports;

public class SalesReport implements IReport {
    @Override
    public String generate() {
        return "SalesReport: Продажи за период [Фиктивные данные]";
    }
}
