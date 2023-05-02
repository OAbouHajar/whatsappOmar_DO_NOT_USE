package com.obwhatsapp.calling.calllink;

import X.AnonymousClass00B;
import X.AnonymousClass1ZW;
import X.AnonymousClass2IF;
import X.C13690nt;
import X.C16150sX;
import X.C17990vy;
import X.C18010w0;
import X.C52142dD;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;

public class CallLinkShareReceiver extends BroadcastReceiver {
    public C18010w0 A00;
    public final Object A01;
    public volatile boolean A02;

    public CallLinkShareReceiver() {
        this(0);
    }

    public CallLinkShareReceiver(int i2) {
        this.A02 = false;
        this.A01 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        String str;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A00 = new C18010w0((C17990vy) A002.AAS.get(), C16150sX.A0m(A002));
                    this.A02 = true;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 22 && (componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")) != null) {
            String packageName = componentName.getPackageName();
            if (!AnonymousClass1ZW.A0E(packageName)) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    String charSequence = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString();
                    if (charSequence != null) {
                        packageName = charSequence;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.printStackTrace();
                }
                if (!intent.hasExtra("extra_entry_point")) {
                    str = "CallLinkShareReceiver/onReceive entryPoint extra not available";
                } else if (!intent.hasExtra("extra_is_video")) {
                    str = "CallLinkShareReceiver/onReceive isVideo extra not available";
                } else {
                    boolean booleanExtra = intent.getBooleanExtra("extra_is_video", false);
                    int intExtra = intent.getIntExtra("extra_entry_point", 0);
                    C18010w0 r2 = this.A00;
                    r2.A01.A06(C52142dD.A01(packageName, 2, intExtra, booleanExtra));
                    return;
                }
                AnonymousClass00B.A08(str);
            }
        }
    }
}
