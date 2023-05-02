package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.InfoCard;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.biz.BusinessProfileFieldView;
import com.obwhatsapp.biz.catalog.view.CatalogMediaCard;
import com.obwhatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;
import com.obwhatsapp.biz.profile.TrustSignalItem;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.contact.view.custom.ContactDetailsActionIcon;
import com.obwhatsapp.pnh.RequestPhoneNumberViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Calendar;

/* renamed from: X.2Xz  reason: invalid class name */
public class AnonymousClass2Xz implements AnonymousClass1U3 {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public InfoCard A05;
    public InfoCard A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public TextEmojiLabel A09;
    public WaTextView A0A;
    public WaTextView A0B;
    public AnonymousClass3BG A0C;
    public BusinessProfileFieldView A0D;
    public CatalogMediaCard A0E;
    public LinkedAccountsMediaCard A0F;
    public LinkedAccountsMediaCard A0G;
    public TrustSignalItem A0H;
    public TrustSignalItem A0I;
    public C35661mI A0J;
    public C35611mD A0K;
    public C16010sH A0L;
    public C100194vF A0M;
    public boolean A0N;
    public boolean A0O = true;
    public boolean A0P = true;
    public final View A0Q;
    public final C19980zJ A0R;
    public final C14870pt A0S;
    public final C17090uW A0T;
    public final C16040sK A0U;
    public final C25751Kz A0V;
    public final C17150uc A0W;
    public final AnonymousClass16O A0X;
    public final C17170ue A0Y;
    public final AnonymousClass1KR A0Z;
    public final C17180uf A0a;
    public final AnonymousClass4TP A0b;
    public final C204310c A0c;
    public final ContactInfoActivity A0d;
    public final C49662Uu A0e;
    public final C224818c A0f;
    public final C17030uP A0g;
    public final C16080sP A0h;
    public final ContactDetailsActionIcon A0i;
    public final AnonymousClass2a9 A0j;
    public final AnonymousClass01V A0k;
    public final C16440t3 A0l;
    public final C16980tz A0m;
    public final C17120uZ A0n;
    public final AnonymousClass013 A0o;
    public final C14710pd A0p;
    public final C20260zl A0q;
    public final C16490t9 A0r;
    public final AnonymousClass1P7 A0s;
    public final C17190ug A0t;
    public final AnonymousClass2X0 A0u;
    public final RequestPhoneNumberViewModel A0v;
    public final AnonymousClass1KW A0w;
    public final AnonymousClass4OY A0x;
    public final C25781Lc A0y;
    public final AnonymousClass15V A0z;
    public final C228419m A10;
    public final C228219k A11;
    public final Integer A12;

    public AnonymousClass2Xz(View view, C19980zJ r16, C14870pt r17, C17090uW r18, C16040sK r19, C25751Kz r20, C17150uc r21, AnonymousClass16O r22, C17170ue r23, AnonymousClass1KR r24, C35661mI r25, C17180uf r26, AnonymousClass4TP r27, C204310c r28, ContactInfoActivity contactInfoActivity, C49662Uu r30, C224818c r31, C17030uP r32, C16080sP r33, AnonymousClass2a9 r34, AnonymousClass01V r35, C16440t3 r36, C16980tz r37, C17120uZ r38, AnonymousClass013 r39, C16010sH r40, C14710pd r41, C20260zl r42, C16490t9 r43, AnonymousClass1P7 r44, C17190ug r45, AnonymousClass2X0 r46, RequestPhoneNumberViewModel requestPhoneNumberViewModel, AnonymousClass1KW r48, AnonymousClass4OY r49, C25781Lc r50, AnonymousClass15V r51, C228419m r52, C228219k r53, Integer num) {
        this.A0l = r36;
        this.A0p = r41;
        this.A11 = r53;
        this.A0S = r17;
        this.A0U = r19;
        this.A0m = r37;
        this.A0z = r51;
        this.A0r = r43;
        this.A0c = r28;
        this.A0q = r42;
        this.A0T = r18;
        this.A0R = r16;
        this.A0s = r44;
        this.A0t = r45;
        this.A0h = r33;
        this.A0k = r35;
        this.A0o = r39;
        this.A0e = r30;
        this.A10 = r52;
        this.A0x = r49;
        this.A0y = r50;
        this.A0g = r32;
        this.A0X = r22;
        this.A0V = r20;
        this.A0W = r21;
        this.A0Y = r23;
        this.A0f = r31;
        this.A0a = r26;
        this.A0u = r46;
        this.A0j = r34;
        this.A0v = requestPhoneNumberViewModel;
        this.A0n = r38;
        this.A0Z = r24;
        this.A0b = r27;
        this.A0J = r25;
        AnonymousClass00B.A04(view);
        this.A01 = view.findViewById(R.id.business_verification_status);
        this.A09 = (TextEmojiLabel) C004601z.A0E(view, R.id.business_verification_status_text);
        this.A0D = (BusinessProfileFieldView) C004601z.A0E(view, R.id.business_description);
        this.A0E = (CatalogMediaCard) C004601z.A0E(view, R.id.business_catalog_media_card);
        this.A0F = (LinkedAccountsMediaCard) C004601z.A0E(view, R.id.business_fb_media_card);
        this.A0G = (LinkedAccountsMediaCard) C004601z.A0E(view, R.id.business_ig_media_card);
        this.A06 = (InfoCard) C004601z.A0E(view, R.id.business_catalog_shop_info_card);
        this.A03 = C004601z.A0E(view, R.id.shops_container);
        this.A04 = (TextView) C004601z.A0E(view, R.id.blank_business_details_text);
        this.A00 = C004601z.A0E(view, R.id.add_business_to_contact);
        this.A05 = (InfoCard) C004601z.A0E(view, R.id.business_chaining_container);
        this.A0i = (ContactDetailsActionIcon) C004601z.A0E(view, R.id.action_request_phone_number);
        ContactInfoActivity contactInfoActivity2 = contactInfoActivity;
        ((C48412Nd) C004601z.A0E(view, R.id.business_chaining_layout)).setTitle(contactInfoActivity2.getString(R.string.str01d9));
        this.A08 = (TextEmojiLabel) C004601z.A0E(view, R.id.business_title);
        this.A07 = (TextEmojiLabel) C004601z.A0E(view, R.id.business_subtitle);
        this.A0A = (WaTextView) C004601z.A0E(view, R.id.custom_url);
        this.A0B = (WaTextView) contactInfoActivity2.findViewById(R.id.member_since_text);
        this.A12 = num;
        this.A0d = contactInfoActivity2;
        this.A0Q = view;
        C16010sH r2 = r40;
        this.A0L = r2;
        this.A0w = r48;
        C14710pd r3 = this.A0p;
        C16620tM r1 = C16620tM.A02;
        if (r3.A0E(r1, 2582) || (!r3.A0E(r1, 1483) && !r3.A0E(r1, 1849))) {
            this.A0A.setVisibility(8);
        } else {
            UserJid A032 = A03();
            AnonymousClass00B.A06(A032);
            WaTextView waTextView = this.A0A;
            waTextView.setVisibility(0);
            waTextView.setText(R.string.str0c8c);
            C14870pt r5 = this.A0S;
            C17190ug r4 = this.A0t;
            C63123Gf r8 = new C63123Gf(r5, new C83494Gx(this, A032), this.A0n, r4);
            C17190ug r7 = r8.A03;
            String A022 = r7.A02();
            C32461gQ r47 = new C32461gQ("user");
            r47.A02(new C35081lL((Jid) A032, "jid"));
            r7.A0B(r8, new C28371Vv(r47.A01(), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("id", A022), new C35081lL("type", "get"), new C35081lL("xmlns", "fb:thrift_iq"), new C35081lL("smax_id", "78")}), A022, 316, 32000);
            StringBuilder sb = new StringBuilder("GetCustomUrlsByJidProtocol/sendRequest/jid=");
            sb.append(A032);
            Log.i(sb.toString());
        }
        A07(r2);
    }

    public static Calendar A00(Calendar calendar, int i2, int i3) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(7, i2);
        calendar2.set(11, i3 / 60);
        calendar2.set(12, i3 % 60);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    public static /* synthetic */ void A01(AnonymousClass2Xz r2, int i2) {
        if (r2.A0L.A0H()) {
            r2.A0Z.A01(r2.A0J, i2);
        }
    }

    public static boolean A02(View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.intersects(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels);
    }

    public UserJid A03() {
        C16010sH r1 = this.A0L;
        if (r1 == null) {
            return null;
        }
        return (UserJid) r1.A08(UserJid.class);
    }

    public final void A04(int i2) {
        if (this.A0L.A0H()) {
            this.A0Z.A05((Integer) null, this.A12, C16030sJ.A03(A03()), i2, A0A(), A09());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0778, code lost:
        if (r5.A01 == null) goto L_0x071e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07ed, code lost:
        if (r0.A0I.getVisibility() != 0) goto L_0x07ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0572  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0641  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x06e9  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0736  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0748  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0763  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x077b  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0780  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0786  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x07b7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x07cc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x07e6  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0822  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0859  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x089f  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x08ac  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x09ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C35661mI r41, X.C16010sH r42, X.C34331k5 r43, boolean r44, boolean r45, boolean r46) {
        /*
            r40 = this;
            r0 = r40
            r7 = r42
            r0.A0L = r7
            r0.A07(r7)
            android.view.View r1 = r0.A0Q
            X.AnonymousClass00B.A04(r1)
            r6 = 0
            r1.setVisibility(r6)
            r7.A09()
            X.0zl r2 = r0.A0q
            r39 = r2
            com.whatsapp.jid.UserJid r3 = r0.A03()
            boolean r2 = X.C40561uK.A01(r2, r3)
            r8 = 1
            r4 = 8
            if (r2 != 0) goto L_0x041f
            X.0pd r3 = r0.A0p
            com.whatsapp.jid.UserJid r2 = r0.A03()
            boolean r2 = X.C40571uL.A00(r3, r2)
            if (r2 != 0) goto L_0x041f
            android.view.View r5 = r0.A01
            r3 = 7
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r2 = new com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0
            r2.<init>(r0, r3)
            r5.setOnClickListener(r2)
            X.0sH r2 = r0.A0L
            X.1ko r2 = r2.A0D
            if (r2 != 0) goto L_0x0050
            X.0sK r3 = r0.A0U
            com.whatsapp.jid.UserJid r2 = r0.A03()
            boolean r2 = r3.A0I(r2)
            if (r2 != 0) goto L_0x0050
            r8 = 0
        L_0x0050:
            android.view.View r3 = r0.A00
            X.AnonymousClass00B.A04(r3)
            r2 = r43
            r3.setOnClickListener(r2)
            if (r8 != 0) goto L_0x0424
            X.0sK r2 = r0.A0U
            boolean r2 = r2.A0G()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0424
            r3.setVisibility(r6)
        L_0x0069:
            X.1mD r2 = r0.A0K
            if (r2 != 0) goto L_0x0419
            r21 = 0
        L_0x006f:
            r2 = 2131362418(0x7f0a0272, float:1.8344616E38)
            android.view.View r3 = X.C004601z.A0E(r1, r2)
            X.1mD r5 = r0.A0K
            r22 = r41
            if (r5 == 0) goto L_0x008e
            boolean r2 = r5.A00()
            if (r2 == 0) goto L_0x0210
            java.lang.String r2 = r5.A0F
            if (r2 != 0) goto L_0x0210
            java.util.List r2 = r5.A0G
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0210
        L_0x008e:
            r10 = 8
            r3.setVisibility(r4)
        L_0x0093:
            com.whatsapp.jid.UserJid r2 = r0.A03()
            X.AnonymousClass00B.A06(r2)
            r4 = 0
            r0.A08(r2, r6)
            r2 = 2131361913(0x7f0a0079, float:1.8343592E38)
            android.view.View r12 = X.C004601z.A0E(r1, r2)
            r2 = 2131361898(0x7f0a006a, float:1.8343561E38)
            android.view.View r11 = X.C004601z.A0E(r1, r2)
            r2 = 2131361922(0x7f0a0082, float:1.834361E38)
            android.view.View r9 = X.C004601z.A0E(r1, r2)
            com.obwhatsapp.contact.view.custom.ContactDetailsActionIcon r9 = (com.obwhatsapp.contact.view.custom.ContactDetailsActionIcon) r9
            r2 = 2131361906(0x7f0a0072, float:1.8343578E38)
            android.view.View r8 = X.C004601z.A0E(r1, r2)
            r2 = 2131361920(0x7f0a0080, float:1.8343606E38)
            android.view.View r5 = X.C004601z.A0E(r1, r2)
            com.whatsapp.jid.UserJid r3 = r0.A03()
            X.AnonymousClass00B.A06(r3)
            com.whatsapp.jid.UserJid r13 = r0.A03()
            r2 = r39
            boolean r14 = X.C40561uK.A01(r2, r13)
            r2 = 8
            if (r46 == 0) goto L_0x00d9
            r2 = 0
        L_0x00d9:
            r12.setVisibility(r2)
            com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0 r2 = new com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0
            r2.<init>(r3, r10, r0)
            r12.setOnClickListener(r2)
            X.0sH r2 = r0.A0L
            boolean r2 = r2.A0H()
            if (r2 == 0) goto L_0x01da
            X.0uP r2 = r0.A0g
            boolean r2 = r2.A02(r3)
            if (r2 == 0) goto L_0x01da
        L_0x00f4:
            X.1mD r2 = r0.A0K
            if (r2 == 0) goto L_0x019d
            boolean r2 = r2.A0N
            if (r2 == 0) goto L_0x019d
            X.0pd r12 = r0.A0p
            r11 = 957(0x3bd, float:1.341E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r12.A0E(r2, r11)
            if (r2 == 0) goto L_0x019d
        L_0x0108:
            r9.setVisibility(r10)
        L_0x010b:
            if (r14 != 0) goto L_0x018a
            X.0pd r3 = r0.A0p
            com.whatsapp.jid.UserJid r2 = r0.A03()
            boolean r2 = X.C40571uL.A00(r3, r2)
            if (r2 != 0) goto L_0x018a
            r3 = 11
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r2 = new com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0
            r2.<init>(r0, r3)
            r8.setOnClickListener(r2)
        L_0x0123:
            r5.setVisibility(r10)
        L_0x0126:
            X.1mD r2 = r0.A0K
            if (r2 == 0) goto L_0x0445
            java.util.List r2 = r2.A0G
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0445
            X.16O r2 = r0.A0X
            int r2 = r2.A00()
            r2 = r2 & 4
            if (r2 <= 0) goto L_0x0445
            X.0pd r3 = r0.A0p
            com.whatsapp.jid.UserJid r2 = r0.A03()
            boolean r2 = X.C40571uL.A00(r3, r2)
            if (r2 != 0) goto L_0x0445
            r2 = 2131362369(0x7f0a0241, float:1.8344517E38)
            android.view.View r5 = X.C004601z.A0E(r1, r2)
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.1mD r2 = r0.A0K
            java.util.List r2 = r2.A0G
            java.lang.String r9 = " • "
            if (r2 == 0) goto L_0x04a2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.util.Iterator r11 = r2.iterator()
        L_0x0162:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x042b
            java.lang.Object r2 = r11.next()
            X.1dn r2 = (X.C31241dn) r2
            if (r2 == 0) goto L_0x017f
            java.lang.String r3 = r2.A01
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x017f
            r8.append(r3)
            r8.append(r9)
            goto L_0x0162
        L_0x017f:
            java.lang.String r3 = "Category is null"
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r3)
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)
            goto L_0x0162
        L_0x018a:
            r8.setVisibility(r10)
            if (r14 == 0) goto L_0x0123
            r3 = 39
            com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0 r2 = new com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0
            r2.<init>((java.lang.Object) r0, (int) r3)
            r5.setOnClickListener(r2)
            r5.setVisibility(r6)
            goto L_0x0126
        L_0x019d:
            X.1mD r11 = r0.A0K
            if (r11 == 0) goto L_0x01b4
            boolean r2 = r11.A0L
            if (r2 == 0) goto L_0x01b4
            r11 = 9
            com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0 r2 = new com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0
            r2.<init>(r3, r11, r0)
            r9.setOnClickListener(r2)
            r9.setVisibility(r6)
            goto L_0x010b
        L_0x01b4:
            X.1Kz r2 = r0.A0V
            boolean r2 = r2.A00(r11)
            if (r2 == 0) goto L_0x0108
            r3 = 2131231441(0x7f0802d1, float:1.8078963E38)
            com.obwhatsapp.chatinfo.ContactInfoActivity r11 = r0.A0d
            r2 = 2131887435(0x7f12054b, float:1.9409477E38)
            java.lang.String r2 = r11.getString(r2)
            r9.A00(r3, r2)
            r3 = 10
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r2 = new com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0
            r2.<init>(r0, r3)
            r9.setOnClickListener(r2)
            r9.setVisibility(r6)
            goto L_0x010b
        L_0x01da:
            if (r14 != 0) goto L_0x00f4
            X.2a9 r2 = r0.A0j
            X.1ZT r2 = r2.A00(r3)
            if (r2 != 0) goto L_0x00f4
            r12 = 9
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r2 = new com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0
            r2.<init>(r0, r12)
            r11.setOnClickListener(r2)
            X.0sK r12 = r0.A0U
            X.0sH r2 = r0.A0L
            X.0rv r2 = r2.A0E
            boolean r2 = r12.A0I(r2)
            if (r2 == 0) goto L_0x020b
            X.0pd r13 = r0.A0p
            r12 = 1967(0x7af, float:2.756E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r13.A0E(r2, r12)
            if (r2 == 0) goto L_0x020b
            r11.setVisibility(r10)
            goto L_0x00f4
        L_0x020b:
            r11.setVisibility(r6)
            goto L_0x00f4
        L_0x0210:
            X.1mD r2 = r0.A0K
            boolean r2 = r2.A00()
            if (r2 != 0) goto L_0x008e
            r3.setVisibility(r6)
            X.1mD r2 = r0.A0K
            com.obwhatsapp.biz.BusinessProfileFieldView r4 = r0.A0D
            java.lang.String r5 = r2.A0A
            r3 = 38
            com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0 r2 = new com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0
            r2.<init>((java.lang.Object) r0, (int) r3)
            r4.setText(r5, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x0246
            X.0pd r5 = r0.A0p
            r3 = 37
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r5.A0E(r2, r3)
            if (r2 == 0) goto L_0x0411
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = r0.A0d
            r2 = 2131100930(0x7f060502, float:1.7814255E38)
            int r2 = X.AnonymousClass00T.A00(r3, r2)
        L_0x0246:
            X.0pd r9 = r0.A0p
            r2 = 37
            X.0tM r8 = X.C16620tM.A02
            boolean r2 = r9.A0E(r8, r2)
            if (r2 != 0) goto L_0x02fb
            X.3BG r5 = r0.A0C
            if (r5 != 0) goto L_0x02a6
            r2 = 2131362419(0x7f0a0273, float:1.8344618E38)
            android.view.View r3 = X.C004601z.A0E(r1, r2)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            r2 = 2131559774(0x7f0d055e, float:1.8744902E38)
            r3.setLayoutResource(r2)
            android.view.View r24 = r3.inflate()
            X.0sK r2 = r0.A0U
            r16 = r2
            X.0zJ r15 = r0.A0R
            X.1P7 r14 = r0.A0s
            X.0sP r13 = r0.A0h
            X.013 r12 = r0.A0o
            X.16O r11 = r0.A0X
            X.0uf r10 = r0.A0a
            X.1KR r4 = r0.A0Z
            java.lang.Integer r3 = r0.A12
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = r0.A0d
            boolean r38 = r0.A0A()
            X.3BG r5 = new X.3BG
            r37 = 0
            r25 = r15
            r26 = r2
            r27 = r16
            r28 = r11
            r29 = r4
            r30 = r22
            r31 = r10
            r32 = r13
            r33 = r12
            r34 = r7
            r35 = r14
            r36 = r3
            r23 = r5
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r0.A0C = r5
        L_0x02a6:
            X.1mD r2 = r0.A0K
            r5.A03(r2)
        L_0x02ab:
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = r0.A0d
            r3.populatePhoneNumber(r1)
            X.1Kz r4 = r0.A0V
            X.1mD r2 = r0.A0K
            boolean r2 = r4.A00(r2)
            if (r2 == 0) goto L_0x02da
            r2 = 2131366610(0x7f0a12d2, float:1.8353118E38)
            android.view.View r4 = r3.findViewById(r2)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x02da
            X.1mD r2 = r0.A0K
            if (r2 == 0) goto L_0x02de
            boolean r2 = r2.A0N
            if (r2 == 0) goto L_0x02de
            r2 = 957(0x3bd, float:1.341E-42)
            boolean r2 = r9.A0E(r8, r2)
            if (r2 == 0) goto L_0x02de
            r2 = 8
            r4.setVisibility(r2)
        L_0x02da:
            r10 = 8
            goto L_0x0093
        L_0x02de:
            r4.setVisibility(r6)
            r2 = 2131231441(0x7f0802d1, float:1.8078963E38)
            r4.setImageResource(r2)
            r2 = 2131887435(0x7f12054b, float:1.9409477E38)
            java.lang.String r2 = r3.getString(r2)
            r4.setContentDescription(r2)
            r3 = 6
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r2 = new com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0
            r2.<init>(r0, r3)
            r4.setOnClickListener(r2)
            goto L_0x02da
        L_0x02fb:
            X.1mD r4 = r0.A0K
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.1mE r2 = r4.A00
            if (r2 == 0) goto L_0x0312
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = r0.A0d
            r2 = 2131886822(0x7f1202e6, float:1.9408234E38)
            java.lang.String r2 = r3.getString(r2)
            r5.add(r2)
        L_0x0312:
            X.1m7 r3 = r4.A03
            X.1m7 r2 = X.C35551m7.A04
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0328
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = r0.A0d
            r2 = 2131886819(0x7f1202e3, float:1.9408228E38)
            java.lang.String r2 = r3.getString(r2)
            r5.add(r2)
        L_0x0328:
            java.lang.String r2 = r4.A0F
            if (r2 == 0) goto L_0x0338
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = r0.A0d
            r2 = 2131886820(0x7f1202e4, float:1.940823E38)
            java.lang.String r2 = r3.getString(r2)
            r5.add(r2)
        L_0x0338:
            java.lang.String r2 = r4.A0B
            if (r2 == 0) goto L_0x0348
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = r0.A0d
            r2 = 2131886821(0x7f1202e5, float:1.9408232E38)
            java.lang.String r2 = r3.getString(r2)
            r5.add(r2)
        L_0x0348:
            java.util.List r3 = r4.A0I
            boolean r2 = r3.isEmpty()
            r4 = 1
            if (r2 != 0) goto L_0x03c9
            java.util.Iterator r13 = r3.iterator()
            r10 = 0
            r12 = 0
        L_0x0357:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x03a8
            java.lang.Object r3 = r13.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0357
            java.lang.String r2 = X.C808045q.A00(r3)
            android.net.Uri r11 = android.net.Uri.parse(r2)
            java.lang.String r3 = r11.getHost()
            java.lang.String r2 = "www.instagram.com"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x03a6
            java.lang.String r3 = r11.getHost()
            java.lang.String r2 = "instagram.com"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x03a6
            java.lang.String r3 = r11.getHost()
            java.lang.String r2 = "instagr.am"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x03a6
            java.lang.String r3 = r11.getHost()
            java.lang.String r2 = "www.instagr.am"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x03a6
            int r10 = r10 + 1
            goto L_0x0357
        L_0x03a6:
            r12 = 1
            goto L_0x0357
        L_0x03a8:
            if (r10 <= 0) goto L_0x03bb
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = r0.A0d
            r2 = 2131886824(0x7f1202e8, float:1.9408238E38)
            if (r10 <= r4) goto L_0x03b4
            r2 = 2131886825(0x7f1202e9, float:1.940824E38)
        L_0x03b4:
            java.lang.String r2 = r3.getString(r2)
            r5.add(r2)
        L_0x03bb:
            if (r12 == 0) goto L_0x03c9
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = r0.A0d
            r2 = 2131886823(0x7f1202e7, float:1.9408236E38)
            java.lang.String r2 = r3.getString(r2)
            r5.add(r2)
        L_0x03c9:
            X.013 r2 = r0.A0o
            java.lang.String r4 = X.C40631uR.A00(r2, r5, r4)
            android.view.View r2 = r0.A02
            if (r2 != 0) goto L_0x02ab
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x02ab
            r2 = 2131364947(0x7f0a0c53, float:1.8349745E38)
            android.view.View r3 = X.C004601z.A0E(r1, r2)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            r2 = 2131559779(0x7f0d0563, float:1.8744912E38)
            r3.setLayoutResource(r2)
            android.view.View r3 = r3.inflate()
            r0.A02 = r3
            r2 = 2131364945(0x7f0a0c51, float:1.8349741E38)
            android.view.View r2 = r3.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r4)
            r2 = 2131364946(0x7f0a0c52, float:1.8349743E38)
            android.view.View r2 = r1.findViewById(r2)
            r2.setVisibility(r6)
            android.view.View r4 = r0.A02
            r3 = 6
            com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0 r2 = new com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0
            r2.<init>(r7, r3, r0)
            r4.setOnClickListener(r2)
            goto L_0x02ab
        L_0x0411:
            r2 = 2131231539(0x7f080333, float:1.8079162E38)
            r4.setIcon((int) r2)
            goto L_0x0246
        L_0x0419:
            java.lang.String r2 = r2.A0E
            r21 = r2
            goto L_0x006f
        L_0x041f:
            android.view.View r2 = r0.A01
            r2.setVisibility(r4)
        L_0x0424:
            android.view.View r2 = r0.A00
            r2.setVisibility(r4)
            goto L_0x0069
        L_0x042b:
            int r2 = r8.length()
            int r3 = r9.length()
            if (r2 <= r3) goto L_0x04a2
            int r2 = r8.length()
            int r2 = r2 - r3
            java.lang.String r3 = r8.substring(r6, r2)
        L_0x043e:
            r2 = 0
            r5.setText(r3, r2)
            r5.setVisibility(r6)
        L_0x0445:
            r2 = 2131362406(0x7f0a0266, float:1.8344592E38)
            android.view.View r11 = X.C004601z.A0E(r1, r2)
            android.widget.TextView r11 = (android.widget.TextView) r11
            X.1mD r2 = r0.A0K
            if (r2 == 0) goto L_0x04a5
            X.1mE r2 = r2.A00
            if (r2 == 0) goto L_0x04a5
            X.013 r2 = r0.A0o
            r23 = r2
            com.obwhatsapp.chatinfo.ContactInfoActivity r9 = r0.A0d
            X.0t3 r2 = r0.A0l
            long r2 = r2.A00()
            X.1mD r5 = r0.A0K
            X.1mE r5 = r5.A00
            java.lang.String r15 = r5.A01
            boolean r8 = X.AnonymousClass1ZW.A0E(r15)
            if (r8 == 0) goto L_0x049d
            java.util.TimeZone r8 = java.util.TimeZone.getDefault()
        L_0x0472:
            java.util.Calendar r8 = java.util.Calendar.getInstance(r8)
            r8.setTimeInMillis(r2)
            r12 = 7
            int r13 = r8.get(r12)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.List r5 = r5.A02
            java.util.Iterator r16 = r5.iterator()
        L_0x0489:
            boolean r5 = r16.hasNext()
            if (r5 == 0) goto L_0x04a9
            java.lang.Object r12 = r16.next()
            X.1ju r12 = (X.C34221ju) r12
            int r5 = r12.A00
            if (r5 != r13) goto L_0x0489
            r14.add(r12)
            goto L_0x0489
        L_0x049d:
            java.util.TimeZone r8 = java.util.TimeZone.getTimeZone(r15)
            goto L_0x0472
        L_0x04a2:
            java.lang.String r3 = ""
            goto L_0x043e
        L_0x04a5:
            r2 = 8
            goto L_0x052b
        L_0x04a9:
            r5 = 2131099859(0x7f0600d3, float:1.7812083E38)
            r12 = 2131886837(0x7f1202f5, float:1.9408264E38)
            java.lang.String r20 = r9.getString(r12)
            if (r15 == 0) goto L_0x09a7
            java.util.TimeZone r12 = java.util.TimeZone.getDefault()
            int r13 = r12.getOffset(r2)
            java.util.TimeZone r12 = java.util.TimeZone.getTimeZone(r15)
            int r2 = r12.getOffset(r2)
            if (r13 == r2) goto L_0x09a7
            r2 = 2131886830(0x7f1202ee, float:1.940825E38)
            java.lang.String r19 = r9.getString(r2)
        L_0x04ce:
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto L_0x09a3
            java.lang.Object r2 = r14.get(r6)
            X.1ju r2 = (X.C34221ju) r2
            int r13 = r2.A00
            int r2 = r2.A01
            r18 = 2
            r12 = 1
            if (r2 == 0) goto L_0x08d8
            if (r2 == r12) goto L_0x08c9
            r3 = 2
            if (r2 != r3) goto L_0x09a3
            r5 = 2131099860(0x7f0600d4, float:1.7812085E38)
            r2 = 2131886833(0x7f1202f1, float:1.9408256E38)
            java.lang.String r13 = r9.getString(r2)
            r8 = 2131886832(0x7f1202f0, float:1.9408254E38)
        L_0x04f5:
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r6] = r13
        L_0x04f9:
            java.lang.String r20 = r9.getString(r8, r3)
        L_0x04fd:
            int r3 = X.AnonymousClass00T.A00(r9, r5)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r3)
            java.lang.String r3 = r20.trim()
            int r12 = r3.indexOf(r13)
            int r8 = r13.length()
            int r8 = r8 + r12
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r3)
            r3 = 33
            r5.setSpan(r2, r12, r8, r3)
            X.3MR r2 = new X.3MR
            r2.<init>(r9)
            r5.setSpan(r2, r12, r8, r3)
            android.widget.TextView$BufferType r2 = android.widget.TextView.BufferType.SPANNABLE
            r11.setText(r5, r2)
            r2 = 0
        L_0x052b:
            r11.setVisibility(r2)
            com.obwhatsapp.TextEmojiLabel r9 = r0.A08
            if (r9 == 0) goto L_0x0590
            com.obwhatsapp.TextEmojiLabel r5 = r0.A07
            if (r5 == 0) goto L_0x0590
            X.0sP r3 = r0.A0h
            X.0sQ r2 = r3.A07(r7, r6)
            java.lang.String r8 = r2.A01
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = r0.A0d
            if (r8 != 0) goto L_0x0546
            java.lang.String r8 = r7.A0B()
        L_0x0546:
            android.text.Spannable r8 = X.C45922Bq.A00(r2, r8)
            android.widget.TextView$BufferType r2 = android.widget.TextView.BufferType.SPANNABLE
            r9.setText(r8, r2)
            boolean r2 = r7.A0K()
            if (r2 != 0) goto L_0x08ac
            boolean r2 = r7.A0L()
            if (r2 != 0) goto L_0x08ac
            r9.A0A()
        L_0x055e:
            X.0rv r8 = r7.A0E
            r2 = r39
            boolean r2 = X.C40561uK.A01(r2, r8)
            if (r2 != 0) goto L_0x089f
            X.0pd r8 = r0.A0p
            X.0rv r2 = r7.A0E
            boolean r2 = X.C40571uL.A00(r8, r2)
            if (r2 != 0) goto L_0x089f
            X.0rv r2 = r7.A0E
            boolean r2 = X.C16030sJ.A0M(r2)
            if (r2 != 0) goto L_0x087b
            boolean r2 = r7.A0G()
            if (r2 != 0) goto L_0x087b
            X.013 r3 = r0.A0o
            java.lang.String r2 = X.C24561Gk.A01(r7)
            java.lang.String r2 = r3.A0H(r2)
        L_0x058a:
            r5.setText(r2)
        L_0x058d:
            r5.setVisibility(r6)
        L_0x0590:
            android.widget.TextView r2 = r0.A04
            r2.setVisibility(r10)
            r3 = 1
            if (r45 != 0) goto L_0x059d
            X.0ue r2 = r0.A0Y
            r2.A02(r3)
        L_0x059d:
            if (r44 == 0) goto L_0x0627
            X.1mD r2 = r0.A0K
            if (r2 != 0) goto L_0x05ab
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = r0.A0d
            r2 = 2131886826(0x7f1202ea, float:1.9408242E38)
            r3.Afq(r2)
        L_0x05ab:
            com.whatsapp.jid.UserJid r5 = r0.A03()
            if (r5 == 0) goto L_0x05b8
            X.0uc r3 = r0.A0W
            r2 = r21
            r3.A05(r0, r5, r2)
        L_0x05b8:
            boolean r2 = r7.A0H()
            if (r2 == 0) goto L_0x0627
            X.1KR r6 = r0.A0Z
            r10 = 1
            com.whatsapp.jid.UserJid r2 = r0.A03()
            java.lang.String r9 = X.C16030sJ.A03(r2)
            r7 = 0
            java.lang.Integer r8 = r0.A12
            boolean r11 = r0.A0A()
            boolean r12 = r0.A09()
            r6.A05(r7, r8, r9, r10, r11, r12)
            X.1mD r2 = r0.A0K
            if (r2 == 0) goto L_0x05f4
            X.1mA r2 = r2.A01
            if (r2 == 0) goto L_0x05f4
            java.lang.String r2 = r2.A00
            if (r2 == 0) goto L_0x05f4
            X.0pd r5 = r0.A0p
            r3 = 601(0x259, float:8.42E-43)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r5.A0E(r2, r3)
            if (r2 == 0) goto L_0x05f4
            r2 = 19
            r0.A04(r2)
        L_0x05f4:
            if (r41 == 0) goto L_0x061a
            r2 = r22
            java.lang.Integer r2 = r2.A04
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x061a
            com.whatsapp.jid.UserJid r2 = r0.A03()
            java.lang.String r2 = X.C16030sJ.A03(r2)
            X.3qq r3 = new X.3qq
            r3.<init>()
            r3.A01 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3.A00 = r2
            X.0t9 r2 = r6.A03
            r2.A06(r3)
        L_0x061a:
            X.0sH r2 = r0.A0L
            boolean r2 = r2.A0H()
            if (r2 == 0) goto L_0x0627
            X.1mI r2 = r0.A0J
            r6.A01(r2, r4)
        L_0x0627:
            X.2Uu r12 = r0.A0e
            android.view.ViewTreeObserver r3 = r12.getViewTreeObserver()
            X.3D4 r2 = new X.3D4
            r2.<init>(r0)
            r3.addOnGlobalLayoutListener(r2)
            X.0pd r3 = r0.A0p
            r5 = 2582(0xa16, float:3.618E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r5 = r3.A0E(r2, r5)
            if (r5 == 0) goto L_0x067e
            X.1mD r5 = r0.A0K
            if (r5 == 0) goto L_0x0872
            java.lang.String r7 = r5.A07
            boolean r5 = X.AnonymousClass1ZW.A0E(r7)
            if (r5 != 0) goto L_0x0872
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = "wa.me"
            r6[r4] = r5
            r5 = 1
            r6[r5] = r7
            java.lang.String r5 = "%s/%s"
            java.lang.String r9 = java.lang.String.format(r5, r6)
            com.whatsapp.jid.UserJid r8 = r0.A03()
            X.AnonymousClass00B.A06(r8)
            com.obwhatsapp.WaTextView r7 = r0.A0A
            r7.setText(r9)
            r7.setVisibility(r4)
            r6 = 7
            com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0 r5 = new com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0
            r5.<init>(r8, r6, r0)
            r7.setOnClickListener(r5)
            X.4kU r5 = new X.4kU
            r5.<init>(r0, r9)
            r7.setOnLongClickListener(r5)
        L_0x067e:
            X.1mD r5 = r0.A0K
            if (r5 == 0) goto L_0x0706
            X.1m8 r10 = r5.A02
            if (r10 == 0) goto L_0x0706
            r6 = 725(0x2d5, float:1.016E-42)
            boolean r6 = r3.A0E(r2, r6)
            if (r6 == 0) goto L_0x0706
            r6 = 2131362860(0x7f0a042c, float:1.8345513E38)
            android.view.View r13 = X.C004601z.A0E(r1, r6)
            r8 = 8
            X.1m9 r7 = r10.A00
            if (r7 != 0) goto L_0x078d
            X.1m9 r6 = r10.A01
            if (r6 != 0) goto L_0x078d
        L_0x069f:
            r13.setVisibility(r8)
            com.whatsapp.jid.UserJid r14 = r0.A03()
            r8 = 8
            if (r7 == 0) goto L_0x0786
            X.0uf r1 = r0.A0a
            X.0pd r9 = r1.A02
            r1 = 2781(0xadd, float:3.897E-42)
            boolean r1 = r9.A0E(r2, r1)
            if (r1 == 0) goto L_0x0786
            boolean r1 = r7.A00
            if (r1 == 0) goto L_0x0786
            com.obwhatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r13 = r0.A0F
            r13.setVisibility(r4)
            java.lang.Integer r9 = r0.A12
            X.1mI r7 = r0.A0J
            boolean r20 = r0.A09()
            X.1KR r1 = r0.A0Z
            r15 = 0
            r17 = 0
            r16 = r5
            r18 = r9
            r19 = r7
            r21 = r1
            r13.setup(r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x06d7:
            if (r6 == 0) goto L_0x0780
            X.0uf r1 = r0.A0a
            X.0pd r7 = r1.A02
            r1 = 2780(0xadc, float:3.896E-42)
            boolean r1 = r7.A0E(r2, r1)
            if (r1 == 0) goto L_0x0780
            boolean r1 = r6.A00
            if (r1 == 0) goto L_0x0780
            com.obwhatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r13 = r0.A0G
            r13.setVisibility(r4)
            r17 = 1
            java.lang.Integer r7 = r0.A12
            X.1mI r6 = r0.A0J
            boolean r20 = r0.A09()
            X.1KR r1 = r0.A0Z
            r15 = 0
            r16 = r5
            r18 = r7
            r19 = r6
            r21 = r1
            r13.setup(r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0706:
            X.1mD r1 = r0.A0K
            if (r1 == 0) goto L_0x077b
            X.1m8 r1 = r1.A02
            if (r1 == 0) goto L_0x077b
            r1 = 725(0x2d5, float:1.016E-42)
            boolean r1 = r3.A0E(r2, r1)
            if (r1 == 0) goto L_0x077b
            X.1mD r1 = r0.A0K
            X.1m8 r5 = r1.A02
            if (r5 != 0) goto L_0x0770
            r0.A0O = r4
        L_0x071e:
            r0.A0P = r4
        L_0x0720:
            r5 = 1
            com.facebook.redex.IDxSListenerShape417S0100000_2_I0 r1 = new com.facebook.redex.IDxSListenerShape417S0100000_2_I0
            r1.<init>(r0, r5)
            r12.A0M = r1
        L_0x0728:
            X.4TP r5 = r0.A0b
            X.0sH r1 = r0.A0L
            boolean r7 = r5.A01(r1)
            com.obwhatsapp.InfoCard r6 = r0.A05
            r1 = 8
            if (r7 == 0) goto L_0x0737
            r1 = 0
        L_0x0737:
            r6.setVisibility(r1)
            r0.A0N = r7
            r5 = 8
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r1 = new com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0
            r1.<init>(r0, r5)
            r6.setOnClickListener(r1)
            if (r7 == 0) goto L_0x074f
            com.facebook.redex.IDxSListenerShape417S0100000_2_I0 r1 = new com.facebook.redex.IDxSListenerShape417S0100000_2_I0
            r1.<init>(r0, r4)
            r12.A0M = r1
        L_0x074f:
            r1 = 2852(0xb24, float:3.997E-42)
            boolean r1 = r3.A0E(r2, r1)
            if (r1 == 0) goto L_0x09ab
            X.1mD r1 = r0.A0K
            if (r1 == 0) goto L_0x09ab
            java.lang.String r1 = r1.A0C
            boolean r1 = X.AnonymousClass1ZW.A0E(r1)
            if (r1 != 0) goto L_0x09ab
            com.obwhatsapp.WaTextView r1 = r0.A0B
            r1.setVisibility(r4)
            X.1mD r0 = r0.A0K
            java.lang.String r0 = r0.A0C
            r1.setText(r0)
            return
        L_0x0770:
            X.1m9 r1 = r5.A00
            if (r1 != 0) goto L_0x0776
            r0.A0O = r4
        L_0x0776:
            X.1m9 r1 = r5.A01
            if (r1 != 0) goto L_0x0720
            goto L_0x071e
        L_0x077b:
            r0.A0O = r4
            r0.A0P = r4
            goto L_0x0728
        L_0x0780:
            com.obwhatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r1 = r0.A0G
            r1.setVisibility(r8)
            goto L_0x0706
        L_0x0786:
            com.obwhatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r1 = r0.A0F
            r1.setVisibility(r8)
            goto L_0x06d7
        L_0x078d:
            r6 = 2131366775(0x7f0a1377, float:1.8353453E38)
            android.view.View r6 = X.C004601z.A0E(r1, r6)
            com.obwhatsapp.biz.profile.TrustSignalItem r6 = (com.obwhatsapp.biz.profile.TrustSignalItem) r6
            r0.A0H = r6
            r6 = 2131366776(0x7f0a1378, float:1.8353455E38)
            android.view.View r6 = X.C004601z.A0E(r1, r6)
            com.obwhatsapp.biz.profile.TrustSignalItem r6 = (com.obwhatsapp.biz.profile.TrustSignalItem) r6
            r0.A0I = r6
            com.whatsapp.jid.UserJid r6 = r0.A03()
            java.lang.String r23 = X.C16030sJ.A03(r6)
            X.0uf r6 = r0.A0a
            X.0pd r9 = r6.A02
            r6 = 2781(0xadd, float:3.897E-42)
            boolean r6 = r9.A0E(r2, r6)
            if (r6 == 0) goto L_0x083c
            if (r7 == 0) goto L_0x083c
            boolean r6 = r7.A00
            if (r6 == 0) goto L_0x083c
            com.obwhatsapp.biz.profile.TrustSignalItem r6 = r0.A0H
            r6.setVisibility(r8)
        L_0x07c2:
            X.1m9 r6 = r10.A01
            r10 = 2780(0xadc, float:3.896E-42)
            boolean r9 = r9.A0E(r2, r10)
            if (r9 == 0) goto L_0x0807
            if (r6 == 0) goto L_0x0807
            boolean r9 = r6.A00
            if (r9 == 0) goto L_0x0807
            com.obwhatsapp.biz.profile.TrustSignalItem r9 = r0.A0I
            r9.setVisibility(r8)
        L_0x07d7:
            r9 = 2131366777(0x7f0a1379, float:1.8353457E38)
            android.view.View r10 = X.C004601z.A0E(r1, r9)
            com.obwhatsapp.biz.profile.TrustSignalItem r1 = r0.A0H
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x07ef
            com.obwhatsapp.biz.profile.TrustSignalItem r1 = r0.A0I
            int r9 = r1.getVisibility()
            r1 = 0
            if (r9 == 0) goto L_0x07f1
        L_0x07ef:
            r1 = 8
        L_0x07f1:
            r10.setVisibility(r1)
            com.obwhatsapp.biz.profile.TrustSignalItem r1 = r0.A0H
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x0804
            com.obwhatsapp.biz.profile.TrustSignalItem r1 = r0.A0I
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x069f
        L_0x0804:
            r8 = 0
            goto L_0x069f
        L_0x0807:
            X.0zJ r9 = r0.A0R
            r17 = r9
            com.obwhatsapp.biz.profile.TrustSignalItem r10 = r0.A0I
            X.1KR r15 = r0.A0Z
            java.lang.Integer r14 = r0.A12
            X.0sH r9 = r0.A0L
            boolean r24 = r9.A0H()
            X.1mI r11 = r0.A0J
            boolean r25 = r0.A09()
            r10.setUpFromAccount(r6)
            if (r6 == 0) goto L_0x07d7
            int r9 = r10.A00
            android.net.Uri r16 = X.AnonymousClass4Xp.A00(r6, r9)
            X.4kH r9 = new X.4kH
            r20 = r11
            r21 = r6
            r22 = r14
            r18 = r10
            r19 = r15
            r15 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r10.setOnClickListener(r9)
            goto L_0x07d7
        L_0x083c:
            X.0zJ r6 = r0.A0R
            r17 = r6
            com.obwhatsapp.biz.profile.TrustSignalItem r11 = r0.A0H
            X.1KR r6 = r0.A0Z
            r19 = r6
            java.lang.Integer r15 = r0.A12
            X.0sH r6 = r0.A0L
            boolean r24 = r6.A0H()
            X.1mI r14 = r0.A0J
            boolean r25 = r0.A09()
            r11.setUpFromAccount(r7)
            if (r7 == 0) goto L_0x07c2
            int r6 = r11.A00
            android.net.Uri r16 = X.AnonymousClass4Xp.A00(r7, r6)
            X.4kH r6 = new X.4kH
            r20 = r14
            r21 = r7
            r22 = r15
            r15 = r6
            r18 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r11.setOnClickListener(r6)
            goto L_0x07c2
        L_0x0872:
            com.obwhatsapp.WaTextView r6 = r0.A0A
            r5 = 8
            r6.setVisibility(r5)
            goto L_0x067e
        L_0x087b:
            boolean r2 = r3.A0R(r7)
            if (r2 != 0) goto L_0x089a
            java.lang.String r2 = "~"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = r7.A0B()
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r2 = 0
            r5.A0I(r2, r3)
            goto L_0x058d
        L_0x089a:
            r5.setVisibility(r10)
            goto L_0x0590
        L_0x089f:
            X.0tz r2 = r0.A0m
            android.content.Context r3 = r2.A00
            r2 = 2131893040(0x7f121b30, float:1.9420845E38)
            java.lang.String r2 = X.C34811ku.A05(r3, r2)
            goto L_0x058a
        L_0x08ac:
            X.1ko r2 = r7.A0D
            if (r2 == 0) goto L_0x08c5
            boolean r2 = r3.A0R(r7)
            if (r2 != 0) goto L_0x08c5
            r9.A0A()
            r9 = r5
        L_0x08ba:
            r8 = 2131231956(0x7f0804d4, float:1.8080008E38)
            r2 = 2131167239(0x7f070807, float:1.7948746E38)
            r9.A0C(r8, r2)
            goto L_0x055e
        L_0x08c5:
            r5.A0A()
            goto L_0x08ba
        L_0x08c9:
            r5 = 2131099860(0x7f0600d4, float:1.7812085E38)
            r2 = 2131886840(0x7f1202f8, float:1.940827E38)
            java.lang.String r13 = r9.getString(r2)
            r8 = 2131886839(0x7f1202f7, float:1.9408268E38)
            goto L_0x04f5
        L_0x08d8:
            r2 = 11
            int r2 = r8.get(r2)
            int r3 = r2 * 60
            r2 = 12
            int r2 = r8.get(r2)
            int r3 = r3 + r2
            java.util.Iterator r17 = r14.iterator()
            r16 = 1
        L_0x08ed:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x09a3
            java.lang.Object r2 = r17.next()
            X.1ju r2 = (X.C34221ju) r2
            java.lang.Integer r15 = r2.A03
            X.AnonymousClass00B.A06(r15)
            int r15 = r15.intValue()
            java.lang.Integer r2 = r2.A02
            X.AnonymousClass00B.A06(r2)
            int r2 = r2.intValue()
            if (r3 >= r15) goto L_0x092c
            java.util.Calendar r14 = A00(r8, r13, r15)
            r2 = 2131886836(0x7f1202f4, float:1.9408262E38)
            java.lang.String r13 = r9.getString(r2)
            r8 = 2131886835(0x7f1202f3, float:1.940826E38)
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r6] = r13
            r2 = r23
            java.lang.String r2 = X.C47672Jx.A03(r2, r14)
            r3[r12] = r2
            r3[r18] = r19
            goto L_0x04f9
        L_0x092c:
            if (r3 <= r2) goto L_0x0938
            r2 = 2131886834(0x7f1202f2, float:1.9408258E38)
            java.lang.String r20 = r9.getString(r2)
            r16 = 0
            goto L_0x08ed
        L_0x0938:
            java.util.Calendar r5 = A00(r8, r13, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r23
            java.lang.String r3 = X.C47672Jx.A03(r3, r5)
            r2.append(r3)
            int r3 = r14.size()
            if (r3 <= r12) goto L_0x098b
            if (r16 == 0) goto L_0x098b
            r5 = 2131886831(0x7f1202ef, float:1.9408252E38)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.String r15 = " "
            r3[r6] = r15
            java.lang.String r3 = r9.getString(r5, r3)
            r2.append(r3)
            java.lang.Object r3 = r14.get(r12)
            X.1ju r3 = (X.C34221ju) r3
            java.lang.Integer r5 = r3.A03
            X.AnonymousClass00B.A06(r5)
            int r5 = r5.intValue()
            java.util.Calendar r5 = A00(r8, r13, r5)
            java.lang.Integer r3 = r3.A02
            X.AnonymousClass00B.A06(r3)
            int r3 = r3.intValue()
            java.util.Calendar r8 = A00(r8, r13, r3)
            r3 = r23
            java.lang.String r3 = X.C47672Jx.A05(r3, r5, r8)
            r2.append(r3)
        L_0x098b:
            r5 = 2131099860(0x7f0600d4, float:1.7812085E38)
            r3 = 2131886843(0x7f1202fb, float:1.9408276E38)
            java.lang.String r13 = r9.getString(r3)
            r8 = 2131886842(0x7f1202fa, float:1.9408274E38)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r6] = r13
            r3[r12] = r2
            r3[r18] = r19
            goto L_0x04f9
        L_0x09a3:
            r13 = r20
            goto L_0x04fd
        L_0x09a7:
            java.lang.String r19 = ""
            goto L_0x04ce
        L_0x09ab:
            com.obwhatsapp.WaTextView r0 = r0.A0B
            r0.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Xz.A05(X.1mI, X.0sH, X.1k5, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r1 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C49662Uu r15) {
        /*
            r14 = this;
            boolean r0 = r14.A0P
            r5 = 0
            if (r0 != 0) goto L_0x0010
            boolean r0 = r14.A0O
            if (r0 != 0) goto L_0x0010
            boolean r0 = r14.A0N
            if (r0 != 0) goto L_0x0010
            r15.A0M = r5
        L_0x000f:
            return
        L_0x0010:
            X.1mD r0 = r14.A0K
            if (r0 == 0) goto L_0x000f
            X.1m8 r2 = r0.A02
            boolean r1 = r14.A0O
            r0 = 0
            if (r1 == 0) goto L_0x0050
            com.obwhatsapp.biz.profile.TrustSignalItem r1 = r14.A0H
            boolean r1 = A02(r1)
            if (r1 == 0) goto L_0x0050
            if (r2 == 0) goto L_0x00d8
            X.1m9 r1 = r2.A00
            if (r1 == 0) goto L_0x00d8
            int r1 = r1.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L_0x002f:
            X.1KR r4 = r14.A0Z
            com.whatsapp.jid.UserJid r1 = r14.A03()
            java.lang.String r10 = X.C16030sJ.A03(r1)
            java.lang.Integer r8 = r14.A12
            boolean r13 = r14.A09()
            r12 = 1
            java.lang.Integer r6 = X.AnonymousClass1KR.A00(r3)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r11 = 16
            r7 = r5
            r4.A04(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A0O = r0
        L_0x0050:
            boolean r1 = r14.A0P
            if (r1 == 0) goto L_0x008a
            com.obwhatsapp.biz.profile.TrustSignalItem r1 = r14.A0I
            boolean r1 = A02(r1)
            if (r1 == 0) goto L_0x008a
            if (r2 == 0) goto L_0x0068
            X.1m9 r1 = r2.A01
            if (r1 == 0) goto L_0x0068
            int r1 = r1.A01
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
        L_0x0068:
            X.1KR r2 = r14.A0Z
            com.whatsapp.jid.UserJid r1 = r14.A03()
            java.lang.String r8 = X.C16030sJ.A03(r1)
            java.lang.Integer r6 = r14.A12
            boolean r11 = r14.A09()
            r10 = 1
            r3 = 0
            java.lang.Integer r5 = X.AnonymousClass1KR.A00(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r9 = 16
            r4 = r3
            r2.A04(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r14.A0P = r0
        L_0x008a:
            boolean r1 = r14.A0N
            if (r1 == 0) goto L_0x00a9
            com.obwhatsapp.InfoCard r1 = r14.A05
            boolean r1 = A02(r1)
            if (r1 == 0) goto L_0x00a9
            X.1KR r4 = r14.A0Z
            r3 = 14
            X.0sH r1 = r14.A0L
            X.1ko r1 = r1.A0D
            r2 = 0
            if (r1 == 0) goto L_0x00a2
            r2 = 1
        L_0x00a2:
            X.1mI r1 = r14.A0J
            r4.A03(r1, r3, r2)
            r14.A0N = r0
        L_0x00a9:
            boolean r1 = r14.A0O
            if (r1 == 0) goto L_0x00c0
            com.obwhatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r1 = r14.A0F
            boolean r1 = A02(r1)
            if (r1 == 0) goto L_0x00c0
            X.1KR r3 = r14.A0Z
            r2 = 19
            X.1mI r1 = r14.A0J
            r3.A02(r1, r2)
            r14.A0O = r0
        L_0x00c0:
            boolean r1 = r14.A0P
            if (r1 == 0) goto L_0x000f
            com.obwhatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r1 = r14.A0G
            boolean r1 = A02(r1)
            if (r1 == 0) goto L_0x000f
            X.1KR r3 = r14.A0Z
            r2 = 22
            X.1mI r1 = r14.A0J
            r3.A02(r1, r2)
            r14.A0P = r0
            return
        L_0x00d8:
            r3 = r5
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Xz.A06(X.2Uu):void");
    }

    public final void A07(C16010sH r6) {
        if (r6 != null) {
            C15830rv r4 = r6.A0E;
            if (r4 instanceof AnonymousClass1ZX) {
                this.A0v.A05((AnonymousClass1ZX) r4).A0A(this.A0d, new IDxObserverShape115S0100000_2_I0((Object) this, 31));
                this.A0i.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 5, r4));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r5.A01(r1) != false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(com.whatsapp.jid.UserJid r13, boolean r14) {
        /*
            r12 = this;
            X.1mD r0 = r12.A0K
            r3 = 8
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.A0N
            if (r0 == 0) goto L_0x0026
            X.0pd r2 = r12.A0p
            r1 = 957(0x3bd, float:1.341E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0026
        L_0x0016:
            com.obwhatsapp.biz.catalog.view.CatalogMediaCard r0 = r12.A0E
            r0.setVisibility(r3)
            android.view.View r6 = r12.A03
        L_0x001d:
            r6.setVisibility(r3)
            com.obwhatsapp.InfoCard r0 = r12.A06
            r0.setVisibility(r3)
        L_0x0025:
            return
        L_0x0026:
            com.obwhatsapp.biz.catalog.view.CatalogMediaCard r6 = r12.A0E
            X.4vq r0 = new X.4vq
            r0.<init>(r12)
            r6.A0B = r0
            X.1Kz r5 = r12.A0V
            X.1mD r4 = r12.A0K
            X.0pd r2 = r5.A01
            r0 = 355(0x163, float:4.97E-43)
            X.0tM r1 = X.C16620tM.A02
            boolean r0 = r2.A0E(r1, r0)
            if (r0 == 0) goto L_0x0070
            r0 = 636(0x27c, float:8.91E-43)
            boolean r0 = r2.A0E(r1, r0)
            if (r0 == 0) goto L_0x0070
        L_0x0047:
            android.view.View r1 = r12.A03
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0052
            r1.setVisibility(r3)
        L_0x0052:
            X.1mD r1 = r12.A0K
            boolean r0 = r1.A0L
            if (r0 != 0) goto L_0x005e
            boolean r0 = r5.A01(r1)
            if (r0 == 0) goto L_0x001d
        L_0x005e:
            r11 = 0
            r6.setVisibility(r11)
            com.obwhatsapp.InfoCard r0 = r12.A06
            r0.setVisibility(r11)
            r9 = 0
            X.1mD r7 = r12.A0K
            r8 = r13
            r10 = r14
            r6.A02(r7, r8, r9, r10, r11)
            return
        L_0x0070:
            boolean r0 = r5.A00(r4)
            if (r0 == 0) goto L_0x0047
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x007f
            r6.setVisibility(r3)
        L_0x007f:
            X.1mD r2 = r12.A0K
            android.view.View r0 = r12.A03
            r1 = 0
            r0.setVisibility(r1)
            com.obwhatsapp.InfoCard r0 = r12.A06
            r0.setVisibility(r1)
            com.obwhatsapp.chatinfo.ContactInfoActivity r0 = r12.A0d
            X.02C r4 = r0.AGM()
            java.lang.String r3 = "shops_product_frag"
            X.01A r0 = r4.A0B(r3)
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = r2.A0D
            X.AnonymousClass00B.A06(r0)
            com.obwhatsapp.shops.ShopsProductPreviewFragment r2 = com.obwhatsapp.shops.ShopsProductPreviewFragment.A01(r0)
            X.050 r1 = new X.050
            r1.<init>(r4)
            r0 = 2131366245(0x7f0a1165, float:1.8352378E38)
            r1.A0D(r2, r3, r0)
            r1.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Xz.A08(com.whatsapp.jid.UserJid, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09() {
        /*
            r2 = this;
            X.1mD r0 = r2.A0K
            if (r0 == 0) goto L_0x0011
            X.1mA r0 = r0.A01
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.A00
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Xz.A09():boolean");
    }

    public boolean A0A() {
        C35561m8 r1;
        C35611mD r0 = this.A0K;
        if (r0 == null || (r1 = r0.A02) == null) {
            return false;
        }
        return (r1.A00 == null && r1.A01 == null) ? false : true;
    }

    public void ARp() {
        ContactInfoActivity contactInfoActivity = this.A0d;
        contactInfoActivity.Ac1();
        contactInfoActivity.A1D.A05("profile_view_tag", false);
    }

    public void ARq() {
        ContactInfoActivity contactInfoActivity = this.A0d;
        contactInfoActivity.Ac1();
        contactInfoActivity.A1D.A05("profile_view_tag", true);
    }
}
