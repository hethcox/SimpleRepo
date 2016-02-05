package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Simple Boot Controller
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from M6 Dev!";
    }

}
