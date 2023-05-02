package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.2rg  reason: invalid class name and case insensitive filesystem */
public class C57742rg extends C005602k implements View.OnClickListener {
    public AnonymousClass4S6 A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final /* synthetic */ GalleryPickerFragment A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57742rg(View view, GalleryPickerFragment galleryPickerFragment) {
        super(view);
        this.A05 = galleryPickerFragment;
        this.A04 = C13680ns.A0R(view, R.id.title);
        this.A01 = C13680ns.A0K(view, R.id.icon);
        this.A03 = C13680ns.A0M(view, R.id.count);
        this.A02 = C13680ns.A0K(view, R.id.thumbnail);
        view.setOnClickListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r5 == 6) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r5 >= 4) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r11) {
        /*
            r10 = this;
            X.4S6 r7 = r10.A00
            com.obwhatsapp.gallerypicker.GalleryPickerFragment r0 = r10.A05
            X.00l r4 = r0.A0C()
            X.0pd r2 = r0.A0D
            r1 = 2614(0xa36, float:3.663E-42)
            X.0tM r0 = X.C16620tM.A02
            int r9 = r2.A03(r0, r1)
            int r5 = r7.A02
            java.lang.String r2 = "bucketId"
            r0 = 9
            if (r5 == r0) goto L_0x00f1
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            r0 = 4
            if (r5 < r0) goto L_0x002d
        L_0x001f:
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r0 = r7.A04
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r2, r0)
            android.net.Uri r1 = r0.build()
        L_0x002d:
            android.content.Intent r8 = r4.getIntent()
            android.content.Intent r3 = X.C13690nt.A0B(r1)
            java.lang.String r1 = r7.A05
            java.lang.String r0 = "window_title"
            r3.putExtra(r0, r1)
            r2 = 1
            if (r5 == 0) goto L_0x0050
            r1 = 4
            if (r5 == r2) goto L_0x00ee
            r0 = 2
            if (r5 == r0) goto L_0x004f
            if (r5 == r1) goto L_0x0050
            r0 = 5
            if (r5 == r0) goto L_0x00ee
            r0 = 6
            r2 = 7
            if (r5 != r0) goto L_0x0050
        L_0x004f:
            r2 = 2
        L_0x0050:
            int r0 = r7.A01
            r2 = r2 & r0
            java.lang.String r0 = "include_media"
            r3.putExtra(r0, r2)
            r0 = 1
            java.lang.String r1 = "preview"
            boolean r0 = r8.getBooleanExtra(r1, r0)
            r3.putExtra(r1, r0)
            java.lang.String r2 = "quoted_message_row_id"
            r0 = 0
            long r5 = r8.getLongExtra(r2, r0)
            r3.putExtra(r2, r5)
            java.lang.String r5 = "quoted_group_jid"
            java.lang.String r2 = r8.getStringExtra(r5)
            r3.putExtra(r5, r2)
            java.lang.String r5 = "jid"
            java.lang.String r2 = r8.getStringExtra(r5)
            r3.putExtra(r5, r2)
            java.lang.String r5 = "max_items"
            int r2 = r8.getIntExtra(r5, r9)
            r3.putExtra(r5, r2)
            java.lang.String r6 = "skip_max_items_new_limit"
            r5 = 0
            boolean r2 = r8.getBooleanExtra(r6, r5)
            r3.putExtra(r6, r2)
            java.lang.String r6 = "is_in_multi_select_mode_only"
            boolean r2 = r8.getBooleanExtra(r6, r5)
            r3.putExtra(r6, r2)
            java.lang.String r6 = "android.intent.extra.TEXT"
            java.lang.String r2 = r8.getStringExtra(r6)
            r3.putExtra(r6, r2)
            java.lang.String r6 = "mentions"
            java.util.ArrayList r2 = r8.getStringArrayListExtra(r6)
            r3.putExtra(r6, r2)
            java.lang.String r2 = "picker_open_time"
            long r0 = r8.getLongExtra(r2, r0)
            r3.putExtra(r2, r0)
            java.lang.String r6 = "camera_origin"
            boolean r2 = r8.hasExtra(r6)
            r0 = 1
            java.lang.String r1 = "origin"
            if (r2 == 0) goto L_0x00e9
            int r0 = r8.getIntExtra(r6, r0)
            int r0 = X.C55012id.A00(r0, r5)
        L_0x00ca:
            r3.putExtra(r1, r0)
            boolean r1 = r7.A06
            java.lang.String r0 = "is_favorite_filter_enabled"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "com.obwhatsapp.gallery.NewMediaPicker"
            r3.setClassName(r4, r0)
            X.01Q[] r0 = new X.AnonymousClass01Q[r5]
            X.09N r0 = X.AnonymousClass09N.A02(r4, r0)
            android.os.Bundle r1 = r0.A03()
            r0 = 90
            r4.startActivityForResult(r3, r0, r1)
            return
        L_0x00e9:
            int r0 = r8.getIntExtra(r1, r0)
            goto L_0x00ca
        L_0x00ee:
            r2 = 4
            goto L_0x0050
        L_0x00f1:
            android.net.Uri r1 = X.AnonymousClass32H.A00
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57742rg.onClick(android.view.View):void");
    }
}
