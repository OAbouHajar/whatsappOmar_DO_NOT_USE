package com.obwhatsapp.dmsetting;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01S;
import X.AnonymousClass2JA;
import X.AnonymousClass2Z3;
import X.AnonymousClass2Z4;
import X.AnonymousClass3MF;
import X.AnonymousClass5z4;
import X.AnonymousClass63Y;
import X.AnonymousClass63Z;
import X.C110105dW;
import X.C110115dX;
import X.C1207963a;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C15830rv;
import X.C16030sJ;
import X.C16150sX;
import X.C17110uY;
import X.C17120uZ;
import X.C17190ug;
import X.C17220uj;
import X.C18600wx;
import X.C220616m;
import X.C26101Mi;
import X.C28371Vv;
import X.C32291fz;
import X.C34791ks;
import X.C35081lL;
import X.C40491uD;
import X.C447725m;
import X.C49132Rg;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape324S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;

public class ChangeDMSettingActivity extends C14530pL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public TextEmojiLabel A04;
    public C17120uZ A05;
    public C220616m A06;
    public C18600wx A07;
    public AnonymousClass2Z3 A08;
    public AnonymousClass2Z4 A09;
    public C26101Mi A0A;
    public C17220uj A0B;
    public C17110uY A0C;
    public boolean A0D;
    public boolean A0E;

    public ChangeDMSettingActivity() {
        this(0);
    }

    public ChangeDMSettingActivity(int i2) {
        this.A0E = false;
        C110105dW.A0t(this, 1);
    }

    public void A1q() {
        if (!this.A0E) {
            this.A0E = true;
            C49132Rg A0C2 = C110105dW.A0C(this);
            C16150sX r1 = A0C2.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C2, r1, this, C110105dW.A0F(r1));
            this.A0C = C16150sX.A1A(r1);
            this.A0B = (C17220uj) r1.A9x.get();
            this.A08 = A0C2.A0G();
            this.A09 = A0C2.A0H();
            this.A06 = (C220616m) r1.A76.get();
            this.A0A = (C26101Mi) r1.AQU.get();
            this.A05 = (C17120uZ) r1.AQT.get();
            this.A07 = (C18600wx) r1.A78.get();
        }
    }

    public final void A35(int i2) {
        int i3 = i2;
        if (i3 == -1) {
            this.A08.A00(3, this.A01);
        } else if (i3 != this.A07.A04().intValue()) {
            Intent A092 = C13680ns.A09();
            A092.putExtra("duration", i3);
            setResult(-1, A092);
            C220616m r3 = this.A06;
            int i4 = this.A01;
            if (!r3.A02.A0A()) {
                r3.A01.A09(R.string.str0474, 0);
                r3.A00.A0B(r3.A04.A04());
                return;
            }
            C17190ug r11 = r3.A06;
            String A022 = r11.A02();
            C28371Vv r6 = new C28371Vv("disappearing_mode", new C35081lL[]{new C35081lL("duration", (long) i3)});
            C35081lL[] r5 = new C35081lL[4];
            r5[0] = new C35081lL((Jid) C34791ks.A00, "to");
            C35081lL.A02("id", A022, r5, 1);
            C35081lL.A01("type", "set", r5);
            r5[3] = new C35081lL("xmlns", "disappearing_mode");
            r11.A0G(new AnonymousClass2JA(r3, i3, i4), new C28371Vv(r6, "iq", r5), A022, 277, 20000);
        }
    }

    public final void A36(int i2) {
        if (!this.A0D) {
            int i3 = i2;
            if (i2 == 0) {
                this.A04.setVisibility(8);
                return;
            }
            this.A04.setVisibility(0);
            this.A08.A01((List) null, 0, i3, 0, this.A00, this.A01);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        View view;
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        super.onActivityResult(i4, i5, intent2);
        if (intent == null) {
            return;
        }
        if (i4 == 1 && i5 == -1) {
            List A082 = C16030sJ.A08(C15830rv.class, intent2.getStringArrayListExtra("jids"));
            this.A00 = intent2.getIntExtra("all_contacts_count", 0);
            int i6 = this.A03;
            if (i6 == -1) {
                i6 = this.A07.A04().intValue();
            }
            if (this.A0D) {
                i6 = this.A07.A05.A00().getInt("disappearing_mode_duration_for_chat_picker_int", 0);
            }
            this.A09.A00(A082, i6, this.A02, this.A00, this.A01);
            if (A082.size() > 0 && (view = this.A00) != null) {
                AnonymousClass013 r8 = this.A01;
                long size = (long) A082.size();
                Object[] A1Z = C13690nt.A1Z();
                A1Z[0] = C40491uD.A02(this, i6);
                AnonymousClass000.A1M(A1Z, A082.size(), 1);
                C32291fz A012 = C32291fz.A01(view, r8.A0J(A1Z, R.plurals.plurals0037, size), -1);
                TextView A0M = C13680ns.A0M(A012.A05, R.id.snackbar_text);
                if (A0M != null) {
                    A0M.setSingleLine(false);
                }
                A012.A03();
                return;
            }
            return;
        }
        List A083 = C16030sJ.A08(C15830rv.class, intent2.getStringArrayListExtra("jids"));
        this.A00 = intent2.getIntExtra("all_contacts_count", 0);
        int i7 = this.A03;
        if (i7 == -1) {
            i7 = this.A07.A04().intValue();
        }
        this.A08.A01(A083, 2, i7, 0, this.A00, this.A01);
    }

    public void onBackPressed() {
        A35(this.A03);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout04c5);
        this.A01 = getIntent().getIntExtra("entry_point", 1);
        this.A0D = this.A0A.A00();
        Toolbar toolbar = (Toolbar) AnonymousClass00T.A05(this, R.id.toolbar);
        toolbar.setNavigationIcon((Drawable) C447725m.A00(this, this.A01, R.drawable.ic_back));
        toolbar.setTitle((CharSequence) getString(R.string.str0720));
        toolbar.setBackgroundResource(R.color.color064b);
        toolbar.setNavigationOnClickListener(C110115dX.A06(this, 1));
        toolbar.A0C(this, R.style.style02e9);
        Aem(toolbar);
        TextView textView = (TextView) AnonymousClass00T.A05(this, R.id.dm_setting_header_text);
        View A052 = AnonymousClass00T.A05(this, R.id.dm_setting_header_imageview);
        int i2 = R.string.str0716;
        int i3 = 0;
        if (this.A0D) {
            i2 = R.string.str071b;
            i3 = 8;
        }
        A052.setVisibility(i3);
        C13690nt.A0s(this, textView, i2);
        this.A04 = (TextEmojiLabel) AnonymousClass00T.A05(this, R.id.dm_description);
        TextView textView2 = (TextView) AnonymousClass00T.A05(this, R.id.dm_learn_more);
        String A0d = C13680ns.A0d(this, "by-selecting-them", new Object[1], 0, R.string.str0718);
        String string = getString(R.string.str070b);
        if (this.A0D) {
            this.A04.setText(this.A0C.A07(new AnonymousClass63Z(this), getString(R.string.str0717), "learn-more", R.color.color0659));
            this.A04.setMovementMethod(new AnonymousClass3MF());
            textView2.setVisibility(8);
        } else {
            this.A04.setText(this.A0C.A07(new AnonymousClass63Y(this), A0d, "by-selecting-them", R.color.color0659));
            this.A04.setMovementMethod(new AnonymousClass3MF());
            textView2.setVisibility(0);
            textView2.setText(this.A0C.A06(new C1207963a(this), string, "learn-more"));
            textView2.setMovementMethod(new AnonymousClass3MF());
        }
        this.A03 = -1;
        RadioGroup radioGroup = (RadioGroup) AnonymousClass00T.A05(this, R.id.dm_radio_group);
        int intValue = this.A07.A04().intValue();
        this.A02 = intValue;
        C40491uD.A05(radioGroup, this.A0C, intValue, true, false);
        A36(intValue);
        int[] iArr = this.A0C.A0C(1397) ? AnonymousClass01S.A0E : AnonymousClass01S.A0F;
        ArrayList A0u = AnonymousClass000.A0u();
        for (int i4 = 0; i4 < radioGroup.getChildCount(); i4++) {
            View childAt = radioGroup.getChildAt(i4);
            if (childAt instanceof RadioButton) {
                A0u.add(childAt);
            }
        }
        IDxCListenerShape324S0100000_3_I1 iDxCListenerShape324S0100000_3_I1 = new IDxCListenerShape324S0100000_3_I1(this, 0);
        radioGroup.setOnCheckedChangeListener(iDxCListenerShape324S0100000_3_I1);
        this.A06.A04.A00.A0A(this, new AnonymousClass5z4(iDxCListenerShape324S0100000_3_I1, radioGroup, A0u, iArr));
        this.A08.A00(1, this.A01);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A35(this.A03);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
