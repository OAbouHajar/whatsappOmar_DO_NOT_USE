package X;

import java.util.List;

/* renamed from: X.0HH  reason: invalid class name */
public class AnonymousClass0HH extends AnonymousClass0HC {
    public final AnonymousClass0O8 A00;

    public AnonymousClass0HH(List list) {
        super(list);
        int i2 = 0;
        AnonymousClass0O8 r1 = (AnonymousClass0O8) AnonymousClass000.A0R(list, 0).A0F;
        i2 = r1 != null ? r1.A01.length : i2;
        this.A00 = new AnonymousClass0O8(new float[i2], new int[i2]);
    }

    public /* bridge */ /* synthetic */ Object A09(C06520Wl r11, float f2) {
        AnonymousClass0O8 r8 = this.A00;
        AnonymousClass0O8 r7 = (AnonymousClass0O8) r11.A0F;
        AnonymousClass0O8 r9 = (AnonymousClass0O8) r11.A09;
        int[] iArr = r7.A01;
        int length = iArr.length;
        int[] iArr2 = r9.A01;
        int length2 = iArr2.length;
        if (length == length2) {
            for (int i2 = 0; i2 < length; i2++) {
                r8.A00[i2] = AnonymousClass000.A01(r9.A00[i2], r7.A00[i2], f2);
                r8.A01[i2] = C06280Vc.A02(f2, iArr[i2], iArr2[i2]);
            }
            return r8;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Cannot interpolate between gradients. Lengths vary (");
        A0r.append(length);
        A0r.append(" vs ");
        A0r.append(length2);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(")", A0r));
    }
}
