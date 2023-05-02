package X;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

/* renamed from: X.356  reason: invalid class name */
public final class AnonymousClass356 extends C65073St {
    public final Typeface A00;
    public final View A01;
    public final WaTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass356(View view) {
        super(view);
        C18450wi.A0H(view, 1);
        View view2 = this.A0H;
        this.A02 = (WaTextView) C18450wi.A00(view2, R.id.title);
        this.A01 = C18450wi.A00(view2, R.id.avatar_pack_layout);
        Typeface createFromAsset = Typeface.createFromAsset(view.getResources().getAssets(), "fonts/Roboto-Medium.ttf");
        C18450wi.A0B(createFromAsset);
        this.A00 = createFromAsset;
    }

    public void A07(View.OnClickListener onClickListener, AnonymousClass4SV r5, boolean z2) {
        if (r5 instanceof C78423y1) {
            WaTextView waTextView = this.A02;
            waTextView.setText(((C78423y1) r5).A02);
            Typeface typeface = this.A00;
            waTextView.setBackground(z2 ? AnonymousClass00T.A04(waTextView.getContext(), R.drawable.shape_avatar_sticker_picker_item) : null);
            ColorStateList A03 = AnonymousClass00T.A03(waTextView.getContext(), R.color.color06da);
            waTextView.setSelected(z2);
            this.A01.setOnClickListener(onClickListener);
            return;
        }
        throw AnonymousClass000.A0T("item should be AvatarHeaderTextItem");
    }
}
