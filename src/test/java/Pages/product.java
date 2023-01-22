package Pages;

import Base.helpers;
import Objects.productObjects;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class product extends helpers {

    public static void writeProductInfo(String info) throws IOException {
        FileWriter fw = new FileWriter("/Users/ahmet.aksu/Desktop/Çalışmalar/Amazon/src/test/resources/productInfo.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        String text = null;
        switch (info){
            case "price":
                text = getAttribute(productObjects.price,"innerHTML");
                break;
            case "model":
                text = getAttribute(productObjects.model,"innerHTML");
                break;
            case "cpu":
                text = getAttribute(productObjects.cpu,"innerHTML");
                break;
        }
        bw.write(info+": "+text);
        bw.newLine();
        bw.close();
    }
}
