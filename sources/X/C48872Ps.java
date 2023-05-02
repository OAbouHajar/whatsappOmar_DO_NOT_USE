package X;

import com.facebook.msys.mci.Execution;

/* renamed from: X.2Ps  reason: invalid class name and case insensitive filesystem */
public class C48872Ps implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C48862Pr A03;

    public C48872Ps(C48862Pr r1, int i2, int i3, long j2) {
        this.A03 = r1;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = j2;
    }

    public void run() {
        Execution.executeAfterWithPriorityInternal(this.A03, this.A00, this.A01, this.A02);
    }
}
