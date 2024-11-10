package bahniuk.pr32.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bahniuk.pr32.service.HomePageService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Controller
public class HomePageController {

    private HomePageService homePageService;

    @GetMapping(path = "/")
    public @ResponseBody String returnHelloWorld() {
       return homePageService.getHelloString();
    }

}