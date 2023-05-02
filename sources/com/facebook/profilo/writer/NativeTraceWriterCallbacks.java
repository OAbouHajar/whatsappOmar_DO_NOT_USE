package com.facebook.profilo.writer;

public interface NativeTraceWriterCallbacks {
    void onTraceWriteAbort(long j2, int i2);

    void onTraceWriteEnd(long j2);

    void onTraceWriteException(long j2, Throwable th);

    void onTraceWriteStart(long j2, int i2);
}
