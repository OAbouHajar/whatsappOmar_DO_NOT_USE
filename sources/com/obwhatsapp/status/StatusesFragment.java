package com.obwhatsapp.status;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass01V;
import X.AnonymousClass027;
import X.AnonymousClass10F;
import X.AnonymousClass11G;
import X.AnonymousClass11I;
import X.AnonymousClass128;
import X.AnonymousClass12W;
import X.AnonymousClass177;
import X.AnonymousClass17S;
import X.AnonymousClass184;
import X.AnonymousClass18W;
import X.AnonymousClass19Y;
import X.AnonymousClass1AM;
import X.AnonymousClass1BJ;
import X.AnonymousClass1BM;
import X.AnonymousClass1L1;
import X.AnonymousClass1ZW;
import X.AnonymousClass2Ab;
import X.AnonymousClass2Ao;
import X.AnonymousClass2Az;
import X.AnonymousClass2SR;
import X.AnonymousClass2c9;
import X.AnonymousClass37I;
import X.AnonymousClass3AJ;
import X.AnonymousClass4FC;
import X.AnonymousClass5QL;
import X.AnonymousClass5QM;
import X.C001000l;
import X.C001300o;
import X.C004601z;
import X.C05730St;
import X.C14600pS;
import X.C14670pZ;
import X.C14680pa;
import X.C14700pc;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14780pk;
import X.C14800pm;
import X.C14810pn;
import X.C14840pq;
import X.C14870pt;
import X.C15450qv;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16030sJ;
import X.C16040sK;
import X.C16080sP;
import X.C16220sf;
import X.C16260sj;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C16620tM;
import X.C16730tY;
import X.C16740tZ;
import X.C16760tb;
import X.C16980tz;
import X.C17010u2;
import X.C17140ub;
import X.C17200uh;
import X.C17240ul;
import X.C17980vx;
import X.C18940xV;
import X.C19150xq;
import X.C19570ye;
import X.C19980zJ;
import X.C209212c;
import X.C23031Af;
import X.C23171At;
import X.C23611Cq;
import X.C23621Cr;
import X.C23631Ct;
import X.C30991dI;
import X.C32291fz;
import X.C32301g2;
import X.C33481ie;
import X.C34661kf;
import X.C34671kg;
import X.C34691ki;
import X.C34771kq;
import X.C42681yF;
import X.C449126f;
import X.C45752Au;
import X.C45782Ay;
import X.C47482Jd;
import X.C49892Wl;
import X.C50442Zm;
import X.C56522nn;
import X.C63303Gx;
import X.C83954Ir;
import X.C87634Xu;
import X.C91064fJ;
import X.C94944lj;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCListenerShape299S0100000_1_I0;
import com.facebook.redex.IDxLAdapterShape0S0101000_2_I0;
import com.facebook.redex.IDxMObserverShape460S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxObserverShape34S0200000_1_I0;
import com.facebook.redex.IDxSCallbackShape221S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.EmptyTellAFriendView;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.IDxCListenerShape106S0100000_1_I0;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StatusesFragment extends Hilt_StatusesFragment implements C001300o, C14780pk, C14800pm, C14670pZ, C34661kf, C34671kg, C34691ki {
    public AnimatorSet A00;
    public AnimatorSet A01;
    public View A02;
    public View A03;
    public C19570ye A04;
    public C19980zJ A05;
    public C50442Zm A06;
    public C14870pt A07;
    public C16040sK A08;
    public C15900s5 A09;
    public AnonymousClass1BJ A0A;
    public C16760tb A0B;
    public C23171At A0C;
    public AnonymousClass19Y A0D;
    public C16000sG A0E;
    public C17140ub A0F;
    public C16080sP A0G;
    public AnonymousClass2Ao A0H;
    public C17200uh A0I;
    public C449126f A0J;
    public AnonymousClass12W A0K;
    public AnonymousClass01V A0L;
    public C17010u2 A0M;
    public C16440t3 A0N;
    public C16980tz A0O;
    public C16260sj A0P;
    public C15860rz A0Q;
    public AnonymousClass013 A0R;
    public C14730pf A0S;
    public AnonymousClass177 A0T;
    public C16460t6 A0U;
    public C19150xq A0V;
    public AnonymousClass128 A0W;
    public AnonymousClass184 A0X;
    public AnonymousClass11G A0Y;
    public C14710pd A0Z;
    public C16490t9 A0a;
    public C17240ul A0b;
    public AnonymousClass10F A0c;
    public C16220sf A0d;
    public C14700pc A0e;
    public AnonymousClass1AM A0f;
    public StatusExpirationLifecycleOwner A0g;
    public AnonymousClass18W A0h;
    public AnonymousClass2Ab A0i;
    public AnonymousClass3AJ A0j;
    public C49892Wl A0k;
    public C23621Cr A0l;
    public C23611Cq A0m;
    public C17980vx A0n;
    public AnonymousClass1L1 A0o;
    public AnonymousClass1BM A0p;
    public C23031Af A0q;
    public C45752Au A0r;
    public AnonymousClass2Az A0s;
    public AnonymousClass37I A0t;
    public C45782Ay A0u = new C45782Ay();
    public C16320sq A0v;
    public C23631Ct A0w;
    public AnonymousClass01D A0x;
    public AnonymousClass01D A0y;
    public AnonymousClass01D A0z;
    public CharSequence A10;
    public List A11;
    public List A12 = new ArrayList();
    public List A13 = new ArrayList();
    public boolean A14;
    public boolean A15 = true;
    public boolean A16;
    public boolean A17 = false;
    public boolean A18;
    public final C33481ie A19 = new IDxCObserverShape68S0100000_2_I0(this, 32);
    public final C32301g2 A1A = new IDxSCallbackShape221S0100000_2_I0(this, 5);
    public final C18940xV A1B = new IDxMObserverShape73S0100000_1_I0(this, 6);
    public final AnonymousClass5QL A1C = new IDxMObserverShape460S0100000_2_I0(this, 0);
    public final Runnable A1D = new RunnableRunnableShape14S0100000_I0_13(this, 45);
    public final List A1E = new ArrayList();
    public final List A1F = new ArrayList();
    public final List A1G = new ArrayList();
    public final List A1H = new ArrayList();
    public final Set A1I = new HashSet();

    private void loadPadding(Object obj, View view) {
        if (yo.Homeac != null) {
            yo.Homeac.paddingView(obj, view);
        }
    }

    public void A0n(Bundle bundle) {
        boolean z2;
        String str;
        Log.i("statusesFragment/onActivityCreated");
        this.A0o.A0B.AL9(453128091, "CREATE_ACTIVITY_START", 1);
        this.A0V = true;
        A0a(true);
        A19();
        ListView listView = this.A04;
        listView.setFastScrollEnabled(false);
        yo.addFMAnnHeader(listView);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnItemClickListener(new IDxCListenerShape106S0100000_1_I0(this.A0N, this, 0));
        listView.setOnItemLongClickListener(new IDxCListenerShape299S0100000_1_I0(this, 1));
        if (!((SharedPreferences) this.A0Q.A01.get()).getBoolean("show_statuses_education", true) || this.A08.A0G()) {
            A1L(listView);
        } else {
            AnonymousClass11I r8 = this.A0Y.A03;
            AnonymousClass027 r4 = new AnonymousClass027();
            synchronized (r8.A04) {
                Map map = r8.A05;
                if (map.containsKey("status_distribution")) {
                    str = (String) map.get("status_distribution");
                    z2 = true;
                } else {
                    z2 = false;
                    str = null;
                }
            }
            if (z2) {
                r4.A09(str);
            } else {
                r8.A03.Acl(new RunnableRunnableShape0S1200000_I0(r4, r8));
            }
            C05730St.A00(new C94944lj(), r4).A0A(A0H(), new IDxObserverShape34S0200000_1_I0(listView, 6, this));
        }
        A06().findViewById(R.id.init_statuses_progress).setVisibility(0);
        AnonymousClass2Ab r0 = new AnonymousClass2Ab(this);
        this.A0i = r0;
        A1A(r0);
        this.A0F.A02(this.A19);
        this.A0V.A02(this.A1B);
        this.A0h.A02(this.A1C);
        A1D();
        AnonymousClass17S r2 = this.A0o.A0B;
        r2.AL9(453128091, "CREATE_ACTIVITY_END", 1);
        r2.AKy(453128091, 1, 2);
    }

    public void A0o(boolean z2) {
        super.A0o(z2);
        if (this.A03 >= 7 && z2) {
            this.A0J.A01(this);
        }
    }

    public void A0q() {
        Log.i("statusesFragment/onStart");
        super.A0q();
        if (this.A04.A02) {
            A1F();
        }
        A1J();
    }

    public void A0s(Bundle bundle) {
        bundle.putBoolean("WAS_FB_SHARE_BUTTON_ATTEMPTED_SI_KEY", this.A14);
        bundle.putBoolean("SHARE_CTA_VISIBILITY_SI_KEY", this.A0k.A04.A00);
    }

    public void A0w() {
        Log.i("statusesFragment/onPause");
        this.A0m.A04.A04(this);
        C14700pc r0 = this.A0e;
        if (r0 != null) {
            r0.A00();
        }
        super.A0w();
    }

    public void A0x(int i2, int i3, Intent intent) {
        C47482Jd r0;
        if (i2 != 33) {
            if (i2 == 35) {
                if (this.A14) {
                    C49892Wl r4 = this.A0k;
                    C23621Cr r02 = r4.A05;
                    r02.A00.post(new RunnableRunnableShape14S0100000_I0_13((Object) r02.A03, 46));
                    C83954Ir r1 = r4.A04;
                    r1.A01 = true;
                    r1.A00 = false;
                    r4.A00();
                }
                this.A0o.A07();
                if (this.A14) {
                    this.A0m.A00(intent);
                }
            } else if (i2 != 151) {
            } else {
                if (i3 == -1) {
                    A1N(this.A14);
                } else if (i3 == 0 && (r0 = this.A0o.A00) != null) {
                    r0.A01 = 4;
                }
            }
        } else if (i3 == -1) {
            A1H();
        }
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
        if (!this.A08.A0G()) {
            menu.add(2, R.id.menuitem_status_privacy, 0, R.string.str1688);
        }
    }

    public boolean A10(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_new_status) {
            A1H();
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_status_privacy) {
            Context A0u2 = A0u();
            Intent intent = new Intent();
            intent.setClassName(A0u2.getPackageName(), "com.obwhatsapp.status.audienceselector.StatusPrivacyActivity");
            A0r(intent);
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_new_text_status) {
            return false;
        } else {
            A1I();
            return true;
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A0c.A07("StatusesFragment_onCreateView");
        View inflate = layoutInflater.inflate(R.layout.layout057b, viewGroup, false);
        loadPadding(this, inflate);
        this.A0o.A0B.AL9(453128091, "CREATE_VIEW_START", 1);
        ListView listView = (ListView) C004601z.A0E(inflate, 16908298);
        if (!C15450qv.A02()) {
            this.A0J.A00(listView, this);
        }
        C87634Xu.A00(inflate, this);
        if (!this.A0J.A03(this)) {
            C87634Xu.A01(inflate, this, A03().getDimensionPixelSize(R.dimen.dimen07a8));
        }
        this.A0o.A0B.AL9(453128091, "CREATE_VIEW_END", 1);
        this.A0c.A07("StatusesFragment_onCreateView");
        return inflate;
    }

    public void A12() {
        Log.i("statusesFragment/onDestroy");
        super.A12();
        C49892Wl r0 = this.A0k;
        AnonymousClass4FC r1 = r0.A01;
        if (r1 != null) {
            r0.A05.A01.A03(r1);
        }
        this.A0H.A00();
        this.A0F.A03(this.A19);
        this.A0V.A03(this.A1B);
        this.A0h.A03(this.A1C);
        this.A07.A0J(this.A1D);
        this.A0f.A00.remove("status_fragment");
        AnonymousClass37I r12 = this.A0t;
        if (r12 != null) {
            r12.A06(true);
        }
        AnonymousClass2Az r13 = this.A0s;
        if (r13 != null) {
            r13.A06(true);
        }
        A1G();
    }

    public void A14() {
        this.A0c.A08("StatusesFragment_onResume");
        Log.i("statusesFragment/onResume");
        super.A14();
        this.A0m.A04.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 289));
        this.A0J.A01(this);
        this.A0c.A07("StatusesFragment_onResume");
    }

    public void A15() {
        Log.i("statusesFragment/onStop");
        super.A15();
    }

    public void A17(Bundle bundle) {
        Log.i("statusesFragment/onCreate");
        AnonymousClass17S r3 = this.A0o.A0B;
        r3.ALF(453128091, 1);
        r3.AL9(453128091, "CREATE_START", 1);
        this.A0H = this.A0I.A04(A0u(), "status-fragment");
        super.A17(bundle);
        C14870pt r6 = this.A07;
        C16320sq r9 = this.A0v;
        this.A0g = new StatusExpirationLifecycleOwner(this, r6, this.A0W, this.A0Y, r9);
        ArrayList arrayList = new ArrayList();
        arrayList.add(A0D().findViewById(R.id.fab));
        arrayList.add(A0D().findViewById(R.id.fab_second));
        boolean z2 = true;
        View view = (View) arrayList.get(1);
        if (view != null && (view instanceof ImageView) && this.A0Z.A0E(C16620tM.A01, 1874)) {
            this.A0j = new AnonymousClass3AJ((ImageView) view, this.A0M, this.A0Q);
        }
        this.A18 = true;
        if (bundle == null || !bundle.getBoolean("SHARE_CTA_VISIBILITY_SI_KEY", false)) {
            z2 = false;
        }
        C49892Wl A002 = this.A06.A00(0, z2);
        this.A0k = A002;
        AnonymousClass4FC r1 = A002.A01;
        if (r1 != null) {
            A002.A05.A01.A02(r1);
        }
        if (bundle != null) {
            this.A14 = bundle.getBoolean("WAS_FB_SHARE_BUTTON_ATTEMPTED_SI_KEY", false);
        }
        this.A0f.A00(this);
        this.A0o.A0B.AL9(453128091, "CREATE_END", 1);
    }

    public void A18(Bundle bundle, View view) {
        A19();
        if (C15450qv.A02()) {
            C449126f r1 = this.A0J;
            A19();
            r1.A00(this.A04, this);
        }
        if (this.A0J.A03(this)) {
            C87634Xu.A01(view, this, A03().getDimensionPixelSize(R.dimen.dimen07a8));
        }
    }

    public final String A1C() {
        C45782Ay r0 = this.A0u;
        if (r0 == null || r0.A05.isEmpty()) {
            return null;
        }
        return AnonymousClass1ZW.A0B(",", (String[]) this.A0u.A05.keySet().toArray(new String[0]));
    }

    public void A1D() {
        AnonymousClass37I r1 = this.A0t;
        if (r1 != null) {
            r1.A06(true);
        }
        AnonymousClass11G r6 = this.A0Y;
        C23631Ct r10 = this.A0w;
        C16220sf r7 = this.A0d;
        AnonymousClass128 r4 = this.A0W;
        AnonymousClass1L1 r8 = this.A0o;
        AnonymousClass37I r2 = new AnonymousClass37I(this.A0T, r4, this.A0X, r6, r7, r8, this, r10, this.A0z);
        this.A0t = r2;
        this.A0v.Ack(r2, new Void[0]);
    }

    public final void A1E() {
        int i2;
        int i3;
        View view = this.A0A;
        if (view != null) {
            if (this.A0u.A03()) {
                if (this.A0t != null) {
                    view.findViewById(R.id.init_statuses_progress).setVisibility(0);
                    view.findViewById(R.id.search_no_matches).setVisibility(8);
                } else if (this.A0E.A03() > 0) {
                    view.findViewById(R.id.init_statuses_progress).setVisibility(8);
                    view.findViewById(R.id.search_no_matches).setVisibility(8);
                    view.findViewById(R.id.welcome_statuses_message).setVisibility(0);
                    view.findViewById(R.id.statuses_empty_no_contacts).setVisibility(8);
                    view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
                    TextView textView = (TextView) view.findViewById(R.id.welcome_statuses_message);
                    Context context = textView.getContext();
                    String A0J2 = A0J(R.string.str1b91);
                    Drawable A042 = AnonymousClass00T.A04(context, R.drawable.ic_new_status_tip);
                    AnonymousClass00B.A06(A042);
                    textView.setText(C56522nn.A01(textView.getPaint(), AnonymousClass2SR.A06(A042, AnonymousClass00T.A00(context, R.color.color06c5)), A0J2, "%s"));
                    return;
                } else {
                    if (this.A0D.A00()) {
                        ViewGroup viewGroup = (ViewGroup) C004601z.A0E(view, R.id.statuses_empty_no_contacts);
                        if (viewGroup.getChildCount() == 0) {
                            EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(A0u());
                            viewGroup.addView(emptyTellAFriendView);
                            emptyTellAFriendView.setInviteButtonClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 8));
                        }
                        viewGroup.setVisibility(0);
                        i3 = R.id.contacts_empty_permission_denied;
                    } else {
                        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.contacts_empty_permission_denied);
                        if (viewGroup2.getChildCount() == 0) {
                            A0D().getLayoutInflater().inflate(R.layout.layout0256, viewGroup2, true);
                            viewGroup2.findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 40));
                        }
                        viewGroup2.setVisibility(0);
                        i3 = R.id.statuses_empty_no_contacts;
                    }
                    view.findViewById(i3).setVisibility(8);
                    view.findViewById(R.id.init_statuses_progress).setVisibility(8);
                    view.findViewById(R.id.search_no_matches).setVisibility(8);
                    i2 = R.id.welcome_statuses_message;
                    view.findViewById(i2).setVisibility(8);
                }
            } else if (!TextUtils.isEmpty(this.A10)) {
                view.findViewById(R.id.init_statuses_progress).setVisibility(8);
                view.findViewById(R.id.search_no_matches).setVisibility(0);
                ((TextView) view.findViewById(R.id.search_no_matches)).setText(A0K(R.string.str14a8, this.A10));
            } else {
                return;
            }
            view.findViewById(R.id.welcome_statuses_message).setVisibility(8);
            view.findViewById(R.id.statuses_empty_no_contacts).setVisibility(8);
            i2 = R.id.contacts_empty_permission_denied;
            view.findViewById(i2).setVisibility(8);
        }
    }

    public final void A1F() {
        if (this.A17) {
            this.A0o.A0A(Boolean.TRUE);
            if (this.A0t == null) {
                this.A0o.A0C(this.A0u.A05, this.A0u.A02.size());
            }
        }
    }

    public final void A1G() {
        List<Uri> list = this.A1H;
        for (Uri revokeUriPermission : list) {
            this.A0O.A00.revokeUriPermission(revokeUriPermission, 1);
        }
        list.clear();
    }

    public final void A1H() {
        this.A0o.A05();
        Intent A092 = RequestPermissionActivity.A09(A0u(), this.A0P, 33, 0, 0, false);
        if (A092 == null) {
            C23171At r3 = this.A0C;
            C001000l A0C2 = A0C();
            AnonymousClass00B.A06(A0C2);
            if (r3.A00(A0C2, (C14600pS) A0C2, this.A1A, 33)) {
                if (this.A03 != null) {
                    this.A0Q.A0K().putBoolean("show_statuses_education", false).apply();
                    this.A03.setVisibility(8);
                }
                A0r(C14750ph.A0f(A0u(), C34771kq.A00.getRawString(), 4));
                return;
            }
            return;
        }
        startActivityForResult(A092, 33);
    }

    public final void A1I() {
        this.A0o.A06();
        Context A022 = A02();
        Intent intent = new Intent();
        intent.setClassName(A022.getPackageName(), "com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity");
        intent.putExtra("camera_origin", 4);
        intent.putExtra("entry_point", 5);
        A0r(intent);
    }

    public final void A1J() {
        C14870pt r0 = this.A07;
        Runnable runnable = this.A1D;
        r0.A0J(runnable);
        if (!this.A0u.A03() && A0C() != null) {
            C45782Ay r6 = this.A0u;
            long j2 = 0;
            for (C30991dI r3 : r6.A02) {
                if (r3.A04() > j2) {
                    j2 = r3.A04();
                }
            }
            for (C30991dI r32 : r6.A03) {
                if (r32.A04() > j2) {
                    j2 = r32.A04();
                }
            }
            for (C30991dI r33 : r6.A01) {
                if (r33.A04() > j2) {
                    j2 = r33.A04();
                }
            }
            C30991dI r34 = r6.A00;
            if (r34 != null && r34.A04() > j2) {
                j2 = r34.A04();
            }
            this.A07.A0L(runnable, (C42681yF.A01(j2) - System.currentTimeMillis()) + 1000);
        }
    }

    public final void A1K(Animator.AnimatorListener animatorListener, boolean z2) {
        View view;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.A0i.getCount(); i2++) {
            if (this.A0i.getItemViewType(i2) == 0) {
                C63303Gx r4 = (C63303Gx) ((AnonymousClass5QM) this.A0i.A03.A12.get(i2));
                C16220sf r2 = this.A0d;
                C30991dI r1 = r4.A01;
                if (r2.A0R(r1.A0B) && !r1.A0B() && (view = r4.A00) != null) {
                    if (z2) {
                        view.measure(0, 0);
                    }
                    int measuredHeight = view.getMeasuredHeight();
                    int[] iArr = new int[2];
                    if (z2) {
                        iArr[0] = 0;
                        iArr[1] = measuredHeight;
                    } else {
                        iArr[0] = measuredHeight;
                        iArr[1] = 0;
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                    ofInt.addListener(new IDxLAdapterShape0S0101000_2_I0(view, measuredHeight, 1));
                    ofInt.addUpdateListener(new C91064fJ(view, z2));
                    arrayList.add(ofInt);
                }
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.setInterpolator(new DecelerateInterpolator());
        this.A00.setDuration(250);
        this.A00.addListener(animatorListener);
        this.A00.playTogether(arrayList);
        this.A00.start();
    }

    public final void A1L(ListView listView) {
        if (this.A02 == null) {
            this.A02 = new Space(A0u());
            this.A02.setLayoutParams(new AbsListView.LayoutParams(-1, A03().getDimensionPixelSize(R.dimen.dimen0248)));
        }
        listView.removeHeaderView(this.A02);
        listView.addHeaderView(this.A02);
    }

    public final void A1M(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0q.A00(this.A0W.A00(((C30991dI) it.next()).A0B));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            for (C16740tZ A002 : this.A0W.A01(((C30991dI) it2.next()).A0B)) {
                this.A0q.A00(A002);
            }
        }
    }

    public final void A1N(boolean z2) {
        C47482Jd r0;
        C001000l A0C2 = A0C();
        if (A0C2 != null) {
            this.A14 = z2;
            C23611Cq r2 = this.A0m;
            ArrayList arrayList = new ArrayList(this.A0k.A05.A03.values());
            if (!(z2 ? r2.A02(A0C2, this, r2.A02, arrayList) : r2.A02(A0C2, this, r2.A03, arrayList)) && !this.A0m.A00.A0B() && (r0 = this.A0o.A00) != null) {
                r0.A01 = 4;
            }
        }
    }

    public /* synthetic */ void A4c(C14810pn r1) {
        r1.AMG();
    }

    public void A57(AnonymousClass2c9 r3) {
        this.A10 = r3.A01;
        this.A0i.getFilter().filter(this.A10);
    }

    public String ACg() {
        return "status_fragment";
    }

    public String ADI() {
        if (!this.A08.A0G()) {
            return A0J(R.string.str0d05);
        }
        return null;
    }

    public Drawable ADJ() {
        if (this.A08.A0G()) {
            return null;
        }
        return AnonymousClass2SR.A02(A02(), R.drawable.ic_camera, R.color.color090b);
    }

    public String ADK() {
        return null;
    }

    public String AFo() {
        if (!this.A08.A0G()) {
            return A0J(R.string.str0d06);
        }
        return null;
    }

    public Drawable AFp() {
        if (this.A08.A0G()) {
            return null;
        }
        return AnonymousClass2SR.A02(A02(), R.drawable.ic_text_status_compose, R.color.color021c);
    }

    public C14700pc AG9(int i2, int i3, boolean z2) {
        View findViewById = A0D().findViewById(R.id.pager_holder);
        ArrayList arrayList = new ArrayList();
        arrayList.add(A0D().findViewById(R.id.fab));
        arrayList.add(A0D().findViewById(R.id.fab_second));
        C14700pc r2 = new C14700pc(this, C32291fz.A00(findViewById, i2, i3), this.A0L, arrayList, z2);
        this.A0e = r2;
        r2.A03(new RunnableRunnableShape14S0100000_I0_13(this, 44));
        return this.A0e;
    }

    public int AGS() {
        return 300;
    }

    public void APj(DialogFragment dialogFragment, boolean z2) {
    }

    public void ATF() {
        A1H();
    }

    public void AWq() {
        A1I();
    }

    public void AXj(C45782Ay r10) {
        this.A0t = null;
        this.A0u = r10;
        AnonymousClass1L1 r0 = this.A0o;
        Map map = r10.A04;
        Map map2 = r0.A0H;
        map2.clear();
        map2.putAll(map);
        if (r10.A01.size() == 0) {
            this.A15 = true;
        }
        this.A0i.getFilter().filter(this.A10);
        long j2 = 0;
        int i2 = 0;
        for (C30991dI r1 : this.A0u.A02) {
            i2++;
            if (r1.A03() > j2) {
                j2 = r1.A03();
            }
        }
        C001000l A0C2 = A0C();
        if (A0C2 instanceof C14680pa) {
            HomeActivity homeActivity = (HomeActivity) ((C14680pa) A0C2);
            if (j2 != 0) {
                homeActivity.A04 = j2;
            }
            homeActivity.A05.A0J(homeActivity.A27);
            if (homeActivity.A03 == 300) {
                homeActivity.A3D();
            } else {
                long j3 = ((SharedPreferences) homeActivity.A09.A01.get()).getLong("last_notified_status_row_id", 0);
                C14840pq A0H2 = homeActivity.A0Q.A0H(HomeActivity.A02(homeActivity.A01, 300));
                if (j3 < j2) {
                    A0H2.A00 = i2;
                } else if (A0H2.A00 != 0) {
                    A0H2.A00 = 0;
                }
                homeActivity.A3J();
            }
        }
        AnonymousClass1L1 r2 = this.A0o;
        C47482Jd r12 = r2.A00;
        if (r12 != null && !r12.A04 && r12.A07) {
            r2.A0C(r10.A05, this.A0u.A02.size());
        }
        A1E();
        A1J();
        this.A0g.A00();
        AnonymousClass2Az r13 = this.A0s;
        if (r13 != null) {
            r13.A06(true);
        }
        AnonymousClass2Az r22 = new AnonymousClass2Az(this.A0W, this);
        this.A0s = r22;
        this.A0v.Ack(r22, new Void[0]);
    }

    public void AeZ(boolean z2) {
        this.A16 = z2;
        this.A0i.getFilter().filter(this.A10);
    }

    public void Aea(boolean z2) {
        this.A17 = z2;
        if (z2) {
            C15860rz r1 = this.A0Q;
            r1.A0K().putLong("status_tab_last_opened_time", this.A0N.A00()).apply();
            A1F();
            if (this.A0Z.A0E(C16620tM.A02, 249)) {
                this.A0v.Acl(new RunnableRunnableShape14S0100000_I0_13(this, 43));
            }
            AnonymousClass3AJ r0 = this.A0j;
            if (r0 != null) {
                r0.A00();
                return;
            }
            return;
        }
        C49892Wl r5 = this.A0k;
        C83954Ir r4 = r5.A04;
        if (r4.A00) {
            C23621Cr r02 = r5.A05;
            r02.A00.post(new RunnableRunnableShape14S0100000_I0_13((Object) r02.A03, 46));
            C47482Jd r03 = r5.A06.A00;
            if (r03 != null) {
                r03.A00 = 1;
            }
            r4.A01 = false;
            r4.A00 = false;
            r5.A00();
        }
        this.A0o.A07();
        if (this.A18) {
            this.A15 = true;
            this.A0i.getFilter().filter(this.A10);
        }
        AnonymousClass1BM r42 = this.A0p;
        Log.i("statusdownload/cancel-all-status-downloads");
        C209212c r3 = r42.A03;
        for (C16730tY r12 : r3.A04()) {
            if (C16030sJ.A0Q(r12.A11.A00)) {
                r3.A0B(r12, false, false);
            }
        }
        r42.A04.clear();
        r42.A00 = null;
        r42.A01 = null;
    }

    public boolean AgZ() {
        return true;
    }
}
