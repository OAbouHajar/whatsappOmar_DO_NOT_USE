package X;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.00B  reason: invalid class name */
public class AnonymousClass00B {
    public static ConditionVariable A00 = new ConditionVariable();
    public static volatile Boolean A01;

    public static void A00() {
        A0B("should not be run in main thread", !AnonymousClass01E.A01());
    }

    public static void A01() {
        A0B("should be run in ui main thread", AnonymousClass01E.A01());
    }

    public static void A02(Handler handler) {
        boolean z2 = false;
        if (handler.getLooper() == Looper.myLooper()) {
            z2 = true;
        }
        A0G(z2);
    }

    public static void A03(HandlerThread handlerThread) {
        boolean z2 = false;
        if (handlerThread.getLooper() == Looper.myLooper()) {
            z2 = true;
        }
        A0G(z2);
    }

    public static void A04(View view) {
        A07(view, "");
    }

    public static void A05(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalArgumentException("");
        }
    }

    public static void A06(Object obj) {
        A07(obj, "");
    }

    public static void A07(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void A08(String str) {
        A0B(str, false);
    }

    public static void A09(String str, Throwable th) {
        A06(th);
        A06(str);
        Log.e(str, th);
    }

    public static void A0A(String str, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void A0B(String str, boolean z2) {
        if (!z2) {
            Log.e((Throwable) new AssertionError(str));
        }
    }

    public static void A0C(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void A0D(String str, boolean z2) {
        if (!z2) {
            throw new IllegalStateException(str);
        }
    }

    public static void A0E(Throwable th) {
        A06(th);
        Log.e(th);
    }

    public static void A0F(boolean z2) {
        A0C("", z2);
    }

    public static void A0G(boolean z2) {
        A0D("", z2);
    }

    public static void A0H(boolean z2) {
        A01 = Boolean.valueOf(z2);
    }

    public static void A0I(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("");
        }
    }

    public static void A0J(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("");
        }
    }
}
