package com.facebook.redex;

import java.io.File;
import java.io.FilenameFilter;

public class IDxFFilterShape3S1000000_2_I0 implements FilenameFilter {
    public String A00;
    public final int A01;

    public IDxFFilterShape3S1000000_2_I0(String str, int i2) {
        this.A01 = i2;
        this.A00 = str;
    }

    public final boolean accept(File file, String str) {
        int i2 = this.A01;
        String str2 = this.A00;
        return i2 != 0 ? str.endsWith(str2) : str.startsWith(str2);
    }
}
