import java.time.LocalDate;
import java.time.Period;

public class DataTeste {

    public static void main(String[] args) {


        LocalDate dataInicial = LocalDate.parse("2022-05-23");
        LocalDate dataFinal = LocalDate.parse("2022-07-23");

        Period period = Period.between(dataInicial, dataFinal);
        int months = Math.abs(period.getMonths());

        System.out.println(months);
    }



}
