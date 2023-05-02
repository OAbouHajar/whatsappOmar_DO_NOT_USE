package com.obwhatsapp.wamsys;

import X.AnonymousClass4SG;
import X.C31591ei;
import X.C31651eo;
import X.C31661ep;
import X.C31701et;
import X.C86274Ry;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

public class IDxARunnableShape10S0300000_2_I0 extends C31591ei {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxARunnableShape10S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public void A01() {
        if (this.A03 != 0) {
            try {
                C86274Ry r1 = (C86274Ry) this.A02;
                int i2 = r1.A00;
                String str = r1.A04;
                int i3 = r1.A02;
                int i4 = r1.A01;
                long j2 = (long) i2;
                long j3 = (long) i3;
                long j4 = (long) i4;
                long j5 = (long) 7;
                JniBridge.jvidispatchIIIIIOOOO(j2, j3, j4, j5, str, r1.A05, r1.A03, (C31661ep) this.A01);
            } catch (Exception unused) {
                Log.e("Error : Could not enqueue upload request in wa-msys.");
                A02(23);
            }
        } else {
            try {
                AnonymousClass4SG r12 = (AnonymousClass4SG) this.A02;
                int i5 = r12.A01;
                int i6 = r12.A00;
                String str2 = r12.A06;
                String str3 = r12.A05;
                String str4 = r12.A03;
                byte[] bArr = r12.A08;
                byte[] bArr2 = r12.A07;
                byte[] bArr3 = r12.A09;
                String str5 = r12.A02;
                String str6 = r12.A04;
                String str7 = str5;
                String str8 = str6;
                String str9 = str3;
                String str10 = str4;
                String str11 = str2;
                long j6 = (long) 7;
                JniBridge.jvidispatchIIIIOOOOOOOOO((long) i5, (long) i6, j6, str11, str9, str10, str7, str8, (C31651eo) this.A01, bArr, bArr2, bArr3);
            } catch (Exception unused2) {
                Log.e("Error: Could not enqueue download request in wa-msys");
                A02(new C31701et(17, (String) null, false));
            }
        }
    }
}
