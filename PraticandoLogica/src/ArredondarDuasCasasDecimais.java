package PraticandoLogica.src;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArredondarDuasCasasDecimais {

    public double roundToTwoDecimalPlaces(double number){

        BigDecimal bd = new BigDecimal(String.valueOf(number));

        bd = bd.setScale(2, RoundingMode.HALF_UP);


        return bd.doubleValue();
    }

    
    
}
