package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.AssemMods.fakechat.utils.AppUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0SG  reason: invalid class name */
public abstract class AnonymousClass0SG {
    public final AnonymousClass00N A00;
    public final AnonymousClass00N A01;
    public final AnonymousClass00N A02;

    public AnonymousClass0SG(AnonymousClass00N r1, AnonymousClass00N r2, AnonymousClass00N r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public int A00(int i2, int i3) {
        return A09(i3) ? ((AnonymousClass0GW) this).A05.readInt() : i2;
    }

    public Parcelable A01(Parcelable parcelable, int i2) {
        if (!A09(i2)) {
            return parcelable;
        }
        AnonymousClass0GW r0 = (AnonymousClass0GW) this;
        return r0.A05.readParcelable(r0.getClass().getClassLoader());
    }

    public abstract AnonymousClass0SG A02();

    public AnonymousClass04J A03() {
        String readString = ((AnonymousClass0GW) this).A05.readString();
        if (readString == null) {
            return null;
        }
        AnonymousClass0SG A022 = A02();
        Class<AnonymousClass0SG> cls = AnonymousClass0SG.class;
        try {
            AnonymousClass00N r3 = this.A01;
            Method method = (Method) r3.get(readString);
            if (method == null) {
                System.currentTimeMillis();
                method = Class.forName(readString, true, cls.getClassLoader()).getDeclaredMethod(AppUtils.HANDLER_READ_KEY, new Class[]{cls});
                r3.put(readString, method);
            }
            return (AnonymousClass04J) method.invoke((Object) null, AnonymousClass000.A1a(A022));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw e3.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public final Class A04(Class cls) {
        AnonymousClass00N r5 = this.A00;
        String name = cls.getName();
        Class cls2 = (Class) r5.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        r5.put(name, cls3);
        return cls3;
    }

    public abstract void A05(int i2);

    public void A06(int i2, int i3) {
        A05(i3);
        ((AnonymousClass0GW) this).A05.writeInt(i2);
    }

    public void A07(Parcelable parcelable, int i2) {
        A05(i2);
        ((AnonymousClass0GW) this).A05.writeParcelable(parcelable, 0);
    }

    public void A08(AnonymousClass04J r9) {
        if (r9 == null) {
            ((AnonymousClass0GW) this).A05.writeString((String) null);
            return;
        }
        try {
            Class<?> cls = r9.getClass();
            ((AnonymousClass0GW) this).A05.writeString(A04(cls).getName());
            AnonymousClass0SG A022 = A02();
            try {
                AnonymousClass00N r6 = this.A02;
                String name = cls.getName();
                Method method = (Method) r6.get(name);
                if (method == null) {
                    Class A04 = A04(cls);
                    System.currentTimeMillis();
                    method = A04.getDeclaredMethod("write", new Class[]{cls, AnonymousClass0SG.class});
                    r6.put(name, method);
                }
                Object[] objArr = new Object[2];
                AnonymousClass000.A1E(r9, A022, objArr);
                method.invoke((Object) null, objArr);
                AnonymousClass0GW r4 = (AnonymousClass0GW) A022;
                int i2 = r4.A00;
                if (i2 >= 0) {
                    int i3 = r4.A06.get(i2);
                    Parcel parcel = r4.A05;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i3);
                    parcel.writeInt(dataPosition - i3);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (InvocationTargetException e3) {
                if (e3.getCause() instanceof RuntimeException) {
                    throw e3.getCause();
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(AnonymousClass000.A0h(" does not have a Parcelizer", AnonymousClass000.A0p(r9)), e6);
        }
    }

    public abstract boolean A09(int i2);
}
