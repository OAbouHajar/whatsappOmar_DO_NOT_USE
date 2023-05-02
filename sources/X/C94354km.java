package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.obwhatsapp.R;

/* renamed from: X.4km  reason: invalid class name and case insensitive filesystem */
public class C94354km implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScrollView A01;

    public C94354km(View view, ScrollView scrollView) {
        this.A01 = scrollView;
        this.A00 = view;
    }

    public void onGlobalLayout() {
        ScrollView scrollView = this.A01;
        boolean A012 = C49732Vm.A01(scrollView);
        View view = this.A00;
        view.setElevation(A012 ? view.getResources().getDimension(R.dimen.dimen0765) : 0.0f);
        AnonymousClass3K3.A16(scrollView, this);
    }
}
