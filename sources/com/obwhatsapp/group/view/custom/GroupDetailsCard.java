package com.obwhatsapp.group.view.custom;

import X.AnonymousClass013;
import X.AnonymousClass2DD;
import X.AnonymousClass2Sy;
import X.C003501o;
import X.C004601z;
import X.C011405n;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C16080sP;
import X.C17240ul;
import X.C17250um;
import X.C19980zJ;
import X.C204310c;
import X.C217915l;
import X.C25781Lc;
import X.C30521cU;
import X.C75893st;
import X.C798741r;
import X.C816549f;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.contact.view.custom.ContactDetailsActionIcon;
import com.obwhatsapp.group.GroupCallButtonController;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;

public class GroupDetailsCard extends AnonymousClass2DD implements C003501o {
    public View A00;
    public TextView A01;
    public TextView A02;
    public C19980zJ A03;
    public C16040sK A04;
    public C30521cU A05;
    public WaTextView A06;
    public C204310c A07;
    public C16000sG A08;
    public C16080sP A09;
    public ContactDetailsActionIcon A0A;
    public ContactDetailsActionIcon A0B;
    public ContactDetailsActionIcon A0C;
    public ContactDetailsActionIcon A0D;
    public AnonymousClass013 A0E;
    public C16070sO A0F;
    public C16010sH A0G;
    public C17250um A0H;
    public C75893st A0I;
    public C798741r A0J;
    public GroupCallButtonController A0K;
    public C17240ul A0L;
    public C217915l A0M;
    public C16050sL A0N;
    public C25781Lc A0O;

    public GroupDetailsCard(Context context) {
        super(context);
        A01();
    }

    public GroupDetailsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public GroupDetailsCard(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
    }

    public void A01() {
        LayoutInflater.from(getContext()).inflate(R.layout.layout02d4, this, true);
        this.A0C = (ContactDetailsActionIcon) C004601z.A0E(this, R.id.action_message);
        this.A00 = C004601z.A0E(this, R.id.action_add_person);
        this.A0B = (ContactDetailsActionIcon) C004601z.A0E(this, R.id.action_search_chat);
        this.A0A = (ContactDetailsActionIcon) C004601z.A0E(this, R.id.action_call);
        this.A0D = (ContactDetailsActionIcon) C004601z.A0E(this, R.id.action_videocall);
        this.A02 = (TextView) C004601z.A0E(this, R.id.group_subtitle);
        this.A01 = (TextView) C004601z.A0E(this, R.id.announcements_subtitle_number_of_participants);
        this.A06 = (WaTextView) C004601z.A0E(this, R.id.group_second_subtitle);
        this.A05 = new C30521cU((View) this, this.A09, this.A0E, this.A0O, (int) R.id.group_title);
        A03();
    }

    public final void A02() {
        ContactDetailsActionIcon contactDetailsActionIcon;
        int i2;
        Resources resources;
        int i3;
        GroupCallButtonController groupCallButtonController = this.A0K;
        if (groupCallButtonController != null) {
            groupCallButtonController.A02();
            GroupCallButtonController groupCallButtonController2 = this.A0K;
            this.A0J = groupCallButtonController2.A01();
            boolean A092 = groupCallButtonController2.A09();
            this.A0A.setEnabled(A092);
            this.A0D.setEnabled(A092);
            int[] iArr = C816549f.A00;
            int ordinal = this.A0J.ordinal();
            int i4 = iArr[ordinal];
            switch (ordinal) {
                case 2:
                    this.A0A.setVisibility(0);
                    this.A0D.setVisibility(8);
                    this.A0A.A00(R.drawable.ic_action_call, getResources().getString(this.A0K.A00()));
                    this.A0A.setEnabled(this.A0K.A08());
                    return;
                case 3:
                    this.A0A.setVisibility(0);
                    this.A0D.setVisibility(8);
                    contactDetailsActionIcon = this.A0A;
                    i2 = R.drawable.ic_action_new_call;
                    resources = getResources();
                    i3 = R.string.str0a3d;
                    break;
                default:
                    ContactDetailsActionIcon contactDetailsActionIcon2 = this.A0A;
                    if (i4 == 3) {
                        contactDetailsActionIcon2.setVisibility(0);
                        this.A0D.setVisibility(0);
                        contactDetailsActionIcon = this.A0A;
                        i2 = R.drawable.ic_action_call;
                        resources = getResources();
                        i3 = R.string.str054f;
                        break;
                    } else {
                        contactDetailsActionIcon2.setVisibility(8);
                        this.A0D.setVisibility(8);
                        return;
                    }
            }
            contactDetailsActionIcon.A00(i2, resources.getString(i3));
        }
    }

    public final void A03() {
        this.A0C.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 11));
        this.A0B.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3(this, 21));
        this.A0A.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3(this, 22));
        this.A0D.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3(this, 20));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0044, code lost:
        if (r7.A0L.A03(r8) != 1) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C16010sH r8, com.obwhatsapp.group.GroupCallButtonController r9, X.C16050sL r10, int r11, boolean r12) {
        /*
            r7 = this;
            r7.A0G = r8
            r7.A0K = r9
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r0 = r8.A08(r0)
            X.AnonymousClass00B.A06(r0)
            X.0sL r0 = (X.C16050sL) r0
            r7.A0N = r0
            X.0sP r0 = r7.A09
            java.lang.String r0 = r0.A08(r8)
            r7.setTitleText(r0)
            X.0ul r1 = r7.A0L
            X.0sL r0 = r7.A0N
            boolean r2 = r1.A0l(r0)
            X.0ul r1 = r7.A0L
            X.0sL r0 = r7.A0N
            boolean r0 = r1.A0n(r0)
            r5 = 8
            r6 = 1
            r4 = 0
            if (r2 == 0) goto L_0x00a2
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131886318(0x7f1200ee, float:1.9407211E38)
            java.lang.String r0 = r1.getString(r0)
            r7.setSubtitleText(r0)
            X.0ul r0 = r7.A0L
            int r0 = r0.A03(r8)
            if (r0 == r6) goto L_0x005c
        L_0x0046:
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131755171(0x7f1000a3, float:1.9141214E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r4] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r11, r1)
            r7.setSubtitleNumberOfParticipantsText(r0)
        L_0x005c:
            X.0sO r1 = r7.A0F
            X.0sL r0 = r7.A0N
            boolean r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x009c
            X.0ul r0 = r7.A0L
            boolean r0 = r0.A0f(r8)
            if (r0 != 0) goto L_0x009c
            X.15l r0 = r7.A0M
            boolean r0 = r0.A00(r8)
            if (r0 != 0) goto L_0x009c
            android.view.View r0 = r7.A00
            r0.setVisibility(r4)
        L_0x007b:
            com.obwhatsapp.contact.view.custom.ContactDetailsActionIcon r1 = r7.A0C
            r0 = 8
            if (r12 == 0) goto L_0x0082
            r0 = 0
        L_0x0082:
            r1.setVisibility(r0)
            com.obwhatsapp.contact.view.custom.ContactDetailsActionIcon r0 = r7.A0B
            if (r12 != 0) goto L_0x008a
            r5 = 0
        L_0x008a:
            r0.setVisibility(r5)
            r9.A06(r8)
            X.2DC r0 = new X.2DC
            r0.<init>(r7)
            r9.A07(r0)
            r7.A02()
            return
        L_0x009c:
            android.view.View r0 = r7.A00
            r0.setVisibility(r5)
            goto L_0x007b
        L_0x00a2:
            if (r0 == 0) goto L_0x00da
            X.0sO r1 = r7.A0F
            X.0sL r0 = r7.A0N
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x00da
            X.0sP r0 = r7.A09
            java.lang.String r3 = r0.A0J(r10)
            boolean r0 = X.AnonymousClass1ZW.A0E(r3)
            if (r0 != 0) goto L_0x00ce
            android.content.res.Resources r2 = r7.getResources()
            r1 = 2131891978(0x7f12170a, float:1.9418691E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r4] = r3
            java.lang.String r0 = r2.getString(r1, r0)
        L_0x00c9:
            r7.setSubtitleText(r0)
            goto L_0x0046
        L_0x00ce:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131891979(0x7f12170b, float:1.9418693E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x00c9
        L_0x00da:
            X.0ul r0 = r7.A0L
            boolean r0 = r0.A0f(r8)
            if (r0 == 0) goto L_0x00e9
            android.widget.TextView r0 = r7.A02
            r0.setVisibility(r5)
            goto L_0x005c
        L_0x00e9:
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131755178(0x7f1000aa, float:1.9141228E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r4] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r11, r1)
            r7.setSubtitleText(r0)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.group.view.custom.GroupDetailsCard.A04(X.0sH, com.obwhatsapp.group.GroupCallButtonController, X.0sL, int, boolean):void");
    }

    @OnLifecycleEvent(C011405n.ON_CREATE)
    public void onActivityCreated() {
        GroupCallButtonController groupCallButtonController = this.A0K;
        if (groupCallButtonController != null) {
            groupCallButtonController.A03();
        }
    }

    @OnLifecycleEvent(C011405n.ON_DESTROY)
    public void onActivityDestroyed() {
        GroupCallButtonController groupCallButtonController = this.A0K;
        if (groupCallButtonController != null) {
            groupCallButtonController.A04();
        }
    }

    public void setAddPersonOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setOnClickListener(onClickListener);
    }

    public void setGroupInfoLoggingEvent(C75893st r1) {
        this.A0I = r1;
    }

    public void setSecondSubtitleText(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        WaTextView waTextView = this.A06;
        if (isEmpty) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        this.A06.setText(str);
    }

    public void setSubtitleNumberOfParticipantsText(String str) {
        if (TextUtils.isEmpty(str) || this.A0L.A0f(this.A0G) || this.A0M.A00(this.A0G)) {
            this.A01.setVisibility(8);
            return;
        }
        this.A01.setVisibility(0);
        this.A01.setText(str);
    }

    public void setSubtitleText(String str) {
        this.A02.setText(str);
    }

    public void setTitleColor(int i2) {
        this.A05.A06(i2);
    }

    public void setTitleText(String str) {
        this.A05.A0E(AnonymousClass2Sy.A04(getContext(), this.A05.A01(), this.A0H, str, 0.9f));
    }
}
