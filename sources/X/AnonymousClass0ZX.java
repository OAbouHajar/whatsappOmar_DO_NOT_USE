package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0ZX  reason: invalid class name */
public class AnonymousClass0ZX implements C13400ly, DialogInterface.OnClickListener {
    public ListAdapter A00;
    public C005702l A01;
    public CharSequence A02;
    public final /* synthetic */ AppCompatSpinner A03;

    public AnonymousClass0ZX(AppCompatSpinner appCompatSpinner) {
        this.A03 = appCompatSpinner;
    }

    public Drawable AA0() {
        return null;
    }

    public CharSequence ACd() {
        return this.A02;
    }

    public int ACe() {
        return 0;
    }

    public int AGt() {
        return 0;
    }

    public boolean AJh() {
        C005702l r0 = this.A01;
        if (r0 != null) {
            return r0.isShowing();
        }
        return false;
    }

    public void AdW(ListAdapter listAdapter) {
        this.A00 = listAdapter;
    }

    public void Adb(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    public void Ae1(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public void Ae2(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    public void AeQ(CharSequence charSequence) {
        this.A02 = charSequence;
    }

    public void Aex(int i2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public void AfU(int i2, int i3) {
        if (this.A00 != null) {
            AppCompatSpinner appCompatSpinner = this.A03;
            C005302h r3 = new C005302h(appCompatSpinner.A04);
            CharSequence charSequence = this.A02;
            if (charSequence != null) {
                r3.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.A00;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            AnonymousClass0PG r1 = r3.A01;
            r1.A0D = listAdapter;
            r1.A05 = this;
            r1.A00 = selectedItemPosition;
            r1.A0L = true;
            C005702l create = r3.create();
            this.A01 = create;
            ListView listView = create.A00.A0J;
            if (Build.VERSION.SDK_INT >= 17) {
                listView.setTextDirection(i2);
                listView.setTextAlignment(i3);
            }
            this.A01.show();
        }
    }

    public void dismiss() {
        C005702l r0 = this.A01;
        if (r0 != null) {
            r0.dismiss();
            this.A01 = null;
        }
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        AppCompatSpinner appCompatSpinner = this.A03;
        appCompatSpinner.setSelection(i2);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick((View) null, i2, this.A00.getItemId(i2));
        }
        dismiss();
    }
}
