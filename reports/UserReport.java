package reports;

public class UserReport implements IReport {
    @Override
    public String generate() {
        return "UserReport: Информация о пользователях [Фиктивные данные]";
    }
}
