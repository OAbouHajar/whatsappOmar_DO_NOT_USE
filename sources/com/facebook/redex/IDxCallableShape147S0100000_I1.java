package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass04R;
import X.AnonymousClass057;
import X.AnonymousClass0MQ;
import X.AnonymousClass0OO;
import X.AnonymousClass0QA;
import X.C06150Um;
import X.C09100eu;
import X.C10590hN;
import android.os.Binder;
import android.os.Process;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class IDxCallableShape147S0100000_I1 implements Callable {
    public Object A00;
    public final int A01;

    public IDxCallableShape147S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public static /* bridge */ /* synthetic */ Object A00(IDxCallableShape147S0100000_I1 iDxCallableShape147S0100000_I1) {
        ArrayList A0u = AnonymousClass000.A0u();
        for (AnonymousClass0OO r0 : ((ShortcutInfoCompatSaverImpl) iDxCallableShape147S0100000_I1.A00).A04.values()) {
            A0u.add(new AnonymousClass04R(r0.A00).A00());
        }
        return A0u;
    }

    public Object call() {
        switch (this.A01) {
            case 0:
                C10590hN r3 = (C10590hN) this.A00;
                r3.A04.set(true);
                Object obj = null;
                try {
                    Process.setThreadPriority(10);
                    obj = r3.A06.A06();
                } catch (AnonymousClass057 e2) {
                    if (!r3.A03.get()) {
                        throw e2;
                    }
                } catch (Throwable th) {
                    try {
                        r3.A03.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        r3.A00(obj);
                        throw th2;
                    }
                }
                Binder.flushPendingCommands();
                r3.A00(obj);
                return obj;
            case 1:
                return A00(this);
            case 2:
                return Integer.valueOf(AnonymousClass0MQ.A00(((AnonymousClass0QA) this.A00).A00, "next_alarm_manager_id"));
            case 3:
                return new C06150Um(this.A00);
            default:
                C09100eu r1 = (C09100eu) this.A00;
                synchronized (r1) {
                    if (r1.A04 != null) {
                        r1.A05();
                        if (r1.A08()) {
                            r1.A06();
                            r1.A00 = 0;
                        }
                    }
                }
                return null;
        }
    }
}
