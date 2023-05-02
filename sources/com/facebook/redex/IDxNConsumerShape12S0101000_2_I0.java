package com.facebook.redex;

import X.AnonymousClass1WE;
import X.AnonymousClass1XU;
import X.C13700nu;
import android.os.Handler;
import com.obwhatsapp.service.MDSyncService;
import java.util.Map;

public class IDxNConsumerShape12S0101000_2_I0 implements AnonymousClass1WE {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxNConsumerShape12S0101000_2_I0(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public final void accept(Object obj) {
        AnonymousClass1XU r2;
        switch (this.A02) {
            case 0:
                r2 = (AnonymousClass1XU) this.A01;
                int i2 = this.A00;
                synchronized (r2) {
                    r2.A03.set(i2, obj);
                    int i3 = r2.A00 - 1;
                    r2.A00 = i3;
                    if (i3 != 0) {
                        return;
                    }
                }
                break;
            case 1:
                r2 = (AnonymousClass1XU) this.A01;
                int i4 = this.A00;
                synchronized (r2) {
                    r2.A02.set(i4, obj);
                    r2.A01 = true;
                    int i5 = r2.A00 - 1;
                    r2.A00 = i5;
                    if (i5 != 0) {
                        return;
                    }
                }
                break;
            default:
                MDSyncService mDSyncService = (MDSyncService) this.A01;
                int i6 = this.A00;
                Map map = (Map) obj;
                if (map.containsValue(Boolean.TRUE)) {
                    ((Handler) mDSyncService.A0B.get()).post(new RunnableRunnableShape0S1101000_I0(mDSyncService, mDSyncService.A02.A01(map), i6, 3));
                    return;
                }
                mDSyncService.A01.A03(mDSyncService.A03.A00, C13700nu.A02("com.obwhatsapp.service.MDSyncService.STOP_HISTORY_SYNC"), MDSyncService.class);
                return;
        }
        r2.A05();
    }
}
