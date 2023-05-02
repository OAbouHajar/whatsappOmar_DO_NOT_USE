package X;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

/* renamed from: X.1A3  reason: invalid class name */
public class AnonymousClass1A3 implements AnonymousClass1A0 {
    public final C19770yy A00;

    public AnonymousClass1A3(C19770yy r1) {
        this.A00 = r1;
    }

    public void AHM(String str) {
        String obj;
        C19770yy r4 = this.A00;
        C15960sC r2 = r4.A07;
        if (r2.A00() == 10) {
            String A002 = r4.A08.A00();
            if (!"IN_REVIEW".equals(A002)) {
                StringBuilder sb = new StringBuilder("banmanager/checkIfNeedToPostBanAppealDecisionNotification not showing ban appeals notification since ban appeal state=");
                sb.append(A002);
                obj = sb.toString();
            } else {
                Log.i("banmanager/checkIfNeedToPostBanAppealDecisionNotification showing ban appeals notification");
                Context context = r4.A02.A00;
                String string = context.getString(R.string.str0e2b);
                String string2 = context.getString(R.string.str0e29);
                String string3 = context.getString(R.string.str0e2a, new Object[]{string});
                Intent intent = new Intent();
                intent.setClassName(context.getPackageName(), "com.obwhatsapp.userban.ui.BanAppealActivity");
                intent.putExtra("launch_source", 4);
                C007503l A003 = C218415q.A00(context);
                A003.A0J = "critical_app_alerts@1";
                A003.A03 = 1;
                A003.A0B(string3);
                A003.A02(3);
                A003.A0D(true);
                A003.A0A(string);
                A003.A09(string2);
                NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
                notificationCompat$BigTextStyle.A09(string2);
                A003.A08(notificationCompat$BigTextStyle);
                A003.A09 = C42341xd.A00(context, 0, intent, 134217728);
                A003.A07.icon = yo.getNIcon(R.drawable.notifybar);
                r4.A03.A02(42, A003.A01());
                return;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("banmanager/checkIfNeedToPostBanAppealDecisionNotification not showing ban appeals notification since reg state=");
            sb2.append(r2.A00());
            obj = sb2.toString();
        }
        Log.w(obj);
    }

    public boolean AfF(Long l2, String str) {
        return "ban_appeals".equals(str);
    }
}
