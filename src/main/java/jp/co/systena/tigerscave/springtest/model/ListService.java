package jp.co.systena.tigerscave.springtest.model;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class ListService {
  //各商品のパロメーター(商品番号、商品名、値段)
  Item item1 = new Item(1,"ギター","30万");
  Item item2 = new Item(2,"エレキギター","10万");
  Item item3 = new Item(3,"バイオリン","40万");
  Item item4 = new Item(4,"ビオラ","52万");

    public ArrayList<Item> getItemList(){
      ArrayList<Item> itemlist = new ArrayList<Item>();
      //itemlistにデータを追加する
      itemlist.add(item1);
      itemlist.add(item2);
      itemlist.add(item3);
      itemlist.add(item4);
      System.out.println(itemlist);

      return itemlist;

    }

}
