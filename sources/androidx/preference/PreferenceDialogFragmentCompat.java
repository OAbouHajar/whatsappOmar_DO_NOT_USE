package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass01A;
import X.C001000l;
import X.C005302h;
import X.C005702l;
import X.C006302t;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;

public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {
    public int A00;
    public int A01;
    public BitmapDrawable A02;
    public DialogPreference A03;
    public CharSequence A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;

    public void A0s(Bundle bundle) {
        super.A0s(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.A05);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.A07);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.A06);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.A04);
        bundle.putInt("PreferenceDialogFragment.layout", this.A00);
        BitmapDrawable bitmapDrawable = this.A02;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public void A17(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.A17(bundle);
        AnonymousClass01A A09 = A09();
        if (A09 instanceof C006302t) {
            C006302t r2 = (C006302t) A09;
            String string = this.A05.getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) r2.A92(string);
                this.A03 = dialogPreference;
                this.A05 = dialogPreference.A03;
                this.A07 = dialogPreference.A05;
                this.A06 = dialogPreference.A04;
                this.A04 = dialogPreference.A02;
                this.A00 = dialogPreference.A00;
                Drawable drawable = dialogPreference.A01;
                if (drawable == null || (drawable instanceof BitmapDrawable)) {
                    bitmapDrawable = (BitmapDrawable) drawable;
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmapDrawable = new BitmapDrawable(A02().getResources(), createBitmap);
                }
                this.A02 = bitmapDrawable;
                return;
            }
            this.A05 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.A07 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.A06 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.A04 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.A00 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.A02 = new BitmapDrawable(A02().getResources(), bitmap);
                return;
            }
            return;
        }
        throw AnonymousClass000.A0V("Target fragment must implement TargetFragment interface");
    }

    public Dialog A1B(Bundle bundle) {
        View inflate;
        C001000l A0C = A0C();
        this.A01 = -2;
        C005302h r3 = new C005302h(A0C);
        r3.setTitle(this.A05);
        r3.A01.A0A = this.A02;
        r3.A09(this, this.A07);
        r3.A08(this, this.A06);
        int i2 = this.A00;
        if (i2 == 0 || (inflate = A05().inflate(i2, (ViewGroup) null)) == null) {
            r3.A06(this.A04);
        } else {
            A1K(inflate);
            r3.setView(inflate);
        }
        A1L(r3);
        C005702l create = r3.create();
        if (A1N()) {
            create.getWindow().setSoftInputMode(5);
        }
        return create;
    }

    public DialogPreference A1J() {
        DialogPreference dialogPreference = this.A03;
        if (dialogPreference != null) {
            return dialogPreference;
        }
        DialogPreference dialogPreference2 = (DialogPreference) ((C006302t) A09()).A92(this.A05.getString("key"));
        this.A03 = dialogPreference2;
        return dialogPreference2;
    }

    public void A1K(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.A04;
            int i2 = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i2 = 0;
            }
            if (findViewById.getVisibility() != i2) {
                findViewById.setVisibility(i2);
            }
        }
    }

    public void A1L(C005302h r1) {
    }

    public abstract void A1M(boolean z2);

    public boolean A1N() {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        this.A01 = i2;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        A1M(AnonymousClass000.A1R(this.A01, -1));
    }
}
