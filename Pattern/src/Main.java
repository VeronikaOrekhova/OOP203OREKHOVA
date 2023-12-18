import Factory.Bakery;
import Factory.BakeryTypes;
import Factory.SimpleBakeryFactory;
import Singleton.Moon;
import Adapter.Car;
import Adapter.BasicCar;
import Adapter.ElectroCar;
import Adapter.ElectricCar;
import Adapter.ElectricCarAdapter;
import Proxy.ScheduleProxy;
import Proxy.ScheduleService;
import java.util.List;

        public class Main {
            public static void main(String[] args) {
                Moon moon = Moon.getInstance();

                Bakery bakery = SimpleBakeryFactory.createBakery(BakeryTypes.BREAD);

                System.out.println("ADAPTER");
                Car basicCar = new BasicCar();
                basicCar.accelerate();
                basicCar.brake();
                basicCar.refuel();

                ElectroCar electroCar = new ElectricCar();
                electroCar.charge();
                electroCar.discharge();
                electroCar.recharge();

                Car electricCar = new ElectricCarAdapter(electroCar);
                electricCar.accelerate();
                electricCar.brake();
                electricCar.refuel();

                System.out.println("PROXY");
                ScheduleService scheduleService = new ScheduleProxy();
                List<String> trainSchedule = scheduleService.getTrainSchedule();

                System.out.println("Current train schedule:");
                for (String train : trainSchedule) {
                    System.out.println(train);
                }
            }
        }
