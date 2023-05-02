package com.obwhatsapp.biz.cart.view.fragment;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass04o;
import X.AnonymousClass0Fd;
import X.AnonymousClass1A9;
import X.AnonymousClass1BQ;
import X.AnonymousClass1KT;
import X.AnonymousClass1KW;
import X.AnonymousClass1KZ;
import X.AnonymousClass26W;
import X.AnonymousClass29I;
import X.AnonymousClass2JH;
import X.AnonymousClass2RP;
import X.AnonymousClass2RQ;
import X.AnonymousClass2RR;
import X.AnonymousClass2RU;
import X.AnonymousClass2W6;
import X.AnonymousClass2W8;
import X.AnonymousClass2W9;
import X.AnonymousClass3F0;
import X.AnonymousClass4CU;
import X.AnonymousClass4DB;
import X.AnonymousClass4K4;
import X.AnonymousClass4PR;
import X.AnonymousClass4PS;
import X.AnonymousClass5RN;
import X.C001000l;
import X.C001500q;
import X.C004601z;
import X.C005502j;
import X.C006602z;
import X.C100214vH;
import X.C14550pN;
import X.C14710pd;
import X.C14750ph;
import X.C14870pt;
import X.C15860rz;
import X.C16010sH;
import X.C16040sK;
import X.C16080sP;
import X.C16180sb;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16620tM;
import X.C16760tb;
import X.C17020u3;
import X.C17030uP;
import X.C17140ub;
import X.C17150uc;
import X.C17170ue;
import X.C17190ug;
import X.C17250um;
import X.C18630x0;
import X.C18640x1;
import X.C18720x9;
import X.C18750xC;
import X.C19000xb;
import X.C206711d;
import X.C23061Ai;
import X.C23081Ak;
import X.C23091Al;
import X.C24511Gf;
import X.C28011Tz;
import X.C28331Vq;
import X.C31481eG;
import X.C32291fz;
import X.C33481ie;
import X.C35671mJ;
import X.C35691mL;
import X.C35701mM;
import X.C39501sa;
import X.C39651sq;
import X.C40651uT;
import X.C447725m;
import X.C50102Xy;
import X.C50262Yq;
import X.C61713Aa;
import X.C61843Ap;
import X.C71363kF;
import X.C808145r;
import X.C93564jP;
import X.C93694jc;
import X.C95344mU;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.facebook.redex.IDxEListenerShape200S0100000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.biz.order.viewmodel.OrderInfoViewModel;
import com.obwhatsapp.contact.IDxCObserverShape66S0100000_1_I0;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.mentions.MentionableEntry;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CartFragment extends Hilt_CartFragment {
    public static final HashMap A11 = new HashMap();
    public static final HashMap A12 = new HashMap();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public LinearLayout A08;
    public TextView A09;
    public RecyclerView A0A;
    public C16300so A0B;
    public AnonymousClass4CU A0C;
    public C16180sb A0D;
    public C14870pt A0E;
    public KeyboardPopupLayout A0F;
    public C16040sK A0G;
    public C16760tb A0H;
    public C19000xb A0I;
    public WaTextView A0J;
    public WaTextView A0K;
    public C17150uc A0L;
    public AnonymousClass1KZ A0M;
    public AnonymousClass1KT A0N;
    public C24511Gf A0O;
    public AnonymousClass2RQ A0P;
    public AnonymousClass2W6 A0Q;
    public AnonymousClass2RP A0R;
    public C28011Tz A0S;
    public C18640x1 A0T;
    public C17170ue A0U;
    public C23081Ak A0V;
    public C50262Yq A0W;
    public OrderInfoViewModel A0X;
    public C61713Aa A0Y;
    public AnonymousClass01Y A0Z;
    public C17140ub A0a;
    public C17030uP A0b;
    public C16080sP A0c;
    public AnonymousClass01V A0d;
    public C16440t3 A0e;
    public C15860rz A0f;
    public AnonymousClass013 A0g;
    public AnonymousClass2JH A0h;
    public C206711d A0i;
    public C17250um A0j;
    public AnonymousClass1BQ A0k;
    public C14710pd A0l;
    public UserJid A0m;
    public MentionableEntry A0n;
    public C18720x9 A0o;
    public C17190ug A0p;
    public C18630x0 A0q;
    public C17020u3 A0r;
    public AnonymousClass1KW A0s;
    public C23091Al A0t;
    public C18750xC A0u;
    public C23061Ai A0v;
    public AnonymousClass1A9 A0w;
    public C16320sq A0x;
    public boolean A0y = false;
    public final AnonymousClass5RN A0z = new IDxCListenerShape203S0100000_2_I0(this, 0);
    public final C33481ie A10 = new IDxCObserverShape66S0100000_1_I0(this, 0);

    public static CartFragment A01(UserJid userJid, String str, int i2) {
        CartFragment cartFragment = new CartFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_business_id", userJid);
        bundle.putInt("extra_entry_point", i2);
        bundle.putString("extra_product_id", str);
        cartFragment.A0T(bundle);
        return cartFragment;
    }

    public void A0s(Bundle bundle) {
        int i2;
        super.A0s(bundle);
        if (this.A0h.isShowing()) {
            i2 = 1;
        } else {
            i2 = 2;
            if (C23061Ai.A00(this.A0F)) {
                i2 = 0;
            }
        }
        this.A01 = i2;
        bundle.putInt("extra_input_method", i2);
        bundle.putBoolean("extra_is_sending_order", this.A0y);
    }

    public void A0w() {
        MentionableEntry mentionableEntry;
        super.A0w();
        UserJid userJid = this.A0m;
        if (!(userJid == null || (mentionableEntry = this.A0n) == null)) {
            A12.put(userJid, C40651uT.A05(mentionableEntry.getStringText()));
            A11.put(this.A0m, C39501sa.A00(this.A0n.getMentions()));
        }
        if (this.A00 == 1) {
            A0D().setRequestedOrientation(1);
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        int i2;
        Parcelable parcelable = A04().getParcelable("extra_business_id");
        AnonymousClass00B.A06(parcelable);
        this.A0m = (UserJid) parcelable;
        int i3 = A04().getInt("extra_entry_point");
        this.A00 = i3;
        this.A0q.A04("cart_view_tag", "IsConsumer", !this.A0G.A0I(this.A0m));
        if (i3 == 0) {
            str = "Catalog";
        } else if (i3 == 1) {
            str = "Product";
        } else if (i3 == 2) {
            str = "Collection";
        } else if (i3 == 3) {
            str = "PLM";
        } else if (i3 == 4) {
            str = "Conversation";
        } else if (i3 == 5) {
            str = "CatalogSearch";
        } else {
            throw new IllegalStateException("CartFragment/logQplCartViewAnnotations/unhandled entry point");
        }
        this.A0q.A03("cart_view_tag", "EntryPoint", str);
        View inflate = layoutInflater.inflate(R.layout.layout0298, viewGroup, false);
        this.A06 = inflate;
        this.A0F = (KeyboardPopupLayout) C004601z.A0E(inflate, R.id.cart);
        this.A0n = (MentionableEntry) C004601z.A0E(this.A06, R.id.entry);
        ImageButton imageButton = (ImageButton) C004601z.A0E(this.A06, R.id.emoji_picker_btn);
        this.A05 = C004601z.A0E(this.A06, R.id.footer);
        this.A04 = C004601z.A0E(this.A06, R.id.cart_empty_container);
        this.A0K = (WaTextView) C004601z.A0E(this.A06, R.id.empty_cart_title);
        this.A0J = (WaTextView) C004601z.A0E(this.A06, R.id.empty_cart_description);
        this.A07 = C004601z.A0E(this.A06, R.id.cart_empty_view_catalog_btn);
        this.A0A = (RecyclerView) C004601z.A0E(this.A06, R.id.cart_items_recycler_view);
        this.A08 = (LinearLayout) C004601z.A0E(this.A06, R.id.send_cart_cta);
        C14710pd r1 = this.A0P.A01;
        C16620tM r9 = C16620tM.A02;
        if (r1.A0E(r9, 1867)) {
            this.A09 = (TextView) C004601z.A0E(this.A06, R.id.send_cart_cta_message);
        }
        View A0E2 = C004601z.A0E(this.A06, R.id.send);
        TextView textView = (TextView) C004601z.A0E(this.A06, R.id.send_cart_cta_btn);
        View A0E3 = C004601z.A0E(this.A06, R.id.cart_close_btn);
        this.A06.setMinimumHeight(A1L());
        View A0E4 = C004601z.A0E(this.A06, R.id.text_entry_layout);
        int max = Math.max(A0E4.getPaddingLeft(), A0E4.getPaddingRight());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) A0E4.getLayoutParams();
        if (!this.A0g.A0T()) {
            layoutParams.rightMargin = max;
        } else {
            layoutParams.leftMargin = max;
        }
        A0E4.setLayoutParams(layoutParams);
        this.A03 = A03().getDimensionPixelSize(R.dimen.dimen05bb);
        this.A02 = A03().getDimensionPixelSize(R.dimen.dimen05ba);
        C14870pt r17 = this.A0E;
        C18630x0 r15 = this.A0q;
        C17190ug r13 = this.A0p;
        C17150uc r18 = this.A0L;
        AnonymousClass4DB r3 = new AnonymousClass4DB(new AnonymousClass4PS());
        C18720x9 r5 = this.A0o;
        C15860rz r12 = this.A0f;
        AnonymousClass2RQ r0 = this.A0P;
        C16320sq r31 = this.A0x;
        C18750xC r4 = this.A0u;
        AnonymousClass26W r16 = new AnonymousClass26W(r17, r18, r0, r3, r12, r5, r13, r15, r4, r31);
        AnonymousClass4PS r14 = new AnonymousClass4PS();
        AnonymousClass2RU r23 = new AnonymousClass2RU(r17, r18, new AnonymousClass4K4(new C808145r(), this.A0Y, r14), r5, r13, r15, r4);
        UserJid userJid = this.A0m;
        AnonymousClass2RR r19 = new AnonymousClass2RR(r17, r18, this.A0O, r23, this.A0S, this.A0T, this.A0U, r16, userJid, r31);
        Dialog dialog = this.A03;
        if (!(dialog == null || dialog.getWindow() == null)) {
            this.A03.getWindow().setSoftInputMode(16);
        }
        this.A0n.setHint(A02().getString(R.string.str0d2e));
        C14710pd r52 = this.A0l;
        C50262Yq r42 = this.A0W;
        AnonymousClass4CU r182 = this.A0C;
        this.A0Q = new AnonymousClass2W6(r182, r19, this, this, r42, r52, this.A0m);
        C16440t3 r24 = this.A0e;
        C14710pd r25 = this.A0l;
        UserJid userJid2 = this.A0m;
        C16760tb r312 = this.A0H;
        C19000xb r30 = this.A0I;
        C18630x0 r183 = this.A0q;
        C16080sP r162 = this.A0c;
        C16320sq r142 = this.A0x;
        AnonymousClass3F0 r132 = new AnonymousClass3F0(this.A0D, this.A0w, r142);
        C17030uP r152 = this.A0b;
        C17170ue r53 = this.A0U;
        C17150uc r43 = this.A0L;
        C16320sq r29 = r142;
        this.A0R = (AnonymousClass2RP) new C006602z((AnonymousClass04o) new C95344mU(r312, r30, r43, this.A0M, this.A0P, r19, r53, r132, r152, r162, r24, r25, userJid2, r183, this.A0s, r29), (C001500q) this).A01(AnonymousClass2RP.class);
        ViewOnClickCListenerShape0S0100000_I0 viewOnClickCListenerShape0S0100000_I0 = new ViewOnClickCListenerShape0S0100000_I0(this, 12);
        if (this.A0l.A0E(r9, 1660)) {
            textView.setOnClickListener(viewOnClickCListenerShape0S0100000_I0);
            int A032 = this.A0R.A0O.A03(r9, 2153);
            if (A032 != 1) {
                i2 = R.string.str14e9;
                if (A032 != 2) {
                    i2 = R.string.str14ea;
                }
            } else {
                i2 = R.string.str14e8;
            }
            textView.setText(i2);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.A0A.getLayoutParams();
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams2.addRule(2, R.id.send_cart_cta);
            this.A0A.setLayoutParams(layoutParams2);
            this.A08.setVisibility(0);
            this.A05.setVisibility(8);
        } else {
            A0E2.setOnClickListener(viewOnClickCListenerShape0S0100000_I0);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.A0A.getLayoutParams();
            layoutParams3.setMargins(0, 0, 0, A03().getDimensionPixelSize(R.dimen.dimen06ec));
            layoutParams3.addRule(2, R.id.footer);
            this.A0A.setLayoutParams(layoutParams3);
            this.A08.setVisibility(8);
            this.A05.setVisibility(0);
        }
        A0E3.setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 13));
        this.A07.setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 14));
        RecyclerView recyclerView = this.A0A;
        recyclerView.A0h = true;
        recyclerView.setAdapter(this.A0Q);
        C005502j r110 = this.A0A.A0R;
        if (r110 instanceof AnonymousClass0Fd) {
            ((AnonymousClass0Fd) r110).A00 = false;
        }
        this.A0X = (OrderInfoViewModel) new C006602z(this).A01(OrderInfoViewModel.class);
        this.A0R.A07.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 35));
        this.A0R.A0B.A0A(A0H(), new IDxObserverShape113S0100000_1_I0(this, 6));
        this.A0R.A02.A0A(A0H(), new IDxObserverShape113S0100000_1_I0(this, 5));
        this.A0R.A09.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 34));
        this.A0R.A06.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 33));
        this.A0R.A05.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 37));
        this.A0R.A08.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 36));
        this.A0R.A04.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 40));
        this.A0R.A0C.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 32));
        this.A0R.A03.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 39));
        if (this.A0P.A01.A0E(r9, 1867) && this.A09 != null) {
            this.A0R.A0A.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 38));
            AnonymousClass2RP r6 = this.A0R;
            r6.A0S.Acl(new RunnableRunnableShape3S0200000_I0_1(r6, 15, this.A0m));
        }
        AnonymousClass2RP r111 = this.A0R;
        r111.A00 = false;
        r111.A01 = true;
        AnonymousClass2RR r44 = r111.A0I;
        r44.A0L.Acl(new RunnableRunnableShape3S0100000_I0_2(r44, 43));
        AnonymousClass2RR r45 = this.A0R.A0I;
        r45.A0B.A03(new C100214vH(r45), r45.A0I);
        A1P();
        C001000l A0D2 = A0D();
        C14710pd r143 = this.A0l;
        C23061Ai r133 = this.A0v;
        C16300so r122 = this.A0B;
        C17250um r11 = this.A0j;
        C206711d r92 = this.A0i;
        AnonymousClass01V r8 = this.A0d;
        AnonymousClass013 r7 = this.A0g;
        AnonymousClass1BQ r62 = this.A0k;
        C15860rz r46 = this.A0f;
        C17020u3 r32 = this.A0r;
        this.A0h = new AnonymousClass2JH(A0D2, imageButton, r122, this.A0F, this.A0n, r8, r46, r7, r92, r11, r62, r143, r32, r133);
        AnonymousClass2JH r93 = this.A0h;
        C001000l A0D3 = A0D();
        C17250um r112 = this.A0j;
        C206711d r10 = this.A0i;
        new AnonymousClass29I(A0D3, this.A0g, r93, r10, r112, (EmojiSearchContainer) this.A0F.findViewById(R.id.emoji_search_container), this.A0r).A00 = new IDxEListenerShape200S0100000_2_I0(this, 0);
        AnonymousClass2JH r33 = this.A0h;
        r33.A0C(this.A0z);
        r33.A0E = new RunnableRunnableShape3S0100000_I0_2(this, 44);
        String str2 = (String) A12.get(this.A0m);
        if (!TextUtils.isEmpty(str2)) {
            this.A0n.setMentionableText(str2, C39501sa.A01((String) A11.get(this.A0m)));
        }
        C17170ue r47 = this.A0U;
        C31481eG r34 = new C31481eG();
        r34.A09 = r47.A00;
        r34.A04 = Integer.valueOf(r47.A08.get());
        r34.A08 = Long.valueOf((long) this.A0U.A09.getAndIncrement());
        r34.A05 = 37;
        r34.A03 = 52;
        r34.A00 = this.A0m;
        r47.A03(r34);
        A1O();
        return this.A06;
    }

    public void A12() {
        super.A12();
        this.A0W.A00();
        this.A0a.A03(this.A10);
        this.A0q.A05("cart_view_tag", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r1 != 2) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A14() {
        /*
            r5 = this;
            super.A14()
            X.00l r4 = r5.A0D()
            int r1 = r5.A01
            if (r1 == 0) goto L_0x0049
            r0 = 1
            r3 = 2
            if (r1 == r0) goto L_0x002d
            if (r1 == r3) goto L_0x0041
        L_0x0011:
            X.2RP r1 = r5.A0R
            r0 = 0
            r1.A00 = r0
            r0 = 1
            r1.A01 = r0
            X.2RR r3 = r1.A0I
            X.0sq r2 = r3.A0L
            r1 = 43
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2
            r0.<init>(r3, r1)
            r2.Acl(r0)
            r0 = 10
            r4.setRequestedOrientation(r0)
            return
        L_0x002d:
            X.2JH r0 = r5.A0h
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0041
            com.obwhatsapp.KeyboardPopupLayout r2 = r5.A0F
            r1 = 45
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2
            r0.<init>(r5, r1)
            r2.post(r0)
        L_0x0041:
            android.view.Window r0 = r4.getWindow()
            r0.setSoftInputMode(r3)
            goto L_0x0011
        L_0x0049:
            android.view.Window r1 = r4.getWindow()
            r0 = 4
            r1.setSoftInputMode(r0)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.biz.cart.view.fragment.CartFragment.A14():void");
    }

    public void A17(Bundle bundle) {
        this.A0q.A00(774774619, "cart_view_tag", "CartFragment");
        super.A17(bundle);
        this.A0a.A02(this.A10);
        this.A0W = new C50262Yq(this.A0V, this.A0t);
        if (bundle == null) {
            this.A01 = 2;
            return;
        }
        this.A01 = bundle.getInt("extra_input_method");
        this.A0y = bundle.getBoolean("extra_is_sending_order");
    }

    public void A18(Bundle bundle, View view) {
        C004601z.A0p(view, true);
    }

    public void A1M(View view) {
        super.A1M(view);
        BottomSheetBehavior.A00(view).A0J = false;
    }

    public final void A1N() {
        BigDecimal bigDecimal;
        C39651sq r1;
        int A0E2 = this.A0Q.A0E();
        List<C50102Xy> A0F2 = this.A0Q.A0F();
        Date date = this.A0Q.A00;
        ArrayList arrayList = new ArrayList();
        for (C50102Xy r2 : A0F2) {
            C35701mM r10 = r2.A01;
            List list = r10.A06;
            C93564jP r14 = !list.isEmpty() ? new C93564jP(((C35691mL) list.get(0)).A04, ((C35691mL) list.get(0)).A00) : null;
            BigDecimal bigDecimal2 = r10.A05;
            C93694jc r12 = r10.A02;
            if (bigDecimal2 == null) {
                bigDecimal2 = null;
            } else if (r12 != null && r12.A00(date)) {
                bigDecimal2 = r12.A01;
            }
            arrayList.add(new C35671mJ(r14, r10.A03, r10.A0D, r10.A04, bigDecimal2, (int) r2.A00, 0));
        }
        String A052 = this.A0X.A05(arrayList);
        OrderInfoViewModel orderInfoViewModel = this.A0X;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        String str = null;
        C39651sq r7 = null;
        while (true) {
            if (it.hasNext()) {
                C35671mJ r4 = (C35671mJ) it.next();
                BigDecimal bigDecimal3 = r4.A03;
                if (bigDecimal3 == null || (r1 = r4.A02) == null || (r7 != null && !r1.equals(r7))) {
                    break;
                }
                hashMap.put(r4.A06, bigDecimal3);
                r7 = r1;
            } else if (r7 != null) {
                BigDecimal bigDecimal4 = new BigDecimal(0);
                for (C50102Xy r122 : A0F2) {
                    C35701mM r42 = r122.A01;
                    BigDecimal bigDecimal5 = (BigDecimal) hashMap.get(r42.A0D);
                    if (!(bigDecimal5 == null || (bigDecimal = r42.A05) == null || bigDecimal.subtract(bigDecimal5).compareTo(BigDecimal.ZERO) <= 0)) {
                        bigDecimal4 = bigDecimal4.add(r42.A05.subtract(bigDecimal5).multiply(new BigDecimal(r122.A00)));
                    }
                }
                if (bigDecimal4.compareTo(BigDecimal.ZERO) > 0) {
                    str = r7.A03(orderInfoViewModel.A01, bigDecimal4, true);
                }
            }
        }
        C14710pd r0 = this.A0l;
        C16620tM r43 = C16620tM.A02;
        if (r0.A0E(r43, 1660)) {
            View A0E3 = C004601z.A0E(this.A06, R.id.send_cart_cta_save_label);
            TextView textView = (TextView) C004601z.A0E(this.A06, R.id.send_cart_cta_save_amount);
            TextView textView2 = (TextView) C004601z.A0E(this.A06, R.id.send_cart_cta_subtotal_label);
            TextView textView3 = (TextView) C004601z.A0E(this.A06, R.id.send_cart_cta_subtotal_amount);
            if (TextUtils.isEmpty(str)) {
                A0E3.setVisibility(8);
                textView.setVisibility(8);
            } else {
                A0E3.setVisibility(0);
                textView.setVisibility(0);
                textView.setText(str);
            }
            boolean isEmpty = TextUtils.isEmpty(A052);
            Context A022 = A02();
            if (isEmpty) {
                textView2.setText(A022.getString(R.string.str03b9));
                textView3.setVisibility(8);
            } else {
                textView2.setText(A022.getString(R.string.str03bd));
                textView3.setText(A052);
                textView3.setVisibility(0);
            }
        }
        AnonymousClass2W6 r72 = this.A0Q;
        int i2 = 0;
        while (true) {
            List list2 = r72.A08;
            if (i2 >= list2.size()) {
                break;
            }
            AnonymousClass2W8 r13 = (AnonymousClass2W8) list2.get(i2);
            if (r13 instanceof AnonymousClass2W9) {
                ((AnonymousClass2W9) r13).A00 = A0E2;
                r72.A02(i2);
            }
            if ((r13 instanceof C71363kF) && !r72.A06.A0E(r43, 1660)) {
                C71363kF r15 = (C71363kF) r13;
                r15.A01 = A052;
                r15.A00 = str;
                r72.A02(i2);
            }
            i2++;
        }
        if (this.A0Q.A0E() == 0) {
            this.A04.setVisibility(0);
            this.A0A.setVisibility(8);
            this.A05.setVisibility(8);
            this.A08.setVisibility(8);
        } else {
            this.A0A.setVisibility(0);
            (this.A0l.A0E(r43, 1660) ? this.A08 : this.A05).setVisibility(0);
            this.A04.setVisibility(8);
        }
        for (AnonymousClass4PR A002 : this.A0N.A01()) {
            A002.A00();
        }
    }

    public final void A1O() {
        int dimensionPixelSize = A03().getDimensionPixelSize(R.dimen.dimen043b);
        int i2 = dimensionPixelSize << 1;
        if (A03().getConfiguration().orientation != 1) {
            dimensionPixelSize >>= 1;
            i2 = dimensionPixelSize;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A0K.getLayoutParams();
        layoutParams.topMargin = i2;
        this.A0K.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.A0J.getLayoutParams();
        layoutParams2.topMargin = dimensionPixelSize;
        this.A0J.setLayoutParams(layoutParams2);
    }

    public final void A1P() {
        AnonymousClass2RP r1 = this.A0R;
        C17030uP r0 = r1.A0L;
        UserJid userJid = r1.A0P;
        C28331Vq A002 = r0.A00(userJid);
        String A082 = A002 != null ? A002.A08 : r1.A0M.A08(new C16010sH(userJid));
        if (!TextUtils.isEmpty(A082)) {
            C004601z.A0E(this.A06, R.id.recipient_name_layout).setVisibility(0);
            ((ImageView) C004601z.A0E(this.A06, R.id.recipient_name_prompt_icon)).setImageDrawable(new C447725m(AnonymousClass00T.A04(A02(), R.drawable.chevron), this.A0g));
            ((TextEmojiLabel) C004601z.A0E(this.A06, R.id.recipient_name_text)).A0I((List) null, A082);
        }
    }

    public void A1Q(String str) {
        String string = A04().getString("extra_product_id");
        AnonymousClass2RP r1 = this.A0R;
        String str2 = str;
        if (str.equals(string)) {
            A1C();
            return;
        }
        UserJid userJid = r1.A0P;
        A1C();
        Context A022 = A02();
        C61843Ap.A00(A022, C14750ph.A0o(A022, false), userJid, (Integer) null, (Integer) null, str2, 8, false);
    }

    public final void A1R(boolean z2) {
        if (z2) {
            ((C14550pN) A0D()).Ac1();
            C32291fz.A01(A06(), A02().getString(R.string.str03f1), 0).A03();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A1O();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C001000l A0C2 = A0C();
        if (A0C2 instanceof C14550pN) {
            ((C14550pN) A0C2).A2S(0);
        }
    }
}
