package X;

/* renamed from: X.4zk  reason: invalid class name and case insensitive filesystem */
public class C102924zk implements AnonymousClass5TF {
    public final /* synthetic */ AnonymousClass1NK A00;

    public C102924zk(AnonymousClass1NK r1) {
        this.A00 = r1;
    }

    public void AO6() {
        AnonymousClass1NK.A00(this.A00, 2);
    }

    public void AO7() {
        AnonymousClass1NK.A00(this.A00, 7);
    }

    public void AOv(boolean z2) {
        if (z2) {
            AnonymousClass1NK.A00(this.A00, 5);
        }
    }

    public void AQR(int i2) {
        AnonymousClass1NK.A00(this.A00, AnonymousClass473.A00(i2));
    }

    public void AS9() {
        AnonymousClass1NK.A00(this.A00, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r4 == 101) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AV9(int r4) {
        /*
            r3 = this;
            r0 = 301(0x12d, float:4.22E-43)
            if (r4 == r0) goto L_0x000d
            r0 = 104(0x68, float:1.46E-43)
            if (r4 == r0) goto L_0x000d
            r0 = 101(0x65, float:1.42E-43)
            r2 = 0
            if (r4 != r0) goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            X.1NK r1 = r3.A00
            r0 = 3
            if (r2 == 0) goto L_0x0015
            r0 = 18
        L_0x0015:
            X.AnonymousClass1NK.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102924zk.AV9(int):void");
    }

    public void AVA() {
        AnonymousClass1NK.A00(this.A00, 17);
    }

    public void AVL(int i2) {
        AnonymousClass1NK r1 = this.A00;
        AnonymousClass1NK.A00(r1, 3);
        synchronized (r1) {
            r1.A00 = i2;
        }
    }
}
