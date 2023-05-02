package X;

import android.graphics.Point;
import android.widget.ListView;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.39W  reason: invalid class name */
public class AnonymousClass39W {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public C30011bb A04;
    public final /* synthetic */ MediaAlbumActivity A05;

    public AnonymousClass39W(MediaAlbumActivity mediaAlbumActivity) {
        this.A05 = mediaAlbumActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r1 = r5.getResources().getIdentifier("status_bar_height", "dimen", "android");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity r5 = r6.A05
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r4 = -r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0049
            android.content.res.Resources r3 = r5.getResources()
            java.lang.String r2 = "status_bar_height"
            java.lang.String r1 = "dimen"
            java.lang.String r0 = "android"
            int r1 = r3.getIdentifier(r2, r1, r0)
            if (r1 <= 0) goto L_0x0049
            android.content.res.Resources r0 = r5.getResources()
            int r2 = r0.getDimensionPixelSize(r1)
        L_0x002d:
            int r2 = r2 + r7
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165278(0x7f07005e, float:1.7944769E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 + r0
            int r2 = r2 - r8
            int r0 = r2 >> 1
            int r0 = java.lang.Math.max(r4, r0)
            if (r9 == 0) goto L_0x0048
            int r7 = r7 - r8
            int r0 = java.lang.Math.max(r0, r7)
        L_0x0048:
            return r0
        L_0x0049:
            r2 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39W.A00(int, int, boolean):int");
    }

    public void A01() {
        int top2;
        C30011bb r2 = this.A04;
        if (r2 != null && this.A01 < this.A02) {
            if (!(this.A03 == 0 || r2.getTop() == this.A03)) {
                int A09 = this.A01 + (AnonymousClass000.A09(this.A04.getTop(), this.A03) << 1);
                this.A01 = A09;
                C30011bb r0 = this.A04;
                r0.A01 = A09;
                r0.requestLayout();
                if (this.A00 != 0) {
                    Point point = new Point();
                    MediaAlbumActivity mediaAlbumActivity = this.A05;
                    C13680ns.A0s(mediaAlbumActivity, point);
                    int i2 = point.y;
                    int i3 = this.A01;
                    boolean z2 = true;
                    if (this.A00 != mediaAlbumActivity.A08.getCount() - 1) {
                        z2 = false;
                    }
                    top2 = A00(i2, i3, z2);
                    ListView ADA = mediaAlbumActivity.ADA();
                    AnonymousClass00B.A04(ADA);
                    ADA.setSelectionFromTop(this.A00 + ADA.getHeaderViewsCount(), top2);
                    this.A03 = top2;
                }
            }
            top2 = this.A04.getTop();
            this.A03 = top2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass2Aa r8, int r9) {
        /*
            r7 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity r6 = r7.A05
            X.C13680ns.A0s(r6, r0)
            int r5 = r0.y
            int r2 = r0.x
            android.widget.ListView r4 = r6.ADA()
            X.AnonymousClass00B.A04(r4)
            r3 = 0
            if (r5 < r2) goto L_0x005f
            r0 = 0
            android.view.View r1 = r8.getView(r9, r0, r4)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r1.measure(r0, r3)
            int r0 = r5 << 2
            int r0 = r0 / 5
            r7.A01 = r0
            int r2 = r1.getMeasuredHeight()
            r7.A02 = r2
            int r1 = r7.A01
            if (r1 >= r2) goto L_0x0058
            r7.A00 = r9
        L_0x0038:
            if (r9 == 0) goto L_0x005c
            int r2 = java.lang.Math.min(r2, r1)
            int r1 = r8.getCount()
            r0 = 1
            int r1 = r1 - r0
            if (r9 != r1) goto L_0x0047
            r3 = 1
        L_0x0047:
            int r0 = r7.A00(r5, r2, r3)
            r7.A03 = r0
            int r0 = r4.getHeaderViewsCount()
            int r9 = r9 + r0
            int r0 = r7.A03
            r4.setSelectionFromTop(r9, r0)
            return
        L_0x0058:
            r0 = -1
            r7.A00 = r0
            goto L_0x0038
        L_0x005c:
            r7.A03 = r3
            return
        L_0x005f:
            int r0 = r4.getHeaderViewsCount()
            int r9 = r9 + r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0083
            android.content.res.Resources r3 = r6.getResources()
            java.lang.String r2 = "status_bar_height"
            java.lang.String r1 = "dimen"
            java.lang.String r0 = "android"
            int r1 = r3.getIdentifier(r2, r1, r0)
            if (r1 <= 0) goto L_0x0093
            android.content.res.Resources r0 = r6.getResources()
            int r3 = r0.getDimensionPixelSize(r1)
        L_0x0083:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165278(0x7f07005e, float:1.7944769E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r3 = r3 + r0
            r4.setSelectionFromTop(r9, r3)
            return
        L_0x0093:
            r3 = 0
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39W.A02(X.2Aa, int):void");
    }
}
