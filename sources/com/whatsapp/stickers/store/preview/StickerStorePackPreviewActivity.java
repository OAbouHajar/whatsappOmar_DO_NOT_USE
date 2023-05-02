package com.whatsapp.stickers.store.preview;

import X.AnonymousClass01V;
import X.AnonymousClass071;
import X.AnonymousClass12W;
import X.AnonymousClass14U;
import X.AnonymousClass14W;
import X.AnonymousClass15P;
import X.AnonymousClass1CX;
import X.AnonymousClass1MF;
import X.AnonymousClass1ML;
import X.AnonymousClass1UX;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SR;
import X.AnonymousClass362;
import X.AnonymousClass37F;
import X.AnonymousClass3H5;
import X.AnonymousClass4FJ;
import X.AnonymousClass4FK;
import X.AnonymousClass4WQ;
import X.AnonymousClass526;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16620tM;
import X.C17250um;
import X.C18000vz;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C211613a;
import X.C211813c;
import X.C211913d;
import X.C213013o;
import X.C214714f;
import X.C23061Ai;
import X.C23071Aj;
import X.C26141Mm;
import X.C37771pi;
import X.C41781we;
import X.C447725m;
import X.C49132Rg;
import X.C55532jo;
import X.C55542jp;
import X.C55552jq;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxEListenerShape288S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;
import com.obwhatsapp.components.Button;
import com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape3S0100000_I0_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StickerStorePackPreviewActivity extends C14530pL implements C18000vz, C55532jo, C55542jp {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ImageView A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public GridLayoutManager A0A;
    public RecyclerView A0B;
    public Button A0C;
    public Button A0D;
    public Button A0E;
    public AnonymousClass12W A0F;
    public C26141Mm A0G;
    public AnonymousClass1ML A0H;
    public C211913d A0I;
    public C211613a A0J;
    public C213013o A0K;
    public AnonymousClass1MF A0L;
    public AnonymousClass14W A0M;
    public C37771pi A0N;
    public AnonymousClass1CX A0O;
    public StickerView A0P;
    public AnonymousClass14U A0Q;
    public C214714f A0R;
    public C55552jq A0S;
    public AnonymousClass37F A0T;
    public String A0U;
    public Map A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final ViewTreeObserver.OnGlobalLayoutListener A0d;
    public final AnonymousClass071 A0e;
    public final C211813c A0f;
    public final C41781we A0g;
    public final AnonymousClass4FK A0h;

    public StickerStorePackPreviewActivity() {
        this(0);
        this.A0g = new IDxSObserverShape99S0100000_1_I0(this, 2);
        this.A0f = new IDxEListenerShape288S0100000_2_I0(this, 3);
        this.A0c = true;
        this.A0W = false;
        this.A0e = new IDxSListenerShape34S0100000_2_I0(this, 17);
        this.A0h = new AnonymousClass4FK(this);
        this.A0d = new IDxLListenerShape144S0100000_2_I0(this, 30);
    }

    public StickerStorePackPreviewActivity(int i2) {
        this.A0Y = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 100));
    }

    public static /* synthetic */ void A02(C37771pi r4, StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        stickerStorePackPreviewActivity.A0N = r4;
        stickerStorePackPreviewActivity.A0c = true;
        AnonymousClass362 r3 = new AnonymousClass362(stickerStorePackPreviewActivity.A0O, new AnonymousClass4FJ(stickerStorePackPreviewActivity));
        stickerStorePackPreviewActivity.A05.Ack(r3, r4);
    }

    public void A1q() {
        if (!this.A0Y) {
            this.A0Y = true;
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
            this.A0J = (C211613a) r1.A1E.get();
            this.A0M = (AnonymousClass14W) r1.ANc.get();
            this.A0F = (AnonymousClass12W) r1.AEM.get();
            this.A0O = (AnonymousClass1CX) r1.ANk.get();
            this.A0G = (C26141Mm) r1.A10.get();
            this.A0R = (C214714f) r1.ANe.get();
            this.A0L = (AnonymousClass1MF) r1.ANa.get();
            this.A0H = r2.A0c();
            this.A0K = (C213013o) r1.AN8.get();
            this.A0I = (C211913d) r1.A12.get();
            this.A0Q = (AnonymousClass14U) r1.ANT.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        if (r2.A0R != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010c, code lost:
        if (r2.A01() == false) goto L_0x010e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A35() {
        /*
            r9 = this;
            boolean r0 = r9.isFinishing()
            if (r0 != 0) goto L_0x0087
            X.1pi r2 = r9.A0N
            r5 = 8
            r3 = 0
            if (r2 == 0) goto L_0x0196
            android.view.View r0 = r9.A04
            r0.setVisibility(r5)
            android.view.View r0 = r9.A01
            r0.setVisibility(r3)
            android.widget.TextView r1 = r9.A08
            java.lang.String r0 = r2.A0H
            r1.setText(r0)
            android.widget.TextView r1 = r9.A07
            java.lang.String r0 = r2.A09
            r1.setText(r0)
            android.widget.TextView r7 = r9.A09
            r6 = 2131891932(0x7f1216dc, float:1.9418598E38)
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r2.A0J
            r1[r3] = r0
            java.lang.String r0 = r9.getString(r6, r1)
            r7.setText(r0)
            android.widget.ImageView r1 = r9.A05
            boolean r0 = r9.A0b
            if (r0 != 0) goto L_0x018f
            boolean r0 = r2.A0N
            if (r0 != 0) goto L_0x0193
        L_0x0042:
            r0 = 8
        L_0x0044:
            r1.setVisibility(r0)
            r9.A36(r2)
            boolean r0 = r2.A05
            if (r0 != 0) goto L_0x01a7
            boolean r0 = r9.A0X
            if (r0 != 0) goto L_0x01a7
            boolean r0 = r9.A0c
            if (r0 != 0) goto L_0x01a7
            boolean r0 = r9.A38()
            if (r0 == 0) goto L_0x0088
            com.obwhatsapp.components.Button r0 = r9.A0C
            r0.setVisibility(r5)
            com.obwhatsapp.components.Button r0 = r9.A0D
            r0.setVisibility(r5)
            android.view.View r0 = r9.A03
            r0.setVisibility(r5)
            com.obwhatsapp.components.Button r0 = r9.A0E
            r0.setVisibility(r3)
            com.obwhatsapp.components.Button r0 = r9.A0E
            r0.setClickable(r4)
            r9.A37(r3)
            r9.A36(r2)
        L_0x007b:
            r0 = 2131364576(0x7f0a0ae0, float:1.8348993E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 == 0) goto L_0x0087
            X.AnonymousClass2JP.A02(r0)
        L_0x0087:
            return
        L_0x0088:
            java.lang.String r0 = r2.A02
            if (r0 != 0) goto L_0x0091
            boolean r0 = r2.A0R
            r1 = 0
            if (r0 == 0) goto L_0x0092
        L_0x0091:
            r1 = 1
        L_0x0092:
            android.view.View r0 = r9.A03
            r0.setVisibility(r5)
            com.obwhatsapp.components.Button r0 = r9.A0E
            r0.setVisibility(r5)
            if (r1 == 0) goto L_0x00fe
            com.obwhatsapp.components.Button r0 = r9.A0D
            r0.setVisibility(r5)
            long r1 = r2.A08
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ef
            X.013 r0 = r9.A01
            java.lang.String r5 = X.AnonymousClass2GQ.A03(r0, r1)
            r1 = 2131891863(0x7f121697, float:1.9418458E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r5
            java.lang.String r2 = r9.getString(r1, r0)
            r1 = 2131891922(0x7f1216d2, float:1.9418578E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r5
            java.lang.String r1 = r9.getString(r1, r0)
        L_0x00c7:
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            java.lang.Object r2 = r0.A00
            X.AnonymousClass00B.A06(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.A01
            X.AnonymousClass00B.A06(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.obwhatsapp.components.Button r0 = r9.A0C
            r0.setText(r2)
            com.obwhatsapp.components.Button r0 = r9.A0C
            r0.setContentDescription(r1)
            com.obwhatsapp.components.Button r0 = r9.A0C
            r0.setClickable(r4)
            com.obwhatsapp.components.Button r0 = r9.A0C
        L_0x00eb:
            r0.setVisibility(r3)
            goto L_0x007b
        L_0x00ef:
            r0 = 2131891862(0x7f121696, float:1.9418456E38)
            java.lang.String r2 = r9.getString(r0)
            r0 = 2131891921(0x7f1216d1, float:1.9418576E38)
            java.lang.String r1 = r9.getString(r0)
            goto L_0x00c7
        L_0x00fe:
            com.obwhatsapp.components.Button r0 = r9.A0C
            r0.setVisibility(r5)
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L_0x010e
            boolean r0 = r2.A01()
            r8 = 1
            if (r0 != 0) goto L_0x010f
        L_0x010e:
            r8 = 0
        L_0x010f:
            long r1 = r2.A08
            r6 = 0
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r0 = 0
            if (r5 <= 0) goto L_0x0119
            r0 = 1
        L_0x0119:
            if (r8 == 0) goto L_0x0169
            if (r0 == 0) goto L_0x015e
            X.013 r0 = r9.A01
            java.lang.String r5 = X.AnonymousClass2GQ.A03(r0, r1)
            r1 = 2131891885(0x7f1216ad, float:1.9418503E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r5
            java.lang.String r2 = r9.getString(r1, r0)
            r1 = 2131891886(0x7f1216ae, float:1.9418505E38)
        L_0x0131:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r5
            java.lang.String r1 = r9.getString(r1, r0)
        L_0x0139:
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            java.lang.Object r2 = r0.A00
            X.AnonymousClass00B.A06(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.A01
            X.AnonymousClass00B.A06(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.obwhatsapp.components.Button r0 = r9.A0D
            r0.setText(r2)
            com.obwhatsapp.components.Button r0 = r9.A0D
            r0.setContentDescription(r1)
            com.obwhatsapp.components.Button r0 = r9.A0D
            r0.setClickable(r4)
            com.obwhatsapp.components.Button r0 = r9.A0D
            goto L_0x00eb
        L_0x015e:
            r0 = 2131891883(0x7f1216ab, float:1.9418499E38)
            java.lang.String r2 = r9.getString(r0)
            r0 = 2131891884(0x7f1216ac, float:1.94185E38)
            goto L_0x018a
        L_0x0169:
            if (r0 == 0) goto L_0x0180
            X.013 r0 = r9.A01
            java.lang.String r5 = X.AnonymousClass2GQ.A03(r0, r1)
            r1 = 2131891866(0x7f12169a, float:1.9418464E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r5
            java.lang.String r2 = r9.getString(r1, r0)
            r1 = 2131891926(0x7f1216d6, float:1.9418586E38)
            goto L_0x0131
        L_0x0180:
            r0 = 2131891866(0x7f12169a, float:1.9418464E38)
            java.lang.String r2 = r9.getString(r0)
            r0 = 2131891925(0x7f1216d5, float:1.9418584E38)
        L_0x018a:
            java.lang.String r1 = r9.getString(r0)
            goto L_0x0139
        L_0x018f:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x0042
        L_0x0193:
            r0 = 0
            goto L_0x0044
        L_0x0196:
            android.view.View r1 = r9.A04
            if (r1 == 0) goto L_0x0087
            android.view.View r0 = r9.A01
            if (r0 == 0) goto L_0x0087
            r1.setVisibility(r3)
            android.view.View r0 = r9.A01
            r0.setVisibility(r5)
            return
        L_0x01a7:
            boolean r0 = r2.A0Q
            if (r0 == 0) goto L_0x01af
            r9.A37(r4)
            return
        L_0x01af:
            com.obwhatsapp.components.Button r0 = r9.A0D
            java.lang.String r1 = ""
            r0.setText(r1)
            com.obwhatsapp.components.Button r0 = r9.A0D
            r0.setClickable(r3)
            com.obwhatsapp.components.Button r0 = r9.A0C
            r0.setText(r1)
            com.obwhatsapp.components.Button r0 = r9.A0C
            r0.setClickable(r3)
            com.obwhatsapp.components.Button r0 = r9.A0E
            r0.setClickable(r3)
            android.view.View r0 = r9.A03
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A35():void");
    }

    public final void A36(C37771pi r5) {
        if (!r5.A0R) {
            String str = r5.A0M;
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder("https://static.whatsapp.net/sticker?img=");
                sb.append(str);
                String obj = sb.toString();
                if (obj != null && (!this.A0C.A0E(C16620tM.A02, 2565) || (obj = this.A0K.A00(obj)) != null)) {
                    this.A0O.A03().A01(this.A06, obj);
                    return;
                }
            }
        }
        this.A0O.A0D(r5, new AnonymousClass526(this.A06, r5.A0F));
    }

    public final void A37(boolean z2) {
        C37771pi r0 = this.A0N;
        if (r0 != null && r0.A04 != null) {
            this.A06.setImageResource(R.drawable.sticker_empty);
            C55552jq r2 = this.A0S;
            List<AnonymousClass4WQ> list = r2.A06;
            if (list != null) {
                for (AnonymousClass4WQ r02 : list) {
                    r02.A00 = z2;
                }
                r2.A01();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r1 = r3.A0U;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A38() {
        /*
            r3 = this;
            X.0sK r0 = r3.A01
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0021
            X.0pd r2 = r3.A0C
            r1 = 1396(0x574, float:1.956E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = r3.A0U
            if (r1 == 0) goto L_0x0021
            java.lang.String r0 = "meta-avatar"
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A38():boolean");
    }

    public void AP4(AnonymousClass1UX r2) {
        if (r2.A01) {
            A35();
            C55552jq r0 = this.A0S;
            if (r0 != null) {
                r0.A01();
            }
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 28) {
            super.onActivityResult(i2, i3, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout058e);
        this.A0U = getIntent().getStringExtra("sticker_pack_id");
        String stringExtra = getIntent().getStringExtra("sticker_pack_preview_source");
        this.A0b = "sticker_store_my_tab".equals(stringExtra);
        this.A0Z = "deeplink".equals(stringExtra);
        this.A0a = "info_dialog".equals(stringExtra);
        this.A0M.A02(this.A0g);
        if (A38()) {
            this.A0I.A02(this.A0f);
        }
        this.A0O.A0E(new AnonymousClass3H5(this), this.A0U, true);
        if (this.A0U == null) {
            Log.e("StickerStorePackPreviewActivity/onCreate no pack id passed");
            finish();
        }
        View view = this.A00;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon((Drawable) new C447725m(AnonymousClass2SR.A02(this, R.drawable.ic_back, R.color.color04ef), this.A01));
        toolbar.setTitle((int) R.string.str16de);
        toolbar.setNavigationContentDescription((int) R.string.str16a9);
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 16));
        Aem(toolbar);
        this.A01 = view.findViewById(R.id.details_container);
        this.A04 = view.findViewById(R.id.loading_progress);
        this.A08 = (TextView) view.findViewById(R.id.pack_preview_title);
        this.A09 = (TextView) view.findViewById(R.id.pack_preview_publisher);
        this.A07 = (TextView) view.findViewById(R.id.pack_preview_description);
        this.A03 = view.findViewById(R.id.pack_download_progress);
        this.A06 = (ImageView) view.findViewById(R.id.pack_tray_icon);
        this.A02 = view.findViewById(R.id.divider);
        this.A0D = (Button) view.findViewById(R.id.download_btn);
        this.A0C = (Button) view.findViewById(R.id.delete_btn);
        this.A0E = (Button) view.findViewById(R.id.edit_avatar_btn);
        this.A05 = (ImageView) view.findViewById(R.id.sticker_pack_animation_icon);
        this.A0D.setOnClickListener(new ViewOnClickCListenerShape3S0100000_I0_3(this, 4));
        this.A0C.setOnClickListener(new ViewOnClickCListenerShape3S0100000_I0_3(this, 5));
        this.A0E.setOnClickListener(new ViewOnClickCListenerShape3S0100000_I0_3(this, 6));
        this.A0A = new GridLayoutManager(1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sticker_preview_recycler);
        this.A0B = recyclerView;
        recyclerView.setLayoutManager(this.A0A);
        this.A0B.A0o(this.A0e);
        this.A0B.getViewTreeObserver().addOnGlobalLayoutListener(this.A0d);
        StickerView stickerView = (StickerView) view.findViewById(R.id.sticker_preview_expanded_sticker);
        this.A0P = stickerView;
        stickerView.A03 = true;
        this.A07.A02(this);
        if (A38()) {
            if (this.A0Z) {
                this.A0J.A01(8);
            }
            this.A0J.A02(16);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.A0U.contains(" ")) {
            getMenuInflater().inflate(R.menu.menu0012, menu);
            MenuItem findItem = menu.findItem(R.id.menu_sticker_pack_share);
            Drawable icon = findItem.getIcon();
            icon.mutate();
            icon.setColorFilter(getResources().getColor(R.color.color0755), PorterDuff.Mode.SRC_IN);
            findItem.setVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0M.A03(this.A0g);
        AnonymousClass1MF r0 = this.A0L;
        if (r0 != null) {
            r0.A03();
        }
        this.A07.A03(this);
        AnonymousClass37F r1 = this.A0T;
        if (r1 != null) {
            r1.A06(true);
            this.A0T = null;
        }
        Map map = this.A0V;
        if (map != null) {
            this.A05.Acl(new RunnableRunnableShape15S0100000_I0_14(new ArrayList(map.values()), 15));
            this.A0V.clear();
            this.A0V = null;
        }
        if (A38()) {
            this.A0I.A03(this.A0f);
            if (this.A0Z) {
                this.A0J.A00(8);
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_sticker_pack_share) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(C14750ph.A0c(this, String.format("https://wa.me/stickerpack/%s", new Object[]{this.A0U})));
        return true;
    }
}
