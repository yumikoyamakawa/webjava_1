package jp.co.systena.tigerscave.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//viewあり。
@Controller
public class ListController {

    @RequestMapping(value="/itemlist", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mav) {
      //mavに商品一覧の情報を設定する
      itemlist.show();
    }

}
