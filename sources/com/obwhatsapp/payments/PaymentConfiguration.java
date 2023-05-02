package com.obwhatsapp.payments;

import X.AnonymousClass000;
import X.AnonymousClass01J;
import X.AnonymousClass174;
import X.AnonymousClass1GR;
import X.AnonymousClass61Y;
import X.C116065ql;
import X.C18090w8;
import X.C228919r;
import X.C229019s;
import X.C28391Vx;
import X.C28411Vz;
import X.C30681cm;
import X.C35491m1;
import com.whatsapp.util.Log;
import java.util.Iterator;

public class PaymentConfiguration implements AnonymousClass1GR {
    public C28391Vx A00;
    public final C116065ql A01;
    public final AnonymousClass174 A02;
    public final C18090w8 A03;

    public PaymentConfiguration(C116065ql r1, AnonymousClass174 r2, C18090w8 r3) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        com.whatsapp.util.Log.e("PAY: PaymentConfigurationMap/getPaymentService/currency set/unmapped service for currency");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r2 = X.AnonymousClass000.A0r("PAY: PaymentConfigurationMap/getPaymentService/country=");
        r2.append(r7);
        com.whatsapp.util.Log.e(X.AnonymousClass000.A0h("/unmapped service", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r7.equals("SG") == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r7.equals("IN") == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r7.equals("BR") == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r8.equals("SGD") == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r8.equals("INR") == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r8.equals("BRL") == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
        r0 = r3.get("SG");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        r0 = r3.get("IN");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        r0 = r3.get("BR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        return (X.C228919r) ((X.AnonymousClass01J) r0).get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C228919r AEq(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            X.5ql r1 = r6.A01
            if (r7 == 0) goto L_0x000a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = r7.toUpperCase(r0)
        L_0x000a:
            java.util.Map r3 = r1.A00
            boolean r1 = r3.containsKey(r7)
            r0 = 0
            if (r1 != 0) goto L_0x0021
            java.lang.String r1 = "PAY: PaymentConfigurationMap/getPaymentFactory/unmapped service for country code="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)
            java.lang.String r1 = X.AnonymousClass000.A0h(r7, r1)
        L_0x001d:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            return r0
        L_0x0021:
            if (r8 == 0) goto L_0x0029
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r8 = r8.toUpperCase(r1)
        L_0x0029:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r5 = "SG"
            java.lang.String r4 = "IN"
            java.lang.String r2 = "BR"
            if (r1 != 0) goto L_0x0041
            int r1 = r8.hashCode()
            switch(r1) {
                case 66044: goto L_0x008a;
                case 72653: goto L_0x0081;
                case 82032: goto L_0x0078;
                default: goto L_0x003c;
            }
        L_0x003c:
            java.lang.String r1 = "PAY: PaymentConfigurationMap/getPaymentService/currency set/unmapped service for currency"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0041:
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L_0x0060
            int r1 = r7.hashCode()
            switch(r1) {
                case 2128: goto L_0x0071;
                case 2341: goto L_0x006a;
                case 2644: goto L_0x0063;
                default: goto L_0x004e;
            }
        L_0x004e:
            java.lang.String r1 = "PAY: PaymentConfigurationMap/getPaymentService/country="
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)
            r2.append(r7)
            java.lang.String r1 = "/unmapped service"
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0060:
            java.lang.String r1 = "PAY: PaymentConfigurationMap/getPaymentService/unmapped service for country and currency"
            goto L_0x001d
        L_0x0063:
            boolean r1 = r7.equals(r5)
            if (r1 != 0) goto L_0x0093
            goto L_0x004e
        L_0x006a:
            boolean r1 = r7.equals(r4)
            if (r1 != 0) goto L_0x0098
            goto L_0x004e
        L_0x0071:
            boolean r1 = r7.equals(r2)
            if (r1 != 0) goto L_0x009d
            goto L_0x004e
        L_0x0078:
            java.lang.String r1 = "SGD"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0093
            goto L_0x003c
        L_0x0081:
            java.lang.String r1 = "INR"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0098
            goto L_0x003c
        L_0x008a:
            java.lang.String r1 = "BRL"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x009d
            goto L_0x003c
        L_0x0093:
            java.lang.Object r0 = r3.get(r5)
            goto L_0x00a1
        L_0x0098:
            java.lang.Object r0 = r3.get(r4)
            goto L_0x00a1
        L_0x009d:
            java.lang.Object r0 = r3.get(r2)
        L_0x00a1:
            X.01J r0 = (X.AnonymousClass01J) r0
            java.lang.Object r0 = r0.get()
            X.19r r0 = (X.C228919r) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.PaymentConfiguration.AEq(java.lang.String, java.lang.String):X.19r");
    }

    public C228919r AEr(String str) {
        AnonymousClass61Y r3;
        C116065ql r4 = this.A01;
        synchronized (r4) {
            r3 = null;
            Iterator A0y = AnonymousClass000.A0y(r4.A00);
            while (A0y.hasNext()) {
                AnonymousClass61Y r1 = (AnonymousClass61Y) ((AnonymousClass01J) AnonymousClass000.A0z(A0y).getValue()).get();
                if (str.equalsIgnoreCase(r1.A06)) {
                    r3 = r1;
                }
            }
        }
        return r3;
    }

    public C228919r AEs(int i2) {
        AnonymousClass61Y r1;
        C116065ql r3 = this.A01;
        synchronized (r3) {
            Iterator A0y = AnonymousClass000.A0y(r3.A00);
            while (true) {
                if (!A0y.hasNext()) {
                    r1 = null;
                    break;
                }
                r1 = (AnonymousClass61Y) ((AnonymousClass01J) AnonymousClass000.A0z(A0y).getValue()).get();
                if (i2 == r1.AG1()) {
                    break;
                }
            }
        }
        return r1;
    }

    /* renamed from: AFy */
    public C228919r AFx() {
        AnonymousClass174 r1 = this.A02;
        C30681cm A012 = r1.A01();
        if (A012 == null) {
            Log.e("PAY: PaymentConfiguration/getService/null country");
        } else {
            String str = A012.A03;
            C28391Vx AIM = AIM(str);
            C28411Vz A002 = r1.A00();
            String str2 = A002 != null ? ((C35491m1) A002).A04 : null;
            Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("PAY: PaymentConfiguration/getService/defaulted to countryCode=")));
            if (AIM != null) {
                return AIM.AEp(str2);
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ C229019s AFz(String str, String str2) {
        return AG0(str, (String) null);
    }

    public C228919r AG0(String str, String str2) {
        C28391Vx AIM = AIM(str);
        if (AIM != null) {
            return AIM.AEp((String) null);
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28391Vx AIM(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r9 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "UNSET"
            boolean r0 = r0.equalsIgnoreCase(r11)
            if (r0 == 0) goto L_0x002c
        L_0x000f:
            X.174 r0 = r10.A02
            X.1cm r1 = r0.A01()
            if (r1 != 0) goto L_0x001d
            java.lang.String r0 = "PAY: PaymentConfiguration/initializeFactory/null country code/null default country"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r9
        L_0x001d:
            java.lang.String r0 = "PAY: PaymentConfiguration/initializeFactory/null country code/default country code="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r11 = r1.A03
            java.lang.String r0 = X.AnonymousClass000.A0h(r11, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x002c:
            X.1Vx r6 = r10.A00
            if (r6 == 0) goto L_0x003b
            r0 = r6
            X.61X r0 = (X.AnonymousClass61X) r0
            java.lang.String r0 = r0.A00
            boolean r0 = r0.equalsIgnoreCase(r11)
            if (r0 != 0) goto L_0x0102
        L_0x003b:
            X.5ql r1 = r10.A01
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r6 = 0
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentFactory/empty country code"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0049:
            r10.A00 = r6
            if (r6 != 0) goto L_0x0102
            return r9
        L_0x004e:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r8 = r11.toUpperCase(r0)
            java.util.Map r7 = r1.A00
            boolean r0 = r7.containsKey(r8)
            java.lang.String r3 = "PAY: PaymentConfigurationMap/getPaymentFactory/unmapped factory for country code="
            if (r0 == 0) goto L_0x0070
            X.61X r4 = new X.61X
            r4.<init>(r8)
            int r0 = r8.hashCode()
            java.lang.String r5 = "SG"
            java.lang.String r2 = "IN"
            java.lang.String r1 = "BR"
            switch(r0) {
                case 2128: goto L_0x00d5;
                case 2341: goto L_0x00a8;
                case 2644: goto L_0x007c;
                default: goto L_0x0070;
            }
        L_0x0070:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r3)
            java.lang.String r0 = X.AnonymousClass000.A0h(r8, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0049
        L_0x007c:
            boolean r0 = r8.equals(r5)
            if (r0 == 0) goto L_0x0070
            X.5ig r3 = new X.5ig
            r3.<init>()
            java.lang.Object r0 = r7.get(r5)
            X.01J r0 = (X.AnonymousClass01J) r0
            java.lang.Object r2 = r0.get()
            X.19r r2 = (X.C228919r) r2
            java.lang.String r0 = "SGD"
            java.util.Set r1 = java.util.Collections.singleton(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r3.A00(r2, r0)
            java.util.List r0 = r4.A01
            r0.add(r3)
            r6 = r4
            goto L_0x0049
        L_0x00a8:
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x0070
            X.5if r3 = new X.5if
            r3.<init>()
            java.lang.Object r0 = r7.get(r2)
            X.01J r0 = (X.AnonymousClass01J) r0
            java.lang.Object r2 = r0.get()
            X.19r r2 = (X.C228919r) r2
            java.lang.String r0 = "INR"
            java.util.Set r1 = java.util.Collections.singleton(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r3.A00(r2, r0)
            java.util.List r0 = r4.A01
            r0.add(r3)
            r6 = r4
            goto L_0x0049
        L_0x00d5:
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x0070
            X.5ie r3 = new X.5ie
            r3.<init>()
            java.lang.Object r0 = r7.get(r1)
            X.01J r0 = (X.AnonymousClass01J) r0
            java.lang.Object r2 = r0.get()
            X.19r r2 = (X.C228919r) r2
            java.lang.String r0 = "BRL"
            java.util.Set r1 = java.util.Collections.singleton(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r3.A00(r2, r0)
            java.util.List r0 = r4.A01
            r0.add(r3)
            r6 = r4
            goto L_0x0049
        L_0x0102:
            X.478 r5 = new X.478
            r5.<init>()
            X.61X r6 = (X.AnonymousClass61X) r6
            java.util.List r0 = r6.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x010f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x013f
            java.lang.Object r0 = r4.next()
            X.5tj r0 = (X.C117895tj) r0
            java.util.Map r3 = r0.A00
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r3)
        L_0x0121:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010f
            java.util.Map$Entry r1 = X.AnonymousClass000.A0z(r2)
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r0 = r3.get(r0)
            X.19r r0 = (X.C228919r) r0
            boolean r0 = r0.AJt(r5)
            if (r0 != 0) goto L_0x0121
            r3.remove(r1)
            goto L_0x0121
        L_0x013f:
            X.1Vx r0 = r10.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.PaymentConfiguration.AIM(java.lang.String):X.1Vx");
    }
}
