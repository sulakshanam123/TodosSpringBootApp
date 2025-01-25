package com.udemy.springboot.myFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello";
    }

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>");
        sb.append("Hello");
        sb.append("</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>");
        sb.append("Hello HTML content");
        sb.append("</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    // src\main\resources\META-INF\resources\WEB-INF\jsp\sayHello.jsp

    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        return "sayHello";
    }
}
