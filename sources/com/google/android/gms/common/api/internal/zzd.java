package com.google.android.gms.common.api.internal;

import X.AnonymousClass000;
import X.AnonymousClass00N;
import X.AnonymousClass01A;
import X.AnonymousClass3M3;
import X.C109545So;
import X.C13680ns;
import X.C13690nt;
import X.C57922sC;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape1S1200000_I1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzd extends AnonymousClass01A implements C109545So {
    public static final WeakHashMap A03 = new WeakHashMap();
    public int A00 = 0;
    public Bundle A01;
    public final Map A02 = Collections.synchronizedMap(new AnonymousClass00N());

    public final void A0X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A0X(str, fileDescriptor, printWriter, strArr);
        Iterator A0q = C13680ns.A0q(this.A02);
        while (A0q.hasNext()) {
            A0q.next();
        }
    }

    public final void A0q() {
        super.A0q();
        this.A00 = 2;
        Iterator A0q = C13680ns.A0q(this.A02);
        while (A0q.hasNext()) {
            ((LifecycleCallback) A0q.next()).A01();
        }
    }

    public final void A0s(Bundle bundle) {
        if (bundle != null) {
            Iterator A0y = AnonymousClass000.A0y(this.A02);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                Bundle A0D = C13690nt.A0D();
                ((LifecycleCallback) A0z.getValue()).A05(A0D);
                bundle.putBundle(C13690nt.A0f(A0z), A0D);
            }
        }
    }

    public final void A0x(int i2, int i3, Intent intent) {
        super.A0x(i2, i3, intent);
        Iterator A0q = C13680ns.A0q(this.A02);
        while (A0q.hasNext()) {
            ((LifecycleCallback) A0q.next()).A03(i2, i3, intent);
        }
    }

    public final void A12() {
        super.A12();
        this.A00 = 5;
        Iterator A0q = C13680ns.A0q(this.A02);
        while (A0q.hasNext()) {
            A0q.next();
        }
    }

    public final void A14() {
        super.A14();
        this.A00 = 3;
        Iterator A0q = C13680ns.A0q(this.A02);
        while (A0q.hasNext()) {
            ((LifecycleCallback) A0q.next()).A00();
        }
    }

    public final void A15() {
        super.A15();
        this.A00 = 4;
        Iterator A0q = C13680ns.A0q(this.A02);
        while (A0q.hasNext()) {
            ((LifecycleCallback) A0q.next()).A02();
        }
    }

    public final void A17(Bundle bundle) {
        super.A17(bundle);
        this.A00 = 1;
        this.A01 = bundle;
        Iterator A0y = AnonymousClass000.A0y(this.A02);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            ((LifecycleCallback) A0z.getValue()).A04(bundle != null ? bundle.getBundle(C13690nt.A0f(A0z)) : null);
        }
    }

    public final void A4X(LifecycleCallback lifecycleCallback, String str) {
        Map map = this.A02;
        if (!map.containsKey("ConnectionlessLifecycleHelper")) {
            map.put("ConnectionlessLifecycleHelper", lifecycleCallback);
            if (this.A00 > 0) {
                new AnonymousClass3M3(Looper.getMainLooper()).post(new RunnableRunnableShape1S1200000_I1(lifecycleCallback, this));
                return;
            }
            return;
        }
        StringBuilder A0g = C13690nt.A0g(C13680ns.A06("ConnectionlessLifecycleHelper") + 59);
        A0g.append("LifecycleCallback with tag ");
        A0g.append("ConnectionlessLifecycleHelper");
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(" already added to this fragment.", A0g));
    }

    public final LifecycleCallback AAN(Class cls, String str) {
        return C57922sC.class.cast(this.A02.get("ConnectionlessLifecycleHelper"));
    }

    public final /* synthetic */ Activity AD7() {
        return A0C();
    }
}
