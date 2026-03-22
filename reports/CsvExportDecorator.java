package reports;

public class CsvExportDecorator extends ReportDecorator {
    public CsvExportDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return report.generate() + " | Экспорт в CSV";
    }
}
