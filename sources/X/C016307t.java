package X;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;

/* renamed from: X.07t  reason: invalid class name and case insensitive filesystem */
public abstract class C016307t extends C010805d implements AnonymousClass04o {
    public Bundle A00;
    public C009704q A01;
    public AnonymousClass05X A02;

    public C016307t(Bundle bundle, C001600r r3) {
        this.A02 = r3.AFh();
        this.A01 = r3.getLifecycle();
        this.A00 = bundle;
    }

    public void A01(C003401n r3) {
        AnonymousClass07H.A00(this.A01, r3, this.A02);
    }

    public abstract C003401n A02(C016407u r1, Class cls, String str);

    public final C003401n A03(Class cls, String str) {
        AnonymousClass05X r4 = this.A02;
        C009704q r3 = this.A01;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(C019609c.A00(r4.A01(str), this.A00), str);
        savedStateHandleController.A00(r3, r4);
        AnonymousClass07H.A01(r3, r4);
        C003401n A022 = A02(savedStateHandleController.A01, cls, str);
        A022.A01(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
        return A022;
    }

    public final C003401n A6s(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.A01 != null) {
            return A03(cls, canonicalName);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public final C003401n A73(C013806q r3, Class cls) {
        String str = (String) r3.A00(C014206u.A01);
        if (str != null) {
            return A03(cls, str);
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }
}
