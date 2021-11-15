import java.time.YearMonth;
public class Main {
    public  static  boolean isIdNumberValid(String iDNumber){
        String[] arrayId = iDNumber.split("");
        String month = iDNumber.substring(2,4);
        String day = iDNumber.substring(4,6);
        String year =  iDNumber.substring(0,3);
        String citizen = arrayId[10];
        String luhn = arrayId[12];
        int luhnTotal = 0;
        YearMonth yearMonth = YearMonth.of(Integer.parseInt(year), Integer.parseInt(month));
        int maxDays = yearMonth.lengthOfMonth();

        if(iDNumber.length() != 13) return false;

        if(iDNumber.matches("\\d+")) return false;

        if(Integer.parseInt(month) > 12 ||Integer.parseInt(month) == 0) return false;

        if(Integer.parseInt(day) == 0 ||Integer.parseInt(day) > maxDays) return false;

        if (Integer.parseInt(citizen) > 1 ||Integer.parseInt(citizen) < 0) return false;

        for(int index = 0; index < arrayId.length; index++){
            if(index % 2 != 0) arrayId[index] = Integer.toString(Integer.parseInt(arrayId[index]) * 2);

            if(Integer.parseInt(arrayId[index]) >= 10) Integer.toString(Integer.parseInt(arrayId[index])-9);

            luhnTotal += Integer.parseInt(arrayId[index]);

        }
        if( 10 - (luhnTotal % 10) != Integer.parseInt(luhn)) return false;


        return true;

    }
    public  static void main(String[] args){

    }
}
