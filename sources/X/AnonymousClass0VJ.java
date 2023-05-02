package X;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import com.facebook.redex.IDxRCallShape4S1200000_I1;

/* renamed from: X.0VJ  reason: invalid class name */
public final class AnonymousClass0VJ {
    public static void A00(IOnDoneCallback iOnDoneCallback, C12290k9 r2, String str) {
        AnonymousClass0T5.A00(new C10190gj(iOnDoneCallback, r2, str));
    }

    public static void A01(IOnDoneCallback iOnDoneCallback, String str, Throwable th) {
        A02(new IDxRCallShape4S1200000_I1(iOnDoneCallback, str, th, 1), AnonymousClass000.A0h(" onFailure", AnonymousClass000.A0q(str)));
    }

    public static void A02(C12300kA r3, String str) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("Dispatching call ");
                A0o.append(str);
                Log.d("CarApp", AnonymousClass000.A0h(" to host", A0o));
            }
            r3.call();
        } catch (SecurityException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            StringBuilder A0r = AnonymousClass000.A0r("Remote ");
            A0r.append(str);
            throw new C11070i9(AnonymousClass000.A0h(" call failed", A0r), e3);
        } catch (RemoteException e4) {
            Log.e("CarApp.Dispatch", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Host unresponsive when dispatching call ")), e4);
        }
    }
}
