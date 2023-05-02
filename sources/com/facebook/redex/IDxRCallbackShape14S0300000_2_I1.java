package com.facebook.redex;

import X.AnonymousClass027;
import X.AnonymousClass028;
import X.AnonymousClass1N5;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.AnonymousClass4A0;
import X.AnonymousClass4IR;
import X.AnonymousClass4U6;
import X.AnonymousClass4W1;
import X.AnonymousClass4W5;
import X.AnonymousClass4WN;
import X.C13680ns;
import X.C15220qW;
import X.C16300so;
import X.C18450wi;
import X.C19550yc;
import X.C23401Bv;
import X.C26131Ml;
import X.C28371Vv;
import X.C32271fx;
import X.C77593w2;
import X.C77653wE;
import X.C83114Fk;
import X.C89184bj;
import X.C93684jb;
import android.app.Application;
import android.text.format.DateFormat;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class IDxRCallbackShape14S0300000_2_I1 implements C19550yc {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxRCallbackShape14S0300000_2_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public void APb(String str) {
        if (this.A03 != 0) {
            ((AnonymousClass028) this.A02).A09(Boolean.FALSE);
        } else {
            Log.e("activateInternationalPayments/onActivateInternational/onDeliveryFailure");
        }
    }

    public void AQe(C28371Vv r8, String str) {
        if (this.A03 != 0) {
            ((AnonymousClass028) this.A02).A09(Boolean.FALSE);
            return;
        }
        C18450wi.A0H(r8, 1);
        AnonymousClass4U6 r0 = new AnonymousClass4U6(((C77593w2) this.A02).A00, r8, (C83114Fk) this.A01);
        C89184bj r3 = null;
        IndiaUpiInternationalActivationViewModel indiaUpiInternationalActivationViewModel = ((AnonymousClass4IR) this.A00).A01;
        AnonymousClass027 r6 = indiaUpiInternationalActivationViewModel.A00;
        C89184bj r5 = (C89184bj) r6.A01();
        if (r5 != null) {
            Long l2 = r0.A01.A02;
            C18450wi.A0B(l2);
            long longValue = l2.longValue();
            Application application = indiaUpiInternationalActivationViewModel.A00;
            r3 = new C89184bj(new AnonymousClass4W5(application.getString(R.string.str117b), application.getString(R.string.str1969), longValue), r5.A01, false);
        }
        r6.A09(r3);
    }

    public void AYG(C28371Vv r25, String str) {
        String string;
        AnonymousClass028 r1;
        Boolean bool;
        C28371Vv r4 = r25;
        if (this.A03 != 0) {
            String A0N = r4.A0K("privacy").A0K("category").A0N("dhash", (String) null);
            if (A0N != null) {
                ((C26131Ml) this.A00).A04(A0N, (Set) this.A01, true);
                r1 = (AnonymousClass028) this.A02;
                bool = Boolean.TRUE;
            } else {
                ((C26131Ml) this.A00).A00();
                r1 = (AnonymousClass028) this.A02;
                bool = Boolean.FALSE;
            }
            r1.A09(bool);
            return;
        }
        C18450wi.A0H(r4, 1);
        C23401Bv r5 = ((C77593w2) this.A02).A00;
        AnonymousClass3K3.A1G(r4);
        C28371Vv r12 = ((C83114Fk) this.A01).A00;
        Class<String> cls = String.class;
        Long A0X = AnonymousClass3K2.A0X();
        Long A0Y = AnonymousClass3K2.A0Y();
        Object A012 = C32271fx.A01((C16300so) null, r12, cls, A0X, A0Y, (Object) null, new String[]{"account", "action"}, false);
        C28371Vv r17 = r4;
        Long l2 = A0Y;
        C32271fx.A01((C16300so) null, r17, cls, A0X, l2, A012, new String[]{"account", "action"}, true);
        Class<Long> cls2 = Long.class;
        Long A0a = AnonymousClass3K2.A0a();
        Number number = (Number) C32271fx.A01((C16300so) null, r17, cls2, A0a, l2, (Object) null, new String[]{"account", "start-date"}, false);
        Number number2 = (Number) C32271fx.A01((C16300so) null, r17, cls2, A0a, l2, (Object) null, new String[]{"account", "end-date"}, false);
        C32271fx.A01((C16300so) null, r17, cls2, A0a, l2, (Object) null, new String[]{"account", "version"}, false);
        String A06 = C32271fx.A06(r4, AnonymousClass4A0.A00, new String[]{"account", "international-payments-status"});
        C32271fx.A03(r4, new IDxNFunctionShape43S0200000_2_I1(r5, r12, 17), new String[0]);
        AnonymousClass4IR r13 = (AnonymousClass4IR) this.A00;
        C18450wi.A0B(A06);
        C18450wi.A0B(number);
        long longValue = number.longValue();
        C18450wi.A0B(number2);
        AnonymousClass4W1 r8 = new AnonymousClass4W1(A06, longValue, number2.longValue());
        IndiaUpiInternationalActivationViewModel indiaUpiInternationalActivationViewModel = r13.A01;
        AnonymousClass1N5 r10 = indiaUpiInternationalActivationViewModel.A02;
        String str2 = r13.A00.A02;
        String str3 = r8.A02;
        String valueOf = String.valueOf(Long.valueOf(r8.A01));
        long j2 = r8.A00;
        AnonymousClass4WN r82 = new AnonymousClass4WN(str2, str3, valueOf, String.valueOf(Long.valueOf(j2)));
        C15220qW r7 = r10.A01;
        ((Map) r7.getValue()).put(r82.A01, r82);
        r10.A00((Map) r7.getValue());
        if (C18450wi.A0R(str3, "activated")) {
            Calendar instance = Calendar.getInstance(Locale.ENGLISH);
            instance.setTimeInMillis(j2 * 1000);
            string = C13680ns.A0d(indiaUpiInternationalActivationViewModel.A00, DateFormat.format("dd-MM-yyyy", instance).toString(), new Object[1], 0, R.string.str116d);
        } else {
            string = indiaUpiInternationalActivationViewModel.A00.getString(R.string.str1170);
        }
        C18450wi.A0B(string);
        indiaUpiInternationalActivationViewModel.A03.A09(new C77653wE(new C93684jb(string, false)));
    }
}
