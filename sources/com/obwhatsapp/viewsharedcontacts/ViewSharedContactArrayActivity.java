package com.obwhatsapp.viewsharedcontacts;

import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass1G1;
import X.AnonymousClass1L6;
import X.AnonymousClass1QZ;
import X.AnonymousClass2Ao;
import X.AnonymousClass2EA;
import X.AnonymousClass2Rf;
import X.AnonymousClass370;
import X.AnonymousClass4J2;
import X.C005402i;
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
import X.C16490t9;
import X.C16760tb;
import X.C16820th;
import X.C16980tz;
import X.C17200uh;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C204310c;
import X.C23061Ai;
import X.C23071Aj;
import X.C25681Ks;
import X.C28381Vw;
import X.C38621r6;
import X.C39701sv;
import X.C45902Bo;
import X.C49132Rg;
import X.C64903Sc;
import X.C84924Mk;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class ViewSharedContactArrayActivity extends C14530pL {
    public AnonymousClass1G1 A00;
    public C16760tb A01;
    public C204310c A02;
    public C16000sG A03;
    public AnonymousClass1L6 A04;
    public C16080sP A05;
    public AnonymousClass2Ao A06;
    public C17200uh A07;
    public C16980tz A08;
    public C16260sj A09;
    public AnonymousClass013 A0A;
    public C16820th A0B;
    public C16460t6 A0C;
    public C16490t9 A0D;
    public C15830rv A0E;
    public C25681Ks A0F;
    public AnonymousClass1QZ A0G;
    public List A0H;
    public Pattern A0I;
    public C39701sv A0J;
    public boolean A0K;
    public boolean A0L;
    public final ArrayList A0M;
    public final ArrayList A0N;
    public final ArrayList A0O;
    public final List A0P;

    public ViewSharedContactArrayActivity() {
        this(0);
        this.A0M = new ArrayList();
        this.A0N = new ArrayList();
        this.A0P = new ArrayList();
        this.A0O = new ArrayList();
    }

    public ViewSharedContactArrayActivity(int i2) {
        this.A0K = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, AnonymousClass2EA.A03));
    }

    public static final AnonymousClass4J2 A02(SparseArray sparseArray, int i2) {
        AnonymousClass4J2 r0 = (AnonymousClass4J2) sparseArray.get(i2);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass4J2 r02 = new AnonymousClass4J2();
        sparseArray.put(i2, r02);
        return r02;
    }

    public static /* synthetic */ String A03(ViewSharedContactArrayActivity viewSharedContactArrayActivity, Class cls, int i2) {
        try {
            return viewSharedContactArrayActivity.A0A.A00.getResources().getString(((Integer) cls.getMethod("getTypeLabelResource", new Class[]{Integer.TYPE}).invoke((Object) null, new Object[]{Integer.valueOf(i2)})).intValue());
        } catch (Exception e2) {
            Log.e((Throwable) e2);
            return null;
        }
    }

    public static final void A09(C64903Sc r3) {
        r3.A01.setClickable(false);
        ImageView imageView = r3.A04;
        imageView.setVisibility(8);
        imageView.setClickable(false);
        ImageView imageView2 = r3.A05;
        imageView2.setVisibility(8);
        imageView2.setClickable(false);
    }

    public static /* synthetic */ void A0A(C64903Sc r4, ViewSharedContactArrayActivity viewSharedContactArrayActivity, String str, String str2, int i2, int i3, boolean z2) {
        TextView textView = r4.A07;
        if (i3 > 1) {
            textView.setMaxLines(i3);
            textView.setSingleLine(false);
        } else {
            textView.setSingleLine(true);
        }
        C45902Bo.A03(textView);
        if (!str.equalsIgnoreCase("null")) {
            textView.setText(str);
        }
        if (str2 == null || str2.equalsIgnoreCase("null")) {
            r4.A06.setText(R.string.str0e04);
        } else {
            r4.A06.setText(str2);
        }
        r4.A03.setImageResource(i2);
        if (viewSharedContactArrayActivity.A0L) {
            CheckBox checkBox = r4.A02;
            checkBox.setChecked(z2);
            checkBox.setClickable(false);
            checkBox.setVisibility(0);
            r4.A00.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(viewSharedContactArrayActivity, 13));
        }
    }

    public void A1q() {
        if (!this.A0K) {
            this.A0K = true;
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
            this.A08 = (C16980tz) r1.AQB.get();
            this.A0D = (C16490t9) r1.AQz.get();
            this.A01 = (C16760tb) r1.APV.get();
            this.A0G = (AnonymousClass1QZ) r1.APn.get();
            this.A02 = (C204310c) r1.A3O.get();
            this.A07 = (C17200uh) r1.A52.get();
            this.A03 = (C16000sG) r1.A4x.get();
            this.A05 = (C16080sP) r1.AQ9.get();
            this.A0A = (AnonymousClass013) r1.AR8.get();
            this.A0C = (C16460t6) r1.A5k.get();
            this.A00 = (AnonymousClass1G1) r1.AJl.get();
            this.A04 = (AnonymousClass1L6) r1.AMC.get();
            this.A0F = (C25681Ks) r1.A0Q.get();
            this.A0B = (C16820th) r1.A3B.get();
            this.A09 = (C16260sj) r1.AQe.get();
        }
    }

    public void A2S(int i2) {
        if (i2 == R.string.str0856) {
            finish();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            if (i3 == -1 && this.A0J != null) {
                String str = null;
                if (!(intent == null || intent.getData() == null)) {
                    str = intent.getData().getLastPathSegment();
                }
                this.A04.A02(this.A0J.A02(), str, this.A0O, this.A0P);
            }
            this.A0F.A00();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
        }
        setContentView((int) R.layout.layout05dc);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("vcard");
        C28381Vw A0E2 = C38621r6.A0E(intent.getBundleExtra("vcard_message"));
        List stringArrayListExtra = intent.getStringArrayListExtra("vcard_array");
        Uri uri = (Uri) intent.getParcelableExtra("vcard_uri");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("vcard_sender_infos");
        if (stringExtra != null) {
            stringArrayListExtra = Collections.singletonList(stringExtra);
        }
        C84924Mk r8 = new C84924Mk(uri, A0E2, stringArrayListExtra, parcelableArrayListExtra);
        this.A06 = this.A07.A04(this, "view-shared-contact-array");
        this.A0L = getIntent().getBooleanExtra("edit_mode", true);
        this.A0E = C15830rv.A02(getIntent().getStringExtra("jid"));
        this.A0H = r8.A02;
        this.A05.Ack(new AnonymousClass370(this.A03, this.A08, this.A0A, this.A0B, this.A0G, r8, this), new Void[0]);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.A00();
    }

    public final void toggleCheckBox(View view) {
        CompoundButton compoundButton = (CompoundButton) view.findViewById(R.id.cbx);
        boolean z2 = true;
        if (compoundButton.isChecked()) {
            z2 = false;
        }
        compoundButton.setChecked(z2);
        ((AnonymousClass4J2) view.getTag()).A01 = compoundButton.isChecked();
    }
}
