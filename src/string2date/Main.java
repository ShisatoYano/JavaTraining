package string2date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat f =
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // 文字列からDateインスタンスを生成
        Date d = f.parse("2020/09/22 01:23:45");
        System.out.println(d);
        // Dateインスタンスから文字列を生成
        Date now = new Date();
        String s = f.format(now);
        System.out.println("現在は" + s + "です");

        // Instantの生成
        Instant i1 = Instant.now();
        // Instantとlong値との相互変換
        Instant i2 = Instant.ofEpochSecond(1600705425827L);
        long l = i2.toEpochMilli();

        // ZonedDateTimeの生成
        ZonedDateTime z1 = ZonedDateTime.now();
        ZonedDateTime z2 = ZonedDateTime
                .of(2020,1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));

        // InstantとZonedDateTimeの相互変換
        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        // ZonedDateTimeの利用方法
        System.out.println("東京:" + z2.getYear() +
                z2.getMonth() + z2.getDayOfMonth());
        System.out.println("ロンドン:" + z3.getYear() +
                z3.getMonth() + z3.getDayOfMonth());
        if (z2.isEqual(z3)) {
            System.out.println("これらは同じ瞬間を指しています");
        }

        // 文字列からLocalDateを生成
        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ldate =
                LocalDate.parse("2020/09/22", fmt);

        // 1000日後を計算する
        LocalDate ldatep = ldate.plusDays(1000);
        String str = ldatep.format(fmt);
        System.out.println("1000日後は" + str);
    }
}
