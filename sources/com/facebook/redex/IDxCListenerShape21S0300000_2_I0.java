package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass01Y;
import X.AnonymousClass1L6;
import X.AnonymousClass1N6;
import X.AnonymousClass2DF;
import X.AnonymousClass5SC;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C39701sv;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.CompoundButton;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class IDxCListenerShape21S0300000_2_I0 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape21S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass2DF r5;
        boolean z2;
        C39701sv r2;
        Bitmap bitmap;
        Activity activity;
        switch (this.A03) {
            case 0:
                List list = (List) this.A00;
                AnonymousClass01Y r22 = (AnonymousClass01Y) this.A01;
                Activity activity2 = (Activity) this.A02;
                if (list.size() == 1) {
                    Object A0Z = C13690nt.A0Z(list);
                    AnonymousClass00B.A06(A0Z);
                    r22.A0K(activity2, (UserJid) A0Z);
                    return;
                }
                Intent A09 = C13680ns.A09();
                A09.setClassName(activity2.getPackageName(), "com.obwhatsapp.blocklist.BlockList");
                activity2.startActivity(A09);
                return;
            case 1:
                r5 = (AnonymousClass2DF) this.A00;
                r2 = (C39701sv) this.A01;
                bitmap = (Bitmap) this.A02;
                activity = (Activity) r5.A0G;
                z2 = false;
                break;
            case 2:
                r5 = (AnonymousClass2DF) this.A00;
                r2 = (C39701sv) this.A01;
                bitmap = (Bitmap) this.A02;
                activity = (Activity) r5.A0G;
                z2 = true;
                break;
            case 3:
                ((AnonymousClass5SC) this.A00).AV0(!((CompoundButton) this.A01).isChecked(), ((CompoundButton) this.A02).isChecked());
                return;
            default:
                Intent A0B = C13690nt.A0B((Uri) this.A02);
                ((AnonymousClass1N6) this.A00).A00.A06((Context) this.A01, A0B);
                return;
        }
        Intent A002 = AnonymousClass1L6.A00(activity, bitmap, r2, z2);
        C14530pL r23 = (C14530pL) r5.A0G;
        if (r23.A00.A09(r23, A002, 41)) {
            r5.A0r.A02(z2, 6);
        }
    }
}
