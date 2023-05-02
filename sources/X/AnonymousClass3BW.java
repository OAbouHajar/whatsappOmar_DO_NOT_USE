package X;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.3BW  reason: invalid class name */
public class AnonymousClass3BW {
    public static final String[] A00 = {"ET", "NE", "NG"};

    public static String A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(str.substring(0, 1).toUpperCase(Locale.US));
        return AnonymousClass000.A0h(str.substring(1), A0o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(X.C16040sK r4, X.AnonymousClass01V r5, X.AnonymousClass013 r6) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r2 = X.C33601iq.A01(r0)
            java.lang.String r1 = X.AnonymousClass1WH.A05(r0)
            X.4I4 r0 = new X.4I4
            r0.<init>(r2, r1)
            r3.add(r0)
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r1 = r0.locale
            boolean r0 = A02()
            if (r0 != 0) goto L_0x0038
            java.lang.String r2 = X.C33601iq.A01(r1)
            java.lang.String r1 = X.AnonymousClass1WH.A05(r1)
            X.4I4 r0 = new X.4I4
            r0.<init>(r2, r1)
            r3.add(r0)
        L_0x0038:
            r4.A0B()
            com.obwhatsapp.Me r0 = r4.A00
            if (r0 == 0) goto L_0x0085
            java.lang.String r5 = r0.cc
            java.lang.String r2 = r0.number
            java.util.Locale r1 = r6.A05
            java.util.Locale r0 = r6.A04
            X.3AM r4 = new X.3AM
            r4.<init>(r5, r2, r1, r0)
        L_0x004c:
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x00ad
            r5 = 0
        L_0x0051:
            int r0 = r4.A01
            if (r5 >= r0) goto L_0x00b2
            java.lang.String[] r0 = r4.A04
            r2 = r0[r5]
            java.util.Iterator r1 = r3.iterator()
        L_0x005d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r1.next()
            X.4I4 r0 = (X.AnonymousClass4I4) r0
            java.lang.String r0 = r0.A00
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005d
        L_0x0071:
            int r5 = r5 + 1
            goto L_0x0051
        L_0x0074:
            java.lang.String[] r0 = r4.A04
            r2 = r0[r5]
            java.lang.String[] r0 = r4.A05
            r1 = r0[r5]
            X.4I4 r0 = new X.4I4
            r0.<init>(r2, r1)
            r3.add(r0)
            goto L_0x0071
        L_0x0085:
            android.telephony.TelephonyManager r0 = r5.A0N()
            if (r0 == 0) goto L_0x00ad
            java.lang.String r1 = r0.getSimCountryIso()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00ad
            java.lang.String r2 = r1.toUpperCase()
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r1 = r0.locale
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.3AM r4 = new X.3AM
            r4.<init>(r2, r1, r0)
            goto L_0x004c
        L_0x00ad:
            java.lang.String r0 = "LanguageSelectorUtils/error getting locale data"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00b2:
            java.util.Set r0 = X.AnonymousClass28f.A04
            java.util.Iterator r5 = r0.iterator()
        L_0x00b8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.String r4 = X.AnonymousClass000.A0m(r5)
            java.util.Locale r0 = X.AnonymousClass1WH.A09(r4)
            java.lang.String r2 = X.C33601iq.A01(r0)
            java.util.Iterator r1 = r3.iterator()
        L_0x00ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r0 = r1.next()
            X.4I4 r0 = (X.AnonymousClass4I4) r0
            java.lang.String r0 = r0.A00
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00ce
            goto L_0x00b8
        L_0x00e3:
            X.4I4 r0 = new X.4I4
            r0.<init>(r2, r4)
            r3.add(r0)
            goto L_0x00b8
        L_0x00ec:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BW.A01(X.0sK, X.01V, X.013):java.util.List");
    }

    public static boolean A02() {
        return Locale.getDefault().getLanguage().equals(Resources.getSystem().getConfiguration().locale.getLanguage());
    }
}
