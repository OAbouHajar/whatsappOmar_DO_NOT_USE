package X;

import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.PeerAvatarLayout;
import com.obwhatsapp.components.button.ThumbnailButton;
import java.util.List;

/* renamed from: X.2r3  reason: invalid class name and case insensitive filesystem */
public class C57382r3 extends AnonymousClass01X {
    public final List A00 = AnonymousClass000.A0u();
    public final /* synthetic */ PeerAvatarLayout A01;

    public C57382r3(PeerAvatarLayout peerAvatarLayout) {
        this.A01 = peerAvatarLayout;
    }

    public int A0C() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r13, int i2) {
        int dimensionPixelSize;
        int max;
        AnonymousClass3OP r6 = ((C64873Rz) r13).A00;
        r6.clearAnimation();
        List list = this.A00;
        int size = list.size();
        Resources resources = r6.getResources();
        if (size == 1) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dimen00f1);
        } else {
            dimensionPixelSize = size >= 2 ? resources.getDimensionPixelSize(R.dimen.dimen00f5) - ((size - 2) * r6.getResources().getDimensionPixelSize(R.dimen.dimen00f3)) : 0;
        }
        ThumbnailButton thumbnailButton = r6.A02;
        ViewGroup.LayoutParams layoutParams = thumbnailButton.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        thumbnailButton.setLayoutParams(layoutParams);
        thumbnailButton.A02 = (float) ((dimensionPixelSize + 1) >> 1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        PeerAvatarLayout peerAvatarLayout = this.A01;
        View view = (View) peerAvatarLayout.getParent();
        if (i2 != 0) {
            int size2 = list.size();
            int width = view.getWidth();
            if (size2 <= 1) {
                max = 0;
            } else {
                int dimensionPixelSize2 = (r6.getResources().getDimensionPixelSize(R.dimen.dimen00f5) - ((size2 - 2) * r6.getResources().getDimensionPixelSize(R.dimen.dimen00f3))) + (r6.A00 << 1);
                max = Math.max(dimensionPixelSize2 - ((width - dimensionPixelSize2) / (size2 - 1)), (int) (((double) dimensionPixelSize2) * 0.4d));
            }
            int i3 = -max;
            if (peerAvatarLayout.A08.A0T()) {
                layoutParams2.rightMargin = i3;
            } else {
                layoutParams2.leftMargin = i3;
            }
        }
        r6.setLayoutParams(layoutParams2);
        if (Build.VERSION.SDK_INT >= 21) {
            float f2 = (float) (peerAvatarLayout.A00 - (peerAvatarLayout.A01 * i2));
            r6.setElevation(f2);
            r6.setElevation(f2);
        }
        AnonymousClass2OY r3 = peerAvatarLayout.A04;
        if (r3 != null) {
            peerAvatarLayout.A05.A03(thumbnailButton, r3, (C16010sH) list.get(i2), true);
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new C64873Rz(new AnonymousClass3OP(this.A01.getContext()), this);
    }
}
