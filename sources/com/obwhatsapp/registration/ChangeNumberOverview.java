package com.obwhatsapp.registration;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass175;
import X.AnonymousClass2Rf;
import X.C005402i;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17110uY;
import X.C17250um;
import X.C18090w8;
import X.C18260wP;
import X.C18290wS;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C30681cm;
import X.C49132Rg;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape236S0100000_2_I0;
import com.facebook.redex.IDxDListenerShape190S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.obwhatsapp.R;

public class ChangeNumberOverview extends C14530pL {
    public int A00;
    public View A01;
    public ScrollView A02;
    public C18090w8 A03;
    public C18290wS A04;
    public C17110uY A05;
    public boolean A06;

    public ChangeNumberOverview() {
        this(0);
    }

    public ChangeNumberOverview(int i2) {
        this.A06 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 75));
    }

    public void A1q() {
        if (!this.A06) {
            this.A06 = true;
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
            this.A05 = (C17110uY) r1.ADT.get();
            this.A04 = (C18290wS) r1.AIB.get();
            this.A03 = (C18090w8) r1.AI6.get();
        }
    }

    public final void A35() {
        this.A01.setElevation(this.A02.canScrollVertically(1) ? (float) this.A00 : 0.0f);
    }

    public final void A36() {
        this.A02.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape190S0100000_2_I0(this, 9));
    }

    public final void A37(TextView textView, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new BulletSpan((int) getResources().getDimension(R.dimen.dimen06f4)), 0, spannableStringBuilder.length(), 0);
        textView.setText(spannableStringBuilder);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            A36();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str0429);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        x2.A0O(true);
        setContentView((int) R.layout.layout00ff);
        this.A02 = (ScrollView) findViewById(R.id.scroll_view);
        this.A01 = findViewById(R.id.bottom_button_container);
        if (this.A03.A09()) {
            C18090w8 r2 = this.A03;
            if (C30681cm.A0E == r2.A06.A01()) {
                AnonymousClass175 r1 = r2.A04;
                if (r1.A0E() || r1.A0D()) {
                    findViewById(R.id.change_number_instructions_container_payments).setVisibility(0);
                    findViewById(R.id.change_number_instructions_container).setVisibility(8);
                    A37((TextView) findViewById(R.id.change_number_impact_payments_item_1), getString(R.string.str041e));
                    TextView textView = (TextView) findViewById(R.id.change_number_impact_payments_item_2);
                    textView.setVisibility(0);
                    A37(textView, getString(R.string.str041f));
                    A37((TextView) findViewById(R.id.change_number_instructions_payments_item_1), getString(R.string.str0403));
                    A37((TextView) findViewById(R.id.change_number_instructions_payments_item_2), getString(R.string.str0404));
                }
            }
            this.A05.Acl(new RunnableRunnableShape13S0100000_I0_12((Object) this, 13));
        } else {
            ((TextView) findViewById(R.id.change_number_overview_body_one)).setText(R.string.str041c);
            ((TextView) findViewById(R.id.change_number_overview_body_two)).setText(R.string.str0426);
            ((TextView) findViewById(R.id.change_number_overview_body_three)).setText(R.string.str0425);
        }
        findViewById(R.id.next_btn).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 41));
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = getResources().getDimensionPixelSize(R.dimen.dimen06f3);
            this.A02.getViewTreeObserver().addOnScrollChangedListener(new IDxCListenerShape236S0100000_2_I0(this, 3));
            A36();
        }
    }
}
