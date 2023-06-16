import java.util.List;

public class CalculationUtil {




    public static int calculate1(GeneralObject generalObject) {
        if (generalObject.getValue() > 50) {
            generalObject.setValue(100);
        } else {
            generalObject.setValue(0);
        }
        if (generalObject.getValue() == 100) {
            generalObject = new GeneralObject(1);
        }
        return generalObject.getValue();
    }

    public static GeneralObject calculate2(GeneralObject generalObject1, GeneralObject generalObject2) {
        GeneralObject result = null;
        if (generalObject1.getValue() > generalObject2.getValue()) {
            generalObject1 = generalObject2;
            generalObject1.setValue(111);
            generalObject2.setValue(999);
        }
        if (generalObject1.getValue() == 111 && generalObject2.getValue() == 999) {
            result = generalObject1;
            return result;
        } else {
            generalObject1 = new GeneralObject(200);
            return generalObject1;
        }
    }

}
