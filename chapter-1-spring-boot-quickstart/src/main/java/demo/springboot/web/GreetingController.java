package demo.springboot.web;

import java.util.concurrent.atomic.AtomicLong;

import demo.springboot.web.hello.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/greeting",method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        // Greeting 对象将会被转换json对象返回
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}