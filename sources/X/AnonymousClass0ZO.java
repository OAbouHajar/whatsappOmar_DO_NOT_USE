package X;

import android.view.Window;

/* renamed from: X.0ZO  reason: invalid class name */
public final class AnonymousClass0ZO implements C12940lD {
    public final /* synthetic */ AnonymousClass06G A00;

    public AnonymousClass0ZO(AnonymousClass06G r1) {
        this.A00 = r1;
    }

    public void AOk(C016607w r10, boolean z2) {
        C016607w r0;
        C016607w A02 = r10.A02();
        boolean z3 = false;
        if (A02 != r10) {
            z3 = true;
        }
        AnonymousClass06G r5 = this.A00;
        if (z3) {
            r10 = A02;
        }
        AnonymousClass09A[] r4 = r5.A0i;
        int i2 = 0;
        if (r4 != null) {
            int length = r4.length;
            while (i2 < length) {
                AnonymousClass09A r2 = r4[i2];
                if (r2 == null || (r0 = r2.A0A) != r10) {
                    i2++;
                } else if (z3) {
                    int i3 = r2.A01;
                    if (A02 == null) {
                        A02 = r0;
                    }
                    if (r2.A0C && !r5.A0a) {
                        r5.A0D.A00.onPanelClosed(i3, A02);
                    }
                    r5.A0T(r2, true);
                    return;
                } else {
                    r5.A0T(r2, z2);
                    return;
                }
            }
        }
    }

    public boolean AUB(C016607w r4) {
        Window.Callback callback;
        if (r4 != r4.A02()) {
            return true;
        }
        AnonymousClass06G r2 = this.A00;
        if (!r2.A0Y || (callback = r2.A08.getCallback()) == null || r2.A0a) {
            return true;
        }
        callback.onMenuOpened(AnonymousClass2EA.A03, r4);
        return true;
    }
}
