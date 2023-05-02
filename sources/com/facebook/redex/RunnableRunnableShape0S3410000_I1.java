package com.facebook.redex;

import X.AnonymousClass1JU;
import X.AnonymousClass1Z6;
import X.AnonymousClass4R8;
import X.C62743Et;
import X.C62753Eu;
import android.app.Activity;

public class RunnableRunnableShape0S3410000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public final int A08;

    public RunnableRunnableShape0S3410000_I1(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, int i2, boolean z2) {
        this.A08 = i2;
        this.A07 = z2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A06 = str3;
    }

    public final void run() {
        int i2 = this.A08;
        boolean z2 = this.A07;
        Activity activity = (Activity) this.A00;
        if (i2 != 0) {
            AnonymousClass1Z6 r2 = (AnonymousClass1Z6) this.A02;
            String str = this.A04;
            String str2 = this.A05;
            C62753Eu.A00(activity, r2, (AnonymousClass1JU) this.A03, (C62753Eu) this.A01, str, str2, this.A06, z2);
            return;
        }
        String str3 = this.A04;
        String str4 = this.A05;
        C62743Et.A00(activity, (AnonymousClass4R8) this.A01, (AnonymousClass1JU) this.A03, (C62743Et) this.A02, str3, str4, this.A06, z2);
    }
}
