package com.obwhatsapp.registration.directmigration;

import X.AnonymousClass2IF;
import X.C13680ns;
import X.C13690nt;
import X.C15860rz;
import X.C16150sX;
import X.C27851Tj;
import X.C46512Ep;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class MigrationRequesterBroadcastReceiver extends BroadcastReceiver {
    public C15860rz A00;
    public C27851Tj A01;
    public final Object A02;
    public volatile boolean A03;

    public MigrationRequesterBroadcastReceiver() {
        this(0);
    }

    public MigrationRequesterBroadcastReceiver(int i2) {
        this.A03 = false;
        this.A02 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A00 = C16150sX.A0Y(A002);
                    this.A01 = (C27851Tj) A002.A6u.get();
                    this.A03 = true;
                }
            }
        }
        if (intent != null) {
            Log.i("MigrationRequesterBroadcastReceiver/received-broadcast");
            if ("com.obwhatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction".equals(intent.getAction())) {
                long longExtra = intent.getLongExtra("extra_min_storage_needed", 0);
                long longExtra2 = intent.getLongExtra("extra_msg_db_size", 0);
                C46512Ep r4 = this.A01.A01;
                r4.A03 = Double.valueOf((double) longExtra);
                r4.A02 = Double.valueOf((double) longExtra2);
                C13680ns.A0x(this.A00.A0K(), "registration_sibling_app_min_storage_needed", longExtra);
            }
        }
    }
}
