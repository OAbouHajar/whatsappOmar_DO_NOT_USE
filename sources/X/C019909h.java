package X;

/* renamed from: X.09h  reason: invalid class name and case insensitive filesystem */
public class C019909h implements AnonymousClass023 {
    public int A00 = -1;
    public final AnonymousClass028 A01;
    public final AnonymousClass023 A02;

    public C019909h(AnonymousClass028 r2, AnonymousClass023 r3) {
        this.A01 = r2;
        this.A02 = r3;
    }

    public void AOH(Object obj) {
        int i2 = this.A00;
        int i3 = this.A01.A01;
        if (i2 != i3) {
            this.A00 = i3;
            this.A02.AOH(obj);
        }
    }
}
