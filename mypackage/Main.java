package mypackage;

import java.util.List;

//javac -encoding UTF-8 mypackage/MyClass1.java mypackage/Main.java
//java -cp . mypackage.Main
/*
C:\TxtChk>javac -encoding UTF-8 mypackage/MyClass1.java mypackage/Main.java mypackage/UpgradeDirLineCount.java mypackage/ShopList.java

C:\TxtChk>java -cp . mypackage.Main
MyClass1の静的メソッドが呼び出されました。
 */
public class Main {
    public static void main(String[] args) {
        
    MyClass1.myStaticFunction(); // MyClass1の静的メソッドを呼び出す
    int countLine = UpgradeDirLineCount.LineCount();
    System.out.println(countLine - 7);
    List<String> shopList = ShopList.getShopList();
    System.out.println(shopList);
    
    }
}