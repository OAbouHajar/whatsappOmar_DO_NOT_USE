package X;

import android.content.res.TypedArray;
import androidx.core.view.ViewCompat;

/* renamed from: X.3U2  reason: invalid class name */
public class AnonymousClass3U2 extends C616439s {
    public AnonymousClass3U2() {
        this.A00.A0F = false;
    }

    public /* bridge */ /* synthetic */ C616439s A00(TypedArray typedArray) {
        super.A00(typedArray);
        if (typedArray.hasValue(2)) {
            AnonymousClass4PG r3 = this.A00;
            r3.A05 = (typedArray.getColor(2, r3.A05) & ViewCompat.MEASURED_SIZE_MASK) | (r3.A05 & -16777216);
        }
        if (typedArray.hasValue(12)) {
            AnonymousClass4PG r1 = this.A00;
            r1.A09 = typedArray.getColor(12, r1.A09);
        }
        return this;
    }
}
