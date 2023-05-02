package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.3RL  reason: invalid class name */
public final class AnonymousClass3RL extends AnonymousClass07D {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final /* synthetic */ AnonymousClass2Ur A03;

    public AnonymousClass3RL(AnonymousClass2Ur r1, int i2, int i3, boolean z2) {
        this.A03 = r1;
        this.A02 = z2;
        this.A01 = i2;
        this.A00 = i3;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r8, RecyclerView recyclerView) {
        int i2;
        super.A03(rect, view, r8, recyclerView);
        AnonymousClass00B.A0F(recyclerView instanceof ShapePickerRecyclerView);
        ShapePickerRecyclerView shapePickerRecyclerView = (ShapePickerRecyclerView) recyclerView;
        int A002 = RecyclerView.A00(view);
        if (A002 != -1) {
            C89934dB A0E = this.A03.A0J.A0E(A002);
            shapePickerRecyclerView.A0z();
            int i3 = shapePickerRecyclerView.A01;
            int actualShapeSpacing = shapePickerRecyclerView.getActualShapeSpacing();
            int i4 = A0E.A02;
            if (i4 == 0) {
                int i5 = A0E.A01 % i3;
                int i6 = (i5 * actualShapeSpacing) / i3;
                int i7 = actualShapeSpacing - (((i5 + 1) * actualShapeSpacing) / i3);
                boolean z2 = this.A02;
                int i8 = i6;
                if (z2) {
                    i8 = i7;
                }
                rect.left = i8;
                if (!z2) {
                    i6 = i7;
                }
                rect.right = i6;
                i2 = this.A01;
            } else if (i4 == 1) {
                i2 = this.A00;
            } else {
                return;
            }
            rect.top = i2;
        }
    }
}
