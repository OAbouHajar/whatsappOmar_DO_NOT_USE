package X;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: X.09R  reason: invalid class name */
public class AnonymousClass09R {
    public final int A00;
    public final ColorStateList A01;
    public final Configuration A02;

    public AnonymousClass09R(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.A01 = colorStateList;
        this.A02 = configuration;
        this.A00 = theme == null ? 0 : theme.hashCode();
    }
}
