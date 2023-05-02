package com.facebook.redex;

import X.C16490t9;
import X.C18450wi;
import X.C19880z9;
import X.C88264aD;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RunnableRunnableShape0S0203000_I0 implements Runnable {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public RunnableRunnableShape0S0203000_I0(Object obj, Object obj2, int i2, int i3, int i4, int i5) {
        this.A05 = i5;
        this.A03 = obj;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = obj2;
        this.A02 = i4;
    }

    public final void run() {
        if (this.A05 != 0) {
            C88264aD r3 = (C88264aD) this.A03;
            C19880z9 r7 = (C19880z9) this.A04;
            int i2 = this.A00;
            int i3 = this.A01;
            short s2 = (short) this.A02;
            HashMap hashMap = new HashMap();
            String str = r3.A03;
            if (str != null) {
                hashMap.put("direct_connection_status", str);
            }
            String str2 = r3.A01;
            if (str2 != null) {
                hashMap.put("biz_id", str2);
            }
            String str3 = r3.A02;
            if (str3 != null) {
                hashMap.put("biz_type", str3);
            }
            String str4 = r3.A04;
            if (str4 != null) {
                hashMap.put("server_origin", str4);
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            C18450wi.A0B(unmodifiableMap);
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                r7.A00.AKp((String) entry.getKey(), (String) entry.getValue(), i2, i3);
            }
            HashMap hashMap2 = new HashMap();
            Boolean bool = r3.A00;
            if (bool != null && bool.booleanValue()) {
                hashMap2.put("cached", Boolean.TRUE);
            }
            Map unmodifiableMap2 = Collections.unmodifiableMap(hashMap2);
            C18450wi.A0B(unmodifiableMap2);
            for (Map.Entry entry2 : unmodifiableMap2.entrySet()) {
                r7.A00.AKq((String) entry2.getKey(), i2, i3, ((Boolean) entry2.getValue()).booleanValue());
            }
            r7.A00.AKy(i2, i3, s2);
            return;
        }
        C16490t9 r5 = (C16490t9) this.A03;
        int i4 = this.A00;
        int i5 = this.A01;
        byte[] bArr = (byte[]) this.A04;
        int i6 = this.A02;
        if (i4 == 1) {
            if (r5.A0J()) {
                r5.A05.A04(bArr, i5, i6);
                r5.A05.A01();
                r5.A03();
            }
        } else if (r5.A0H()) {
            r5.A06.A04(bArr, i5, i6);
            r5.A06.A01();
            r5.A0G(false);
            r5.A01.A01();
        }
    }
}
