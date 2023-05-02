package X;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.R;

/* renamed from: X.2kJ  reason: invalid class name */
public abstract class AnonymousClass2kJ extends C55762kK {
    public C15830rv A00 = null;
    public boolean A01 = false;

    public int A35() {
        return R.layout.layout0046;
    }

    public void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        setContentView(A35());
        C434920f.A04(this, R.color.color06b4);
        this.A01 = getIntent().getBooleanExtra("is_using_global_wallpaper", false);
        this.A00 = C62063Bm.A03(getIntent());
        Aem((Toolbar) AnonymousClass00T.A05(this, R.id.toolbar));
        x().A0N(true);
        if (C15450qv.A03() && (findViewById = findViewById(R.id.separator)) != null) {
            findViewById.setVisibility(8);
        }
    }
}
