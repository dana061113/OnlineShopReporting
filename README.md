Online Shop Reporting & Logistics System
Бұл жоба интернет-магазинге арналған есептік жүйе мен логистикалық қызметтерді басқару жүйесін көрсетеді. Жоба Java тілінде жазылған және Декоратор (Decorator) және Адаптер (Adapter) паттерндерін қолданады.
🗂 Структура

/OnlineShopReporting
│
├── /reports                # Есептік жүйе (Decorator)
│   ├── IReport.java
│   ├── SalesReport.java
│   ├── UserReport.java
│   ├── ReportDecorator.java
│   ├── DateFilterDecorator.java
│   ├── SortingDecorator.java
│   ├── CsvExportDecorator.java
│   └── PdfExportDecorator.java
│
├── /logistics              # Логистика және жеткізу (Adapter)
│   ├── IInternalDeliveryService.java
│   ├── InternalDeliveryService.java
│   ├── ExternalLogisticsServiceA.java
│   ├── ExternalLogisticsServiceB.java
│   ├── LogisticsAdapterA.java
│   ├── LogisticsAdapterB.java
│   └── DeliveryServiceFactory.java
│
└── Main.java               # Клиенттік код, демонстрация
⚙️ Функционал
1. Декоратор (Decorator) – есептік жүйе
IReport – интерфейс есептер үшін.
SalesReport, UserReport – базалық есептер.
Декораторлар:
DateFilterDecorator – күн бойынша фильтрация.
SortingDecorator – сортировка (мысалы, по сумме продажи).
CsvExportDecorator – экспорт CSV форматына.
PdfExportDecorator – экспорт PDF форматына.
Мақсаты – динамикалық түрде есепке қосымша функционал қосу, базалық кодқа өзгеріс енгізбестен.
2. Адаптер (Adapter) – логистика
IInternalDeliveryService – жалпы интерфейс.
InternalDeliveryService – ішкі жеткізу қызметі.
Сыртқы қызметтер:
ExternalLogisticsServiceA – сыртқы логистика A.
ExternalLogisticsServiceB – сыртқы логистика B.
Адаптерлер:
LogisticsAdapterA – сыртқы A-ны ішкі интерфейске үйлестіреді.
LogisticsAdapterB – сыртқы B-ны ішкі интерфейске үйлестіреді.
DeliveryServiceFactory – динамикалық түрде жеткізу қызметін таңдау.
🚀 Қолдану
Репозиторийді клондау:
Bash
git clone https://github.com/username/OnlineShopReporting.git
cd OnlineShopReporting
Жобаны IDE-де ашу (IntelliJ, Eclipse) немесе терминалда компиляциялау:
Bash
javac Main.java reports/*.java logistics/*.java
java Main
Нәтиже:
Консольда SalesReport есептері декораторлармен көрсетіледі.
Internal и External логистика қызметтері арқылы жеткізу процесі көрсетіледі.
🔧 Мысалы
Java
IReport report = new SalesReport();
report = new DateFilterDecorator(report, "2026-03-01", "2026-03-22");
report = new SortingDecorator(report, "Сумма продажи");
report = new CsvExportDecorator(report);
report = new PdfExportDecorator(report);

System.out.println(report.generate());
Нәтижесінде есеп осылай көрінеді:

SalesReport: Продажи за период [Фиктивные данные] | Фильтр по датам: 2026-03-01 - 2026-03-22 | Сортировка по: Сумма продажи | Экспорт в CSV | Экспорт в PDF
📌 Артықшылықтар
Декораторлар арқылы есептерді динамикалық кеңейту.
Адаптерлер арқылы кез-келген сыртқы логистикалық қызметті интеграциялау.
Фабрика – қажетті қызметті автоматты таңдау.
Код модульді және қайта қолдануға ыңғайлы.
