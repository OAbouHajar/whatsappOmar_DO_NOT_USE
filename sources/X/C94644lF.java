package X;

import android.view.View;
import android.widget.AbsListView;
import com.obwhatsapp.BottomSheetListView;
import com.obwhatsapp.languageselector.LanguageSelectorBottomSheet;

/* renamed from: X.4lF  reason: invalid class name and case insensitive filesystem */
public class C94644lF implements AbsListView.OnScrollListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ BottomSheetListView A02;
    public final /* synthetic */ LanguageSelectorBottomSheet A03;

    public C94644lF(View view, BottomSheetListView bottomSheetListView, LanguageSelectorBottomSheet languageSelectorBottomSheet, int i2) {
        this.A03 = languageSelectorBottomSheet;
        this.A02 = bottomSheetListView;
        this.A01 = view;
        this.A00 = i2;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        this.A01.setElevation(this.A02.A00() ? (float) this.A00 : 0.0f);
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}
