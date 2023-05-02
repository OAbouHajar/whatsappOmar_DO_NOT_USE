package X;

import android.net.Uri;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1XL  reason: invalid class name */
public class AnonymousClass1XL {
    public final C38231qS A00;
    public final AnonymousClass210 A01;
    public final AnonymousClass1XJ A02;
    public final String A03;

    public AnonymousClass1XL(C38231qS r1, AnonymousClass210 r2, AnonymousClass1XJ r3, String str) {
        this.A03 = str;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public static AnonymousClass1XL A00(Uri uri, AnonymousClass1XM r32, AnonymousClass1XN r33, AnonymousClass1XJ r34, AnonymousClass1XK r35, AnonymousClass1XO r36, String str, int i2, boolean z2, boolean z3, boolean z4) {
        AnonymousClass1XK r6 = r35;
        int i3 = i2;
        boolean z5 = z3;
        return new AnonymousClass1XL(new C38231qS(r32, (AnonymousClass21D) null, r6, (File) null, (String) null, (String) null, "optimistic", (int[]) null, i3, 0, 0, true, z4, false, false), new AnonymousClass210(r33, r6, r36, (File) null, (String) null, uri.toString(), (String) null, (String) null, 0, i3, 0, 0, z2, z5, z5, false, false), r34, str);
    }

    public static AnonymousClass1XL A01(C16040sK r46, C43241zg r47, C19410yO r48, C215614o r49, AnonymousClass1QT r50, AnonymousClass1XJ r51, boolean z2) {
        boolean z3;
        boolean z4;
        AnonymousClass1XM r7;
        C43241zg r15 = r47;
        C16750ta r0 = r15.A00().A02;
        AnonymousClass00B.A06(r0);
        String str = r0.A0I;
        AnonymousClass4ER r3 = new AnonymousClass4ER(r50);
        CopyOnWriteArrayList copyOnWriteArrayList = r15.A01;
        Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z3 = false;
                break;
            }
            if (r3.A00.A0A((C16730tY) it.next())) {
                z3 = true;
                break;
            }
        }
        C16730tY A002 = r15.A00();
        boolean A04 = r15.A04();
        C16750ta r4 = A002.A02;
        AnonymousClass00B.A06(r4);
        AnonymousClass1XO r8 = A002 instanceof C38641rB ? ((C38641rB) A002).A02 : null;
        byte b2 = A002.A10;
        AnonymousClass1XN A003 = r49.A00(b2, A04);
        String str2 = r4.A0H;
        AnonymousClass210 r16 = new AnonymousClass210(A003, C31831f6.A01(b2, A002.A08), r8, r4.A0F, str2, A002.A14(), A002.A05, A002.A06, r4.A05, A002.A08, r4.A0D, r4.A0E, A04, z3, !r4.A0O, z2, r4.A0N);
        C16730tY A004 = r15.A00();
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z4 = !r48.A06().isEmpty();
                break;
            }
            if (!C30921dB.A01(r46, (C16740tZ) it2.next())) {
                z4 = true;
                break;
            }
        }
        C16750ta r2 = A004.A02;
        AnonymousClass00B.A06(r2);
        long j2 = A004.A0I;
        byte[] bArr = r2.A0U;
        long j3 = r2.A0B;
        if (bArr == null) {
            r7 = null;
        } else {
            if (j3 <= 0) {
                j3 = j2;
            }
            r7 = new AnonymousClass1XM(bArr, j3);
        }
        C42591y4 A12 = A004.A12();
        return new AnonymousClass1XL(new C38231qS(r7, (AnonymousClass21D) null, C31831f6.A01(A004.A10, A004.A08), r2.A0F, A004.A05, A004.A04, "mms", A12 != null ? A12.A06() : null, A004.A08, r2.A04, A004.A01, z4, true, false, C42941yx.A01(A004)), r16, r51, str);
    }
}
