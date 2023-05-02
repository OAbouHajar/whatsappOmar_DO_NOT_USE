package com.obwhatsapp.chatinfo;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass10G;
import X.AnonymousClass11A;
import X.AnonymousClass11H;
import X.AnonymousClass127;
import X.AnonymousClass15P;
import X.AnonymousClass174;
import X.AnonymousClass17N;
import X.AnonymousClass18M;
import X.AnonymousClass18R;
import X.AnonymousClass1BL;
import X.AnonymousClass1BQ;
import X.AnonymousClass1VD;
import X.AnonymousClass29T;
import X.AnonymousClass2Ao;
import X.AnonymousClass2BZ;
import X.AnonymousClass2DL;
import X.AnonymousClass2JP;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SX;
import X.AnonymousClass2Sy;
import X.AnonymousClass4M4;
import X.C004601z;
import X.C006602z;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14870pt;
import X.C15810rt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15910s6;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16220sf;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16480t8;
import X.C16490t9;
import X.C16760tb;
import X.C17020u3;
import X.C17140ub;
import X.C17170ue;
import X.C17200uh;
import X.C17240ul;
import X.C17250um;
import X.C17760vb;
import X.C18090w8;
import X.C18260wP;
import X.C18290wS;
import X.C18600wx;
import X.C18640x1;
import X.C18940xV;
import X.C19150xq;
import X.C19230xz;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C206711d;
import X.C218315p;
import X.C23061Ai;
import X.C23071Aj;
import X.C24561Gk;
import X.C25681Ks;
import X.C25691Kt;
import X.C25701Ku;
import X.C25711Kv;
import X.C25721Kw;
import X.C25781Lc;
import X.C25791Ld;
import X.C25841Li;
import X.C28961Zl;
import X.C29501aj;
import X.C30361cE;
import X.C30641ci;
import X.C30661ck;
import X.C32241fu;
import X.C33481ie;
import X.C34841kx;
import X.C39291sE;
import X.C40781ug;
import X.C447725m;
import X.C448425v;
import X.C455529g;
import X.C48412Nd;
import X.C49132Rg;
import X.C49662Uu;
import X.C54602hp;
import X.C56652oH;
import X.C59182uz;
import X.C73403nq;
import X.C73413nz;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape194S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape274S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape338S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxRListenerShape372S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape252S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape66S0100000_1_I0;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.group.view.custom.GroupDetailsCard;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ListChatInfoActivity extends AnonymousClass2DL {
    public View A00;
    public ListView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public AnonymousClass127 A05;
    public C56652oH A06;
    public C73403nq A07;
    public C49662Uu A08;
    public C73413nz A09;
    public C17140ub A0A;
    public C16080sP A0B;
    public AnonymousClass2Ao A0C;
    public C17200uh A0D;
    public C19230xz A0E;
    public AnonymousClass11A A0F;
    public AnonymousClass11H A0G;
    public C19150xq A0H;
    public AnonymousClass10G A0I;
    public C16010sH A0J;
    public C16010sH A0K;
    public C206711d A0L;
    public AnonymousClass1BQ A0M;
    public C16490t9 A0N;
    public C25841Li A0O;
    public AnonymousClass18R A0P;
    public GroupDetailsCard A0Q;
    public C17020u3 A0R;
    public AnonymousClass1BL A0S;
    public C25781Lc A0T;
    public C25681Ks A0U;
    public C25691Kt A0V;
    public boolean A0W;
    public final C40781ug A0X;
    public final C33481ie A0Y;
    public final C18940xV A0Z;
    public final AnonymousClass1VD A0a;
    public final ArrayList A0b;

    public ListChatInfoActivity() {
        this(0);
        this.A0b = new ArrayList();
        this.A0Y = new IDxCObserverShape66S0100000_1_I0(this, 2);
        this.A0X = new IDxSObserverShape63S0100000_2_I0(this, 5);
        this.A0a = new IDxPObserverShape81S0100000_2_I0(this, 5);
        this.A0Z = new IDxMObserverShape74S0100000_2_I0(this, 1);
    }

    public ListChatInfoActivity(int i2) {
        this.A0W = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 35));
    }

    public static /* synthetic */ void A02(ListChatInfoActivity listChatInfoActivity) {
        ArrayList arrayList = listChatInfoActivity.A0b;
        arrayList.clear();
        C16070sO r0 = listChatInfoActivity.A0C;
        HashSet hashSet = new HashSet(r0.A07.A04(listChatInfoActivity.A3M()).A02());
        C16040sK r02 = listChatInfoActivity.A01;
        r02.A0B();
        hashSet.remove(r02.A05);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C16010sH A0A2 = listChatInfoActivity.A06.A0A((C15830rv) it.next());
            if (!arrayList.contains(A0A2)) {
                arrayList.add(A0A2);
            }
        }
        listChatInfoActivity.A3P();
        listChatInfoActivity.A3T();
    }

    public void A1q() {
        if (!this.A0W) {
            this.A0W = true;
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
            this.A0L = (C218315p) r1.AIL.get();
            this.A09 = (C15810rt) r1.A43.get();
            this.A01 = (C16760tb) r1.APV.get();
            this.A0A = (C16460t6) r1.A5k.get();
            this.A0P = (C25791Ld) r1.AFY.get();
            this.A06 = (C16000sG) r1.A4x.get();
            this.A02 = (C18640x1) r1.A3X.get();
            this.A08 = (AnonymousClass013) r1.AR8.get();
            this.A0K = (C18290wS) r1.AIB.get();
            this.A04 = (C17760vb) r1.A3m.get();
            this.A0H = (C17240ul) r1.ABK.get();
            this.A0D = (C25701Ku) r1.AD6.get();
            this.A0E = (AnonymousClass17N) r1.ADN.get();
            this.A0F = (C16480t8) r1.AEF.get();
            this.A0N = (C16220sf) r1.A3y.get();
            this.A0I = (AnonymousClass174) r1.AI3.get();
            this.A03 = (C17170ue) r1.A3W.get();
            this.A07 = (C16260sj) r1.AQe.get();
            this.A0B = (C25711Kv) r1.A7J.get();
            this.A0J = (C18090w8) r1.AI6.get();
            this.A0O = (C25721Kw) r1.A6Z.get();
            this.A0C = (C16070sO) r1.ABY.get();
            this.A0G = (C18600wx) r1.A78.get();
            this.A0O = (C25841Li) r1.AB1.get();
            this.A0N = (C16490t9) r1.AQz.get();
            this.A0L = (C206711d) r1.AKp.get();
            this.A0D = (C17200uh) r1.A52.get();
            this.A0G = (AnonymousClass11H) r1.ABL.get();
            this.A0B = (C16080sP) r1.AQ9.get();
            this.A0A = (C17140ub) r1.A4y.get();
            this.A0H = (C19150xq) r1.AFC.get();
            this.A0T = new C25781Lc();
            this.A0U = (C25681Ks) r1.A0Q.get();
            this.A0V = (C25691Kt) r1.A0R.get();
            this.A05 = (AnonymousClass127) r1.A3z.get();
            this.A0E = (C19230xz) r1.A5B.get();
            this.A0M = (AnonymousClass1BQ) r1.A7f.get();
            this.A0I = (AnonymousClass10G) r1.AN1.get();
            this.A0F = (AnonymousClass11A) r1.A5U.get();
            this.A0R = (C17020u3) r1.AMG.get();
            this.A0P = (AnonymousClass18R) r1.ABZ.get();
            this.A0S = (AnonymousClass1BL) r1.AJE.get();
        }
    }

    public void A3F(long j2) {
        super.A3F(j2);
        View findViewById = findViewById(R.id.actions_card);
        int i2 = 0;
        if (j2 == 0) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        A3O();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (r4.isEmpty() != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3L(java.util.ArrayList r4) {
        /*
            r3 = this;
            super.A3L(r4)
            r0 = 2131364011(0x7f0a08ab, float:1.8347847E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x001a
            if (r4 == 0) goto L_0x0016
            boolean r1 = r4.isEmpty()
            r0 = 8
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r2.setVisibility(r0)
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.chatinfo.ListChatInfoActivity.A3L(java.util.ArrayList):void");
    }

    public C34841kx A3M() {
        Class<C34841kx> cls = C34841kx.class;
        Jid A082 = this.A0J.A08(cls);
        StringBuilder sb = new StringBuilder("jid is not broadcast jid: ");
        sb.append(this.A0J.A08(cls));
        AnonymousClass00B.A07(A082, sb.toString());
        return (C34841kx) A082;
    }

    public final void A3N() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A0b.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16010sH) it.next()).A08(UserJid.class));
        }
        Intent intent = new Intent();
        intent.setClassName(getPackageName(), "com.obwhatsapp.conversation.EditBroadcastRecipientsSelector");
        intent.putExtra("selected", C16030sJ.A06(arrayList));
        startActivityForResult(intent, 12);
    }

    public final void A3O() {
        View findViewById = this.A00.findViewById(R.id.starred_messages_separator);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        C004601z.A0E(this.A00, R.id.participants_search).setVisibility(8);
        C004601z.A0E(this.A00, R.id.mute_layout).setVisibility(8);
        C004601z.A0E(this.A00, R.id.notifications_layout).setVisibility(8);
        View findViewById2 = this.A00.findViewById(R.id.notifications_separator);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        C004601z.A0E(this.A00, R.id.media_visibility_layout).setVisibility(8);
        View findViewById3 = this.A00.findViewById(R.id.media_visibility_separator);
        if (findViewById3 != null) {
            findViewById3.setVisibility(8);
        }
    }

    public final void A3P() {
        C48412Nd r2 = (C48412Nd) C004601z.A0E(this.A00, R.id.encryption_info_view);
        r2.setDescription(getString(R.string.str0a9e));
        r2.setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 44));
        r2.setVisibility(0);
    }

    public final void A3Q() {
        View childAt = this.A01.getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (this.A01.getWidth() > this.A01.getHeight()) {
            int top2 = this.A01.getFirstVisiblePosition() == 0 ? childAt.getTop() : (-this.A00.getHeight()) + 1;
            View view = this.A00;
            view.offsetTopAndBottom(top2 - view.getTop());
        } else if (this.A00.getTop() != 0) {
            View view2 = this.A00;
            view2.offsetTopAndBottom(-view2.getTop());
        }
    }

    public final void A3R() {
        TextView textView;
        long A012 = C29501aj.A01(this.A0J.A0R, Long.MIN_VALUE);
        if (A012 != Long.MIN_VALUE || (textView = this.A02) == null) {
            String A0B2 = C28961Zl.A0B(this.A08, new Object[0], R.string.str0a5a, R.string.str0a5b, R.string.str0a59, A012, true);
            GroupDetailsCard groupDetailsCard = this.A0Q;
            AnonymousClass00B.A04(groupDetailsCard);
            groupDetailsCard.setSecondSubtitleText(A0B2);
        } else {
            textView.setVisibility(8);
        }
        C73403nq r2 = this.A07;
        if (r2 != null) {
            r2.A06(true);
        }
        A3B();
        A1b(true);
        C14870pt r3 = this.A05;
        C18290wS r12 = this.A0K;
        C25701Ku r6 = this.A0D;
        AnonymousClass17N r7 = this.A0E;
        C16480t8 r8 = this.A0F;
        AnonymousClass10G r9 = this.A0I;
        C73403nq r22 = new C73403nq(r3, this.A09, this.A0B, r6, r7, r8, r9, this.A0J, this.A0J, r12);
        this.A07 = r22;
        this.A05.Ack(r22, new Void[0]);
    }

    public final void A3S() {
        String A092;
        int i2;
        if (TextUtils.isEmpty(this.A0J.A09())) {
            A092 = getString(R.string.str18a6);
            i2 = R.color.color079e;
        } else {
            A092 = this.A0J.A09();
            i2 = R.color.color079f;
        }
        int A002 = AnonymousClass00T.A00(this, i2);
        this.A08.setTitleText(A092);
        GroupDetailsCard groupDetailsCard = this.A0Q;
        AnonymousClass00B.A04(groupDetailsCard);
        groupDetailsCard.setTitleText(A092);
        this.A0Q.setTitleColor(A002);
        GroupDetailsCard groupDetailsCard2 = this.A0Q;
        Resources resources = getResources();
        ArrayList arrayList = this.A0b;
        groupDetailsCard2.setSubtitleText(resources.getQuantityString(R.plurals.plurals0008, arrayList.size(), new Object[]{Integer.valueOf(arrayList.size())}));
    }

    public final void A3T() {
        TextView textView = this.A04;
        Resources resources = getResources();
        ArrayList arrayList = this.A0b;
        textView.setText(resources.getQuantityString(R.plurals.plurals0125, arrayList.size(), new Object[]{Integer.valueOf(arrayList.size())}));
        A3U();
        Collections.sort(arrayList, new AnonymousClass2BZ(this.A01, this.A0B, true));
        this.A06.notifyDataSetChanged();
        A3S();
    }

    public final void A3U() {
        int A022 = this.A06.A02(C15910s6.A1A);
        ArrayList arrayList = this.A0b;
        if (arrayList.size() <= (A022 * 9) / 10 || A022 == 0) {
            this.A03.setVisibility(8);
            return;
        }
        this.A03.setVisibility(0);
        this.A03.setText(getString(R.string.str0f23, new Object[]{Integer.valueOf(arrayList.size()), Integer.valueOf(A022)}));
    }

    public final void A3V(boolean z2) {
        String str;
        boolean z3;
        C16010sH r1 = this.A0K;
        if (r1 == null) {
            this.A05.A09(R.string.str0a29, 0);
            return;
        }
        C25691Kt r3 = this.A0V;
        String A012 = C24561Gk.A01(r1);
        if (r1.A0H()) {
            str = r1.A0B();
            z3 = true;
        } else {
            str = null;
            z3 = false;
        }
        try {
            startActivityForResult(r3.A01(A012, str, z2, z3), 10);
            this.A0U.A02(z2, 9);
        } catch (ActivityNotFoundException unused) {
            AnonymousClass29T.A01(this, 4);
        }
    }

    public void finishAfterTransition() {
        if (C455529g.A00) {
            this.A00.setTransitionName((String) null);
            TransitionSet transitionSet = new TransitionSet();
            Slide slide = new Slide(48);
            slide.addTarget(this.A00);
            transitionSet.addTransition(slide);
            Slide slide2 = new Slide(80);
            slide2.addTarget(this.A01);
            transitionSet.addTransition(slide2);
            getWindow().setReturnTransition(transitionSet);
        }
        super.finishAfterTransition();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        C39291sE A052;
        int i4 = i3;
        Intent intent2 = intent;
        super.onActivityResult(i2, i4, intent2);
        switch (i2) {
            case 10:
            case 11:
                this.A0E.A07();
                this.A0U.A00();
                return;
            case 12:
                if (i4 == -1) {
                    Class<UserJid> cls = UserJid.class;
                    List A082 = C16030sJ.A08(cls, intent2.getStringArrayListExtra("contacts"));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList3 = this.A0b;
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        hashSet.add(((C16010sH) it.next()).A08(cls));
                    }
                    for (Object next : A082) {
                        if (!hashSet.contains(next)) {
                            arrayList.add(next);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Jid A083 = ((C16010sH) it2.next()).A08(cls);
                        if (!A082.contains(A083)) {
                            arrayList2.add(A083);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        C17240ul r0 = this.A0H;
                        C34841kx A3M = A3M();
                        AnonymousClass00B.A0A("", arrayList);
                        C30361cE A042 = r0.A0a.A07.A04(A3M);
                        ArrayList arrayList4 = new ArrayList(arrayList.size());
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            UserJid userJid = (UserJid) it3.next();
                            arrayList4.add(new C30661ck(userJid, C30361cE.A01(r0.A0e.A0D(userJid)), 0, false));
                        }
                        A042.A0J(arrayList4);
                        r0.A0G.A0P(A3M);
                        int size = arrayList.size();
                        AnonymousClass18M r4 = r0.A0g;
                        if (size == 1) {
                            A052 = r0.A0y.A07(A3M, (UserJid) arrayList.get(0), (C30641ci) null, 4, r0.A0L.A00(), 0);
                        } else {
                            A052 = r0.A0y.A05(A042, A3M, (UserJid) null, (C30641ci) null, arrayList, 12, r0.A0L.A00(), 0);
                        }
                        r4.A00(A052, 2);
                        r0.A07.A0K(new RunnableRunnableShape1S0300000_I0_1(r0, A3M, A042, 17));
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(this.A06.A0A((C15830rv) it4.next()));
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        this.A0H.A0M(A3M(), arrayList2);
                        Iterator it5 = arrayList2.iterator();
                        while (it5.hasNext()) {
                            arrayList3.remove(this.A06.A0A((C15830rv) it5.next()));
                        }
                    }
                    A3T();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        Intent intent;
        C16010sH r3 = ((AnonymousClass4M4) ((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag()).A03;
        this.A0K = r3;
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                Intent A0v = new C14750ph().A0v(this, r3);
                A0v.putExtra("entry_point_conversion_source", "broadcast_list_context_menu");
                A0v.putExtra("entry_point_conversion_app", "whatsapp");
                this.A00.A07(this, A0v);
                return true;
            } else if (itemId == 2) {
                A3V(true);
                return true;
            } else if (itemId == 3) {
                A3V(false);
                return true;
            } else if (itemId == 5) {
                AnonymousClass29T.A01(this, 6);
                return true;
            } else if (itemId != 6) {
                return false;
            } else {
                intent = C14750ph.A0X(this, (UserJid) this.A0K.A08(UserJid.class));
            }
        } else if (r3.A0D == null) {
            return true;
        } else {
            intent = new C14750ph().A0w(this, r3, 7);
        }
        startActivity(intent);
        return true;
    }

    public void onCreate(Bundle bundle) {
        UserJid nullable;
        A1X(5);
        super.onCreate(bundle);
        this.A0C = this.A0D.A04(this, "list-chat-info");
        A0b();
        setTitle(R.string.str0c60);
        setContentView((int) R.layout.layout02ea);
        this.A08 = (C49662Uu) findViewById(R.id.content);
        C73413nz r0 = (C73413nz) new C006602z(this).A01(C73413nz.class);
        this.A09 = r0;
        A3I(r0);
        this.A09.A00.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 103));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle((CharSequence) "");
        toolbar.A07();
        Aem(toolbar);
        x().A0N(true);
        toolbar.setNavigationIcon((Drawable) new C447725m(AnonymousClass00T.A04(this, R.drawable.ic_back_shadow), this.A08));
        this.A01 = ADA();
        this.A08.A09(R.layout.layout02ec);
        this.A00 = findViewById(R.id.header);
        this.A0Q = (GroupDetailsCard) findViewById(R.id.group_details_card);
        this.A08.A05();
        this.A08.setColor(AnonymousClass00T.A00(this, R.color.color064b));
        this.A08.A0A(getResources().getDimensionPixelSize(R.dimen.dimen000e), getResources().getDimensionPixelSize(R.dimen.dimen000e));
        View inflate = getLayoutInflater().inflate(R.layout.layout02eb, this.A01, false);
        this.A01.addFooterView(inflate, (Object) null, false);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setVisibility(4);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        linearLayout.setPadding(0, 0, 0, point.y);
        this.A01.addFooterView(linearLayout, (Object) null, false);
        C34841kx A032 = C34841kx.A03(getIntent().getStringExtra("gid"));
        if (A032 == null) {
            Log.e("list_chat_info/on_create: exiting due to null listChat jid object");
            finish();
            return;
        }
        this.A0J = this.A06.A0A(A032);
        ArrayList arrayList = this.A0b;
        this.A06 = new C56652oH(this, this, arrayList);
        this.A00 = findViewById(R.id.header);
        this.A01.setOnScrollListener(new IDxSListenerShape252S0100000_2_I0(this, 1));
        this.A01.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 7));
        this.A01.setOnItemClickListener(new IDxCListenerShape194S0100000_2_I0(this, 2));
        this.A0J.toString();
        View findViewById = findViewById(R.id.add_participant_layout);
        View findViewById2 = findViewById(R.id.add_participant_button);
        ((TextView) findViewById2.findViewById(R.id.add_participant_text)).setText(R.string.str0758);
        findViewById.findViewById(R.id.invite_via_link_button).setVisibility(8);
        findViewById.setVisibility(0);
        findViewById2.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 43));
        A3O();
        this.A02 = (TextView) findViewById(R.id.conversation_contact_status);
        IDxCListenerShape274S0100000_2_I0 iDxCListenerShape274S0100000_2_I0 = new IDxCListenerShape274S0100000_2_I0(this, 3);
        C448425v r02 = (C448425v) findViewById(R.id.media_card_view);
        r02.setSeeMoreClickListener(iDxCListenerShape274S0100000_2_I0);
        r02.setTopShadowVisibility(8);
        this.A01.setAdapter(this.A06);
        registerForContextMenu(this.A01);
        this.A0J.toString();
        TextView textView = (TextView) findViewById(R.id.participants_title);
        this.A04 = textView;
        textView.setText(getResources().getQuantityString(R.plurals.plurals0125, arrayList.size(), new Object[]{Integer.valueOf(arrayList.size())}));
        this.A03 = (TextView) findViewById(R.id.participants_info);
        A3U();
        A3J(Integer.valueOf(R.drawable.avatar_broadcast));
        A3K(getString(R.string.str06a7), R.drawable.ic_action_delete);
        C004601z.A0E(this.A00, R.id.report_group_btn).setVisibility(8);
        View findViewById3 = findViewById(R.id.exit_group_btn);
        findViewById3.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 41));
        AnonymousClass2JP.A02(findViewById3);
        HashSet hashSet = new HashSet(this.A0C.A07.A04(A3M()).A02());
        C16040sK r03 = this.A01;
        r03.A0B();
        hashSet.remove(r03.A05);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C16010sH A0A2 = this.A06.A0A((C15830rv) it.next());
            if (!arrayList.contains(A0A2)) {
                arrayList.add(A0A2);
            }
        }
        A3S();
        A3R();
        A3T();
        A3P();
        findViewById(R.id.starred_messages_layout).setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 42));
        this.A0A.A02(this.A0Y);
        this.A0H.A02(this.A0Z);
        this.A05.A02(this.A0X);
        this.A0P.A02(this.A0a);
        if (!(bundle == null || (nullable = UserJid.getNullable(bundle.getString("selected_jid"))) == null)) {
            this.A0K = this.A06.A0A(nullable);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            (getIntent().getBooleanExtra("circular_transition", false) ? this.A00 : findViewById(R.id.picture)).setTransitionName(new C54602hp(this).A00(R.string.str1dd7));
        }
        this.A08.A0D(inflate, linearLayout, this.A06);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        C16010sH r2 = ((AnonymousClass4M4) ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).targetView.getTag()).A03;
        if (r2 != null) {
            String A0C2 = this.A0B.A0C(r2);
            contextMenu.add(0, 1, 0, getString(R.string.str0d32, new Object[]{A0C2}));
            if (r2.A0D == null) {
                contextMenu.add(0, 2, 0, R.string.str00a6);
                contextMenu.add(0, 3, 0, R.string.str00af);
            } else {
                contextMenu.add(0, 0, 0, getString(R.string.str19d6, new Object[]{A0C2}));
            }
            if (this.A0b.size() > 2) {
                contextMenu.add(0, 5, 0, getString(R.string.str13ea, new Object[]{A0C2}));
            }
            contextMenu.add(0, 6, 0, R.string.str1ddb);
        }
    }

    public Dialog onCreateDialog(int i2) {
        String string;
        C32241fu r3;
        int i3;
        int i4;
        C16010sH r32;
        int i5 = i2;
        if (i5 == 2) {
            if (TextUtils.isEmpty(this.A0B.A08(this.A0J))) {
                string = getString(R.string.str06aa);
            } else {
                string = getString(R.string.str06a8, new Object[]{this.A0B.A08(this.A0J)});
            }
            return this.A0O.A01(this, new IDxCListenerShape338S0100000_2_I0(this, 0), string, 1).create();
        } else if (i5 != 3) {
            if (i5 == 4) {
                Log.w("listchatinfo/add existing contact: activity not found, probably tablet");
                r3 = new C32241fu(this);
                r3.A01(R.string.str00a0);
                i3 = R.string.str0e87;
                i4 = 36;
            } else if (i5 != 6 || (r32 = this.A0K) == null) {
                return super.onCreateDialog(i5);
            } else {
                String string2 = getString(R.string.str13fa, new Object[]{this.A0B.A08(r32)});
                r3 = new C32241fu(this);
                r3.A06(AnonymousClass2Sy.A05(this, this.A0B, string2));
                r3.A07(true);
                r3.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(this, 37));
                i3 = R.string.str0e87;
                i4 = 38;
            }
            r3.setPositiveButton(i3, new IDxCListenerShape127S0100000_2_I0(this, i4));
            return r3.create();
        } else {
            IDxRListenerShape372S0100000_2_I0 iDxRListenerShape372S0100000_2_I0 = new IDxRListenerShape372S0100000_2_I0(this, 0);
            C16440t3 r15 = this.A05;
            C14710pd r14 = this.A0C;
            C14870pt r11 = this.A05;
            C23061Ai r10 = this.A0B;
            C16300so r9 = this.A03;
            C17250um r8 = this.A0B;
            C206711d r5 = this.A0L;
            AnonymousClass01V r4 = this.A08;
            AnonymousClass013 r33 = this.A08;
            AnonymousClass1BQ r2 = this.A0M;
            C15860rz r1 = this.A09;
            C17020u3 r0 = this.A0R;
            C16010sH A092 = this.A06.A09(A3M());
            AnonymousClass00B.A06(A092);
            C16440t3 r17 = r15;
            return new C59182uz(this, r9, r11, r4, r17, r1, r33, iDxRListenerShape372S0100000_2_I0, r5, r8, r2, r14, r0, r10, A092.A09(), 3, R.string.str076a, this.A06.A02(C15910s6.A20), 0, 0, 16385);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, R.string.str00a3).setIcon(R.drawable.ic_action_add_person_shadow).setShowAsAction(0);
        menu.add(0, 3, 0, R.string.str0769).setShowAsAction(0);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0C.A00();
        this.A0A.A03(this.A0Y);
        this.A0H.A03(this.A0Z);
        this.A05.A03(this.A0X);
        this.A0P.A03(this.A0a);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 1) {
            if (itemId != 2) {
                if (itemId == 3) {
                    AnonymousClass29T.A01(this, 3);
                } else if (itemId != 16908332) {
                    return super.onOptionsItemSelected(menuItem);
                } else {
                    AnonymousClass00T.A09(this);
                    return true;
                }
            }
            return true;
        }
        A3N();
        return true;
    }

    public void onResume() {
        super.onResume();
        this.A05.Acl(new RunnableRunnableShape4S0200000_I0_2(this, 4, A3M()));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C16010sH r0 = this.A0K;
        if (r0 != null) {
            bundle.putString("selected_jid", C16030sJ.A03(r0.A0E));
        }
    }
}
