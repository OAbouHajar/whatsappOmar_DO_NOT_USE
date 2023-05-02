package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.013  reason: invalid class name */
public class AnonymousClass013 {
    public static final boolean A0C;
    public Context A00;
    public C28901Zd A01;
    public DateFormat A02;
    public DateFormat A03;
    public Locale A04;
    public Locale A05;
    public boolean A06;
    public final C16980tz A07;
    public final C16290sm A08;
    public final C23421Bx A09;
    public final Object A0A = new Object();
    public final Set A0B = new HashSet();

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 26) {
            z2 = true;
        }
        A0C = z2;
    }

    public AnonymousClass013(C16980tz r2, C16290sm r3, C23421Bx r4) {
        this.A07 = r2;
        this.A08 = r3;
        this.A09 = r4;
        Context A012 = A01();
        this.A00 = A012;
        Locale A002 = A00(A012);
        this.A05 = A002;
        this.A04 = A002;
        C28891Zc.A09();
    }

    public static Locale A00(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        Locale locale = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().get(0) : configuration.locale;
        if (locale != null) {
            return locale;
        }
        Locale locale2 = Locale.getDefault();
        return locale2 == null ? Locale.US : locale2;
    }

    public Context A01() {
        Context baseContext;
        Context A012 = this.A07.A01();
        while ((A012 instanceof ContextWrapper) && (baseContext = ((ContextWrapper) A012).getBaseContext()) != null) {
            A012 = baseContext;
        }
        return A012;
    }

    public Context A02(Context context) {
        if (A0C || context == null || context.getResources().getConfiguration().locale.equals(this.A04)) {
            return context;
        }
        Configuration configuration = new Configuration();
        configuration.setLocale(this.A04);
        return context.createConfigurationContext(configuration);
    }

    public AnonymousClass02E A03() {
        return A04().A01;
    }

    public final C28901Zd A04() {
        C28901Zd r0;
        synchronized (this.A0A) {
            if (this.A01 == null) {
                A0P();
            }
            r0 = this.A01;
        }
        return r0;
    }

    public String A05() {
        String country = A00(this.A00).getCountry();
        if (AnonymousClass1WH.A0B(country)) {
            return country;
        }
        StringBuilder sb = new StringBuilder("verifynumber/requestcode/invalid-country '");
        sb.append(country);
        sb.append("'");
        Log.i(sb.toString());
        return "ZZ";
    }

    public String A06() {
        String language = A00(this.A00).getLanguage();
        if (AnonymousClass1WH.A0A(language)) {
            return language;
        }
        StringBuilder sb = new StringBuilder("verifynumber/requestcode/invalid-language '");
        sb.append(language);
        sb.append("'");
        Log.i(sb.toString());
        return "zz";
    }

    public String A07() {
        StringBuilder sb = new StringBuilder();
        sb.append(A06());
        sb.append("_");
        sb.append(A05());
        return sb.toString();
    }

    public String A08(int i2) {
        return A04().A02.A03(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r1.A03.A03(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A09(int r3) {
        /*
            r2 = this;
            X.1Zd r1 = r2.A04()
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0011
            X.1UQ r0 = r1.A03
            java.lang.String r0 = r0.A03(r3)
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            android.content.Context r0 = r2.A00
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass013.A09(int):java.lang.String");
    }

    public String A0A(int i2, String str) {
        C28901Zd A042 = A04();
        int i3 = 1;
        if (A042.A07) {
            if (!str.equals("1")) {
                i3 = 2;
            }
            return this.A00.getResources().getQuantityString(i2, i3);
        }
        String A043 = A042.A03.A04(i2, str);
        if (A043 != null) {
            return A043;
        }
        try {
            i3 = (int) Double.parseDouble(str);
        } catch (NumberFormatException unused) {
        }
        return this.A00.getResources().getQuantityString(i2, i3);
    }

    public String A0B(int i2, Object... objArr) {
        return String.format(A00(this.A00), A08(i2), objArr);
    }

    public String A0C(int i2, Object... objArr) {
        return String.format(A00(this.A00), A09(i2), objArr);
    }

    public String A0D(long j2, int i2) {
        return A04().A02.A04(Long.valueOf(j2), i2);
    }

    public String A0E(long j2, int i2) {
        C28901Zd A042 = A04();
        if (A042.A07) {
            int i3 = 2;
            if (j2 == 1) {
                i3 = 1;
            }
            return this.A00.getResources().getQuantityString(i2, i3);
        }
        String A052 = A042.A03.A05(j2, i2);
        return A052 == null ? this.A00.getResources().getQuantityString(i2, (int) j2) : A052;
    }

    public String A0F(TypedArray typedArray, int i2) {
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId != 0) {
            return A09(resourceId);
        }
        return null;
    }

    public String A0G(String str) {
        AnonymousClass02E A032 = A03();
        AnonymousClass02F r0 = A032.A00;
        if (str == null) {
            return null;
        }
        return A032.A03(r0, str).toString();
    }

    public String A0H(String str) {
        AnonymousClass02E A032 = A03();
        AnonymousClass02F r0 = AnonymousClass02G.A04;
        if (str == null) {
            return null;
        }
        return A032.A03(r0, str).toString();
    }

    public String A0I(Object[] objArr, int i2, long j2) {
        return String.format(A00(this.A00), A0D(j2, i2), objArr);
    }

    public String A0J(Object[] objArr, int i2, long j2) {
        return String.format(A00(this.A00), A0E(j2, i2), objArr);
    }

    public NumberFormat A0K() {
        return (NumberFormat) A04().A04.clone();
    }

    public NumberFormat A0L() {
        return (NumberFormat) A04().A05.clone();
    }

    public void A0M() {
        if (this.A06) {
            Locale.setDefault(this.A04);
            A0Q();
        }
    }

    public final void A0N() {
        for (AnonymousClass1D2 AT2 : this.A0B) {
            AT2.AT2();
        }
    }

    public final void A0O() {
        synchronized (this.A0A) {
            this.A01 = null;
        }
        this.A03 = null;
        this.A02 = null;
        C28891Zc.A09();
    }

    public final void A0P() {
        C28921Zf r3 = new C28921Zf("OBWhatsAppLocale/setDerivedFieldsUnderLock/fieldCreationTimer");
        this.A01 = new C28901Zd(this.A00, this.A04);
        r3.A01();
    }

    public final void A0Q() {
        if (!this.A00.getResources().getConfiguration().locale.equals(this.A04)) {
            if (A0C) {
                Context A012 = A01();
                this.A00 = A012;
                Resources resources = A012.getResources();
                Configuration configuration = resources.getConfiguration();
                configuration.locale = this.A04;
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            } else {
                Configuration configuration2 = new Configuration();
                configuration2.setLocale(this.A04);
                this.A00 = A01().createConfigurationContext(configuration2);
            }
            A0O();
        }
    }

    public void A0R(Configuration configuration) {
        if (!this.A09.A00()) {
            Locale locale = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().get(0) : configuration.locale;
            if (locale == null && (locale = Locale.getDefault()) == null) {
                locale = Locale.US;
            }
            if (!this.A05.equals(locale)) {
                StringBuilder sb = new StringBuilder("whatsapplocale/savedefaultlanguage/phone language changed to: ");
                sb.append(AnonymousClass1WH.A05(locale));
                Log.i(sb.toString());
                this.A05 = locale;
                if (!this.A06) {
                    this.A04 = locale;
                    A0O();
                    A0N();
                }
            }
        }
    }

    public void A0S(String str) {
        Locale locale;
        StringBuilder sb = new StringBuilder("whatsapplocale/saveandapplylanguage/language to save: ");
        sb.append(TextUtils.isEmpty(str) ? "device default" : str);
        Log.i(sb.toString());
        if (TextUtils.isEmpty(str) || AnonymousClass1WH.A05(this.A05).equals(str)) {
            this.A08.A00();
            this.A06 = false;
            locale = this.A05;
        } else {
            this.A08.A01(str);
            this.A06 = true;
            locale = AnonymousClass1WH.A09(str);
        }
        this.A04 = locale;
        StringBuilder sb2 = new StringBuilder("whatsapplocale/saveandapplylanguage/setting language ");
        sb2.append(locale.getDisplayLanguage(Locale.US));
        Log.i(sb2.toString());
        Locale.setDefault(this.A04);
        A0Q();
        A0N();
    }

    public boolean A0T() {
        return A04().A06;
    }

    public String[] A0U(int[] iArr) {
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = A09(iArr[i2]);
        }
        return strArr;
    }
}
