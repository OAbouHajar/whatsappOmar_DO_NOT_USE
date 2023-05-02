package com.obwhatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass04o;
import X.AnonymousClass11A;
import X.AnonymousClass18O;
import X.AnonymousClass18U;
import X.AnonymousClass28S;
import X.AnonymousClass2O3;
import X.AnonymousClass4QI;
import X.AnonymousClass51E;
import X.C001500q;
import X.C006602z;
import X.C102424yv;
import X.C108785Pi;
import X.C108795Pj;
import X.C109315Ro;
import X.C13680ns;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14710pd;
import X.C15810rt;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16050sL;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16490t9;
import X.C16620tM;
import X.C17190ug;
import X.C17240ul;
import X.C17380uz;
import X.C17780vd;
import X.C18260wP;
import X.C28031Ub;
import X.C28371Vv;
import X.C30661ck;
import X.C34331k5;
import X.C35081lL;
import X.C40821uk;
import X.C48432Nf;
import X.C49132Rg;
import X.C50982am;
import X.C56902p6;
import X.C56912p7;
import X.C74373qR;
import X.C810546q;
import X.C95094ly;
import X.C95104lz;
import X.C95154mB;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.facebook.redex.IDxCListenerShape228S0100000_2_I1;
import com.facebook.redex.IDxIFactoryShape25S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.obwhatsapp.R;
import com.obwhatsapp.youbasha.ui.lockV2.LockUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class GroupSettingsActivity extends C14530pL implements C108795Pj {
    public C16000sG A00;
    public C16080sP A01;
    public C15810rt A02;
    public AnonymousClass11A A03;
    public AnonymousClass18U A04;
    public C16070sO A05;
    public C16010sH A06;
    public C16490t9 A07;
    public C17240ul A08;
    public AnonymousClass18O A09;
    public C48432Nf A0A;
    public C109315Ro A0B;
    public GroupSettingsViewModel A0C;
    public C17780vd A0D;
    public C50982am A0E;
    public C16050sL A0F;
    public C17190ug A0G;
    public boolean A0H;
    public final AnonymousClass28S A0I;
    public final C108785Pi A0J;

    public GroupSettingsActivity() {
        this(0);
        this.A0I = new IDxCListenerShape228S0100000_2_I1(this, 1);
        this.A0J = new C102424yv(this);
    }

    public GroupSettingsActivity(int i2) {
        this.A0H = false;
        C13680ns.A1G(this, 76);
    }

    public void A1q() {
        if (!this.A0H) {
            this.A0H = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r2 = A1T.A1s;
            C14550pN.A15(r2, this);
            C14530pL.A0b(A1T, r2, this, C14550pN.A0v(r2));
            this.A02 = C16150sX.A0c(r2);
            this.A07 = C16150sX.A0m(r2);
            this.A0G = C16150sX.A0t(r2);
            this.A00 = C16150sX.A0M(r2);
            this.A01 = C16150sX.A0Q(r2);
            this.A08 = C16150sX.A0o(r2);
            this.A0D = C16150sX.A0p(r2);
            this.A03 = (AnonymousClass11A) r2.A5U.get();
            this.A09 = (AnonymousClass18O) r2.ABN.get();
            this.A05 = C16150sX.A0e(r2);
            this.A04 = (AnonymousClass18U) r2.ABQ.get();
            this.A0E = (C50982am) A1T.A16.get();
        }
    }

    public void AX6(int i2, boolean z2) {
        String str;
        String str2;
        boolean z3;
        int i3 = i2;
        boolean z4 = z2;
        if (i3 == 1) {
            z3 = !z2;
            if (this.A06.A0l != z3) {
                C17780vd r8 = this.A0D;
                C16050sL r4 = this.A0F;
                C40821uk r1 = new C40821uk(this.A03, this.A08, r4, (String) null, (List) null, 159);
                r8.A08(r4, r1, r1, z3 ? LockUtils.PATTERN_LOCK : "unlocked", (C35081lL[]) null, 159);
                str2 = "GroupXmppMethods/set-restrict-mode; restrictModeEnabled=";
            } else {
                str = "EditGroupInfoDialogFragment/onPositiveButtonClick: skip request, values are equal";
                Log.i(str);
            }
        } else if (i3 == 2) {
            z3 = !z2;
            if (this.A06.A0Y != z3) {
                C17780vd r82 = this.A0D;
                C16050sL r42 = this.A0F;
                C40821uk r12 = new C40821uk(this.A03, this.A08, r42, (String) null, (List) null, 161);
                r82.A08(r42, r12, r12, z3 ? "announcement" : "not_announcement", (C35081lL[]) null, 161);
                str2 = "GroupXmppMethods/set-announcements-only; announcementsEnabled=";
            } else {
                str = "SendMessagesDialogFragment/onPositiveButtonClick: skip request, values are equal";
                Log.i(str);
            }
        } else if (i3 != 3) {
            if (C810546q.A00(this.A06, this.A0C) != z4) {
                AnonymousClass51E r83 = new AnonymousClass51E(this.A0G);
                C16050sL r6 = this.A0F;
                String str3 = z2 ? "all_member_add" : "admin_add";
                r83.A00 = new AnonymousClass4QI(this);
                C17190ug r7 = r83.A01;
                String A022 = r7.A02();
                C28371Vv r5 = new C28371Vv("member_add_mode", str3, (C35081lL[]) null);
                C35081lL[] r43 = new C35081lL[4];
                r43[0] = new C35081lL("id", A022);
                r43[1] = new C35081lL("xmlns", "w:g2");
                C35081lL.A01("type", "set", r43);
                r43[3] = new C35081lL((Jid) r6, "to");
                r7.A0A(r83, C28371Vv.A04(r5, r43), A022, 336, 0);
                C74373qR r13 = new C74373qR();
                r13.A00 = Boolean.valueOf(z4);
                this.A07.A06(r13);
                return;
            }
            return;
        } else {
            C17780vd r84 = this.A0D;
            C16050sL r44 = this.A0F;
            z3 = !z2;
            C40821uk r14 = new C40821uk(this.A03, this.A08, r44, (String) null, (List) null, 213);
            r84.A08(r44, r14, r14, z3 ? "no_frequently_forwarded" : "frequently_forwarded_ok", (C35081lL[]) null, 213);
            str2 = "GroupXmppMethods/set-no-frequently-forwarded; noFrequentlyForwarded=";
        }
        StringBuilder A0r = AnonymousClass000.A0r(str2);
        A0r.append(z3);
        str = A0r.toString();
        Log.i(str);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4;
        int i5 = i2;
        int i6 = i3;
        Intent intent2 = intent;
        super.onActivityResult(i5, i6, intent2);
        if (i5 == 17 && i6 == -1) {
            List A072 = C16030sJ.A07(intent2, UserJid.class);
            C17380uz A042 = C16070sO.A00(this.A05, this.A0F).A04();
            HashSet A0o = C13680ns.A0o();
            C28031Ub it = A042.iterator();
            while (it.hasNext()) {
                C30661ck r1 = (C30661ck) it.next();
                UserJid userJid = r1.A03;
                if (!(this.A01.A0I(userJid) || (i4 = r1.A01) == 0 || i4 == 2)) {
                    A0o.add(userJid);
                }
            }
            ArrayList A0n = C13680ns.A0n(A072);
            A0n.removeAll(A0o);
            ArrayList A0n2 = C13680ns.A0n(A0o);
            A0n2.removeAll(A072);
            if (A0n.size() != 0 || A0n2.size() != 0) {
                if (!this.A07.A0A()) {
                    boolean A022 = C18260wP.A02(this);
                    int i7 = R.string.str0dc2;
                    if (A022) {
                        i7 = R.string.str0dc3;
                    }
                    this.A05.A09(i7, 0);
                    return;
                }
                C16070sO r2 = this.A05;
                int A023 = r2.A03.A02(this.A0F);
                C14710pd r22 = r2.A0A;
                int A032 = A023 == 1 ? r22.A03(C16620tM.A02, 1655) : r22.A03(C16620tM.A02, 1304) - 1;
                if (A032 >= (C16070sO.A00(this.A05, this.A0F).A0C().size() + A0n.size()) - A0n2.size()) {
                    C13700nu.A0W(new AnonymousClass2O3(this, this.A05, this.A00, this.A01, this.A05, this.A08, this.A0D, this.A0F, A0n, A0n2), this.A05);
                } else if (this.A08.A0m(this.A0F)) {
                    C17240ul.A01(3019, Integer.valueOf(A032));
                } else {
                    HashMap A0x = AnonymousClass000.A0x();
                    Iterator it2 = A0n.iterator();
                    while (it2.hasNext()) {
                        C13680ns.A1X(it2.next(), A0x, 419);
                    }
                    C17240ul.A01(3003, A0x);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        C109315Ro r6;
        super.onCreate(bundle);
        setTitle(R.string.str0b0e);
        C14530pL.A0Y(this);
        this.A0F = C14530pL.A0N(getIntent(), "gid");
        GroupSettingsViewModel groupSettingsViewModel = (GroupSettingsViewModel) new C006602z((AnonymousClass04o) new IDxIFactoryShape25S0100000_2_I1(this, 1), (C001500q) this).A01(GroupSettingsViewModel.class);
        this.A0C = groupSettingsViewModel;
        C13680ns.A1M(this, groupSettingsViewModel.A02, 25);
        C13680ns.A1L(this, this.A0C.A03, 96);
        C13680ns.A1L(this, this.A0C.A0A, 97);
        this.A0C.A0B.A0A(this, new C95154mB(this));
        C14710pd r1 = this.A0C;
        C16620tM r4 = C16620tM.A02;
        boolean A0E2 = r1.A0E(r4, 1863);
        if (A0E2) {
            C14710pd r11 = this.A0C;
            AnonymousClass013 r9 = this.A01;
            r6 = new C56902p6(this, this.A01, r9, this.A05, r11, this.A08, this, this.A0F);
            this.A0B = r6;
        } else {
            C14710pd r3 = this.A0C;
            r6 = new C56912p7(this, this.A06, this.A00, r3, this.A08, this, this.A0F);
            this.A0B = r6;
        }
        setContentView((View) r6);
        C34331k5.A03(AnonymousClass00T.A05(this, R.id.manage_admins), this, 30);
        if (this.A0C.A0E(r4, 1728)) {
            int i2 = R.id.membership_approval_row_view_stub_v1;
            if (A0E2) {
                i2 = R.id.membership_approval_row_view_stub_v2;
            }
            C48432Nf r12 = (C48432Nf) ((ViewStub) findViewById(i2)).inflate();
            this.A0A = r12;
            r12.setCallback(this.A0J);
        }
        GroupSettingsViewModel groupSettingsViewModel2 = this.A0C;
        groupSettingsViewModel2.A0C.Acl(new RunnableRunnableShape14S0200000_I1_2(groupSettingsViewModel2, 23, this.A0F));
        AnonymousClass18O r0 = this.A09;
        r0.A00.add(this.A0I);
        AGM().A0f(new C95094ly(this), this, "group_join_request_approve_all_pending_requests");
        AGM().A0f(new C95104lz(this), this, "group_join_request_group_too_full");
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass18O r0 = this.A09;
        r0.A00.remove(this.A0I);
    }
}
