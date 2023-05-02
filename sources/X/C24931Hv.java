package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.obwhatsapp.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1Hv  reason: invalid class name and case insensitive filesystem */
public class C24931Hv {
    public final C16980tz A00;
    public final C19410yO A01;
    public final AnonymousClass15X A02;
    public final AnonymousClass1GN A03;

    public C24931Hv(C16980tz r1, C19410yO r2, AnonymousClass15X r3, AnonymousClass1GN r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public C007503l A00(String str) {
        if (str == null) {
            str = this.A00.A02(R.string.str0e61);
        }
        Context context = this.A00.A00;
        C007503l A002 = C218415q.A00(context);
        A002.A0J = "other_notifications@1";
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.companiondevice.LinkedDevicesActivity");
        A002.A09 = C42341xd.A00(context, 0, intent, 0);
        int i2 = -2;
        if (Build.VERSION.SDK_INT >= 26) {
            i2 = -1;
        }
        A002.A03 = i2;
        A002.A0B(str);
        A002.A09(str);
        A002.A07.icon = R.drawable.notify_web_client_connected;
        return A002;
    }

    public String A01(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == Boolean.TRUE) {
                AnonymousClass1WN A05 = this.A01.A05(((DeviceJid) entry.getKey()).device);
                if (A05 != null) {
                    Context context = this.A00.A00;
                    return context.getString(R.string.str0e62, new Object[]{AnonymousClass1WN.A00(context, A05)});
                }
                StringBuilder sb = new StringBuilder("HistorySyncNotificationHelper/getNotificationText companionDeviceInfo missing for ");
                sb.append(entry.getKey());
                Log.e(sb.toString());
            }
        }
        return this.A00.A02(R.string.str0e61);
    }
}
