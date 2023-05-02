package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* renamed from: X.2ho  reason: invalid class name and case insensitive filesystem */
public class C54592ho {
    public int A00;
    public int A01 = 1;
    public int A02 = 5;
    public C15830rv A03 = null;
    public C28381Vw A04 = null;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = false;
    public final Context A08;

    public C54592ho(Context context) {
        this.A08 = context;
    }

    public Intent A00() {
        Intent intent = new Intent();
        intent.setClassName(this.A08.getPackageName(), "com.obwhatsapp.mediaview.MediaViewActivity");
        intent.putExtra("start_t", SystemClock.uptimeMillis());
        intent.putExtra("video_play_origin", this.A02);
        intent.putExtra("nogallery", this.A07);
        intent.putExtra("gallery", this.A05);
        intent.putExtra("menu_style", this.A01);
        intent.putExtra("menu_set_wallpaper", this.A06);
        intent.putExtra("origin", this.A00);
        C28381Vw r0 = this.A04;
        if (r0 != null) {
            AnonymousClass1yL.A00(intent, r0);
        }
        C15830rv r02 = this.A03;
        if (r02 != null) {
            intent.putExtra("jid", r02.getRawString());
        }
        return intent;
    }
}
