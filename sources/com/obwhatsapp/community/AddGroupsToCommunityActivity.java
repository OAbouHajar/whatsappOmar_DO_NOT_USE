package com.obwhatsapp.community;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass11A;
import X.AnonymousClass120;
import X.AnonymousClass121;
import X.AnonymousClass12A;
import X.AnonymousClass15P;
import X.AnonymousClass1L3;
import X.AnonymousClass1L4;
import X.AnonymousClass1WP;
import X.AnonymousClass1XI;
import X.AnonymousClass1ZW;
import X.AnonymousClass2Ao;
import X.AnonymousClass2Rf;
import X.AnonymousClass2aE;
import X.AnonymousClass3AE;
import X.AnonymousClass4OC;
import X.C001500q;
import X.C005402i;
import X.C006602z;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15810rt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16620tM;
import X.C17190ug;
import X.C17200uh;
import X.C17230uk;
import X.C17240ul;
import X.C17250um;
import X.C17750va;
import X.C18050w4;
import X.C18260wP;
import X.C19490yW;
import X.C19810z2;
import X.C19950zG;
import X.C19980zJ;
import X.C216114t;
import X.C217415g;
import X.C218115n;
import X.C23061Ai;
import X.C23071Aj;
import X.C25781Lc;
import X.C33501ig;
import X.C34911l4;
import X.C453528b;
import X.C49132Rg;
import X.C55292jF;
import X.C57292qf;
import X.C57402r7;
import X.C62973Fq;
import X.C63153Gi;
import X.C82634Do;
import X.C90534eK;
import X.C99014tL;
import X.C99844ug;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxFactoryShape54S0200000_1_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.IDxATaskShape26S0200000_2_I0;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class AddGroupsToCommunityActivity extends C14530pL {
    public C005402i A00;
    public AnonymousClass2aE A01;
    public C57292qf A02;
    public C17230uk A03;
    public AnonymousClass1L3 A04;
    public C57402r7 A05;
    public AnonymousClass1L4 A06;
    public C17750va A07;
    public C16000sG A08;
    public C16080sP A09;
    public AnonymousClass120 A0A;
    public AnonymousClass12A A0B;
    public AnonymousClass2Ao A0C;
    public C17200uh A0D;
    public AnonymousClass013 A0E;
    public C15810rt A0F;
    public C216114t A0G;
    public AnonymousClass11A A0H;
    public C16070sO A0I;
    public C19810z2 A0J;
    public C218115n A0K;
    public C17240ul A0L;
    public C217415g A0M;
    public C17190ug A0N;
    public AnonymousClass121 A0O;
    public C25781Lc A0P;
    public C18050w4 A0Q;
    public boolean A0R;
    public final C33501ig A0S;
    public final AtomicReference A0T;

    public AddGroupsToCommunityActivity() {
        this(0);
        this.A0T = new AtomicReference();
        this.A0S = new IDxCObserverShape72S0100000_2_I0(this, 3);
    }

    public AddGroupsToCommunityActivity(int i2) {
        this.A0R = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 36));
    }

    public void A1q() {
        if (!this.A0R) {
            this.A0R = true;
            C49132Rg r1 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r2 = r1.A1s;
            this.A05 = (C16320sq) r2.ARB.get();
            this.A0C = (C14710pd) r2.A05.get();
            this.A05 = (C14870pt) r2.AB3.get();
            this.A03 = (C16300so) r2.A5p.get();
            this.A04 = (C16180sb) r2.A8b.get();
            this.A0B = (C17250um) r2.A7e.get();
            this.A06 = (C15900s5) r2.ALm.get();
            this.A08 = (AnonymousClass01V) r2.AOi.get();
            this.A0D = (C19950zG) r2.AQV.get();
            this.A09 = (C15860rz) r2.AQh.get();
            this.A07 = (C18260wP) r2.A4p.get();
            this.A0A = (C16290sm) r2.AQk.get();
            this.A05 = (C16440t3) r2.AP2.get();
            this.A0B = (C23061Ai) r2.AC0.get();
            this.A01 = (C16040sK) r2.ADr.get();
            this.A04 = (C16190sc) r2.A8R.get();
            this.A08 = r1.A0K();
            this.A06 = (C14730pf) r2.ANy.get();
            this.A00 = (C19980zJ) r2.A0P.get();
            this.A02 = (C23071Aj) r2.AQb.get();
            this.A03 = (AnonymousClass15P) r2.A0b.get();
            this.A0A = (C19490yW) r2.ALQ.get();
            this.A09 = (C15960sC) r2.AKz.get();
            this.A07 = C16150sX.A0d(r2);
            this.A0F = (C15810rt) r2.A43.get();
            this.A0D = (C17200uh) r2.A52.get();
            this.A0N = (C17190ug) r2.AEu.get();
            this.A08 = (C16000sG) r2.A4x.get();
            this.A09 = (C16080sP) r2.AQ9.get();
            this.A0E = (AnonymousClass013) r2.AR8.get();
            this.A0L = (C17240ul) r2.ABK.get();
            this.A0P = new C25781Lc();
            this.A0J = (C19810z2) r2.APZ.get();
            this.A04 = (AnonymousClass1L3) r2.A4N.get();
            this.A0A = (AnonymousClass120) r2.A4z.get();
            this.A0K = (C218115n) r2.AH2.get();
            this.A0B = (AnonymousClass12A) r2.A50.get();
            this.A0O = (AnonymousClass121) r2.AJY.get();
            this.A0Q = C16150sX.A19(r2);
            this.A03 = (C17230uk) r2.A4I.get();
            this.A06 = (AnonymousClass1L4) r2.A4K.get();
            this.A0M = (C217415g) r2.AGv.get();
            this.A0H = (AnonymousClass11A) r2.A5U.get();
            this.A07 = C16150sX.A0K(r2);
            this.A0I = (C16070sO) r2.ABY.get();
            this.A0G = (C216114t) r2.A5O.get();
            this.A01 = (AnonymousClass2aE) r1.A0W.get();
        }
    }

    public final void A35() {
        A39(false);
        if (C90534eK.filter((Collection) this.A02.A07.A01(), new C99014tL(false)).size() == 0) {
            A39(true);
            Toast.makeText(this, R.string.str060f, 0).show();
        } else if (!this.A07.A0A()) {
            A37();
        } else {
            int size = ((Set) this.A02.A08.A01()).size();
            int size2 = ((Set) this.A02.A09.A01()).size();
            String A002 = this.A06.A00();
            if (size2 > 0) {
                this.A07.A01(5, 5, Long.valueOf((long) size2), A002);
            }
            if (size > 0) {
                this.A07.A01(6, 5, Long.valueOf((long) size), A002);
            }
            this.A07.A01(7, 5, (Long) null, A002);
            Afq(R.string.str0617);
            String stringExtra = getIntent().getStringExtra("extra_community_name");
            AnonymousClass00B.A06(stringExtra);
            String stringExtra2 = getIntent().getStringExtra("extra_community_description");
            C16440t3 r17 = this.A05;
            C14710pd r16 = this.A0C;
            C14870pt r29 = this.A05;
            C16300so r15 = this.A03;
            C16040sK r14 = this.A01;
            C17190ug r12 = this.A0N;
            C16000sG r11 = this.A08;
            C17240ul r10 = this.A0L;
            C18050w4 r9 = this.A0Q;
            AnonymousClass120 r8 = this.A0A;
            AnonymousClass121 r7 = this.A0O;
            C217415g r1 = this.A0M;
            C16440t3 r20 = r17;
            C14710pd r21 = r16;
            C16040sK r162 = r14;
            C55292jF r172 = new C55292jF(this);
            C16000sG r18 = r11;
            C16300so r142 = r15;
            C14870pt r152 = r29;
            AnonymousClass3AE r122 = new AnonymousClass3AE(this, r142, r152, r162, r172, r18, r8, r20, r21, r10, r1, r12, r7, r9);
            C16440t3 r92 = r122.A09;
            r122.A00 = r92.A00();
            C17240ul r112 = r122.A0B;
            AnonymousClass1WP A072 = r112.A07();
            C14710pd r102 = r122.A0A;
            new C63153Gi(r122.A04, r122.A06, r92, r102, r112, new C62973Fq((Uri) getIntent().getParcelableExtra("extra_community_photo_uri"), r122, (Set) this.A02.A08.A01(), (Set) this.A02.A09.A01()), new AnonymousClass4OC((GroupJid) null, A072, stringExtra, stringExtra2, new ArrayList(), 0, true), r122.A0D).A00();
        }
    }

    public final void A36() {
        if (((Set) this.A02.A07.A01()).size() < this.A03.A0D.A03(C16620tM.A02, 1990) + 1) {
            String stringExtra = getIntent().getStringExtra("extra_community_name");
            AnonymousClass00B.A06(stringExtra);
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.obwhatsapp.group.NewGroup");
            intent.putExtra("create_group_for_community", true);
            intent.putExtra("community_name", stringExtra);
            Ag3(intent, 11);
            return;
        }
        A38();
    }

    public final void A37() {
        A39(true);
        A2b(new C99844ug(this), 0, R.string.str060c, R.string.str060d, R.string.str060b);
    }

    public final void A38() {
        C14710pd r0 = this.A03.A0D;
        C16620tM r3 = C16620tM.A02;
        int A032 = r0.A03(r3, 1990);
        Resources resources = getResources();
        int A033 = this.A03.A0D.A03(r3, 1990);
        int A034 = this.A03.A0D.A03(r3, 1238);
        int i2 = R.plurals.plurals00c2;
        if (A033 < A034) {
            i2 = R.plurals.plurals00c3;
        }
        A2i("", resources.getQuantityString(i2, A032, new Object[]{Integer.valueOf(A032)}));
    }

    public final void A39(boolean z2) {
        this.A05.A0K(new RunnableRunnableShape0S0110000_I0(this, 10, z2));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Bundle bundle;
        if (i2 != 10) {
            if (i2 != 11) {
                super.onActivityResult(i2, i3, intent);
            } else if (i3 == -1 && intent != null && intent.getExtras() != null && (bundle = (Bundle) intent.getExtras().getParcelable("group_created")) != null) {
                C57292qf r3 = this.A02;
                AnonymousClass1WP A042 = AnonymousClass1WP.A04(bundle.getString("key_raw_jid"));
                if (A042 != null) {
                    String string = bundle.getString("key_group_name");
                    if (!AnonymousClass1ZW.A0E(string)) {
                        String string2 = bundle.getString("key_raw_photo_uri");
                        Uri uri = null;
                        if (string2 != null) {
                            uri = Uri.parse(string2);
                        }
                        int i4 = bundle.getInt("key_ephemeral_duration");
                        C16010sH r4 = new C16010sH(A042);
                        r4.A0L = string;
                        r4.A01 = i4;
                        if (uri != null) {
                            File file = new File(uri.getPath());
                            if (file.exists()) {
                                try {
                                    C453528b A012 = r3.A06.A01(AnonymousClass1XI.A0T(file));
                                    r3.A03.A02(r4, A012.A00, A012.A01);
                                } catch (IOException e2) {
                                    Log.e("newgroup/failed to update photo", e2);
                                }
                            }
                        }
                        Set set = r3.A0C;
                        if (set.add(r4)) {
                            r3.A09.A09(set);
                            r3.A05();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Group name missing");
                }
                throw new IllegalStateException("Pending group raw jid missing or invalid");
            }
        } else if (i3 == -1) {
            if (intent != null && intent.getExtras() != null) {
                if (intent.getExtras().getBoolean("should_open_new_group")) {
                    Intent intent2 = new Intent();
                    intent2.setClassName(getPackageName(), "com.obwhatsapp.group.NewGroup");
                    intent2.putExtra("create_group_for_community", true);
                    Ag3(intent2, 11);
                    return;
                }
                ArrayList<String> stringArrayList = intent.getExtras().getStringArrayList("selected_jids");
                if (stringArrayList != null) {
                    C57292qf r42 = this.A02;
                    r42.A0A.Ack(new IDxATaskShape26S0200000_2_I0(new HashSet(stringArrayList), 1, r42), new String[0]);
                }
            }
        } else if (i3 == -10) {
            Afg(R.string.str0df3);
        }
    }

    public void onBackPressed() {
        AnonymousClass1L4 r2 = this.A06;
        int size = ((Set) this.A02.A08.A01()).size();
        int size2 = ((Set) this.A02.A09.A01()).size();
        r2.A00 = size;
        r2.A01 = size2;
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A06.A03 = true;
        setContentView((int) R.layout.layout0061);
        this.A0C = this.A0D.A04(this, "add-groups-to-community");
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_groups_to_be_added");
        HashSet hashSet = new HashSet();
        if (stringArrayListExtra != null) {
            Iterator<String> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                C16050sL A052 = C16050sL.A05(it.next());
                if (A052 != null) {
                    hashSet.add(A052);
                }
            }
        }
        this.A02 = (C57292qf) new C006602z((AnonymousClass04o) new IDxFactoryShape54S0200000_1_I0(this.A01, 0, hashSet), (C001500q) this).A01(C57292qf.class);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        this.A00 = x2;
        this.A0H.A02(this.A0S);
        this.A00.A0Q(true);
        this.A00.A0N(true);
        this.A00.A0B(R.string.str00b2);
        AnonymousClass00T.A05(this, R.id.add_groups_new_group).setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 46));
        AnonymousClass00T.A05(this, R.id.add_groups_link_existing_groups).setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 47));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.added_groups);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C16080sP r7 = this.A09;
        AnonymousClass013 r9 = this.A0E;
        C25781Lc r12 = this.A0P;
        C218115n r11 = this.A0K;
        C57402r7 r4 = new C57402r7(this, new C82634Do(this), r7, this.A0C, r9, this.A0I, r11, r12);
        this.A05 = r4;
        recyclerView.setAdapter(r4);
        ImageView imageView = (ImageView) AnonymousClass00T.A05(this, R.id.community_add_groups_done_button);
        A39(true);
        imageView.setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 48));
        imageView.setImageDrawable(AnonymousClass00T.A04(this, R.drawable.ic_fab_check));
        C57292qf r42 = this.A02;
        String stringExtra = getIntent().getStringExtra("extra_community_name");
        AnonymousClass00B.A06(stringExtra);
        C16010sH r3 = new C16010sH(r42.A05.A07());
        r3.A0L = stringExtra;
        r3.A0G = new C34911l4((C16050sL) null, 3);
        r42.A00 = r3;
        r42.A05();
        this.A02.A07.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 33));
    }

    public void onDestroy() {
        AnonymousClass2Ao r0 = this.A0C;
        if (r0 != null) {
            r0.A00();
            this.A0C = null;
        }
        this.A0H.A03(this.A0S);
        super.onDestroy();
    }
}
