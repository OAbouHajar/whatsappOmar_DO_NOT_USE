package com.obwhatsapp.invites;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass152;
import X.AnonymousClass1BQ;
import X.AnonymousClass1UP;
import X.AnonymousClass2Ao;
import X.AnonymousClass2r4;
import X.AnonymousClass365;
import X.AnonymousClass4MM;
import X.C13680ns;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15810rt;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16050sL;
import X.C16080sP;
import X.C16150sX;
import X.C16760tb;
import X.C17020u3;
import X.C17200uh;
import X.C17240ul;
import X.C206711d;
import X.C23061Ai;
import X.C25841Li;
import X.C34331k5;
import X.C447725m;
import X.C49132Rg;
import X.C807545j;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxLListenerShape60S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.mentions.MentionableEntry;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InviteGroupParticipantsActivity extends C14530pL {
    public LayoutInflater A00;
    public ImageView A01;
    public C16760tb A02;
    public C16000sG A03;
    public C16080sP A04;
    public AnonymousClass2Ao A05;
    public C17200uh A06;
    public AnonymousClass152 A07;
    public AnonymousClass013 A08;
    public C15810rt A09;
    public C16010sH A0A;
    public C206711d A0B;
    public AnonymousClass1BQ A0C;
    public C25841Li A0D;
    public C17240ul A0E;
    public MentionableEntry A0F;
    public C17020u3 A0G;
    public List A0H;
    public boolean A0I;
    public byte[] A0J;

    public InviteGroupParticipantsActivity() {
        this(0);
    }

    public InviteGroupParticipantsActivity(int i2) {
        this.A0I = false;
        C13680ns.A1G(this, 81);
    }

    public void A1q() {
        if (!this.A0I) {
            this.A0I = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A0D = (C25841Li) r1.AB1.get();
            this.A09 = C16150sX.A0c(r1);
            this.A02 = (C16760tb) r1.APV.get();
            this.A0B = (C206711d) r1.AKp.get();
            this.A06 = C16150sX.A0R(r1);
            this.A03 = C16150sX.A0M(r1);
            this.A04 = C16150sX.A0Q(r1);
            this.A08 = C16150sX.A0Z(r1);
            this.A0E = C16150sX.A0o(r1);
            this.A0C = (AnonymousClass1BQ) r1.A7f.get();
            this.A0G = C16150sX.A14(r1);
            this.A07 = (AnonymousClass152) r1.A51.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str1bd4);
        setContentView((int) R.layout.layout0362);
        this.A00 = LayoutInflater.from(this);
        this.A05 = this.A06.A04(this, "invite-group-participants-activity");
        this.A0F = (MentionableEntry) findViewById(R.id.comment);
        getWindow().setSoftInputMode(3);
        this.A0F.requestFocus();
        TextView A0N = C13680ns.A0N(this, R.id.group_name);
        this.A01 = (ImageView) findViewById(R.id.group_photo);
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        Iterator it = C16030sJ.A07(getIntent(), UserJid.class).iterator();
        while (it.hasNext()) {
            C15830rv A0B2 = C13700nu.A0B(it);
            A0u.add(A0B2);
            A0u2.add(this.A03.A0A(A0B2));
        }
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("invite_hashes");
        long longExtra = getIntent().getLongExtra("invite_expiration", 0);
        C16050sL A0N2 = C14530pL.A0N(getIntent(), "group_jid");
        boolean A0m = this.A0E.A0m(A0N2);
        TextView A092 = C13700nu.A09(this, R.id.group_invite_subtitle);
        int i2 = R.string.str0aa4;
        if (A0m) {
            i2 = R.string.str0f0f;
        }
        A092.setText(i2);
        MentionableEntry mentionableEntry = this.A0F;
        int i3 = R.string.str0aa5;
        if (A0m) {
            i3 = R.string.str0f10;
        }
        mentionableEntry.setText(i3);
        this.A0H = AnonymousClass000.A0u();
        for (int i4 = 0; i4 < stringArrayListExtra.size(); i4++) {
            this.A0H.add(new AnonymousClass4MM(A0N2, (UserJid) A0u.get(i4), stringArrayListExtra.get(i4), longExtra));
        }
        C16010sH A0A2 = this.A03.A0A(A0N2);
        this.A0A = A0A2;
        A0N.setText(this.A04.A08(A0A2));
        C13680ns.A1U(new AnonymousClass365(this.A07, this.A0A, this), this.A05);
        ImageView imageView = (ImageView) findViewById(R.id.send);
        C447725m.A01(this, imageView, this.A08, R.drawable.input_send);
        C34331k5.A03(imageView, this, 31);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.invite_contacts_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.A1P(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        AnonymousClass2r4 r0 = new AnonymousClass2r4(this);
        r0.A00 = A0u2;
        r0.A01();
        recyclerView.setAdapter(r0);
        AnonymousClass1UP.A06(C13680ns.A0N(this, R.id.send_invite_title));
        View findViewById = findViewById(R.id.container);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape60S0200000_2_I1(this, 5, findViewById));
        Intent A002 = C807545j.A00(getIntent());
        A002.setComponent(getIntent().getComponent());
        setResult(0, A002);
        C13680ns.A16(findViewById(R.id.filler), this, 32);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            Window window = getWindow();
            getWindow().setNavigationBarColor(AnonymousClass00T.A00(this, R.color.color0092));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass2Ao r0 = this.A05;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void onPause() {
        super.onPause();
        boolean A002 = C23061Ai.A00(this.A00);
        Window window = getWindow();
        int i2 = 3;
        if (A002) {
            i2 = 5;
        }
        window.setSoftInputMode(i2);
    }
}
