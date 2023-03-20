package org.codes.java.java8.staticanddefaultmethods;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

interface Device{
    public String deviceType();
    public String swithOnMethod();
    public String switchOfMethod();
    public String howToConnectToOtherDevice();
    public Long deviceCurrentChargeLevel();
    static String SwithcOnAndSwitchOffMessage()
    {
        return "Thank you by SIEMENS";
    }
    default Boolean netIsAvailable(){
        try {
            final URL url = new URL("http://www.google.com");
            final URLConnection conn = url.openConnection();
            conn.connect();
            conn.getInputStream().close();
            return true;}

        catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    default String ManufaturCompany()
    {
        return "This device manufatured by siemens technology and private limited";
    }
}
class NetworkServer implements Device{

    @Override
    public String deviceType() {
        return "This is a device used for processing and managing networks ";
    }

    @Override
    public String swithOnMethod() {
        return "First click a swithc with 🍚 the symbol\n" +
                ".........Congrats you made it......";
    }

    @Override
    public String switchOfMethod() {
        return "click the button with 🍘 this symbol \n" +
                "the system will automatically switch off";
    }

    @Override
    public String howToConnectToOtherDevice() {
        return "Get a HDMI or USB cable and connect any port you showing ";
    }

    @Override
    public Long deviceCurrentChargeLevel() {
        return 55L;
    }
    public String ConnectedDevices()
    {
        return "Total connected devices are 12";
    }
}
public class DefaultMethods {
    public static void main(String[] args) {
        Device networkServer=new NetworkServer();
        System.out.println(networkServer.netIsAvailable());

    }

}
