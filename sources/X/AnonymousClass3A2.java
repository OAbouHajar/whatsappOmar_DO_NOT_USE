package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.yo.yo;

/* renamed from: X.3A2  reason: invalid class name */
public class AnonymousClass3A2 {
    public static View A00(LayoutInflater layoutInflater, ViewGroup viewGroup, int i2, int i3) {
        View inflate = layoutInflater.inflate(R.layout.layout0144, viewGroup, false);
        A01(inflate, i2, 0, R.drawable.gray_circle, i3);
        ImageView A0K = C13680ns.A0K(inflate, R.id.contactpicker_row_photo);
        if (A0K != null) {
            AnonymousClass2SR.A08(A0K, inflate.getResources().getColor(R.color.color088c));
        }
        return inflate;
    }

    public static void A01(View view, int i2, int i3, int i4, int i5) {
        C55352jN.A00(view);
        ThumbnailButton thumbnailButton = (ThumbnailButton) C004601z.A0E(view, R.id.contactpicker_row_photo);
        thumbnailButton.setImageDrawable(AnonymousClass2SR.A02(view.getContext(), i2, i3));
        thumbnailButton.setScaleType(ImageView.ScaleType.CENTER);
        thumbnailButton.setBackgroundResource(i4);
        thumbnailButton.A07 = true;
        TextView A0M = C13680ns.A0M(view, R.id.contactpicker_row_name);
        AnonymousClass1UP.A06(A0M);
        yo.ChangeSize(A0M, 0);
        A0M.setText(i5);
        C13690nt.A11(view, R.id.contactpicker_row_status);
    }
}
