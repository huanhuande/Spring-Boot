package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hs on 2017/4/27.
 */
@RestController
public class e {

    @RequestMapping("/joker")
    public String t(){
        return "bob";
    }
}
