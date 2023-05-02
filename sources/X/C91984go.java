package X;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.4go  reason: invalid class name and case insensitive filesystem */
public final class C91984go implements Handler.Callback {
    public final /* synthetic */ C90074dS A00;

    public /* synthetic */ C91984go(C90074dS r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            HashMap hashMap = this.A00.A03;
            synchronized (hashMap) {
                AnonymousClass3BI r4 = (AnonymousClass3BI) message.obj;
                C91594gB r3 = (C91594gB) hashMap.get(r4);
                if (r3 != null && r3.A05.isEmpty()) {
                    if (r3.A03) {
                        C90074dS r2 = r3.A06;
                        r2.A04.removeMessages(1, r3.A04);
                        r2.A02.A01(r2.A00, r3);
                        r3.A03 = false;
                        r3.A00 = 2;
                    }
                    hashMap.remove(r4);
                }
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            HashMap hashMap2 = this.A00.A03;
            synchronized (hashMap2) {
                AnonymousClass3BI r7 = (AnonymousClass3BI) message.obj;
                C91594gB r5 = (C91594gB) hashMap2.get(r7);
                if (r5 != null && r5.A00 == 3) {
                    String valueOf = String.valueOf(r7);
                    StringBuilder A0g = C13690nt.A0g(valueOf.length() + 47);
                    A0g.append("Timeout waiting for ServiceConnection callback ");
                    A0g.append(valueOf);
                    Log.e("GmsClientSupervisor", A0g.toString(), new Exception());
                    ComponentName componentName = r5.A01;
                    if (componentName == null && (componentName = r7.A00) == null) {
                        String str = r7.A02;
                        C13710nw.A01(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    r5.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
