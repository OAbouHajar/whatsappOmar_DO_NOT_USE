package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.obwhatsapp.R;

/* renamed from: X.0Yk  reason: invalid class name */
public class AnonymousClass0Yk implements View.OnLayoutChangeListener {
    public final /* synthetic */ SearchView A00;

    public AnonymousClass0Yk(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        SearchView searchView = this.A00;
        View view2 = searchView.A0Y;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.A0a.getPaddingLeft();
            Rect A0J = AnonymousClass000.A0J();
            boolean z2 = true;
            if (C004601z.A06(searchView) != 1) {
                z2 = false;
            }
            int dimensionPixelSize = searchView.A0M ? resources.getDimensionPixelSize(R.dimen.dimen0029) + resources.getDimensionPixelSize(R.dimen.dimen002a) : 0;
            SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
            searchAutoComplete.getDropDownBackground().getPadding(A0J);
            int i10 = A0J.left;
            searchAutoComplete.setDropDownHorizontalOffset(z2 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + A0J.left) + A0J.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
