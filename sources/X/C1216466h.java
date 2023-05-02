package X;

/* renamed from: X.66h  reason: invalid class name and case insensitive filesystem */
public class C1216466h implements Runnable {
    public final /* synthetic */ C115745qF A00;
    public final /* synthetic */ C118945vf A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C1216466h(C115745qF r1, C118945vf r2, String str, String str2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = str;
        this.A02 = str2;
    }

    public void run() {
        C115745qF r0 = this.A00;
        String str = this.A03;
        String str2 = this.A02;
        C119575yh r3 = r0.A00;
        r3.A0M.A01();
        Object[] objArr = new Object[3];
        C13690nt.A1L(r3.A0T.A00, str, objArr);
        objArr[2] = str2;
        C119575yh.A00(r3, objArr, 4);
    }
}
