package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.yo.ColorStore;

/* renamed from: X.2rZ  reason: invalid class name and case insensitive filesystem */
public class C57672rZ extends C005602k {
    public final int A00;
    public final View A01;
    public final FrameLayout A02;
    public final TextEmojiLabel A03;
    public final C30521cU A04;
    public final ThumbnailButton A05;
    public final /* synthetic */ C55502ji A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57672rZ(FrameLayout frameLayout, C55502ji r12) {
        super(frameLayout);
        this.A06 = r12;
        FrameLayout frameLayout2 = frameLayout;
        int i2 = Build.VERSION.SDK_INT;
        this.A00 = (i2 < 19 || (i2 < 21 && "samsung".equalsIgnoreCase(Build.MANUFACTURER))) ? 1711315455 : 419430400;
        this.A02 = frameLayout;
        ThumbnailButton thumbnailButton = (ThumbnailButton) frameLayout.findViewById(R.id.contact_photo);
        this.A05 = thumbnailButton;
        thumbnailButton.setEnabled(false);
        C30521cU r4 = new C30521cU((View) frameLayout2, r12.A0D, r12.A0F, r12.A0I, (int) R.id.contact_name);
        this.A04 = r4;
        r4.A06(r12.A00);
        r4.A02.setTextColor(ColorStore.getDefaultListItemTitleColor());
        TextEmojiLabel A0R = C13680ns.A0R(frameLayout, R.id.push_name);
        this.A03 = A0R;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(this.A00));
        frameLayout.setForeground(stateListDrawable);
        this.A01 = frameLayout.findViewById(R.id.separator);
        A0R.setTextColor(r12.A02);
    }
}
