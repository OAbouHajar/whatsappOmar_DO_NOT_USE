package com.obwhatsapp.contact.picker.invite;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass026;
import X.AnonymousClass027;
import X.AnonymousClass04o;
import X.AnonymousClass15P;
import X.AnonymousClass19Y;
import X.AnonymousClass1BI;
import X.AnonymousClass1BJ;
import X.AnonymousClass1VA;
import X.AnonymousClass267;
import X.AnonymousClass2AW;
import X.AnonymousClass2AX;
import X.AnonymousClass2AY;
import X.AnonymousClass2Ao;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SX;
import X.AnonymousClass2XK;
import X.AnonymousClass2XL;
import X.AnonymousClass3A2;
import X.AnonymousClass3QC;
import X.C001500q;
import X.C004601z;
import X.C005402i;
import X.C006602z;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17140ub;
import X.C17160ud;
import X.C17200uh;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C23131Ap;
import X.C33481ie;
import X.C49132Rg;
import X.C93874ju;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape193S0100000_1_I0;
import com.facebook.redex.IDxFunctionShape205S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxObserverShape36S0200000_2_I0;
import com.facebook.redex.IDxTListenerShape170S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;
import java.util.ArrayList;
import org.wawebrtc.MediaCodecVideoEncoder;

public class InviteNonWhatsAppContactPickerActivity extends AnonymousClass1VA implements AnonymousClass2AW, AnonymousClass2AX {
    public MenuItem A00;
    public View A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public Button A06;
    public TextView A07;
    public Toolbar A08;
    public AnonymousClass267 A09;
    public AnonymousClass1BJ A0A;
    public AnonymousClass19Y A0B;
    public C17160ud A0C;
    public C16000sG A0D;
    public C17140ub A0E;
    public C16080sP A0F;
    public AnonymousClass2Ao A0G;
    public C17200uh A0H;
    public AnonymousClass1BI A0I;
    public AnonymousClass2XK A0J;
    public AnonymousClass2AY A0K;
    public AnonymousClass013 A0L;
    public C23131Ap A0M;
    public boolean A0N;
    public final C33481ie A0O;

    public InviteNonWhatsAppContactPickerActivity() {
        this(0);
        this.A0O = new IDxCObserverShape68S0100000_2_I0(this, 11);
    }

    public InviteNonWhatsAppContactPickerActivity(int i2) {
        this.A0N = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 45));
    }

    public void A1q() {
        if (!this.A0N) {
            this.A0N = true;
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
            this.A00 = new AnonymousClass2SX();
            this.A0H = (C17200uh) r1.A52.get();
            this.A0A = (AnonymousClass1BJ) r1.AOm.get();
            this.A0C = (C17160ud) r1.A4t.get();
            this.A0D = (C16000sG) r1.A4x.get();
            this.A0M = (C23131Ap) r1.ADU.get();
            this.A0F = (C16080sP) r1.AQ9.get();
            this.A0L = (AnonymousClass013) r1.AR8.get();
            this.A0E = (C17140ub) r1.A4y.get();
            this.A0I = (AnonymousClass1BI) r1.ACt.get();
            this.A0B = (AnonymousClass19Y) r1.A4r.get();
        }
    }

    public final View A36() {
        View inflate = getLayoutInflater().inflate(R.layout.layout0144, (ViewGroup) null, false);
        AnonymousClass3A2.A01(inflate, R.drawable.ic_action_share, 0, R.drawable.green_circle, R.string.str1606);
        inflate.setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 16));
        return inflate;
    }

    public final Integer A37() {
        int intExtra = getIntent().getIntExtra("invite_source", 0);
        if (intExtra == 0) {
            return null;
        }
        return Integer.valueOf(intExtra);
    }

    public final void A38(boolean z2) {
        this.A05.addView(A36());
        this.A05.setVisibility(0);
        View inflate = getLayoutInflater().inflate(R.layout.layout0398, (ViewGroup) null, false);
        ((TextView) C004601z.A0E(inflate, R.id.title)).setText(R.string.str1cd5);
        this.A04.addView(inflate);
        this.A04.setVisibility(0);
        this.A01.setVisibility(0);
        if (z2) {
            this.A07.setText(R.string.str0df9);
            this.A06.setVisibility(8);
            return;
        }
        AnonymousClass1BI r3 = this.A0I;
        Integer A37 = A37();
        AnonymousClass2XL r1 = new AnonymousClass2XL();
        r1.A03 = 1;
        r1.A04 = A37;
        r1.A00 = Boolean.TRUE;
        r3.A03.A06(r1);
        this.A07.setText(R.string.str11c2);
        this.A06.setVisibility(0);
    }

    public void AU5(String str) {
        this.A0K.A0D.A0B(str);
    }

    public void onBackPressed() {
        AnonymousClass027 r1 = this.A0K.A07;
        if (r1.A01() == null || !((Boolean) r1.A01()).booleanValue()) {
            super.onBackPressed();
        } else {
            this.A0K.A07.A0B(false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0363);
        setTitle(R.string.str1798);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.A08 = toolbar;
        Aem(toolbar);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        x2.A0O(true);
        AnonymousClass013 r11 = this.A0L;
        this.A09 = new AnonymousClass267(this, findViewById(R.id.search_holder), new IDxTListenerShape170S0100000_2_I0(this, 7), this.A08, r11);
        AnonymousClass2Ao A042 = this.A0H.A04(this, "invite-non-wa-contact-picker");
        this.A0G = A042;
        AnonymousClass2XK r6 = new AnonymousClass2XK(this, this.A0C, A042, this.A0L, new ArrayList());
        this.A0J = r6;
        ListView ADA = ADA();
        View A36 = A36();
        this.A02 = A36;
        this.A03 = A36;
        ADA.addHeaderView(A36);
        ADA.setAdapter(r6);
        registerForContextMenu(ADA);
        ADA.setOnItemClickListener(new IDxCListenerShape193S0100000_1_I0(this, 1));
        View A052 = AnonymousClass00T.A05(this, R.id.init_contacts_progress);
        this.A01 = AnonymousClass00T.A05(this, R.id.empty_view);
        this.A05 = (ViewGroup) AnonymousClass00T.A05(this, R.id.share_link_header);
        this.A04 = (ViewGroup) AnonymousClass00T.A05(this, R.id.contacts_section);
        this.A07 = (TextView) AnonymousClass00T.A05(this, R.id.invite_empty_description);
        Button button = (Button) AnonymousClass00T.A05(this, R.id.button_open_permission_settings);
        this.A06 = button;
        button.setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 15));
        AnonymousClass2AY r62 = (AnonymousClass2AY) new C006602z((AnonymousClass04o) new AnonymousClass3QC(this), (C001500q) this).A01(AnonymousClass2AY.class);
        this.A0K = r62;
        r62.A08.A0B(0);
        AnonymousClass027 r5 = r62.A06;
        r5.A0B(new ArrayList());
        C23131Ap r2 = r62.A0C;
        AnonymousClass026 r3 = r62.A02;
        r2.A00(new IDxFunctionShape205S0100000_1_I0(r62, 0), r5, r3);
        r62.A03.A0D(r3, new IDxObserverShape115S0100000_2_I0((Object) r62, 147));
        this.A0K.A0D.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 145));
        this.A0K.A08.A0A(this, new IDxObserverShape36S0200000_2_I0(A052, 2, this));
        this.A0K.A07.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, (int) MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT));
        this.A0K.A05.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 142));
        this.A0K.A04.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 143));
        this.A0E.A02(this.A0O);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass267 r3 = this.A09;
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, r3.A05.getString(R.string.str1d7c)).setIcon(R.drawable.ic_action_search);
        icon.setShowAsAction(10);
        icon.setOnActionExpandListener(new C93874ju(this, r3));
        this.A00 = icon;
        this.A0K.A03.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 146));
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0E.A03(this.A0O);
        AnonymousClass2Ao r0 = this.A0G;
        if (r0 != null) {
            r0.A00();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            this.A0K.A07.A0B(true);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.A0K.A05.A0B(Boolean.valueOf(this.A0B.A00()));
    }
}
