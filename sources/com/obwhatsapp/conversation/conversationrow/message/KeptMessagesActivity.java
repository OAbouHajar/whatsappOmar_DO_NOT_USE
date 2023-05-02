package com.obwhatsapp.conversation.conversationrow.message;

import X.AnonymousClass02C;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14710pd;
import X.C15830rv;
import X.C15860rz;
import X.C16150sX;
import X.C16620tM;
import X.C18070w6;
import X.C18940xV;
import X.C45692Af;
import X.C49132Rg;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.data.IDxMObserverShape75S0100000_2_I1;
import com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;

public class KeptMessagesActivity extends C45692Af {
    public ProgressBar A00;
    public ScrollView A01;
    public WaTextView A02;
    public C18070w6 A03;
    public boolean A04;
    public final C18940xV A05;

    public KeptMessagesActivity() {
        this(0);
        this.A05 = new IDxMObserverShape75S0100000_2_I1(this, 1);
    }

    public KeptMessagesActivity(int i2) {
        this.A04 = false;
        C13680ns.A1G(this, 55);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0e(A1T, r1, this);
            C14530pL.A0d(A1T, r1, this);
            this.A03 = C16150sX.A0j(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00f6, code lost:
        if (r0 == false) goto L_0x00f8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            r0 = 2131889134(0x7f120bee, float:1.9412923E38)
            r9.setTitle(r0)
            X.2DF r0 = r9.A00
            X.0xq r1 = r0.A0S
            X.0xV r0 = r9.A05
            r1.A02(r0)
            X.0w6 r4 = r9.A03
            X.0rv r5 = r9.A0J
            X.AnonymousClass00B.A06(r5)
            android.content.Intent r3 = r9.getIntent()
            java.lang.String r2 = "keptMessageCount"
            r0 = 0
            long r7 = r3.getLongExtra(r2, r0)
            X.2JJ r3 = new X.2JJ
            r3.<init>()
            java.lang.Integer r0 = X.C13680ns.A0a()
            r3.A04 = r0
            r6 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r3.A06 = r0
            X.0rt r1 = r4.A04
            X.0sG r0 = r4.A02
            int r0 = X.C40491uD.A00(r0, r1, r5)
            java.lang.Long r0 = X.C13690nt.A0W(r0)
            r3.A08 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r3.A0C = r0
            boolean r0 = X.C16030sJ.A0L(r5)
            if (r0 == 0) goto L_0x00ff
            X.0sO r2 = r4.A05
            r0 = r5
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r1 = r2.A09(r0)
            boolean r0 = r2.A0A(r0)
            if (r1 == 0) goto L_0x00fc
            if (r0 == 0) goto L_0x00fc
        L_0x0062:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r3.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x006a:
            r3.A01 = r0
            X.0w3 r1 = r4.A07
            java.lang.String r0 = r5.getRawString()
            java.lang.String r0 = r1.A03(r0)
            r3.A0E = r0
            X.0t9 r0 = r4.A06
            r0.A06(r3)
            r0 = 2131559287(0x7f0d0377, float:1.8743914E38)
            r9.setContentView((int) r0)
            android.widget.ListView r4 = r9.ADA()
            r2 = 0
            r4.setFastScrollEnabled(r2)
            r0 = 1
            r4.setScrollbarFadingEnabled(r0)
            android.widget.AbsListView$OnScrollListener r0 = r9.A0Q
            r4.setOnScrollListener(r0)
            android.view.LayoutInflater r1 = r9.getLayoutInflater()
            r0 = 2131558815(0x7f0d019f, float:1.8742956E38)
            android.view.View r3 = r1.inflate(r0, r4, r2)
            r0 = 2131362980(0x7f0a04a4, float:1.8345756E38)
            android.widget.TextView r2 = X.C13680ns.A0M(r3, r0)
            if (r2 == 0) goto L_0x00c2
            X.0rv r1 = r9.A0J
            if (r1 == 0) goto L_0x00c2
            X.2DF r0 = r9.A00
            X.0sG r0 = r0.A07
            X.0sH r1 = r0.A08(r1)
            X.0rv r0 = r9.A0J
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 != 0) goto L_0x00ef
            r1 = 2131889142(0x7f120bf6, float:1.941294E38)
        L_0x00bf:
            X.C13690nt.A0s(r9, r2, r1)
        L_0x00c2:
            r4.addHeaderView(r3)
            X.2Ah r0 = r9.A07
            r9.A35(r0)
            r0 = 2131363439(0x7f0a066f, float:1.8346687E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r9.A01 = r0
            r0 = 2131365972(0x7f0a1054, float:1.8351824E38)
            android.view.View r0 = r9.findViewById(r0)
            com.obwhatsapp.WaTextView r0 = (com.obwhatsapp.WaTextView) r0
            r9.A02 = r0
            r0 = 2131365554(0x7f0a0eb2, float:1.8350977E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r9.A00 = r0
            r9.A37()
            return
        L_0x00ef:
            if (r1 == 0) goto L_0x00f8
            boolean r0 = r1.A0l
            r1 = 2131889141(0x7f120bf5, float:1.9412937E38)
            if (r0 != 0) goto L_0x00bf
        L_0x00f8:
            r1 = 2131889140(0x7f120bf4, float:1.9412935E38)
            goto L_0x00bf
        L_0x00fc:
            r6 = 0
            goto L_0x0062
        L_0x00ff:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.message.KeptMessagesActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        this.A00.A0S.A03(this.A05);
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        C14710pd r7 = this.A0C;
        C15860rz r6 = this.A09;
        AnonymousClass02C AGM = AGM();
        C15830rv r4 = this.A0J;
        if (r7.A0E(C16620tM.A02, 2005) && EphemeralDmKicBottomSheetDialog.A02(AGM, r6)) {
            EphemeralDmKicBottomSheetDialog.A01(AGM, r4, 4);
            EphemeralDmKicBottomSheetDialog.A0P = null;
        }
    }
}
