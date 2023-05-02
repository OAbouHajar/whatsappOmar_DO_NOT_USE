package X;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.3Bq  reason: invalid class name and case insensitive filesystem */
public class C62103Bq {
    public static final ComponentName A00 = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final AnonymousClass4RN A01 = new AnonymousClass4RN("Auth", "GoogleAuthUtil");
    public static final String[] A02 = {"com.google", "com.google.work", "cn.google"};

    public static Object A00(ComponentName componentName, Context context, C108385Nt r11) {
        C91554g6 r6 = new C91554g6();
        C90074dS A002 = C90074dS.A00(context);
        if (A002.A02(r6, new AnonymousClass3BI(componentName), "GoogleAuthUtil")) {
            try {
                C13710nw.A06("BlockingServiceConnection.getService() called on main thread");
                if (!r6.A00) {
                    r6.A00 = true;
                    Object Aj7 = r11.Aj7((IBinder) r6.A01.take());
                    A002.A01(r6, new AnonymousClass3BI(componentName));
                    return Aj7;
                }
                throw AnonymousClass000.A0V("Cannot call get on this connection more than once");
            } catch (RemoteException | InterruptedException e2) {
                AnonymousClass4RN r3 = A01;
                Object[] A1Z = C13690nt.A1Z();
                C13690nt.A1L("Error on service connection.", e2, A1Z);
                Log.i("Auth", r3.A03.concat(String.format(Locale.US, "GoogleAuthUtil", A1Z)));
                throw new IOException("Error on service connection.", e2);
            } catch (Throwable th) {
                A002.A01(r6, new AnonymousClass3BI(componentName));
                throw th;
            }
        } else {
            throw new IOException("Could not bind to service.");
        }
    }

    public static String A01(Account account, Context context) {
        Bundle A0D = C13690nt.A0D();
        A02(account);
        C13710nw.A06("Calling this from your main thread can lead to deadlock");
        C13710nw.A07("oauth2:https://www.googleapis.com/auth/drive.appdata", "Scope cannot be empty or null.");
        A02(account);
        A03(context);
        Bundle bundle = new Bundle(A0D);
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return ((TokenData) A00(A00, context, new C97794qa(account, bundle))).A03;
    }

    public static void A02(Account account) {
        String str;
        if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = A02;
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (!strArr[i2].equals(account.type)) {
                    i2++;
                } else {
                    return;
                }
            }
            str = "Account type not supported";
        } else {
            str = "Account name cannot be empty!";
        }
        throw AnonymousClass000.A0T(str);
    }

    public static void A03(Context context) {
        try {
            C15040qE.A01(context.getApplicationContext(), 8400000);
        } catch (AnonymousClass2Hm e2) {
            int i2 = e2.zza;
            throw new AnonymousClass3W3(new Intent(e2.zza), e2.getMessage(), i2);
        } catch (C47092Hl e3) {
            throw new AnonymousClass2RH(e3.getMessage());
        }
    }

    public static void A04(Context context, String str) {
        C13710nw.A06("Calling this from your main thread can lead to deadlock");
        A03(context);
        Bundle A0D = C13690nt.A0D();
        String str2 = context.getApplicationInfo().packageName;
        A0D.putString("clientPackageName", str2);
        if (!A0D.containsKey("androidPackageName")) {
            A0D.putString("androidPackageName", str2);
        }
        A00(A00, context, new C97804qb(str, A0D));
    }

    public static void A05(Object obj) {
        if (obj == null) {
            AnonymousClass4RN r4 = A01;
            Object[] A1b = C13680ns.A1b();
            A1b[0] = "Binder call returned null.";
            Log.w("Auth", r4.A03.concat(String.format(Locale.US, "GoogleAuthUtil", A1b)));
            throw new IOException("Service unavailable.");
        }
    }
}
