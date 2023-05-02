package com.obwhatsapp.notification;

import X.AnonymousClass1W4;
import X.AnonymousClass2IF;
import X.C13680ns;
import X.C13690nt;
import X.C14770pj;
import X.C15830rv;
import X.C15860rz;
import X.C16150sX;
import X.C216714z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.redex.RunnableRunnableShape0S0200100_I0;
import com.whatsapp.util.Log;
import java.util.Locale;

public class MessageNotificationDismissedReceiver extends BroadcastReceiver {
    public C15860rz A00;
    public C14770pj A01;
    public C216714z A02;
    public final Object A03;
    public volatile boolean A04;

    public MessageNotificationDismissedReceiver() {
        this(0);
    }

    public MessageNotificationDismissedReceiver(int i2) {
        this.A04 = false;
        this.A03 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A01 = (C14770pj) A002.AF9.get();
                    this.A00 = C16150sX.A0Y(A002);
                    this.A02 = (C216714z) A002.AF8.get();
                    this.A04 = true;
                }
            }
        }
        if (intent.hasExtra("chat_jid")) {
            long longExtra = intent.getLongExtra("last_message_time", -1);
            String stringExtra = intent.getStringExtra("chat_jid");
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = "messagenotificationdismissedreceiver/onreceive";
            objArr[1] = stringExtra;
            C13690nt.A1Q(objArr, 2, longExtra);
            String.format(locale, "%s child notification: chatJid=%s, last_message_time=%d", objArr);
            C216714z r3 = this.A02;
            String stringExtra2 = intent.getStringExtra("chat_jid");
            long longExtra2 = intent.getLongExtra("last_message_time", -1);
            try {
                C15830rv A012 = C15830rv.A01(stringExtra2);
                r3.A03.put(A012, Long.valueOf(longExtra2));
                r3.A02.Acl(new RunnableRunnableShape0S0200100_I0(r3, A012, 7, longExtra2));
            } catch (AnonymousClass1W4 unused) {
                Log.e("messagenotificationdismisshelper/handleDismissIntent: Invalid Jid stored in intent");
            }
        } else {
            String stringExtra3 = intent.getStringExtra("notification_hash");
            C13680ns.A0y(this.A00.A0K(), "notification_hash", stringExtra3);
            String.format("%s summary notification: notification_hash=%s", new Object[]{"messagenotificationdismissedreceiver/onreceive", stringExtra3});
            this.A01.A07();
        }
    }
}
