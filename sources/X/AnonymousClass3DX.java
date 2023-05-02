package X;

import android.graphics.Rect;
import android.view.View;
import com.obwhatsapp.mediacomposer.ImageComposerFragment;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.mediacomposer.MediaComposerFragment;
import com.obwhatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView;

/* renamed from: X.3DX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DX implements C016507v {
    public final /* synthetic */ MediaComposerActivity A00;

    public /* synthetic */ AnonymousClass3DX(MediaComposerActivity mediaComposerActivity) {
        this.A00 = mediaComposerActivity;
    }

    public final AnonymousClass030 AMY(View view, AnonymousClass030 r9) {
        MediaComposerActivity mediaComposerActivity = this.A00;
        Rect rect = mediaComposerActivity.A1P;
        int i2 = 0;
        rect.set(r9.A04(), (!mediaComposerActivity.A1H || mediaComposerActivity.A03 == 0) ? r9.A06() : 0, r9.A05(), r9.A03());
        for (AnonymousClass01A r1 : mediaComposerActivity.A2E()) {
            if ((r1 instanceof ImageComposerFragment) || (r1 instanceof MediaComposerFragment)) {
                ((MediaComposerFragment) r1).A1F(rect);
            }
        }
        if (mediaComposerActivity.A1H) {
            if (mediaComposerActivity.A03 == 0) {
                i2 = r9.A06();
            } else if (r9.A06() > 0) {
                i2 = mediaComposerActivity.A03;
            }
            mediaComposerActivity.A05.setPadding(rect.left, i2, rect.right, rect.bottom);
        }
        C456429w r12 = mediaComposerActivity.A0o;
        int i3 = -rect.left;
        int i4 = -rect.right;
        FilterSwipeView filterSwipeView = r12.A05.A01;
        filterSwipeView.setPadding(i3, filterSwipeView.getPaddingTop(), i4, filterSwipeView.getPaddingBottom());
        return r9;
    }
}
