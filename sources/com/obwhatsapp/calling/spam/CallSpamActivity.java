package com.obwhatsapp.calling.spam;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01Y;
import X.AnonymousClass10Y;
import X.AnonymousClass5P5;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14770pj;
import X.C14870pt;
import X.C15810rt;
import X.C16000sG;
import X.C16010sH;
import X.C16080sP;
import X.C16150sX;
import X.C16320sq;
import X.C16460t6;
import X.C16760tb;
import X.C18260wP;
import X.C216014s;
import X.C25671Kr;
import X.C32241fu;
import X.C34331k5;
import X.C49132Rg;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxFListenerShape370S0100000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class CallSpamActivity extends C14530pL {
    public C25671Kr A00;
    public C16000sG A01;
    public C15810rt A02;
    public C216014s A03;
    public boolean A04;
    public final AnonymousClass5P5 A05;

    public class ReportSpamOrBlockDialogFragment extends Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment {
        public long A00;
        public CheckBox A01;
        public C14870pt A02;
        public C16760tb A03;
        public AnonymousClass01Y A04;
        public C18260wP A05;
        public C16000sG A06;
        public C16080sP A07;
        public AnonymousClass10Y A08;
        public C16460t6 A09;
        public C16010sH A0A;
        public UserJid A0B;
        public UserJid A0C;
        public C14770pj A0D;
        public C16320sq A0E;
        public String A0F;
        public String A0G;
        public boolean A0H;
        public boolean A0I;
        public boolean A0J;

        public Dialog A1B(Bundle bundle) {
            String A0c;
            Log.i("callspamactivity/createdialog");
            Bundle A042 = A04();
            UserJid nullable = UserJid.getNullable(A042.getString("caller_jid"));
            AnonymousClass00B.A06(nullable);
            this.A0C = nullable;
            this.A0B = UserJid.getNullable(A042.getString("call_creator_jid"));
            C16010sH A082 = this.A06.A08(this.A0C);
            AnonymousClass00B.A06(A082);
            this.A0A = A082;
            String string = A042.getString("call_id");
            AnonymousClass00B.A06(string);
            this.A0F = string;
            this.A00 = A042.getLong("call_duration", -1);
            this.A0H = A042.getBoolean("call_terminator", false);
            this.A0G = A042.getString("call_termination_reason");
            this.A0J = A042.getBoolean("call_video", false);
            IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = new IDxCListenerShape128S0100000_2_I1(this, 29);
            C001000l A0D2 = A0D();
            C32241fu A002 = C32241fu.A00(A0D2);
            if (this.A0I) {
                A0c = A0J(R.string.str1417);
            } else {
                Object[] objArr = new Object[1];
                C16010sH r1 = this.A0A;
                A0c = C13690nt.A0c(this, r1 != null ? this.A07.A08(r1) : "", objArr, 0, R.string.str0227);
            }
            A002.A06(A0c);
            A002.setPositiveButton(R.string.str0e87, iDxCListenerShape128S0100000_2_I1);
            A002.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
            if (this.A0I) {
                View inflate = LayoutInflater.from(A0D2).inflate(R.layout.layout04fc, (ViewGroup) null);
                CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.block_contact);
                this.A01 = checkBox;
                checkBox.setChecked(true);
                A002.setView(inflate);
            }
            return A002.create();
        }
    }

    public CallSpamActivity() {
        this(0);
        this.A05 = new IDxFListenerShape370S0100000_2_I1(this, 2);
    }

    public CallSpamActivity(int i2) {
        this.A04 = false;
        C13680ns.A1G(this, 34);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A02 = C16150sX.A0c(r1);
            this.A03 = (C216014s) r1.AMr.get();
            this.A01 = C16150sX.A0M(r1);
            this.A00 = (C25671Kr) r1.A3D.get();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        UserJid nullable;
        super.onCreate(bundle);
        Bundle A0E = C13690nt.A0E(this);
        String str2 = null;
        if (A0E == null || (nullable = UserJid.getNullable(A0E.getString("caller_jid"))) == null) {
            StringBuilder A0r = AnonymousClass000.A0r("callspamactivity/create/not-creating/bad-jid: ");
            if (A0E != null) {
                str2 = A0E.getString("caller_jid");
            }
            str = AnonymousClass000.A0h(str2, A0r);
        } else {
            C16010sH A08 = this.A01.A08(nullable);
            String string = A0E.getString("call_id");
            if (A08 == null || string == null) {
                str = "callspamactivity/create/not-creating/null-args";
            } else {
                C14570pP.A1U(this);
                setContentView((int) R.layout.layout00dc);
                C34331k5.A04(findViewById(R.id.call_spam_report), this, A0E, 27);
                C34331k5.A04(findViewById(R.id.call_spam_not_spam), this, nullable, 28);
                C34331k5.A04(findViewById(R.id.call_spam_block), this, A0E, 29);
                C25671Kr r0 = this.A00;
                r0.A00.add(this.A05);
                return;
            }
        }
        Log.e(str);
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        C25671Kr r0 = this.A00;
        r0.A00.remove(this.A05);
    }

    public void onStop() {
        super.onStop();
        finish();
    }
}
