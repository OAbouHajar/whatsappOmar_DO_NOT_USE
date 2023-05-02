package X;

import java.util.concurrent.Callable;

/* renamed from: X.58C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass58C implements Callable {
    public final /* synthetic */ byte A00;
    public final /* synthetic */ C28861Yb A01;
    public final /* synthetic */ C208211s A02;
    public final /* synthetic */ C30971dG A03;
    public final /* synthetic */ C30971dG A04;
    public final /* synthetic */ byte[] A05;
    public final /* synthetic */ byte[] A06;

    public /* synthetic */ AnonymousClass58C(C28861Yb r1, C208211s r2, C30971dG r3, C30971dG r4, byte[] bArr, byte[] bArr2, byte b2) {
        this.A02 = r2;
        this.A01 = r1;
        this.A05 = bArr;
        this.A00 = b2;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = bArr2;
    }

    public final Object call() {
        return Integer.valueOf(this.A02.A04(this.A01, this.A03, this.A04, this.A05, this.A06, this.A00));
    }
}
