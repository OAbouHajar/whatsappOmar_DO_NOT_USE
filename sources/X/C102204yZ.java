package X;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.4yZ  reason: invalid class name and case insensitive filesystem */
public class C102204yZ implements C109635Sz {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Toolbar A02;
    public final /* synthetic */ MediaAlbumActivity A03;

    public C102204yZ(View view, View view2, Toolbar toolbar, MediaAlbumActivity mediaAlbumActivity) {
        this.A03 = mediaAlbumActivity;
        this.A00 = view;
        this.A01 = view2;
        this.A02 = toolbar;
    }

    public /* synthetic */ boolean AIj(View view) {
        return true;
    }

    public void APs(View view) {
        this.A03.onBackPressed();
    }

    public void AQA(int i2) {
    }

    public void AX7(View view) {
    }

    public void AXK(View view, float f2) {
        float f3 = 1.0f - f2;
        float f4 = f3 < 0.8f ? 0.0f : (f3 - 0.8f) / 0.19999999f;
        this.A00.setAlpha(f4);
        this.A01.setAlpha(f4);
        this.A02.setAlpha(f4);
    }
}
