package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape15S0200000_I1_3;
import java.util.concurrent.CancellationException;

/* renamed from: X.5Gf  reason: invalid class name and case insensitive filesystem */
public final class C107055Gf extends C11530iv implements C12910lA {
    public final Handler A00;
    public final C107055Gf A01;
    public final boolean A02;
    public volatile C107055Gf _immediate;

    public /* synthetic */ C107055Gf(Handler handler) {
        this(handler, false);
    }

    public C107055Gf(Handler handler, boolean z2) {
        C107055Gf r0 = null;
        this.A00 = handler;
        this.A02 = z2;
        this._immediate = z2 ? this : r0;
        C107055Gf r1 = this._immediate;
        if (r1 == null) {
            r1 = new C107055Gf(handler, true);
            this._immediate = r1;
        }
        this.A01 = r1;
    }

    public boolean A03(AnonymousClass1UM r3) {
        return !this.A02 || !C18450wi.A0R(Looper.myLooper(), this.A00.getLooper());
    }

    public void A05(Runnable runnable, AnonymousClass1UM r4) {
        if (!this.A00.post(runnable)) {
            StringBuilder A0r = AnonymousClass000.A0r("The task was rejected, the handler underlying the dispatcher '");
            A0r.append(this);
            C06300Ve.A00(new CancellationException(AnonymousClass000.A0h("' was closed", A0r)), r4);
            C90394e4.A01.A05(runnable, r4);
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass5GI A06() {
        return this.A01;
    }

    public void Ad6(AnonymousClass5GN r5, long j2) {
        RunnableRunnableShape15S0200000_I1_3 runnableRunnableShape15S0200000_I1_3 = new RunnableRunnableShape15S0200000_I1_3(r5, 15, this);
        if (this.A00.postDelayed(runnableRunnableShape15S0200000_I1_3, 500)) {
            r5.A0F(new C106795Ff(runnableRunnableShape15S0200000_I1_3, this));
            return;
        }
        AnonymousClass1UM r2 = r5.A02;
        StringBuilder A0r = AnonymousClass000.A0r("The task was rejected, the handler underlying the dispatcher '");
        A0r.append(this);
        C06300Ve.A00(new CancellationException(AnonymousClass000.A0h("' was closed", A0r)), r2);
        C90394e4.A01.A05(runnableRunnableShape15S0200000_I1_3, r2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C107055Gf) && ((C107055Gf) obj).A00 == this.A00;
    }

    public int hashCode() {
        return System.identityHashCode(this.A00);
    }

    public String toString() {
        String str;
        AnonymousClass5GI r0;
        AnonymousClass5GI r02 = AnonymousClass38H.A00;
        if (this == r02) {
            str = "Dispatchers.Main";
        } else {
            str = null;
            try {
                r0 = r02.A06();
            } catch (UnsupportedOperationException unused) {
                r0 = null;
            }
            if (this == r0) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str != null) {
            return str;
        }
        String obj = this.A00.toString();
        return this.A02 ? C18450wi.A06(obj, ".immediate") : obj;
    }
}
