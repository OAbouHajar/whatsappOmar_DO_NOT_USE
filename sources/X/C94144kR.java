package X;

import android.view.View;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.4kR  reason: invalid class name and case insensitive filesystem */
public class C94144kR implements View.OnLayoutChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TextStatusComposerActivity A01;

    public C94144kR(TextStatusComposerActivity textStatusComposerActivity, int i2) {
        this.A01 = textStatusComposerActivity;
        this.A00 = i2;
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        view.removeOnLayoutChangeListener(this);
        this.A01.A3G(this.A00);
    }
}
