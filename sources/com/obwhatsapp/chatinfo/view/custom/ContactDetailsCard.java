package com.obwhatsapp.chatinfo.view.custom;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass023;
import X.AnonymousClass1M5;
import X.AnonymousClass1VN;
import X.AnonymousClass1ZX;
import X.AnonymousClass2X0;
import X.AnonymousClass2X1;
import X.AnonymousClass3MF;
import X.AnonymousClass3Q5;
import X.C004601z;
import X.C006602z;
import X.C14530pL;
import X.C14710pd;
import X.C14870pt;
import X.C16010sH;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16300so;
import X.C16760tb;
import X.C17110uY;
import X.C17270uo;
import X.C18090w8;
import X.C18290wS;
import X.C19980zJ;
import X.C204310c;
import X.C218315p;
import X.C224818c;
import X.C25781Lc;
import X.C30681cm;
import X.C49132Rg;
import X.C50622aA;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C55482jg;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.contact.view.custom.ContactDetailsActionIcon;
import com.obwhatsapp.pnh.RequestPhoneNumberViewModel;

public class ContactDetailsCard extends LinearLayout implements AnonymousClass006 {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public C19980zJ A0A;
    public C16300so A0B;
    public C50622aA A0C;
    public C16040sK A0D;
    public TextEmojiLabel A0E;
    public C16760tb A0F;
    public C14530pL A0G;
    public C204310c A0H;
    public C224818c A0I;
    public C16080sP A0J;
    public ContactDetailsActionIcon A0K;
    public ContactDetailsActionIcon A0L;
    public ContactDetailsActionIcon A0M;
    public AnonymousClass013 A0N;
    public C16010sH A0O;
    public C14710pd A0P;
    public C55482jg A0Q;
    public AnonymousClass1VN A0R;
    public AnonymousClass1M5 A0S;
    public C218315p A0T;
    public AnonymousClass2X0 A0U;
    public RequestPhoneNumberViewModel A0V;
    public C25781Lc A0W;
    public C17110uY A0X;
    public AnonymousClass01D A0Y;
    public C52662eE A0Z;
    public boolean A0a;
    public boolean A0b;
    public final AnonymousClass023 A0c;

    public ContactDetailsCard(Context context) {
        super(context);
        A01();
        this.A0c = new IDxObserverShape115S0100000_2_I0((Object) this, 104);
    }

    public ContactDetailsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A0c = new IDxObserverShape115S0100000_2_I0((Object) this, 104);
    }

    public ContactDetailsCard(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
        this.A0c = new IDxObserverShape115S0100000_2_I0((Object) this, 104);
    }

    public ContactDetailsCard(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public static /* synthetic */ void A00(ContactDetailsCard contactDetailsCard, AnonymousClass2X1 r7) {
        boolean z2 = !r7.A03;
        boolean z3 = r7.A04;
        Uri uri = r7.A00;
        int i2 = 0;
        if (z2) {
            contactDetailsCard.A0M.setVisibility(0);
            contactDetailsCard.A0M.setEnabled(!z3);
            ContactDetailsActionIcon contactDetailsActionIcon = contactDetailsCard.A0M;
            int i3 = R.string.str12b5;
            if (z3) {
                i3 = R.string.str12b6;
            }
            contactDetailsActionIcon.setTitle(i3);
            contactDetailsCard.A01.setVisibility(8);
            contactDetailsCard.A03.setVisibility(0);
            contactDetailsCard.setPhoneHiddenBubbleText(uri);
            return;
        }
        contactDetailsCard.A03.setVisibility(8);
        contactDetailsCard.A0M.setVisibility(8);
        View view = contactDetailsCard.A01;
        if (!contactDetailsCard.A03()) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    private void setPhoneHiddenBubbleText(Uri uri) {
        this.A09.setText(this.A0X.A04(getResources().getString(R.string.str12b2, new Object[]{uri.toString()})), TextView.BufferType.SPANNABLE);
        this.A09.setMovementMethod(new AnonymousClass3MF());
    }

    public void A01() {
        if (!this.A0a) {
            this.A0a = true;
            C52652eD r1 = (C52652eD) ((C52642eC) generatedComponent());
            C16150sX r2 = r1.A07;
            this.A0P = (C14710pd) r2.A05.get();
            this.A0B = (C16300so) r2.A5p.get();
            this.A0X = (C17110uY) r2.ADT.get();
            this.A0D = (C16040sK) r2.ADr.get();
            this.A0F = (C16760tb) r2.APV.get();
            this.A0H = (C204310c) r2.A3O.get();
            this.A0A = (C19980zJ) r2.A0P.get();
            this.A0T = (C218315p) r2.AIL.get();
            this.A0J = (C16080sP) r2.AQ9.get();
            this.A0N = (AnonymousClass013) r2.AR8.get();
            this.A0W = new C25781Lc();
            this.A0I = (C224818c) r2.A4w.get();
            C49132Rg r12 = r1.A05;
            this.A0Y = C17270uo.A00(r12.A0E);
            this.A0S = (AnonymousClass1M5) r2.AHS.get();
            this.A0C = (C50622aA) r12.A0S.get();
        }
    }

    public void A02(boolean z2) {
        RequestPhoneNumberViewModel requestPhoneNumberViewModel;
        AnonymousClass2X1 r1;
        C16010sH r0 = this.A0O;
        if (!((r0 != null ? r0.A0E : null) instanceof AnonymousClass1ZX) || (requestPhoneNumberViewModel = this.A0V) == null || (r1 = (AnonymousClass2X1) requestPhoneNumberViewModel.A01.A01()) == null || (r1.A03 && r1.A02)) {
            C16010sH r3 = this.A0O;
            if (r3 != null) {
                C55482jg r12 = this.A0Q;
                if (r12 != null) {
                    r12.A0C = Boolean.valueOf(z2);
                    r12.A0D = Boolean.valueOf(!z2);
                }
                this.A0H.A01(getContext(), r3, 6, z2);
                return;
            }
            return;
        }
        int i2 = 3;
        if (z2) {
            i2 = 4;
        }
        Integer valueOf = Integer.valueOf(i2);
        AnonymousClass2X0 r02 = this.A0U;
        if (r02 != null) {
            r02.A01(valueOf);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r0 = r3.A0I.A0A(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r3 = this;
            X.0sH r1 = r3.A0O
            r2 = 0
            if (r1 == 0) goto L_0x0022
            boolean r0 = r3.A0b
            if (r0 == 0) goto L_0x0023
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r1 = r1.A08(r0)
            X.0rv r1 = (X.C15830rv) r1
            if (r1 == 0) goto L_0x0022
            X.18c r0 = r3.A0I
            X.0sH r0 = r0.A0A(r1)
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0022
            r2 = 1
        L_0x0022:
            return r2
        L_0x0023:
            boolean r0 = r1.A0G()
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard.A03():boolean");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0Z;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0Z = r0;
        }
        return r0.generatedComponent();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A0E = (TextEmojiLabel) C004601z.A0E(this, R.id.contact_title);
        this.A0L = (ContactDetailsActionIcon) C004601z.A0E(this, R.id.action_pay);
        this.A01 = C004601z.A0E(this, R.id.action_add_person);
        this.A02 = C004601z.A0E(this, R.id.action_call_plus);
        this.A0K = (ContactDetailsActionIcon) C004601z.A0E(this, R.id.action_call);
        this.A05 = C004601z.A0E(this, R.id.action_message);
        this.A04 = C004601z.A0E(this, R.id.action_search_chat);
        this.A06 = C004601z.A0E(this, R.id.action_videocall);
        this.A0M = (ContactDetailsActionIcon) C004601z.A0E(this, R.id.action_request_phone_number);
        this.A08 = (TextView) C004601z.A0E(this, R.id.contact_subtitle);
        this.A07 = (TextView) C004601z.A0E(this, R.id.contact_chat_status);
        this.A03 = C004601z.A0E(this, R.id.phone_number_hidden_container);
        this.A09 = (TextView) C004601z.A0E(this, R.id.phone_number_hidden_text);
        if (getContext() instanceof C14530pL) {
            C14530pL r0 = (C14530pL) C19980zJ.A01(getContext(), C14530pL.class);
            this.A0G = r0;
            C006602z r1 = new C006602z(r0);
            AnonymousClass1M5 r2 = this.A0S;
            Context context = getContext();
            C14530pL r4 = this.A0G;
            RunnableRunnableShape5S0100000_I0_4 runnableRunnableShape5S0100000_I0_4 = new RunnableRunnableShape5S0100000_I0_4((Object) this, 27);
            C14870pt r5 = r2.A00;
            C16040sK r6 = r2.A01;
            C18290wS r9 = r2.A04;
            C18090w8 r8 = r2.A03;
            this.A0R = new AnonymousClass1VN(context, r4, r5, r6, r2.A02, r8, r9, (AnonymousClass3Q5) r1.A01(AnonymousClass3Q5.class), (Runnable) null, runnableRunnableShape5S0100000_I0_4, false);
            RequestPhoneNumberViewModel requestPhoneNumberViewModel = (RequestPhoneNumberViewModel) r1.A01(RequestPhoneNumberViewModel.class);
            this.A0V = requestPhoneNumberViewModel;
            this.A0U = this.A0C.A00(this.A0G, requestPhoneNumberViewModel);
        }
        this.A05.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 0));
        this.A04.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 47));
        this.A02.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 48));
        this.A0L.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 46));
        this.A0K.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 45));
        this.A06.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 44));
        this.A0M.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 49));
    }

    public void setAddContactButtonListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r8.A0P.A0E(X.C16620tM.A02, 1967) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setContact(X.C16010sH r9) {
        /*
            r8 = this;
            r8.A0O = r9
            X.0sK r1 = r8.A0D
            X.0rv r0 = r9.A0E
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x0019
            X.0pd r2 = r8.A0P
            r1 = 1967(0x7af, float:2.756E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r1 = r2.A0E(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r8.A0b = r0
            android.content.Context r3 = r8.getContext()
            com.obwhatsapp.TextEmojiLabel r4 = r8.A0E
            X.0sP r5 = r8.A0J
            X.013 r6 = r8.A0N
            X.1Lc r7 = r8.A0W
            X.1cU r2 = new X.1cU
            r2.<init>((android.content.Context) r3, (com.obwhatsapp.TextEmojiLabel) r4, (X.C16080sP) r5, (X.AnonymousClass013) r6, (X.C25781Lc) r7)
            boolean r0 = r8.A0b
            if (r0 == 0) goto L_0x0053
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A0C(r9, r1, r1, r0)
        L_0x0037:
            X.0rv r2 = r9.A0E
            com.obwhatsapp.pnh.RequestPhoneNumberViewModel r1 = r8.A0V
            if (r1 == 0) goto L_0x0052
            X.0pL r0 = r8.A0G
            if (r0 == 0) goto L_0x0052
            boolean r0 = r2 instanceof X.AnonymousClass1ZX
            if (r0 == 0) goto L_0x0052
            X.1ZX r2 = (X.AnonymousClass1ZX) r2
            X.028 r2 = r1.A05(r2)
            X.0pL r1 = r8.A0G
            X.023 r0 = r8.A0c
            r2.A0A(r1, r0)
        L_0x0052:
            return
        L_0x0053:
            r2.A0A(r9)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard.setContact(X.0sH):void");
    }

    public void setContactChatStatus(String str) {
        this.A07.setText(str);
    }

    public void setContactChatStatusVisibility(int i2) {
        this.A07.setVisibility(i2);
    }

    public void setContactInfoLoggingEvent(C55482jg r1) {
        this.A0Q = r1;
    }

    public void setCurrencyIcon(C30681cm r5) {
        C218315p r0 = this.A0T;
        getContext();
        int A0A2 = r0.A0A(r5);
        if (A0A2 != 0) {
            this.A0L.A00(A0A2, getContext().getString(R.string.str0551));
            return;
        }
        this.A0L.setVisibility(8);
        C16300so r3 = this.A0B;
        StringBuilder sb = new StringBuilder("Currency icon for country ");
        sb.append(r5.A03);
        sb.append(" missing");
        r3.AcB("ContactDetailsCard/PayButton", sb.toString(), true);
    }

    public void setPaymentEligibility(int i2) {
        this.A00 = i2;
    }

    public void setSubTitle(String str) {
        this.A08.setText(str);
    }

    public void setSubtitleOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A08.setOnLongClickListener(onLongClickListener);
    }

    public void setTitleOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0E.setOnLongClickListener(onLongClickListener);
    }
}
