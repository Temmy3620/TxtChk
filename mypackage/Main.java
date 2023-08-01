package mypackage;

import java.util.List;

//javac -encoding UTF-8 mypackage/MyClass1.java mypackage/Main.java
//java -cp . mypackage.Main
/*
C:\TxtChk>javac -encoding UTF-8 mypackage/MyClass1.java mypackage/Main.java mypackage/UpgradeDirLineCount.java mypackage/ShopList.java mypackage/LineChk.java

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

    List<String> resultDirLine = LineChk.LineCheckAndRead(shopList.get(0) + "\\resulte_dir.log",countLine - 7);
    System.out.println(resultDirLine);

    List<String> upgradeDirLine = LineChk.LineCheckAndRead("dir_upgrade\\dir_upgrade.txt",countLine - 7);
    System.out.println(upgradeDirLine);


    
    }
}