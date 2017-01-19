package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Burak Köken on 19.1.2017.
 */
@Controller
@RequestMapping("/person/*")
public class PersonController {

    @RequestMapping("/") // ("/") olmasa da olur @RequestMapping
    public ModelAndView showIndexPage(){
        return new ModelAndView("Person/Index");
    }

    @RequestMapping("/add")
    public ModelAndView showAddPage(){
        return new ModelAndView("Person/Add");
    }

    @RequestMapping("/delete")
    public ModelAndView showDeletePage(){
        return new ModelAndView("Person/Delete");
    }

}
