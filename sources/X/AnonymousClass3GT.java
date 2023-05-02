package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import com.facebook.redex.RunnableRunnableShape1S0101000_I1;
import com.facebook.redex.RunnableRunnableShape1S1100000_I1;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3GT  reason: invalid class name */
public class AnonymousClass3GT implements C19550yc {
    public final Handler A00 = AnonymousClass000.A0L();
    public final C17190ug A01;
    public final WeakReference A02;

    public AnonymousClass3GT(AnonymousClass5PW r2, C17190ug r3) {
        this.A02 = C13690nt.A0h(r2);
        this.A01 = r3;
    }

    public void APb(String str) {
        Log.e("sendVerifyLinkRequest/delivery failure ");
        Object obj = this.A02.get();
        if (obj != null) {
            this.A00.post(new RunnableRunnableShape18S0100000_I1_1(obj, 30));
        }
    }

    public void AQe(C28371Vv r6, String str) {
        int A002 = C34451kH.A00(r6);
        Log.w(C13680ns.A0c(A002, "sendVerifyLinkRequest/response-error "));
        Object obj = this.A02.get();
        if (obj != null) {
            this.A00.post(new RunnableRunnableShape1S0101000_I1(obj, A002, 7));
        }
    }

    public void AYG(C28371Vv r8, String str) {
        Handler handler;
        int i2;
        int i3;
        C28371Vv A0J = r8.A0J("response");
        Object obj = this.A02.get();
        if (A0J == null) {
            int A002 = C34451kH.A00(r8);
            if (obj != null) {
                this.A00.post(new RunnableRunnableShape1S0101000_I1(obj, A002, 6));
            }
            Log.w(AnonymousClass000.A0l(AnonymousClass000.A0q("sendVerifyLinkRequest/response-error "), A002));
            return;
        }
        C28371Vv A0J2 = A0J.A0J("status");
        if (A0J2 == null) {
            if (obj != null) {
                handler = this.A00;
                i2 = 28;
            }
            Log.w("sendVerifyLinkRequest/response-error -1");
        }
        try {
            if (A0J2.A0L() != null) {
                i3 = Integer.parseInt(A0J2.A0L());
                if (i3 == 200) {
                    C28371Vv A0J3 = A0J.A0J("url");
                    String A0L = A0J3 == null ? null : A0J3.A0L();
                    if (obj != null) {
                        this.A00.post(new RunnableRunnableShape1S1100000_I1(5, A0L, obj));
                        return;
                    }
                    return;
                }
            } else {
                i3 = 0;
            }
            if (obj != null) {
                this.A00.post(new RunnableRunnableShape1S0101000_I1(obj, i3, 5));
            }
            Log.w(AnonymousClass000.A0l(AnonymousClass000.A0q("sendVerifyLinkRequest/response-error "), i3));
            return;
        } catch (NumberFormatException unused) {
            if (obj != null) {
                handler = this.A00;
                i2 = 29;
            }
        }
        handler.post(new RunnableRunnableShape18S0100000_I1_1(obj, i2));
        Log.w("sendVerifyLinkRequest/response-error -1");
    }
}
