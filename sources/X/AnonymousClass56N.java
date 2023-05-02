package X;

/* renamed from: X.56N  reason: invalid class name */
public class AnonymousClass56N implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ AnonymousClass2QM A05;
    public final /* synthetic */ Runnable A06;

    public AnonymousClass56N(AnonymousClass2QM r1, Runnable runnable, float f2, float f3, float f4, float f5, long j2) {
        this.A05 = r1;
        this.A04 = j2;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
        this.A01 = f5;
        this.A06 = runnable;
    }

    public void run() {
        float min = Math.min(300.0f, (float) (System.currentTimeMillis() - this.A04));
        AnonymousClass2QM r2 = this.A05;
        r2.A02(this.A03 + (this.A02 * min), this.A00, this.A01);
        this.A06.run();
        if (min < 300.0f) {
            r2.A09.post(this);
        }
    }
}
