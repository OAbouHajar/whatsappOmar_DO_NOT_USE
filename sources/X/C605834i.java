package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.obwhatsapp.settings.chat.wallpaper.WallpaperMockChatView;

/* renamed from: X.34i  reason: invalid class name and case insensitive filesystem */
public class C605834i extends AnonymousClass3O4 {
    public Resources A00;
    public Button A01;
    public FrameLayout A02;
    public ProgressBar A03;
    public WallpaperImagePreview A04 = ((WallpaperImagePreview) C004601z.A0E(this, R.id.wallpaper_preview_background));
    public WallpaperImagePreview A05 = ((WallpaperImagePreview) C004601z.A0E(this, R.id.wallpaper_preview_background_doodle));
    public WallpaperImagePreview A06;

    public C605834i(Context context, Resources resources, String str, String str2) {
        super(context);
        this.A00 = resources;
        FrameLayout.inflate(context, R.layout.layout0618, this);
        WallpaperImagePreview wallpaperImagePreview = (WallpaperImagePreview) C004601z.A0E(this, R.id.wallpaper_preview_blur);
        this.A06 = wallpaperImagePreview;
        wallpaperImagePreview.setImageDrawable((Drawable) null);
        ((WallpaperMockChatView) C004601z.A0E(this, R.id.wallpaper_preview_mock_chat)).setMessages(str, str2, (AnonymousClass1YG) null);
        this.A02 = C13700nu.A08(this, R.id.wallpaper_preview_download_container);
        this.A03 = (ProgressBar) C004601z.A0E(this, R.id.wallpaper_preview_progress_bar);
        this.A01 = (Button) C004601z.A0E(this, R.id.wallpaper_preview_download_btn);
    }

    public void setBackgroundColor(int i2) {
        this.A06.setVisibility(8);
        WallpaperImagePreview wallpaperImagePreview = this.A04;
        wallpaperImagePreview.setImageDrawable((Drawable) null);
        wallpaperImagePreview.setBackgroundColor(i2);
    }

    public void setDownloadClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setWallpaper(Bitmap bitmap) {
        this.A06.setVisibility(8);
        this.A04.setImageBitmap(bitmap);
    }

    public void setWallpaper(Drawable drawable) {
        this.A06.setVisibility(8);
        this.A04.setImageDrawable(drawable);
    }
}
