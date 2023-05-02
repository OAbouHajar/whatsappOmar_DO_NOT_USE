package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0VJ;
import X.AnonymousClass0Y7;
import X.C03930Kl;
import X.C12300kA;
import android.util.Log;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;

public class IDxRCallShape4S1200000_I1 implements C12300kA {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxRCallShape4S1200000_I1(Object obj, String str, Object obj2, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    public final Object call() {
        AnonymousClass0Y7 r0;
        if (this.A03 != 0) {
            IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.A00;
            Throwable th = (Throwable) this.A01;
            String str = this.A02;
            try {
                iOnDoneCallback.onFailure(new AnonymousClass0Y7((Object) new FailureResponse(th)));
                return null;
            } catch (C03930Kl e2) {
                Log.e("CarApp.Dispatch", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Serialization failure in ")), e2);
                return null;
            }
        } else {
            IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.A00;
            Object obj = this.A01;
            String str2 = this.A02;
            if (obj == null) {
                r0 = null;
            } else {
                try {
                    r0 = new AnonymousClass0Y7(obj);
                } catch (C03930Kl e3) {
                    AnonymousClass0VJ.A01(iOnDoneCallback2, str2, e3);
                    return null;
                }
            }
            iOnDoneCallback2.onSuccess(r0);
            return null;
        }
    }
}
