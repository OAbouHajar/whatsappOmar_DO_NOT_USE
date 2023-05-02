package com.google.android.gms.analytics;

import X.C13710nw;
import X.C15000qA;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzeu;
import com.google.android.gms.internal.gtm.zzfb;

public class CampaignTrackingReceiver extends BroadcastReceiver {
    public static Boolean zza;

    public void onReceive(Context context, Intent intent) {
        String str;
        zzbv zzg = zzbv.zzg(context);
        zzbv.zzs(zzg.zzf);
        zzfb zzfb = zzg.zzf;
        if (intent == null) {
            str = "CampaignTrackingReceiver received null intent";
        } else {
            String stringExtra = intent.getStringExtra("referrer");
            String action = intent.getAction();
            zzfb.zzP("CampaignTrackingReceiver received", action);
            if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
                str = "CampaignTrackingReceiver received unexpected intent without referrer extra";
            } else {
                Number number = (Number) zzeu.zzy.zzb();
                int intValue = number.intValue();
                int length = stringExtra.length();
                if (length > intValue) {
                    zzfb.zzT("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(length), number);
                    stringExtra = stringExtra.substring(0, intValue);
                }
                BroadcastReceiver.PendingResult goAsync = goAsync();
                zzbv.zzs(zzg.zzh);
                zzbq zzbq = zzg.zzh;
                RunnableRunnableShape1S0100000_I0 runnableRunnableShape1S0100000_I0 = new RunnableRunnableShape1S0100000_I0(goAsync);
                C13710nw.A07(stringExtra, "campaign param can't be empty");
                C15000qA r2 = zzbq.zza.zzg;
                C13710nw.A01(r2);
                r2.A03.submit(new RunnableRunnableShape0S1200000_I0(zzbq, stringExtra, runnableRunnableShape1S0100000_I0, 0));
                return;
            }
        }
        zzfb.zzR(str);
    }
}
