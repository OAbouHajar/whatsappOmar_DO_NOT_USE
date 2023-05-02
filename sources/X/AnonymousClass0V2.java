package X;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import com.obwhatsapp.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0V2  reason: invalid class name */
public class AnonymousClass0V2 {
    public final BiometricManager A00;
    public final C12280k8 A01;
    public final C009304k A02;

    public AnonymousClass0V2(C12280k8 r5) {
        this.A01 = r5;
        int i2 = Build.VERSION.SDK_INT;
        C009304k r2 = null;
        this.A00 = i2 >= 29 ? r5.AA4() : null;
        this.A02 = i2 <= 29 ? new C009304k(((C07080Zb) r5).A00) : r2;
    }

    public final int A00() {
        int i2;
        boolean A012 = AnonymousClass0ST.A01(((C07080Zb) this.A01).A00);
        C009304k r1 = this.A02;
        if (r1 == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            i2 = 1;
        } else if (!r1.A06()) {
            i2 = 12;
        } else {
            boolean A05 = r1.A05();
            i2 = 0;
            if (!A05) {
                i2 = 11;
            }
        }
        return A012 ? i2 == 0 ? 0 : -1 : i2;
    }

    public final int A01() {
        BiometricPrompt.CryptoObject A002;
        Method A022 = AnonymousClass0VH.A02();
        if (!(A022 == null || (A002 = AnonymousClass0SR.A00(AnonymousClass0SR.A01())) == null)) {
            try {
                Object invoke = A022.invoke(this.A00, AnonymousClass000.A1a(A002));
                if (invoke instanceof Integer) {
                    return ((Number) invoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e2);
            }
        }
        int A023 = A02();
        Context context = ((C07080Zb) this.A01).A00;
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30 && str != null) {
            for (String equals : context.getResources().getStringArray(R.array.notification_action)) {
                if (str.equals(equals)) {
                    return A023;
                }
            }
        }
        return A023 == 0 ? A00() : A023;
    }

    public final int A02() {
        BiometricManager biometricManager = this.A00;
        if (biometricManager != null) {
            return AnonymousClass0VH.A00(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public int A03(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            BiometricManager biometricManager = this.A00;
            if (biometricManager != null) {
                return AnonymousClass0LB.A00(biometricManager, i2);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        } else if (!AnonymousClass0L8.A00(i2)) {
            return -2;
        } else {
            Context context = ((C07080Zb) this.A01).A00;
            if (AnonymousClass0ST.A00(context) == null) {
                return 12;
            }
            if ((32768 & i2) != 0) {
                return AnonymousClass0ST.A01(context) ? 0 : 11;
            }
            if (i3 == 29) {
                return (i2 & MotionEventCompat.ACTION_MASK) == 255 ? A02() : A01();
            }
            if (i3 != 28) {
                C009304k r1 = this.A02;
                if (r1 == null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
                    return 1;
                } else if (r1.A06()) {
                    return !r1.A05() ? 11 : 0;
                } else {
                    return 12;
                }
            } else if (AnonymousClass0LF.A00(context)) {
                return A00();
            } else {
                return 12;
            }
        }
    }
}
