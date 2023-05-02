package X;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: X.0YY  reason: invalid class name */
public class AnonymousClass0YY implements MenuItem.OnMenuItemClickListener {
    public static final Class[] A02 = {MenuItem.class};
    public Object A00;
    public Method A01;

    public AnonymousClass0YY(Object obj, String str) {
        this.A00 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.A01 = cls.getMethod(str, A02);
        } catch (Exception e2) {
            StringBuilder A0r = AnonymousClass000.A0r("Couldn't resolve menu item onClick handler ");
            A0r.append(str);
            A0r.append(" in class ");
            InflateException inflateException = new InflateException(AnonymousClass000.A0h(cls.getName(), A0r));
            inflateException.initCause(e2);
            throw inflateException;
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        try {
            Method method = this.A01;
            if (method.getReturnType() == Boolean.TYPE) {
                return AnonymousClass000.A1Z(this.A00, method, new Object[]{menuItem});
            }
            method.invoke(this.A00, new Object[]{menuItem});
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
