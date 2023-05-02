package X;

import com.AssemMods.translator.Language;

/* renamed from: X.0dw  reason: invalid class name and case insensitive filesystem */
public class C08620dw implements C12670km {
    public static final C08620dw A00 = new C08620dw();
    public static final C06000Tv A01;

    static {
        String[] strArr = new String[11];
        strArr[0] = "t";
        strArr[1] = "f";
        strArr[2] = "s";
        strArr[3] = "j";
        strArr[4] = Language.TURKISH;
        strArr[5] = "lh";
        strArr[6] = "ls";
        strArr[7] = "fc";
        strArr[8] = "sc";
        strArr[9] = "sw";
        A01 = C06000Tv.A00("of", strArr, 10);
    }

    public /* bridge */ /* synthetic */ Object AaC(C09090et r15, float f2) {
        AnonymousClass0JN r2 = AnonymousClass0JN.CENTER;
        r15.A0F();
        String str = null;
        AnonymousClass0JN r3 = r2;
        String str2 = null;
        float f3 = 0.0f;
        int i2 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        float f6 = 0.0f;
        boolean z2 = true;
        while (r15.A0M()) {
            switch (r15.A09(A01)) {
                case 0:
                    str = r15.A0D();
                    break;
                case 1:
                    str2 = r15.A0D();
                    break;
                case 2:
                    f3 = C09090et.A05(r15);
                    break;
                case 3:
                    int A08 = r15.A08();
                    r3 = r2;
                    if (A08 <= 2 && A08 >= 0) {
                        r3 = AnonymousClass0JN.values()[A08];
                        break;
                    }
                case 4:
                    i2 = r15.A08();
                    break;
                case 5:
                    f4 = C09090et.A05(r15);
                    break;
                case 6:
                    f5 = C09090et.A05(r15);
                    break;
                case 7:
                    i3 = C06550Wr.A01(r15);
                    break;
                case 8:
                    i4 = C06550Wr.A01(r15);
                    break;
                case 9:
                    f6 = C09090et.A05(r15);
                    break;
                case 10:
                    z2 = r15.A0N();
                    break;
                default:
                    r15.A0I();
                    r15.A0J();
                    break;
            }
        }
        r15.A0H();
        return new AnonymousClass0Q4(r3, str, str2, f3, f4, f5, f6, i2, i3, i4, z2);
    }
}
