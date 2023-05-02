package com.obwhatsapp.companiondevice.sync;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass02O;
import X.AnonymousClass02Q;
import X.AnonymousClass0RE;
import X.AnonymousClass11U;
import X.AnonymousClass1WE;
import X.AnonymousClass1XK;
import X.C007503l;
import X.C16150sX;
import X.C16320sq;
import X.C18230wM;
import X.C218415q;
import X.C24941Hw;
import X.C24951Hx;
import X.C29951bV;
import X.C29981bY;
import X.C52362dg;
import X.C83564He;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.facebook.redex.IDxDListenerShape33S0300000_2_I0;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.io.File;

public class HistorySyncCompanionWorker extends AnonymousClass02O {
    public final C29951bV A00 = new C29951bV();
    public final AnonymousClass11U A01;
    public final C24951Hx A02;
    public final C24941Hw A03;
    public final C16320sq A04;

    public HistorySyncCompanionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass01F r1 = (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
        this.A04 = r1.Ai4();
        C16150sX r12 = (C16150sX) r1;
        this.A01 = (AnonymousClass11U) r12.AKm.get();
        this.A02 = (C24951Hx) r12.ABh.get();
        this.A03 = (C24941Hw) r12.ABi.get();
    }

    public C29981bY A00() {
        Context context = this.A00;
        String string = context.getString(R.string.str0e5c);
        C007503l A002 = C218415q.A00(context);
        A002.A0J = "other_notifications@1";
        A002.A09(string);
        A002.A0B(string);
        A002.A03 = -1;
        A002.A07.icon = yo.getNIcon(R.drawable.notifybar);
        C29951bV r4 = new C29951bV();
        r4.A04(new AnonymousClass0RE(230176041, A002.A01(), 0));
        return r4;
    }

    public C29981bY A02() {
        Log.i("HistorySyncCompanionWorker/ startWork");
        this.A04.Acl(new RunnableRunnableShape6S0100000_I0_5(this, 21));
        return this.A00;
    }

    public final void A04() {
        C52362dg A012 = this.A03.A01();
        if (A012 == null) {
            this.A00.A04(AnonymousClass02Q.A00());
            return;
        }
        C83564He r6 = new C83564He(this, A012);
        String str = A012.A05;
        boolean isEmpty = TextUtils.isEmpty(str);
        C24951Hx r5 = this.A02;
        if (!isEmpty) {
            r5.A01(r6, A012, new File(str));
            return;
        }
        C18230wM r8 = r5.A0L;
        AnonymousClass1XK r10 = AnonymousClass1XK.A0K;
        String str2 = A012.A07;
        String str3 = A012.A06;
        String str4 = A012.A04;
        String str5 = str4;
        r8.A06(new IDxDListenerShape33S0300000_2_I0(r5, r6, A012, 1), r10, (AnonymousClass1WE) null, (AnonymousClass1WE) null, (String) null, str2, str3, (String) null, str5, (String) null, A012.A09, 4, 21, 11, 0, A012.A02);
    }
}
