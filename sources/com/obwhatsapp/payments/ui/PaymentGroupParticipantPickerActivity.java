package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01Y;
import X.AnonymousClass175;
import X.AnonymousClass267;
import X.AnonymousClass2Ao;
import X.AnonymousClass2St;
import X.AnonymousClass3Q5;
import X.AnonymousClass5xP;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C110315ds;
import X.C114315nZ;
import X.C114385ng;
import X.C116765ru;
import X.C119715yv;
import X.C1222969a;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16980tz;
import X.C17140ub;
import X.C17200uh;
import X.C18090w8;
import X.C18290wS;
import X.C25781Lc;
import X.C33481ie;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxTListenerShape172S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.IDxCObserverShape70S0100000_3_I1;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class PaymentGroupParticipantPickerActivity extends C14530pL {
    public ListView A00;
    public AnonymousClass267 A01;
    public AnonymousClass01Y A02;
    public C16000sG A03;
    public C17140ub A04;
    public C16080sP A05;
    public AnonymousClass2Ao A06;
    public C17200uh A07;
    public C16980tz A08;
    public C16070sO A09;
    public GroupJid A0A;
    public AnonymousClass175 A0B;
    public C18090w8 A0C;
    public C18290wS A0D;
    public C114385ng A0E;
    public C110315ds A0F;
    public C114315nZ A0G;
    public AnonymousClass3Q5 A0H;
    public C25781Lc A0I;
    public String A0J;
    public ArrayList A0K;
    public boolean A0L;
    public final C33481ie A0M;
    public final ArrayList A0N;

    public PaymentGroupParticipantPickerActivity() {
        this(0);
        this.A0N = AnonymousClass000.A0u();
        this.A0M = new IDxCObserverShape70S0100000_3_I1(this, 2);
    }

    public PaymentGroupParticipantPickerActivity(int i2) {
        this.A0L = false;
        C110105dW.A0t(this, 91);
    }

    public void A1q() {
        if (!this.A0L) {
            this.A0L = true;
            C49132Rg A0C2 = C110105dW.A0C(this);
            C16150sX r1 = A0C2.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C2, r1, this, C110105dW.A0F(r1));
            this.A08 = (C16980tz) r1.AQB.get();
            this.A07 = C16150sX.A0R(r1);
            this.A03 = (C16000sG) r1.A4x.get();
            this.A05 = (C16080sP) r1.AQ9.get();
            this.A0D = C110115dX.A0Q(r1);
            this.A02 = (AnonymousClass01Y) r1.A1w.get();
            this.A04 = (C17140ub) r1.A4y.get();
            this.A0I = new C25781Lc();
            this.A0B = (AnonymousClass175) r1.AH5.get();
            this.A0C = C16150sX.A10(r1);
            this.A09 = (C16070sO) r1.ABY.get();
        }
    }

    public final void A35(Intent intent, UserJid userJid) {
        Intent A042 = C110105dW.A04(this.A08.A00, this.A0D.A03().AFu());
        if (intent != null) {
            A042.putExtras(intent);
        }
        A042.putExtra("extra_jid", this.A0A.getRawString());
        A042.putExtra("extra_receiver_jid", C16030sJ.A03(userJid));
        A042.putExtra("extra_referral_screen", "payment_contact_picker");
        finish();
        startActivity(A042);
    }

    public void onBackPressed() {
        if (this.A01.A06()) {
            this.A01.A05(true);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        C116765ru r0 = (C116765ru) this.A00.getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (r0 != null) {
            C16010sH r2 = r0.A00;
            if (menuItem.getItemId() == 0) {
                AnonymousClass01Y r1 = this.A02;
                Jid A082 = r2.A08(UserJid.class);
                AnonymousClass00B.A06(A082);
                r1.A0K(this, (UserJid) A082);
                return true;
            }
        }
        return super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        C110105dW.A0l(this);
        super.onCreate(bundle);
        this.A0H = C110115dX.A0U(this);
        this.A06 = this.A07.A04(this, "payment-group-participant-picker");
        setContentView((int) R.layout.layout044f);
        this.A0A = GroupJid.getNullable(getIntent().getStringExtra("extra_jid"));
        Intent intent = getIntent();
        if (intent != null) {
            this.A0J = intent.getStringExtra("referral_screen");
        }
        this.A0F = new C110315ds(this, this, this.A0N);
        ListView listView = (ListView) findViewById(R.id.group_participant_picker_list);
        this.A00 = listView;
        listView.setAdapter(this.A0F);
        this.A00.setOnItemClickListener(new C119715yv(intent, this));
        registerForContextMenu(this.A00);
        this.A04.A02(this.A0M);
        Toolbar A092 = C110105dW.A09(this);
        Aem(A092);
        this.A01 = new AnonymousClass267(this, findViewById(R.id.search_holder), new IDxTListenerShape172S0100000_3_I1(this, 1), A092, this.A01);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0B(R.string.str107b);
            x2.A0N(true);
        }
        C114385ng r1 = this.A0E;
        if (r1 != null) {
            r1.A06(true);
            this.A0E = null;
        }
        C114315nZ r12 = new C114315nZ(this);
        this.A0G = r12;
        C13680ns.A1U(r12, this.A05);
        Afq(R.string.str13db);
        C1222969a ACC = this.A0D.A03().ACC();
        if (ACC != null) {
            AnonymousClass5xP.A02((AnonymousClass2St) null, ACC, "payment_contact_picker", this.A0J);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C16010sH r4 = ((C116765ru) ((AdapterView) view).getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position)).A00;
        if (this.A02.A0V(C110115dX.A0I(r4))) {
            contextMenu.add(0, 0, 0, C13680ns.A0d(this, this.A05.A08(r4), C13680ns.A1b(), 0, R.string.str0236));
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_search, 0, getString(R.string.str1d7c)).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.A00();
        this.A04.A03(this.A0M);
        C114385ng r0 = this.A0E;
        if (r0 != null) {
            r0.A06(true);
            this.A0E = null;
        }
        C114315nZ r02 = this.A0G;
        if (r02 != null) {
            r02.A06(true);
            this.A0G = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public boolean onSearchRequested() {
        this.A01.A02();
        return false;
    }
}
