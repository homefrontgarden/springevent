import com.djs.spring.EmailBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-event.xml");
        EmailBean email = (EmailBean) ctx.getBean("emailer");
        email.sendEmail("black@list.org");
    }
}
