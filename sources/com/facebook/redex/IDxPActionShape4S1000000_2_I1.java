package com.facebook.redex;

import java.security.PrivilegedAction;
import java.security.Security;

public class IDxPActionShape4S1000000_2_I1 implements PrivilegedAction {
    public String A00;
    public final int A01;

    public IDxPActionShape4S1000000_2_I1(String str, int i2) {
        this.A01 = i2;
        this.A00 = str;
    }

    public Object run() {
        int i2 = this.A01;
        String str = this.A00;
        return i2 != 0 ? System.getProperty(str) : Security.getProperty(str);
    }
}
