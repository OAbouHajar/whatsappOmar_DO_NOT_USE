package com.obwhatsapp.notification;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass04E;
import X.AnonymousClass04G;
import X.AnonymousClass10Y;
import X.AnonymousClass15I;
import X.AnonymousClass1ZR;
import X.AnonymousClass56A;
import X.C007503l;
import X.C14760pi;
import X.C14770pj;
import X.C14870pt;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16740tZ;
import X.C16760tb;
import X.C17020u3;
import X.C19150xq;
import X.C28261Vb;
import X.C35541m6;
import X.C42341xd;
import X.C45912Bp;
import X.C45922Bq;
import X.C74043pe;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.redex.RunnableRunnableShape0S1400000_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class DirectReplyService extends C28261Vb {
    public C14870pt A00;
    public C16760tb A01;
    public C16000sG A02;
    public AnonymousClass10Y A03;
    public AnonymousClass15I A04;
    public AnonymousClass01V A05;
    public C19150xq A06;
    public C14770pj A07;
    public C14760pi A08;
    public C17020u3 A09;
    public boolean A0A = false;

    public DirectReplyService() {
        super("DirectReply");
    }

    public static AnonymousClass04E A00(Context context, C16010sH r19, String str, int i2, boolean z2) {
        AnonymousClass04G[] r9 = null;
        String str2 = str;
        boolean equals = "com.obwhatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL".equals(str2);
        int i3 = R.string.str0e57;
        if (equals) {
            i3 = R.string.str1ae7;
        }
        Context context2 = context;
        AnonymousClass04G r13 = new AnonymousClass04G(new Bundle(), context2.getString(i3), "direct_reply_input", new HashSet(), (CharSequence[]) null);
        Intent putExtra = new Intent(str2, ContentUris.withAppendedId(C45912Bp.A00, r19.A05()), context2, DirectReplyService.class).putExtra("direct_reply_num_messages", i2);
        CharSequence charSequence = r13.A01;
        int i4 = 134217728;
        if (C42341xd.A01) {
            i4 = 167772160;
        }
        PendingIntent service = PendingIntent.getService(context2, 0, putExtra, i4);
        IconCompat A022 = IconCompat.A02((Resources) null, "", R.drawable.ic_action_reply);
        Bundle bundle = new Bundle();
        CharSequence A002 = C007503l.A00(charSequence);
        ArrayList arrayList = new ArrayList();
        arrayList.add(r13);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(it.next());
        }
        AnonymousClass04G[] r8 = null;
        if (!arrayList2.isEmpty()) {
            r9 = (AnonymousClass04G[]) arrayList2.toArray(new AnonymousClass04G[arrayList2.size()]);
        }
        if (!arrayList3.isEmpty()) {
            r8 = (AnonymousClass04G[]) arrayList3.toArray(new AnonymousClass04G[arrayList3.size()]);
        }
        return new AnonymousClass04E(service, bundle, A022, A002, r8, r9, 1, z2, false);
    }

    public static /* synthetic */ void A01(Intent intent, C16010sH r6, C74043pe r7, DirectReplyService directReplyService, String str) {
        directReplyService.A06.A03(r7);
        if (Build.VERSION.SDK_INT >= 28 && !"com.obwhatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL".equals(str)) {
            C14770pj r2 = directReplyService.A07;
            C15830rv r3 = (C15830rv) r6.A08(C15830rv.class);
            int intExtra = intent.getIntExtra("direct_reply_num_messages", 0);
            StringBuilder sb = new StringBuilder("messagenotification/posting reply update runnable for jid:");
            sb.append(r3);
            Log.i(sb.toString());
            r2.A01().post(r2.A05(r3, (C16740tZ) null, intExtra, true, true, false, true));
        }
    }

    public static /* synthetic */ void A02(C16010sH r16, C74043pe r17, DirectReplyService directReplyService, String str, String str2) {
        DirectReplyService directReplyService2 = directReplyService;
        directReplyService2.A06.A02(r17);
        Class<C15830rv> cls = C15830rv.class;
        C16010sH r9 = r16;
        directReplyService2.A01.A0A((AnonymousClass1ZR) null, (C35541m6) null, (C16740tZ) null, str, Collections.singletonList(r9.A08(cls)), (List) null, false, false);
        if ("com.obwhatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL".equals(str2)) {
            directReplyService2.A08.A02();
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        AnonymousClass10Y r1 = directReplyService2.A03;
        C15830rv r0 = (C15830rv) r9.A08(cls);
        if (i2 < 28) {
            r1.A00(r0, 2, true, true);
            directReplyService2.A07.A08();
            return;
        }
        r1.A00(r0, 2, true, false);
    }

    public static boolean A03() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public void onCreate() {
        A00();
        super.onCreate();
    }

    public void onHandleIntent(Intent intent) {
        String str;
        StringBuilder sb = new StringBuilder("directreplyservice/intent: ");
        Intent intent2 = intent;
        sb.append(intent2);
        sb.append(" num_message:");
        sb.append(intent2.getIntExtra("direct_reply_num_messages", 0));
        Log.i(sb.toString());
        Bundle A002 = AnonymousClass04G.A00(intent2);
        if (A002 == null) {
            str = "directreplyservice/could not find remote input";
        } else {
            String str2 = null;
            if (C45912Bp.A00(intent2.getData())) {
                C16000sG r2 = this.A02;
                Uri data = intent2.getData();
                AnonymousClass00B.A0F(C45912Bp.A00(data));
                C16010sH A052 = r2.A05(ContentUris.parseId(data));
                if (A052 != null) {
                    CharSequence charSequence = A002.getCharSequence("direct_reply_input");
                    if (charSequence != null) {
                        str2 = charSequence.toString().trim();
                    }
                    if (!C45922Bq.A0B(this.A05, this.A09, str2)) {
                        Log.i("directreplyservice/message is empty");
                        this.A00.A0K(new RunnableRunnableShape11S0100000_I0_10((Object) this, 42));
                        return;
                    }
                    String action = intent2.getAction();
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    C74043pe r5 = new C74043pe((C15830rv) A052.A08(C15830rv.class), countDownLatch);
                    this.A04.A09(A052.A0E, 2);
                    this.A00.A0K(new AnonymousClass56A(A052, r5, this, str2, action));
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e2) {
                        Log.e("Interrupted while waiting to add message", e2);
                    }
                    this.A00.A0K(new RunnableRunnableShape0S1400000_I0(this, r5, A052, intent2, action, 1));
                    return;
                }
            }
            str = "directreplyservice/contact could not be found";
        }
        Log.i(str);
    }
}
