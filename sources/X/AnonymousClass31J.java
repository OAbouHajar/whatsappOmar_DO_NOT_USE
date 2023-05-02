package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.whatsapp.stickers.StickerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.31J  reason: invalid class name */
public class AnonymousClass31J extends AnonymousClass30d implements AnonymousClass5QU {
    public View A00 = findViewById(R.id.name_in_group);
    public View A01 = findViewById(R.id.sticker_bubble_header);
    public C16260sj A02;
    public AnonymousClass1HE A03;
    public C209212c A04;
    public AnonymousClass1MF A05;
    public List A06;
    public boolean A07;
    public final ArrayList A08;

    public AnonymousClass31J(Context context, AnonymousClass1YG r5, C16730tY r6, AnonymousClass1MF r7) {
        super(context, r5, r6);
        ArrayList A0u = AnonymousClass000.A0u();
        this.A08 = A0u;
        this.A05 = r7;
        A0u.add(new AnonymousClass39Z((LinearLayout) findViewById(R.id.sticker_1), this));
        A0u.add(new AnonymousClass39Z((LinearLayout) findViewById(R.id.sticker_2), this));
    }

    private void A0c(boolean z2) {
        if (this.A06 != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.A08;
                if (i2 < arrayList.size()) {
                    ((AnonymousClass39Z) arrayList.get(i2)).A01(i2 < this.A06.size() ? (C16730tY) this.A06.get(i2) : null, z2);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void A0i(C28381Vw r5) {
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            AnonymousClass39Z r1 = (AnonymousClass39Z) it.next();
            if (r5.equals(r1.A06.A11)) {
                StickerView stickerView = r1.A0B;
                stickerView.setBackgroundDrawable(new AnonymousClass3L5(r1));
                AnonymousClass3NJ r2 = new AnonymousClass3NJ(r1);
                r2.setDuration(2400);
                r2.setInterpolator(new AccelerateInterpolator());
                stickerView.startAnimation(r2);
                return;
            }
        }
    }

    public void A0t() {
        A0c(false);
        A1J(false);
    }

    public void A1G(C16740tZ r2, boolean z2) {
        super.A1G(this.A0O, z2);
        if (z2) {
            A0c(false);
        }
        A1O();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r5.A0O != r6.get(0)) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (((X.C16740tZ) r6.get(0)).A11.A02 != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1N(java.util.List r6, boolean r7) {
        /*
            r5 = this;
            java.util.List r0 = r5.A06
            r4 = 0
            if (r0 == 0) goto L_0x000e
            X.0tZ r1 = r5.A0O
            java.lang.Object r0 = r6.get(r4)
            r3 = 0
            if (r1 == r0) goto L_0x000f
        L_0x000e:
            r3 = 1
        L_0x000f:
            java.lang.Object r0 = r6.get(r4)
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r6.get(r4)
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            boolean r1 = r0.A02
            r0 = 1
            if (r1 == 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r5.A07 = r0
            int r1 = r6.size()
            r0 = 2
            if (r1 == r0) goto L_0x003c
            java.lang.String r0 = "ConversationRowStickerAlbum/setAlbumMessages improper number of stickers in sticker album"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x003c:
            if (r7 != 0) goto L_0x0059
            java.util.List r0 = r5.A06
            if (r0 == 0) goto L_0x0058
            r2 = 0
        L_0x0043:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x0059
            java.util.List r0 = r5.A06
            java.lang.Object r1 = r0.get(r2)
            java.lang.Object r0 = r6.get(r2)
            if (r1 != r0) goto L_0x0058
            int r2 = r2 + 1
            goto L_0x0043
        L_0x0058:
            r7 = 1
        L_0x0059:
            r5.A06 = r6
            java.lang.Object r0 = r6.get(r4)
            X.0tZ r0 = (X.C16740tZ) r0
            super.A1G(r0, r7)
            if (r3 != 0) goto L_0x0068
            if (r7 == 0) goto L_0x006b
        L_0x0068:
            r5.A0c(r3)
        L_0x006b:
            r5.A1O()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31J.A1N(java.util.List, boolean):void");
    }

    public final void A1O() {
        if (this.A06 != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.A08;
                if (i2 < arrayList.size()) {
                    if (i2 < this.A06.size()) {
                        AnonymousClass39Z r3 = (AnonymousClass39Z) arrayList.get(i2);
                        AnonymousClass1YG r2 = r3.A0C.A0b;
                        if (r2 == null || !r2.AHi()) {
                            C13680ns.A13(r3.A02);
                        } else {
                            r3.A00();
                            r3.A02.setSelected(r2.AJI(r3.A06));
                        }
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void Ag4() {
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            ((AnonymousClass39Z) it.next()).A0B.A04();
        }
    }

    public int getBubbleAlpha() {
        if (this.A07) {
            return MotionEventCompat.ACTION_MASK;
        }
        return 0;
    }

    public int getCenteredLayoutId() {
        return 0;
    }

    public int getContentWidth() {
        return ((!this.A07 || this.A0O.A0D() != null || this.A01 == null) ? this.A0D : this.A00).getMeasuredWidth();
    }

    public C16730tY getFMessage() {
        return (C16730tY) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01c6;
    }

    public Drawable getKeepDrawable() {
        return C30011bb.A0Z(this) ? C30011bb.A04(this) : super.getKeepDrawable();
    }

    public int getMainChildMaxWidth() {
        return 0;
    }

    public int getMaxAlbumSize() {
        return 2;
    }

    public int getMessageCount() {
        return C13680ns.A07(this.A06);
    }

    public int getMinAlbumSize() {
        return 2;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01c7;
    }

    public int getReactionsViewVerticalOverlap() {
        return getResources().getDimensionPixelOffset(R.dimen.dimen0762);
    }
}
