package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import java.lang.reflect.Constructor;

/* renamed from: X.081  reason: invalid class name */
public class AnonymousClass081 {
    public static final String LOG_TAG = "AppCompatViewInflater";
    public static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final AnonymousClass00O sConstructorMap = new AnonymousClass00O();
    public static final Class[] sConstructorSignature = {Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = {16843375};
    public final Object[] mConstructorArgs = new Object[2];

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C06880Yg(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        AnonymousClass00O r3 = sConstructorMap;
        Constructor<? extends U> constructor = (Constructor) r3.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            r3.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        View view;
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i2 = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i2 < strArr.length) {
                        view = createViewByPrefix(context, str, strArr[i2]);
                        if (view != null) {
                            break;
                        }
                        i2++;
                    } else {
                        Object[] objArr2 = this.mConstructorArgs;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                view = createViewByPrefix(context, str, (String) null);
            }
            return view;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.mConstructorArgs;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    public static Context themifyContext(Context context, AttributeSet attributeSet, boolean z2, boolean z3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass05L.A0O, 0, 0);
        int resourceId = z2 ? obtainStyledAttributes.getResourceId(0, 0) : 0;
        if (z3 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(4, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof AnonymousClass06V) && ((AnonymousClass06V) context).A00 == resourceId)) ? context : new AnonymousClass06V(context, resourceId);
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    public AnonymousClass049 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AnonymousClass049(context, attributeSet);
    }

    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AnonymousClass0C6 createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new AnonymousClass0C6(context, attributeSet);
    }

    public AnonymousClass014 createEditText(Context context, AttributeSet attributeSet) {
        return new AnonymousClass014(context, attributeSet);
    }

    public AnonymousClass06z createImageButton(Context context, AttributeSet attributeSet) {
        return new AnonymousClass06z(context, attributeSet);
    }

    public C006002o createImageView(Context context, AttributeSet attributeSet) {
        return new C006002o(context, attributeSet);
    }

    public AnonymousClass0CX createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AnonymousClass0CX(context, attributeSet);
    }

    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public C02470Ca createRatingBar(Context context, AttributeSet attributeSet) {
        return new C02470Ca(context, attributeSet);
    }

    public AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public AnonymousClass02Z createTextView(Context context, AttributeSet attributeSet) {
        return new AnonymousClass02Z(context, attributeSet);
    }

    public AnonymousClass0Cd createToggleButton(Context context, AttributeSet attributeSet) {
        return new AnonymousClass0Cd(context, attributeSet);
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r0 != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(android.view.View r3, java.lang.String r4, android.content.Context r5, android.util.AttributeSet r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        /*
            r2 = this;
            if (r7 == 0) goto L_0x00f6
            if (r3 == 0) goto L_0x00f6
            android.content.Context r1 = r3.getContext()
        L_0x0008:
            if (r8 != 0) goto L_0x000c
            if (r9 == 0) goto L_0x0010
        L_0x000c:
            android.content.Context r1 = themifyContext(r1, r6, r8, r9)
        L_0x0010:
            if (r10 == 0) goto L_0x0016
            android.content.Context r1 = X.AnonymousClass08O.A00(r1)
        L_0x0016:
            int r0 = r4.hashCode()
            switch(r0) {
                case -1946472170: goto L_0x002a;
                case -1455429095: goto L_0x0038;
                case -1346021293: goto L_0x0046;
                case -938935918: goto L_0x0054;
                case -937446323: goto L_0x0062;
                case -658531749: goto L_0x0070;
                case -339785223: goto L_0x007e;
                case 776382189: goto L_0x008c;
                case 799298502: goto L_0x009a;
                case 1125864064: goto L_0x00a9;
                case 1413872058: goto L_0x00b8;
                case 1601505219: goto L_0x00c7;
                case 1666676343: goto L_0x00d6;
                case 2001146706: goto L_0x00e5;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = 0
            if (r5 == r1) goto L_0x0029
            android.view.View r0 = r2.createViewFromTag(r1, r4, r6)
            if (r0 == 0) goto L_0x0029
        L_0x0026:
            r2.checkOnClickListener(r0, r6)
        L_0x0029:
            return r0
        L_0x002a:
            java.lang.String r0 = "RatingBar"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.0Ca r0 = new X.0Ca
            r0.<init>(r1, r6)
            goto L_0x0026
        L_0x0038:
            java.lang.String r0 = "CheckedTextView"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.0C6 r0 = new X.0C6
            r0.<init>(r1, r6)
            goto L_0x0026
        L_0x0046:
            java.lang.String r0 = "MultiAutoCompleteTextView"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.0CX r0 = new X.0CX
            r0.<init>(r1, r6)
            goto L_0x0026
        L_0x0054:
            java.lang.String r0 = "TextView"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.02Z r0 = new X.02Z
            r0.<init>(r1, r6)
            goto L_0x0026
        L_0x0062:
            java.lang.String r0 = "ImageButton"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.06z r0 = new X.06z
            r0.<init>(r1, r6)
            goto L_0x0026
        L_0x0070:
            java.lang.String r0 = "SeekBar"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            androidx.appcompat.widget.AppCompatSeekBar r0 = new androidx.appcompat.widget.AppCompatSeekBar
            r0.<init>(r1, r6)
            goto L_0x0026
        L_0x007e:
            java.lang.String r0 = "Spinner"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            androidx.appcompat.widget.AppCompatSpinner r0 = new androidx.appcompat.widget.AppCompatSpinner
            r0.<init>((android.content.Context) r1, (android.util.AttributeSet) r6)
            goto L_0x0026
        L_0x008c:
            java.lang.String r0 = "RadioButton"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            androidx.appcompat.widget.AppCompatRadioButton r0 = new androidx.appcompat.widget.AppCompatRadioButton
            r0.<init>(r1, r6)
            goto L_0x0026
        L_0x009a:
            java.lang.String r0 = "ToggleButton"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.0Cd r0 = new X.0Cd
            r0.<init>(r1, r6)
            goto L_0x0026
        L_0x00a9:
            java.lang.String r0 = "ImageView"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.02o r0 = new X.02o
            r0.<init>(r1, r6)
            goto L_0x0026
        L_0x00b8:
            java.lang.String r0 = "AutoCompleteTextView"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.049 r0 = new X.049
            r0.<init>(r1, r6)
            goto L_0x0026
        L_0x00c7:
            java.lang.String r0 = "CheckBox"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            androidx.appcompat.widget.AppCompatCheckBox r0 = new androidx.appcompat.widget.AppCompatCheckBox
            r0.<init>(r1, r6)
            goto L_0x0026
        L_0x00d6:
            java.lang.String r0 = "EditText"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.014 r0 = new X.014
            r0.<init>(r1, r6)
            goto L_0x0026
        L_0x00e5:
            java.lang.String r0 = "Button"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001d
            androidx.appcompat.widget.AppCompatButton r0 = r2.createButton(r1, r6)
            r2.verifyNotNull(r0, r4)
            goto L_0x0026
        L_0x00f6:
            r1 = r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass081.createView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }
}
