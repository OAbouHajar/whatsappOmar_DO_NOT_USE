package X;

/* renamed from: X.0IN  reason: invalid class name */
public class AnonymousClass0IN extends AnonymousClass0QD {
    public float A00 = 0.0f;
    public final /* synthetic */ AnonymousClass0XJ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0IN(AnonymousClass0XJ r2) {
        super(r2);
        this.A01 = r2;
    }

    public void A00(String str) {
        this.A00 += this.A01.A02.A00.measureText(str);
    }
}
