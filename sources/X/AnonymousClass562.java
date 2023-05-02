package X;

/* renamed from: X.562  reason: invalid class name */
public final /* synthetic */ class AnonymousClass562 implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass4GS A04;

    public /* synthetic */ AnonymousClass562(AnonymousClass4GS r1, float f2, int i2, int i3, int i4) {
        this.A04 = r1;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = f2;
    }

    public final void run() {
        AnonymousClass4GS r0 = this.A04;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        r0.A01.AZe(this.A00, i2, i3, i4);
    }
}
