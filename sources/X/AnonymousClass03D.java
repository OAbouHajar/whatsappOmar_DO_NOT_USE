package X;

import android.content.ComponentName;

/* renamed from: X.03D  reason: invalid class name */
public final class AnonymousClass03D {
    public final ComponentName A00;

    public AnonymousClass03D(ComponentName componentName) {
        C18450wi.A0H(componentName, 1);
        this.A00 = componentName;
        String packageName = componentName.getPackageName();
        C18450wi.A0B(packageName);
        String className = componentName.getClassName();
        C18450wi.A0B(className);
        int length = packageName.length();
        if (length > 0) {
            int length2 = className.length();
            if (length2 <= 0) {
                throw new IllegalArgumentException("Activity class name must not be empty.");
            } else if (C008603x.A0F(packageName, "*") && C008603x.A03(packageName, "*", 0) != length - 1) {
                throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
            } else if (C008603x.A0F(className, "*") && C008603x.A03(className, "*", 0) != length2 - 1) {
                throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
            }
        } else {
            throw new IllegalArgumentException("Package name must not be empty");
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass03D) && C18450wi.A0R(this.A00, ((AnonymousClass03D) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ActivityFilter(componentName=");
        sb.append(this.A00);
        sb.append(", intentAction=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }
}
