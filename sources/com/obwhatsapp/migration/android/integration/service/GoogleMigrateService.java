package com.obwhatsapp.migration.android.integration.service;

import X.AnonymousClass01V;
import X.AnonymousClass10P;
import X.AnonymousClass1BN;
import X.AnonymousClass1NL;
import X.AnonymousClass1NO;
import X.AnonymousClass5TF;
import X.C007503l;
import X.C102934zl;
import X.C16300so;
import X.C16320sq;
import X.C28291Vi;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class GoogleMigrateService extends C28291Vi {
    public C16300so A00;
    public AnonymousClass01V A01;
    public AnonymousClass1NO A02;
    public AnonymousClass1NL A03;
    public AnonymousClass10P A04;
    public AnonymousClass1BN A05;
    public C16320sq A06;
    public boolean A07 = false;
    public final AnonymousClass5TF A08 = new C102934zl(this);

    public GoogleMigrateService() {
        super("GoogleMigrateService", true);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        A00();
        super.onCreate();
        this.A03.A02(this.A08);
    }

    public void onDestroy() {
        Log.i("GoogleMigrateService/onDestroy()");
        super.onDestroy();
        stopForeground(true);
        this.A03.A03(this.A08);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        String str;
        super.onStartCommand(intent, i2, i3);
        if (intent == null) {
            str = "GoogleMigrateService/onStartCommand()/intent is null";
        } else if ("com.obwhatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_START_IMPORT".equals(intent.getAction()) && this.A02.A0H()) {
            str = "GoogleMigrateService/onStartCommand()/import in progress";
        } else if ("com.obwhatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_CANCEL_IMPORT".equals(intent.getAction())) {
            Log.i("GoogleMigrateService/onStartCommand()/action_cancel_import");
            AnonymousClass10P r1 = this.A04;
            C007503l A002 = r1.A00(false);
            A002.A0A(r1.A00.A00.getResources().getString(R.string.str09f2));
            A01(i3, A002.A01(), 31);
            this.A06.Acl(new RunnableRunnableShape9S0200000_I0_7(this, 5, new RunnableRunnableShape11S0100000_I0_10((Object) this, 30)));
            return 1;
        } else if ("com.obwhatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_START_IMPORT".equals(intent.getAction())) {
            Log.i("GoogleMigrateService/onStartCommand()/action_start_import");
            AnonymousClass10P r12 = this.A04;
            C007503l A003 = r12.A00(false);
            A003.A0A(r12.A00.A00.getResources().getString(R.string.str09f8));
            A01(i3, A003.A01(), 31);
            this.A06.Acl(new RunnableRunnableShape9S0200000_I0_7(this, 5, new RunnableRunnableShape11S0100000_I0_10((Object) this, 29)));
            return 1;
        } else {
            if ("com.obwhatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_PREPARE_BEFORE_RETRY".equals(intent.getAction())) {
                Log.i("GoogleMigrateService/onStartCommand()/prepare_before_retry");
                int intExtra = intent.getIntExtra("migration_error_code", 1);
                AnonymousClass10P r13 = this.A04;
                C007503l A004 = r13.A00(false);
                A004.A0A(r13.A00.A00.getResources().getString(R.string.str146a));
                A01(i3, A004.A01(), 31);
                this.A06.Acl(new RunnableRunnableShape9S0200000_I0_7(this, 5, new RunnableRunnableShape0S0101000_I0((Object) this, intExtra, 19)));
                return 1;
            }
            return 1;
        }
        Log.i(str);
        return 1;
    }
}
