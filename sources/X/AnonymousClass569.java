package X;

/* renamed from: X.569  reason: invalid class name */
public final /* synthetic */ class AnonymousClass569 implements Runnable {
    public final /* synthetic */ AnonymousClass1WD A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ AnonymousClass569(AnonymousClass1WD r1, Integer num, String str, String str2, String str3) {
        this.A00 = r1;
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final void run() {
        this.A00.accept(new AnonymousClass4WM(this.A02, this.A03, this.A04, this.A01.intValue()));
    }
}
