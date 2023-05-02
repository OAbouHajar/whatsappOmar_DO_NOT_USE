package X;

import android.view.View;
import android.widget.AdapterView;
import com.obwhatsapp.BottomSheetListView;
import com.obwhatsapp.languageselector.LanguageSelectorBottomSheet;

/* renamed from: X.4lI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94674lI implements AdapterView.OnItemClickListener {
    public final /* synthetic */ BottomSheetListView A00;
    public final /* synthetic */ LanguageSelectorBottomSheet A01;

    public /* synthetic */ C94674lI(BottomSheetListView bottomSheetListView, LanguageSelectorBottomSheet languageSelectorBottomSheet) {
        this.A01 = languageSelectorBottomSheet;
        this.A00 = bottomSheetListView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        LanguageSelectorBottomSheet languageSelectorBottomSheet = this.A01;
        languageSelectorBottomSheet.A02.A0S(((AnonymousClass4I4) this.A00.getAdapter().getItem(i2)).A01);
        languageSelectorBottomSheet.A1C();
    }
}
