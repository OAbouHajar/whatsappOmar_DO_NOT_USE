package com.whatsapp.util;

import java.io.FileDescriptor;
import java.net.Socket;

public final class NativeUtils {
    static {
        nativeInit();
    }

    public static native int getBytesInSocketOutputQueue(int i2);

    public static native int getFileDescriptorForFileDescriptor(FileDescriptor fileDescriptor);

    public static native int getFileDescriptorForSocket(Socket socket);

    public static native void nativeInit();
}
