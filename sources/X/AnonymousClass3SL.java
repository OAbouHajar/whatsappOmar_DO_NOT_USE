package X;

import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;

/* renamed from: X.3SL  reason: invalid class name */
public class AnonymousClass3SL extends C005602k {
    public AnonymousClass2V1 A00;
    public ShapeItemView A01;
    public final /* synthetic */ AnonymousClass2VF A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3SL(View view, AnonymousClass2VF r4) {
        super(view);
        this.A02 = r4;
        ShapeItemView shapeItemView = (ShapeItemView) view.findViewById(R.id.shape_item_view);
        this.A01 = shapeItemView;
        ViewGroup.LayoutParams layoutParams = shapeItemView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this.A01.setLayoutParams(layoutParams);
        C13680ns.A16(view, this, 46);
    }
}
