package X;

import android.util.Pair;

/* renamed from: X.5tO  reason: invalid class name and case insensitive filesystem */
public final class C117685tO {
    public final int A00;
    public final Pair A01;
    public final Pair A02;
    public final C116285r8 A03;
    public final AnonymousClass685 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C117685tO(Pair pair, Pair pair2, C116285r8 r6, AnonymousClass685 r7, String str, String str2, String str3, int i2, boolean z2, boolean z3, boolean z4) {
        Object obj;
        Object obj2;
        if (pair.first == null || (obj = pair.second) == null || ((int[]) obj).length != 4 || pair2.first == null || (obj2 = pair2.second) == null || ((int[]) obj2).length != 4) {
            throw AnonymousClass000.A0T("Currency symbol style is not set properly");
        }
        this.A08 = true;
        this.A07 = str;
        this.A05 = str2;
        this.A00 = i2;
        this.A0B = z2;
        this.A06 = str3;
        this.A09 = z3;
        this.A0A = z4;
        this.A03 = r6;
        this.A01 = pair;
        this.A02 = pair2;
        this.A04 = r7;
    }
}
