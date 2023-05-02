package com.obwhatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass2AS;
import X.AnonymousClass3GQ;
import X.C005402i;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14710pd;
import X.C15810rt;
import X.C16000sG;
import X.C16050sL;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16300so;
import X.C16620tM;
import X.C17190ug;
import X.C17200uh;
import X.C17230uk;
import X.C17240ul;
import X.C18050w4;
import X.C18260wP;
import X.C218115n;
import X.C25781Lc;
import X.C28371Vv;
import X.C35081lL;
import X.C39461sW;
import X.C49132Rg;
import X.C50162Yf;
import X.C57422r9;
import X.C63013Fu;
import X.C82684Dt;
import android.content.Intent;
import android.os.SystemClock;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.obwhatsapp.R;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http.StatusLine;

public class ManageGroupsInCommunityActivity extends C14530pL {
    public long A00;
    public Spinner A01;
    public C005402i A02;
    public RecyclerView A03;
    public C50162Yf A04;
    public C17230uk A05;
    public C57422r9 A06;
    public AnonymousClass2AS A07;
    public C16000sG A08;
    public C16080sP A09;
    public C17200uh A0A;
    public C15810rt A0B;
    public C16070sO A0C;
    public C218115n A0D;
    public C17240ul A0E;
    public C16050sL A0F;
    public C17190ug A0G;
    public C25781Lc A0H;
    public C18050w4 A0I;
    public boolean A0J;
    public final C82684Dt A0K;

    public ManageGroupsInCommunityActivity() {
        this(0);
        this.A0K = new C82684Dt(this);
    }

    public ManageGroupsInCommunityActivity(int i2) {
        this.A0J = false;
        C13680ns.A1G(this, 40);
    }

    public static /* synthetic */ boolean A03(ManageGroupsInCommunityActivity manageGroupsInCommunityActivity) {
        int A0D2 = AnonymousClass000.A0D(manageGroupsInCommunityActivity.A07.A0n.A01());
        C14710pd r0 = manageGroupsInCommunityActivity.A05.A0D;
        C16620tM r1 = C16620tM.A02;
        if (A0D2 < r0.A03(r1, 1238) + 1) {
            return false;
        }
        String format = manageGroupsInCommunityActivity.A01.A0K().format((long) manageGroupsInCommunityActivity.A05.A0D.A03(r1, 1238));
        AnonymousClass013 r3 = manageGroupsInCommunityActivity.A01;
        Object[] A1b = C13680ns.A1b();
        A1b[0] = format;
        Toast.makeText(manageGroupsInCommunityActivity, String.format(C13690nt.A0m(r3), r3.A0A(R.plurals.plurals011f, format), A1b), 0).show();
        return true;
    }

    public void A1q() {
        if (!this.A0J) {
            this.A0J = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r2 = A1T.A1s;
            C14550pN.A15(r2, this);
            C14530pL.A0b(A1T, r2, this, C14550pN.A0v(r2));
            this.A0B = C16150sX.A0c(r2);
            this.A0A = C16150sX.A0R(r2);
            this.A0G = C16150sX.A0t(r2);
            this.A08 = C16150sX.A0M(r2);
            this.A09 = C16150sX.A0Q(r2);
            this.A0E = C16150sX.A0o(r2);
            this.A0H = new C25781Lc();
            this.A0I = C16150sX.A19(r2);
            this.A0D = (C218115n) r2.AH2.get();
            this.A05 = (C17230uk) r2.A4I.get();
            this.A0C = C16150sX.A0e(r2);
            this.A04 = (C50162Yf) A1T.A0Z.get();
        }
    }

    public final void A35(C39461sW r18) {
        C39461sW r3 = r18;
        GroupJid groupJid = r3.A02;
        AnonymousClass00B.A06(groupJid);
        if (!this.A07.A0A()) {
            boolean A022 = C18260wP.A02(getApplicationContext());
            int i2 = R.string.str0dc2;
            if (A022) {
                i2 = R.string.str0dc3;
            }
            this.A05.A06(i2);
            return;
        }
        Afq(R.string.str0509);
        C16050sL r7 = this.A0F;
        C16300so r5 = this.A03;
        C17190ug r10 = this.A0G;
        C63013Fu r4 = new C63013Fu(this, r3);
        List singletonList = Collections.singletonList(groupJid);
        String A023 = r10.A02();
        int size = singletonList.size();
        C28371Vv[] r6 = new C28371Vv[size];
        for (int i3 = 0; i3 < size; i3 = C28371Vv.A01(singletonList.get(i3), new C35081lL[1], r6, i3)) {
        }
        C35081lL[] r2 = new C35081lL[1];
        C35081lL.A02("unlink_type", "sub_group", r2, 0);
        r10.A0A(new AnonymousClass3GQ(r5, r4), C28371Vv.A02(r7, new C28371Vv("unlink", r2, r6), A023), A023, StatusLine.HTTP_PERM_REDIRECT, 32000);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 10) {
            super.onActivityResult(i2, i3, intent);
            return;
        }
        if (i3 == -1) {
            if (intent != null && intent.getExtras() != null) {
                ArrayList<String> stringArrayList = intent.getExtras().getStringArrayList("selected_jids");
                if (stringArrayList != null && !stringArrayList.isEmpty()) {
                    if (!this.A07.A0A()) {
                        boolean A022 = C18260wP.A02(getApplicationContext());
                        int i4 = R.string.str0dc2;
                        if (A022) {
                            i4 = R.string.str0dc3;
                        }
                        this.A05.A06(i4);
                        return;
                    }
                    this.A00 = SystemClock.uptimeMillis();
                    Afr(R.string.str0f20, R.string.str13db);
                    AnonymousClass2AS r4 = this.A07;
                    r4.A0s.execute(new RunnableRunnableShape0S0300000_I0(r4, stringArrayList, this.A0F, 28));
                    return;
                }
            } else {
                return;
            }
        } else if (i3 != -10) {
            return;
        }
        this.A05.A06(R.string.str0df3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00d5, code lost:
        if (r7.A0C.A0A(r7.A0F) == false) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r7 = r19
            r0 = r20
            super.onCreate(r0)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "parent_group_jid"
            X.0sL r0 = X.C14530pL.A0N(r1, r0)
            r7.A0F = r0
            r0 = 2131558497(0x7f0d0061, float:1.8742311E38)
            r7.setContentView((int) r0)
            r0 = 2131362803(0x7f0a03f3, float:1.8345397E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r7, r0)
            r2 = 8
            r0.setVisibility(r2)
            X.02i r0 = X.C13690nt.A0N(r7)
            r7.A02 = r0
            r1 = 1
            r0.A0Q(r1)
            X.02i r0 = r7.A02
            r0.A0N(r1)
            X.02i r1 = r7.A02
            r0 = 2131889317(0x7f120ca5, float:1.9413294E38)
            r1.A0B(r0)
            r0 = 2131361955(0x7f0a00a3, float:1.8343677E38)
            android.view.View r1 = r7.findViewById(r0)
            r0 = 41
            X.C34331k5.A01(r1, r7, r0)
            r0 = 2131361954(0x7f0a00a2, float:1.8343675E38)
            android.view.View r1 = r7.findViewById(r0)
            r0 = 42
            X.C34331k5.A01(r1, r7, r0)
            X.0uh r1 = r7.A0A
            java.lang.String r0 = "add-groups-to-community"
            X.2Ao r12 = r1.A04(r7, r0)
            X.2Yf r4 = r7.A04
            X.0sL r3 = r7.A0F
            r1 = 1
            com.facebook.redex.IDxFactoryShape55S0200000_2_I0 r0 = new com.facebook.redex.IDxFactoryShape55S0200000_2_I0
            r0.<init>(r3, r1, r4)
            X.02z r1 = new X.02z
            r1.<init>((X.AnonymousClass04o) r0, (X.C001500q) r7)
            java.lang.Class<X.2AS> r0 = X.AnonymousClass2AS.class
            X.01n r0 = r1.A01(r0)
            X.2AS r0 = (X.AnonymousClass2AS) r0
            r7.A07 = r0
            r0 = 2131361980(0x7f0a00bc, float:1.8343728E38)
            android.view.View r6 = X.AnonymousClass00T.A05(r7, r0)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r7.A03 = r6
            int r5 = r6.getPaddingLeft()
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            int r4 = r0.getPaddingTop()
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            int r3 = r0.getPaddingRight()
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131167082(0x7f07076a, float:1.7948428E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r6.setPadding(r5, r4, r3, r0)
            r0 = 2131361956(0x7f0a00a4, float:1.8343679E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r7, r0)
            android.widget.Spinner r0 = (android.widget.Spinner) r0
            r7.A01 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r7.A03
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>()
            r1.setLayoutManager(r0)
            X.0sK r8 = r7.A01
            X.0rt r14 = r7.A0B
            X.0sG r10 = r7.A08
            X.0sP r11 = r7.A09
            X.013 r13 = r7.A01
            X.1Lc r3 = r7.A0H
            X.15n r1 = r7.A0D
            X.0sO r15 = r7.A0C
            X.0uk r0 = r7.A05
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x00d7
            X.0sO r4 = r7.A0C
            X.0sL r0 = r7.A0F
            boolean r0 = r4.A0A(r0)
            r18 = 1
            if (r0 != 0) goto L_0x00d9
        L_0x00d7:
            r18 = 0
        L_0x00d9:
            X.4Dt r9 = r7.A0K
            X.2r9 r6 = new X.2r9
            r16 = r1
            r17 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r7.A06 = r6
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            r0.setAdapter(r6)
            android.widget.Spinner r1 = r7.A01
            r0 = 0
            r1.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            r0.setVisibility(r2)
            X.2AS r0 = r7.A07
            X.2OJ r1 = r0.A0o
            r0 = 70
            X.C13680ns.A1L(r7, r1, r0)
            X.2AS r0 = r7.A07
            X.2OJ r1 = r0.A0n
            r0 = 69
            X.C13680ns.A1L(r7, r1, r0)
            X.2AS r0 = r7.A07
            X.027 r1 = r0.A0E
            r0 = 21
            X.C13680ns.A1M(r7, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.community.ManageGroupsInCommunityActivity.onCreate(android.os.Bundle):void");
    }
}
