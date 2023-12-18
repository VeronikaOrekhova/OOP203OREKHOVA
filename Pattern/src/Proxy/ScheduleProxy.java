package Proxy;
import java.util.List;
import java.time.LocalDateTime;
public class ScheduleProxy implements ScheduleService {
    private ScheduleService scheduleService;
    private LocalDateTime lastUpdate;

    public ScheduleProxy() {
        // Инициализация scheduleService
        scheduleService = new RealScheduleService();

        // Имитируем время вставки диска с обновленным расписанием
        lastUpdate = LocalDateTime.now().minusDays(1);
    }
    private boolean isScheduleUpdated() {
        // Проверяем, было ли обновление расписания
        LocalDateTime currentTime = LocalDateTime.now();
        return currentTime.getDayOfYear() > lastUpdate.getDayOfYear();
    }

    private void updateSchedule() {
        // Логика обновления расписания
        scheduleService = new RealScheduleService();
        lastUpdate = LocalDateTime.now();
    }

    @Override
    public List<String> getTrainSchedule() {
        if (!isScheduleUpdated()) {
            updateSchedule();
        }

        return scheduleService.getTrainSchedule();
    }
}
