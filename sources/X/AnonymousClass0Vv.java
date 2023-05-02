package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Vv  reason: invalid class name */
public class AnonymousClass0Vv {
    public static final AnonymousClass03L A00 = new AnonymousClass03L(16);
    public static final AnonymousClass00O A01 = new AnonymousClass00O();
    public static final Object A02 = new Object();
    public static final ExecutorService A03;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) SearchActionVerificationClientService.NOTIFICATION_ID, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C10910ht());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        A03 = threadPoolExecutor;
    }

    public static C05970Ts A00(Context context, C05160Pn r8, String str, int i2) {
        int length;
        AnonymousClass03L r6 = A00;
        Typeface typeface = (Typeface) r6.A02(str);
        if (typeface == null) {
            try {
                C04750Nu A002 = AnonymousClass0T7.A00(context, r8);
                int i3 = -3;
                int i4 = 1;
                if (A002.A00 != 0) {
                    i4 = -2;
                } else {
                    C04940Op[] r3 = A002.A01;
                    if (!(r3 == null || (length = r3.length) == 0)) {
                        int i5 = 0;
                        do {
                            int i6 = r3[i5].A00;
                            if (i6 != 0) {
                                if (i6 >= 0) {
                                    i3 = i6;
                                }
                                i4 = i3;
                            } else {
                                i5++;
                            }
                        } while (i5 < length);
                        typeface = AnonymousClass08N.A01.A05(context, (CancellationSignal) null, r3, i2);
                        if (typeface == null) {
                            return new C05970Ts(-3);
                        }
                        r6.A06(str, typeface);
                    }
                }
                return new C05970Ts(i4);
            } catch (PackageManager.NameNotFoundException unused) {
                return new C05970Ts(-1);
            }
        }
        return new C05970Ts(typeface);
    }
}
