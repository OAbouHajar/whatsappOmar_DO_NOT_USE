package com.obwhatsapp.contact.picker;

import X.AnonymousClass18O;
import X.AnonymousClass1UP;
import X.AnonymousClass1V8;
import X.AnonymousClass28S;
import X.AnonymousClass2JP;
import X.AnonymousClass39D;
import X.AnonymousClass3A2;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14750ph;
import X.C15810rt;
import X.C16010sH;
import X.C16030sJ;
import X.C16050sL;
import X.C16070sO;
import X.C16150sX;
import X.C16620tM;
import X.C17110uY;
import X.C17230uk;
import X.C17380uz;
import X.C25681Ks;
import X.C30521cU;
import X.C34331k5;
import X.C49132Rg;
import X.C810546q;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape228S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class AddGroupParticipantsSelector extends AnonymousClass1V8 {
    public View A00;
    public View A01;
    public C17230uk A02;
    public C15810rt A03;
    public C16070sO A04;
    public AnonymousClass18O A05;
    public C16050sL A06;
    public C16050sL A07;
    public C25681Ks A08;
    public C17110uY A09;
    public String A0A;
    public boolean A0B;
    public final AnonymousClass28S A0C;
    public final C14750ph A0D;
    public final Set A0E;

    public AddGroupParticipantsSelector() {
        this(0);
        this.A0E = C13680ns.A0o();
        this.A0D = C14750ph.A0q();
        this.A0C = new IDxCListenerShape228S0100000_2_I1(this, 0);
    }

    public AddGroupParticipantsSelector(int i2) {
        this.A0B = false;
        C13680ns.A1G(this, 47);
    }

    public void A1q() {
        if (!this.A0B) {
            this.A0B = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0g(r1, C14530pL.A0D(r1, this), this);
            this.A09 = C16150sX.A1A(r1);
            this.A03 = C16150sX.A0c(r1);
            this.A08 = (C25681Ks) r1.A0Q.get();
            this.A05 = (AnonymousClass18O) r1.ABN.get();
            this.A04 = C16150sX.A0e(r1);
            this.A02 = (C17230uk) r1.A4I.get();
        }
    }

    public void A3Q(int i2) {
    }

    public void A3U(AnonymousClass39D r7, C16010sH r8) {
        super.A3U(r7, r8);
        Class<UserJid> cls = UserJid.class;
        boolean contains = this.A0E.contains(r8.A08(cls));
        boolean A0V = this.A0F.A0V((UserJid) r8.A08(cls));
        View view = r7.A00;
        AnonymousClass2JP.A01(view);
        if (contains || A0V) {
            TextEmojiLabel textEmojiLabel = r7.A02;
            int i2 = R.string.str178d;
            if (contains) {
                i2 = R.string.str0544;
            }
            textEmojiLabel.setText(i2);
            r7.A01.setEnabled(false);
            textEmojiLabel.setTypeface((Typeface) null, 2);
            textEmojiLabel.setVisibility(0);
            C30521cU.A00(this, r7.A03, R.color.color0501);
            if (contains) {
                view.setOnClickListener((View.OnClickListener) null);
                view.setClickable(false);
                view.setFocusable(true);
                return;
            }
            return;
        }
        r7.A02.setTypeface((Typeface) null, 0);
        C30521cU.A00(this, r7.A03, R.color.color0507);
    }

    public void A3W(C16010sH r3) {
        if (!this.A0E.contains(C16010sH.A03(r3))) {
            super.A3W(r3);
        }
    }

    public void A3a(List list) {
        int i2;
        View findViewById;
        if (this.A0C.A0E(C16620tM.A02, 1863)) {
            if (TextUtils.isEmpty(this.A0W) || !list.isEmpty()) {
                View view = this.A01;
                i2 = 8;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = this.A00;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                findViewById = findViewById(R.id.moreText);
            } else {
                TextView A0N = C13680ns.A0N(this, R.id.moreText);
                i2 = 0;
                A0N.setVisibility(0);
                AnonymousClass1UP.A06(A0N);
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.search_no_matches_container);
                if (this.A00 == null) {
                    View A002 = AnonymousClass3A2.A00(getLayoutInflater(), (ViewGroup) null, R.drawable.ic_share, R.string.str0bc7);
                    this.A00 = A002;
                    C34331k5.A01(A002, this, 44);
                    AnonymousClass2JP.A02(this.A00);
                    viewGroup.addView(this.A00);
                }
                if (this.A01 == null) {
                    View A003 = AnonymousClass3A2.A00(getLayoutInflater(), (ViewGroup) null, R.drawable.ic_voip_add_person, R.string.str0d04);
                    this.A01 = A003;
                    C34331k5.A01(A003, this, 45);
                    AnonymousClass2JP.A02(this.A01);
                    viewGroup.addView(this.A01);
                }
                this.A01.setVisibility(0);
                findViewById = this.A00;
            }
            findViewById.setVisibility(i2);
        }
        super.A3a(list);
    }

    public void A3f() {
        this.A0B.A01(ADA());
        Intent A092 = C13680ns.A09();
        A092.putExtra("contacts", C16030sJ.A06(A3H()));
        C13680ns.A0r(this, A092);
    }

    public final void A3g(TextEmojiLabel textEmojiLabel, C16050sL r6) {
        boolean A002 = C810546q.A00(this.A0J.A0A(r6), this.A0C);
        int i2 = R.string.str00b8;
        if (A002) {
            i2 = R.string.str00b9;
        }
        textEmojiLabel.setText(this.A09.A06(new RunnableRunnableShape13S0200000_I1_1(this, 47, r6), getString(i2), "edit_group_settings"));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            this.A08.A00();
        }
    }

    public void onCreate(Bundle bundle) {
        this.A06 = C16050sL.A05(getIntent().getStringExtra("gid"));
        super.onCreate(bundle);
        C16050sL r2 = this.A06;
        if (r2 != null) {
            this.A0E.addAll(C17380uz.copyOf((Collection) C16070sO.A00(this.A04, r2).A04.keySet()));
            AnonymousClass18O r0 = this.A05;
            r0.A00.add(this.A0C);
        }
        this.A0A = getIntent().getStringExtra("community_name");
        this.A07 = C16050sL.A05(getIntent().getStringExtra("parent_group_jid_to_link"));
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass18O r0 = this.A05;
        r0.A00.remove(this.A0C);
    }
}
