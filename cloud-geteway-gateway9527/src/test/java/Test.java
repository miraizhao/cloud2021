import java.time.ZonedDateTime;

/**
 * @author Mirai Zhao
 * @create 2021-06-30
 */
public class Test {
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

        //2020-02-21T15:51:37.485+08:00[Asia/Shanghai]
    }
}
