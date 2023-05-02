package X;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: X.3WP  reason: invalid class name */
public abstract class AnonymousClass3WP extends AnonymousClass457 {
    @Deprecated
    public C15750rn A00(Context context, Looper looper, C15650rc r17, C15670re r18, AnonymousClass4O1 r19, Object obj) {
        Object obj2 = obj;
        Context context2 = context;
        Looper looper2 = looper;
        C15650rc r4 = r17;
        C15670re r5 = r18;
        AnonymousClass4O1 r6 = r19;
        if (this instanceof AnonymousClass3WO) {
            return new C65843Wu(context2, looper2, r4, r5, r6);
        }
        if (this instanceof AnonymousClass3WN) {
            throw null;
        } else if (this instanceof AnonymousClass3WM) {
            return new C65853Wv(context2, C65853Wv.A01(r6), looper2, r4, r5, r6);
        } else {
            if (this instanceof AnonymousClass3WL) {
                return new C65813Wr(context2, looper2, r4, r5, r6);
            }
            if (this instanceof AnonymousClass3WK) {
                return new C57962sG(context2, looper2, r4, r5, r6);
            }
            if (this instanceof AnonymousClass3WH) {
                return new C65763Wm(context2, looper2, r4, r5, r6);
            }
            if (this instanceof AnonymousClass3WG) {
                return new C65803Wq(context2, looper2, r4, r5, r6);
            }
            if (this instanceof AnonymousClass3WF) {
                return new C65793Wp(context, looper2, (GoogleSignInOptions) obj2, r4, r5, r6);
            } else if (this instanceof AnonymousClass3WE) {
                return new C65773Wn(context, looper2, (C97854qg) obj2, r4, r5, r6);
            } else if (this instanceof AnonymousClass3WD) {
                return new C65753Wl(context2, looper2, r4, r5, r6);
            } else {
                if (this instanceof AnonymousClass3WC) {
                    return new C65783Wo(context2, looper2, r4, r5, r6);
                }
                if (this instanceof AnonymousClass3WJ) {
                    return new C65823Ws(context2, looper2, r4, r5, r6);
                }
                if (this instanceof AnonymousClass3WI) {
                    return new C65833Wt(context2, looper2, r4, r5, r6, (C97834qe) obj2);
                }
                throw new UnsupportedOperationException("buildClient must be implemented");
            }
        }
    }
}
