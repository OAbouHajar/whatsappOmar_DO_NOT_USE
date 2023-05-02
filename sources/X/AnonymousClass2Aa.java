package X;

import android.widget.BaseAdapter;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import java.util.List;

/* renamed from: X.2Aa  reason: invalid class name */
public class AnonymousClass2Aa extends BaseAdapter {
    public List A00;
    public final AnonymousClass39W A01;
    public final /* synthetic */ MediaAlbumActivity A02;

    public AnonymousClass2Aa(MediaAlbumActivity mediaAlbumActivity) {
        this.A02 = mediaAlbumActivity;
        this.A01 = new AnonymousClass39W(mediaAlbumActivity);
    }

    public void A00(List list) {
        this.A00 = list;
        notifyDataSetChanged();
        MediaAlbumActivity mediaAlbumActivity = this.A02;
        if (mediaAlbumActivity.A00 != null) {
            mediaAlbumActivity.ADA().setSelectionFromTop(mediaAlbumActivity.A00.getInt("top_index"), mediaAlbumActivity.A00.getInt("top_offset"));
            mediaAlbumActivity.A00 = null;
            return;
        }
        int intExtra = mediaAlbumActivity.getIntent().getIntExtra("start_index", 0);
        if (intExtra < getCount()) {
            this.A01.A02(this, intExtra);
        }
    }

    public int getCount() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        List list = this.A00;
        if (list == null) {
            return null;
        }
        return list.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public int getItemViewType(int i2) {
        C30001ba r1 = this.A02.A00.A0F;
        List list = this.A00;
        C16740tZ r0 = list == null ? null : (C16740tZ) list.get(i2);
        AnonymousClass00B.A06(r0);
        return r1.A00(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r5.A00.A01 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            java.util.List r0 = r6.A00
            if (r0 != 0) goto L_0x0088
            r0 = 0
        L_0x0005:
            X.AnonymousClass00B.A06(r0)
            r4 = 0
            if (r8 != 0) goto L_0x0061
            com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity r5 = r6.A02
            X.2DF r1 = r5.A00
            X.1ba r2 = r1.A0F
            android.content.Context r1 = r9.getContext()
            X.1bb r8 = r2.A02(r1, r5, r0)
            android.view.View r1 = r8.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.leftMargin = r4
            r1.rightMargin = r4
            r1 = 2131364507(0x7f0a0a9b, float:1.8348853E38)
            android.view.View r1 = r8.findViewById(r1)
            if (r1 == 0) goto L_0x0033
            r1.setPadding(r4, r4, r4, r4)
        L_0x0033:
            java.util.HashSet r3 = r5.A0U
            X.1Vw r2 = r0.A11
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L_0x004b
            r3.remove(r2)
            boolean r1 = r5.A0E
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x004b
            boolean r0 = r0.A0x
            r8.A13(r4, r0)
        L_0x004b:
            X.39W r2 = r6.A01
            r1 = r8
            int r0 = r2.A00
            if (r0 != r7) goto L_0x0059
            int r0 = r2.A01
            r8.A01 = r0
        L_0x0056:
            r2.A04 = r1
        L_0x0058:
            return r8
        L_0x0059:
            r8.A01 = r4
            X.1bb r0 = r2.A04
            if (r0 != r8) goto L_0x0058
            r1 = 0
            goto L_0x0056
        L_0x0061:
            X.1bb r8 = (X.C30011bb) r8
            com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity r5 = r6.A02
            java.util.HashSet r1 = r5.A0U
            X.1Vw r3 = r0.A11
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L_0x007e
            java.util.HashSet r1 = r5.A0T
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L_0x007e
            X.2DF r1 = r5.A00
            X.05J r2 = r1.A01
            r1 = 0
            if (r2 == 0) goto L_0x007f
        L_0x007e:
            r1 = 1
        L_0x007f:
            r8.A1G(r0, r1)
            java.util.HashSet r1 = r5.A0T
            r1.remove(r3)
            goto L_0x0033
        L_0x0088:
            java.lang.Object r0 = r0.get(r7)
            X.0tZ r0 = (X.C16740tZ) r0
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Aa.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 98;
    }
}
