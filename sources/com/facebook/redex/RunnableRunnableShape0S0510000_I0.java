package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass02C;
import X.AnonymousClass1L3;
import X.AnonymousClass1P8;
import X.AnonymousClass1yR;
import X.AnonymousClass27J;
import X.AnonymousClass27K;
import X.AnonymousClass2DT;
import X.AnonymousClass2UO;
import X.AnonymousClass2Ui;
import X.AnonymousClass4M6;
import X.C001300o;
import X.C14750ph;
import X.C16730tY;
import X.C16740tZ;
import X.C16750ta;
import X.C209212c;
import X.C211512z;
import X.C30231bz;
import X.C30241c0;
import X.C30251c1;
import X.C30261c2;
import X.C30761cu;
import X.C30971dG;
import X.C31701et;
import X.C38331qc;
import X.C38701rH;
import X.C42821yj;
import X.C45922Bq;
import X.C51652c1;
import X.C53932gX;
import X.C87584Xn;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.view.View;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.ConversationListView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.HashMap;

public class RunnableRunnableShape0S0510000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    public RunnableRunnableShape0S0510000_I0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, boolean z2) {
        this.A06 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = z2;
    }

    public final void run() {
        switch (this.A06) {
            case 0:
                C30231bz r0 = (C30231bz) this.A00;
                ((C30241c0) this.A01).ASo((C30251c1) this.A02, (C30261c2) this.A03, r0.A01, (IOException) this.A04, r0.A00, this.A05);
                return;
            case 1:
                C211512z r2 = (C211512z) this.A00;
                byte[] bArr = (byte[]) this.A01;
                byte[] bArr2 = (byte[]) this.A02;
                C30971dG[] r4 = (C30971dG[]) this.A03;
                C30971dG r1 = (C30971dG) this.A04;
                boolean z2 = this.A05;
                AnonymousClass00B.A01();
                if (z2) {
                    r2.A04();
                }
                synchronized (r2) {
                    r2.A02 = true;
                    r2.A04 = r4;
                }
                r2.A0E.A09(Message.obtain((Handler) null, 0, 85, 0, new C51652c1(r1, bArr, bArr2, r4)), false);
                return;
            case 2:
                AnonymousClass1L3 r6 = (AnonymousClass1L3) this.A00;
                boolean z3 = this.A05;
                View view = (View) this.A01;
                GroupJid groupJid = (GroupJid) this.A02;
                C001300o r12 = (C001300o) this.A03;
                AnonymousClass02C r42 = (AnonymousClass02C) this.A04;
                if (z3) {
                    Context context = view.getContext();
                    r6.A00.A06(context, C14750ph.A0M(context, groupJid));
                    return;
                }
                Context context2 = view.getContext();
                if (r42 != null) {
                    String A0J = r6.A05.A0J(groupJid);
                    CharSequence A032 = C45922Bq.A03(r6.A06, r6.A09, A0J != null ? context2.getString(R.string.str19d2, new Object[]{A0J}) : context2.getString(R.string.str19d3));
                    LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
                    Bundle A002 = C87584Xn.A00((Object[]) null, -1, 0, 0, 0, 0, -1);
                    if (A032 != null) {
                        A002.putCharSequence("message", A032);
                    }
                    legacyMessageDialogFragment.A0T(A002);
                    legacyMessageDialogFragment.A1G(r42, (String) null);
                    return;
                }
                r6.A03(view, r12, context2.getString(R.string.str19d3));
                return;
            case 3:
                AnonymousClass2Ui r13 = (AnonymousClass2Ui) this.A00;
                AnonymousClass4M6 r22 = (AnonymousClass4M6) this.A01;
                AnonymousClass27J r3 = (AnonymousClass27J) this.A02;
                C53932gX r43 = (C53932gX) this.A03;
                AnonymousClass27K r5 = (AnonymousClass27K) this.A04;
                boolean z4 = this.A05;
                AnonymousClass2UO r02 = r13.A01;
                if (r02 == null || !r02.A02) {
                    Log.i("CompanionDeviceQrHandler/request aborted, stopping");
                    return;
                } else {
                    r13.A03(r22, r3, r43, r5, z4);
                    return;
                }
            case 4:
                C42821yj r52 = (C42821yj) this.A00;
                AnonymousClass2DT r8 = (AnonymousClass2DT) this.A01;
                C16740tZ r32 = (C16740tZ) this.A02;
                C16740tZ r7 = (C16740tZ) this.A03;
                boolean z5 = this.A05;
                C38701rH r44 = (C38701rH) this.A04;
                if (!((AnonymousClass1yR) r52.A22).A00.A0J.A0B() && r52.A4W) {
                    if (r52.A4m) {
                        boolean z6 = true;
                        r8.A0Q = true;
                        PowerManager.WakeLock wakeLock = r8.A0b;
                        if (wakeLock == null || !wakeLock.isHeld()) {
                            z6 = false;
                        }
                        r8.A0Z = z6;
                        r8.A09();
                    }
                    r8.A0B(AnonymousClass2DT.A0x, true, false);
                    r52.A3Z = r32;
                    if (r52.A4X) {
                        r52.A0h(r7);
                    }
                    if (z5) {
                        r52.A0k(r44, 0, false);
                    }
                    ConversationListView conversationListView = r52.A1n;
                    RunnableRunnableShape0S0211000_I0 runnableRunnableShape0S0211000_I0 = new RunnableRunnableShape0S0211000_I0(conversationListView, r32);
                    conversationListView.A0C = runnableRunnableShape0S0211000_I0;
                    conversationListView.post(runnableRunnableShape0S0211000_I0);
                    return;
                }
                return;
            default:
                C209212c r62 = (C209212c) this.A00;
                C30761cu r72 = (C30761cu) this.A01;
                C16730tY r53 = (C16730tY) this.A02;
                C38331qc r45 = (C38331qc) this.A04;
                boolean z7 = this.A05;
                C209212c.A00(r72, r53, true);
                AnonymousClass1P8 r14 = r62.A0W;
                C16750ta r03 = r53.A02;
                HashMap hashMap = r14.A00;
                synchronized (hashMap) {
                    hashMap.remove(r03);
                }
                C31701et A012 = r72.A01();
                AnonymousClass00B.A06(A012);
                if (r45 != null) {
                    if (A012.A01 == 13) {
                        r45.AQ3(r72.A04() != null ? r72.A04().booleanValue() : false);
                    } else {
                        r45.AQ4(A012, r72);
                    }
                }
                r62.A0A(r53, A012.A01, z7);
                return;
        }
    }
}
