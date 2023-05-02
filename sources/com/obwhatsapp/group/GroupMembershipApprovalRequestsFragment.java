package com.obwhatsapp.group;

import X.AnonymousClass01V;
import X.AnonymousClass18U;
import X.AnonymousClass18V;
import X.AnonymousClass1W4;
import X.AnonymousClass2O4;
import X.AnonymousClass2X7;
import X.AnonymousClass3MF;
import X.AnonymousClass5FK;
import X.AnonymousClass5FL;
import X.C001000l;
import X.C14710pd;
import X.C14870pt;
import X.C16000sG;
import X.C16050sL;
import X.C16080sP;
import X.C16150sX;
import X.C16300so;
import X.C16320sq;
import X.C16490t9;
import X.C17110uY;
import X.C17190ug;
import X.C18450wi;
import X.C50142Yd;
import X.C57102q8;
import X.C63083Gb;
import X.C82254Cc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxObserverShape24S0300000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public final class GroupMembershipApprovalRequestsFragment extends Hilt_GroupMembershipApprovalRequestsFragment {
    public C82254Cc A00;
    public C14870pt A01;
    public C16080sP A02;
    public AnonymousClass01V A03;
    public AnonymousClass2X7 A04;
    public AnonymousClass2O4 A05;
    public C16050sL A06;
    public C17110uY A07;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.layout02dc, viewGroup, false);
    }

    public void A18(Bundle bundle, View view) {
        View view2 = view;
        C18450wi.A0H(view2, 0);
        View findViewById = view2.findViewById(R.id.no_pending_requests_view);
        C18450wi.A0B(findViewById);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById;
        AnonymousClass01V r1 = this.A03;
        if (r1 != null) {
            textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, r1));
            textEmojiLabel.A07 = new AnonymousClass3MF();
            View findViewById2 = view2.findViewById(R.id.pending_requests_recycler_view);
            C18450wi.A0B(findViewById2);
            RecyclerView recyclerView = (RecyclerView) findViewById2;
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAdapter(A1B());
            try {
                Bundle bundle2 = this.A05;
                String str = null;
                if (bundle2 != null) {
                    str = bundle2.getString("gid");
                }
                C16050sL A042 = C16050sL.A04(str);
                C18450wi.A0B(A042);
                this.A06 = A042;
                AnonymousClass2X7 A1B = A1B();
                C16050sL r8 = this.A06;
                if (r8 == null) {
                    C18450wi.A0O("groupJid");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                A1B.A00 = r8;
                C82254Cc r0 = this.A00;
                if (r0 != null) {
                    C50142Yd r12 = r0.A00;
                    C16150sX r2 = r12.A04;
                    C16000sG r11 = (C16000sG) r2.A4x.get();
                    C16080sP r122 = (C16080sP) r2.AQ9.get();
                    AnonymousClass18U r13 = (AnonymousClass18U) r2.ABQ.get();
                    C16150sX r10 = r12.A03.A0b;
                    C16050sL r17 = r8;
                    this.A05 = new AnonymousClass2O4(r11, r122, r13, (C14710pd) r2.A05.get(), (C16490t9) r2.AQz.get(), new C63083Gb((C16300so) r10.A5p.get(), (AnonymousClass18U) r10.ABQ.get(), (AnonymousClass18V) r10.ABR.get(), (C17190ug) r10.AEu.get(), (C16320sq) r10.ARB.get()), r17, (C16320sq) r2.ARB.get());
                    A1B().A02 = new AnonymousClass5FK(this);
                    A1B().A03 = new AnonymousClass5FL(this);
                    AnonymousClass2O4 r02 = this.A05;
                    if (r02 == null) {
                        C18450wi.A0O("viewModel");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    r02.A00.A0A(A0H(), new IDxObserverShape24S0300000_2_I0(this, textEmojiLabel, recyclerView, 2));
                    AnonymousClass2O4 r03 = this.A05;
                    if (r03 == null) {
                        C18450wi.A0O("viewModel");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    r03.A01.A0A(A0H(), new IDxObserverShape24S0300000_2_I0(this, textEmojiLabel, recyclerView, 1));
                    AnonymousClass2O4 r04 = this.A05;
                    if (r04 == null) {
                        C18450wi.A0O("viewModel");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    r04.A02.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 182));
                    AnonymousClass2O4 r05 = this.A05;
                    if (r05 == null) {
                        C18450wi.A0O("viewModel");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    r05.A0C.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 184));
                    AnonymousClass2O4 r06 = this.A05;
                    if (r06 == null) {
                        C18450wi.A0O("viewModel");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    r06.A0B.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 185));
                    AnonymousClass2O4 r07 = this.A05;
                    if (r07 == null) {
                        C18450wi.A0O("viewModel");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    } else {
                        r07.A0A.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 183));
                    }
                } else {
                    C18450wi.A0O("pendingParticipantsViewModelFactory");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            } catch (AnonymousClass1W4 e2) {
                Log.e("GroupPendingParticipants started with invalid jid ", e2);
                C001000l A0C = A0C();
                if (A0C != null) {
                    A0C.finish();
                }
            }
        } else {
            C18450wi.A0O("systemServices");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public final AnonymousClass2X7 A1B() {
        AnonymousClass2X7 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("membershipApprovalRequestsAdapter");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }
}
