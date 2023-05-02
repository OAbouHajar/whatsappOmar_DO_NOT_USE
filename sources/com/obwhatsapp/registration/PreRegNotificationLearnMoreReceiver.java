package com.obwhatsapp.registration;

import X.AnonymousClass2IF;
import X.AnonymousClass3K3;
import X.C13690nt;
import X.C15860rz;
import X.C16150sX;
import X.C17220uj;
import X.C19380yL;
import X.C19980zJ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class PreRegNotificationLearnMoreReceiver extends BroadcastReceiver {
    public C19980zJ A00;
    public C19380yL A01;
    public C15860rz A02;
    public C17220uj A03;
    public final Object A04;
    public volatile boolean A05;

    public PreRegNotificationLearnMoreReceiver() {
        this(0);
    }

    public PreRegNotificationLearnMoreReceiver(int i2) {
        this.A05 = false;
        this.A04 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A00 = AnonymousClass3K3.A0a(A002);
                    this.A03 = C16150sX.A18(A002);
                    this.A02 = C16150sX.A0Y(A002);
                    this.A01 = (C19380yL) A002.AQd.get();
                    this.A05 = true;
                }
            }
        }
        this.A00.A06(context, C13690nt.A0B(this.A03.A04("30035737")).setFlags(268435456));
        SharedPreferences.Editor A0K = this.A02.A0K();
        A0K.remove("show_pre_reg_do_not_share_code_warning");
        A0K.apply();
        this.A01.A01(20);
    }
}
