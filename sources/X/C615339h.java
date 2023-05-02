package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import com.obwhatsapp.CircleWaImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView;
import com.obwhatsapp.youbasha.ui.activity.CallsPrivacy;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.39h  reason: invalid class name and case insensitive filesystem */
public class C615339h {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public CircleWaImageView A05;
    public C16040sK A06;
    public TextEmojiLabel A07;
    public WaImageButton A08;
    public WaImageView A09;
    public WaTextView A0A;
    public WaTextView A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public C17180uf A0G;
    public C19860z7 A0H;
    public C19840z5 A0I;
    public C25661Kq A0J;
    public DirectoryProductImagesCardView A0K;
    public AnonymousClass152 A0L;
    public C16980tz A0M;
    public AnonymousClass013 A0N;
    public C16320sq A0O;
    public final Handler A0P = new Handler();

    public C615339h(C16040sK r2, C17180uf r3, C19860z7 r4, C19840z5 r5, C25661Kq r6, AnonymousClass152 r7, C16980tz r8, AnonymousClass013 r9, C16320sq r10) {
        this.A0M = r8;
        this.A06 = r2;
        this.A0O = r10;
        this.A0J = r6;
        this.A0N = r9;
        this.A0G = r3;
        this.A0I = r5;
        this.A0H = r4;
        this.A0L = r7;
    }

    public final Integer A00(C72243ln r5) {
        int i2;
        if (!r5.A0A) {
            return null;
        }
        if (r5.A08.A0K) {
            LinearLayout linearLayout = this.A0K.A01;
            C18450wi.A0H(linearLayout, 0);
            AnonymousClass22L r2 = new AnonymousClass22L(new AnonymousClass22K(new AnonymousClass5FS(), new C11020i4(linearLayout), true));
            while (true) {
                if (r2.hasNext()) {
                    if (C13680ns.A0K((View) r2.next(), R.id.product_image_view).getDrawable() != null) {
                        i2 = 3;
                        break;
                    }
                } else {
                    LinearLayout linearLayout2 = this.A0K.A01;
                    C18450wi.A0H(linearLayout2, 0);
                    AnonymousClass22L r22 = new AnonymousClass22L(new AnonymousClass22K(new AnonymousClass5FS(), new C11020i4(linearLayout2), true));
                    while (true) {
                        if (r22.hasNext()) {
                            if (C13680ns.A0K((View) r22.next(), R.id.product_empty_view).getDrawable().isVisible()) {
                                i2 = 2;
                                break;
                            }
                        } else {
                            i2 = 1;
                            break;
                        }
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }

    public final void A01(Context context, View view, WaTextView waTextView, Integer num, int i2, int i3) {
        String string;
        String valueOf;
        if (num != null) {
            int i4 = 0;
            view.setVisibility(0);
            int intValue = num.intValue();
            if (intValue > 0) {
                AnonymousClass013 r1 = this.A0N;
                if (intValue < 10000) {
                    Locale A0m = C13690nt.A0m(r1);
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1M(objArr, intValue, 0);
                    valueOf = String.format(A0m, "%,d", objArr);
                } else {
                    double d2 = (double) intValue;
                    int log = (int) (Math.log(d2) / Math.log(1000.0d));
                    double pow = Math.pow(1000.0d, (double) log);
                    double d3 = d2 / pow;
                    int i5 = intValue / ((int) pow);
                    if (d3 == ((double) i5) || ((int) (d3 * 10.0d)) % 10 == 0) {
                        valueOf = String.valueOf(i5);
                    } else {
                        NumberFormat instance = DecimalFormat.getInstance();
                        instance.setMinimumFractionDigits(1);
                        instance.setMaximumFractionDigits(1);
                        instance.setRoundingMode(RoundingMode.DOWN);
                        valueOf = instance.format(d3);
                    }
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("KMB".charAt(log - 1));
                    String obj = A0o.toString();
                    if (obj != null) {
                        switch (obj.hashCode()) {
                            case 66:
                                if (obj.equals("B")) {
                                    i4 = R.string.str053e;
                                    break;
                                }
                                break;
                            case 75:
                                if (obj.equals("K")) {
                                    i4 = R.string.str053f;
                                    break;
                                }
                                break;
                            case CallsPrivacy.NOINTERNET_CALLING /*77*/:
                                if (obj.equals("M")) {
                                    i4 = R.string.str0540;
                                    break;
                                }
                                break;
                        }
                        valueOf = AnonymousClass000.A0h(context.getString(i4), AnonymousClass000.A0q(valueOf));
                    }
                }
                string = context.getResources().getQuantityString(i2, intValue, new Object[]{valueOf});
            } else {
                string = context.getResources().getString(i3);
            }
            waTextView.setText(string);
            return;
        }
        view.setVisibility(8);
    }

    public void A02(View view) {
        this.A03 = view;
        this.A05 = (CircleWaImageView) C004601z.A0E(view, R.id.business_avatar);
        this.A07 = C13680ns.A0Q(view, R.id.business_name);
        this.A0F = C13680ns.A0S(view, R.id.open_status);
        this.A0B = C13680ns.A0S(view, R.id.category);
        this.A0A = C13680ns.A0S(view, R.id.address);
        this.A0C = C13680ns.A0S(view, R.id.distance);
        this.A09 = C13690nt.A0R(view, R.id.dot_divider);
        this.A08 = (WaImageButton) C004601z.A0E(view, R.id.message_btn);
        this.A0D = C13680ns.A0S(view, R.id.fb_likes);
        this.A0E = C13680ns.A0S(view, R.id.ig_followers);
        this.A01 = C004601z.A0E(view, R.id.fb_layout);
        this.A02 = C004601z.A0E(view, R.id.ig_layout);
        this.A00 = C004601z.A0E(view, R.id.fb_ig_layout);
        this.A04 = C004601z.A0E(view, R.id.responiveness_signal);
        this.A0K = (DirectoryProductImagesCardView) C004601z.A0E(view, R.id.product_images_preview);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0119, code lost:
        if (r11 == false) goto L_0x011b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C72243ln r27) {
        /*
            r26 = this;
            r3 = r26
            android.view.View r0 = r3.A03
            android.content.Context r2 = r0.getContext()
            android.view.View r0 = r3.A03
            r25 = r0
            r7 = r27
            boolean r0 = r7.A0A
            r5 = 8
            if (r0 == 0) goto L_0x03c8
            X.1US r4 = r7.A08
            boolean r0 = r4.A0K
            r10 = 0
            if (r0 == 0) goto L_0x02f7
            int r1 = r4.A01
            if (r1 != 0) goto L_0x02ec
            com.obwhatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r0 = r3.A0K
            r0.A00(r10)
        L_0x0024:
            com.obwhatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r0 = r3.A0K
            r0.setVisibility(r10)
        L_0x0029:
            com.obwhatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r4 = r3.A0K
            r1 = 6
            r0 = r25
            X.C13690nt.A1B(r4, r3, r7, r0, r1)
            X.0z7 r1 = r3.A0H
            int r0 = r7.A03
            r1.A00 = r0
            java.lang.String r0 = r7.A00
            r1.A09 = r0
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x02a8
            X.0sK r1 = r3.A06
            X.1US r0 = r7.A08
            java.lang.String r0 = r0.A0B
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r0)
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x02a8
            android.view.View r0 = r3.A03
            android.content.Context r5 = r0.getContext()
            com.obwhatsapp.CircleWaImageView r4 = r3.A05
            X.0sq r1 = r3.A0O
            r0 = 13
            X.C13700nu.A0X(r1, r3, r5, r4, r0)
        L_0x005e:
            com.obwhatsapp.TextEmojiLabel r1 = r3.A07
            X.1US r6 = r7.A08
            java.lang.String r0 = r6.A0E
            r1.setText(r0)
            int r1 = r6.A06
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)
            com.obwhatsapp.TextEmojiLabel r4 = r3.A07
            if (r0 == 0) goto L_0x02a3
            r1 = 2131231956(0x7f0804d4, float:1.8080008E38)
            r0 = 2131166397(0x7f0704bd, float:1.7947038E38)
            r4.A0C(r1, r0)
        L_0x007b:
            int r9 = r6.A05
            java.lang.String r10 = X.C61853Aq.A01(r2, r9)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            r5 = 8
            r4 = 0
            com.obwhatsapp.WaTextView r0 = r3.A0F
            if (r1 == 0) goto L_0x0286
            r0.setVisibility(r5)
        L_0x008f:
            java.util.List r8 = r6.A0H
            boolean r0 = r8.isEmpty()
            com.obwhatsapp.WaTextView r1 = r3.A0B
            if (r0 != 0) goto L_0x0281
            java.lang.String r0 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r0, r8)
            r1.setText(r0)
            com.obwhatsapp.WaTextView r0 = r3.A0B
            r0.setVisibility(r4)
        L_0x00a7:
            java.lang.String r8 = r6.A0A
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x00b9
            java.util.List r0 = r6.A0G
            java.lang.Object r0 = r0.get(r4)
            X.1mC r0 = (X.C35601mC) r0
            java.lang.String r8 = r0.A03
        L_0x00b9:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            com.obwhatsapp.WaTextView r0 = r3.A0A
            if (r1 == 0) goto L_0x0277
            r0.setVisibility(r5)
        L_0x00c4:
            boolean r11 = r7.A09
            if (r11 == 0) goto L_0x0270
            com.google.android.gms.maps.model.LatLng r13 = r7.A04
            java.lang.Double r0 = r6.A08
            double r8 = r0.doubleValue()
            java.lang.Double r0 = r6.A09
            double r0 = r0.doubleValue()
            com.google.android.gms.maps.model.LatLng r12 = new com.google.android.gms.maps.model.LatLng
            r12.<init>(r8, r0)
            float r12 = X.C61853Aq.A00(r13, r12)
            com.obwhatsapp.WaTextView r9 = r3.A0C
            X.013 r0 = r3.A0N
            java.util.Locale r0 = X.C13690nt.A0m(r0)
            boolean r0 = X.AnonymousClass2RK.A03(r0)
            if (r0 == 0) goto L_0x0220
            r0 = 1066108191(0x3f8b851f, float:1.09)
            float r12 = r12 * r0
            int r8 = java.lang.Math.round(r12)
            float r1 = (float) r8
            r0 = 1155268608(0x44dc0000, float:1760.0)
            float r1 = r1 / r0
            r12 = 1
            r0 = 325(0x145, float:4.55E-43)
            if (r8 >= r0) goto L_0x01ff
            r1 = 2131886595(0x7f120203, float:1.9407773E38)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            X.AnonymousClass000.A1M(r0, r8, r4)
            java.lang.String r0 = r2.getString(r1, r0)
        L_0x010a:
            r9.setText(r0)
            com.obwhatsapp.WaTextView r0 = r3.A0C
            r0.setVisibility(r4)
        L_0x0112:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x011b
            r0 = 1
            if (r11 != 0) goto L_0x011c
        L_0x011b:
            r0 = 0
        L_0x011c:
            com.obwhatsapp.WaImageView r1 = r3.A09
            int r0 = X.C13690nt.A07(r0)
            r1.setVisibility(r0)
            com.obwhatsapp.WaImageButton r1 = r3.A08
            r0 = 13
            X.C13680ns.A1B(r1, r3, r7, r0)
            X.0sK r9 = r3.A06
            java.lang.String r8 = r6.A0B
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r8)
            boolean r0 = r9.A0I(r0)
            com.obwhatsapp.WaImageButton r1 = r3.A08
            r0 = r0 ^ 1
            r1.setEnabled(r0)
            android.view.View r1 = r3.A03
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r8)
            boolean r0 = r9.A0I(r0)
            r0 = r0 ^ 1
            r1.setEnabled(r0)
            android.view.View r1 = r3.A03
            r0 = 14
            X.C13680ns.A1B(r1, r3, r7, r0)
            android.view.View r0 = r3.A00
            r0.setVisibility(r5)
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x03cf
            X.0uf r0 = r3.A0G
            X.0pd r7 = r0.A02
            r0 = 450(0x1c2, float:6.3E-43)
            X.0tM r1 = X.C16620tM.A02
            boolean r0 = r7.A0E(r1, r0)
            if (r0 == 0) goto L_0x01e1
            r0 = 1564(0x61c, float:2.192E-42)
            boolean r0 = r7.A0E(r1, r0)
            if (r0 == 0) goto L_0x01e1
            java.util.List r11 = r6.A0J
            java.util.Iterator r10 = r11.iterator()
        L_0x017a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r9 = r10.next()
            X.1m9 r9 = (X.C35571m9) r9
            java.lang.String r8 = r9.A02
            java.lang.String r0 = "facebook"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x017a
            int r0 = r9.A01
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
        L_0x0196:
            java.util.Iterator r10 = r11.iterator()
        L_0x019a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r9 = r10.next()
            X.1m9 r9 = (X.C35571m9) r9
            java.lang.String r8 = r9.A02
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x019a
            int r0 = r9.A01
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
        L_0x01b6:
            if (r12 != 0) goto L_0x01ba
            if (r15 == 0) goto L_0x01bf
        L_0x01ba:
            android.view.View r0 = r3.A00
            r0.setVisibility(r4)
        L_0x01bf:
            r13 = 2131755014(0x7f100006, float:1.9140895E38)
            r14 = 2131888305(0x7f1208b1, float:1.9411242E38)
            com.obwhatsapp.WaTextView r8 = r3.A0D
            android.view.View r0 = r3.A01
            r9 = r2
            r10 = r0
            r11 = r8
            r8 = r3
            r8.A01(r9, r10, r11, r12, r13, r14)
            r16 = 2131755015(0x7f100007, float:1.9140897E38)
            r17 = 2131889028(0x7f120b84, float:1.9412708E38)
            com.obwhatsapp.WaTextView r8 = r3.A0E
            android.view.View r0 = r3.A02
            r11 = r3
            r12 = r2
            r13 = r0
            r14 = r8
            r11.A01(r12, r13, r14, r15, r16, r17)
        L_0x01e1:
            r0 = 450(0x1c2, float:6.3E-43)
            boolean r0 = r7.A0E(r1, r0)
            if (r0 == 0) goto L_0x03cf
            r0 = 1696(0x6a0, float:2.377E-42)
            boolean r0 = r7.A0E(r1, r0)
            if (r0 == 0) goto L_0x03cf
            boolean r0 = r6.A0L
            if (r0 == 0) goto L_0x03cf
            android.view.View r0 = r3.A04
            r0.setVisibility(r4)
            return
        L_0x01fb:
            r15 = 0
            goto L_0x01b6
        L_0x01fd:
            r12 = 0
            goto L_0x0196
        L_0x01ff:
            r0 = 1148846080(0x447a0000, float:1000.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            java.text.DecimalFormat r8 = new java.text.DecimalFormat
            if (r0 >= 0) goto L_0x021a
            r8.<init>()
            java.lang.String r0 = "0.#"
        L_0x020c:
            r8.applyPattern(r0)
            r13 = 2131886594(0x7f120202, float:1.9407771E38)
            java.lang.Object[] r12 = new java.lang.Object[r12]
            double r0 = (double) r1
            java.lang.String r0 = r8.format(r0)
            goto L_0x0257
        L_0x021a:
            r8.<init>()
            java.lang.String r0 = "#,###"
            goto L_0x020c
        L_0x0220:
            r1 = 1148846080(0x447a0000, float:1000.0)
            r14 = 1
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0239
            r8 = 2131886593(0x7f120201, float:1.940777E38)
            java.lang.Object[] r1 = new java.lang.Object[r14]
            int r0 = java.lang.Math.round(r12)
            X.AnonymousClass000.A1M(r1, r0, r4)
            java.lang.String r0 = r2.getString(r8, r1)
            goto L_0x010a
        L_0x0239:
            r0 = 1176256512(0x461c4000, float:10000.0)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            float r12 = r12 / r1
            if (r0 >= 0) goto L_0x025d
            double r0 = (double) r12
            r13 = 2131886592(0x7f120200, float:1.9407767E38)
            java.lang.Object[] r12 = new java.lang.Object[r14]
            java.util.Locale r8 = java.util.Locale.US
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r14[r4] = r0
            java.lang.String r0 = "%.1f"
            java.lang.String r0 = java.lang.String.format(r8, r0, r14)
        L_0x0257:
            java.lang.String r0 = X.C13680ns.A0d(r2, r0, r12, r4, r13)
            goto L_0x010a
        L_0x025d:
            int r0 = java.lang.Math.round(r12)
            r8 = 2131886592(0x7f120200, float:1.9407767E38)
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = X.C13680ns.A0d(r2, r0, r1, r4, r8)
            goto L_0x010a
        L_0x0270:
            com.obwhatsapp.WaTextView r0 = r3.A0C
            r0.setVisibility(r5)
            goto L_0x0112
        L_0x0277:
            r0.setText(r8)
            com.obwhatsapp.WaTextView r0 = r3.A0A
            r0.setVisibility(r4)
            goto L_0x00c4
        L_0x0281:
            r1.setVisibility(r5)
            goto L_0x00a7
        L_0x0286:
            r0.setText(r10)
            com.obwhatsapp.WaTextView r8 = r3.A0F
            r1 = 2131099859(0x7f0600d3, float:1.7812083E38)
            if (r9 == 0) goto L_0x0299
            r0 = 1
            r1 = 2131099860(0x7f0600d4, float:1.7812085E38)
            if (r9 == r0) goto L_0x0299
            r1 = 2131100933(0x7f060505, float:1.7814261E38)
        L_0x0299:
            X.C13680ns.A0v(r2, r8, r1)
            com.obwhatsapp.WaTextView r0 = r3.A0F
            r0.setVisibility(r4)
            goto L_0x008f
        L_0x02a3:
            r4.A0A()
            goto L_0x007b
        L_0x02a8:
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x02e2
            X.1US r0 = r7.A08
            java.lang.String r13 = r0.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x02e2
            X.1Kq r5 = r3.A0J
            com.obwhatsapp.CircleWaImageView r11 = r3.A05
            android.content.Context r1 = r11.getContext()
            r0 = 2131230908(0x7f0800bc, float:1.8077882E38)
            android.graphics.drawable.Drawable r9 = X.AnonymousClass00T.A04(r1, r0)
            X.0pd r4 = r5.A00
            r1 = 2185(0x889, float:3.062E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r4.A0E(r0, r1)
            if (r0 == 0) goto L_0x02d9
            r1 = 2131364918(0x7f0a0c36, float:1.8349687E38)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r11.setTag(r1, r0)
        L_0x02d9:
            X.1qk r8 = r5.A01
            r12 = 0
            r10 = r9
            r8.A00(r9, r10, r11, r12, r13)
            goto L_0x005e
        L_0x02e2:
            com.obwhatsapp.CircleWaImageView r1 = r3.A05
            r0 = 2131230908(0x7f0800bc, float:1.8077882E38)
            r1.setImageResource(r0)
            goto L_0x005e
        L_0x02ec:
            r0 = 2
            if (r1 != r0) goto L_0x02f7
            com.obwhatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r1 = r3.A0K
            r0 = 1
            r1.A00(r0)
            goto L_0x0024
        L_0x02f7:
            java.util.List r0 = r4.A04
            if (r0 == 0) goto L_0x03c8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x03c8
            com.obwhatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r9 = r3.A0K
            java.util.List r8 = r4.A04
            X.1Kq r6 = r3.A0J
            X.C18450wi.A0H(r8, r10)
            r0 = 1
            X.C18450wi.A0H(r6, r0)
            android.view.LayoutInflater r18 = X.C13680ns.A0G(r9)
            com.facebook.shimmer.ShimmerFrameLayout r1 = r9.A00
            if (r1 == 0) goto L_0x031a
            r0 = 0
            r1.A04(r0)
        L_0x031a:
            android.widget.LinearLayout r11 = r9.A01
            r11.removeAllViews()
            r0 = 3
            java.util.List r0 = X.C003101j.A0C(r8, r0)
            r4 = 0
            java.util.Iterator r17 = r0.iterator()
        L_0x0329:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r12 = r17.next()
            int r16 = r4 + 1
            if (r4 >= 0) goto L_0x033f
            X.AnonymousClass1JA.A0T()
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()
            throw r0
        L_0x033f:
            java.lang.String r12 = (java.lang.String) r12
            X.C18450wi.A0B(r18)
            r1 = 2131558601(0x7f0d00c9, float:1.8742522E38)
            r0 = r18
            android.view.View r13 = r0.inflate(r1, r9, r10)
            r5 = -1
            r1 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r5, r5, r1)
            r13.setLayoutParams(r0)
            com.facebook.shimmer.ShimmerFrameLayout r13 = (com.facebook.shimmer.ShimmerFrameLayout) r13
            r0 = 2131365502(0x7f0a0e7e, float:1.8350871E38)
            android.widget.ImageView r5 = X.C13680ns.A0K(r13, r0)
            r0 = 2131365499(0x7f0a0e7b, float:1.8350865E38)
            android.view.View r14 = r13.findViewById(r0)
            com.obwhatsapp.WaImageView r14 = (com.obwhatsapp.WaImageView) r14
            r0 = 8
            r14.setVisibility(r0)
            X.0pd r15 = r6.A00
            r1 = 2185(0x889, float:3.062E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r15.A0E(r0, r1)
            if (r0 == 0) goto L_0x0383
            r1 = 2131364918(0x7f0a0c36, float:1.8349687E38)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.setTag(r1, r0)
        L_0x0383:
            X.1qk r1 = r6.A01
            X.52L r0 = new X.52L
            r0.<init>(r13, r14, r6)
            r20 = 0
            r19 = r1
            r21 = r20
            r22 = r5
            r23 = r0
            r24 = r12
            r19.A00(r20, r21, r22, r23, r24)
            r11.addView(r13)
            int r0 = r8.size()
            int r0 = r0 + -1
            if (r4 == r0) goto L_0x03c4
            android.content.Context r0 = r9.getContext()
            android.view.View r5 = new android.view.View
            r5.<init>(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165944(0x7f0702f8, float:1.794612E38)
            int r4 = r1.getDimensionPixelSize(r0)
            r1 = -1
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r4, r1)
            r5.setLayoutParams(r0)
            r11.addView(r5)
        L_0x03c4:
            r4 = r16
            goto L_0x0329
        L_0x03c8:
            com.obwhatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r0 = r3.A0K
            r0.setVisibility(r5)
            goto L_0x0029
        L_0x03cf:
            android.view.View r0 = r3.A04
            r0.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C615339h.A03(X.3ln):void");
    }
}
