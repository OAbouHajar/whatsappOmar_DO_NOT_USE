package X;

import com.AssemMods.translator.Language;

/* renamed from: X.4at  reason: invalid class name and case insensitive filesystem */
public class C88664at {
    public static final C88664at A02 = new C88664at(AnonymousClass41V.AUTO, 1.0E21f);
    public final float A00;
    public final AnonymousClass41V A01;

    public C88664at(AnonymousClass41V r1, float f2) {
        this.A00 = f2;
        this.A01 = r1;
    }

    public String toString() {
        switch (this.A01.ordinal()) {
            case 0:
                return Float.toString(this.A00);
            case 1:
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append(this.A00);
                return AnonymousClass000.A0h("%", A0o);
            default:
                return Language.AUTO_DETECT;
        }
    }
}
