package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass0FM;
import X.AnonymousClass0Fp;
import X.AnonymousClass0NL;
import X.AnonymousClass0ZC;
import X.C06910Yj;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.obwhatsapp.R;

public class SeekBarPreference extends Preference {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View.OnKeyListener A04 = new C06910Yj(this);
    public SeekBar.OnSeekBarChangeListener A05 = new AnonymousClass0ZC(this);
    public SeekBar A06;
    public TextView A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.attr0441, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0NL.A0A, R.attr.attr0441, 0);
        this.A01 = obtainStyledAttributes.getInt(3, 0);
        int i2 = obtainStyledAttributes.getInt(1, 100);
        int i3 = this.A01;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.A00) {
            this.A00 = i2;
            A04();
        }
        int i4 = obtainStyledAttributes.getInt(4, 0);
        if (i4 != this.A02) {
            this.A02 = Math.min(this.A00 - this.A01, Math.abs(i4));
            A04();
        }
        this.A08 = obtainStyledAttributes.getBoolean(2, true);
        this.A09 = obtainStyledAttributes.getBoolean(5, false);
        this.A0B = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public Parcelable A01() {
        this.A0P = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0X) {
            return absSavedState;
        }
        AnonymousClass0FM r1 = new AnonymousClass0FM((Parcelable) absSavedState);
        r1.A02 = this.A03;
        r1.A01 = this.A01;
        r1.A00 = this.A00;
        return r1;
    }

    public Object A03(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }

    public void A0D(Parcelable parcelable) {
        if (!parcelable.getClass().equals(AnonymousClass0FM.class)) {
            super.A0D(parcelable);
            return;
        }
        AnonymousClass0FM r3 = (AnonymousClass0FM) parcelable;
        super.A0D(r3.getSuperState());
        this.A03 = r3.A02;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        A04();
    }

    public void A0J(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int A0D = AnonymousClass000.A0D(obj);
        if (A0P()) {
            A0D = this.A0F.A01().getInt(this.A0L, A0D);
        }
        A0S(A0D, true);
    }

    public void A0R(AnonymousClass0Fp r4) {
        super.A0R(r4);
        r4.A0H.setOnKeyListener(this.A04);
        this.A06 = (SeekBar) r4.A07(R.id.seekbar);
        TextView textView = (TextView) r4.A07(R.id.seekbar_value);
        this.A07 = textView;
        if (this.A09) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.A07 = null;
        }
        SeekBar seekBar = this.A06;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.A05);
        this.A06.setMax(this.A00 - this.A01);
        int i2 = this.A02;
        SeekBar seekBar2 = this.A06;
        if (i2 != 0) {
            seekBar2.setKeyProgressIncrement(i2);
        } else {
            this.A02 = seekBar2.getKeyProgressIncrement();
        }
        this.A06.setProgress(this.A03 - this.A01);
        int i3 = this.A03;
        TextView textView2 = this.A07;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i3));
        }
        this.A06.setEnabled(A0N());
    }

    public final void A0S(int i2, boolean z2) {
        int i3 = this.A01;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = this.A00;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i2 != this.A03) {
            this.A03 = i2;
            TextView textView = this.A07;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
            }
            if (A0P()) {
                int i5 = i2 ^ -1;
                if (A0P()) {
                    i5 = this.A0F.A01().getInt(this.A0L, i5);
                }
                if (i2 != i5) {
                    SharedPreferences.Editor A002 = this.A0F.A00();
                    A002.putInt(this.A0L, i2);
                    if (!this.A0F.A09) {
                        A002.apply();
                    }
                }
            }
            if (z2) {
                A04();
            }
        }
    }

    public void A0T(SeekBar seekBar) {
        int progress = this.A01 + seekBar.getProgress();
        if (progress != this.A03) {
            A0Q(Integer.valueOf(progress));
            A0S(progress, false);
        }
    }
}
