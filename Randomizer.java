import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Randomizer {

    Random r = new Random();
    /**
     * @param min минимальное значение для рандомного значения 
     * @param max максимальное значение для рандомного значения
     * @return
     */
    public int getRandomInt(int min, int max){
        return r.nextInt(min, max);
    }

    /**
     * @param min минимальное значение для рандомного значения 
     * @param max максимальное значение для рандомного значения
     * @return
     */
    public double getRandomDouble(int min, int max){
        return r.nextInt(min, max) / 100;
    }

    public String getRandomDate(){
        GregorianCalendar gc = new GregorianCalendar();
        int year = this.getRandomInt(2023, 2027);
        gc.set(Calendar.YEAR, year);
        int dayOfYear = this.getRandomInt(1, gc.getActualMaximum(Calendar.DAY_OF_YEAR));
        gc.set(Calendar.DAY_OF_YEAR, dayOfYear);
        
        return String.format(gc.get(Calendar.YEAR) + "-" + (gc.get(Calendar.MONTH) + 1) + "-" + gc.get(Calendar.DAY_OF_MONTH));
    }
}
