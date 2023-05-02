package com.obwhatsapp.gifsearch;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass01Q;
import X.AnonymousClass021;
import X.AnonymousClass2GK;
import X.C13680ns;
import X.C25851Lj;
import X.C25861Lk;
import X.C25921Lq;
import X.C75683sY;
import X.C79043z6;
import X.C86974Uw;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Locale;

public class IDxRTaskShape78S0100000_1_I1 extends C79043z6 {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxRTaskShape78S0100000_1_I1(IDxResultShape16S0200000_2_I0 iDxResultShape16S0200000_2_I0, CharSequence charSequence, String str, int i2) {
        super((C25861Lk) iDxResultShape16S0200000_2_I0.A00, charSequence, str);
        this.A01 = i2;
        this.A00 = iDxResultShape16S0200000_2_I0;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass01Q r5 = (AnonymousClass01Q) obj;
        if (r5 == null) {
            ((C86974Uw) this.A00).A00((String) null, (Collection) null, true);
        } else {
            ((C86974Uw) this.A00).A00((String) r5.A00, (Collection) r5.A01, false);
        }
    }

    public AnonymousClass01Q A0B(String str) {
        int i2 = this.A01;
        Object obj = ((IDxResultShape16S0200000_2_I0) this.A00).A00;
        if (i2 != 0) {
            C75683sY r1 = new C75683sY();
            r1.A08 = "Tenor";
            r1.A00 = C13680ns.A0a();
            return C25921Lq.A01(r1, (C25921Lq) obj, str);
        }
        C75683sY r12 = new C75683sY();
        r12.A08 = "Giphy";
        r12.A00 = C13680ns.A0a();
        return C25851Lj.A00(r12, (C25851Lj) obj, str);
    }

    public String A0C(CharSequence charSequence, String str, Locale locale) {
        String A06;
        String A0C;
        String[] strArr;
        String A0h;
        if (this.A01 != 0) {
            String[] strArr2 = new String[6];
            strArr2[0] = "key";
            strArr2[1] = AnonymousClass021.A0P;
            strArr2[2] = "tag";
            strArr2[3] = charSequence.toString();
            strArr2[4] = "locale";
            C25861Lk r0 = (C25861Lk) ((IDxResultShape16S0200000_2_I0) this.A00).A00;
            if (locale == null) {
                StringBuilder A0o = AnonymousClass000.A0o();
                AnonymousClass013 r1 = r0.A04;
                A0o.append(r1.A06());
                A0o.append("_");
                A0h = AnonymousClass000.A0h(r1.A05(), A0o);
            } else if (TextUtils.isEmpty(locale.getCountry())) {
                A0h = locale.getLanguage();
            } else {
                StringBuilder A0o2 = AnonymousClass000.A0o();
                A0o2.append(locale.getLanguage());
                A0o2.append("_");
                A0h = AnonymousClass000.A0h(locale.getCountry(), A0o2);
            }
            strArr2[5] = A0h;
            A0C = AnonymousClass2GK.A0C("https://wa.tenor.co/v1/search", strArr2);
            if (TextUtils.isEmpty(str)) {
                return A0C;
            }
            strArr = new String[]{"pos", str};
        } else {
            String[] strArr3 = new String[8];
            strArr3[0] = "api_key";
            strArr3[1] = AnonymousClass021.A0F;
            strArr3[2] = "q";
            strArr3[3] = charSequence.toString();
            strArr3[4] = "lang";
            C25861Lk r12 = (C25861Lk) ((IDxResultShape16S0200000_2_I0) this.A00).A00;
            if (locale == null || TextUtils.isEmpty(locale.getLanguage())) {
                A06 = r12.A04.A06();
            } else if (!locale.getLanguage().equalsIgnoreCase("zh") || TextUtils.isEmpty(locale.getCountry())) {
                A06 = locale.getLanguage();
            } else {
                StringBuilder A0o3 = AnonymousClass000.A0o();
                A0o3.append(locale.getLanguage());
                A0o3.append("-");
                A06 = AnonymousClass000.A0h(locale.getCountry(), A0o3);
            }
            strArr3[5] = A06;
            strArr3[6] = "rating";
            strArr3[7] = "pg-13";
            A0C = AnonymousClass2GK.A0C("https://api.giphy.com/v1/gifs/search", strArr3);
            if (TextUtils.isEmpty(str)) {
                return A0C;
            }
            strArr = new String[]{"offset", str};
        }
        return AnonymousClass2GK.A0C(A0C, strArr);
    }
}
