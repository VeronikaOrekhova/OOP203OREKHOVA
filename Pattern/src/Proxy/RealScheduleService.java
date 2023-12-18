package Proxy;
import java.util.List;
public class RealScheduleService implements ScheduleService {
    private List<String> trainSchedule;

    public RealScheduleService() {
        // Имитируем получение расписания из диска
        trainSchedule = readScheduleFromDisk();
    }

    private List<String> readScheduleFromDisk() {
        // Читаем расписание с диска
        return List.of("Train 1 - 08:00",
                "Train 2 - 10:30",
                "Train 3 - 14:15");
    }

    @Override
    public List<String> getTrainSchedule() {
        return trainSchedule;
    }
}
