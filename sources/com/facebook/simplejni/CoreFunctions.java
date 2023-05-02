package com.facebook.simplejni;

import java.io.PrintWriter;
import java.io.StringWriter;

public class CoreFunctions {
    public static String getErrorDescription(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static native void runWithClassLoader(long j2, long j3);
}
