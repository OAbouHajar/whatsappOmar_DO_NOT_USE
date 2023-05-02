package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxConsumerShape54S0000000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.components.InviteViaLinkView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3R6  reason: invalid class name */
public class AnonymousClass3R6 extends AnonymousClass01X {
    public AnonymousClass04N A00 = new IDxConsumerShape54S0000000_2_I1(0);
    public C86954Uu A01;
    public final C16040sK A02;
    public final C211212w A03;
    public final AnonymousClass4TS A04 = new AnonymousClass4TS(0, (Object) null);
    public final AnonymousClass4TS A05 = new AnonymousClass4TS(1, (Object) null);
    public final AnonymousClass4SD A06;
    public final C17160ud A07;
    public final C16080sP A08;
    public final AnonymousClass2Ao A09;
    public final AnonymousClass013 A0A;
    public final C16050sL A0B;
    public final C25781Lc A0C;
    public final List A0D;

    public AnonymousClass3R6(C16040sK r4, C211212w r5, AnonymousClass4SD r6, C17160ud r7, C16080sP r8, AnonymousClass2Ao r9, AnonymousClass013 r10, C16050sL r11, C25781Lc r12) {
        this.A03 = r5;
        this.A02 = r4;
        this.A07 = r7;
        this.A0A = r10;
        this.A08 = r8;
        this.A09 = r9;
        this.A0C = r12;
        this.A0B = r11;
        this.A06 = r6;
        this.A0D = AnonymousClass000.A0u();
    }

    public int A0C() {
        return this.A0D.size();
    }

    public long A0D(int i2) {
        List list = this.A0D;
        int i3 = ((AnonymousClass4TS) list.get(i2)).A00;
        if (i3 == 2) {
            Object obj = ((AnonymousClass4TS) list.get(i2)).A01;
            AnonymousClass00B.A06(obj);
            i3 = ((C86954Uu) obj).A03.hashCode();
        }
        return (long) i3;
    }

    public void A0E(C34641kb r7) {
        boolean z2;
        int i2;
        ArrayList A0u = AnonymousClass000.A0u();
        C86954Uu r0 = this.A01;
        if (r0 == null || !((i2 = r0.A01) == 1 || i2 == 2)) {
            z2 = false;
        } else {
            z2 = true;
            A0u.add(this.A04);
        }
        C28031Ub it = r7.iterator();
        while (it.hasNext()) {
            A0u.add(new AnonymousClass4TS(2, it.next()));
        }
        if (!z2) {
            A0u.add(this.A05);
        }
        List list = this.A0D;
        AnonymousClass07C A002 = AnonymousClass07B.A00(new AnonymousClass3QT(this, list, A0u));
        list.clear();
        list.addAll(A0u);
        A002.A02(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if ((r1 ^ r4) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        if (r2 != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0097, code lost:
        r1 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r6.A02.A0I(r7.A03) == false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ANf(X.C005602k r12, int r13) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C64983Sk
            if (r0 == 0) goto L_0x00be
            X.3Sk r12 = (X.C64983Sk) r12
            java.util.List r0 = r11.A0D
            java.lang.Object r0 = r0.get(r13)
            X.4TS r0 = (X.AnonymousClass4TS) r0
            java.lang.Object r7 = r0.A01
            X.4Uu r7 = (X.C86954Uu) r7
            X.4Uu r3 = r11.A01
            X.4SD r6 = r11.A06
            X.04N r5 = r11.A00
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0027
            X.0sK r1 = r6.A02
            com.whatsapp.jid.UserJid r0 = r7.A03
            boolean r0 = r1.A0I(r0)
            r8 = 0
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r8 = 1
        L_0x0028:
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0042
            int r1 = r7.A01
            r4 = 1
            if (r1 == r4) goto L_0x0035
            r0 = 2
            if (r1 == r0) goto L_0x0035
            r4 = 0
        L_0x0035:
            int r2 = r7.A00
            r1 = 1
            if (r2 == r1) goto L_0x003e
            r0 = 2
            if (r2 == r0) goto L_0x003e
            r1 = 0
        L_0x003e:
            r1 = r1 ^ r4
            r2 = 1
            if (r1 != 0) goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r8 == 0) goto L_0x004f
            android.view.ViewGroup r1 = r12.A00
            X.4kK r0 = new X.4kK
            r0.<init>(r12, r7, r6)
            r1.setOnCreateContextMenuListener(r0)
        L_0x004f:
            android.view.ViewGroup r1 = r12.A00
            if (r8 != 0) goto L_0x0056
            r0 = 0
            if (r2 == 0) goto L_0x0057
        L_0x0056:
            r0 = 1
        L_0x0057:
            r1.setClickable(r0)
            if (r2 == 0) goto L_0x00f2
            r0 = 35
            X.C13680ns.A1B(r1, r5, r7, r0)
        L_0x0061:
            r0 = 2131232418(0x7f0806a2, float:1.8080945E38)
        L_0x0064:
            r1.setBackgroundResource(r0)
            X.0sK r0 = r12.A03
            com.whatsapp.jid.UserJid r2 = r7.A03
            boolean r0 = r0.A0I(r2)
            if (r0 == 0) goto L_0x00df
            X.1cU r0 = r12.A06
            r0.A03()
            com.obwhatsapp.TextEmojiLabel r1 = r12.A05
            X.12w r0 = r12.A04
            java.lang.String r0 = r0.A00()
        L_0x007e:
            r1.A0G(r0)
            X.0sH r2 = r7.A02
            if (r2 == 0) goto L_0x00d4
            X.2Ao r1 = r12.A09
            android.widget.ImageView r0 = r12.A01
            r1.A06(r0, r2)
        L_0x008c:
            android.widget.ImageView r10 = r12.A02
            r9 = 8
            r10.setVisibility(r9)
            r8 = 1
            r6 = 0
            if (r3 == 0) goto L_0x00d2
            int r1 = r3.A01
            if (r1 == r8) goto L_0x009e
            r0 = 2
            if (r1 != r0) goto L_0x00d2
        L_0x009e:
            r5 = 1
        L_0x009f:
            int r4 = r7.A01
            r3 = 1
            if (r4 == r8) goto L_0x00a8
            r0 = 2
            if (r4 == r0) goto L_0x00a8
            r3 = 0
        L_0x00a8:
            int r2 = r7.A00
            r1 = 1
            if (r2 == r8) goto L_0x00b1
            r0 = 2
            if (r2 == r0) goto L_0x00b1
            r1 = 0
        L_0x00b1:
            r3 = r3 ^ r1
            if (r5 == 0) goto L_0x00bf
            if (r3 == 0) goto L_0x00bf
            r10.setVisibility(r6)
        L_0x00b9:
            com.obwhatsapp.WaTextView r0 = r12.A07
            r0.setVisibility(r9)
        L_0x00be:
            return
        L_0x00bf:
            if (r4 == 0) goto L_0x00b9
            com.obwhatsapp.WaTextView r1 = r12.A07
            r0 = 2131887338(0x7f1204ea, float:1.940928E38)
            if (r4 != r8) goto L_0x00cb
            r0 = 2131887329(0x7f1204e1, float:1.9409262E38)
        L_0x00cb:
            r1.setText(r0)
            r1.setVisibility(r6)
            return
        L_0x00d2:
            r5 = 0
            goto L_0x009f
        L_0x00d4:
            X.0ud r2 = r12.A08
            android.widget.ImageView r1 = r12.A01
            r0 = 2131230908(0x7f0800bc, float:1.8077882E38)
            r2.A05(r1, r0)
            goto L_0x008c
        L_0x00df:
            X.0sH r1 = r7.A02
            if (r1 != 0) goto L_0x00e8
            X.0sH r1 = new X.0sH
            r1.<init>(r2)
        L_0x00e8:
            X.1cU r0 = r12.A06
            r0.A0A(r1)
            com.obwhatsapp.TextEmojiLabel r1 = r12.A05
            java.lang.String r0 = r7.A04
            goto L_0x007e
        L_0x00f2:
            if (r8 == 0) goto L_0x00fa
            r0 = 3
            X.C13680ns.A17(r1, r12, r0)
            goto L_0x0061
        L_0x00fa:
            r0 = 2131101279(0x7f06065f, float:1.7814963E38)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3R6.ANf(X.02k, int):void");
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        InviteViaLinkView inviteViaLinkView;
        if (i2 == 2) {
            View A0H = C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout0113);
            C211212w r3 = this.A03;
            C16080sP r5 = this.A08;
            C16040sK r2 = this.A02;
            C17160ud r4 = this.A07;
            AnonymousClass013 r7 = this.A0A;
            return new C64983Sk(A0H, r2, r3, r4, r5, this.A09, r7, this.A0B, this.A0C);
        }
        if (i2 == 0) {
            C16050sL r32 = this.A0B;
            InviteViaLinkView inviteViaLinkView2 = (InviteViaLinkView) C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout0364);
            inviteViaLinkView2.setupOnClick(r32, (C14550pN) C19980zJ.A02(viewGroup), (C75893st) null);
            TextView A0M = C13680ns.A0M(inviteViaLinkView2, R.id.invite_via_link_text);
            inviteViaLinkView = inviteViaLinkView2;
            if (A0M != null) {
                A0M.setText(R.string.str04f4);
                inviteViaLinkView = inviteViaLinkView2;
            }
        } else {
            inviteViaLinkView = C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout0116);
        }
        return new AnonymousClass3RV(inviteViaLinkView);
    }

    public int getItemViewType(int i2) {
        return ((AnonymousClass4TS) this.A0D.get(i2)).A00;
    }
}
