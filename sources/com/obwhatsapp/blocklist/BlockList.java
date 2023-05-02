package com.obwhatsapp.blocklist;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass127;
import X.AnonymousClass15P;
import X.AnonymousClass175;
import X.AnonymousClass18R;
import X.AnonymousClass1VA;
import X.AnonymousClass1VD;
import X.AnonymousClass1ZI;
import X.AnonymousClass273;
import X.AnonymousClass2Ao;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SR;
import X.AnonymousClass2SX;
import X.AnonymousClass391;
import X.C005402i;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C17140ub;
import X.C17160ud;
import X.C17200uh;
import X.C17250um;
import X.C18090w8;
import X.C18260wP;
import X.C18290wS;
import X.C18310wU;
import X.C19490yW;
import X.C19780yz;
import X.C19950zG;
import X.C19980zJ;
import X.C20260zl;
import X.C227519d;
import X.C23061Ai;
import X.C23071Aj;
import X.C25781Lc;
import X.C33481ie;
import X.C40781ug;
import X.C42601y5;
import X.C450126q;
import X.C450226r;
import X.C450326s;
import X.C450526u;
import X.C49132Rg;
import X.C56522nn;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape194S0100000_2_I0;
import com.facebook.redex.IDxListenerShape365S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BlockList extends AnonymousClass1VA {
    public C450526u A00;
    public AnonymousClass01Y A01;
    public AnonymousClass127 A02;
    public C17160ud A03;
    public C16000sG A04;
    public C17140ub A05;
    public C16080sP A06;
    public AnonymousClass2Ao A07;
    public C17200uh A08;
    public C19780yz A09;
    public C20260zl A0A;
    public C16490t9 A0B;
    public AnonymousClass18R A0C;
    public AnonymousClass175 A0D;
    public C227519d A0E;
    public C18310wU A0F;
    public C18090w8 A0G;
    public C18290wS A0H;
    public C25781Lc A0I;
    public boolean A0J;
    public final C40781ug A0K;
    public final C33481ie A0L;
    public final AnonymousClass1VD A0M;
    public final Object A0N;
    public final ArrayList A0O;
    public final ArrayList A0P;
    public final Set A0Q;

    public BlockList() {
        this(0);
        this.A0N = new Object();
        this.A0P = new ArrayList();
        this.A0O = new ArrayList();
        this.A0Q = new HashSet();
        this.A0L = new IDxCObserverShape68S0100000_2_I0(this, 2);
        this.A0K = new IDxSObserverShape63S0100000_2_I0(this, 1);
        this.A0M = new IDxPObserverShape81S0100000_2_I0(this, 1);
    }

    public BlockList(int i2) {
        this.A0J = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 25));
    }

    public void A1q() {
        if (!this.A0J) {
            this.A0J = true;
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
            this.A0B = (C16490t9) r1.AQz.get();
            this.A0A = r2.A0I();
            this.A08 = (C17200uh) r1.A52.get();
            this.A03 = (C17160ud) r1.A4t.get();
            this.A04 = (C16000sG) r1.A4x.get();
            this.A06 = (C16080sP) r1.AQ9.get();
            this.A0H = (C18290wS) r1.AIB.get();
            this.A01 = (AnonymousClass01Y) r1.A1w.get();
            this.A09 = (C19780yz) r1.ADI.get();
            this.A0I = new C25781Lc();
            this.A02 = (AnonymousClass127) r1.A3z.get();
            this.A0D = (AnonymousClass175) r1.AH5.get();
            this.A0G = (C18090w8) r1.AI6.get();
            this.A0F = (C18310wU) r1.AHz.get();
            this.A0C = (AnonymousClass18R) r1.ABZ.get();
            this.A05 = (C17140ub) r1.A4y.get();
        }
    }

    public final void A36() {
        TextView textView = (TextView) findViewById(R.id.block_list_primary_text);
        TextView textView2 = (TextView) findViewById(R.id.block_list_help);
        View findViewById = findViewById(R.id.block_list_info);
        if (this.A01.A0Q()) {
            textView2.setVisibility(0);
            findViewById.setVisibility(0);
            Drawable A042 = AnonymousClass00T.A04(this, R.drawable.ic_add_person_tip);
            AnonymousClass00B.A06(A042);
            textView.setText(R.string.str0de6);
            String string = getString(R.string.str0234);
            textView2.setText(C56522nn.A01(textView2.getPaint(), AnonymousClass2SR.A06(A042, AnonymousClass00T.A00(this, R.color.tag_accessibility_heading)), string, "%s"));
            return;
        }
        textView2.setVisibility(8);
        findViewById.setVisibility(8);
        boolean A022 = C18260wP.A02(this);
        int i2 = R.string.str0dc2;
        if (A022) {
            i2 = R.string.str0dc3;
        }
        textView.setText(i2);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 10) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            UserJid nullable = UserJid.getNullable(intent.getStringExtra("contact"));
            AnonymousClass00B.A06(nullable);
            this.A01.A0G(this, (AnonymousClass1ZI) null, this.A04.A0A(nullable), (String) null, (String) null, (String) null, true, true);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        C227519d r2;
        MenuItem menuItem2 = menuItem;
        C450226r r1 = (C450226r) ADA().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem2.getMenuInfo()).position);
        if (menuItem2.getItemId() != 0) {
            return super.onContextItemSelected(menuItem2);
        }
        int ACv = r1.ACv();
        if (ACv != 0) {
            if (ACv == 1 && (r2 = this.A0E) != null) {
                r2.Ahg(this, new IDxListenerShape365S0100000_2_I0(this, 1), this.A0F, ((C450326s) r1).A00, false);
            }
            return true;
        }
        C16010sH r5 = ((C450126q) r1).A00;
        AnonymousClass01Y r22 = this.A01;
        AnonymousClass00B.A06(r5);
        r22.A0G(this, (AnonymousClass1ZI) null, r5, (String) null, (String) null, (String) null, false, true);
        C20260zl r12 = this.A0A;
        C16320sq r15 = this.A05;
        C42601y5.A01(this.A09, r12, this.A0B, (C15830rv) r5.A08(C15830rv.class), r15, 5, (Integer) null, 2);
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str0233);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        setContentView((int) R.layout.layout0099);
        this.A07 = this.A08.A04(this, "block-list-activity");
        if (this.A0G.A09() && this.A0D.A0E()) {
            C227519d AB4 = this.A0H.A03().AB4();
            this.A0E = AB4;
            if (AB4 != null && AB4.AfE()) {
                this.A0E.A8v(new IDxListenerShape365S0100000_2_I0(this, 0), this.A0F);
            }
        }
        A36();
        C20260zl r9 = this.A0A;
        C450526u r3 = new C450526u(this, this.A03, this.A06, this.A07, this.A01, r9, this.A0I, this.A0O);
        this.A00 = r3;
        A35(r3);
        ADA().setEmptyView(findViewById(R.id.block_list_empty));
        ListView ADA = ADA();
        ADA.setDivider((Drawable) null);
        yo.hideDiv(ADA);
        ADA().setClipToPadding(false);
        registerForContextMenu(ADA());
        ADA().setOnItemClickListener(new IDxCListenerShape194S0100000_2_I0(this, 0));
        this.A05.A02(this.A0L);
        this.A02.A02(this.A0K);
        this.A0C.A02(this.A0M);
        this.A01.A0N((AnonymousClass273) null);
        this.A05.Acl(new RunnableRunnableShape4S0100000_I0_3(this, 19));
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        String A082;
        C450226r r2 = (C450226r) ADA().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        int ACv = r2.ACv();
        if (ACv != 0) {
            if (ACv == 1) {
                A082 = ((C450326s) r2).A00;
            }
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
        A082 = this.A06.A08(((C450126q) r2).A00);
        contextMenu.add(0, 0, 0, getString(R.string.str0236, new Object[]{A082}));
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_settings_add_blocked_contact, 0, R.string.str0cf9).setIcon(R.drawable.ic_action_add_person).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.A00();
        this.A05.A03(this.A0L);
        this.A02.A03(this.A0K);
        this.A0C.A03(this.A0M);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_settings_add_blocked_contact) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.A0P.iterator();
            while (it.hasNext()) {
                C15830rv r0 = ((C16010sH) it.next()).A0E;
                AnonymousClass00B.A06(r0);
                arrayList.add(r0.getRawString());
            }
            AnonymousClass391 r1 = new AnonymousClass391(this);
            r1.A02 = true;
            r1.A0Q = arrayList;
            r1.A02 = Boolean.TRUE;
            startActivityForResult(r1.A00(), 10);
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return true;
    }
}
