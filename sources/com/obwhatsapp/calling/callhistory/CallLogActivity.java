package com.obwhatsapp.calling.callhistory;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass127;
import X.AnonymousClass152;
import X.AnonymousClass15P;
import X.AnonymousClass18R;
import X.AnonymousClass1D0;
import X.AnonymousClass1VD;
import X.AnonymousClass29T;
import X.AnonymousClass2Rf;
import X.C004601z;
import X.C005402i;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C17140ub;
import X.C17160ud;
import X.C17240ul;
import X.C17250um;
import X.C18260wP;
import X.C19230xz;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C204310c;
import X.C216114t;
import X.C23061Ai;
import X.C23071Aj;
import X.C25681Ks;
import X.C25691Kt;
import X.C25781Lc;
import X.C28891Zc;
import X.C30521cU;
import X.C32241fu;
import X.C33481ie;
import X.C35011lE;
import X.C37831po;
import X.C40781ug;
import X.C447725m;
import X.C49132Rg;
import X.C54602hp;
import X.C56722oP;
import X.C607335p;
import X.C62043Bk;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape252S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.blocklist.BlockConfirmationDialogFragment;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0110000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape0S1100000_I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class CallLogActivity extends C14530pL {
    public View A00;
    public ImageButton A01;
    public ImageButton A02;
    public ImageView A03;
    public ListView A04;
    public TextView A05;
    public C30521cU A06;
    public AnonymousClass01Y A07;
    public C607335p A08;
    public C204310c A09;
    public AnonymousClass127 A0A;
    public C17160ud A0B;
    public C16000sG A0C;
    public C17140ub A0D;
    public C16080sP A0E;
    public AnonymousClass152 A0F;
    public C19230xz A0G;
    public C16260sj A0H;
    public AnonymousClass1D0 A0I;
    public C216114t A0J;
    public C16070sO A0K;
    public C16010sH A0L;
    public C16490t9 A0M;
    public C17240ul A0N;
    public AnonymousClass18R A0O;
    public C15830rv A0P;
    public C25781Lc A0Q;
    public C25681Ks A0R;
    public C25691Kt A0S;
    public ArrayList A0T;
    public boolean A0U;
    public final C40781ug A0V;
    public final C33481ie A0W;
    public final AnonymousClass1VD A0X;

    public CallLogActivity() {
        this(0);
        this.A0W = new IDxCObserverShape68S0100000_2_I0(this, 4);
        this.A0V = new IDxSObserverShape63S0100000_2_I0(this, 2);
        this.A0X = new IDxPObserverShape81S0100000_2_I0(this, 2);
    }

    public CallLogActivity(int i2) {
        this.A0U = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 30));
    }

    public void A1q() {
        if (!this.A0U) {
            this.A0U = true;
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
            this.A0M = (C16490t9) r1.AQz.get();
            this.A09 = (C204310c) r1.A3O.get();
            this.A0B = (C17160ud) r1.A4t.get();
            this.A0C = (C16000sG) r1.A4x.get();
            this.A0E = (C16080sP) r1.AQ9.get();
            this.A07 = (AnonymousClass01Y) r1.A1w.get();
            this.A0D = (C17140ub) r1.A4y.get();
            this.A0N = (C17240ul) r1.ABK.get();
            this.A0Q = new C25781Lc();
            this.A0R = (C25681Ks) r1.A0Q.get();
            this.A0I = (AnonymousClass1D0) r1.A3P.get();
            this.A0S = (C25691Kt) r1.A0R.get();
            this.A0A = (AnonymousClass127) r1.A3z.get();
            this.A0G = (C19230xz) r1.A5B.get();
            this.A0H = (C16260sj) r1.AQe.get();
            this.A0K = (C16070sO) r1.ABY.get();
            this.A0F = (AnonymousClass152) r1.A51.get();
            this.A0J = (C216114t) r1.A5O.get();
            this.A0O = (AnonymousClass18R) r1.ABZ.get();
        }
    }

    public final void A35() {
        Log.i("calllog/update");
        C16010sH A012 = this.A0J.A01(this.A0P);
        this.A0L = A012;
        this.A0B.A06(this.A03, A012);
        this.A06.A0A(this.A0L);
        String str = this.A0L.A0T;
        if (str == null || str.isEmpty()) {
            this.A05.setVisibility(8);
        } else {
            this.A05.setVisibility(0);
            this.A05.setText(this.A0L.A0T);
        }
        C607335p r1 = this.A08;
        if (r1 != null) {
            r1.A06(true);
        }
        C607335p r2 = new C607335p(this, this);
        this.A08 = r2;
        this.A05.Ack(r2, new Void[0]);
        boolean z2 = !this.A0N.A0f(this.A0L);
        C62043Bk.A05(this.A01, z2);
        C62043Bk.A05(this.A02, z2);
    }

    public final void A36() {
        View childAt = this.A04.getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (this.A04.getWidth() > this.A04.getHeight()) {
            int top2 = this.A04.getFirstVisiblePosition() == 0 ? childAt.getTop() : (-this.A00.getHeight()) + 1;
            View view = this.A00;
            view.offsetTopAndBottom(top2 - view.getTop());
        } else if (this.A00.getTop() != 0) {
            View view2 = this.A00;
            view2.offsetTopAndBottom(-view2.getTop());
        }
    }

    public final void A37(boolean z2) {
        Jid A082 = this.A0L.A08(C15830rv.class);
        AnonymousClass00B.A06(A082);
        Intent A002 = this.A0S.A00(this.A0L, (C15830rv) A082, z2);
        int i2 = 11;
        if (z2) {
            i2 = 10;
        }
        try {
            startActivityForResult(A002, i2);
            this.A0R.A02(z2, 1);
        } catch (ActivityNotFoundException | SecurityException e2) {
            Log.w("calllog/opt system contact list could not found", e2);
            AnonymousClass29T.A01(this, 2);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 11 || i2 == 10) {
            if (i3 == -1) {
                this.A0G.A07();
            }
            this.A0R.A00();
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onCreate(Bundle bundle) {
        String formatDateTime;
        AnonymousClass013 r2;
        Locale A002;
        int i2;
        super.onCreate(bundle);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        setTitle(R.string.str033f);
        setContentView((int) R.layout.layout0129);
        C15830rv A022 = C15830rv.A02(getIntent().getStringExtra("jid"));
        AnonymousClass00B.A06(A022);
        this.A0P = A022;
        this.A04 = (ListView) findViewById(16908298);
        View inflate = getLayoutInflater().inflate(R.layout.layout0128, this.A04, false);
        C004601z.A0d(inflate, 2);
        this.A04.addHeaderView(inflate, (Object) null, false);
        View findViewById = findViewById(R.id.header);
        this.A00 = findViewById;
        findViewById.setClickable(true);
        findViewById(R.id.contact_info_container).setFocusable(true);
        C30521cU r8 = new C30521cU((Context) this, (TextEmojiLabel) findViewById(R.id.conversation_contact_name), this.A0E, this.A01, this.A0Q);
        this.A06 = r8;
        r8.A05();
        this.A05 = (TextView) findViewById(R.id.conversation_contact_status);
        View findViewById2 = findViewById(R.id.divider);
        AnonymousClass013 r3 = this.A01;
        AnonymousClass00B.A06(this);
        findViewById2.setBackground(new C447725m(AnonymousClass00T.A04(this, R.drawable.list_header_divider), r3));
        this.A04.setOnScrollListener(new IDxSListenerShape252S0100000_2_I0(this, 0));
        this.A04.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 4));
        this.A03 = (ImageView) findViewById(R.id.photo_btn);
        StringBuilder sb = new StringBuilder();
        sb.append(new C54602hp(this).A00(R.string.str1dd7));
        sb.append("-avatar");
        String obj = sb.toString();
        C004601z.A0n(this.A03, obj);
        this.A03.setOnClickListener(new ViewOnClickCListenerShape0S1100000_I0(2, obj, this));
        this.A01 = (ImageButton) AnonymousClass00T.A05(this, R.id.call_btn);
        this.A02 = (ImageButton) AnonymousClass00T.A05(this, R.id.video_call_btn);
        this.A01.setOnClickListener(new ViewOnClickCListenerShape0S0110000_I0(this, 0, false));
        this.A02.setOnClickListener(new ViewOnClickCListenerShape0S0110000_I0(this, 0, true));
        C56722oP r82 = new C56722oP(this);
        this.A04.setAdapter(r82);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("calls");
        if (parcelableArrayListExtra != null) {
            this.A0T = new ArrayList();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                C35011lE r0 = (C35011lE) ((Parcelable) it.next());
                AnonymousClass1D0 r6 = this.A0I;
                UserJid userJid = r0.A01;
                boolean z2 = r0.A03;
                C37831po A032 = r6.A03(new C35011lE(r0.A00, userJid, r0.A02, z2));
                if (A032 != null) {
                    this.A0T.add(A032);
                }
            }
            r82.A00 = this.A0T;
            r82.notifyDataSetChanged();
            ArrayList arrayList = this.A0T;
            if (!arrayList.isEmpty()) {
                long A023 = this.A05.A02(((C37831po) arrayList.get(0)).A0A);
                TextView textView = (TextView) findViewById(R.id.calls_title);
                if (DateUtils.isToday(A023)) {
                    r2 = this.A01;
                    A002 = AnonymousClass013.A00(r2.A00);
                    i2 = 270;
                } else if (DateUtils.isToday(86400000 + A023)) {
                    r2 = this.A01;
                    A002 = AnonymousClass013.A00(r2.A00);
                    i2 = 294;
                } else {
                    formatDateTime = DateUtils.formatDateTime(this, A023, 16);
                    textView.setText(formatDateTime);
                }
                formatDateTime = C28891Zc.A06(A002, r2.A08(i2));
                textView.setText(formatDateTime);
            } else {
                finish();
            }
        }
        A35();
        this.A0D.A02(this.A0W);
        this.A0A.A02(this.A0V);
        this.A0O.A02(this.A0X);
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu r3;
        if (i2 == 1) {
            Log.i("calllog/dialog-add-contact");
            r3 = new C32241fu(this);
            r3.A01(R.string.str00a7);
            r3.setPositiveButton(R.string.str0dd2, new IDxCListenerShape127S0100000_2_I0(this, 34));
            r3.A0B(new IDxCListenerShape127S0100000_2_I0(this, 35), R.string.str087a);
        } else if (i2 != 2) {
            return super.onCreateDialog(i2);
        } else {
            Log.w("calllog/add to contacts: activity not found, probably tablet");
            r3 = new C32241fu(this);
            r3.A01(R.string.str00a0);
            r3.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 33));
        }
        return r3.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_new_conversation, 0, R.string.str0d02).setIcon(R.drawable.ic_action_message).setAlphabeticShortcut('n').setShowAsAction(2);
        menu.add(0, R.id.menuitem_clear_call_log, 0, R.string.str046d).setIcon(R.drawable.ic_action_delete);
        if (this.A0P instanceof GroupJid) {
            return true;
        }
        if (!this.A0L.A0G() && (!this.A01.A0G())) {
            menu.add(0, R.id.menuitem_add_to_contacts, 0, R.string.str00a6);
        }
        menu.add(0, R.id.menuitem_unblock_contact, 0, R.string.str1872);
        menu.add(0, R.id.menuitem_block_contact, 0, R.string.str0226);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0D.A03(this.A0W);
        this.A0A.A03(this.A0V);
        this.A0O.A03(this.A0X);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            if (menuItem.getItemId() == R.id.menuitem_clear_call_log) {
                Log.i("calllog/delete");
                ArrayList arrayList = this.A0T;
                if (arrayList != null) {
                    this.A0I.A0D(arrayList);
                }
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_new_conversation) {
                Log.i("calllog/new_conversation");
                this.A00.A07(this, new C14750ph().A0v(this, this.A0L));
            } else if (menuItem.getItemId() == R.id.menuitem_add_to_contacts) {
                AnonymousClass29T.A01(this, 1);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_unblock_contact) {
                this.A07.A0J(this, this.A0L, "call_log", true);
                return true;
            } else {
                boolean z2 = false;
                if (menuItem.getItemId() != R.id.menuitem_block_contact) {
                    return false;
                }
                C16010sH r0 = this.A0L;
                if (r0 != null && r0.A0H()) {
                    z2 = true;
                }
                UserJid of = UserJid.of(this.A0P);
                AnonymousClass00B.A06(of);
                if (z2) {
                    startActivity(C14750ph.A0a(this, of, "call_log", true, false, false));
                    return true;
                }
                Afc(BlockConfirmationDialogFragment.A01(of, "call_log", false, true, false, false));
                return true;
            }
        }
        finish();
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean A0V2 = this.A07.A0V((UserJid) this.A0L.A08(UserJid.class));
        MenuItem findItem = menu.findItem(R.id.menuitem_unblock_contact);
        if (findItem != null) {
            findItem.setVisible(A0V2);
        }
        MenuItem findItem2 = menu.findItem(R.id.menuitem_block_contact);
        if (findItem2 != null) {
            findItem2.setVisible(!A0V2);
        }
        return true;
    }
}
