package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.obwhatsapp.R;

/* renamed from: X.3OY  reason: invalid class name */
public final class AnonymousClass3OY extends RelativeLayout {
    public /* synthetic */ AnonymousClass3OY(Context context) {
        super(context, (AttributeSet) null, 0);
        RelativeLayout.inflate(context, R.layout.layout05da, this);
        setBackgroundColor(AnonymousClass00T.A00(context, R.color.color064b));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0765);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public final void setSearchHint(String str) {
        C18450wi.A0H(str, 0);
        C13680ns.A0M(this, R.id.search_hint).setText(str);
    }
}
