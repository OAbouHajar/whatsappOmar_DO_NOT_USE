package com.obwhatsapp.calling.callhistory;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass05J;
import X.AnonymousClass127;
import X.AnonymousClass15A;
import X.AnonymousClass18R;
import X.AnonymousClass195;
import X.AnonymousClass19Y;
import X.AnonymousClass1BE;
import X.AnonymousClass1BJ;
import X.AnonymousClass1D0;
import X.AnonymousClass1OL;
import X.AnonymousClass1SN;
import X.AnonymousClass1SP;
import X.AnonymousClass1UP;
import X.AnonymousClass1VD;
import X.AnonymousClass2Ao;
import X.AnonymousClass2JP;
import X.AnonymousClass2SR;
import X.AnonymousClass2c9;
import X.AnonymousClass391;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.AnonymousClass4QA;
import X.C000900k;
import X.C001000l;
import X.C004601z;
import X.C009804r;
import X.C101044wc;
import X.C101054wd;
import X.C109275Rk;
import X.C109505Sk;
import X.C14710pd;
import X.C14750ph;
import X.C14760pi;
import X.C14780pk;
import X.C14800pm;
import X.C14810pn;
import X.C14870pt;
import X.C15450qv;
import X.C15830rv;
import X.C15900s5;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16320sq;
import X.C16440t3;
import X.C17140ub;
import X.C17200uh;
import X.C17240ul;
import X.C17650vQ;
import X.C18260wP;
import X.C18890xQ;
import X.C19270y9;
import X.C19980zJ;
import X.C204310c;
import X.C216014s;
import X.C25781Lc;
import X.C30341cC;
import X.C32221fq;
import X.C32241fu;
import X.C32601gl;
import X.C33481ie;
import X.C35011lE;
import X.C37831po;
import X.C38581r1;
import X.C40781ug;
import X.C42681yF;
import X.C449126f;
import X.C54472hZ;
import X.C56522nn;
import X.C59912zL;
import X.C608236g;
import X.C616739v;
import X.C72993n6;
import X.C78643yQ;
import X.C87634Xu;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape299S0100000_1_I0;
import com.facebook.redex.IDxCallbackShape333S0100000_1_I0;
import com.facebook.redex.IDxLObserverShape301S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.EmptyTellAFriendView;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.components.SelectionCheckView;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import com.whatsapp.voipcalling.IDxCObserverShape111S0100000_2_I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class CallsHistoryFragment extends Hilt_CallsHistoryFragment implements C14780pk, C14800pm, AnonymousClass1BE {
    public MenuItem A00;
    public View A01;
    public View A02;
    public AnonymousClass05J A03;
    public C19980zJ A04;
    public C14870pt A05;
    public C16040sK A06;
    public C15900s5 A07;
    public AnonymousClass1BJ A08;
    public C18890xQ A09;
    public AnonymousClass1OL A0A;
    public C32221fq A0B;
    public C608236g A0C;
    public C204310c A0D;
    public AnonymousClass1SN A0E;
    public C17650vQ A0F;
    public AnonymousClass127 A0G;
    public C18260wP A0H;
    public AnonymousClass19Y A0I;
    public C16000sG A0J;
    public C17140ub A0K;
    public C16080sP A0L;
    public AnonymousClass2Ao A0M;
    public AnonymousClass2Ao A0N;
    public C17200uh A0O;
    public C449126f A0P;
    public AnonymousClass01V A0Q;
    public C16440t3 A0R;
    public AnonymousClass013 A0S;
    public AnonymousClass1D0 A0T;
    public C16070sO A0U;
    public AnonymousClass195 A0V;
    public C14710pd A0W;
    public C17240ul A0X;
    public AnonymousClass18R A0Y;
    public C25781Lc A0Z;
    public C216014s A0a;
    public C16320sq A0b;
    public AnonymousClass1SP A0c;
    public AnonymousClass15A A0d;
    public CharSequence A0e;
    public ArrayList A0f;
    public ArrayList A0g = new ArrayList();
    public LinkedHashMap A0h = new LinkedHashMap();
    public boolean A0i = true;
    public boolean A0j;
    public final C009804r A0k = new IDxCallbackShape333S0100000_1_I0(this, 0);
    public final C40781ug A0l = new IDxSObserverShape63S0100000_2_I0(this, 3);
    public final C33481ie A0m = new IDxCObserverShape68S0100000_2_I0(this, 5);
    public final AnonymousClass1VD A0n = new IDxPObserverShape81S0100000_2_I0(this, 3);
    public final C109505Sk A0o = new IDxLObserverShape301S0100000_2_I0(this, 0);
    public final C19270y9 A0p = new IDxCObserverShape111S0100000_2_I0(this, 1);
    public final Runnable A0q = new RunnableRunnableShape5S0100000_I0_4((Object) this, 0);
    public final HashSet A0r = new HashSet();
    public final Set A0s = new HashSet();

    public class ClearCallLogDialogFragment extends Hilt_CallsHistoryFragment_ClearCallLogDialogFragment {
        public C14870pt A00;
        public AnonymousClass1D0 A01;
        public C14760pi A02;
        public C16320sq A03;
        public AnonymousClass1SP A04;

        public Dialog A1B(Bundle bundle) {
            IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = new IDxCListenerShape128S0100000_2_I1(this, 27);
            C32241fu A0c = AnonymousClass3K3.A0c(this);
            A0c.A01(R.string.str0468);
            return AnonymousClass3K2.A0O(iDxCListenerShape128S0100000_2_I1, A0c, R.string.str0e87);
        }
    }

    public static List A01(C16000sG r6, C16080sP r7, C37831po r8, ArrayList arrayList) {
        List A042 = r8.A04();
        C35011lE r5 = r8.A0C;
        UserJid userJid = r5.A01;
        int i2 = 0;
        while (i2 < A042.size() && !((C38581r1) A042.get(i2)).A02.equals(userJid)) {
            i2++;
        }
        if (i2 != 0 && i2 < A042.size()) {
            Object obj = A042.get(i2);
            A042.remove(i2);
            A042.add(0, obj);
        }
        boolean z2 = !r5.A03;
        if (A042.size() > 0) {
            Collections.sort(A042.subList(z2 ? 1 : 0, A042.size()), new C72993n6(r6, r7, arrayList));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < A042.size(); i3++) {
            arrayList2.add(((C38581r1) A042.get(i3)).A02);
        }
        return arrayList2;
    }

    public static /* synthetic */ void A02(CallsHistoryFragment callsHistoryFragment) {
        callsHistoryFragment.A0B.notifyDataSetChanged();
        View view = callsHistoryFragment.A02;
        int i2 = 8;
        if (callsHistoryFragment.A0g.isEmpty()) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    private void loadPadding(Object obj, View view) {
        if (yo.Homeac != null) {
            yo.Homeac.paddingView(obj, view);
        }
    }

    public void A0n(Bundle bundle) {
        HashSet hashSet;
        Log.i("voip/CallsFragment/onActivityCreated");
        this.A0V = true;
        A0a(true);
        A19();
        ListView listView = this.A04;
        yo.hideDiv(listView);
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnItemClickListener(new C78643yQ(this, this.A0R));
        A19();
        this.A04.setOnItemLongClickListener(new IDxCListenerShape299S0100000_1_I0(this, 0));
        if (!(bundle == null || (hashSet = (HashSet) bundle.getSerializable("SelectedCallGroupIds")) == null)) {
            HashSet hashSet2 = this.A0r;
            hashSet2.clear();
            hashSet2.addAll(hashSet);
            if (!hashSet2.isEmpty()) {
                this.A03 = ((C000900k) A0C()).AgA(this.A0k);
            }
        }
        A06().findViewById(R.id.init_calls_progress).setVisibility(0);
        this.A0K.A02(this.A0m);
        this.A0c.A02(this.A0o);
        this.A0G.A02(this.A0l);
        this.A0Y.A02(this.A0n);
        this.A0d.A02(this.A0p);
    }

    public void A0o(boolean z2) {
        super.A0o(z2);
        if (this.A03 >= 7 && z2) {
            this.A0P.A01(this);
        }
    }

    public void A0q() {
        super.A0q();
        A1D();
    }

    public void A0s(Bundle bundle) {
        bundle.putSerializable("SelectedCallGroupIds", this.A0r);
        bundle.putBoolean("request_sync", this.A0j);
    }

    public void A0t(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menuitem_clear_call_log);
        this.A00 = findItem;
        if (findItem != null) {
            findItem.setVisible(!this.A0h.isEmpty());
        }
    }

    public void A0w() {
        Log.i("voip/CallsFragment/onPause");
        super.A0w();
    }

    public void A0x(int i2, int i3, Intent intent) {
        boolean z2 = true;
        if (i2 != 10) {
            if (i2 == 150 && i3 == -1) {
                this.A0j = true;
                A1H();
            }
        } else if (i3 == -1) {
            UserJid nullable = UserJid.getNullable(intent.getStringExtra("contact"));
            AnonymousClass00B.A06(nullable);
            int intExtra = intent.getIntExtra("call_type", 1);
            if (intExtra == 1 || intExtra == 2) {
                C204310c r3 = this.A0D;
                C16010sH A0A2 = this.A0J.A0A(nullable);
                C001000l A0D2 = A0D();
                if (intExtra != 2) {
                    z2 = false;
                }
                r3.A01(A0D2, A0A2, 3, z2);
            }
        }
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
        menu.add(3, R.id.menuitem_clear_call_log, 0, R.string.str0467);
    }

    public boolean A10(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_new_call) {
            ATF();
        } else if (menuItem.getItemId() != R.id.menuitem_clear_call_log) {
            return false;
        } else {
            if (this.A03 >= 7) {
                new ClearCallLogDialogFragment().A1G(this.A0H, (String) null);
                return true;
            }
        }
        return true;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout00dd, viewGroup, false);
        loadPadding(this, inflate);
        ListView listView = (ListView) C004601z.A0E(inflate, 16908298);
        this.A02 = C004601z.A0E(inflate, 16908292);
        if (C32601gl.A04(this.A06, this.A0W)) {
            View inflate2 = A05().inflate(R.layout.layout01fe, (ViewGroup) null, false);
            this.A01 = inflate2;
            TextView textView = (TextView) C004601z.A0E(inflate2, R.id.call_link_title);
            yo.ChangeSize(textView, 0);
            TextView textView2 = (TextView) C004601z.A0E(this.A01, R.id.subtitle);
            yo.ChangeSize(textView2, 1);
            textView2.setSelected(true);
            AnonymousClass1UP.A06(textView);
            this.A01.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 14));
        }
        if (!C15450qv.A02()) {
            this.A0P.A00(listView, this);
        }
        C87634Xu.A00(inflate, this);
        if (!this.A0P.A03(this)) {
            C87634Xu.A01(inflate, this, A03().getDimensionPixelSize(R.dimen.dimen02a6));
        }
        return inflate;
    }

    public void A12() {
        Log.i("voip/CallsFragment/onDestroy");
        super.A12();
        this.A0K.A03(this.A0m);
        this.A0c.A03(this.A0o);
        this.A0G.A03(this.A0l);
        this.A0Y.A03(this.A0n);
        this.A0d.A03(this.A0p);
        this.A0N.A00();
        this.A0M.A00();
        this.A05.A0J(this.A0q);
    }

    public void A14() {
        Log.i("voip/CallsFragment/onResume");
        super.A14();
        if (this.A0h.isEmpty()) {
            A1F();
        }
        this.A0P.A01(this);
    }

    public void A17(Bundle bundle) {
        yo.setCallF(this);
        Log.i("voip/CallsFragment/onCreate");
        this.A0N = this.A0O.A04(A0u(), "calls-fragment-single");
        this.A0M = this.A0O.A05("calls-fragment-multi", 0.0f, A03().getDimensionPixelSize(R.dimen.dimen074a));
        boolean z2 = false;
        if (bundle != null) {
            z2 = bundle.getBoolean("request_sync", false);
        }
        this.A0j = z2;
        super.A17(bundle);
    }

    public void A18(Bundle bundle, View view) {
        A19();
        if (C15450qv.A02()) {
            C449126f r1 = this.A0P;
            A19();
            r1.A00(this.A04, this);
        }
        if (this.A0P.A03(this)) {
            C87634Xu.A01(view, this, A03().getDimensionPixelSize(R.dimen.dimen02a6));
        }
        if (C32601gl.A04(this.A06, this.A0W) && this.A01 != null) {
            FrameLayout frameLayout = new FrameLayout(A0u());
            frameLayout.addView(this.A01);
            A19();
            this.A04.addHeaderView(frameLayout);
        }
        C32221fq r0 = new C32221fq(this);
        this.A0B = r0;
        A1A(r0);
        A1E();
    }

    public final void A1C() {
        AnonymousClass4QA r2;
        HashSet hashSet = this.A0r;
        if (!hashSet.isEmpty()) {
            this.A0s.clear();
            int i2 = 0;
            while (true) {
                A19();
                if (i2 < this.A04.getChildCount()) {
                    A19();
                    View childAt = this.A04.getChildAt(i2);
                    if (!(childAt == null || (r2 = (AnonymousClass4QA) childAt.getTag()) == null || r2.A00.ACu() != 2)) {
                        C59912zL r22 = (C59912zL) r2;
                        if (hashSet.contains(((C101044wc) r22.A00).A00.A05())) {
                            r22.A01.setBackgroundResource(0);
                            r22.A0D.A04(false, true);
                        }
                    }
                    i2++;
                } else {
                    hashSet.clear();
                    return;
                }
            }
        }
    }

    public final void A1D() {
        A1I();
        if (A0c() && this.A0A != null) {
            int dimensionPixelSize = A03().getDimensionPixelSize(R.dimen.dimen0248);
            LinkedHashMap linkedHashMap = this.A0h;
            if (!linkedHashMap.isEmpty() && ((C616739v) linkedHashMap.values().iterator().next()).A07()) {
                dimensionPixelSize = A03().getDimensionPixelSize(R.dimen.dimen04b9);
            }
            A19();
            ListView listView = this.A04;
            listView.setClipToPadding(false);
            listView.setPadding(listView.getPaddingLeft(), dimensionPixelSize, listView.getPaddingRight(), listView.getPaddingBottom());
        }
    }

    public final void A1E() {
        C608236g r1 = this.A0C;
        if (r1 != null) {
            r1.A06(true);
        }
        AnonymousClass05J r0 = this.A03;
        if (r0 != null) {
            r0.A06();
        }
        C608236g r2 = new C608236g(this);
        this.A0C = r2;
        this.A0b.Ack(r2, new Void[0]);
    }

    public final void A1F() {
        int i2;
        int i3;
        View view = this.A0A;
        if (view != null) {
            if (!TextUtils.isEmpty(this.A0e)) {
                view.findViewById(R.id.init_calls_progress).setVisibility(8);
                view.findViewById(R.id.search_no_matches).setVisibility(0);
                ((TextView) view.findViewById(R.id.search_no_matches)).setText(A0C().getString(R.string.str14a8, new Object[]{this.A0e}));
            } else {
                if (this.A0h.isEmpty()) {
                    if (this.A0C != null) {
                        view.findViewById(R.id.init_calls_progress).setVisibility(0);
                        view.findViewById(R.id.search_no_matches).setVisibility(8);
                    } else if (this.A0J.A03() > 0) {
                        view.findViewById(R.id.init_calls_progress).setVisibility(8);
                        view.findViewById(R.id.search_no_matches).setVisibility(8);
                        view.findViewById(R.id.welcome_calls_message).setVisibility(0);
                        view.findViewById(R.id.calls_empty_no_contacts).setVisibility(8);
                        view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
                        TextView textView = (TextView) view.findViewById(R.id.welcome_calls_message);
                        textView.setContentDescription(A0C().getString(R.string.str0048));
                        String string = A0C().getString(R.string.str1b90);
                        textView.setText(C56522nn.A01(textView.getPaint(), AnonymousClass2SR.A02(A02(), R.drawable.ic_new_call_tip, R.color.color04d2), string, "%s"));
                    } else {
                        if (this.A0I.A00()) {
                            ViewGroup viewGroup = (ViewGroup) C004601z.A0E(view, R.id.calls_empty_no_contacts);
                            if (viewGroup.getChildCount() == 0) {
                                EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(A0u());
                                View A0E2 = C004601z.A0E(emptyTellAFriendView, R.id.container);
                                A0E2.setPadding(A0E2.getPaddingLeft(), 0, A0E2.getPaddingRight(), 0);
                                viewGroup.addView(emptyTellAFriendView);
                                emptyTellAFriendView.setInviteButtonClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 15));
                            }
                            viewGroup.setVisibility(0);
                            i2 = R.id.contacts_empty_permission_denied;
                        } else {
                            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.contacts_empty_permission_denied);
                            if (viewGroup2.getChildCount() == 0) {
                                A05().inflate(R.layout.layout0256, viewGroup2, true);
                                viewGroup2.findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 31));
                            }
                            viewGroup2.setVisibility(0);
                            i2 = R.id.calls_empty_no_contacts;
                        }
                        view.findViewById(i2).setVisibility(8);
                        view.findViewById(R.id.init_calls_progress).setVisibility(8);
                        view.findViewById(R.id.search_no_matches).setVisibility(8);
                        i3 = R.id.welcome_calls_message;
                        view.findViewById(i3).setVisibility(8);
                    }
                }
                A1G();
            }
            view.findViewById(R.id.welcome_calls_message).setVisibility(8);
            view.findViewById(R.id.calls_empty_no_contacts).setVisibility(8);
            i3 = R.id.contacts_empty_permission_denied;
            view.findViewById(i3).setVisibility(8);
            A1G();
        }
    }

    public final void A1G() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A02.getLayoutParams();
        layoutParams.topMargin = A03().getDimensionPixelSize(R.dimen.dimen07cb);
        if (C32601gl.A04(this.A06, this.A0W) && this.A01 != null && TextUtils.isEmpty(this.A0e)) {
            layoutParams.topMargin += A03().getDimensionPixelSize(R.dimen.dimen02b1);
        }
        layoutParams.bottomMargin = A03().getConfiguration().orientation == 2 ? 0 : A03().getDimensionPixelSize(R.dimen.dimen02b1);
        this.A02.setLayoutParams(layoutParams);
    }

    public final void A1H() {
        AnonymousClass391 r3 = new AnonymousClass391(A0C());
        boolean z2 = true;
        r3.A03 = true;
        if (!this.A0j || this.A06.A0G()) {
            z2 = false;
        }
        r3.A0C = Boolean.valueOf(z2);
        startActivityForResult(r3.A00(), 10);
        this.A0j = false;
    }

    public final void A1I() {
        C14870pt r0 = this.A05;
        Runnable runnable = this.A0q;
        r0.A0J(runnable);
        LinkedHashMap linkedHashMap = this.A0h;
        if (!linkedHashMap.isEmpty() && A0C() != null) {
            this.A05.A0L(runnable, (C42681yF.A01(((C616739v) this.A0h.get(linkedHashMap.keySet().iterator().next())).A02()) - System.currentTimeMillis()) + 1000);
        }
    }

    public void A1J(C616739v r12, C59912zL r13) {
        String A052 = r12.A05();
        HashSet hashSet = this.A0r;
        if (hashSet.contains(A052)) {
            hashSet.remove(A052);
            if (hashSet.isEmpty() && this.A03 != null) {
                A1C();
                AnonymousClass05J r0 = this.A03;
                if (r0 != null) {
                    r0.A05();
                }
            }
            r13.A01.setBackgroundResource(0);
            SelectionCheckView selectionCheckView = r13.A0D;
            selectionCheckView.setVisibility(8);
            selectionCheckView.A04(false, true);
        } else {
            hashSet.add(A052);
            if (this.A03 == null) {
                C001000l A0C2 = A0C();
                if (A0C2 instanceof C000900k) {
                    this.A03 = ((C000900k) A0C2).AgA(this.A0k);
                }
            }
            r13.A01.setBackgroundResource(R.color.color04c8);
            SelectionCheckView selectionCheckView2 = r13.A0D;
            selectionCheckView2.setVisibility(0);
            selectionCheckView2.A04(true, true);
        }
        AnonymousClass05J r02 = this.A03;
        if (r02 != null) {
            r02.A06();
        }
        if (!hashSet.isEmpty()) {
            C001000l A0C3 = A0C();
            AnonymousClass01V r9 = this.A0Q;
            AnonymousClass013 r8 = this.A0S;
            long size = (long) hashSet.size();
            AnonymousClass2JP.A00(A0C3, r9, r8.A0J(new Object[]{Integer.valueOf(hashSet.size())}, R.plurals.plurals00dc, size));
        }
    }

    public void A1K(C109275Rk r9, AnonymousClass4QA r10) {
        C15830rv r3;
        int ACu = r9.ACu();
        if (ACu == 2) {
            C616739v r5 = ((C101044wc) r9).A00;
            ArrayList arrayList = r5.A04;
            if (arrayList.isEmpty()) {
                AnonymousClass00B.A0B("voip/CallsFragment/onListItemClicked empty call group", false);
                return;
            }
            C59912zL r102 = (C59912zL) r10;
            if (this.A03 != null) {
                A1J(r5, r102);
                return;
            }
            GroupJid groupJid = ((C37831po) Collections.unmodifiableList(arrayList).get(0)).A04;
            C16010sH A022 = C30341cC.A02(this.A0J, this.A0X, groupJid, this.A0a);
            if (!r5.A06() || A022 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (C37831po A032 : Collections.unmodifiableList(arrayList)) {
                    arrayList2.add(A032.A03());
                }
                if (A022 != null) {
                    r3 = A022.A0E;
                } else {
                    C16010sH A033 = r5.A03();
                    AnonymousClass00B.A06(A033);
                    r3 = A033.A0E;
                }
                Context A0u = A0u();
                Intent intent = new Intent();
                intent.setClassName(A0u.getPackageName(), "com.obwhatsapp.calling.callhistory.CallLogActivity");
                intent.putExtra("jid", C16030sJ.A03(r3));
                intent.putExtra("calls", arrayList2);
                A0r(intent);
                return;
            }
            Context A023 = A02();
            C35011lE A034 = ((C37831po) Collections.unmodifiableList(arrayList).get(0)).A03();
            Intent intent2 = new Intent();
            intent2.setClassName(A023.getPackageName(), "com.obwhatsapp.calling.callhistory.group.GroupCallLogActivity");
            intent2.putExtra("call_log_key", A034);
            A023.startActivity(intent2);
        } else if (ACu == 1) {
            C54472hZ.A00(new C14750ph().A0x(A0u(), ((C101054wd) r9).A00), this);
        }
    }

    public /* synthetic */ void A4c(C14810pn r1) {
        r1.AMG();
    }

    public void A57(AnonymousClass2c9 r3) {
        this.A0e = r3.A01;
        this.A0B.getFilter().filter(this.A0e);
    }

    public void A7y() {
        this.A0i = false;
    }

    public void A8M() {
        this.A0i = true;
    }

    public String ADI() {
        return A0C().getString(R.string.str0d03);
    }

    public Drawable ADJ() {
        return AnonymousClass00T.A04(A02(), R.drawable.ic_action_new_call);
    }

    public String ADK() {
        return null;
    }

    public String AFo() {
        return null;
    }

    public Drawable AFp() {
        return null;
    }

    public int AGS() {
        return 400;
    }

    public void ATF() {
        if (this.A0F.A00()) {
            Log.w("voip/CallsFragment try to start outgoing call from active voip call");
            this.A05.A09(R.string.str083c, 0);
        } else if (this.A0I.A00()) {
            A1H();
        } else {
            RequestPermissionActivity.A0O(this, R.string.str11b8, R.string.str11b7);
        }
    }

    public void AWq() {
    }

    public /* synthetic */ void AeZ(boolean z2) {
    }

    public /* synthetic */ void Aea(boolean z2) {
    }

    public boolean AgZ() {
        return true;
    }

    public void deleteCalls() {
        new ClearCallLogDialogFragment().A1G(this.A0H, (String) null);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass05J r0 = this.A03;
        if (r0 != null) {
            r0.A06();
        }
        if (this.A0g.isEmpty()) {
            A1G();
        }
    }
}
