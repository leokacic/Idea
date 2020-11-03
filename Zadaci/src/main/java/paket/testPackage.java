package paket;

import paket.debug.*;
import paket.debug.Debug;
import paket.debugoff.*;

public class testPackage {

    static{
        Debug deb = new Debug();
        paket.debugoff.Debug debOff = new paket.debugoff.Debug();
    }
    public static void main (String [] args){
        packageClass test = new packageClass();
        Debug deb = new Debug();
        deb.debug("S ispisom");
        paket.debugoff.Debug debOff = new paket.debugoff.Debug();
        debOff.debug("Bez ispisa");
//        System.out.println(test.name);

    }
}
