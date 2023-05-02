package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2oS  reason: invalid class name and case insensitive filesystem */
public class C56752oS extends BaseAdapter {
    public UserJid A00;
    public final int A01;
    public final /* synthetic */ MessageDetailsActivity A02;

    public C56752oS(MessageDetailsActivity messageDetailsActivity) {
        this.A02 = messageDetailsActivity;
        this.A01 = messageDetailsActivity.getResources().getInteger(17694721);
    }

    public static void A00(View view, C56752oS r4, int i2) {
        TranslateAnimation translateAnimation = new TranslateAnimation((float) i2, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration((long) r4.A01);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        view.startAnimation(translateAnimation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0342  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.view.View r31, int r32) {
        /*
            r30 = this;
            r29 = r30
            r0 = r29
            com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity r0 = r0.A02
            r28 = r0
            java.util.ArrayList r11 = r0.A0b
            r6 = r32
            java.lang.Object r3 = r11.get(r6)
            X.2Aj r3 = (X.AnonymousClass2Aj) r3
            r0 = 2131366005(0x7f0a1075, float:1.8351891E38)
            r4 = r31
            android.view.View r1 = r4.findViewById(r0)
            r13 = 13
            r12 = 5
            r14 = 1
            r9 = 0
            r8 = 8
            r7 = 0
            if (r32 == 0) goto L_0x02f7
            int r10 = r3.A00()
            int r0 = r32 + -1
            java.lang.Object r0 = r11.get(r0)
            X.2Aj r0 = (X.AnonymousClass2Aj) r0
            int r0 = r0.A00()
            if (r10 != r0) goto L_0x02f7
            X.40j r2 = r3.A02()
            r0 = r28
            X.0pd r0 = r0.A0C
            boolean r0 = com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity.A03(r2, r0)
            if (r0 != 0) goto L_0x02f7
            r1.setVisibility(r8)
        L_0x0048:
            r0 = 2131363227(0x7f0a059b, float:1.8346257E38)
            android.view.View r5 = r4.findViewById(r0)
            r0 = 2131362933(0x7f0a0475, float:1.834566E38)
            android.view.View r27 = r4.findViewById(r0)
            int r0 = r11.size()
            int r0 = r0 - r14
            if (r6 == r0) goto L_0x02ea
            int r0 = r32 + 1
            java.lang.Object r0 = r11.get(r0)
            X.2Aj r0 = (X.AnonymousClass2Aj) r0
            int r0 = r0.A00()
            if (r10 != r0) goto L_0x02ea
            r1 = 2131232260(0x7f080604, float:1.8080624E38)
            r0 = r27
            r0.setBackgroundResource(r1)
            r5.setVisibility(r7)
        L_0x0076:
            r0 = 2131362889(0x7f0a0449, float:1.8345571E38)
            android.widget.ImageView r1 = X.C13680ns.A0K(r4, r0)
            r16 = 2131362888(0x7f0a0448, float:1.834557E38)
            r0 = r28
            X.0sP r7 = r0.A08
            X.1Lc r5 = r0.A0P
            X.013 r0 = r0.A01
            X.1cU r11 = new X.1cU
            r12 = r4
            r13 = r7
            r14 = r0
            r15 = r5
            r11.<init>((android.view.View) r12, (X.C16080sP) r13, (X.AnonymousClass013) r14, (X.C25781Lc) r15, (int) r16)
            r0 = 2131365582(0x7f0a0ece, float:1.8351033E38)
            com.obwhatsapp.TextEmojiLabel r12 = X.C13680ns.A0R(r4, r0)
            r0 = 2131365720(0x7f0a0f58, float:1.8351313E38)
            android.widget.TextView r8 = X.C13680ns.A0M(r4, r0)
            r0 = 2131363062(0x7f0a04f6, float:1.8345922E38)
            android.view.View r9 = r4.findViewById(r0)
            r0 = 2131363071(0x7f0a04ff, float:1.834594E38)
            android.view.View r7 = r4.findViewById(r0)
            r0 = 2131363068(0x7f0a04fc, float:1.8345934E38)
            android.view.View r26 = r4.findViewById(r0)
            r0 = 2131363065(0x7f0a04f9, float:1.8345928E38)
            android.view.View r25 = X.C004601z.A0E(r4, r0)
            r0 = 2131363061(0x7f0a04f5, float:1.834592E38)
            android.widget.TextView r24 = X.C13680ns.A0M(r4, r0)
            r0 = 2131363070(0x7f0a04fe, float:1.8345938E38)
            android.widget.TextView r23 = X.C13680ns.A0M(r4, r0)
            r0 = 2131363067(0x7f0a04fb, float:1.8345932E38)
            android.widget.TextView r22 = X.C13680ns.A0M(r4, r0)
            r0 = 2131363064(0x7f0a04f8, float:1.8345926E38)
            android.widget.TextView r21 = X.C13680ns.A0L(r4, r0)
            r0 = 2131363063(0x7f0a04f7, float:1.8345924E38)
            android.view.View r20 = r4.findViewById(r0)
            r0 = 2131363072(0x7f0a0500, float:1.8345942E38)
            android.view.View r19 = r4.findViewById(r0)
            r0 = 2131363069(0x7f0a04fd, float:1.8345936E38)
            android.view.View r18 = r4.findViewById(r0)
            r0 = 2131363066(0x7f0a04fa, float:1.834593E38)
            android.view.View r17 = X.C004601z.A0E(r4, r0)
            r5 = 8
            r0 = r26
            X.C13690nt.A14(r9, r7, r0, r5)
            r14 = r25
            r13 = r19
            r0 = r20
            X.C13690nt.A14(r14, r0, r13, r5)
            r0 = r18
            r0.setVisibility(r5)
            r0 = r17
            r0.setVisibility(r5)
            X.40j r0 = X.C795740j.REMAINING
            if (r0 != r2) goto L_0x0144
            r0 = 0
            r8.setVisibility(r0)
            r1.setVisibility(r5)
            com.obwhatsapp.TextEmojiLabel r0 = r11.A02
            r0.setVisibility(r5)
            r12.setVisibility(r5)
            X.3oy r3 = (X.C73733oy) r3
            r0 = r28
            X.013 r6 = r0.A01
            r5 = 2131755263(0x7f1000ff, float:1.91414E38)
            int r3 = r3.A00
            long r1 = (long) r3
            java.lang.Object[] r0 = X.C13680ns.A1b()
            X.AnonymousClass000.A1K(r0, r3)
            java.lang.String r0 = r6.A0J(r0, r5, r1)
            r8.setText(r0)
            r2 = 0
            r4.setTag(r2)
        L_0x013e:
            r0 = r27
            r0.setOnClickListener(r2)
            return
        L_0x0144:
            r0 = r28
            X.0sG r5 = r0.A06
            com.whatsapp.jid.UserJid r0 = r3.A01
            X.0sH r5 = r5.A0A(r0)
            r13 = r28
            X.0tZ r13 = r13.A0M
            X.1Vw r13 = r13.A11
            X.0rv r13 = r13.A00
            boolean r15 = X.C16030sJ.A0L(r13)
            r14 = 2
            r13 = 8
            if (r15 == 0) goto L_0x0160
            r14 = 1
        L_0x0160:
            r8.setVisibility(r13)
            r15 = 0
            r1.setVisibility(r15)
            r8 = r28
            X.2Ao r8 = r8.A0A
            r8.A08(r1, r5, r15)
            r8 = 0
            com.obwhatsapp.TextEmojiLabel r13 = r11.A02
            r13.setVisibility(r15)
            r1 = r28
            X.0pd r1 = r1.A0C
            boolean r1 = com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity.A03(r2, r1)
            if (r1 == 0) goto L_0x02e5
            r1 = r28
            X.0sK r1 = r1.A01
            r1.A0B()
            X.1ZT r1 = r1.A05
            boolean r0 = X.AnonymousClass000.A1Y(r0, r1)
            r16 = 0
            if (r0 == 0) goto L_0x02d1
            android.content.Context r1 = r11.A00
            r0 = 2131889148(0x7f120bfc, float:1.9412951E38)
            java.lang.String r15 = r1.getString(r0)
        L_0x0198:
            r0 = 256(0x100, float:3.59E-43)
            r1 = r16
            r13.A0H(r15, r1, r0, r8)
            boolean r0 = r5.A0L()
            r11.A07(r0)
        L_0x01a6:
            r0 = r28
            X.0sP r0 = r0.A08
            boolean r0 = r0.A0S(r5, r14)
            if (r0 == 0) goto L_0x02ca
            boolean r0 = r5.A0H()
            if (r0 != 0) goto L_0x02b8
            java.lang.String r0 = r5.A0W
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02b8
        L_0x01be:
            r12.setVisibility(r8)
            r0 = r28
            X.0sP r0 = r0.A08
            java.lang.String r1 = r0.A0F(r5)
            r0 = 0
            r12.A0I(r0, r1)
        L_0x01cd:
            X.0rv r1 = r5.A0E
            r0 = r29
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0267
            r0 = 5
            long r0 = r3.A01(r0)
            r12 = 0
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x01f3
            r11 = r24
            r10 = r28
            X.C14530pL.A0X(r11, r10, r0)
            r9.setVisibility(r8)
            r0 = r20
            r0.setVisibility(r8)
        L_0x01f3:
            r0 = 13
            long r0 = r3.A01(r0)
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x020c
            r10 = r23
            r9 = r28
            X.C14530pL.A0X(r10, r9, r0)
            r7.setVisibility(r8)
            r0 = r19
            r0.setVisibility(r8)
        L_0x020c:
            r0 = 8
            long r0 = r3.A01(r0)
            int r7 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0227
            r9 = r22
            r7 = r28
            X.C14530pL.A0X(r9, r7, r0)
            r0 = r26
            r0.setVisibility(r8)
            r0 = r18
            r0.setVisibility(r8)
        L_0x0227:
            r0 = r28
            X.0pd r0 = r0.A0C
            boolean r0 = com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity.A03(r2, r0)
            if (r0 == 0) goto L_0x0258
            X.3ox r3 = (X.AnonymousClass3ox) r3
            long r0 = r3.A00
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0258
            r2 = r28
            X.0pd r7 = r2.A0C
            r3 = 1352(0x548, float:1.895E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r7.A0E(r2, r3)
            if (r2 == 0) goto L_0x0258
            r3 = r21
            r2 = r28
            X.C14530pL.A0X(r3, r2, r0)
            r0 = r25
            r0.setVisibility(r8)
        L_0x0253:
            r0 = r17
            r0.setVisibility(r8)
        L_0x0258:
            X.0rv r0 = r5.A0E
            r4.setTag(r0)
            r1 = 2
            com.facebook.redex.ViewOnClickCListenerShape2S0201000_I1 r2 = new com.facebook.redex.ViewOnClickCListenerShape2S0201000_I1
            r0 = r29
            r2.<init>(r0, r6, r4, r1)
            goto L_0x013e
        L_0x0267:
            r0 = 5
            if (r10 == r0) goto L_0x02a9
            r0 = 8
            if (r10 == r0) goto L_0x0298
            r0 = 13
            if (r10 != r0) goto L_0x0280
            long r0 = r3.A01(r0)
            r10 = r23
            r9 = r28
            X.C14530pL.A0X(r10, r9, r0)
            r7.setVisibility(r8)
        L_0x0280:
            r0 = r28
            X.0pd r0 = r0.A0C
            boolean r0 = com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity.A03(r2, r0)
            if (r0 == 0) goto L_0x0258
            X.3ox r3 = (X.AnonymousClass3ox) r3
            long r1 = r3.A00
            r3 = r21
            r0 = r28
            X.C14530pL.A0X(r3, r0, r1)
            r17 = r25
            goto L_0x0253
        L_0x0298:
            long r0 = r3.A01(r0)
            r9 = r22
            r7 = r28
            X.C14530pL.A0X(r9, r7, r0)
            r0 = r26
            r0.setVisibility(r8)
            goto L_0x0280
        L_0x02a9:
            long r0 = r3.A01(r0)
            r10 = r24
            r7 = r28
            X.C14530pL.A0X(r10, r7, r0)
            r9.setVisibility(r8)
            goto L_0x0280
        L_0x02b8:
            boolean r0 = r5.A0H()
            if (r0 == 0) goto L_0x02ca
            java.lang.String r0 = r5.A0B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02ca
            goto L_0x01be
        L_0x02ca:
            r0 = 8
            r12.setVisibility(r0)
            goto L_0x01cd
        L_0x02d1:
            boolean r1 = r5.A0L()
            X.0sP r0 = r11.A03
            if (r1 == 0) goto L_0x02df
            java.lang.String r15 = r0.A0I(r5, r15)
            goto L_0x0198
        L_0x02df:
            java.lang.String r15 = r0.A0G(r5, r14, r15)
            goto L_0x0198
        L_0x02e5:
            r11.A0B(r5, r14)
            goto L_0x01a6
        L_0x02ea:
            r1 = 2131232258(0x7f080602, float:1.808062E38)
            r0 = r27
            r0.setBackgroundResource(r1)
            r5.setVisibility(r8)
            goto L_0x0076
        L_0x02f7:
            r1.setVisibility(r7)
            r0 = 2131366009(0x7f0a1079, float:1.83519E38)
            android.widget.TextView r5 = X.C13680ns.A0M(r4, r0)
            r0 = 2131366006(0x7f0a1076, float:1.8351893E38)
            android.widget.TextView r1 = X.C13680ns.A0M(r4, r0)
            int r10 = r3.A00()
            if (r10 == r12) goto L_0x0393
            if (r10 == r8) goto L_0x037d
            if (r10 != r13) goto L_0x0334
            r0 = r28
            X.0tZ r0 = r0.A0M
            byte r0 = r0.A10
            if (r0 != 0) goto L_0x0370
            r2 = 2131889489(0x7f120d51, float:1.9413643E38)
        L_0x031d:
            r5.setText(r2)
            android.content.Context r13 = r4.getContext()
            java.lang.String r12 = "msg_status_client"
            int r12 = com.obwhatsapp.yo.yo.getBubbleTick(r12)
            r0 = 2131101017(0x7f060559, float:1.7814432E38)
        L_0x032d:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A02(r13, r12, r0)
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r9, r9, r9)
        L_0x0334:
            X.40j r2 = r3.A02()
            r0 = r28
            X.0pd r0 = r0.A0C
            boolean r0 = com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity.A03(r2, r0)
            if (r0 == 0) goto L_0x0048
            r0 = r28
            X.0tZ r0 = r0.A0M
            X.1s4 r12 = r0.A1A
            r0 = r28
            com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity.A02(r0, r12)
            X.0tz r0 = r0.A0G
            android.content.res.Resources r12 = X.C16980tz.A00(r0)
            r0 = 2131889146(0x7f120bfa, float:1.9412947E38)
            java.lang.String r0 = r12.getString(r0)
            r13 = 2131231414(0x7f0802b6, float:1.8078908E38)
            r12 = 2131100882(0x7f0604d2, float:1.7814158E38)
            r5.setText(r0)
            android.content.Context r0 = r4.getContext()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A02(r0, r13, r12)
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r9, r9, r9)
            goto L_0x0048
        L_0x0370:
            boolean r0 = X.C30921dB.A00(r0)
            r2 = 2131889492(0x7f120d54, float:1.941365E38)
            if (r0 == 0) goto L_0x031d
            r2 = 2131889493(0x7f120d55, float:1.9413651E38)
            goto L_0x031d
        L_0x037d:
            r0 = r28
            X.0tZ r0 = r0.A0M
            X.4Zr r2 = X.C88044Zr.A00(r0, r7)
            int r0 = r2.A02
            r5.setText(r0)
            android.content.Context r13 = r4.getContext()
            int r12 = r2.A01
            int r0 = r2.A00
            goto L_0x032d
        L_0x0393:
            r0 = 2131889463(0x7f120d37, float:1.941359E38)
            r5.setText(r0)
            android.content.Context r13 = r4.getContext()
            java.lang.String r12 = "msg_status_client"
            int r12 = com.obwhatsapp.yo.yo.getBubbleTick(r12)
            r0 = 2131101018(0x7f06055a, float:1.7814434E38)
            goto L_0x032d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56752oS.A01(android.view.View, int):void");
    }

    public final void A02(View view, int i2, boolean z2) {
        int i3;
        AlphaAnimation alphaAnimation;
        MessageDetailsActivity messageDetailsActivity = this.A02;
        int i4 = i2;
        AnonymousClass2Aj r1 = (AnonymousClass2Aj) messageDetailsActivity.A0b.get(i4);
        View view2 = view;
        View findViewById = view2.findViewById(R.id.date_time_delivered);
        View findViewById2 = view2.findViewById(R.id.date_time_read);
        View findViewById3 = view2.findViewById(R.id.date_time_played);
        View A0E = C004601z.A0E(view2, R.id.date_time_delivered_label);
        TextView A0L = C13680ns.A0L(view2, R.id.date_time_read_label);
        TextView A0L2 = C13680ns.A0L(view2, R.id.date_time_played_label);
        View findViewById4 = view2.findViewById(R.id.date_time_delivered_group);
        View findViewById5 = view2.findViewById(R.id.date_time_read_group);
        View findViewById6 = view2.findViewById(R.id.date_time_played_group);
        byte b2 = messageDetailsActivity.A0M.A10;
        if (b2 == 0) {
            i3 = R.string.str0d50;
        } else {
            boolean A002 = C30921dB.A00(b2);
            i3 = R.string.str0d53;
            if (A002) {
                i3 = R.string.str0d57;
            }
        }
        A0L.setText(i3);
        A0L2.setText(C88044Zr.A00(messageDetailsActivity.A0M, true).A02);
        ArrayList A0i = C13690nt.A0i(6);
        int A003 = r1.A00();
        if (A003 == 5) {
            A0i.add(A0E);
            if (C13680ns.A1Z(messageDetailsActivity.A01)) {
                A00(findViewById, this, z2 ? findViewById.getWidth() - findViewById4.getWidth() : A0E.getWidth());
            }
        } else if (A003 == 8) {
            C13700nu.A0Y(A0L2, findViewById5, A0L, A0i);
            A0i.add(findViewById4);
            A0i.add(A0E);
            if (C13680ns.A1Z(messageDetailsActivity.A01)) {
                A00(findViewById3, this, z2 ? findViewById3.getWidth() - findViewById6.getWidth() : A0L2.getWidth());
            }
        } else if (A003 == 13) {
            C13700nu.A0Y(A0L, findViewById4, A0E, A0i);
            if (C13680ns.A1Z(messageDetailsActivity.A01)) {
                A00(findViewById2, this, z2 ? findViewById2.getWidth() - findViewById5.getWidth() : A0L.getWidth());
            }
        }
        Iterator it = A0i.iterator();
        while (it.hasNext()) {
            View view3 = (View) it.next();
            if (!z2) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            int i5 = this.A01;
            alphaAnimation.setDuration((long) i5);
            alphaAnimation.setStartOffset((long) (((float) i5) * 0.0f));
            view3.startAnimation(alphaAnimation);
        }
        View findViewById7 = view2.findViewById(R.id.timestamps);
        int height = findViewById7.getHeight();
        A01(view2, i4);
        findViewById7.measure(View.MeasureSpec.makeMeasureSpec(findViewById7.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = findViewById7.getMeasuredHeight();
        findViewById7.getLayoutParams().height = height;
        AnonymousClass3NW r2 = new AnonymousClass3NW(findViewById7, this, height, measuredHeight);
        r2.setDuration((long) this.A01);
        findViewById7.startAnimation(r2);
    }

    public int getCount() {
        return this.A02.A0b.size();
    }

    public Object getItem(int i2) {
        return this.A02.A0b.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = C13680ns.A0H(this.A02.getLayoutInflater(), viewGroup, R.layout.layout03ea);
        }
        A01(view, i2);
        return view;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }
}
