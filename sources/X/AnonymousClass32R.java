package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.group.GroupChatInfoActivity;

/* renamed from: X.32R  reason: invalid class name */
public class AnonymousClass32R extends AnonymousClass4QH {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final C30521cU A06;
    public final AnonymousClass4EJ A07;
    public final /* synthetic */ GroupChatInfoActivity A08;

    public AnonymousClass32R(View view, AnonymousClass4EJ r12, GroupChatInfoActivity groupChatInfoActivity) {
        this.A08 = groupChatInfoActivity;
        View view2 = view;
        this.A06 = new C30521cU(view2, groupChatInfoActivity.A0f, groupChatInfoActivity.A08, groupChatInfoActivity.A1X, (int) R.id.name);
        this.A03 = C13680ns.A0Q(view, R.id.status);
        ImageView A0J = C13680ns.A0J(view, R.id.wdsProfilePicture);
        ImageView A0J2 = C13680ns.A0J(view, R.id.avatar);
        if (this.A08.A0C.A0E(C16620tM.A01, 1533)) {
            A0J.setVisibility(0);
            A0J2.setVisibility(8);
        } else {
            A0J.setVisibility(8);
            A0J2.setVisibility(0);
            A0J = A0J2;
        }
        this.A01 = A0J;
        this.A02 = C13680ns.A0L(view, R.id.owner);
        this.A05 = C13680ns.A0Q(view, R.id.secondary_name_view);
        this.A04 = C13680ns.A0Q(view, R.id.push_name_alternative);
        this.A00 = C004601z.A0E(view, R.id.group_chat_info_layout);
        this.A07 = r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007c, code lost:
        if (r15 == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0045, code lost:
        if (r1.A01.A0E(X.C16620tM.A02, 2904) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d4, code lost:
        if (r8 <= 0) goto L_0x01d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass2OF r21, X.AnonymousClass2XQ r22, java.util.ArrayList r23) {
        /*
            r20 = this;
            r12 = r21
            r14 = r20
            r14.A00 = r12
            android.widget.TextView r11 = r14.A02
            r10 = 8
            r11.setVisibility(r10)
            com.obwhatsapp.TextEmojiLabel r3 = r14.A05
            r3.setVisibility(r10)
            com.obwhatsapp.TextEmojiLabel r0 = r14.A04
            r18 = r0
            r0.setVisibility(r10)
            boolean r0 = r12 instanceof X.AnonymousClass2OE
            X.AnonymousClass00B.A0G(r0)
            X.2OE r12 = (X.AnonymousClass2OE) r12
            X.0sH r2 = r12.A00
            com.whatsapp.jid.Jid r13 = X.C16010sH.A03(r2)
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13
            com.obwhatsapp.group.GroupChatInfoActivity r9 = r14.A08
            X.0sK r0 = r9.A01
            boolean r17 = r0.A0I(r13)
            X.0wI r1 = r9.A0d
            X.0sL r0 = r9.A1M
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0047
            X.0pd r4 = r1.A01
            r1 = 2904(0xb58, float:4.07E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r4.A0E(r0, r1)
            r4 = 7
            if (r0 != 0) goto L_0x0048
        L_0x0047:
            r4 = 1
        L_0x0048:
            X.1cU r1 = r14.A06
            r8 = 0
            r1.A0E(r8)
            r0 = 2131100935(0x7f060507, float:1.7814265E38)
            X.C30521cU.A00(r9, r1, r0)
            com.obwhatsapp.TextEmojiLabel r7 = r14.A03
            r7.setText(r8)
            r0 = 2131100933(0x7f060505, float:1.7814261E38)
            X.C13680ns.A0v(r9, r7, r0)
            r6 = 0
            if (r17 == 0) goto L_0x014d
            r1.A03()
            X.2Ao r15 = r9.A0h
            X.0sK r0 = r9.A01
            r0.A0B()
            X.1Zb r0 = r0.A01
            X.AnonymousClass00B.A06(r0)
            android.widget.ImageView r5 = r14.A01
            r15.A06(r5, r0)
            r15 = 0
        L_0x0077:
            r0 = 7
            if (r4 != r0) goto L_0x007e
            r16 = 1
            if (r15 != 0) goto L_0x0080
        L_0x007e:
            r16 = 0
        L_0x0080:
            X.0sP r0 = r9.A0f
            boolean r0 = r0.A0S(r2, r4)
            if (r0 == 0) goto L_0x014a
            java.lang.String r0 = r2.A0W
            if (r0 == 0) goto L_0x014a
            if (r15 != 0) goto L_0x014a
            X.0sP r0 = r9.A0f
            java.lang.String r4 = r0.A0F(r2)
        L_0x0094:
            boolean r0 = r12 instanceof X.AnonymousClass2OD
            r19 = r23
            if (r0 == 0) goto L_0x00d9
            r0 = 1
            r5.setClickable(r0)
            if (r17 == 0) goto L_0x016b
            java.lang.String r1 = "me"
            android.view.View r0 = r14.A00
            com.obwhatsapp.yo.yo.SetMsgs(r1, r9, r0)
            X.12w r0 = r9.A0Q
            java.lang.String r0 = r0.A00()
            r7.A0I(r8, r0)
            X.0sO r1 = r9.A0C
            X.0sL r0 = r9.A1M
            boolean r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x00d1
            r11.setVisibility(r6)
            X.0rt r1 = r9.A09
            X.0sL r0 = r9.A1M
            int r2 = r1.A02(r0)
            r1 = 3
            r0 = 2131888684(0x7f120a2c, float:1.941201E38)
            if (r2 != r1) goto L_0x00ce
            r0 = 2131887329(0x7f1204e1, float:1.9409262E38)
        L_0x00ce:
            r11.setText(r0)
        L_0x00d1:
            r5.setOnClickListener(r8)
            r0 = 2
            X.C004601z.A0d(r5, r0)
        L_0x00d8:
            return
        L_0x00d9:
            boolean r0 = r12 instanceof X.AnonymousClass2OK
            X.AnonymousClass00B.A0G(r0)
            X.2OK r12 = (X.AnonymousClass2OK) r12
            X.013 r11 = r9.A08
            long r2 = r12.A00
            boolean r10 = r12.A01
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = X.C42681yF.A00(r0, r2)
            java.lang.String r14 = X.C47672Jx.A00(r11, r2)
            r12 = 1
            if (r0 != 0) goto L_0x0134
            r13 = 2131889962(0x7f120f2a, float:1.9414602E38)
        L_0x00f8:
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r6] = r14
        L_0x00fc:
            java.lang.String r0 = r9.getString(r13, r1)
            java.lang.String r2 = X.C47672Jx.A01(r11, r0, r2)
            if (r17 == 0) goto L_0x012b
            r1 = 2131889965(0x7f120f2d, float:1.9414608E38)
            if (r10 == 0) goto L_0x010e
            r1 = 2131889964(0x7f120f2c, float:1.9414606E38)
        L_0x010e:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r0 = X.C13680ns.A0d(r9, r2, r0, r6, r1)
            r5.setClickable(r6)
            r7.setVisibility(r6)
            r7.A0I(r8, r0)
            if (r4 == 0) goto L_0x00d8
            r0 = r18
            r0.setVisibility(r6)
            r1 = r0
            r0 = r19
            r1.A0I(r0, r4)
            return
        L_0x012b:
            r1 = 2131889960(0x7f120f28, float:1.9414598E38)
            if (r10 == 0) goto L_0x010e
            r1 = 2131889959(0x7f120f27, float:1.9414596E38)
            goto L_0x010e
        L_0x0134:
            if (r0 != r12) goto L_0x013a
            r13 = 2131889963(0x7f120f2b, float:1.9414604E38)
            goto L_0x00f8
        L_0x013a:
            java.lang.String r0 = X.C28891Zc.A05(r11, r2)
            r13 = 2131889961(0x7f120f29, float:1.94146E38)
            java.lang.Object[] r1 = X.C13690nt.A1Z()
            r1[r6] = r0
            r1[r12] = r14
            goto L_0x00fc
        L_0x014a:
            r4 = r8
            goto L_0x0094
        L_0x014d:
            X.0sP r0 = r9.A0f
            X.0sQ r5 = r0.A04(r2, r4)
            boolean r0 = r2.A0L()
            r1.A08(r5, r8, r4, r0)
            X.1uQ r5 = r5.A00
            X.1uQ r0 = X.C40621uQ.PUSH_NAME
            boolean r15 = X.AnonymousClass000.A1Y(r5, r0)
            X.2Ao r0 = r9.A0h
            android.widget.ImageView r5 = r14.A01
            r0.A06(r5, r2)
            goto L_0x0077
        L_0x016b:
            android.view.View r8 = r14.A00
            r0 = 2131886104(0x7f120018, float:1.9406777E38)
            X.AnonymousClass2JP.A03(r8, r0)
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0o()
            X.2hp r12 = new X.2hp
            r12.<init>(r9)
            r0 = 2131893713(0x7f121dd1, float:1.942221E38)
            java.lang.String r0 = r12.A00(r0)
            r8.append(r0)
            java.lang.String r0 = X.C16030sJ.A03(r13)
            android.view.View r12 = r14.A00
            com.obwhatsapp.yo.yo.SetMsgs(r0, r9, r12)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r8)
            X.C004601z.A0n(r5, r0)
            r0 = 40
            X.C34331k5.A04(r5, r14, r13, r0)
            boolean r0 = r5 instanceof com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto
            r8 = r22
            if (r0 == 0) goto L_0x01c7
            r0 = r5
            com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = (com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto) r0
            r17 = r0
            r12 = 0
            if (r22 == 0) goto L_0x01c2
            int r14 = r8.A01
            if (r14 <= 0) goto L_0x01f4
            X.42X r0 = X.AnonymousClass42X.A03
        L_0x01af:
            X.3zx r15 = new X.3zx
            r15.<init>(r0)
            r0 = r17
            r0.setProfileStatus(r15)
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x01c2
            if (r14 <= 0) goto L_0x01c2
            r12 = 1
        L_0x01c2:
            r0 = r17
            r0.setStatusIndicatorEnabled(r12)
        L_0x01c7:
            if (r22 == 0) goto L_0x01d6
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x01d6
            int r8 = r8.A01
            r0 = 2131886108(0x7f12001c, float:1.9406786E38)
            if (r8 > 0) goto L_0x01d9
        L_0x01d6:
            r0 = 2131886107(0x7f12001b, float:1.9406784E38)
        L_0x01d9:
            X.AnonymousClass2JP.A03(r5, r0)
            X.2O9 r0 = r9.A1A
            boolean r0 = r0.A06(r13)
            if (r0 == 0) goto L_0x01f7
            r0 = 2131100088(0x7f0601b8, float:1.7812548E38)
            X.C30521cU.A00(r9, r1, r0)
            X.C13680ns.A0v(r9, r7, r0)
            r0 = 2131892104(0x7f121788, float:1.9418947E38)
            r7.setText(r0)
            return
        L_0x01f4:
            X.42X r0 = X.AnonymousClass42X.A02
            goto L_0x01af
        L_0x01f7:
            X.0sO r1 = r9.A0C
            X.0sL r0 = r9.A1M
            X.AnonymousClass00B.A06(r13)
            boolean r0 = r1.A0F(r0, r13)
            if (r0 == 0) goto L_0x021b
            r11.setVisibility(r6)
            X.0rt r1 = r9.A09
            X.0sL r0 = r9.A1M
            int r5 = r1.A02(r0)
            r1 = 3
            r0 = 2131888684(0x7f120a2c, float:1.941201E38)
            if (r5 != r1) goto L_0x0218
            r0 = 2131887329(0x7f1204e1, float:1.9409262E38)
        L_0x0218:
            r11.setText(r0)
        L_0x021b:
            if (r16 == 0) goto L_0x023d
            r3.setVisibility(r6)
            X.013 r1 = r9.A08
            java.lang.String r0 = X.C24561Gk.A01(r2)
            java.lang.String r4 = r1.A0H(r0)
        L_0x022a:
            r0 = r19
            r3.A0I(r0, r4)
        L_0x022f:
            java.lang.String r0 = r2.A0T
            if (r0 == 0) goto L_0x0243
            r7.setVisibility(r6)
            java.lang.String r1 = r2.A0T
            r0 = 0
            r7.A0I(r0, r1)
            return
        L_0x023d:
            if (r4 == 0) goto L_0x022f
            r3.setVisibility(r6)
            goto L_0x022a
        L_0x0243:
            r7.setVisibility(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32R.A00(X.2OF, X.2XQ, java.util.ArrayList):void");
    }
}
