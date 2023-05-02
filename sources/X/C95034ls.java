package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.4ls  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95034ls implements C016507v {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ MediaAlbumActivity A03;

    public /* synthetic */ C95034ls(View view, View view2, View view3, MediaAlbumActivity mediaAlbumActivity) {
        this.A03 = mediaAlbumActivity;
        this.A00 = view;
        this.A01 = view2;
        this.A02 = view3;
    }

    public final AnonymousClass030 AMY(View view, AnonymousClass030 r8) {
        MediaAlbumActivity mediaAlbumActivity = this.A03;
        View view2 = this.A00;
        View view3 = this.A01;
        View view4 = this.A02;
        int A06 = r8.A06() + mediaAlbumActivity.getResources().getDimensionPixelSize(R.dimen.dimen005e);
        int A032 = r8.A03();
        view2.setPadding(0, 0, 0, A06);
        view3.setPadding(0, 0, 0, A032);
        view4.setPadding(0, 0, 0, A06);
        return r8;
    }
}
