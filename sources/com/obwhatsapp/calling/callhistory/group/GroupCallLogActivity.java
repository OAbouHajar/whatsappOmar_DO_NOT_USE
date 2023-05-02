package com.obwhatsapp.calling.callhistory.group;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass1D0;
import X.AnonymousClass2Ao;
import X.AnonymousClass2GQ;
import X.AnonymousClass2OY;
import X.AnonymousClass2SR;
import X.AnonymousClass2Wj;
import X.AnonymousClass57B;
import X.C018208n;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16000sG;
import X.C16080sP;
import X.C16150sX;
import X.C17140ub;
import X.C17200uh;
import X.C17650vQ;
import X.C18010w0;
import X.C18380wb;
import X.C18890xQ;
import X.C204310c;
import X.C204710g;
import X.C25781Lc;
import X.C28961Zl;
import X.C33481ie;
import X.C35011lE;
import X.C37831po;
import X.C38581r1;
import X.C38591r2;
import X.C49132Rg;
import X.C52142dD;
import X.C57512rI;
import X.C62043Bk;
import X.C94204kX;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxPDisplayerShape298S0100000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape0S1110000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.contact.IDxCObserverShape69S0100000_2_I1;
import com.obwhatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupCallLogActivity extends C14530pL {
    public C18890xQ A00;
    public C57512rI A01;
    public C204310c A02;
    public C18380wb A03;
    public C18010w0 A04;
    public C17650vQ A05;
    public C16000sG A06;
    public C17140ub A07;
    public C16080sP A08;
    public AnonymousClass2Ao A09;
    public AnonymousClass2Ao A0A;
    public C17200uh A0B;
    public AnonymousClass1D0 A0C;
    public C25781Lc A0D;
    public C37831po A0E;
    public boolean A0F;
    public final C33481ie A0G;
    public final AnonymousClass2OY A0H;

    public GroupCallLogActivity() {
        this(0);
        this.A0G = new IDxCObserverShape69S0100000_2_I1(this, 1);
        this.A0H = new IDxPDisplayerShape298S0100000_2_I1(this, 2);
    }

    public GroupCallLogActivity(int i2) {
        this.A0F = false;
        C13680ns.A1G(this, 29);
    }

    public static /* synthetic */ void A02(GroupCallLogActivity groupCallLogActivity, String str, boolean z2) {
        int i2 = R.string.str0360;
        if (z2) {
            i2 = R.string.str035f;
        }
        String A0d = C13680ns.A0d(groupCallLogActivity, C62043Bk.A02(str, z2), C13680ns.A1b(), 0, i2);
        if (Build.VERSION.SDK_INT < 22) {
            C18010w0 r2 = groupCallLogActivity.A04;
            r2.A01.A06(C52142dD.A01((String) null, 2, 2, z2));
        }
        groupCallLogActivity.startActivity(C52142dD.A00(groupCallLogActivity, A0d, groupCallLogActivity.getString(R.string.str035e), 2, z2));
    }

    public void A1q() {
        if (!this.A0F) {
            this.A0F = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = C16150sX.A06(r1);
            this.A02 = (C204310c) r1.A3O.get();
            this.A0B = C16150sX.A0R(r1);
            this.A05 = C16150sX.A0J(r1);
            this.A08 = C16150sX.A0Q(r1);
            this.A06 = C16150sX.A0M(r1);
            this.A07 = C16150sX.A0N(r1);
            this.A0D = new C25781Lc();
            this.A0C = (AnonymousClass1D0) r1.A3P.get();
            this.A03 = C16150sX.A0H(r1);
            this.A04 = C16150sX.A0I(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        C37831po r0;
        int i2;
        int i3;
        String string;
        super.onCreate(bundle);
        C13690nt.A0N(this).A0N(true);
        setTitle(R.string.str033f);
        setContentView((int) R.layout.layout02c8);
        C35011lE r02 = (C35011lE) getIntent().getParcelableExtra("call_log_key");
        if (r02 != null) {
            r0 = this.A0C.A03(new C35011lE(r02.A00, r02.A01, r02.A02, r02.A03));
        } else {
            r0 = null;
        }
        this.A0E = r0;
        if (r0 == null) {
            Log.i("call log missing");
            finish();
            return;
        }
        this.A0A = this.A0B.A04(this, "group-call-log-activity");
        this.A09 = this.A0B.A05("group-call-log-multi-contact", 0.0f, getResources().getDimensionPixelSize(R.dimen.dimen0417));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.participants_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        C57512rI r03 = new C57512rI(this);
        this.A01 = r03;
        recyclerView.setAdapter(r03);
        List<C38581r1> A042 = this.A0E.A04();
        UserJid userJid = this.A0E.A0C.A01;
        int i4 = 0;
        while (i4 < A042.size() && !((C38581r1) A042.get(i4)).A02.equals(userJid)) {
            i4++;
        }
        if (i4 != 0 && i4 < A042.size()) {
            Object obj = A042.get(i4);
            A042.remove(i4);
            A042.add(0, obj);
        }
        Collections.sort(A042.subList(true ^ this.A0E.A0C.A03 ? 1 : 0, A042.size()), new AnonymousClass57B(this.A06, this.A08));
        C57512rI r1 = this.A01;
        r1.A00 = C13680ns.A0n(A042);
        r1.A01();
        C37831po r6 = this.A0E;
        TextView A0N = C13680ns.A0N(this, R.id.call_type_text);
        ImageView imageView = (ImageView) findViewById(R.id.call_type_icon);
        if (r6.A0G != null) {
            AnonymousClass2Wj A022 = C52142dD.A02(this.A06, this.A08, CallsHistoryFragment.A01(this.A06, this.A08, r6, AnonymousClass000.A0u()), 3, false);
            string = A022 == null ? null : A022.A00(this);
            i2 = R.drawable.vec_ic_call_link_call_log_icn;
        } else {
            if (r6.A0C.A03) {
                i2 = R.drawable.vec_ic_call_outgoing;
                i3 = R.string.str0ee2;
            } else {
                int i5 = r6.A00;
                i2 = R.drawable.vec_ic_call_incoming_or_missed;
                i3 = R.string.str0d73;
                if (i5 == 5) {
                    i3 = R.string.str0b62;
                }
            }
            string = getString(i3);
        }
        A0N.setText(string);
        imageView.setImageResource(i2);
        AnonymousClass2SR.A07(this, imageView, C62043Bk.A00(r6));
        C13680ns.A0N(this, R.id.call_duration).setText(C28961Zl.A04(this.A01, (long) r6.A01));
        C13680ns.A0N(this, R.id.call_data).setText(AnonymousClass2GQ.A04(this.A01, r6.A02));
        C13680ns.A0N(this, R.id.call_date).setText(C28961Zl.A01(this.A01, this.A05.A02(r6.A0A)));
        ArrayList A0u = AnonymousClass000.A0u();
        for (C38581r1 r04 : A042) {
            A0u.add(this.A06.A0A(r04.A02));
        }
        ((MultiContactThumbnail) findViewById(R.id.multi_contact_photo)).A00(this.A0H, this.A09, A0u);
        if (this.A0E.A0G != null) {
            C38591r2 r5 = this.A0E.A0G;
            boolean z2 = this.A0E.A0I;
            C13690nt.A1I(this, R.id.divider);
            findViewById(R.id.call_link_container).setVisibility(0);
            TextView A0N2 = C13680ns.A0N(this, R.id.call_link_text);
            TextView A0N3 = C13680ns.A0N(this, R.id.join_btn);
            int i6 = R.drawable.ic_btn_call_audio;
            if (z2) {
                i6 = R.drawable.ic_btn_call_video;
            }
            Drawable A043 = AnonymousClass00T.A04(this, i6);
            if (A043 != null) {
                Drawable A032 = C018208n.A03(A043);
                C018208n.A0A(A032, AnonymousClass00T.A00(this, R.color.color064f));
                A0N3.setCompoundDrawablesWithIntrinsicBounds(A032, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            String str = r5.A02;
            A0N2.setText(C62043Bk.A02(str, z2));
            A0N2.setOnClickListener(new ViewOnClickCListenerShape0S1110000_I1(this, str, z2));
            A0N2.setOnLongClickListener(new C94204kX(this, str, z2));
            A0N3.setOnClickListener(new ViewOnClickCListenerShape0S1110000_I1(this, str, z2));
        }
        this.A07.A02(this.A0G);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_clear_call_log, 0, R.string.str046d).setIcon(R.drawable.ic_action_delete);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.A03(this.A0G);
        AnonymousClass2Ao r0 = this.A0A;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass2Ao r02 = this.A09;
        if (r02 != null) {
            r02.A00();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_clear_call_log) {
            Log.i("calllog/delete");
            this.A0C.A0D(Collections.singletonList(this.A0E));
        } else if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        if (this.A05.A01()) {
            this.A03.A00(new C204710g("show_voip_activity"));
        }
    }
}
