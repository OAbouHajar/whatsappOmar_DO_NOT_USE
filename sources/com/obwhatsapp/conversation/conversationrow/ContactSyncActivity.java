package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass1L6;
import X.AnonymousClass5SV;
import X.C13680ns;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C17190ug;
import X.C23181Au;
import X.C28251Uz;
import X.C49132Rg;
import X.C55862kX;
import X.C79073z9;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

public class ContactSyncActivity extends C14530pL implements C28251Uz, AnonymousClass5SV {
    public AnonymousClass1L6 A00;
    public C23181Au A01;
    public C79073z9 A02;
    public UserJid A03;
    public C17190ug A04;
    public boolean A05;

    public ContactSyncActivity() {
        this(0);
    }

    public ContactSyncActivity(int i2) {
        this.A05 = false;
        C13680ns.A1G(this, 54);
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A04 = C16150sX.A0t(r1);
            this.A01 = (C23181Au) r1.A53.get();
            this.A00 = (AnonymousClass1L6) r1.AMC.get();
        }
    }

    public void APk(int i2) {
    }

    public void APl(int i2) {
    }

    public void APm(int i2) {
        if (i2 == 1 || i2 == 2) {
            finish();
        }
    }

    public void AVZ() {
        this.A02 = null;
        Ac1();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r1 != 0) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYb(X.AnonymousClass284 r5) {
        /*
            r4 = this;
            r3 = 0
            r4.A02 = r3
            r4.Ac1()
            if (r5 == 0) goto L_0x0034
            boolean r0 = r5.A00()
            if (r0 == 0) goto L_0x002c
            r4.finish()
            X.1L6 r0 = r4.A00
            com.whatsapp.jid.UserJid r1 = r4.A03
            X.0sG r0 = r0.A04
            X.0sH r1 = r0.A0A(r1)
            X.0ph r0 = X.C14750ph.A0q()
            android.content.Intent r1 = r0.A0v(r4, r1)
            java.lang.String r0 = "ShareContactUtil"
            X.AnonymousClass22U.A00(r1, r0)
            r4.startActivity(r1)
            return
        L_0x002c:
            int r1 = r5.A00
            r2 = 1
            r0 = 2131891813(0x7f121665, float:1.9418357E38)
            if (r1 == 0) goto L_0x0038
        L_0x0034:
            r2 = 2
            r0 = 2131891812(0x7f121664, float:1.9418355E38)
        L_0x0038:
            java.lang.String r0 = r4.getString(r0)
            X.2kX r1 = new X.2kX
            r1.<init>(r2)
            r1.A02(r0)
            r0 = 0
            r1.A07(r0)
            r0 = 2131889799(0x7f120e87, float:1.9414272E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A05(r0)
            com.obwhatsapp.backup.google.PromptDialogFragment r1 = r1.A00()
            X.050 r0 = X.C13680ns.A0O(r4)
            r0.A0C(r1, r3)
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.ContactSyncActivity.AYb(X.284):void");
    }

    public void AYc() {
        A2h(getString(R.string.str0c8c));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A03 = C14530pL.A0O(getIntent(), "user_jid");
        if (!this.A07.A0A()) {
            C55862kX r1 = new C55862kX(1);
            r1.A02(getString(R.string.str1665));
            r1.A07(false);
            r1.A05(getString(R.string.str0e87));
            C13680ns.A1J(r1.A00(), this);
            return;
        }
        C79073z9 r0 = this.A02;
        if (r0 != null) {
            r0.A06(true);
        }
        C79073z9 r12 = new C79073z9(this.A01, this, this.A03, this.A04);
        this.A02 = r12;
        C13700nu.A0W(r12, this.A05);
    }

    public void onDestroy() {
        super.onDestroy();
        C79073z9 r1 = this.A02;
        if (r1 != null) {
            r1.A06(true);
            this.A02 = null;
        }
    }
}
