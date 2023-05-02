package X;

/* renamed from: X.66B  reason: invalid class name */
public class AnonymousClass66B implements Runnable {
    public final /* synthetic */ C118645v1 A00;
    public final /* synthetic */ AnonymousClass5zC A01;
    public final /* synthetic */ C119185wg A02;

    public AnonymousClass66B(C118645v1 r1, AnonymousClass5zC r2, C119185wg r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void run() {
        C119185wg r5 = this.A02;
        C115885qT r4 = C119185wg.A0Z;
        byte[] bArr = (byte[]) r5.A00(r4);
        if (bArr == null || bArr.length == 0) {
            this.A00.A00(AnonymousClass000.A0a("Photo taking returned no jpeg data!"));
            return;
        }
        C118645v1 r3 = this.A00;
        C119575yh.A00(r3.A00, new Object[]{r3.A01, r5.A00(r4), r5}, 6);
        C119125wa A002 = C119125wa.A00();
        A002.A02(0, A002.A03);
    }
}
