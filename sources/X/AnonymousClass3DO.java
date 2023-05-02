package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.facebook.redex.IDxDCompatShape23S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;
import com.obwhatsapp.R;
import com.obwhatsapp.gallerypicker.MediaPickerFragment;
import java.util.HashSet;

/* renamed from: X.3DO  reason: invalid class name */
public class AnonymousClass3DO implements C009804r {
    public Runnable A00;
    public final Context A01;
    public final TextView A02;
    public final /* synthetic */ MediaPickerFragment A03;

    public AnonymousClass3DO(Context context, MediaPickerFragment mediaPickerFragment) {
        this.A03 = mediaPickerFragment;
        this.A01 = context;
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.layout0026, (ViewGroup) null);
        this.A02 = textView;
        C004601z.A0j(textView, new IDxDCompatShape23S0100000_2_I1(this, 5));
    }

    public boolean AM1(MenuItem menuItem, AnonymousClass05J r4) {
        if (menuItem.getItemId() != 0) {
            return false;
        }
        MediaPickerFragment mediaPickerFragment = this.A03;
        mediaPickerFragment.A1P(mediaPickerFragment.A0J);
        return false;
    }

    public final boolean APA(Menu menu, AnonymousClass05J r6) {
        TextView textView = this.A02;
        r6.A09(textView);
        if (Build.VERSION.SDK_INT < 21) {
            return true;
        }
        Context context = this.A01;
        C13680ns.A0v(context, textView, R.color.color045f);
        Window window = this.A03.A0D().getWindow();
        int A002 = AnonymousClass00T.A00(context, R.color.color045d);
        return true;
    }

    public final void APd(AnonymousClass05J r4) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A02.removeCallbacks(runnable);
        }
        MediaPickerFragment mediaPickerFragment = this.A03;
        if (mediaPickerFragment.A0E) {
            mediaPickerFragment.A0D().finish();
        }
        mediaPickerFragment.A05 = null;
        mediaPickerFragment.A1N();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = mediaPickerFragment.A0D().getWindow();
            int A002 = AnonymousClass00T.A00(this.A01, R.color.color0092);
        }
    }

    public boolean AV8(Menu menu, AnonymousClass05J r10) {
        String quantityString;
        MediaPickerFragment mediaPickerFragment = this.A03;
        HashSet hashSet = mediaPickerFragment.A0J;
        if (hashSet.isEmpty()) {
            quantityString = mediaPickerFragment.A0J(R.string.str14cd);
        } else {
            Resources A032 = mediaPickerFragment.A03();
            int size = hashSet.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, hashSet.size(), 0);
            quantityString = A032.getQuantityString(R.plurals.plurals00e1, size, objArr);
        }
        TextView textView = this.A02;
        textView.setText(quantityString);
        if (this.A00 == null && !textView.isSelected()) {
            RunnableRunnableShape20S0100000_I1_3 runnableRunnableShape20S0100000_I1_3 = new RunnableRunnableShape20S0100000_I1_3(this, 19);
            this.A00 = runnableRunnableShape20S0100000_I1_3;
            textView.postDelayed(runnableRunnableShape20S0100000_I1_3, 1000);
        }
        return true;
    }
}
