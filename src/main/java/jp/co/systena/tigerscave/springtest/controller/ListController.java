package jp.co.systena.tigerscave.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//viewあり。
@Controller
public class ListController {

    @GetMapping("/itemlist")
    public String itemlist(Model model){
        return "itemlist";
    }

}
