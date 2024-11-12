package Seção11.DataHora;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoDateCalendar {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
//        calendar.add(Calendar.HOUR_OF_DAY, 4);
//        d = calendar.getTime();
//        System.out.println(sdf.format(d));

        //Pegando apenas os minutos da data
        int minutes = calendar.get(Calendar.MINUTE);

        //Janeiro começa com mês 0, necessario add 1
        int month = 1 + calendar.get(Calendar.MONTH);

        System.out.println("minutos: " + minutes);
        System.out.println("mês: " + month);
    }
}
