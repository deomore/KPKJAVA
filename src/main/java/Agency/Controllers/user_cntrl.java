package Agency.Controllers;

import Agency.Model.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Data
public class user_cntrl {
    private static final Logger logger= LoggerFactory.getLogger(user_cntrl.class); //подключение логгера

    @RequestMapping("/entry")      //открытие страницы входа
    public String entry(Model m){
        m.addAttribute("command", new User());
        return "Entry";
    }

    @RequestMapping("/userIndex")   //открытие главной страницы клиента после входа в систему
    public String userIndex(){ return "UserIndex"; }

    @RequestMapping("/organizatorIndex")       //открытие главной страницы организатора после входа в систему
    public String organizatorIndex(){ return "OrganizatorIndex"; }

    @RequestMapping("/OrganizatirRegistration")    //открытие страницы регистрации организатора
    public String OrganizatorRegistration(Model m){
        logger.info("Выполнение метода organizatorRegistration");
        m.addAttribute("command", new User());
        return "OrganizatorRegistration";
    }

    @RequestMapping("/userRegistration")    //открытие страницы регистрации клиента
    public String userRegistration(Model m){
        logger.info("Выполнение метода userRegistration");
        m.addAttribute("command", new User());
        return "UserRegistration";
    }

}
