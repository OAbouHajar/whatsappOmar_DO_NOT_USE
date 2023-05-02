package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.obwhatsapp.R;
import com.obwhatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

/* renamed from: X.10P  reason: invalid class name */
public class AnonymousClass10P {
    public final C16980tz A00;
    public final C19380yL A01;
    public final AnonymousClass013 A02;

    public AnonymousClass10P(C16980tz r1, C19380yL r2, AnonymousClass013 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final C007503l A00(boolean z2) {
        Context context;
        Intent intent;
        if (z2) {
            Intent intent2 = new Intent();
            context = this.A00.A00;
            intent = intent2.setClassName(context.getPackageName(), "com.obwhatsapp.registration.RegisterName");
        } else {
            context = this.A00.A00;
            intent = new Intent(context, GoogleMigrateImporterActivity.class);
            intent.setAction(GoogleMigrateImporterActivity.A0F);
        }
        C007503l A002 = C218415q.A00(context);
        A002.A0J = "other_notifications@1";
        int i2 = Build.VERSION.SDK_INT;
        int i3 = -2;
        if (i2 >= 26) {
            i3 = -1;
        }
        A002.A03 = i3;
        A002.A09 = C42341xd.A00(context, 0, intent, 134217728);
        A002.A07.icon = yo.getNIcon(R.drawable.notifybar);
        if (i2 >= 21) {
            A002.A06 = 1;
        }
        return A002;
    }

    public void A01(int i2) {
        Context context = this.A00.A00;
        String string = context.getResources().getString(R.string.str09f8);
        int i3 = i2;
        if (i2 >= 0) {
            StringBuilder sb = new StringBuilder("GoogleMigrateNotificationManager/onProgress (");
            sb.append(i2);
            sb.append("%)");
            Log.i(sb.toString());
            A02(string, context.getResources().getString(R.string.str09f7, new Object[]{this.A02.A0L().format(((double) i2) / 100.0d)}), i3, false, false);
        }
    }

    public final void A02(String str, String str2, int i2, boolean z2, boolean z3) {
        boolean z4 = false;
        if (i2 == -1) {
            z4 = true;
        }
        C007503l A002 = A00(z3);
        int i3 = 100;
        if (z4) {
            i3 = 0;
            i2 = 0;
        }
        A002.A03(i3, i2, false);
        A002.A0D(z2);
        A002.A0E(z4);
        A002.A0A(str);
        A002.A09(str2);
        this.A01.A02(31, A002.A01());
    }
}
