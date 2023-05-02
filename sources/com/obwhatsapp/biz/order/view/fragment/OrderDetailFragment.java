package com.obwhatsapp.biz.order.view.fragment;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass027;
import X.AnonymousClass04o;
import X.AnonymousClass15I;
import X.AnonymousClass1Pc;
import X.AnonymousClass1TS;
import X.AnonymousClass1yL;
import X.AnonymousClass3Q2;
import X.AnonymousClass4DC;
import X.AnonymousClass4N5;
import X.AnonymousClass4PS;
import X.C001500q;
import X.C004601z;
import X.C006602z;
import X.C16040sK;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16760tb;
import X.C16980tz;
import X.C17150uc;
import X.C17170ue;
import X.C17190ug;
import X.C18630x0;
import X.C23081Ak;
import X.C23091Al;
import X.C26771Pb;
import X.C28381Vw;
import X.C31481eG;
import X.C50262Yq;
import X.C57532rK;
import X.C59492yN;
import X.C82274Ce;
import X.C82314Ci;
import X.C85524Ou;
import X.C94984ln;
import X.C95284mO;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.order.viewmodel.OrderInfoViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape0S1100000_I0;
import java.util.Hashtable;
import java.util.concurrent.Future;

public class OrderDetailFragment extends Hilt_OrderDetailFragment {
    public ProgressBar A00;
    public C82274Ce A01;
    public C82314Ci A02;
    public C16040sK A03;
    public C16760tb A04;
    public C17150uc A05;
    public C17170ue A06;
    public C23081Ak A07;
    public C50262Yq A08;
    public AnonymousClass1Pc A09;
    public C26771Pb A0A;
    public C85524Ou A0B;
    public C57532rK A0C;
    public AnonymousClass3Q2 A0D;
    public OrderInfoViewModel A0E;
    public AnonymousClass15I A0F;
    public C16440t3 A0G;
    public C16980tz A0H;
    public AnonymousClass013 A0I;
    public C16490t9 A0J;
    public UserJid A0K;
    public UserJid A0L;
    public C17190ug A0M;
    public C18630x0 A0N;
    public C23091Al A0O;
    public AnonymousClass1TS A0P;
    public C16320sq A0Q;
    public String A0R;

    public static OrderDetailFragment A01(UserJid userJid, UserJid userJid2, C28381Vw r6, String str, String str2) {
        OrderDetailFragment orderDetailFragment = new OrderDetailFragment();
        Bundle bundle = new Bundle();
        AnonymousClass1yL.A09(bundle, r6, "");
        bundle.putParcelable("extra_key_seller_jid", userJid);
        bundle.putParcelable("extra_key_buyer_jid", userJid2);
        bundle.putString("extra_key_order_id", str);
        bundle.putString("extra_key_token", str2);
        bundle.putBoolean("extra_key_enable_create_order", false);
        orderDetailFragment.A0T(bundle);
        return orderDetailFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object obj;
        View inflate = layoutInflater.inflate(R.layout.layout02a3, viewGroup, false);
        inflate.findViewById(R.id.order_detail_close_btn).setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 49));
        this.A00 = (ProgressBar) C004601z.A0E(inflate, R.id.order_detail_loading_spinner);
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(inflate, R.id.order_detail_recycler_view);
        recyclerView.A0h = true;
        Parcelable parcelable = A04().getParcelable("extra_key_seller_jid");
        AnonymousClass00B.A06(parcelable);
        UserJid userJid = (UserJid) parcelable;
        this.A0L = userJid;
        C57532rK r0 = new C57532rK(this.A02, this.A08, this, userJid);
        this.A0C = r0;
        recyclerView.setAdapter(r0);
        C004601z.A0p(recyclerView, false);
        inflate.setMinimumHeight(A1L());
        Parcelable parcelable2 = A04().getParcelable("extra_key_buyer_jid");
        AnonymousClass00B.A06(parcelable2);
        this.A0K = (UserJid) parcelable2;
        String string = A04().getString("extra_key_order_id");
        AnonymousClass00B.A06(string);
        this.A0R = string;
        String string2 = A04().getString("extra_key_token");
        AnonymousClass00B.A06(string2);
        C28381Vw A032 = AnonymousClass1yL.A03(A04(), "");
        String str = this.A0R;
        AnonymousClass3Q2 r02 = (AnonymousClass3Q2) new C006602z((AnonymousClass04o) new C95284mO(this.A01, this.A0L, A032, string2, str), (C001500q) this).A01(AnonymousClass3Q2.class);
        this.A0D = r02;
        r02.A02.A0A(A0H(), new IDxObserverShape113S0100000_1_I0(this, 11));
        this.A0D.A01.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 50));
        TextView textView = (TextView) C004601z.A0E(inflate, R.id.order_detail_title);
        AnonymousClass3Q2 r9 = this.A0D;
        Resources resources = r9.A06.A00.getResources();
        boolean A0I2 = r9.A03.A0I(r9.A08);
        int i2 = R.string.str1bac;
        if (A0I2) {
            i2 = R.string.str1355;
        }
        textView.setText(resources.getString(i2));
        this.A0E = (OrderInfoViewModel) new C006602z(this).A01(OrderInfoViewModel.class);
        AnonymousClass3Q2 r03 = this.A0D;
        C85524Ou r92 = r03.A04;
        UserJid userJid2 = r03.A08;
        String str2 = r03.A09;
        String str3 = r03.A0A;
        Object obj2 = r92.A05.A00.get(str2);
        if (obj2 != null) {
            AnonymousClass027 r04 = r92.A00;
            if (r04 != null) {
                r04.A09(obj2);
            }
        } else {
            UserJid userJid3 = userJid2;
            AnonymousClass4N5 r16 = new AnonymousClass4N5(userJid3, str2, str3, r92.A03, r92.A02);
            C18630x0 r11 = r92.A09;
            C17190ug r8 = r92.A08;
            C59492yN r14 = new C59492yN(r92.A04, r16, new AnonymousClass4DC(new AnonymousClass4PS()), r92.A07, r8, r11);
            C26771Pb r112 = r92.A06;
            synchronized (r112) {
                Hashtable hashtable = r112.A00;
                obj = (Future) hashtable.get(str2);
                if (obj == null) {
                    String A022 = r14.A03.A02();
                    r14.A04.A02("order_view_tag");
                    r14.A02.A02(r14, r14.A02(A022), A022, 248);
                    StringBuilder sb = new StringBuilder("GetOrderProtocol/sendGetOrderRequest/jid=");
                    sb.append(r14.A00.A02);
                    Log.i(sb.toString());
                    obj = r14.A05;
                    hashtable.put(str2, obj);
                    r112.A01.Acl(new RunnableRunnableShape0S1200000_I0(obj, str2, r112, 12));
                }
            }
            r92.A0A.Acl(new RunnableRunnableShape12S0200000_I1(r92, 49, obj));
        }
        C17170ue r82 = this.A06;
        C31481eG r5 = new C31481eG();
        r5.A09 = r82.A00;
        r5.A04 = Integer.valueOf(r82.A08.get());
        r5.A08 = Long.valueOf((long) this.A06.A09.getAndIncrement());
        r5.A05 = 35;
        r5.A03 = 45;
        r5.A00 = this.A0L;
        r5.A0C = this.A0R;
        r82.A03(r5);
        if (A04().getBoolean("extra_key_enable_create_order")) {
            View A0E2 = C004601z.A0E(inflate, R.id.create_order);
            this.A0D.A00.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) A0E2, 49));
            A0E2.setVisibility(0);
            A0E2.setOnClickListener(new ViewOnClickCListenerShape0S1100000_I0(1, string2, this));
            View A0E3 = C004601z.A0E(inflate, R.id.decline_order);
            A0E3.setVisibility(0);
            A0E3.setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 20));
        }
        this.A0F.A07(new C94984ln(0), this.A0L);
        return inflate;
    }

    public void A12() {
        super.A12();
        this.A08.A00();
        this.A0N.A05("order_view_tag", false);
    }

    public void A17(Bundle bundle) {
        this.A0N.A00(774769843, "order_view_tag", "OrderDetailFragment");
        super.A17(bundle);
        this.A08 = new C50262Yq(this.A07, this.A0O);
    }

    public void A1M(View view) {
        super.A1M(view);
        BottomSheetBehavior.A00(view).A0J = false;
    }
}
