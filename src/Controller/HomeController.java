package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Burak Köken on 19.1.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView showIndexPage(){
        return new ModelAndView("Home/Index");
    }
}
