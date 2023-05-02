package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape366S0100000_2_I1;
import com.facebook.redex.IDxObserverShape37S0200000_2_I1;
import com.facebook.redex.IDxSListenerShape35S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.IDxPObserverShape61S0100000_2_I1;
import com.obwhatsapp.businesscollection.view.activity.CollectionProductListActivity;
import com.obwhatsapp.components.Button;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2yn  reason: invalid class name and case insensitive filesystem */
public abstract class C59692yn extends C70533h8 {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public AnonymousClass2SO A03;
    public AnonymousClass1KT A04;
    public C24511Gf A05;
    public AnonymousClass2XA A06;
    public C28011Tz A07;
    public C18640x1 A08;
    public AnonymousClass1KV A09;
    public C17170ue A0A;
    public AnonymousClass1KA A0B;
    public C50262Yq A0C;
    public AnonymousClass3PX A0D;
    public AnonymousClass2XU A0E;
    public Button A0F;
    public C16000sG A0G;
    public C17030uP A0H;
    public C16080sP A0I;
    public AnonymousClass15W A0J;
    public UserJid A0K;
    public AnonymousClass1KS A0L;
    public C18630x0 A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public final AnonymousClass4PR A0R = new C71333kC(this);
    public final AnonymousClass4VO A0S = new IDxPObserverShape61S0100000_2_I1(this, 1);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r3.A02.canScrollVertically(1) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C59692yn r3) {
        /*
            r0 = 2131366199(0x7f0a1137, float:1.8352285E38)
            android.view.View r2 = r3.findViewById(r0)
            X.2XU r0 = r3.A0E
            java.util.List r0 = r0.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView r1 = r3.A02
            r0 = 1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            r0 = 8
        L_0x001d:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59692yn.A02(X.2yn):void");
    }

    public static void A03(C59692yn r5) {
        r5.A0F.setText(C13680ns.A0d(r5, r5.A0N, C13680ns.A1b(), 0, R.string.str130f));
        if (r5.A0E.A06.isEmpty() || !r5.A0E.AAU()) {
            r5.A0F.setVisibility(8);
        } else {
            r5.A0F.setVisibility(0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout010b);
        Intent intent = getIntent();
        this.A0K = C14530pL.A0O(intent, "cache_jid");
        String stringExtra = intent.getStringExtra("collection_id");
        AnonymousClass00B.A06(stringExtra);
        this.A0O = stringExtra;
        String stringExtra2 = intent.getStringExtra("collection_name");
        AnonymousClass00B.A06(stringExtra2);
        this.A0Q = stringExtra2;
        this.A0P = intent.getStringExtra("collection_index");
        this.A00 = intent.getIntExtra("category_browsing_entry_point", -1);
        this.A01 = intent.getIntExtra("category_level", -1);
        if (!this.A0O.equals("catalog_products_all_items_collection_id")) {
            this.A0M.A00(774780089, "view_collection_details_tag", "CollectionProductListBaseActivity");
            boolean z2 = true;
            this.A0M.A04("view_collection_details_tag", "IsConsumer", !this.A01.A0I(this.A0K));
            C18630x0 r4 = this.A0M;
            if (this.A08.A04(this.A0K, this.A0O) == null) {
                z2 = false;
            }
            r4.A04("view_collection_details_tag", "Cached", z2);
        }
        Button button = (Button) findViewById(R.id.view_cart);
        this.A0F = button;
        C13680ns.A1A(button, this, 48);
        String str = this.A0Q;
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            if (str != null) {
                x2.A0J(str);
            }
        }
        this.A02 = (RecyclerView) findViewById(R.id.product_list);
        CollectionProductListActivity collectionProductListActivity = (CollectionProductListActivity) this;
        UserJid userJid = collectionProductListActivity.A0K;
        String str2 = collectionProductListActivity.A0P;
        String str3 = collectionProductListActivity.A0O;
        C14870pt r30 = collectionProductListActivity.A05;
        C16040sK r29 = collectionProductListActivity.A01;
        C19980zJ r15 = collectionProductListActivity.A00;
        AnonymousClass1KA r14 = collectionProductListActivity.A0B;
        C16000sG r13 = collectionProductListActivity.A0G;
        C16080sP r12 = collectionProductListActivity.A0I;
        AnonymousClass013 r11 = collectionProductListActivity.A01;
        C17030uP r9 = collectionProductListActivity.A0H;
        C17170ue r8 = collectionProductListActivity.A0A;
        C50262Yq r7 = collectionProductListActivity.A0C;
        C100644vy r5 = new C100644vy(collectionProductListActivity);
        IDxCListenerShape366S0100000_2_I1 iDxCListenerShape366S0100000_2_I1 = new IDxCListenerShape366S0100000_2_I1(collectionProductListActivity, 0);
        int i2 = 897451937;
        if (collectionProductListActivity.A00 != -1) {
            i2 = 897451370;
        }
        UserJid userJid2 = userJid;
        String str4 = str2;
        String str5 = str3;
        C16000sG r22 = r13;
        C19980zJ r132 = r15;
        C14870pt r142 = r30;
        C16040sK r152 = r29;
        collectionProductListActivity.A0E = new C59872zA(r132, r142, r152, r8, r14, new AnonymousClass4D4(i2), r7, iDxCListenerShape366S0100000_2_I1, r5, r22, r9, r12, r11, userJid2, str4, str5);
        this.A02.setAdapter(this.A0E);
        RecyclerView recyclerView = this.A02;
        recyclerView.A0W = new C95414mb();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C005502j r1 = this.A02.A0R;
        if (r1 instanceof AnonymousClass0Fd) {
            ((AnonymousClass0Fd) r1).A00 = false;
        }
        this.A07.A02(this.A0S);
        this.A06 = (AnonymousClass2XA) new C006602z((AnonymousClass04o) new C62343De(this.A03, this.A0K), (C001500q) this).A01(AnonymousClass2XA.class);
        UserJid userJid3 = this.A0K;
        this.A0D = (AnonymousClass3PX) new C006602z((AnonymousClass04o) new C95294mP(getApplication(), this.A0B, new C49992Xb(this.A05, this.A0A, this.A0K, this.A05), userJid3, this.A0L), (C001500q) this).A01(AnonymousClass3PX.class);
        this.A04.A02(this.A0R);
        C13680ns.A1M(this, this.A0D.A01, 7);
        C13680ns.A1M(this, this.A0D.A02.A02, 6);
        C13680ns.A1N(this, this.A0D.A02.A04, this.A0E, 19);
        AnonymousClass3PX r6 = this.A0D;
        UserJid userJid4 = this.A0K;
        String str6 = this.A0O;
        boolean z3 = false;
        if (this.A00 != -1) {
            z3 = true;
        }
        r6.A02.A00(r6.A00, userJid4, str6, z3);
        this.A02.A0o(new IDxSListenerShape35S0100000_2_I1(this, 2));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menu_cart);
        findItem.setActionView(R.layout.layout03db);
        AnonymousClass2JP.A02(findItem.getActionView());
        C34331k5.A01(findItem.getActionView(), this, 24);
        TextView A0M2 = C13680ns.A0M(findItem.getActionView(), R.id.cart_total_quantity);
        String str = this.A0N;
        if (str != null) {
            A0M2.setText(str);
        }
        this.A06.A00.A0A(this, new IDxObserverShape37S0200000_2_I1(findItem, 2, this));
        this.A06.A06();
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        this.A04.A03(this.A0R);
        this.A07.A03(this.A0S);
        this.A0C.A00();
        this.A0B.A04.A0B(Boolean.FALSE);
        this.A0M.A05("view_collection_details_tag", false);
        super.onDestroy();
    }

    public void onResume() {
        this.A0D.A03.A00();
        super.onResume();
    }
}
