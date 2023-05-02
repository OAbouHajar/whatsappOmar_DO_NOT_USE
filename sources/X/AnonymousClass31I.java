package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.Conversation;

/* renamed from: X.31I  reason: invalid class name */
public class AnonymousClass31I extends C602630s implements AnonymousClass5QU {
    public boolean A00;
    public boolean A01;
    public final View A02 = findViewById(R.id.name_in_group);
    public final View A03 = findViewById(R.id.sticker_bubble_header);
    public final C61783Ah A04;
    public final C50772aQ A05;

    public AnonymousClass31I(Context context, AnonymousClass1YG r14, C38641rB r15, AnonymousClass1MF r16, C50772aQ r17) {
        super(context, r14, r15);
        C50772aQ r10 = r17;
        this.A05 = r10;
        C14710pd r6 = this.A0M;
        AnonymousClass10X r2 = this.A0M;
        C16760tb r3 = this.A0R;
        AnonymousClass013 r5 = this.A0K;
        C25791Ld r11 = this.A1d;
        this.A04 = new C61783Ah(this, r2, r3, this.A01, r5, r6, this.A04, this.A06, r16, r10, r11);
        A0e(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0e(boolean r8) {
        /*
            r7 = this;
            X.0tZ r6 = r7.A0O
            X.0tY r6 = (X.C16730tY) r6
            X.1rB r6 = (X.C38641rB) r6
            X.0tZ r0 = r6.A0D()
            r4 = 0
            if (r0 != 0) goto L_0x0027
            X.1uH r0 = r6.A0N
            if (r0 != 0) goto L_0x0027
            X.1Vw r1 = r6.A11
            X.0rv r0 = r1.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x00de
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x00de
            X.39r r0 = r7.A0c
            boolean r0 = r0.A07()
            if (r0 != 0) goto L_0x00de
        L_0x0027:
            r0 = 1
        L_0x0028:
            r7.A01 = r0
            r2 = 0
            if (r8 == 0) goto L_0x0047
            X.1YG r0 = r7.A0b
            if (r0 == 0) goto L_0x0043
            boolean r4 = r0.AJn(r6)
            X.3Ah r0 = r7.A04
            com.whatsapp.stickers.StickerView r3 = r0.A0F
            if (r4 == 0) goto L_0x00da
            r1 = 0
            com.facebook.redex.IDxACallbackShape8S0200000_2_I1 r0 = new com.facebook.redex.IDxACallbackShape8S0200000_2_I1
            r0.<init>(r7, r1, r6)
            r3.A01 = r0
        L_0x0043:
            X.3Ah r0 = r7.A04
            r0.A02 = r4
        L_0x0047:
            X.3Ah r3 = r7.A04
            android.view.View$OnLongClickListener r0 = r7.A1n
            com.whatsapp.stickers.StickerView r1 = r3.A0F
            r1.setOnLongClickListener(r0)
            boolean r0 = r7.A00
            r1.A03 = r0
            r3.A03(r6, r8)
            X.0tY r1 = r7.getFMessage()
            boolean r0 = X.C38621r6.A10(r1)
            if (r0 == 0) goto L_0x00cc
            r3.A01()
        L_0x0064:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165830(0x7f070286, float:1.7945888E38)
            int r5 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup r4 = r7.A04
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            X.0tZ r0 = r6.A0D()
            if (r0 != 0) goto L_0x00c7
            X.1uH r0 = r6.A0N
            if (r0 != 0) goto L_0x00c7
            android.content.Context r2 = r4.getContext()
            X.0tZ r0 = r7.A0O
            X.1Vw r0 = r0.A11
            boolean r1 = r0.A02
            r0 = 2131230934(0x7f0800d6, float:1.8077935E38)
            if (r1 == 0) goto L_0x0093
            r0 = 2131230943(0x7f0800df, float:1.8077953E38)
        L_0x0093:
            android.graphics.drawable.Drawable r0 = X.C13690nt.A0C(r2, r0)
            r7.setDateWrapperBackground(r0)
        L_0x009a:
            r3.topMargin = r5
            r4.setLayoutParams(r3)
            r7.A0x()
            r7.A1O(r6)
            X.0sK r0 = r7.A0L
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x00c6
            X.0pd r2 = r7.A0M
            r1 = 1396(0x574, float:1.956E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x00c6
            X.0tZ r0 = r7.A0O
            X.0tY r0 = (X.C16730tY) r0
            X.1rB r0 = (X.C38641rB) r0
            X.1XO r0 = r0.A02
            if (r0 == 0) goto L_0x00c6
            r7.A0y()
        L_0x00c6:
            return
        L_0x00c7:
            r7.setDateWrapperBackground(r2)
            int r5 = -r5
            goto L_0x009a
        L_0x00cc:
            boolean r0 = X.C38621r6.A11(r1)
            if (r0 == 0) goto L_0x00d6
            r3.A02()
            goto L_0x0064
        L_0x00d6:
            r3.A00()
            goto L_0x0064
        L_0x00da:
            r3.A01 = r2
            goto L_0x0043
        L_0x00de:
            r0 = 0
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31I.A0e(boolean):void");
    }

    private void setDateWrapperBackground(Drawable drawable) {
        ViewGroup viewGroup = this.A04;
        int dimensionPixelOffset = C13680ns.A0D(viewGroup).getDimensionPixelOffset(R.dimen.dimen0284);
        int paddingBottom = viewGroup.getPaddingBottom();
        int paddingTop = viewGroup.getPaddingTop();
        Conversation.setStkrBalloon(this, viewGroup, drawable);
        viewGroup.setPadding(dimensionPixelOffset, paddingTop, dimensionPixelOffset, paddingBottom);
    }

    public Point A0h(int i2, int i3) {
        if (this.A0O.A0D() != null) {
            return super.A0h(i2, i3);
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dimen0762);
        View A0E = C004601z.A0E(this, R.id.sticker_root);
        int left = A0E.getLeft();
        ViewGroup viewGroup = this.A04;
        int left2 = left + viewGroup.getLeft();
        return new Point(C13680ns.A1Z(this.A0K) ? ((left2 + viewGroup.getMeasuredWidth()) - i2) - dimensionPixelOffset : left2 + dimensionPixelOffset, (((int) (A0E.getY() + viewGroup.getY())) + viewGroup.getMeasuredHeight()) - getReactionsViewVerticalOverlap());
    }

    public void A0t() {
        A0e(false);
        A1J(false);
    }

    public void A0z() {
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A0e(A1a);
        }
    }

    public void Ag4() {
        this.A04.A0F.A04();
    }

    public int getBubbleAlpha() {
        if (this.A01) {
            return MotionEventCompat.ACTION_MASK;
        }
        return 0;
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01ca;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getContentWidth() {
        /*
            r2 = this;
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0018
            X.0tZ r1 = r2.A0O
            X.0tZ r0 = r1.A0D()
            if (r0 != 0) goto L_0x0018
            X.1uH r0 = r1.A0N
            if (r0 != 0) goto L_0x0018
            android.view.View r0 = r2.A03
            if (r0 == 0) goto L_0x0018
            android.view.View r0 = r2.A02
            if (r0 != 0) goto L_0x001a
        L_0x0018:
            android.view.View r0 = r2.A0D
        L_0x001a:
            int r0 = r0.getMeasuredWidth()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31I.getContentWidth():int");
    }

    public C38641rB getFMessage() {
        return (C38641rB) ((C16730tY) this.A0O);
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01c8;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01ca;
    }

    public int getReactionsViewVerticalOverlap() {
        return getResources().getDimensionPixelOffset(R.dimen.dimen0762);
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C38641rB);
        super.setFMessage(r2);
    }
}
