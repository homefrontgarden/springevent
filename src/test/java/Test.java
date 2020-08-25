import com.djs.spring.EmailBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-event.xml");
//        EmailBean email = (EmailBean) ctx.getBean("emailer");
        EmailBean email = ctx.getBean(EmailBean.class);
//        WebApplicationContext context =
        //学习ApplicationContext与WebApplicationContext获取，应用，之间的关系
        email.sendEmail("black@list.org");
    }
}
