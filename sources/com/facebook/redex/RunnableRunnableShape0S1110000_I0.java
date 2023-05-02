package com.facebook.redex;

import X.AnonymousClass197;
import X.AnonymousClass1ZR;
import X.C51282bN;
import X.C51292bO;
import X.C87664Ya;
import com.obwhatsapp.calling.service.VoiceService$VoiceServiceEventCallback;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;

public class RunnableRunnableShape0S1110000_I0 implements Runnable {
    public Object A00;
    public String A01;
    public boolean A02;
    public final int A03;

    public RunnableRunnableShape0S1110000_I0(Object obj, String str, int i2, boolean z2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = z2;
    }

    public final void run() {
        if (this.A03 != 0) {
            ((VoiceService$VoiceServiceEventCallback) this.A00).lambda$linkCreateAcked$1(this.A01, this.A02);
            return;
        }
        boolean z2 = this.A02;
        String str = this.A01;
        AnonymousClass1ZR r2 = (AnonymousClass1ZR) this.A00;
        HashMap hashMap = C51292bO.A00;
        AbstractCollection abstractCollection = (AbstractCollection) (z2 ? hashMap.remove(str) : hashMap.get(str));
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                C51282bN r0 = (C51282bN) it.next();
                if (r0 != null) {
                    r0.AUM(r2, z2);
                }
            }
        }
        AnonymousClass197 r1 = C87664Ya.A00;
        synchronized (r1) {
            r1.put(str, r2);
        }
    }
}
