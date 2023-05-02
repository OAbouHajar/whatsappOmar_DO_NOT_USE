package X;

import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* renamed from: X.1hS  reason: invalid class name and case insensitive filesystem */
public class C32901hS implements NativeTraceWriterCallbacks {
    public final /* synthetic */ C32871hP A00;
    public final /* synthetic */ C32841hK A01;

    public C32901hS(C32871hP r1, C32841hK r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onTraceWriteAbort(long j2, int i2) {
        this.A00.A02.AZ4(this.A01, i2);
    }

    public void onTraceWriteEnd(long j2) {
        this.A00.A02.AZ5(this.A01);
    }

    public void onTraceWriteException(long j2, Throwable th) {
        this.A00.A02.AZ6(this.A01, th);
    }

    public void onTraceWriteStart(long j2, int i2) {
        this.A00.A02.AZ7(this.A01);
    }
}
