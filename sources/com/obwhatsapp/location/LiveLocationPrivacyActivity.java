package com.obwhatsapp.location;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass1GE;
import X.AnonymousClass2Ao;
import X.AnonymousClass2Rf;
import X.C004601z;
import X.C005402i;
import X.C005702l;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C17200uh;
import X.C17250um;
import X.C18260wP;
import X.C19430yQ;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C28381Vw;
import X.C32241fu;
import X.C454628s;
import X.C454728t;
import X.C49132Rg;
import X.C56712oO;
import X.C94624lD;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape193S0100000_1_I0;
import com.facebook.redex.IDxSObserverShape275S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LiveLocationPrivacyActivity extends C14530pL {
    public View A00;
    public View A01;
    public View A02;
    public Button A03;
    public ListView A04;
    public ScrollView A05;
    public TextView A06;
    public C16080sP A07;
    public AnonymousClass2Ao A08;
    public C17200uh A09;
    public C16260sj A0A;
    public C16460t6 A0B;
    public C56712oO A0C;
    public C19430yQ A0D;
    public boolean A0E;
    public final C454728t A0F;
    public final List A0G;

    public LiveLocationPrivacyActivity() {
        this(0);
        this.A0G = new ArrayList();
        this.A0F = new IDxSObserverShape275S0100000_2_I0(this, 4);
    }

    public LiveLocationPrivacyActivity(int i2) {
        this.A0E = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 60));
    }

    public void A1q() {
        if (!this.A0E) {
            this.A0E = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A09 = (C17200uh) r1.A52.get();
            this.A07 = (C16080sP) r1.AQ9.get();
            this.A0B = (C16460t6) r1.A5k.get();
            this.A0A = (C16260sj) r1.AQe.get();
            this.A0D = (C19430yQ) r1.ADa.get();
        }
    }

    public final void A35() {
        this.A04.setOnScrollListener(new C94624lD(this, getResources().getDimensionPixelSize(R.dimen.dimen06f3)));
    }

    public final void A36() {
        ArrayList arrayList;
        List list = this.A0G;
        list.clear();
        C19430yQ r7 = this.A0D;
        synchronized (r7.A0S) {
            Map A0A2 = r7.A0A();
            arrayList = new ArrayList(A0A2.size());
            long A002 = r7.A0G.A00();
            for (C454628s r4 : A0A2.values()) {
                if (C19430yQ.A01(r4.A01, A002)) {
                    C16000sG r1 = r7.A0C;
                    C28381Vw r42 = r4.A02;
                    C15830rv r0 = r42.A00;
                    AnonymousClass00B.A06(r0);
                    arrayList.add(new Pair(r1.A08(r0), r42));
                }
            }
        }
        list.addAll(arrayList);
        this.A0C.notifyDataSetChanged();
        boolean isEmpty = list.isEmpty();
        TextView textView = this.A06;
        if (isEmpty) {
            textView.setVisibility(8);
            this.A01.setVisibility(8);
            this.A02.setVisibility(8);
            this.A04.setVisibility(8);
            this.A05.setVisibility(0);
            this.A03.setVisibility(8);
            return;
        }
        AnonymousClass013 r6 = this.A01;
        long size = (long) list.size();
        textView.setText(r6.A0J(new Object[]{Integer.valueOf(list.size())}, R.plurals.plurals00c9, size));
        this.A06.setVisibility(0);
        this.A01.setVisibility(0);
        this.A05.setVisibility(8);
        this.A02.setVisibility(0);
        this.A04.setVisibility(0);
        this.A03.setVisibility(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RequestPermissionActivity.A0U(this, this.A0A, AnonymousClass1GE.A07, R.string.str11d3, R.string.str11d2, 0, false);
        setContentView((int) R.layout.layout03a0);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        x2.A0B(R.string.str15af);
        this.A08 = this.A09.A04(this, "live-location-privacy-activity");
        this.A0C = new C56712oO(this);
        this.A02 = findViewById(R.id.list_view_container);
        this.A04 = (ListView) findViewById(R.id.list_view);
        View inflate = getLayoutInflater().inflate(R.layout.layout039e, (ViewGroup) null, false);
        C004601z.A0d(inflate, 2);
        this.A06 = (TextView) inflate.findViewById(R.id.title);
        this.A05 = (ScrollView) findViewById(R.id.live_location_not_sharing);
        this.A00 = findViewById(R.id.bottom_button_container);
        this.A03 = (Button) findViewById(R.id.stop_sharing_btn);
        this.A04.addHeaderView(inflate);
        View inflate2 = getLayoutInflater().inflate(R.layout.layout03a1, (ViewGroup) null, false);
        this.A01 = inflate2;
        this.A04.addFooterView(inflate2);
        this.A04.setOnItemClickListener(new IDxCListenerShape193S0100000_1_I0(this, 2));
        this.A04.setAdapter(this.A0C);
        if (Build.VERSION.SDK_INT >= 21) {
            A35();
        }
        this.A03.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 19));
        A36();
        this.A0D.A0U(this.A0F);
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 != 0) {
            return super.onCreateDialog(i2);
        }
        C32241fu r4 = new C32241fu(this);
        r4.A01(R.string.str0c85);
        r4.A07(true);
        r4.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        r4.setPositiveButton(R.string.str0c83, new IDxCListenerShape127S0100000_2_I0(this, 75));
        C005702l create = r4.create();
        create.requestWindowFeature(1);
        return create;
    }

    public void onDestroy() {
        super.onDestroy();
        C19430yQ r0 = this.A0D;
        r0.A0W.remove(this.A0F);
        AnonymousClass2Ao r02 = this.A08;
        if (r02 != null) {
            r02.A00();
        }
    }

    public void onResume() {
        super.onResume();
        LocationSharingService.A01(getApplicationContext(), this.A0D);
    }
}
