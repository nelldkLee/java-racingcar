package step3;

import java.util.List;

public class ResultView {

    public static void result(List<Car> cars) {
        for (Car car : cars) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < car.getLocation(); i++) {
                builder.append("-");
            }
            System.out.println(builder.toString());
        }
        System.out.println();
    }
}
