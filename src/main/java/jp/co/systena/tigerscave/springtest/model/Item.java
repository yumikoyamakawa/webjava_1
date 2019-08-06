package jp.co.systena.tigerscave.springtest.model;

public class Item {
  //商品一覧の項目
  int itemId;
  String itemName;
  String itemPrice;

  //、メンバ変数をthisで区別し、メンバ変数を参照して、
  //引数にいれてhtmlでも変数として使えるようにする(コンストラクタ？)
  public Item(int itemId,String itemName,String itemPrice) {
    this.itemId = itemId;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
  }

}
