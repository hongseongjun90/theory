package com.gmail.hongseongjun90;

class card {
  
  static class Card2 {
    int king;
    static int queen;
    
  }
 
  public static void main(String[] args) {
 
  Card2 c = new Card2();
  c.king = 100;
  
  Card2.queen = 90;
  
  System.out.printf("%d, %d\n", c.king, Card2.queen);
 }
}