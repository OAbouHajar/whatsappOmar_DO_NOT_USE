package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape34S0200000_1_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.IDxPObserverShape57S0100000_2_I0;
import com.obwhatsapp.biz.cart.IDxCObserverShape59S0100000_2_I0;
import com.obwhatsapp.biz.cart.view.fragment.CartFragment;
import com.obwhatsapp.biz.catalog.IDxPObserverShape60S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import java.util.List;
import java.util.Set;

/* renamed from: X.1fh  reason: invalid class name and case insensitive filesystem */
public abstract class C32131fh extends C32141fi {
    public RecyclerView A00;
    public AnonymousClass2SO A01;
    public C50492Zv A02;
    public AnonymousClass13V A03;
    public AnonymousClass1KT A04;
    public C24511Gf A05;
    public AnonymousClass2XA A06;
    public AnonymousClass1KY A07;
    public C28011Tz A08;
    public C18640x1 A09;
    public C47802Kp A0A;
    public C17170ue A0B;
    public AnonymousClass1KA A0C;
    public C23081Ak A0D;
    public C50262Yq A0E;
    public C32151fj A0F;
    public C57242qY A0G;
    public C33481ie A0H = new IDxCObserverShape68S0100000_2_I0(this, 1);
    public C17140ub A0I;
    public AnonymousClass156 A0J;
    public UserJid A0K;
    public C18630x0 A0L;
    public AnonymousClass1KW A0M;
    public C23091Al A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public final C439822h A0R = new IDxPObserverShape57S0100000_2_I0(this, 1);
    public final AnonymousClass4PR A0S = new IDxCObserverShape59S0100000_2_I0(this, 0);
    public final AnonymousClass1yY A0T = new C62763Ev(this);
    public final AnonymousClass4VO A0U = new IDxPObserverShape60S0100000_2_I0(this, 0);

    public final void A35() {
        this.A0B.A04(this.A0K, 50, (String) null, 32);
        UserJid userJid = this.A0G.A0M;
        C18450wi.A0H(userJid, 0);
        Afc(CartFragment.A01(userJid, (String) null, 0));
    }

    public void A36(List list) {
        this.A0O = this.A06.A05(this.A01, list);
        Set<String> A012 = AnonymousClass2XA.A01(this.A0F.A06, list);
        List list2 = this.A0F.A06;
        list2.clear();
        list2.addAll(list);
        for (String A042 : A012) {
            this.A08.A04(A042);
        }
        invalidateOptionsMenu();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 3000) {
            super.onActivityResult(i2, i3, intent);
        } else if (intent != null && intent.getIntExtra("get_collection_error_code", -1) == 404) {
            this.A0G.A05(this.A0K);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            C32151fj r3 = this.A0F;
            List list = r3.A00;
            if (list.size() > 0 && (list.get(0) instanceof C71493kW)) {
                list.remove(0);
                r3.A04(0);
                return;
            }
            return;
        }
        this.A0F.A0K();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0283  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r39) {
        /*
            r38 = this;
            r2 = r38
            r18 = r39
            r0 = r18
            super.onCreate(r0)
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "is_prefetched_catalog"
            r4 = 0
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 != 0) goto L_0x0022
            X.0x0 r5 = r2.A0L
            r3 = 774781666(0x2e2e3ae2, float:3.9615318E-11)
            java.lang.String r1 = "catalog_collections_view_tag"
            java.lang.String r0 = "CatalogListBaseActivity"
            r5.A00(r3, r1, r0)
        L_0x0022:
            X.1KT r1 = r2.A04
            X.4PR r0 = r2.A0S
            r1.A02(r0)
            X.1Ak r3 = r2.A0D
            X.1Al r1 = r2.A0N
            X.2Yq r0 = new X.2Yq
            r0.<init>(r3, r1)
            r2.A0E = r0
            r0 = 2131558589(0x7f0d00bd, float:1.8742498E38)
            r2.setContentView((int) r0)
            r0 = 2131366484(0x7f0a1254, float:1.8352863E38)
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r0.inflate()
            r0 = 2131366673(0x7f0a1311, float:1.8353246E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r2.Aem(r0)
            r0 = 2131362366(0x7f0a023e, float:1.834451E38)
            android.view.View r1 = r2.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r2.A00 = r1
            com.facebook.redex.IDxRListenerShape41S0000000_2_I0 r0 = new com.facebook.redex.IDxRListenerShape41S0000000_2_I0
            r0.<init>(r4)
            r1.A0W = r0
            X.02i r1 = r2.x()
            if (r1 == 0) goto L_0x0074
            r0 = 1
            r1.A0N(r0)
            r0 = 2131886864(0x7f120310, float:1.9408319E38)
            r1.A0B(r0)
        L_0x0074:
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "cache_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r0)
            X.AnonymousClass00B.A06(r0)
            r2.A0K = r0
            X.1Tz r1 = r2.A08
            X.4VO r0 = r2.A0U
            r1.A02(r0)
            X.1KY r1 = r2.A07
            X.1yY r0 = r2.A0T
            r1.A02(r0)
            com.whatsapp.jid.UserJid r3 = r2.A0K
            X.2SO r1 = r2.A01
            X.3De r0 = new X.3De
            r0.<init>(r1, r3)
            X.02z r1 = new X.02z
            r1.<init>((X.AnonymousClass04o) r0, (X.C001500q) r2)
            java.lang.Class<X.2XA> r0 = X.AnonymousClass2XA.class
            X.01n r0 = r1.A01(r0)
            X.2XA r0 = (X.AnonymousClass2XA) r0
            r2.A06 = r0
            com.whatsapp.jid.UserJid r6 = r2.A0K
            X.0sq r5 = r2.A05
            X.1Gf r1 = r2.A05
            X.0ue r0 = r2.A0B
            X.2Xb r3 = new X.2Xb
            r3.<init>(r1, r0, r6, r5)
            X.2Zv r1 = r2.A02
            X.3Dg r0 = new X.3Dg
            r0.<init>(r1, r3, r6)
            X.02z r1 = new X.02z
            r1.<init>((X.AnonymousClass04o) r0, (X.C001500q) r2)
            java.lang.Class<X.2qY> r0 = X.C57242qY.class
            X.01n r0 = r1.A01(r0)
            X.2qY r0 = (X.C57242qY) r0
            r2.A0G = r0
            X.1KA r0 = r0.A0G
            X.027 r3 = r0.A03
            r1 = 7
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r0 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0
            r0.<init>(r2, r1)
            r3.A0A(r2, r0)
            X.2qY r9 = r2.A0G
            com.whatsapp.jid.UserJid r8 = r2.A0K
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "entry_point"
            int r7 = r1.getIntExtra(r0, r4)
            X.0x0 r6 = r9.A0O
            X.0sK r0 = r9.A0B
            boolean r0 = r0.A0I(r8)
            r5 = 1
            r1 = r0 ^ 1
            java.lang.String r3 = "catalog_collections_view_tag"
            java.lang.String r0 = "IsConsumer"
            r6.A04(r3, r0, r1)
            X.0x1 r1 = r9.A0C
            boolean r0 = r1.A0J(r8)
            if (r0 != 0) goto L_0x010c
            boolean r0 = r1.A0I(r8)
            if (r0 != 0) goto L_0x010c
            r5 = 0
        L_0x010c:
            java.lang.String r0 = "Cached"
            r6.A04(r3, r0, r5)
            switch(r7) {
                case 1: goto L_0x02b6;
                case 2: goto L_0x02b3;
                case 3: goto L_0x02b0;
                case 4: goto L_0x02ad;
                case 5: goto L_0x02aa;
                case 6: goto L_0x02a7;
                case 7: goto L_0x02a4;
                case 8: goto L_0x02a1;
                case 9: goto L_0x029e;
                case 10: goto L_0x029b;
                case 11: goto L_0x0298;
                case 12: goto L_0x0295;
                case 13: goto L_0x0292;
                case 14: goto L_0x028f;
                default: goto L_0x0114;
            }
        L_0x0114:
            r6 = r2
            com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity r6 = (com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity) r6
            X.2Zw r1 = r6.A00
            com.whatsapp.jid.UserJid r0 = r6.A0K
            r21 = r0
            X.2Yq r0 = r6.A0E
            r20 = r0
            X.2qY r0 = r6.A0G
            r19 = r0
            com.facebook.redex.IDxSListenerShape292S0100000_2_I0 r17 = new com.facebook.redex.IDxSListenerShape292S0100000_2_I0
            r0 = r17
            r0.<init>(r6, r4)
            X.2Yk r0 = r1.A00
            X.0sX r7 = r0.A03
            X.01J r0 = r7.A05
            java.lang.Object r16 = r0.get()
            r0 = r16
            X.0pd r0 = (X.C14710pd) r0
            r16 = r0
            X.01J r0 = r7.ADr
            java.lang.Object r15 = r0.get()
            X.0sK r15 = (X.C16040sK) r15
            X.01J r0 = r7.ALY
            java.lang.Object r14 = r0.get()
            X.1KO r14 = (X.AnonymousClass1KO) r14
            X.01J r0 = r7.A0P
            java.lang.Object r13 = r0.get()
            X.0zJ r13 = (X.C19980zJ) r13
            X.01J r0 = r7.A3a
            java.lang.Object r12 = r0.get()
            X.1KA r12 = (X.AnonymousClass1KA) r12
            X.01J r0 = r7.A4x
            java.lang.Object r11 = r0.get()
            X.0sG r11 = (X.C16000sG) r11
            X.01J r0 = r7.AQ9
            java.lang.Object r10 = r0.get()
            X.0sP r10 = (X.C16080sP) r10
            X.01J r0 = r7.AR8
            java.lang.Object r9 = r0.get()
            X.013 r9 = (X.AnonymousClass013) r9
            X.01J r0 = r7.AOC
            java.lang.Object r8 = r0.get()
            X.15W r8 = (X.AnonymousClass15W) r8
            X.01J r0 = r7.A3X
            java.lang.Object r5 = r0.get()
            X.0x1 r5 = (X.C18640x1) r5
            X.01J r0 = r7.APp
            java.lang.Object r3 = r0.get()
            X.0uP r3 = (X.C17030uP) r3
            X.01J r0 = r7.A3W
            java.lang.Object r1 = r0.get()
            X.0ue r1 = (X.C17170ue) r1
            X.01J r0 = r7.AQh
            java.lang.Object r0 = r0.get()
            X.0rz r0 = (X.C15860rz) r0
            X.1fj r7 = new X.1fj
            r29 = r17
            r30 = r11
            r31 = r3
            r32 = r10
            r33 = r0
            r34 = r9
            r35 = r16
            r36 = r8
            r37 = r21
            r22 = r15
            r23 = r14
            r24 = r5
            r25 = r1
            r26 = r12
            r27 = r20
            r28 = r19
            r19 = r7
            r20 = r6
            r21 = r13
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r6.A0F = r7
            X.2qY r0 = r6.A0G
            X.027 r5 = r0.A08
            X.0pd r3 = r7.A0G
            r1 = 1514(0x5ea, float:2.122E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x01e3
            r1 = 47
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r0.<init>((java.lang.Object) r7, (int) r1)
            r5.A0A(r6, r0)
        L_0x01e3:
            X.2qY r1 = r2.A0G
            com.whatsapp.jid.UserJid r0 = r2.A0K
            r1.A07(r0)
            if (r39 != 0) goto L_0x0283
            X.2qY r1 = r2.A0G
            com.whatsapp.jid.UserJid r0 = r2.A0K
            r1.A06(r0)
            X.1fj r0 = r2.A0F
            r0.A0L()
        L_0x01f8:
            androidx.recyclerview.widget.RecyclerView r1 = r2.A00
            X.1fj r0 = r2.A0F
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A00
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>()
            r1.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r3 = r2.A00
            X.02j r1 = r3.A0R
            boolean r0 = r1 instanceof X.AnonymousClass0Fd
            if (r0 == 0) goto L_0x0215
            X.0Fd r1 = (X.AnonymousClass0Fd) r1
            r1.A00 = r4
        L_0x0215:
            com.facebook.redex.IDxSListenerShape33S0100000_1_I0 r0 = new com.facebook.redex.IDxSListenerShape33S0100000_1_I0
            r0.<init>(r2, r4)
            r3.A0o(r0)
            X.0ub r1 = r2.A0I
            X.1ie r0 = r2.A0H
            r1.A02(r0)
            X.13V r1 = r2.A03
            X.22h r0 = r2.A0R
            r1.A02(r0)
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "source"
            java.io.Serializable r0 = r1.getSerializableExtra(r0)
            if (r0 == 0) goto L_0x0243
            X.0sq r3 = r2.A05
            r1 = 4
            com.facebook.redex.RunnableRunnableShape4S0100000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape4S0100000_I0_3
            r0.<init>(r2, r1)
            r3.Acl(r0)
        L_0x0243:
            X.2qY r0 = r2.A0G
            X.027 r3 = r0.A05
            r1 = 46
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.A0A(r2, r0)
            com.whatsapp.jid.UserJid r8 = r2.A0K
            if (r8 == 0) goto L_0x027a
            X.1KW r7 = r2.A0M
            java.util.concurrent.atomic.AtomicInteger r0 = r7.A00
            int r1 = r0.get()
            r0 = -1
            if (r1 == r0) goto L_0x0274
            X.0xA r6 = r7.A01
            r5 = 897464270(0x357e37ce, float:9.470358E-7)
            java.util.concurrent.atomic.AtomicInteger r0 = r7.A00
            int r3 = r0.get()
            r1 = 0
            X.4L0 r0 = new X.4L0
            r0.<init>(r8, r1, r4)
            r6.A02(r0, r5, r3)
        L_0x0274:
            java.util.concurrent.atomic.AtomicInteger r1 = r7.A00
            r0 = -1
            r1.set(r0)
        L_0x027a:
            X.0ue r0 = r2.A0B
            X.2Kp r0 = r0.A01()
            r2.A0A = r0
            return
        L_0x0283:
            java.lang.String r1 = "catalog_loaded"
            r0 = r18
            boolean r0 = r0.getBoolean(r1, r4)
            r2.A0P = r0
            goto L_0x01f8
        L_0x028f:
            java.lang.String r1 = "Cart"
            goto L_0x02b8
        L_0x0292:
            java.lang.String r1 = "Product"
            goto L_0x02b8
        L_0x0295:
            java.lang.String r1 = "ChatHeader"
            goto L_0x02b8
        L_0x0298:
            java.lang.String r1 = "Deeplink"
            goto L_0x02b8
        L_0x029b:
            java.lang.String r1 = "Attachment"
            goto L_0x02b8
        L_0x029e:
            java.lang.String r1 = "ContactInfo"
            goto L_0x02b8
        L_0x02a1:
            java.lang.String r1 = "Profile"
            goto L_0x02b8
        L_0x02a4:
            java.lang.String r1 = "CatalogHomeEdit"
            goto L_0x02b8
        L_0x02a7:
            java.lang.String r1 = "ConversationHomeBanner"
            goto L_0x02b8
        L_0x02aa:
            java.lang.String r1 = "ContentChooser"
            goto L_0x02b8
        L_0x02ad:
            java.lang.String r1 = "ToolsMenu"
            goto L_0x02b8
        L_0x02b0:
            java.lang.String r1 = "BusinessHome"
            goto L_0x02b8
        L_0x02b3:
            java.lang.String r1 = "CatalogShare"
            goto L_0x02b8
        L_0x02b6:
            java.lang.String r1 = "Onboarding"
        L_0x02b8:
            java.lang.String r0 = "EntryPoint"
            r6.A03(r3, r0, r1)
            goto L_0x0114
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32131fh.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menu_cart);
        findItem.setActionView(R.layout.layout03db);
        AnonymousClass2JP.A02(findItem.getActionView());
        findItem.getActionView().setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 16));
        TextView textView = (TextView) findItem.getActionView().findViewById(R.id.cart_total_quantity);
        String str = this.A0O;
        if (str != null) {
            textView.setText(str);
        }
        this.A06.A00.A0A(this, new IDxObserverShape34S0200000_1_I0(findItem, 0, this));
        this.A06.A06();
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        this.A04.A03(this.A0S);
        this.A07.A03(this.A0T);
        this.A08.A03(this.A0U);
        this.A0I.A03(this.A0H);
        this.A03.A03(this.A0R);
        this.A0E.A00();
        this.A0L.A05("catalog_collections_view_tag", false);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (16908332 == itemId) {
            onBackPressed();
            return true;
        } else if (R.id.menu_share == itemId) {
            UserJid userJid = this.A0K;
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.obwhatsapp.ShareCatalogLinkActivity");
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra("jid", userJid.getRawString());
            startActivity(intent);
            return true;
        } else if (R.id.menu_cart != itemId) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A35();
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.A0F.A0L();
        this.A0G.A0H.A00();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("catalog_loaded", this.A0P);
    }

    public void onStop() {
        super.onStop();
    }
}
