package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.SparseArray;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;

/* renamed from: X.3A6  reason: invalid class name */
public class AnonymousClass3A6 {
    public static SparseArray A00() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(AnonymousClass2EA.A03, new C85264Nt(9.0f, 4.0f, 2.0f, R.id.search_media_filter_link, R.string.str1d81, R.drawable.ic_link));
        sparseArray.put(105, new C85264Nt(9.0f, 4.0f, 0.0f, R.id.search_media_filter_image, R.string.str1d80, R.drawable.msg_status_image));
        sparseArray.put(97, new C85264Nt(8.0f, 4.0f, 0.0f, R.id.search_media_filter_audio, R.string.str1d7d, R.drawable.msg_status_audio));
        sparseArray.put(103, new C85264Nt(10.0f, 6.0f, 0.2f, R.id.search_media_filter_gif, R.string.str149f, R.drawable.msg_status_gif));
        sparseArray.put(118, new C85264Nt(9.0f, 5.0f, 0.0f, R.id.search_media_filter_video, R.string.str1d84, R.drawable.msg_status_video));
        sparseArray.put(100, new C85264Nt(7.0f, 3.0f, 0.0f, R.id.search_media_filter_doc, R.string.str1d7f, R.drawable.msg_status_doc));
        sparseArray.put(117, new C85264Nt(9.0f, 5.0f, 0.0f, R.id.search_unread_filter, R.string.str08f3, R.drawable.smart_filter_unread));
        sparseArray.put(111, new C85264Nt(7.0f, 3.0f, 0.0f, R.id.search_poll_filter, R.string.str1d83, R.drawable.msg_status_poll));
        return sparseArray;
    }

    public static void A01(Context context, Chip chip, int i2, int i3) {
        InsetDrawable insetDrawable;
        C85264Nt r2 = (C85264Nt) A00().get(i2);
        Drawable A04 = AnonymousClass00X.A04((Resources.Theme) null, context.getResources(), r2.A03);
        int A00 = C87594Xo.A00(context, r2.A01);
        if (A04 == null) {
            insetDrawable = null;
        } else {
            int max = Math.max(A04.getIntrinsicWidth(), A04.getIntrinsicHeight());
            int intrinsicWidth = ((max - A04.getIntrinsicWidth()) >> 1) + A00;
            int intrinsicHeight = ((max - A04.getIntrinsicHeight()) >> 1) + A00;
            insetDrawable = new InsetDrawable(A04, intrinsicWidth, intrinsicHeight, intrinsicWidth, intrinsicHeight);
        }
        AnonymousClass00B.A06(insetDrawable);
        chip.setChipIcon(AnonymousClass2SR.A04(context, insetDrawable, i3));
        chip.setChipIconSize((float) C87594Xo.A00(context, 20.0f));
        chip.setChipStartPadding((float) C87594Xo.A00(context, 1.0f));
        chip.setTextStartPadding((float) C87594Xo.A00(context, 1.0f));
        chip.setIconStartPadding((float) C87594Xo.A00(context, r2.A02));
        chip.setIconEndPadding((float) C87594Xo.A00(context, r2.A00));
    }
}
