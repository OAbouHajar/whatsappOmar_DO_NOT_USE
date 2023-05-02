package X;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: X.05c  reason: invalid class name and case insensitive filesystem */
public final class C010705c extends C010805d implements AnonymousClass04o {
    public Application A00;
    public Bundle A01;
    public C009704q A02;
    public AnonymousClass05X A03;
    public final AnonymousClass04o A04;

    public C010705c() {
        this.A04 = new AnonymousClass0F7();
    }

    public C010705c(Application application, Bundle bundle, C001600r r4) {
        this.A03 = r4.AFh();
        this.A02 = r4.getLifecycle();
        this.A01 = bundle;
        this.A00 = application;
        this.A04 = application != null ? A00(application) : new AnonymousClass0F7();
    }

    public static final AnonymousClass0F7 A00(Application application) {
        AnonymousClass0F7 r0 = AnonymousClass0F7.A01;
        if (r0 == null) {
            r0 = new AnonymousClass0F7(application);
            AnonymousClass0F7.A01 = r0;
        }
        C18450wi.A0F(r0);
        return r0;
    }

    public void A01(C003401n r3) {
        C009704q r1 = this.A02;
        if (r1 != null) {
            AnonymousClass07H.A00(r1, r3, this.A03);
        }
    }

    public final C003401n A02(Class cls, String str) {
        Object[] objArr;
        Application application;
        C009704q r7 = this.A02;
        if (r7 != null) {
            boolean isAssignableFrom = AnonymousClass02H.class.isAssignableFrom(cls);
            Constructor A002 = AnonymousClass0TV.A00(cls, (!isAssignableFrom || this.A00 == null) ? AnonymousClass0TV.A01 : AnonymousClass0TV.A00);
            if (A002 == null) {
                return this.A00 != null ? this.A04.A6s(cls) : C014106t.A00().A6s(cls);
            }
            AnonymousClass05X r2 = this.A03;
            SavedStateHandleController savedStateHandleController = new SavedStateHandleController(C019609c.A00(r2.A01(str), this.A01), str);
            savedStateHandleController.A00(r7, r2);
            AnonymousClass07H.A01(r7, r2);
            if (!isAssignableFrom || (application = this.A00) == null) {
                objArr = new Object[]{savedStateHandleController.A01};
            } else {
                C18450wi.A0F(application);
                objArr = new Object[]{application, savedStateHandleController.A01};
            }
            try {
                C003401n r1 = (C003401n) A002.newInstance(Arrays.copyOf(objArr, objArr.length));
                r1.A01(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
                return r1;
            } catch (IllegalAccessException e2) {
                StringBuilder sb = new StringBuilder("Failed to access ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e2);
            } catch (InstantiationException e3) {
                StringBuilder sb2 = new StringBuilder("A ");
                sb2.append(cls);
                sb2.append(" cannot be instantiated.");
                throw new RuntimeException(sb2.toString(), e3);
            } catch (InvocationTargetException e4) {
                StringBuilder sb3 = new StringBuilder("An exception happened in constructor of ");
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e4.getCause());
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public C003401n A6s(Class cls) {
        C18450wi.A0H(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return A02(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C003401n A73(C013806q r4, Class cls) {
        C18450wi.A0H(cls, 0);
        C18450wi.A0H(r4, 1);
        String str = (String) r4.A00(C014206u.A01);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (r4.A00(C05820Td.A01) != null && r4.A00(C05820Td.A02) != null) {
            Object A002 = r4.A00(AnonymousClass0F7.A02);
            boolean isAssignableFrom = AnonymousClass02H.class.isAssignableFrom(cls);
            if (AnonymousClass0TV.A00(cls, (!isAssignableFrom || A002 == null) ? AnonymousClass0TV.A01 : AnonymousClass0TV.A00) == null) {
                return this.A04.A73(r4, cls);
            }
            if (!isAssignableFrom || A002 == null) {
                C05820Td.A00(r4);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            C05820Td.A00(r4);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (this.A02 != null) {
            return A02(cls, str);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }
}
