package com.obwhatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass174;
import X.AnonymousClass1ME;
import X.AnonymousClass2SR;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C15810rt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C16040sK;
import X.C16070sO;
import X.C16150sX;
import X.C17120uZ;
import X.C18090w8;
import X.C218315p;
import X.C30681cm;
import X.C52652eD;
import X.C52662eE;
import X.C55472jf;
import X.C73643od;
import X.C87594Xo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.text.CondensedTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ConversationAttachmentContentView extends ScrollView implements AnonymousClass006 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public LinearLayout A09;
    public C16040sK A0A;
    public C15900s5 A0B;
    public AnonymousClass1ME A0C;
    public C55472jf A0D;
    public AnonymousClass01V A0E;
    public C17120uZ A0F;
    public C15860rz A0G;
    public C15810rt A0H;
    public C16070sO A0I;
    public C14710pd A0J;
    public C15830rv A0K;
    public AnonymousClass174 A0L;
    public C18090w8 A0M;
    public C218315p A0N;
    public C52662eE A0O;
    public boolean A0P;
    public boolean A0Q;
    public final LinkedHashMap A0R;

    public ConversationAttachmentContentView(Context context) {
        super(context);
        A05();
        this.A0R = new LinkedHashMap();
        A06();
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        this.A0R = new LinkedHashMap();
        A06();
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A05();
        this.A0R = new LinkedHashMap();
        A06();
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A05();
        this.A0R = new LinkedHashMap();
        A06();
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A05();
    }

    private String getCommerceAttachmentType() {
        return "product";
    }

    private Drawable getCurrencyDrawable() {
        C30681cm A012 = this.A0L.A01();
        C218315p r0 = this.A0N;
        Context context = getContext();
        int A0A2 = r0.A0A(A012);
        if (A0A2 != 0) {
            return AnonymousClass00T.A04(context, A0A2);
        }
        return null;
    }

    private int getIconSize() {
        return getResources().getDimensionPixelSize(R.dimen.dimen066b);
    }

    private int getIconTextViewHeight() {
        CondensedTextView condensedTextView = new CondensedTextView(getContext(), (AttributeSet) null, R.style.style0014);
        condensedTextView.measure(View.MeasureSpec.makeMeasureSpec(C13690nt.A0H(this).widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return condensedTextView.getMeasuredHeight();
    }

    private int getMaxMarginSize() {
        return (getResources().getDimensionPixelSize(R.dimen.dimen0074) << 1) + getResources().getDimensionPixelSize(R.dimen.dimen0073);
    }

    private int getMinMarginSize() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0075);
        getResources().getDimensionPixelSize(R.dimen.dimen0074);
        return (dimensionPixelSize << 1) + getResources().getDimensionPixelSize(R.dimen.dimen0073);
    }

    private int getNumberOfColumns() {
        Point A012 = C87594Xo.A01(AnonymousClass01V.A02(getContext()));
        return Math.min(4, Math.max(3, (A012.x - getMinMarginSize()) / getIconSize()));
    }

    public int A00(View view) {
        Point A012 = C87594Xo.A01(AnonymousClass01V.A02(getContext()));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return Math.max(getMaxMarginSize() + (getIconSize() * getNumberOfColumns()), ((iArr[0] + (view.getWidth() / 2)) - (A012.x / 2)) << 1);
    }

    public int A01(View view) {
        int ceil = (int) Math.ceil(((double) A03().size()) / ((double) getNumberOfColumns()));
        int A002 = ((this.A02 + this.A01 + this.A04 + this.A05) * ceil) + ((ceil - 1) * this.A03) + (this.A00 << 1) + C87594Xo.A00(getContext(), 1.0f);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int measuredHeight = (iArr[1] - view.getMeasuredHeight()) - getResources().getDimensionPixelSize(R.dimen.dimen0079);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new TypedValue().data, new int[]{16843499});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        int i2 = measuredHeight - dimensionPixelSize;
        return (i2 >= A002 || A002 - (this.A02 / 2) <= i2) ? A002 : i2;
    }

    public final View A02(Drawable drawable, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, LinearLayout linearLayout, int i2, int i3, int i4, int i5, boolean z2) {
        int i6;
        Drawable A032;
        View A0H2 = C13680ns.A0H(C13680ns.A0G(this), linearLayout, R.layout.layout0158);
        ImageView A0J2 = C13680ns.A0J(A0H2, R.id.icon);
        TextView A0L2 = C13680ns.A0L(A0H2, R.id.text);
        if (z2) {
            i6 = getResources().getDimensionPixelSize(R.dimen.dimen0077);
        } else {
            i6 = 0;
            z2 = false;
        }
        int A002 = AnonymousClass00T.A00(getContext(), i2);
        int A003 = AnonymousClass00T.A00(getContext(), i3);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A002, A003});
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(2);
        gradientDrawable.setGradientCenter(-1.0f, 0.5f);
        if (i6 > 0) {
            gradientDrawable.setSize(i6, i6);
        }
        if (!z2 || Build.VERSION.SDK_INT < 23) {
            A032 = AnonymousClass2SR.A03(getContext(), gradientDrawable);
        } else {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.getPaint().setColor(A003);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, shapeDrawable});
            int i7 = i6 >> 2;
            layerDrawable.setLayerSize(1, i7, i7);
            layerDrawable.setLayerGravity(1, 17);
            A032 = AnonymousClass2SR.A03(getContext(), layerDrawable);
        }
        A0J2.setBackgroundDrawable(A032);
        A0J2.setImageDrawable(drawable);
        C004601z.A0d(A0J2, 2);
        A0L2.setText(i4);
        A0H2.setId(i5);
        A0J2.setOnClickListener(onClickListener);
        A0H2.setOnClickListener(onClickListener);
        if (onLongClickListener != null) {
            A0J2.setOnLongClickListener(onLongClickListener);
            A0H2.setOnLongClickListener(onLongClickListener);
        }
        return A0H2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        if (r5.A0J.A0E(r3, 2663) != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        if (r5.A0J.A0E(r3, 2194) != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r5.A0A.A0G() != false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A03() {
        /*
            r5 = this;
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            X.15p r1 = r5.A0N
            X.0rv r0 = r5.A0K
            int r0 = r1.A0B(r0)
            r5.A06 = r0
            X.15p r4 = r5.A0N
            android.content.Context r3 = r5.getContext()
            int r1 = r5.A06
            X.0rv r0 = r5.A0K
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            boolean r0 = r4.A0a(r3, r0, r1)
            if (r0 == 0) goto L_0x002b
            X.0sK r0 = r5.A0A
            boolean r0 = r0.A0G()
            r4 = 1
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            r4 = 0
        L_0x002c:
            X.0pd r1 = r5.A0J
            r0 = 1394(0x572, float:1.953E-42)
            X.0tM r3 = X.C16620tM.A02
            boolean r0 = r1.A0E(r3, r0)
            if (r0 == 0) goto L_0x00aa
            X.0rv r1 = r5.A0K
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 == 0) goto L_0x0083
            X.0rt r0 = r5.A0H
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r1 = r0.A02(r1)
            r0 = 3
            if (r1 != r0) goto L_0x0055
            X.0pd r1 = r5.A0J
            r0 = 2738(0xab2, float:3.837E-42)
            boolean r0 = r1.A0E(r3, r0)
            if (r0 == 0) goto L_0x0083
        L_0x0055:
            r1 = 1
        L_0x0056:
            java.lang.String r0 = "document"
            r2.add(r0)
            java.lang.String r0 = "camera"
            r2.add(r0)
            java.lang.String r0 = "gallery"
            r2.add(r0)
            java.lang.String r0 = "audio"
            r2.add(r0)
            java.lang.String r0 = "location"
            r2.add(r0)
            if (r4 == 0) goto L_0x0076
            java.lang.String r0 = "payment"
            r2.add(r0)
        L_0x0076:
            java.lang.String r0 = "contact"
            r2.add(r0)
            if (r1 == 0) goto L_0x0082
            java.lang.String r0 = "poll"
            r2.add(r0)
        L_0x0082:
            return r2
        L_0x0083:
            X.0rv r1 = r5.A0K
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 != 0) goto L_0x00aa
            boolean r0 = X.C16030sJ.A0G(r1)
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r5.A0Q
            if (r0 == 0) goto L_0x009f
            X.0pd r1 = r5.A0J
            r0 = 2663(0xa67, float:3.732E-42)
            boolean r0 = r1.A0E(r3, r0)
            if (r0 == 0) goto L_0x00aa
        L_0x009f:
            X.0pd r1 = r5.A0J
            r0 = 2194(0x892, float:3.074E-42)
            boolean r0 = r1.A0E(r3, r0)
            if (r0 == 0) goto L_0x00aa
            goto L_0x0055
        L_0x00aa:
            r1 = 0
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.ConversationAttachmentContentView.A03():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0076, code lost:
        X.AnonymousClass00B.A08(X.C13680ns.A0h("ConversationAttachmentContentHelper Icon not mapped properly ", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ff, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0121, code lost:
        if (r0.equals(r3) != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0164, code lost:
        if (r3 == 4) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016e, code lost:
        if (r3 == 4) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0193, code lost:
        if (r0.equals(r3) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0199, code lost:
        throw X.C13680ns.A0m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b1, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b2, code lost:
        r7 = A02(X.C13680ns.A0D(r14).getDrawable(r6), r4, r7, r1, r19, r20, r21, r22, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c6, code lost:
        if (r10 == false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c8, code lost:
        r6 = r14.A09;
        r5 = r14.A03;
        r3 = new X.C73643od(getContext(), r14);
        r3.A00 = r5;
        r6.addView(r3);
        r14.A09.addView(r1);
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e0, code lost:
        r2.put(r0, r7);
        r1.addView(r7);
        r11 = r11 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r24 = this;
            r14 = r24
            android.widget.LinearLayout r0 = r14.A09
            r0.removeAllViews()
            java.util.LinkedHashMap r2 = r14.A0R
            r2.clear()
            android.widget.LinearLayout r4 = r14.A09
            int r3 = r14.A00
            android.content.Context r1 = r14.getContext()
            X.3od r0 = new X.3od
            r0.<init>(r1, r14)
            r0.A00 = r3
            r4.addView(r0)
            android.view.LayoutInflater r3 = X.C13680ns.A0G(r14)
            r1 = 2131558743(0x7f0d0157, float:1.874281E38)
            android.widget.LinearLayout r0 = r14.A09
            android.view.View r1 = X.C13680ns.A0H(r3, r0, r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.widget.LinearLayout r0 = r14.A09
            r0.addView(r1)
            int r13 = r14.getNumberOfColumns()
            java.util.List r0 = r14.A03()
            java.util.Iterator r12 = r0.iterator()
            r11 = 0
            r10 = 0
        L_0x0040:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01ea
            java.lang.String r0 = X.AnonymousClass000.A0m(r12)
            if (r11 <= 0) goto L_0x0062
            int r3 = r11 % r13
            if (r3 != 0) goto L_0x0062
            if (r10 != 0) goto L_0x0062
            android.view.LayoutInflater r4 = X.C13680ns.A0G(r14)
            r3 = 2131558743(0x7f0d0157, float:1.874281E38)
            android.widget.LinearLayout r1 = r14.A09
            android.view.View r1 = X.C13680ns.A0H(r4, r1, r3)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r10 = 1
        L_0x0062:
            r5 = 0
            com.whatsapp.util.ViewOnClickCListenerShape1S1100000_I1 r4 = new com.whatsapp.util.ViewOnClickCListenerShape1S1100000_I1
            r4.<init>(r5, r0, r14)
            X.4kV r7 = new X.4kV
            r7.<init>(r14, r0)
            int r3 = r0.hashCode()
            r6 = 4
            r8 = 2
            switch(r3) {
                case -1367751899: goto L_0x019a;
                case -1275762953: goto L_0x018d;
                case -786681338: goto L_0x0125;
                case -309474065: goto L_0x011b;
                case -196315310: goto L_0x0102;
                case 3446719: goto L_0x00e8;
                case 3529462: goto L_0x00e3;
                case 93166550: goto L_0x00cb;
                case 106006350: goto L_0x00c8;
                case 861720859: goto L_0x00b0;
                case 951526432: goto L_0x0098;
                case 1901043637: goto L_0x0080;
                default: goto L_0x0076;
            }
        L_0x0076:
            java.lang.String r3 = "ConversationAttachmentContentHelper Icon not mapped properly "
            java.lang.String r0 = X.C13680ns.A0h(r3, r0)
            X.AnonymousClass00B.A08(r0)
            goto L_0x0040
        L_0x0080:
            java.lang.String r3 = "location"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0076
            r6 = 2131231464(0x7f0802e8, float:1.807901E38)
            r19 = 2131099720(0x7f060048, float:1.7811801E38)
            r20 = 2131099721(0x7f060049, float:1.7811803E38)
            r21 = 2131890581(0x7f121195, float:1.9415858E38)
            r22 = 2131365316(0x7f0a0dc4, float:1.8350494E38)
            goto L_0x00ff
        L_0x0098:
            java.lang.String r3 = "contact"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0076
            r6 = 2131231460(0x7f0802e4, float:1.8079002E38)
            r19 = 2131099714(0x7f060042, float:1.781179E38)
            r20 = 2131099715(0x7f060043, float:1.7811791E38)
            r21 = 2131886357(0x7f120115, float:1.940729E38)
            r22 = 2131365313(0x7f0a0dc1, float:1.8350488E38)
            goto L_0x00ff
        L_0x00b0:
            java.lang.String r3 = "document"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0076
            r6 = 2131231461(0x7f0802e5, float:1.8079004E38)
            r19 = 2131099716(0x7f060044, float:1.7811793E38)
            r20 = 2131099717(0x7f060045, float:1.7811795E38)
            r21 = 2131886358(0x7f120116, float:1.9407293E38)
            r22 = 2131365314(0x7f0a0dc2, float:1.835049E38)
            goto L_0x00ff
        L_0x00c8:
            java.lang.String r3 = "order"
            goto L_0x011d
        L_0x00cb:
            java.lang.String r3 = "audio"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0076
            r6 = 2131231458(0x7f0802e2, float:1.8078998E38)
            r19 = 2131099710(0x7f06003e, float:1.781178E38)
            r20 = 2131099711(0x7f06003f, float:1.7811783E38)
            r21 = 2131886355(0x7f120113, float:1.9407287E38)
            r22 = 2131365311(0x7f0a0dbf, float:1.8350484E38)
            goto L_0x00ff
        L_0x00e3:
            java.lang.String r3 = "shop"
            goto L_0x018f
        L_0x00e8:
            java.lang.String r3 = "poll"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0076
            r6 = 2131231469(0x7f0802ed, float:1.807902E38)
            r19 = 2131099731(0x7f060053, float:1.7811823E38)
            r20 = 2131099732(0x7f060054, float:1.7811826E38)
            r21 = 2131886363(0x7f12011b, float:1.9407303E38)
            r22 = 2131365319(0x7f0a0dc7, float:1.83505E38)
        L_0x00ff:
            r7 = 0
            goto L_0x01b2
        L_0x0102:
            java.lang.String r3 = "gallery"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0076
            r6 = 2131231463(0x7f0802e7, float:1.8079008E38)
            r19 = 2131099718(0x7f060046, float:1.7811797E38)
            r20 = 2131099719(0x7f060047, float:1.78118E38)
            r21 = 2131886362(0x7f12011a, float:1.94073E38)
            r22 = 2131365315(0x7f0a0dc3, float:1.8350492E38)
            goto L_0x01b1
        L_0x011b:
            java.lang.String r3 = "product"
        L_0x011d:
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0040
            goto L_0x0076
        L_0x0125:
            java.lang.String r3 = "payment"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0076
            android.content.Context r4 = r14.getContext()
            X.174 r3 = r14.A0L
            X.1Vz r3 = r3.A00()
            X.AnonymousClass00B.A06(r3)
            java.lang.CharSequence r9 = r3.ABE(r4)
            android.graphics.Typeface r7 = X.AnonymousClass00X.A02(r4)
            android.content.res.Resources r4 = r14.getResources()
            r3 = 2131101963(0x7f06090b, float:1.781635E38)
            int r5 = r4.getColor(r3)
            android.content.res.Resources r4 = r14.getResources()
            r3 = 2131165306(0x7f07007a, float:1.7944825E38)
            int r3 = r4.getDimensionPixelSize(r3)
            X.1yD r15 = new X.1yD
            r15.<init>(r7, r9, r5, r3)
            int r3 = r14.A06
            if (r3 == r8) goto L_0x0166
            r19 = 2131099726(0x7f06004e, float:1.7811813E38)
            if (r3 != r6) goto L_0x0169
        L_0x0166:
            r19 = 2131099724(0x7f06004c, float:1.781181E38)
        L_0x0169:
            if (r3 == r8) goto L_0x0170
            r20 = 2131099727(0x7f06004f, float:1.7811815E38)
            if (r3 != r6) goto L_0x0173
        L_0x0170:
            r20 = 2131099725(0x7f06004d, float:1.7811811E38)
        L_0x0173:
            r21 = 2131889972(0x7f120f34, float:1.9414623E38)
            r22 = 2131365318(0x7f0a0dc6, float:1.8350498E38)
            r4 = 49
            com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1 r3 = new com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1
            r3.<init>(r14, r4)
            r17 = 0
            r23 = 0
            r18 = r1
            r16 = r3
            android.view.View r7 = r14.A02(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x01c6
        L_0x018d:
            java.lang.String r3 = "quick reply"
        L_0x018f:
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0076
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x019a:
            java.lang.String r3 = "camera"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0076
            r6 = 2131231459(0x7f0802e3, float:1.8079E38)
            r19 = 2131099712(0x7f060040, float:1.7811785E38)
            r20 = 2131099713(0x7f060041, float:1.7811787E38)
            r21 = 2131886356(0x7f120114, float:1.9407289E38)
            r22 = 2131365312(0x7f0a0dc0, float:1.8350486E38)
        L_0x01b1:
            r5 = 1
        L_0x01b2:
            android.content.res.Resources r3 = X.C13680ns.A0D(r14)
            android.graphics.drawable.Drawable r15 = r3.getDrawable(r6)
            r17 = r7
            r18 = r1
            r23 = r5
            r16 = r4
            android.view.View r7 = r14.A02(r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x01c6:
            if (r10 == 0) goto L_0x01e0
            android.widget.LinearLayout r6 = r14.A09
            int r5 = r14.A03
            android.content.Context r4 = r14.getContext()
            X.3od r3 = new X.3od
            r3.<init>(r4, r14)
            r3.A00 = r5
            r6.addView(r3)
            android.widget.LinearLayout r3 = r14.A09
            r3.addView(r1)
            r10 = 0
        L_0x01e0:
            r2.put(r0, r7)
            r1.addView(r7)
            int r11 = r11 + 1
            goto L_0x0040
        L_0x01ea:
            android.widget.LinearLayout r3 = r14.A09
            int r2 = r14.A00
            android.content.Context r1 = r14.getContext()
            X.3od r0 = new X.3od
            r0.<init>(r1, r14)
            r0.A00 = r2
            r3.addView(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.ConversationAttachmentContentView.A04():void");
    }

    public void A05() {
        if (!this.A0P) {
            this.A0P = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A0J = C16150sX.A0k(A002);
            this.A0A = C16150sX.A04(A002);
            this.A0H = C16150sX.A0c(A002);
            this.A0B = (C15900s5) A002.ALm.get();
            this.A0N = (C218315p) A002.AIL.get();
            this.A0E = C16150sX.A0T(A002);
            this.A0G = C16150sX.A0Y(A002);
            this.A0M = C16150sX.A10(A002);
            this.A0L = (AnonymousClass174) A002.AI3.get();
            this.A0I = C16150sX.A0e(A002);
            this.A0F = C16150sX.A0W(A002);
            this.A0C = (AnonymousClass1ME) A002.AGk.get();
        }
    }

    public final void A06() {
        this.A02 = getResources().getDimensionPixelSize(R.dimen.dimen0077);
        this.A01 = getResources().getDimensionPixelSize(R.dimen.dimen0076);
        this.A04 = getIconTextViewHeight();
        this.A00 = getResources().getDimensionPixelSize(R.dimen.dimen0236);
        this.A03 = getResources().getDimensionPixelSize(R.dimen.dimen0237);
        ScrollView.inflate(getContext(), R.layout.layout0156, this);
        this.A09 = (LinearLayout) C004601z.A0E(this, R.id.row_content);
    }

    public void A07(int i2, boolean z2) {
        int[] iArr;
        int[][] iArr2 = new int[3][];
        int[] iArr3 = {6, 0, 0, 0};
        if (z2) {
            // fill-array-data instruction
            iArr3[0] = 2;
            iArr3[1] = 3;
            iArr3[2] = 6;
            iArr3[3] = 8;
            iArr2[0] = iArr3;
            iArr2[1] = new int[]{3, 6, 0, 0};
            iArr = new int[]{6, 0, 0, 0};
        } else {
            iArr2[0] = iArr3;
            iArr2[1] = new int[]{3, 6, 0, 0};
            iArr = new int[]{2, 3, 6, 8};
        }
        iArr2[2] = iArr;
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator A0j = C13690nt.A0j(this.A0R);
        while (A0j.hasNext()) {
            A0u.add(AnonymousClass000.A0z(A0j).getValue());
        }
        int i3 = 0;
        int i4 = 0;
        do {
            int[] iArr4 = iArr2[i3];
            for (int i5 = 0; i5 < iArr4.length; i5++) {
                if (i5 < getNumberOfColumns() && i4 < A0u.size()) {
                    View A0N2 = AnonymousClass000.A0N(A0u, i4);
                    int i6 = iArr4[i5];
                    AnimationSet animationSet = new AnimationSet(true);
                    float f2 = 0.0f;
                    if (z2) {
                        f2 = 1.0f;
                    }
                    animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, f2));
                    animationSet.setInterpolator(new OvershootInterpolator(1.0f));
                    animationSet.setDuration(300);
                    animationSet.setStartOffset(i6 == 0 ? 0 : (long) (i2 / i6));
                    A0N2.startAnimation(animationSet);
                    i4++;
                }
            }
            i3++;
        } while (i3 < 3);
    }

    public int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        int computeVerticalScrollRange = computeVerticalScrollRange() - getHeight();
        int i2 = this.A07;
        int i3 = computeVerticalScrollRange - (i2 << 1);
        return (i2 <= 0 || i3 <= 0) ? computeVerticalScrollOffset : i2 + ((computeVerticalScrollOffset * i3) / computeVerticalScrollRange);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0O;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0O = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        int i5 = i2;
        int i6 = i3;
        super.onMeasure(i5, i6);
        if (this.A08 != getMeasuredHeight()) {
            int measuredHeight = getMeasuredHeight();
            int childCount = this.A09.getChildCount();
            int i7 = this.A02;
            int i8 = i7 >> 2;
            int i9 = i7 >> 1;
            int i10 = (i7 << 2) / 5;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = this.A09.getChildAt(i12);
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (childAt instanceof C73643od) {
                    i13++;
                    measuredHeight2 = ((C73643od) childAt).A00;
                    z2 = true;
                } else {
                    z2 = false;
                }
                i14 += measuredHeight2;
                if (i14 <= measuredHeight) {
                    i12++;
                    i15 = measuredHeight2;
                } else if (i12 <= 2) {
                    int i16 = i8 / 2;
                    ((C73643od) this.A09.getChildAt(0)).A00 = this.A00 / 2;
                    int i17 = childCount - 1;
                    ((C73643od) this.A09.getChildAt(i17)).A00 = this.A00 / 2;
                    for (int i18 = 1; i18 < i17; i18++) {
                        if (this.A09.getChildAt(i18) instanceof C73643od) {
                            ((C73643od) this.A09.getChildAt(i18)).A00 = this.A03 / 2;
                        }
                    }
                    i11 = i16;
                } else {
                    if (!z2) {
                        int i19 = (measuredHeight - ((i8 + i14) - measuredHeight2)) / i13;
                        int i20 = (measuredHeight - ((i9 + i14) - measuredHeight2)) / i13;
                        i11 = (measuredHeight - ((i10 + i14) - measuredHeight2)) / i13;
                        if (Math.abs(i20) < Math.abs(i19)) {
                            i19 = i20;
                        }
                        if (Math.abs(i11) >= Math.abs(i19)) {
                            i11 = i19;
                        }
                        if (i12 == childCount - 2) {
                            i4 = ((measuredHeight - (i14 + ((C73643od) this.A09.getChildAt(i12 + 1)).A00)) - i13) / (i13 + 1);
                        }
                    } else if (i12 == childCount - 1) {
                        i11 = (measuredHeight - i14) / i13;
                    } else {
                        int i21 = ((i12 + 1) - i13) * this.A02;
                        i11 = (measuredHeight - ((i8 + i14) / i13)) - i21;
                        i4 = (measuredHeight - (((i14 - i15) - measuredHeight2) + i10)) - i21;
                    }
                    if (Math.abs(i4) < Math.abs(i11)) {
                        i11 = i4;
                    }
                }
            }
            this.A05 = i11;
            this.A08 = getMeasuredHeight();
            super.onMeasure(i5, i6);
        }
    }

    public void setVerticalScrollbarInset(int i2) {
        this.A07 = i2;
    }
}
