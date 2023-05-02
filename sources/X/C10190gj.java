package X;

import androidx.car.app.IOnDoneCallback;
import com.facebook.redex.IDxRCallShape4S1200000_I1;

/* renamed from: X.0gj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10190gj implements Runnable {
    public final /* synthetic */ IOnDoneCallback A00;
    public final /* synthetic */ C12290k9 A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C10190gj(IOnDoneCallback iOnDoneCallback, C12290k9 r2, String str) {
        this.A00 = iOnDoneCallback;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void run() {
        IOnDoneCallback iOnDoneCallback = this.A00;
        String str = this.A02;
        try {
            Object A86 = this.A01.A86();
            AnonymousClass0VJ.A02(new IDxRCallShape4S1200000_I1(iOnDoneCallback, str, A86, 0), AnonymousClass000.A0h(" onSuccess", AnonymousClass000.A0q(str)));
        } catch (RuntimeException e2) {
            AnonymousClass0VJ.A01(iOnDoneCallback, str, e2);
            throw new RuntimeException(e2);
        } catch (C03930Kl e3) {
            AnonymousClass0VJ.A01(iOnDoneCallback, str, e3);
        }
    }
}
