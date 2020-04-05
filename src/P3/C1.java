package P3;

import P2.B1;
import stub.P2.B2Stub;

public class C1 {
    public int call(String input){
        return 0;
    }
    public int reCall(String input,int callId){
        return 0;
    }
    public String processMinor(){
        //B1.B2 b2 = new B1.B2();
        B2Stub b2 = new B2Stub();
        String processResult = b2.processMinor();
        return processMinor();
    }
}
