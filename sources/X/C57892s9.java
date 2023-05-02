package X;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import java.util.Locale;

/* renamed from: X.2s9  reason: invalid class name and case insensitive filesystem */
public class C57892s9 extends AnonymousClass3AP {
    public static final C57892s9 A00 = new C57892s9();
    public static final Object A01 = C13690nt.A0Y();

    public static final Dialog A00(Context context, DialogInterface.OnCancelListener onCancelListener, C91474fy r7, int i2) {
        return null;
    }

    public static final void A01(Activity activity, Dialog dialog, DialogInterface.OnCancelListener onCancelListener, String str) {
        try {
            if (activity instanceof C001000l) {
                AnonymousClass02C AGM = ((C001000l) activity).AGM();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                C13710nw.A02(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                supportErrorDialogFragment.A00 = dialog;
                supportErrorDialogFragment.A02 = onCancelListener;
                supportErrorDialogFragment.A1G(AGM, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        AnonymousClass3KQ r1 = new AnonymousClass3KQ();
        C13710nw.A02(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        r1.A00 = dialog;
        r1.A02 = onCancelListener;
        r1.show(fragmentManager, str);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    public final void A02(PendingIntent pendingIntent, Context context, int i2) {
        String format;
        int i3;
        Object[] objArr = new Object[2];
        ? A1W = C13690nt.A1W(objArr, i2);
        objArr[1] = null;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", objArr), new IllegalArgumentException());
        if (i2 == 18) {
            new C58042sS(context, this).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            String A03 = i2 == 6 ? C62093Bp.A03(context, "common_google_play_services_resolution_required_title") : C62093Bp.A02(context, i2);
            if (A03 == null) {
                A03 = context.getResources().getString(R.string.str1c2c);
            }
            if (i2 == 6 || i2 == 19) {
                Object A002 = C62093Bp.A00(context);
                Resources resources = context.getResources();
                String A032 = C62093Bp.A03(context, "common_google_play_services_resolution_required_text");
                if (A032 == null) {
                    A032 = resources.getString(R.string.str1c2d);
                }
                Locale locale = resources.getConfiguration().locale;
                Object[] objArr2 = new Object[1];
                objArr2[A1W] = A002;
                format = String.format(locale, A032, objArr2);
            } else {
                format = C62093Bp.A01(context, i2);
            }
            Resources resources2 = context.getResources();
            Object systemService = context.getSystemService("notification");
            C13710nw.A01(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            C007503l r2 = new C007503l(context, (String) null);
            r2.A0T = true;
            r2.A0D(true);
            r2.A0A(A03);
            NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
            notificationCompat$BigTextStyle.A09(format);
            r2.A08(notificationCompat$BigTextStyle);
            if (!C89794cv.A00(context)) {
                r2.A07.icon = 17301642;
                r2.A0B(resources2.getString(R.string.str1c2c));
                r2.A05(System.currentTimeMillis());
                r2.A09 = pendingIntent;
                r2.A09(format);
            } else if (C14320oy.A01()) {
                r2.A07.icon = context.getApplicationInfo().icon;
                r2.A03 = 2;
                if (C89794cv.A01(context)) {
                    r2.A04(R.drawable.common_full_open_on_phone, resources2.getString(R.string.str1c34), pendingIntent);
                } else {
                    r2.A09 = pendingIntent;
                }
            } else {
                throw new IllegalStateException();
            }
            if (C14320oy.A03()) {
                synchronized (A01) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(R.string.str1c2b);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, yo.Pop_Heds_O("com.google.android.gms.availability", 4));
                } else {
                    if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                    }
                    r2.A0J = "com.google.android.gms.availability";
                }
                notificationManager.createNotificationChannel(notificationChannel);
                r2.A0J = "com.google.android.gms.availability";
            }
            Notification A012 = r2.A01();
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                C15040qE.A02.set(A1W);
                i3 = 10436;
            } else {
                i3 = 39789;
            }
            notificationManager.notify(i3, A012);
        } else if (i2 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
