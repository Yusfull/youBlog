/**
 * 
 */
package blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author khunga
 *
 */
@Controller
public class HomeController {
@RequestMapping("/")
    public String index() {
        return "index";
    }
}
