package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: X.2KC  reason: invalid class name */
public final class AnonymousClass2KC {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04 = -1;
    public long A05;
    public long A06;
    public Uri A07;
    public Bundle A08;
    public C35541m6 A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public ArrayList A0D;
    public ArrayList A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final Context A0L;

    public AnonymousClass2KC(Context context) {
        this.A0L = context;
    }

    public Intent A00() {
        Intent intent = new Intent();
        intent.setClassName(this.A0L.getPackageName(), "com.obwhatsapp.mediacomposer.MediaComposerActivity");
        intent.putExtra("android.intent.extra.STREAM", this.A0E);
        intent.putExtra("android.intent.extra.TEXT", this.A0C);
        intent.putExtra("jid", this.A0A);
        intent.putExtra("jids", this.A0D);
        intent.putExtra("max_items", this.A01);
        intent.putExtra("skip_max_items_new_limit", this.A0J);
        intent.putExtra("origin", this.A02);
        long j2 = this.A05;
        if (j2 <= 0) {
            j2 = SystemClock.elapsedRealtime();
        }
        intent.putExtra("picker_open_time", j2);
        intent.putExtra("send", this.A0I);
        intent.putExtra("quoted_message_row_id", this.A06);
        intent.putExtra("quoted_group_jid", this.A0B);
        intent.putExtra("number_from_url", this.A0F);
        intent.putExtra("media_preview_params", this.A08);
        intent.putExtra("smb_quick_reply", false);
        intent.putExtra("start_home", this.A0K);
        intent.putExtra("animate_uri", this.A07);
        intent.putExtra("preselected_image_uri", (Parcelable) null);
        intent.putExtra("scan_for_qr", this.A0H);
        intent.putExtra("is_new_content", this.A0G);
        intent.putExtra("status_distribution", this.A09);
        int i2 = this.A02;
        intent.putExtra("gallery_duration_ms", (i2 == 1 || i2 == 11 || i2 == 14 || i2 == 17 || i2 == 20 || i2 == 21) ? this.A04 : -1);
        intent.putExtra("preview_top_margin", this.A03);
        intent.putExtra("preview_bottom_margin", this.A00);
        return intent;
    }
}
