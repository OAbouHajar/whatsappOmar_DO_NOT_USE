package com.obwhatsapp.notification;

import X.AnonymousClass10Y;
import X.AnonymousClass17V;
import X.AnonymousClass2IF;
import X.C13690nt;
import X.C14870pt;
import X.C16150sX;
import X.C16320sq;
import X.C16460t6;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.redex.RunnableRunnableShape1S2200000_I1;

public class MessageOTPNotificationBroadcastReceiver extends BroadcastReceiver {
    public C14870pt A00;
    public AnonymousClass10Y A01;
    public AnonymousClass17V A02;
    public C16460t6 A03;
    public C16320sq A04;
    public final Object A05;
    public volatile boolean A06;

    public MessageOTPNotificationBroadcastReceiver() {
        this(0);
    }

    public MessageOTPNotificationBroadcastReceiver(int i2) {
        this.A06 = false;
        this.A05 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        Context context2 = context;
        if (!this.A06) {
            synchronized (this.A05) {
                if (!this.A06) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A00 = C16150sX.A02(A002);
                    this.A04 = C16150sX.A1B(A002);
                    this.A02 = (AnonymousClass17V) A002.AFA.get();
                    this.A03 = (C16460t6) A002.A5k.get();
                    this.A01 = (AnonymousClass10Y) A002.A5X.get();
                    this.A06 = true;
                }
            }
        }
        String stringExtra = intent.getStringExtra("extra_remote_jid");
        String stringExtra2 = intent.getStringExtra("extra_message_key_id");
        if (stringExtra != null && stringExtra2 != null) {
            this.A04.Acl(new RunnableRunnableShape1S2200000_I1(this, context2, stringExtra, stringExtra2, 1));
        }
    }
}
