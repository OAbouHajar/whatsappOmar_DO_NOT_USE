package com.google.gson.internal.bind;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* compiled from: XFMFile */
public final class i implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f391a;

    public i(Class cls) {
        this.f391a = cls;
    }

    public final Object run() {
        Field[] declaredFields = this.f391a.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}
