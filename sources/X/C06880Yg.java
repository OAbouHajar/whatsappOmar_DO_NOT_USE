package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Yg  reason: invalid class name and case insensitive filesystem */
public class C06880Yg implements View.OnClickListener {
    public Context A00;
    public Method A01;
    public final View A02;
    public final String A03;

    public C06880Yg(View view, String str) {
        this.A02 = view;
        this.A03 = str;
    }

    public void onClick(View view) {
        String A0h;
        Method method = this.A01;
        if (method == null) {
            View view2 = this.A02;
            for (Context context = view2.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
                try {
                    if (!context.isRestricted() && (method = AnonymousClass000.A0s(context.getClass(), View.class, this.A03, new Class[1], 0)) != null) {
                        this.A01 = method;
                        this.A00 = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
            }
            int id = view2.getId();
            if (id == -1) {
                A0h = "";
            } else {
                StringBuilder A0r = AnonymousClass000.A0r(" with id '");
                A0r.append(view2.getContext().getResources().getResourceEntryName(id));
                A0h = AnonymousClass000.A0h("'", A0r);
            }
            StringBuilder A0r2 = AnonymousClass000.A0r("Could not find method ");
            A0r2.append(this.A03);
            A0r2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            A0r2.append(view2.getClass());
            throw AnonymousClass000.A0V(AnonymousClass000.A0h(A0h, A0r2));
        }
        try {
            method.invoke(this.A00, AnonymousClass000.A1a(view));
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
