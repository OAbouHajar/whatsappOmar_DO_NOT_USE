package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape236S0100000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0600000_I0;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.biz.cart.IDxCObserverShape59S0100000_2_I0;
import com.obwhatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.obwhatsapp.biz.catalog.view.CatalogMediaCard;
import com.obwhatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import com.obwhatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.obwhatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.obwhatsapp.biz.product.view.fragment.ProductMoreInfoFragment;
import com.obwhatsapp.components.Button;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: X.26l  reason: invalid class name and case insensitive filesystem */
public abstract class C449726l extends C449826m implements C449926n {
    public int A00 = 0;
    public int A01;
    public ObjectAnimator A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewTreeObserver.OnScrollChangedListener A06;
    public ScrollView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public C32291fz A0B;
    public AnonymousClass2SO A0C;
    public TextEmojiLabel A0D;
    public TextEmojiLabel A0E;
    public C16760tb A0F;
    public WaButton A0G;
    public WaTextView A0H;
    public C17150uc A0I;
    public AnonymousClass1KZ A0J;
    public AnonymousClass1KT A0K;
    public C24511Gf A0L;
    public AnonymousClass2XA A0M;
    public AnonymousClass1KX A0N;
    public C28011Tz A0O;
    public C18640x1 A0P;
    public C35701mM A0Q;
    public C47802Kp A0R;
    public C17170ue A0S;
    public AnonymousClass1KA A0T;
    public C23081Ak A0U;
    public C50262Yq A0V;
    public CatalogCarouselDetailImageView A0W;
    public CatalogMediaCard A0X;
    public EllipsizedTextEmojiLabel A0Y;
    public PostcodeChangeBottomSheet A0Z;
    public QuantitySelector A0a;
    public AnonymousClass2ql A0b;
    public Button A0c;
    public C16000sG A0d;
    public AnonymousClass156 A0e;
    public C17030uP A0f;
    public AnonymousClass15I A0g;
    public C17120uZ A0h;
    public UserJid A0i;
    public AnonymousClass1KS A0j;
    public C18630x0 A0k;
    public C23091Al A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public boolean A0r;
    public boolean A0s;
    public final AnonymousClass4PR A0t = new IDxCObserverShape59S0100000_2_I0(this, 2);

    public static /* synthetic */ void A02(C449726l r8, boolean z2) {
        View view;
        if (z2 && (view = r8.A00) != null) {
            C32291fz r4 = r8.A0B;
            if (r4 == null || Build.VERSION.SDK_INT <= 18) {
                r4 = C32291fz.A01(view, r8.getResources().getString(R.string.str0bd1), 0);
                r4.A08(new ViewOnClickCListenerShape0S0100000_I0(r8, 24), R.string.str19d0);
                r8.A0B = r4;
            }
            if (!r4.A06()) {
                if (Build.VERSION.SDK_INT <= 18) {
                    new Handler().postDelayed(new RunnableRunnableShape4S0100000_I0_3(r8, 14), 200);
                } else {
                    r8.A0B.A03();
                }
            }
            if (r8.A02 == null) {
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(r8.findViewById(R.id.menu_cart), new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.5f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.5f})});
                r8.A02 = ofPropertyValuesHolder;
                ofPropertyValuesHolder.setDuration(180);
                r8.A02.setRepeatMode(2);
                r8.A02.setRepeatCount(1);
            }
            if (!r8.A02.isRunning()) {
                r8.A02.start();
            }
            r8.A0k.A05("cart_add_tag", true);
            for (AnonymousClass4PR A002 : r8.A0K.A01()) {
                A002.A00();
            }
        }
    }

    public void A35() {
        this.A0M.A00.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 54));
        updateButton(this.A0G);
    }

    public final void A36() {
        C47802Kp r3;
        if (!this.A0r && (r3 = this.A0R) != null) {
            C17170ue r2 = this.A0S;
            C31481eG r1 = new C31481eG();
            r1.A09 = r3.A02;
            r1.A04 = Integer.valueOf(r3.A00);
            r1.A08 = Long.valueOf(r3.A01);
            r1.A05 = 12;
            r1.A03 = 31;
            r1.A0D = this.A0p;
            r1.A00 = this.A0i;
            r1.A01 = (Boolean) this.A0M.A00.A01();
            r1.A0B = this.A0o;
            r1.A0E = this.A0q;
            r1.A0A = this.A0n;
            r2.A03(r1);
            this.A0r = true;
            this.A0R = null;
        }
    }

    public void ARA(String str, int i2) {
        A36();
        this.A00 = 3;
        for (AnonymousClass4VO A022 : this.A0O.A01()) {
            A022.A02(str, i2);
        }
        this.A0k.A05("view_product_tag", false);
    }

    public void ARB(AnonymousClass26S r4, String str) {
        this.A00 = 0;
        for (AnonymousClass4VO A002 : this.A0O.A01()) {
            A002.A00(str);
        }
        this.A0k.A05("view_product_tag", true);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        C35701mM r1;
        int i4 = i3;
        Intent intent2 = intent;
        super.onActivityResult(i2, i4, intent2);
        if (i4 == -1 && (r1 = this.A0Q) != null) {
            if (i2 == 3) {
                List A082 = C16030sJ.A08(C15830rv.class, intent2.getStringArrayListExtra("jids"));
                File file = new File(intent2.getStringExtra("file_path"));
                C16760tb r8 = this.A0F;
                C35701mM r9 = this.A0Q;
                UserJid userJid = this.A0i;
                r8.A1Y.Acl(new RunnableRunnableShape0S0600000_I0(Uri.fromFile(file), r8, r9, userJid, (C16740tZ) null, A082));
                if (A082.size() == 1) {
                    this.A00.A07(this, new C14750ph().A0v(this, this.A0d.A0A((C15830rv) A082.get(0))));
                } else {
                    Agv(A082);
                }
            } else if (i2 == 66) {
                this.A0N.A02(this, this.A0V, (C15830rv) null, this.A0i, Collections.singletonList(r1), 3, 0, 0);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        C61913Ax.A00(this);
        super.onCreate(bundle);
        this.A0k.A00(774775607, "view_product_tag", "ProductBaseActivity");
        this.A01 = getIntent().getIntExtra("view_product_origin", 0);
        this.A0K.A02(this.A0t);
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
        AnonymousClass00B.A06(nullable);
        this.A0i = nullable;
        String stringExtra = getIntent().getStringExtra("product");
        AnonymousClass00B.A06(stringExtra);
        this.A0p = stringExtra;
        this.A0s = getIntent().getBooleanExtra("disable_report", false);
        this.A0o = getIntent().getStringExtra("collection_index");
        this.A0q = getIntent().getStringExtra("product_index");
        this.A0n = getIntent().getStringExtra("collection_id");
        setContentView((int) R.layout.layout00b9);
        this.A0W = (CatalogCarouselDetailImageView) findViewById(R.id.catalog_carousel_detail_image_view);
        this.A0E = (TextEmojiLabel) findViewById(R.id.catalog_detail_title);
        this.A09 = (TextView) findViewById(R.id.catalog_detail_price);
        this.A0Y = (EllipsizedTextEmojiLabel) findViewById(R.id.catalog_detail_description);
        this.A08 = (TextView) findViewById(R.id.catalog_detail_link);
        this.A0A = (TextView) findViewById(R.id.catalog_detail_sku);
        this.A0D = (TextEmojiLabel) findViewById(R.id.loading_product_text);
        this.A0X = (CatalogMediaCard) findViewById(R.id.product_message_catalog_media_card);
        this.A0H = (WaTextView) findViewById(R.id.product_availability_label);
        this.A0c = (Button) findViewById(R.id.pdp_action_button);
        this.A07 = (ScrollView) findViewById(R.id.pdp_scroll_view);
        this.A05 = findViewById(R.id.shadow_bottom);
        View findViewById = findViewById(R.id.quantity_selector_cart_container);
        this.A03 = findViewById;
        this.A06 = new IDxCListenerShape236S0100000_2_I0(this, 0);
        findViewById.setVisibility(8);
        QuantitySelector quantitySelector = (QuantitySelector) findViewById(R.id.pdp_quantity_selector);
        this.A0a = quantitySelector;
        quantitySelector.A04 = new C100604vu(this);
        quantitySelector.A05 = new C100614vv(this);
        View findViewById2 = findViewById(R.id.request_report_btn_container);
        this.A04 = findViewById2;
        findViewById2.setVisibility(8);
        findViewById(R.id.report_btn).setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 0));
        ViewOnClickCListenerShape0S0100000_I0 viewOnClickCListenerShape0S0100000_I0 = new ViewOnClickCListenerShape0S0100000_I0(this, 21);
        WaButton waButton = (WaButton) findViewById(R.id.message_business_btn);
        this.A0G = waButton;
        waButton.setVisibility(8);
        this.A0G.setOnClickListener(viewOnClickCListenerShape0S0100000_I0);
        Toolbar toolbar = (Toolbar) AnonymousClass00T.A05(this, R.id.product_detail_image_toolbar);
        toolbar.setTitle((CharSequence) "");
        toolbar.A07();
        Aem(toolbar);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
        }
        toolbar.setNavigationIcon((Drawable) new C447725m(AnonymousClass00T.A04(this, R.drawable.ic_back_shadow), this.A01));
        this.A0Q = this.A0P.A05(this.A0i, this.A0p);
        C50262Yq r0 = this.A0V;
        if (r0 != null) {
            r0.A00();
        }
        this.A0V = new C50262Yq(this.A0U, this.A0l);
        this.A0T.A0M.add(this);
        if (this.A01 == 6) {
            this.A05.Acl(new RunnableRunnableShape4S0100000_I0_3(this, 13));
        }
        this.A0M = (AnonymousClass2XA) new C006602z((AnonymousClass04o) new C62343De(this.A0C, this.A0i), (C001500q) this).A01(AnonymousClass2XA.class);
        AnonymousClass23A A002 = this.A0I.A00(this.A03, this.A0i, (String) null);
        UserJid userJid = this.A0i;
        C16320sq r2 = this.A05;
        AnonymousClass2ql r02 = (AnonymousClass2ql) new C006602z((AnonymousClass04o) new C95334mT(this.A0T, new C49992Xb(this.A0L, this.A0S, userJid, r2), new C449626k(this.A0I, A002, userJid, r2), this.A07, this.A09, userJid, this.A0j, this.A01), (C001500q) this).A01(AnonymousClass2ql.class);
        this.A0b = r02;
        r02.A09.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 52));
        this.A0b.A06.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 51));
        this.A0b.A08.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 53));
        this.A0b.A04.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 12));
        boolean z2 = true;
        this.A0k.A04("view_product_tag", "IsConsumer", !this.A01.A0I(this.A0i));
        C18630x0 r1 = this.A0k;
        if (this.A0Q == null) {
            z2 = false;
        }
        r1.A04("view_product_tag", "Cached", z2);
        int i2 = this.A01;
        switch (i2) {
            case 1:
            case 7:
                str = "Message";
                break;
            case 2:
                str = "EditProduct";
                break;
            case 3:
                str = "Catalog";
                break;
            case 4:
                str = "ContactInfo";
                break;
            case 5:
                str = "Product";
                break;
            case 6:
                str = "Deeplink";
                break;
            case 8:
                str = "Cart";
                break;
            case 9:
                str = "Order";
                break;
            default:
                StringBuilder sb = new StringBuilder("ProductDetailActivity/startViewProductQpl/Unexpected value: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
        this.A0k.A03("view_product_tag", "EntryPoint", str);
        this.A0R = this.A0S.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r1 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        if (r1.startsWith("91") == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r8) {
        /*
            r7 = this;
            X.2ql r2 = r7.A0b
            int r1 = r7.A00
            X.1mM r0 = r7.A0Q
            boolean r6 = r2.A06(r0, r1)
            com.whatsapp.jid.UserJid r0 = r7.A0i
            boolean r1 = r0 instanceof X.AnonymousClass1ZT
            r0 = 2131364565(0x7f0a0ad5, float:1.834897E38)
            android.view.MenuItem r5 = r8.findItem(r0)
            r0 = 2131364575(0x7f0a0adf, float:1.834899E38)
            android.view.MenuItem r4 = r8.findItem(r0)
            r0 = 2131364568(0x7f0a0ad8, float:1.8348977E38)
            android.view.MenuItem r3 = r8.findItem(r0)
            r0 = 2131364573(0x7f0a0add, float:1.8348987E38)
            android.view.MenuItem r2 = r8.findItem(r0)
            r3.setVisible(r6)
            if (r6 == 0) goto L_0x0032
            r0 = 1
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            r4.setVisible(r0)
            com.whatsapp.jid.UserJid r0 = r7.A0i
            java.lang.String r1 = X.C24561Gk.A03(r0)
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "91"
            boolean r1 = r1.startsWith(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            r2.setVisible(r0)
            r0 = 2131559387(0x7f0d03db, float:1.8744117E38)
            r5.setActionView(r0)
            android.view.View r0 = r5.getActionView()
            X.AnonymousClass2JP.A02(r0)
            android.view.View r2 = r5.getActionView()
            r1 = 23
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0
            r0.<init>(r7, r1)
            r2.setOnClickListener(r0)
            android.view.View r1 = r5.getActionView()
            r0 = 2131362619(0x7f0a033b, float:1.8345024E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r7.A0m
            if (r0 == 0) goto L_0x007a
            r1.setText(r0)
        L_0x007a:
            X.2XA r0 = r7.A0M
            X.027 r1 = r0.A00
            X.4m9 r0 = new X.4m9
            r0.<init>(r3, r4, r5, r7)
            r1.A0A(r7, r0)
            boolean r0 = super.onCreateOptionsMenu(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C449726l.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public void onDestroy() {
        this.A0K.A03(this.A0t);
        CatalogMediaCard catalogMediaCard = this.A0X;
        if (catalogMediaCard != null) {
            catalogMediaCard.A01();
        }
        this.A0T.A0M.remove(this);
        C50262Yq r0 = this.A0V;
        if (r0 != null) {
            r0.A00();
        }
        this.A0k.A05("view_product_tag", false);
        this.A0k.A05("cart_add_tag", false);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        MenuItem menuItem2 = menuItem;
        if (16908332 == menuItem2.getItemId()) {
            onBackPressed();
        } else if (R.id.menu_more_info == menuItem2.getItemId()) {
            if (!A2k()) {
                Afc(ProductMoreInfoFragment.A01(this.A0i, this.A0p));
                return true;
            }
        } else if (R.id.menu_forward == menuItem2.getItemId()) {
            AnonymousClass2ql r2 = this.A0b;
            int i2 = this.A00;
            C35701mM r1 = this.A0Q;
            if (r2.A06(r1, i2)) {
                this.A0N.A02(this, this.A0V, (C15830rv) null, this.A0i, Collections.singletonList(r1), 3, 0, 0);
                return true;
            }
        } else if (R.id.menu_share != menuItem2.getItemId()) {
            return super.onOptionsItemSelected(menuItem2);
        } else {
            UserJid userJid = this.A0i;
            String str = this.A0p;
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.obwhatsapp.ShareProductLinkActivity");
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra("jid", userJid.getRawString());
            intent.putExtra("product_id", str);
            startActivity(intent);
            return true;
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        if (this.A06 != null) {
            this.A07.getViewTreeObserver().removeOnScrollChangedListener(this.A06);
        }
    }

    public void onResume() {
        super.onResume();
        A35();
        this.A0b.A0C.A00();
        if (this.A06 != null) {
            this.A07.getViewTreeObserver().addOnScrollChangedListener(this.A06);
        }
    }

    public void onStart() {
        super.onStart();
        this.A0T.A08(new AnonymousClass26S(this.A0i, Integer.valueOf(getIntent().getIntExtra("thumb_width", (int) getResources().getDimension(R.dimen.dimen0529))), Integer.valueOf(getIntent().getIntExtra("thumb_height", (int) getResources().getDimension(R.dimen.dimen0529))), this.A0p, this.A0S.A00, false));
        if (this.A0Q == null) {
            this.A00 = 1;
        }
    }

    public void updateButton(View view) {
        int i2 = 8;
        if (this.A0b.A06(this.A0Q, this.A00)) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }
}
