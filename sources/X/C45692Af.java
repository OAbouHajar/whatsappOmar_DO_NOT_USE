package X;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.facebook.redex.IDxEListenerShape269S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape307S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.conversation.conversationrow.message.KeptMessagesActivity;
import com.obwhatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.obwhatsapp.conversation.conversationrow.message.selection.IDxMCallbackShape71S0100000_1_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Af  reason: invalid class name and case insensitive filesystem */
public abstract class C45692Af extends C45702Ag implements AnonymousClass1YG, AnonymousClass04A {
    public MenuItem A00;
    public AnonymousClass2SQ A01;
    public AnonymousClass10X A02;
    public AnonymousClass127 A03;
    public C17140ub A04;
    public C17030uP A05;
    public AnonymousClass2Ao A06;
    public C45712Ah A07;
    public AnonymousClass1LZ A08;
    public C20270zm A09;
    public AnonymousClass10C A0A;
    public AnonymousClass17R A0B;
    public AnonymousClass11K A0C;
    public AnonymousClass17F A0D;
    public C16900tq A0E;
    public C19410yO A0F;
    public C206711d A0G;
    public C20260zl A0H;
    public AnonymousClass18R A0I;
    public C15830rv A0J;
    public C17020u3 A0K;
    public AnonymousClass1BU A0L;
    public C23631Ct A0M;
    public AnonymousClass01D A0N;
    public String A0O;
    public ArrayList A0P;
    public final AbsListView.OnScrollListener A0Q = new C94664lH(this);
    public final C40781ug A0R = new IDxSObserverShape63S0100000_2_I0(this, 12);
    public final C33481ie A0S = new IDxCObserverShape68S0100000_2_I0(this, 16);
    public final AnonymousClass5PQ A0T = new IDxRCallbackShape307S0100000_2_I0(this, 1);
    public final AnonymousClass1VD A0U = new IDxPObserverShape81S0100000_2_I0(this, 14);

    public void A36() {
        Bundle bundle;
        if (!TextUtils.isEmpty(this.A0O)) {
            bundle = new Bundle();
            bundle.putString("query", this.A0O);
        } else {
            bundle = null;
        }
        A0W().A00(bundle, this);
    }

    public void A37() {
        int i2;
        View view;
        int i3;
        View view2;
        if (this instanceof StarredMessagesActivity) {
            i3 = 0;
            i2 = 8;
            if (this.A07.A02 == null) {
                findViewById(R.id.empty_view).setVisibility(8);
                findViewById(R.id.search_no_matches).setVisibility(8);
                view2 = findViewById(R.id.progress);
            } else {
                ArrayList arrayList = this.A0P;
                if (arrayList == null || arrayList.isEmpty()) {
                    findViewById(R.id.empty_view).setVisibility(0);
                    findViewById(R.id.search_no_matches).setVisibility(8);
                } else {
                    findViewById(R.id.empty_view).setVisibility(8);
                    TextView textView = (TextView) findViewById(R.id.search_no_matches);
                    textView.setVisibility(0);
                    textView.setText(getString(R.string.str14a8, new Object[]{this.A0O}));
                }
                view = findViewById(R.id.progress);
                view.setVisibility(i2);
                return;
            }
        } else {
            KeptMessagesActivity keptMessagesActivity = (KeptMessagesActivity) this;
            ScrollView scrollView = keptMessagesActivity.A01;
            if (scrollView != null && keptMessagesActivity.A02 != null && keptMessagesActivity.A00 != null) {
                i3 = 0;
                i2 = 8;
                if (keptMessagesActivity.A07.A02 == null) {
                    scrollView.setVisibility(8);
                    keptMessagesActivity.A02.setVisibility(8);
                    view2 = keptMessagesActivity.A00;
                } else {
                    ArrayList arrayList2 = keptMessagesActivity.A0P;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        scrollView.setVisibility(0);
                        keptMessagesActivity.A02.setVisibility(8);
                    } else {
                        scrollView.setVisibility(8);
                        keptMessagesActivity.A02.setVisibility(0);
                        keptMessagesActivity.A02.setText(keptMessagesActivity.getString(R.string.str14a8, new Object[]{keptMessagesActivity.A0O}));
                    }
                    view = keptMessagesActivity.A00;
                    view.setVisibility(i2);
                    return;
                }
            } else {
                return;
            }
        }
        view2.setVisibility(i3);
    }

    public AnonymousClass0SB APC(Bundle bundle, int i2) {
        boolean z2 = this instanceof StarredMessagesActivity;
        AnonymousClass2DF r0 = this.A00;
        return new AnonymousClass3QE(this, z2 ? r0.A0T : r0.A0Q, this.A0J, bundle == null ? null : bundle.getString("query"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void ASs(X.AnonymousClass0SB r4, java.lang.Object r5) {
        /*
            r3 = this;
            android.database.Cursor r5 = (android.database.Cursor) r5
            X.2Ah r0 = r3.A07
            r0.A00(r5)
            r3.A37()
            java.lang.String r0 = r3.A0O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x003d
            X.2Ah r0 = r3.A07
            boolean r1 = r0.isEmpty()
            android.view.MenuItem r0 = r3.A00
            if (r1 == 0) goto L_0x003e
            r2 = 0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.isActionViewExpanded()
            if (r0 == 0) goto L_0x002a
            android.view.MenuItem r0 = r3.A00
            r0.collapseActionView()
        L_0x002a:
            android.view.MenuItem r0 = r3.A00
        L_0x002c:
            r0.setVisible(r2)
        L_0x002f:
            r1 = r3
            boolean r0 = r3 instanceof com.obwhatsapp.conversation.conversationrow.message.StarredMessagesActivity
            if (r0 == 0) goto L_0x003d
            com.obwhatsapp.conversation.conversationrow.message.StarredMessagesActivity r1 = (com.obwhatsapp.conversation.conversationrow.message.StarredMessagesActivity) r1
            android.view.MenuItem r0 = r1.A00
            if (r0 == 0) goto L_0x003d
            r0.setVisible(r2)
        L_0x003d:
            return
        L_0x003e:
            r2 = 1
            if (r0 == 0) goto L_0x002f
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45692Af.ASs(X.0SB, java.lang.Object):void");
    }

    public void ASy(AnonymousClass0SB r3) {
        this.A07.A00((Cursor) null);
    }

    public boolean AWw() {
        if (this.A00.A01 != null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this instanceof StarredMessagesActivity ? "starred" : "kept");
        sb.append("/selectionrequested");
        Log.i(sb.toString());
        this.A07.notifyDataSetChanged();
        AnonymousClass2DF r0 = this.A00;
        this.A00.A01 = AgA(new IDxMCallbackShape71S0100000_1_I0(this, r0.A07, r0.A09, this.A01.A00(this), this.A08, this.A01, r0.A0m, this, 1));
        return true;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 2) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1 && intent != null) {
            Collection ACQ = ACQ();
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("jids");
            if (ACQ.isEmpty() || stringArrayListExtra == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this instanceof StarredMessagesActivity ? "starred" : "kept");
                sb.append("/forward/failed");
                Log.w(sb.toString());
                this.A05.A09(R.string.str0d39, 0);
            } else {
                List A082 = C16030sJ.A08(C15830rv.class, stringArrayListExtra);
                boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                C35541m6 r7 = null;
                if (AnonymousClass3B1.A01(this.A0C, A082)) {
                    AnonymousClass00B.A06(intent);
                    r7 = this.A0L.A00(intent.getExtras());
                }
                ArrayList arrayList = new ArrayList(ACQ);
                Collections.sort(arrayList, new IDxComparatorShape19S0000000_2_I0(36));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.A00.A03.A08(this.A02, r7, (C16740tZ) it.next(), A082, booleanExtra);
                }
                if (A082.size() != 1 || C16030sJ.A0Q((Jid) A082.get(0))) {
                    Agv(A082);
                } else {
                    this.A00.A07(this, new C14750ph().A0v(this, this.A00.A07.A0A((C15830rv) A082.get(0))));
                }
            }
            A96();
        }
    }

    public void onCreate(Bundle bundle) {
        C45712Ah r5;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        A2R();
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        this.A04.A02(this.A0S);
        this.A03.A02(this.A0R);
        this.A0I.A02(this.A0U);
        C17200uh r4 = this.A00.A0B;
        StringBuilder sb = new StringBuilder();
        String str = this instanceof StarredMessagesActivity ? "starred" : "kept";
        sb.append(str);
        sb.append("-messages-activity");
        this.A06 = r4.A04(this, sb.toString());
        C16040sK r0 = this.A01;
        r0.A0B();
        if (r0.A00 != null) {
            C16900tq r02 = this.A0E;
            r02.A04();
            if (r02.A01 && this.A09.A01()) {
                this.A0J = C15830rv.A02(getIntent().getStringExtra("jid"));
                this.A0B.A00(bundle2);
                this.A0C.A02(this.A0J, getClass().getName());
                boolean z2 = this instanceof KeptMessagesActivity;
                C19980zJ r1 = this.A00;
                if (z2) {
                    ViewOnClickCListenerShape0S0200000_I0 viewOnClickCListenerShape0S0200000_I0 = new ViewOnClickCListenerShape0S0200000_I0(this, 16, r1);
                    C16040sK r7 = this.A01;
                    AnonymousClass2DF r03 = this.A00;
                    r5 = new AnonymousClass31V(this, r7, r03.A07, r03.A09, this.A06, r03.A0F, this, r03.A0N, viewOnClickCListenerShape0S0200000_I0);
                } else {
                    ViewOnClickCListenerShape0S0200000_I0 viewOnClickCListenerShape0S0200000_I02 = new ViewOnClickCListenerShape0S0200000_I0(this, 16, r1);
                    C16040sK r72 = this.A01;
                    AnonymousClass2DF r04 = this.A00;
                    r5 = new C45712Ah(this, r72, r04.A07, this.A06, r04.A0F, this, r04.A0N, viewOnClickCListenerShape0S0200000_I02);
                }
                this.A07 = r5;
                A0W().A02(this);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/create/no-me-or-msgstore-db");
        Log.i(sb2.toString());
        startActivity(C14750ph.A04(this));
        finish();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ListAdapter listAdapter;
        if (this.A0D.A0P()) {
            C005402i x2 = x();
            AnonymousClass00B.A06(x2);
            SearchView searchView = new SearchView(x2.A02());
            searchView.setMaxWidth(Integer.MAX_VALUE);
            TextView textView = (TextView) searchView.findViewById(R.id.search_src_text);
            int color = getResources().getColor(R.color.color06be);
            searchView.setQueryHint(getString(R.string.str14a4));
            searchView.A0B = new C94924lh(this);
            MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.str1d7c).setIcon(R.drawable.ic_action_search);
            this.A00 = icon;
            AnonymousClass2SX r1 = this.A00;
            synchronized (r1) {
                listAdapter = r1.A00;
            }
            icon.setVisible(!listAdapter.isEmpty());
            this.A00.setActionView(searchView);
            this.A00.setShowAsAction(10);
            this.A00.setOnActionExpandListener(new IDxEListenerShape269S0100000_2_I0(this, 2));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.A00();
        this.A04.A03(this.A0S);
        this.A03.A03(this.A0R);
        this.A0I.A03(this.A0U);
        this.A00.A0J.A06();
        if (isFinishing()) {
            this.A0C.A03(this.A0J, getClass().getName());
        }
    }

    public void onPause() {
        super.onPause();
        if (this.A00.A0J.A0B()) {
            this.A00.A0J.A03();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A00.A0J.A0B()) {
            this.A00.A0J.A05();
        }
        this.A07.notifyDataSetChanged();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.A0B.A01(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        MenuItem menuItem = this.A00;
        if (menuItem == null) {
            return false;
        }
        menuItem.expandActionView();
        return false;
    }
}
