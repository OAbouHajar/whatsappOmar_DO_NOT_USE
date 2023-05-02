package X;

import android.os.Bundle;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.extension.WamCallExtended;
import com.whatsapp.fieldstats.extension.WamCallExtendedField;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.0w0  reason: invalid class name and case insensitive filesystem */
public class C18010w0 {
    public final C17990vy A00;
    public final C16490t9 A01;

    public C18010w0(C17990vy r1, C16490t9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static Bundle A00(Object obj) {
        Bundle bundle = new Bundle();
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        if (WamCallExtended.class == cls && cls.getSuperclass() != null) {
            Collections.addAll(arrayList, cls.getSuperclass().getDeclaredFields());
        }
        Collections.addAll(arrayList, declaredFields);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers)) {
                String name = field.getName();
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        if (obj2 instanceof Double) {
                            bundle.putDouble(name, ((Number) obj2).doubleValue());
                        } else if (obj2 instanceof Integer) {
                            bundle.putInt(name, ((Number) obj2).intValue());
                        } else if (obj2 instanceof Long) {
                            bundle.putLong(name, ((Number) obj2).longValue());
                        } else if (obj2 instanceof Boolean) {
                            bundle.putBoolean(name, ((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof String) {
                            bundle.putString(name, (String) obj2);
                        } else if (!name.equals("fields") || !(obj2 instanceof ArrayList)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unexpected member ");
                            sb.append(name);
                            sb.append(" in fieldstats event, only Double, Integer, and String members are supported");
                            AnonymousClass00B.A08(sb.toString());
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = ((AbstractCollection) obj2).iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                if (next instanceof WamCallExtendedField) {
                                    arrayList2.add(next);
                                }
                            }
                            bundle.putParcelableArrayList(name, arrayList2);
                        }
                    }
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException(e2);
                }
            }
        }
        return bundle;
    }

    public static void A01(Bundle bundle, Object obj) {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        if (WamCallExtended.class == cls && cls.getSuperclass() != null) {
            Collections.addAll(arrayList, cls.getSuperclass().getDeclaredFields());
        }
        Collections.addAll(arrayList, declaredFields);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers) && !Modifier.isFinal(modifiers)) {
                String name = field.getName();
                AnonymousClass00B.A06(bundle);
                try {
                    field.set(obj, bundle.get(name));
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException(e2);
                }
            }
        }
    }

    public void A02(WamCall wamCall, boolean z2) {
        this.A00.A01 = wamCall;
        Long l2 = wamCall.logSampleRatio;
        long longValue = l2 == null ? 1 : l2.longValue();
        wamCall.logSampleRatio = null;
        C16490t9 r1 = this.A01;
        r1.A07(wamCall, (int) longValue);
        if (z2) {
            r1.A01();
        }
    }
}
