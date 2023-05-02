package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.1jL  reason: invalid class name and case insensitive filesystem */
public class C33881jL {
    public static void A00(Context context, C19380yL r3, String str) {
        A01(context, r3, context.getString(R.string.str0854), str, 2);
    }

    public static void A01(Context context, C19380yL r5, String str, String str2, int i2) {
        Log.i("errorreporter/reporterror");
        PendingIntent A00 = C42341xd.A00(context, 1, C14750ph.A04(context), 0);
        C007503l A002 = C218415q.A00(context);
        A002.A0J = "critical_app_alerts@1";
        A002.A0I = "err";
        A002.A03 = 1;
        A002.A0B(str);
        A002.A0A(str);
        A002.A09(str2);
        A002.A09 = A00;
        A002.A07.icon = R.drawable.notifybar_error;
        if (Build.VERSION.SDK_INT >= 21) {
            A002.A06 = 1;
        }
        r5.A02(i2, A002.A01());
    }
}
