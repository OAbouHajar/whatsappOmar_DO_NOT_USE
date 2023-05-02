package com.facebook.profilo.logger;

import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.writer.NativeTraceWriter;
import com.facebook.soloader.SoLoader;

public final class BufferLogger {
    static {
        SoLoader.A06("profilo");
    }

    public static native int writeAndWakeupTraceWriter(NativeTraceWriter nativeTraceWriter, Buffer buffer, long j2, int i2, int i3, int i4, long j3);

    public static native int writeBytesEntry(Buffer buffer, int i2, int i3, int i4, String str);

    public static native int writeStandardEntry(Buffer buffer, int i2, int i3, long j2, int i4, int i5, int i6, long j3);
}
