package com.facebook.redex;

import X.AnonymousClass00T;
import X.AnonymousClass05R;
import X.AnonymousClass05h;
import X.AnonymousClass09N;
import X.AnonymousClass0NM;
import X.AnonymousClass0YA;
import X.C001100m;
import X.C011105i;
import X.C10120gc;
import X.C10130gd;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

public class IDxRLauncherShape0S1201000_I0 extends C011105i {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxRLauncherShape0S1201000_I0(AnonymousClass05R r1, AnonymousClass05h r2, String str, int i2, int i3) {
        this.A04 = i3;
        this.A01 = r1;
        this.A03 = str;
        this.A00 = i2;
        this.A02 = r2;
    }

    public void A00(AnonymousClass09N r13, Object obj) {
        AnonymousClass05R r3 = (AnonymousClass05R) this.A01;
        ArrayList arrayList = r3.A00;
        String str = this.A03;
        arrayList.add(str);
        Number number = (Number) r3.A04.get(str);
        int intValue = number != null ? number.intValue() : this.A00;
        AnonymousClass05h r0 = (AnonymousClass05h) this.A02;
        C001100m r4 = r3.A08;
        AnonymousClass0NM A012 = r0.A01(r4, obj);
        if (A012 != null) {
            new Handler(Looper.getMainLooper()).post(new C10120gc(r3, A012, intValue));
            return;
        }
        Intent A002 = r0.A00(r4, obj);
        Bundle bundle = null;
        if (A002.getExtras() != null && A002.getExtras().getClassLoader() == null) {
            A002.setExtrasClassLoader(r4.getClassLoader());
        }
        if (A002.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = A002.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            A002.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(A002.getAction())) {
            String[] stringArrayExtra = A002.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AnonymousClass00T.A0F(r4, stringArrayExtra, intValue);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(A002.getAction())) {
            AnonymousClass0YA r02 = (AnonymousClass0YA) A002.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                r4.startIntentSenderForResult(r02.A03, intValue, r02.A02, r02.A00, r02.A01, 0, bundle);
            } catch (IntentSender.SendIntentException e2) {
                new Handler(Looper.getMainLooper()).post(new C10130gd(e2, r3, intValue));
            }
        } else {
            r4.startActivityForResult(A002, intValue, bundle);
        }
    }
}
