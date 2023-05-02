package com.obwhatsapp.shareinvitelink;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass2Rf;
import X.AnonymousClass3M8;
import X.AnonymousClass41U;
import X.AnonymousClass440;
import X.AnonymousClass4R5;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16050sL;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C17190ug;
import X.C17240ul;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C45812Be;
import X.C45822Bg;
import X.C45862Bk;
import X.C45872Bl;
import X.C49132Rg;
import X.C51232bE;
import X.C51242bF;
import X.C55812kR;
import X.C63163Gj;
import X.C70483h0;
import X.C70493h1;
import X.C70503h2;
import X.C812647m;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxBReceiverShape7S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;
import com.obwhatsapp.growthlock.InviteLinkUnavailableDialogFragment;
import com.whatsapp.util.Log;
import java.util.EnumMap;

public class ShareInviteLinkActivity extends C45822Bg implements C45862Bk, C45872Bl {
    public C55812kR A00;
    public C55812kR A01;
    public C70483h0 A02;
    public C70503h2 A03;
    public C70493h1 A04;
    public C16000sG A05;
    public C16080sP A06;
    public C16490t9 A07;
    public C17240ul A08;
    public C16050sL A09;
    public C17190ug A0A;
    public String A0B;
    public boolean A0C;
    public final BroadcastReceiver A0D;
    public final C45812Be A0E;

    public ShareInviteLinkActivity() {
        this(0);
        this.A0D = new IDxBReceiverShape7S0100000_2_I0(this, 17);
        this.A0E = new C45812Be(this);
    }

    public ShareInviteLinkActivity(int i2) {
        this.A0C = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 94));
    }

    public void A1q() {
        if (!this.A0C) {
            this.A0C = true;
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
            this.A07 = (C16490t9) r1.AQz.get();
            this.A0A = (C17190ug) r1.AEu.get();
            this.A05 = (C16000sG) r1.A4x.get();
            this.A06 = (C16080sP) r1.AQ9.get();
            this.A08 = (C17240ul) r1.ABK.get();
        }
    }

    public final void A3A() {
        String str;
        StringBuilder sb = new StringBuilder("invitelink/printlink/");
        sb.append(this.A0B);
        sb.append(" jid:");
        sb.append(this.A09);
        Log.i(sb.toString());
        if (this.A09 != null && this.A0B != null) {
            try {
                EnumMap enumMap = new EnumMap(AnonymousClass41U.class);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("whatsapp://chat?code=");
                sb2.append(this.A0B);
                AnonymousClass4R5 r5 = C51242bF.A00(C51232bE.A03, sb2.toString(), enumMap).A04;
                C16010sH A082 = this.A05.A08(this.A09);
                if (A082 == null) {
                    str = "invitelink/print/no-contact";
                } else {
                    String string = getString(R.string.str1602, new Object[]{this.A06.A08(A082)});
                    PrintManager A002 = AnonymousClass01V.A00(this);
                    if (A002 == null) {
                        str = "invitelink/print/no-print-manager";
                    } else {
                        A002.print(string, new AnonymousClass3M8(this, r5, this.A0B, string), (PrintAttributes) null);
                        return;
                    }
                }
                Log.e(str);
            } catch (AnonymousClass440 e2) {
                Log.i("invitelink/", e2);
            }
        }
    }

    public final void A3B(String str) {
        String obj;
        this.A0B = str;
        if (TextUtils.isEmpty(str)) {
            obj = null;
        } else {
            StringBuilder sb = new StringBuilder("https://chat.whatsapp.com/");
            sb.append(str);
            obj = sb.toString();
        }
        if (!TextUtils.isEmpty(str)) {
            this.A02.setText(obj);
            boolean A0m = this.A08.A0m(this.A09);
            int i2 = R.string.str1600;
            if (A0m) {
                i2 = R.string.str1601;
            }
            String string = getString(i2, new Object[]{obj});
            C16010sH A082 = this.A05.A08(this.A09);
            if (A082 == null) {
                Log.e("invitelink/share/no-contact");
            } else {
                C70503h2 r3 = this.A03;
                r3.A02 = string;
                r3.A01 = getString(R.string.str1603, new Object[]{this.A06.A08(A082)});
                this.A03.A00 = getString(R.string.str1605);
            }
            this.A04.A00 = string;
            this.A02.A00 = obj;
            return;
        }
        A3C(false);
        this.A02.setText(" \n ");
    }

    public final void A3C(boolean z2) {
        this.A02.setEnabled(z2);
        this.A02.A00.setEnabled(z2);
        this.A01.A00.setEnabled(z2);
        this.A03.A00.setEnabled(z2);
        this.A00.A00.setEnabled(z2);
        this.A04.A00.setEnabled(z2);
    }

    public final void A3D(boolean z2) {
        StringBuilder sb = new StringBuilder("invitelink/sendgetlink/recreate:");
        sb.append(z2);
        Log.i(sb.toString());
        if (z2) {
            A3C(false);
            A1b(true);
        }
        C63163Gj r1 = new C63163Gj(this.A05, this, this.A0A, z2);
        C16050sL r0 = this.A09;
        AnonymousClass00B.A06(r0);
        r1.A00(r0);
    }

    public void ASf(int i2, String str, boolean z2) {
        A3C(true);
        A1b(false);
        if (str != null) {
            StringBuilder sb = new StringBuilder("invitelink/gotcode/");
            sb.append(str);
            sb.append(" recreate:");
            sb.append(z2);
            Log.i(sb.toString());
            C17240ul r0 = this.A08;
            r0.A11.put(this.A09, str);
            A3B(str);
            if (z2) {
                Afg(R.string.str1453);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("invitelink/failed/");
        sb2.append(i2);
        Log.i(sb2.toString());
        if (i2 == 436) {
            Afc(InviteLinkUnavailableDialogFragment.A01(true, true));
            C17240ul r02 = this.A08;
            r02.A11.remove(this.A09);
            A3B((String) null);
            return;
        }
        this.A05.A09(C812647m.A00(i2, this.A08.A0m(this.A09)), 0);
        if (TextUtils.isEmpty(this.A0B)) {
            finish();
        }
    }

    public void Ace() {
        A3D(true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str1604);
        A39();
        C70493h1 A38 = A38();
        this.A04 = A38;
        A38.A02 = new RunnableRunnableShape10S0200000_I0_8(this, 32, 4);
        C70483h0 A36 = A36();
        this.A02 = A36;
        A36.A02 = new RunnableRunnableShape10S0200000_I0_8(this, 32, 1);
        C70503h2 A37 = A37();
        this.A03 = A37;
        A37.A02 = new RunnableRunnableShape10S0200000_I0_8(this, 32, 3);
        C55812kR r1 = new C55812kR();
        this.A00 = r1;
        r1.A00 = A35();
        this.A00.A00(new ViewOnClickCListenerShape13S0100000_I0_6(this, 7), getString(R.string.str15b8), R.drawable.ic_scan_qr);
        this.A00.A00.setVisibility(0);
        C55812kR r12 = new C55812kR();
        this.A01 = r12;
        r12.A00 = A35();
        this.A01.A00(new ViewOnClickCListenerShape13S0100000_I0_6(this, 6), getString(R.string.str1472), R.drawable.ic_revoke_invite);
        C16050sL A052 = C16050sL.A05(getIntent().getStringExtra("jid"));
        AnonymousClass00B.A06(A052);
        this.A09 = A052;
        boolean A0m = this.A08.A0m(A052);
        TextView textView = (TextView) findViewById(R.id.share_link_description);
        int i2 = R.string.str0bb6;
        if (A0m) {
            i2 = R.string.str0bb7;
        }
        textView.setText(i2);
        if (this.A05.A08(this.A09) == null) {
            StringBuilder sb = new StringBuilder("invitelink/sharelink/no-contact ");
            sb.append(this.A09);
            Log.e(sb.toString());
            finish();
            return;
        }
        A3D(false);
        if (Build.VERSION.SDK_INT >= 18) {
            registerReceiver(this.A0D, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
        }
        C17240ul r0 = this.A08;
        r0.A0h.A02(this.A0E);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (NfcAdapter.getDefaultAdapter(this) != null) {
            menu.add(0, R.id.menuitem_write_tag, 0, R.string.str1ba3);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 18) {
            unregisterReceiver(this.A0D);
        }
        C17240ul r0 = this.A08;
        r0.A0h.A03(this.A0E);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_print) {
            A3A();
        } else if (itemId != R.id.menuitem_write_tag) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            StringBuilder sb = new StringBuilder("invitelink/writetag/");
            sb.append(this.A0B);
            sb.append(" jid:");
            sb.append(this.A09);
            Log.i(sb.toString());
            if (!(this.A09 == null || (str = this.A0B) == null)) {
                Intent intent = new Intent();
                intent.setClassName(getPackageName(), "com.obwhatsapp.writenfctag.WriteNfcTagActivity");
                intent.putExtra("mime", "application/com.obwhatsapp.join");
                intent.putExtra("data", str);
                startActivity(intent);
                return true;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            r0 = 2131364692(0x7f0a0b54, float:1.8349228E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            if (r2 == 0) goto L_0x001a
            android.nfc.NfcAdapter r0 = android.nfc.NfcAdapter.getDefaultAdapter(r3)
            if (r0 == 0) goto L_0x0016
            boolean r1 = r0.isEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r2.setEnabled(r0)
        L_0x001a:
            boolean r0 = super.onPrepareOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.shareinvitelink.ShareInviteLinkActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    public void onResume() {
        super.onResume();
        C17240ul r0 = this.A08;
        A3B((String) r0.A11.get(this.A09));
    }
}
