package X;

import android.view.View;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1uk  reason: invalid class name and case insensitive filesystem */
public class C40821uk extends C40831ul implements Runnable, C40841um {
    public int A00;
    public C16050sL A01;
    public final AnonymousClass11A A02;
    public final C17240ul A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public C40821uk(AnonymousClass11A r9, C17240ul r10, C16050sL r11, String str, List list, int i2) {
        this(r9, r10, r11, str, list, i2, true);
    }

    public C40821uk(AnonymousClass11A r2, C17240ul r3, C16050sL r4, String str, List list, int i2, boolean z2) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r4;
        this.A04 = str;
        this.A05 = list;
        this.A00 = i2;
        this.A06 = z2;
        if (list != null) {
            Arrays.deepToString(list.toArray());
        }
    }

    public void A01(Integer num) {
        AnonymousClass2OJ r1;
        View view;
        if (this instanceof AnonymousClass2O7) {
            AnonymousClass2O7 r4 = (AnonymousClass2O7) this;
            AnonymousClass2O8 r12 = r4.A00;
            if (!r12.A01.isFinishing() && (view = r12.A00) != null) {
                view.postDelayed(new RunnableRunnableShape9S0100000_I0_8(r4, 27), 300);
            }
        } else if (this instanceof AnonymousClass32P) {
            ((AnonymousClass32P) this).A00.A2Q();
        } else if (this instanceof AnonymousClass32Q) {
            ((AnonymousClass32Q) this).A00.A09(num);
        } else {
            if (this instanceof C49632Un) {
                C49632Un r13 = (C49632Un) this;
                if (num != null) {
                    r13.A00.A01.A09(num);
                }
                r1 = r13.A00.A09;
            } else if (this instanceof AnonymousClass2Us) {
                AnonymousClass2Us r3 = (AnonymousClass2Us) this;
                if (num != null) {
                    AnonymousClass2AS r2 = r3.A00;
                    if (num.intValue() == 406) {
                        r2.A0l.A06(false);
                    }
                    r2.A0C.A09(num);
                }
                r1 = r3.A00.A0q;
            } else {
                return;
            }
            r1.A09(Boolean.FALSE);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d7, code lost:
        if (r11 != 403) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ach(int r11) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.AnonymousClass2O7
            if (r0 == 0) goto L_0x001a
            r3 = r10
            X.2O7 r3 = (X.AnonymousClass2O7) r3
            X.2O8 r0 = r3.A00
            X.0pt r2 = r0.A02
            r1 = 15
            com.facebook.redex.RunnableRunnableShape0S0101000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0101000_I0
            r0.<init>((java.lang.Object) r3, (int) r11, (int) r1)
            r2.A0K(r0)
            r0 = 0
            r3.A01(r0)
            return
        L_0x001a:
            boolean r0 = r10 instanceof X.AnonymousClass2Us
            if (r0 != 0) goto L_0x0078
            java.lang.String r0 = "groupmgr/request failed : "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r0 = " | "
            r1.append(r0)
            X.0sL r2 = r10.A01
            r1.append(r2)
            r1.append(r0)
            int r9 = r10.A00
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.5CS r0 = r10.A01
            r0.cancel()
            r0 = 30
            r6 = 404(0x194, float:5.66E-43)
            r8 = 401(0x191, float:5.62E-43)
            r5 = 403(0x193, float:5.65E-43)
            r4 = 0
            if (r9 == r0) goto L_0x00e1
            r0 = 159(0x9f, float:2.23E-43)
            r7 = 3012(0xbc4, float:4.221E-42)
            r3 = 3011(0xbc3, float:4.22E-42)
            r1 = 3010(0xbc2, float:4.218E-42)
            if (r9 == r0) goto L_0x00d5
            r0 = 161(0xa1, float:2.26E-43)
            if (r9 == r0) goto L_0x00ca
            r0 = 213(0xd5, float:2.98E-43)
            if (r9 == r0) goto L_0x00d5
            r0 = 224(0xe0, float:3.14E-43)
            if (r9 == r0) goto L_0x00d5
            r0 = 91
            if (r9 == r0) goto L_0x00b9
            r0 = 92
            if (r9 == r0) goto L_0x00b9
            switch(r9) {
                case 15: goto L_0x009c;
                case 16: goto L_0x00f2;
                case 17: goto L_0x0080;
                default: goto L_0x0072;
            }
        L_0x0072:
            X.11A r1 = r10.A02
            r0 = 0
            r1.A08(r2, r0)
        L_0x0078:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r10.A01(r0)
            return
        L_0x0080:
            r1 = 2006(0x7d6, float:2.811E-42)
            if (r11 == r8) goto L_0x00fa
            r0 = 406(0x196, float:5.69E-43)
            if (r11 == r0) goto L_0x0094
            if (r11 == r5) goto L_0x0091
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r11 == r6) goto L_0x00fa
            r1 = 2005(0x7d5, float:2.81E-42)
            goto L_0x00fa
        L_0x0091:
            r1 = 2007(0x7d7, float:2.812E-42)
            goto L_0x00fa
        L_0x0094:
            r1 = 2009(0x7d9, float:2.815E-42)
            java.lang.String r0 = r10.A04
            X.C17240ul.A01(r1, r0)
            goto L_0x0072
        L_0x009c:
            r1 = 2011(0x7db, float:2.818E-42)
            if (r11 == r8) goto L_0x00fa
            r0 = 408(0x198, float:5.72E-43)
            r1 = 3007(0xbbf, float:4.214E-42)
            if (r11 == r0) goto L_0x00fa
            r0 = 429(0x1ad, float:6.01E-43)
            if (r11 == r0) goto L_0x00b6
            if (r11 == r5) goto L_0x00b3
            r1 = 2013(0x7dd, float:2.821E-42)
            if (r11 == r6) goto L_0x00fa
            r1 = 2010(0x7da, float:2.817E-42)
            goto L_0x00fa
        L_0x00b3:
            r1 = 2012(0x7dc, float:2.82E-42)
            goto L_0x00fa
        L_0x00b6:
            r1 = 3005(0xbbd, float:4.211E-42)
            goto L_0x00fa
        L_0x00b9:
            if (r11 == r8) goto L_0x00c7
            if (r11 == r5) goto L_0x00c4
            r1 = 2021(0x7e5, float:2.832E-42)
            if (r11 == r6) goto L_0x00fa
            r1 = 2018(0x7e2, float:2.828E-42)
            goto L_0x00fa
        L_0x00c4:
            r1 = 2020(0x7e4, float:2.83E-42)
            goto L_0x00fa
        L_0x00c7:
            r1 = 2019(0x7e3, float:2.829E-42)
            goto L_0x00fa
        L_0x00ca:
            if (r11 == r8) goto L_0x00fa
            if (r11 == r5) goto L_0x00dd
            r0 = 405(0x195, float:5.68E-43)
            if (r11 != r0) goto L_0x00d9
            r1 = 3014(0xbc6, float:4.224E-42)
            goto L_0x00fa
        L_0x00d5:
            if (r11 == r8) goto L_0x00fa
            if (r11 == r5) goto L_0x00dd
        L_0x00d9:
            X.C17240ul.A01(r7, r4)
            goto L_0x0072
        L_0x00dd:
            X.C17240ul.A01(r3, r4)
            goto L_0x0072
        L_0x00e1:
            if (r11 == r8) goto L_0x00ef
            if (r11 == r5) goto L_0x00ec
            r1 = 2017(0x7e1, float:2.826E-42)
            if (r11 == r6) goto L_0x00fa
            r1 = 2014(0x7de, float:2.822E-42)
            goto L_0x00fa
        L_0x00ec:
            r1 = 2016(0x7e0, float:2.825E-42)
            goto L_0x00fa
        L_0x00ef:
            r1 = 2015(0x7df, float:2.824E-42)
            goto L_0x00fa
        L_0x00f2:
            if (r11 == r5) goto L_0x00ff
            r1 = 2024(0x7e8, float:2.836E-42)
            if (r11 == r6) goto L_0x00fa
            r1 = 2022(0x7e6, float:2.833E-42)
        L_0x00fa:
            X.C17240ul.A01(r1, r4)
            goto L_0x0072
        L_0x00ff:
            r1 = 2023(0x7e7, float:2.835E-42)
            goto L_0x00fa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40821uk.Ach(int):void");
    }

    public void run() {
        this.A01.cancel();
        StringBuilder sb = new StringBuilder("groupmgr/request success/");
        sb.append(this.A00);
        Log.i(sb.toString());
        A01((Integer) null);
    }
}
