package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass022;
import X.AnonymousClass0H4;
import X.AnonymousClass0KV;
import X.AnonymousClass0Rc;
import X.AnonymousClass12P;
import X.AnonymousClass12Q;
import X.AnonymousClass13I;
import X.AnonymousClass2E5;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16080sP;
import X.C19220xx;
import X.C19730yu;
import X.C28891Zc;
import X.C46352Dw;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class IDxBReceiverShape6S0100000_1_I0 extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public IDxBReceiverShape6S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onReceive(Context context, Intent intent) {
        Locale locale;
        switch (this.A01) {
            case 0:
                Log.i("gdrive-notification-manager/user-dismissed the notification");
                AnonymousClass12Q r4 = (AnonymousClass12Q) this.A00;
                r4.A0J.A00.unregisterReceiver(this);
                try {
                    AnonymousClass12P r5 = r4.A0P;
                    Iterator it = ((List) ((AnonymousClass022) r5.get()).A03().get()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AnonymousClass0Rc r3 = (AnonymousClass0Rc) it.next();
                            if (r3.A03 == AnonymousClass0KV.RUNNING) {
                                AnonymousClass022 r2 = (AnonymousClass022) r5.get();
                                r2.A06.A8p(new AnonymousClass0H4(r2, r3.A05));
                            }
                        }
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    Log.e("gdrive-notification-manager/couldn't cancel worker.", e2);
                }
                r4.A03();
                return;
            case 1:
                C16000sG r1 = (C16000sG) this.A00;
                Locale A0m = C13690nt.A0m(r1.A0D);
                Map map = r1.A04.A01;
                synchronized (map) {
                    HashSet hashSet = null;
                    Iterator A0y = AnonymousClass000.A0y(map);
                    while (A0y.hasNext()) {
                        Map.Entry A0z = AnonymousClass000.A0z(A0y);
                        C15830rv r12 = (C15830rv) A0z.getKey();
                        C16010sH r0 = (C16010sH) A0z.getValue();
                        if (!(r12 == null || r0 == null || (locale = r0.A0X) == null || A0m.equals(locale))) {
                            if (hashSet == null) {
                                hashSet = C13680ns.A0o();
                            }
                            hashSet.add(r12);
                        }
                    }
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            map.remove(C13700nu.A0B(it2));
                        }
                        hashSet.size();
                    }
                }
                return;
            default:
                C28891Zc.A09();
                C19730yu r52 = (C19730yu) this.A00;
                C19220xx r42 = r52.A1R;
                C46352Dw A012 = r42.A05.A01();
                if (A012 != null) {
                    int i2 = A012.A01;
                    Log.i(C13680ns.A0c(i2, "UserNoticeManager/handleLocaleChange/notice id:"));
                    AnonymousClass13I r13 = r42.A04;
                    r13.A04(i2);
                    if (r42.A08.A01() && !AnonymousClass2E5.A01(r42.A03, A012)) {
                        r13.A05(i2);
                    }
                }
                C16080sP r14 = r52.A0X;
                r14.A0C.clear();
                r14.A0D.clear();
                return;
        }
    }
}
