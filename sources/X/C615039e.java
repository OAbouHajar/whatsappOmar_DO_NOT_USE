package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.obwhatsapp.R;
import com.obwhatsapp.migration.export.ui.ExportMigrationActivity;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

/* renamed from: X.39e  reason: invalid class name and case insensitive filesystem */
public class C615039e {
    public final C16980tz A00;
    public final C19380yL A01;
    public final AnonymousClass013 A02;

    public C615039e(C16980tz r1, C19380yL r2, AnonymousClass013 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public Notification A00() {
        C007503l A012 = A01();
        A012.A0A(C16980tz.A00(this.A00).getString(R.string.str1cbf));
        return A012.A01();
    }

    public final C007503l A01() {
        Context context = this.A00.A00;
        Intent intent = new Intent(context, ExportMigrationActivity.class);
        intent.setAction("com.obwhatsapp.export.ACTION_OPENED_VIA_NOTIFICATION");
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

    public void A02(int i2) {
        Context context = this.A00.A00;
        String string = context.getResources().getString(R.string.str1cbf);
        if (i2 >= 0) {
            StringBuilder A0r = AnonymousClass000.A0r("MessagesExporterNotificationManager/onProgress (");
            A0r.append(i2);
            Log.i(AnonymousClass000.A0h("%)", A0r));
            A03(string, C13700nu.A0F(context.getResources(), this.A02.A0L().format(((double) i2) / 100.0d), C13680ns.A1b(), 0, R.string.str1cbe), i2, false);
        }
    }

    public final void A03(String str, String str2, int i2, boolean z2) {
        boolean z3 = true;
        int i3 = 100;
        if (i2 == -1) {
            z3 = false;
            i3 = 0;
            i2 = 0;
        }
        C007503l A012 = A01();
        A012.A03(i3, i2, false);
        A012.A0D(z2);
        A012.A0E(z3);
        A012.A0A(str);
        A012.A09(str2);
        this.A01.A02(31, A012.A01());
    }
}
