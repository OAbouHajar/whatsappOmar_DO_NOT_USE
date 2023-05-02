package X;

/* renamed from: X.1z3  reason: invalid class name */
public class AnonymousClass1z3 implements C37891pu {
    public float A00;
    public final AnonymousClass1z2 A01;

    public AnonymousClass1z3(AnonymousClass1z2 r1, float f2) {
        this.A00 = f2;
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ boolean A6R(Object obj) {
        String str = ((AnonymousClass1z2) obj).A02;
        AnonymousClass00B.A06(str);
        return str.equals(this.A01.A02);
    }

    public long A9n() {
        return this.A01.A00;
    }

    public /* bridge */ /* synthetic */ Object ACV() {
        return this.A01;
    }

    public float AH5() {
        return this.A00;
    }

    public void Af1(float f2) {
        this.A00 = f2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("WeightedRecentStickerIdentifier{");
        stringBuffer.append("stickerIdentifier=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", weight=");
        stringBuffer.append(this.A00);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
