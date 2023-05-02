package com.mod.bomfab.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import com.mod.bomfab.colorpicker.AmbilWarnaDialog;
import com.mod.bomfab.utils.Tools;

public class ColorPickerPreference extends Preference {
    int value;

    private static class SavedState extends Preference.BaseSavedState {
        @SuppressWarnings("unused")
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public /* bridge */ Object createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            public /* bridge */ Object[] newArray(int i2) {
                return newArray(i2);
            }
        };
        int value;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.value = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.value);
        }
    }

    public ColorPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        setWidgetLayoutResource(Tools.intLayout("delta_color_preference"));
    }

    public void forceSetValue(int i2) {
        this.value = i2;
        persistInt(i2);
        notifyChanged();
    }

    public CharSequence getRawSummary() {
        return super.getSummary();
    }

    @Override
    public CharSequence getSummary() {
        CharSequence summary = super.getSummary();
        if (summary == null) {
            return null;
        }
        return String.format(summary.toString(), new Object[]{String.format("#%08x", new Object[]{new Integer(this.value)})});
    }

    /* access modifiers changed from: protected */
    @Override
    public void onBindView(View view) {
        super.onBindView(view);
        view.findViewById(Tools.intId("color_view")).setBackgroundDrawable(new CircleColorDrawable(this.value));
    }

    /* access modifiers changed from: protected */
    @Override
    public void onClick() {
        new AmbilWarnaDialog(getContext(), this.value, new AmbilWarnaDialog.OnAmbilWarnaListener(this) {
            private final ColorPickerPreference this$0;

            {
                this.this$0 = r1;
            }

            static ColorPickerPreference access$0(AnonymousClass100000000 r1) {
                return r1.this$0;
            }

            @Override
            public void onCancel(AmbilWarnaDialog ambilWarnaDialog) {
            }

            @Override
            public void onOk(AmbilWarnaDialog ambilWarnaDialog, int i2) {
                if (this.this$0.callChangeListener(new Integer(i2))) {
                    this.this$0.value = i2;
                    boolean unused = this.this$0.persistInt(this.this$0.value);
                    this.this$0.notifyChanged();
                    this.this$0.value = i2;
                }
            }
        }).show();
    }

    /* access modifiers changed from: protected */
    @Override
    public Object onGetDefaultValue(TypedArray typedArray, int i2) {
        return new Integer(typedArray.getInteger(i2, 0));
    }

    /* access modifiers changed from: protected */
    @Override
    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            if (!parcelable.getClass().equals(Class.forName("com.mod.bomfab.colorpicker.ColorPickerPreference$SavedState"))) {
                super.onRestoreInstanceState(parcelable);
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.value = savedState.value;
            notifyChanged();
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    @Override
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.value = this.value;
        return savedState;
    }

    /* access modifiers changed from: protected */
    @Override
    public void onSetInitialValue(boolean z2, Object obj) {
        if (z2) {
            this.value = getPersistedInt(this.value);
            return;
        }
        int intValue = ((Integer) obj).intValue();
        this.value = intValue;
        persistInt(intValue);
    }

    public void setValue(int i2) {
        if (callChangeListener(new Integer(i2))) {
            persistInt(i2);
            notifyChanged();
        }
    }
}
