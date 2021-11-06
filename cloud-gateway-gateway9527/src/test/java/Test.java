import java.time.ZonedDateTime;

/**
 * @author : chencheng
 * @Date : 2021/11/4 13:27
 */
public class Test {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); //默认时区
        System.out.println(zbj);
    }
}
