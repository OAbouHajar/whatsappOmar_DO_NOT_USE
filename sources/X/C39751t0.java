package X;

import android.content.Context;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.1t0  reason: invalid class name and case insensitive filesystem */
public class C39751t0 {
    public static final String A0A;
    public static final Pattern A0B = Pattern.compile("[#0,.-]+");
    public String A00;
    public String A01;
    public final C39781t3 A02;
    public final C88674au A03;
    public final C88674au A04;
    public final C88674au A05;
    public final C88674au A06;
    public final C39761t1 A07;
    public final String A08;
    public final String A09;

    static {
        StringBuilder sb = new StringBuilder("¤");
        sb.append(AnonymousClass01S.A06);
        sb.append("#,##0.00");
        A0A = sb.toString();
    }

    public C39751t0(C39781t3 r3, C39761t1 r4, AnonymousClass013 r5) {
        this.A02 = r3;
        this.A07 = r4;
        if (r3.A02) {
            this.A05 = new C88674au(r5.A08(9));
            this.A06 = new C88674au(r5.A08(11));
            this.A09 = r5.A08(10);
            this.A03 = new C88674au(r5.A08(6));
            this.A04 = new C88674au(r5.A08(8));
            this.A08 = r5.A08(7);
            return;
        }
        C88674au r0 = C88674au.A02;
        this.A04 = r0;
        this.A03 = r0;
        this.A06 = r0;
        this.A05 = r0;
        this.A08 = "";
        this.A09 = "";
    }

    public C39751t0(Context context, C39781t3 r4, C39761t1 r5, Locale locale) {
        this.A02 = r4;
        this.A07 = r5;
        this.A05 = new C88674au(C28911Ze.A01(context, locale, 9));
        this.A06 = new C88674au(C28911Ze.A01(context, locale, 11));
        this.A09 = C28911Ze.A01(context, locale, 10);
        this.A03 = new C88674au(C28911Ze.A01(context, locale, 6));
        this.A04 = new C88674au(C28911Ze.A01(context, locale, 8));
        this.A08 = C28911Ze.A01(context, locale, 7);
    }

    public static int A00(String str) {
        boolean z2;
        int i2 = 1;
        switch (str.hashCode()) {
            case 1632:
                z2 = str.equals("٠");
                break;
            case 1776:
                if (str.equals("۰")) {
                    return 2;
                }
                break;
            case 2406:
                z2 = str.equals("०");
                i2 = 4;
                break;
            case 2534:
                if (str.equals("০")) {
                    return 3;
                }
                break;
        }
        if (!z2) {
            return 5;
        }
        return i2;
    }

    public final String A01(String str, boolean z2) {
        String replaceFirst;
        String str2;
        C39781t3 r0 = this.A02;
        AnonymousClass4MC r2 = z2 ? r0.A00 : r0.A01;
        if (r2.A03) {
            replaceFirst = r2.A01;
            str2 = A0B.matcher(r2.A02).replaceFirst(str);
        } else {
            replaceFirst = A0B.matcher(r2.A01).replaceFirst(str);
            str2 = r2.A02;
        }
        if (!replaceFirst.isEmpty() && this.A06.A00(replaceFirst.codePointBefore(replaceFirst.length())) && this.A05.A00(this.A01.codePointAt(0))) {
            StringBuilder sb = new StringBuilder();
            sb.append(replaceFirst);
            sb.append(this.A09);
            replaceFirst = sb.toString();
        }
        if (!str2.isEmpty() && this.A04.A00(str2.codePointAt(0))) {
            C88674au r22 = this.A03;
            String str3 = this.A01;
            if (r22.A00(str3.codePointBefore(str3.length()))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.A08);
                sb2.append(str2);
                str2 = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(replaceFirst);
        sb3.append(this.A01);
        sb3.append(str2);
        return sb3.toString();
    }
}
