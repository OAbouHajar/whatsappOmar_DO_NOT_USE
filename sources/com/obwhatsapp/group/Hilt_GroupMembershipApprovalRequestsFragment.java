package com.obwhatsapp.group;

import X.AnonymousClass006;
import X.AnonymousClass01A;
import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass2TA;
import X.AnonymousClass2X7;
import X.C14870pt;
import X.C16080sP;
import X.C16150sX;
import X.C16340ss;
import X.C17050uS;
import X.C17060uT;
import X.C17110uY;
import X.C17200uh;
import X.C19980zJ;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import X.C82254Cc;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_GroupMembershipApprovalRequestsFragment extends AnonymousClass01A implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1A();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        LayoutInflater A0v = super.A0v(bundle);
        return A0v.cloneInContext(new C54452hX(A0v, (AnonymousClass01A) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C54442hW.A00(r0) == r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r4) {
        /*
            r3 = this;
            r0 = 1
            r3.A0V = r0
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C54442hW.A00(r0)
            r2 = 0
            if (r0 != r4) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.C52772eQ.A00(r0, r1, r2)
            r3.A1A()
            r3.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.group.Hilt_GroupMembershipApprovalRequestsFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1A();
        A19();
    }

    public void A19() {
        if (!this.A02) {
            this.A02 = true;
            GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment = (GroupMembershipApprovalRequestsFragment) this;
            C17050uS r3 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r5 = r3.A0b;
            groupMembershipApprovalRequestsFragment.A01 = (C14870pt) r5.AB3.get();
            AnonymousClass01J r4 = r5.ADT;
            groupMembershipApprovalRequestsFragment.A07 = (C17110uY) r4.get();
            groupMembershipApprovalRequestsFragment.A03 = (AnonymousClass01V) r5.AOi.get();
            AnonymousClass01J r1 = r5.AQ9;
            groupMembershipApprovalRequestsFragment.A02 = (C16080sP) r1.get();
            Context context = r5.AS2.A00;
            C16340ss.A01(context);
            C17200uh r9 = (C17200uh) r5.A52.get();
            groupMembershipApprovalRequestsFragment.A04 = new AnonymousClass2X7(context, (C19980zJ) r5.A0P.get(), (C16080sP) r1.get(), r9, (C17110uY) r4.get());
            groupMembershipApprovalRequestsFragment.A00 = (C82254Cc) r3.A0L.get();
        }
    }

    public final void A1A() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A01(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C54442hW(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }
}
