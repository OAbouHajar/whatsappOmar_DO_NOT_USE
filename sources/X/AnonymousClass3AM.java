package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.3AM  reason: invalid class name */
public class AnonymousClass3AM {
    public int A00;
    public int A01;
    public String A02 = "";
    public String A03;
    public String[] A04;
    public String[] A05;
    public final Locale A06;
    public final Locale A07;

    public AnonymousClass3AM(String str, String str2, Locale locale, Locale locale2) {
        this.A03 = (!"1".equals(str) || str2.length() != 10 || !"55501".equals(str2.substring(3, 8))) ? C18160wF.A01(str, str2) : "QQ";
        this.A07 = locale;
        this.A06 = locale2;
        A00();
    }

    public AnonymousClass3AM(String str, Locale locale, Locale locale2) {
        this.A03 = str;
        this.A07 = locale;
        this.A06 = locale2;
        A00();
    }

    public final void A00() {
        ArrayList arrayList;
        Locale locale = this.A06;
        String A012 = AnonymousClass1WH.A01(locale);
        Locale locale2 = this.A07;
        String A013 = AnonymousClass1WH.A01(locale2);
        boolean equals = A012.equals(A013);
        try {
            String[] strArr = (String[]) AnonymousClass28f.A03.A01(this.A03);
            if (strArr == null) {
                arrayList = Collections.emptyList();
            } else {
                ArrayList A0i = C13690nt.A0i(r2);
                for (String A002 : strArr) {
                    A0i.add(C33601iq.A00(A002));
                }
                arrayList = A0i;
            }
        } catch (IllegalArgumentException unused) {
            arrayList = Collections.emptyList();
        }
        if (!arrayList.isEmpty() || !equals) {
            int size = arrayList.size() + 2;
            ArrayList A0i2 = C13690nt.A0i(size);
            ArrayList A0i3 = C13690nt.A0i(size);
            A0i2.add(C33601iq.A01(locale2));
            A0i3.add(AnonymousClass1WH.A05(locale2));
            int i2 = -1;
            if (equals) {
                i2 = 0;
            }
            this.A00 = i2;
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass000.A0m(it);
                Locale A09 = AnonymousClass1WH.A09(A0m);
                String A014 = AnonymousClass1WH.A01(A09);
                if (!A014.equals(A013)) {
                    if (!C88944bL.A04.A00(AnonymousClass1WH.A01(A09))) {
                        Log.i(C13680ns.A0h("whatsapplocaledata/getlanguagepreferencesdata/non-renderable language: ", A0m));
                        stringBuffer.append(A0m);
                        stringBuffer.append(",");
                    } else {
                        A0i2.add(C33601iq.A01(A09));
                        A0i3.add(AnonymousClass1WH.A05(A09));
                        if (this.A00 == -1 && A014.equals(A012)) {
                            this.A00 = A0i2.size() - 1;
                        }
                    }
                }
            }
            if (this.A00 == -1) {
                A0i2.add(C33601iq.A01(locale));
                A0i3.add(AnonymousClass1WH.A05(locale));
                this.A00 = A0i2.size() - 1;
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.setLength(stringBuffer.length() - 1);
                this.A02 = stringBuffer.toString();
            }
            int size2 = A0i2.size();
            this.A01 = size2;
            if (size2 >= 2) {
                this.A04 = (String[]) A0i2.toArray(new String[0]);
                this.A05 = (String[]) A0i3.toArray(new String[0]);
                return;
            }
        }
        this.A01 = 0;
    }
}
