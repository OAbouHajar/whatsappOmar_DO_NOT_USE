package X;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.obwhatsapp.reactions.ReactionsTrayViewModel;

/* renamed from: X.3DB  reason: invalid class name */
public class AnonymousClass3DB implements AbsListView.OnScrollListener {
    public float A00;
    public int A01 = -1;
    public int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ View A06;
    public final /* synthetic */ ListView A07;
    public final /* synthetic */ MediaAlbumActivity A08;

    public AnonymousClass3DB(View view, ListView listView, MediaAlbumActivity mediaAlbumActivity, int i2, int i3, int i4) {
        this.A08 = mediaAlbumActivity;
        this.A07 = listView;
        this.A06 = view;
        this.A04 = i2;
        this.A05 = i3;
        this.A03 = i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            android.widget.ListView r0 = r7.A07
            int r5 = r0.getFirstVisiblePosition()
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r5 > 0) goto L_0x00af
            android.view.View r1 = r7.A06
            int r0 = r1.getTop()
            int r2 = r1.getHeight()
            if (r2 <= 0) goto L_0x00af
            int r0 = -r0
            float r1 = (float) r0
            float r1 = r1 * r4
            float r0 = (float) r2
            float r1 = r1 / r0
        L_0x001b:
            com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity r6 = r7.A08
            X.2Aa r0 = r6.A08
            X.39W r0 = r0.A01
            r0.A01()
            android.widget.ListView r2 = r6.ADA()
            r0 = 0
            android.view.View r3 = r2.getChildAt(r0)
            X.2Aa r0 = r6.A08
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x0049
            if (r3 == 0) goto L_0x0049
            int r0 = r7.A01
            if (r0 >= 0) goto L_0x0043
            r7.A01 = r5
            int r0 = r3.getTop()
            r7.A02 = r0
        L_0x0043:
            int r0 = r7.A01
            if (r0 == r5) goto L_0x0089
            r7.A00 = r4
        L_0x0049:
            float r0 = r7.A00
            float r0 = java.lang.Math.min(r1, r0)
            float r4 = r4 - r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0067
            X.2DF r0 = r6.A00
            X.05J r0 = r0.A01
            android.view.Window r2 = r6.getWindow()
            if (r0 == 0) goto L_0x0080
            r0 = 2131099686(0x7f060026, float:1.7811732E38)
            int r0 = X.AnonymousClass00T.A00(r6, r0)
        L_0x0067:
            X.3L2 r3 = r6.A07
            int r1 = r7.A04
            int r0 = r7.A03
            int r2 = X.AnonymousClass090.A03(r4, r1, r0)
            android.graphics.Paint r1 = r3.A00
            int r0 = r1.getColor()
            if (r0 == r2) goto L_0x007f
            r1.setColor(r2)
            r3.invalidateSelf()
        L_0x007f:
            return
        L_0x0080:
            int r1 = r7.A04
            int r0 = r7.A05
            int r0 = X.AnonymousClass090.A03(r4, r1, r0)
            goto L_0x0067
        L_0x0089:
            float r5 = r7.A00
            int r2 = r7.A02
            int r0 = r3.getTop()
            int r0 = X.AnonymousClass000.A09(r2, r0)
            float r3 = (float) r0
            float r3 = r3 * r4
            android.content.res.Resources r2 = r6.getResources()
            r0 = 2131165278(0x7f07005e, float:1.7944769E38)
            int r0 = r2.getDimensionPixelSize(r0)
            float r0 = (float) r0
            float r3 = r3 / r0
            float r0 = java.lang.Math.min(r4, r3)
            float r0 = java.lang.Math.max(r5, r0)
            r7.A00 = r0
            goto L_0x0049
        L_0x00af:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DB.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A08.A00.A0j;
        if (reactionsTrayViewModel != null) {
            reactionsTrayViewModel.A05(0);
        }
    }
}
