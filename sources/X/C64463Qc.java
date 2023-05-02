package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.3Qc  reason: invalid class name and case insensitive filesystem */
public class C64463Qc extends AnonymousClass0Q9 {
    public final /* synthetic */ GridLayoutManager A00;
    public final /* synthetic */ AnonymousClass2VF A01;
    public final /* synthetic */ ShapePickerRecyclerView A02;

    public C64463Qc(GridLayoutManager gridLayoutManager, AnonymousClass2VF r2, ShapePickerRecyclerView shapePickerRecyclerView) {
        this.A02 = shapePickerRecyclerView;
        this.A01 = r2;
        this.A00 = gridLayoutManager;
    }

    public int A00(int i2) {
        return this.A01.A0E(i2).A00 != 0 ? this.A00.A00 : this.A02.A01;
    }
}
