package backend.tehtavat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParameters {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String location, @RequestParam String name) {
        return "Welcome to the " + location + " " + name + "!";
    }
}