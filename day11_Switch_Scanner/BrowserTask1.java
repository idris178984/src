package day11_Switch_Scanner;

public class BrowserTask1 {
    public static void main(String[] args) {
        String browserName = "firefox";

        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge" ;


        if(validBrowser){

            if(browserName == "chrome"){
                result = "Chrome Browser is Selected";
            }else if(browserName == "firefox"){
                result = "FireFox Browser is Selected";
            }else if(browserName == "opera"){
                result = "Opera Browser is Selected";
            }else if(browserName == "safari"){
                result = "Safari Browser is Selected";
            }else{
                result = "Edge Browser is Selected";
            }

        }else{
            result = "Invalid Browser Name";
        }

        System.out.println(result);


    }




}
