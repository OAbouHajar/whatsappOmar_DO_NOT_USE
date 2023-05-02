package com.obwhatsapp.calling.callhistory.view;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass05J;
import X.AnonymousClass19Y;
import X.AnonymousClass1BE;
import X.AnonymousClass1BJ;
import X.AnonymousClass1D0;
import X.AnonymousClass1W4;
import X.AnonymousClass2Ao;
import X.AnonymousClass2JP;
import X.AnonymousClass2SR;
import X.AnonymousClass2Wj;
import X.AnonymousClass2Xf;
import X.AnonymousClass2c9;
import X.AnonymousClass391;
import X.AnonymousClass3HT;
import X.AnonymousClass4DZ;
import X.C000900k;
import X.C001000l;
import X.C004601z;
import X.C005602k;
import X.C006602z;
import X.C009804r;
import X.C101124wk;
import X.C101134wl;
import X.C1042754r;
import X.C14710pd;
import X.C14780pk;
import X.C14800pm;
import X.C14810pn;
import X.C14870pt;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16440t3;
import X.C17200uh;
import X.C17240ul;
import X.C17650vQ;
import X.C18890xQ;
import X.C19980zJ;
import X.C204310c;
import X.C216014s;
import X.C30521cU;
import X.C37831po;
import X.C40661uU;
import X.C449126f;
import X.C55352jN;
import X.C56522nn;
import X.C57712rd;
import X.C64923Se;
import X.C64953Sh;
import X.C82494Da;
import X.C82504Db;
import X.C87634Xu;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCallbackShape333S0100000_1_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.EmptyTellAFriendView;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.obwhatsapp.collections.observablelistview.ObservableListView;
import com.obwhatsapp.components.SelectionCheckView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CallsHistoryFragmentV2 extends Hilt_CallsHistoryFragmentV2 implements C14780pk, C14800pm, AnonymousClass1BE {
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public TextView A04;
    public TextView A05;
    public AnonymousClass05J A06;
    public RecyclerView A07;
    public C19980zJ A08;
    public C14870pt A09;
    public C16040sK A0A;
    public AnonymousClass1BJ A0B;
    public C18890xQ A0C;
    public AnonymousClass2Xf A0D;
    public CallsHistoryFragmentV2ViewModel A0E;
    public C204310c A0F;
    public C17650vQ A0G;
    public ObservableListView A0H;
    public AnonymousClass19Y A0I;
    public C16000sG A0J;
    public AnonymousClass2Ao A0K;
    public AnonymousClass2Ao A0L;
    public C17200uh A0M;
    public C449126f A0N;
    public AnonymousClass01V A0O;
    public C16440t3 A0P;
    public AnonymousClass013 A0Q;
    public AnonymousClass1D0 A0R;
    public C14710pd A0S;
    public C17240ul A0T;
    public C216014s A0U;
    public CharSequence A0V = "";
    public boolean A0W = true;
    public final C009804r A0X = new IDxCallbackShape333S0100000_1_I0(this, 1);
    public final AnonymousClass4DZ A0Y = new AnonymousClass4DZ(this);
    public final C82494Da A0Z = new C82494Da(this);
    public final C82504Db A0a = new C82504Db(this);
    public final HashSet A0b = new HashSet();

    public static /* synthetic */ void A01(C57712rd r10, CallsHistoryFragmentV2 callsHistoryFragmentV2) {
        String str;
        AnonymousClass05J r0;
        C101124wk r02 = r10.A00;
        if (r02 == null) {
            str = "CallsHistoryFragmentV2/toggleItemSelection view holder not bound";
        } else {
            HashSet hashSet = callsHistoryFragmentV2.A0b;
            boolean contains = hashSet.contains(r02);
            if (contains) {
                hashSet.remove(r02);
                if (hashSet.isEmpty() && (r0 = callsHistoryFragmentV2.A06) != null) {
                    r0.A05();
                }
            } else {
                hashSet.add(r02);
                if (callsHistoryFragmentV2.A06 == null) {
                    C001000l A0C2 = callsHistoryFragmentV2.A0C();
                    if (A0C2 instanceof C000900k) {
                        callsHistoryFragmentV2.A06 = ((C000900k) A0C2).AgA(callsHistoryFragmentV2.A0X);
                    }
                }
            }
            boolean z2 = !contains;
            View view = r10.A0H;
            if (z2) {
                view.setBackgroundResource(R.color.color04c8);
            } else {
                C55352jN.A00(view);
            }
            view.setSelected(z2);
            SelectionCheckView selectionCheckView = r10.A0A;
            selectionCheckView.A04(z2, true);
            int i2 = 8;
            if (z2) {
                i2 = 0;
            }
            selectionCheckView.setVisibility(i2);
            AnonymousClass05J r03 = callsHistoryFragmentV2.A06;
            if (r03 != null) {
                r03.A06();
            }
            if (!hashSet.isEmpty()) {
                C001000l A0C3 = callsHistoryFragmentV2.A0C();
                if (A0C3 == null) {
                    str = "CallsHistoryFragmentV2/toggleItemSelection activity null for # items selected";
                } else {
                    AnonymousClass2JP.A00(A0C3, callsHistoryFragmentV2.A0O, callsHistoryFragmentV2.A03().getQuantityString(R.plurals.plurals00dc, hashSet.size(), new Object[]{Integer.valueOf(hashSet.size())}));
                    return;
                }
            } else {
                return;
            }
        }
        Log.w(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.A04.isEmpty() == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0t(android.view.Menu r4) {
        /*
            r3 = this;
            r0 = 2131364589(0x7f0a0aed, float:1.834902E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            if (r2 == 0) goto L_0x0022
            com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r1 = r3.A0E
            java.util.ArrayList r0 = r1.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001c
            java.util.ArrayList r0 = r1.A04
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r0 = r0 ^ 1
            r2.setVisible(r0)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A0t(android.view.Menu):void");
    }

    public void A0x(int i2, int i3, Intent intent) {
        if (i3 != -1) {
            return;
        }
        if (i2 != 10) {
            if (i2 == 150) {
                A1A();
            }
        } else if (intent != null) {
            try {
                UserJid userJid = UserJid.get(intent.getStringExtra("contact"));
                boolean z2 = true;
                int intExtra = intent.getIntExtra("call_type", 1);
                C204310c r4 = this.A0F;
                C16010sH A0A2 = this.A0J.A0A(userJid);
                C001000l A0D2 = A0D();
                if (intExtra != 2) {
                    z2 = false;
                }
                r4.A01(A0D2, A0A2, 3, z2);
            } catch (AnonymousClass1W4 unused) {
                Log.e("callsHistory/callPicker failed to get selected contact");
            }
        }
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
        menu.add(3, R.id.menuitem_clear_call_log, 0, R.string.str0467);
    }

    public boolean A10(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_new_call) {
            ATF();
            return true;
        } else if (itemId != R.id.menuitem_clear_call_log || this.A03 < 7) {
            return false;
        } else {
            new CallsHistoryClearCallLogDialogFragment().A1G(A0G(), (String) null);
            return true;
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = (CallsHistoryFragmentV2ViewModel) new C006602z(this).A01(CallsHistoryFragmentV2ViewModel.class);
        this.A0E = callsHistoryFragmentV2ViewModel;
        callsHistoryFragmentV2ViewModel.A0K.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 88));
        this.A0E.A06.A0A(A0H(), new IDxObserverShape113S0100000_1_I0(this, 27));
        return layoutInflater.inflate(R.layout.layout00de, viewGroup, false);
    }

    public void A12() {
        Log.i("voip/CallsHistoryFragmentV2/onDestroy");
        this.A0L.A00();
        this.A0K.A00();
        super.A12();
    }

    public void A14() {
        super.A14();
        this.A0E.A05();
    }

    public void A18(Bundle bundle, View view) {
        this.A0L = this.A0M.A04(A02(), "calls-fragment-single");
        this.A0K = this.A0M.A05("calls-fragment-multi", 0.0f, A03().getDimensionPixelSize(R.dimen.dimen074a));
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(view, R.id.calls_recyclyerView);
        this.A07 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.A07.setAdapter(this.A0D);
        AnonymousClass2Xf r1 = this.A0D;
        r1.A00 = this.A0Y;
        r1.A01 = this.A0Z;
        r1.A02 = this.A0a;
        r1.A04 = this.A0L;
        r1.A03 = this.A0K;
        r1.A05 = new RunnableRunnableShape5S0100000_I0_4((Object) this, 1);
        C87634Xu.A00(view, this);
        ((AbsListView) C004601z.A0E(view, 16908298)).setAdapter((ListAdapter) null);
        this.A00 = C004601z.A0E(view, R.id.contacts_empty_permission_denied);
        this.A05 = (TextView) C004601z.A0E(view, R.id.welcome_calls_message);
        this.A04 = (TextView) C004601z.A0E(view, R.id.search_no_matches);
        this.A03 = (ViewGroup) C004601z.A0E(view, R.id.calls_empty_no_contacts);
        this.A01 = C004601z.A0E(view, R.id.init_calls_progress);
        this.A0H = (ObservableListView) C004601z.A0E(view, 16908298);
        TextView textView = this.A05;
        String string = A0D().getString(R.string.str1b90);
        textView.setText(C56522nn.A01(this.A05.getPaint(), AnonymousClass2SR.A02(A02(), R.drawable.ic_new_call_tip, R.color.color04d2), string, "%s"));
        EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(A0u());
        View A0E2 = C004601z.A0E(emptyTellAFriendView, R.id.container);
        A0E2.setPadding(A0E2.getPaddingLeft(), 0, A0E2.getPaddingRight(), 0);
        this.A03.addView(emptyTellAFriendView);
        emptyTellAFriendView.setInviteButtonClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 17));
        this.A00.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 16));
        this.A02 = this.A07;
        A0a(true);
    }

    public final void A1A() {
        AnonymousClass391 r2 = new AnonymousClass391(A0C());
        r2.A03 = true;
        r2.A0C = Boolean.valueOf(true ^ this.A0A.A0G());
        startActivityForResult(r2.A00(), 10);
    }

    public final void A1B() {
        if (A0c() && this.A0A != null) {
            boolean isEmpty = this.A0E.A04.isEmpty();
            Resources A032 = A03();
            int i2 = R.dimen.dimen04b9;
            if (isEmpty) {
                i2 = R.dimen.dimen0248;
            }
            int dimensionPixelSize = A032.getDimensionPixelSize(i2);
            this.A0H.setClipToPadding(false);
            ObservableListView observableListView = this.A0H;
            observableListView.setPadding(observableListView.getPaddingLeft(), dimensionPixelSize, this.A0H.getPaddingRight(), this.A0H.getPaddingBottom());
        }
    }

    public /* synthetic */ void A4c(C14810pn r1) {
        r1.AMG();
    }

    public void A57(AnonymousClass2c9 r9) {
        String str;
        AnonymousClass3HT r1;
        String A002;
        String str2 = r9.A01;
        this.A0V = str2;
        this.A0E.A0A.filter(str2);
        ArrayList A022 = C40661uU.A02(this.A0Q, this.A0V.toString());
        for (int i2 = 0; i2 < this.A0D.A06.size(); i2++) {
            C005602k A0D2 = this.A07.A0D(i2);
            if (A0D2 != null) {
                int i3 = A0D2.A02;
                if (i3 == 1) {
                    C64923Se r4 = (C64923Se) A0D2;
                    UserJid userJid = r4.A00;
                    if (userJid == null) {
                        str = "CallsHistoryContactItemViewHolder/updateFilterTerms user jid null";
                    } else {
                        r4.A01.A0D(r4.A07.A0A(userJid), A022);
                    }
                } else if (i3 == 2) {
                    C57712rd r42 = (C57712rd) A0D2;
                    C101124wk r0 = r42.A00;
                    if (r0 == null || (r1 = r0.A00) == null) {
                        str = "CallsHistoryCallItemViewHolder/updateFilterTerms call item/view state null";
                    } else {
                        boolean z2 = r1.A0E;
                        C30521cU r5 = r42.A02;
                        if (z2) {
                            AnonymousClass2Wj r12 = r1.A06;
                            AnonymousClass00B.A06(r12);
                            r5.A0F(A022, r12.A00(r42.A0H.getContext()));
                        } else {
                            C16010sH r02 = r1.A05;
                            AnonymousClass00B.A06(r02);
                            r5.A0D(r02, A022);
                        }
                    }
                } else if (i3 == 3) {
                    C64953Sh r43 = (C64953Sh) A0D2;
                    C101134wl r13 = r43.A00;
                    if (!(r13 == null || r13.A01.A04.isEmpty() || r13.A00 == null)) {
                        View view = r43.A0H;
                        if (view.getContext() != null) {
                            C1042754r r6 = r43.A00.A00;
                            Context context = view.getContext();
                            if (((C37831po) Collections.unmodifiableList(r43.A00.A01.A04).get(0)).A04().size() == 0) {
                                A002 = view.getContext().getString(r6.A04);
                            } else {
                                AnonymousClass2Wj r03 = r6.A05;
                                AnonymousClass00B.A06(r03);
                                A002 = r03.A00(context);
                            }
                            r43.A02.A0F(A022, A002);
                        }
                    }
                    str = "CallsHistoryOngoingJoinableCallViewHolder/updateFilterTerms call item/call log/view state/context null";
                }
                Log.w(str);
            }
        }
    }

    public void A7y() {
        this.A0W = false;
    }

    public void A8M() {
        this.A0W = true;
    }

    public String ADI() {
        return A0J(R.string.str0d03);
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
        if (this.A0G.A00()) {
            Log.w("voip/CallsFragment tried to start outgoing call from active voip call");
            this.A09.A09(R.string.str083c, 0);
        } else if (this.A0I.A00()) {
            A1A();
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
}
