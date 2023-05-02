package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0XL  reason: invalid class name */
public final class AnonymousClass0XL {
    public static final Map A00;
    public static final Map A01;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        A01 = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        A00 = arrayMap2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        if ((r9 instanceof java.lang.String) != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle A00(X.C09140ey r8, java.lang.Object r9, java.lang.String r10) {
        /*
            if (r9 == 0) goto L_0x001c
            boolean r0 = r8.A04(r9)
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "Found cycle while bundling type "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0c(r9)
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            X.0Db r0 = new X.0Db
            r0.<init>(r8, r1)
            throw r0
        L_0x001c:
            X.0ey r2 = X.C09140ey.A01(r8, r9, r10)
            if (r9 == 0) goto L_0x02be
            boolean r0 = r9 instanceof androidx.core.graphics.drawable.IconCompat     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x003f
            androidx.core.graphics.drawable.IconCompat r9 = (androidx.core.graphics.drawable.IconCompat) r9     // Catch:{ all -> 0x02d7 }
            r0 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02d7 }
            r6.<init>(r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = "tag_class_type"
            r0 = 6
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02d7 }
            android.os.Bundle r1 = r9.A0B()     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "tag_value"
            r6.putBundle(r0, r1)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x003f:
            boolean r4 = r9 instanceof java.lang.Boolean     // Catch:{ all -> 0x02d7 }
            if (r4 != 0) goto L_0x0064
            boolean r0 = r9 instanceof java.lang.Byte     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x0064
            boolean r0 = r9 instanceof java.lang.Character     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x0064
            boolean r0 = r9 instanceof java.lang.Short     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x0064
            boolean r0 = r9 instanceof java.lang.Integer     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x0064
            boolean r0 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x0064
            boolean r0 = r9 instanceof java.lang.Double     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x0064
            boolean r0 = r9 instanceof java.lang.Float     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x0064
            boolean r1 = r9 instanceof java.lang.String     // Catch:{ all -> 0x02d7 }
            r0 = 0
            if (r1 == 0) goto L_0x0065
        L_0x0064:
            r0 = 1
        L_0x0065:
            if (r0 != 0) goto L_0x0219
            boolean r0 = r9 instanceof android.os.Parcelable     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x0219
            boolean r0 = r9 instanceof android.os.IInterface     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x0091
            android.os.IInterface r9 = (android.os.IInterface) r9     // Catch:{ all -> 0x02d7 }
            r0 = 3
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02d7 }
            r6.<init>(r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r3 = X.AnonymousClass000.A0d(r9)     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = "tag_class_type"
            r0 = 1
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02d7 }
            android.os.IBinder r1 = r9.asBinder()     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "tag_value"
            r6.putBinder(r0, r1)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "tag_class_name"
            r6.putString(r0, r3)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x0091:
            boolean r0 = r9 instanceof android.os.IBinder     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x00ab
            android.os.IBinder r9 = (android.os.IBinder) r9     // Catch:{ all -> 0x02d7 }
            r0 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02d7 }
            r6.<init>(r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = "tag_class_type"
            r0 = 9
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "tag_value"
            r6.putBinder(r0, r9)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x00ab:
            boolean r0 = r9 instanceof java.util.Map     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x011d
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x02d7 }
            r4 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02d7 }
            r6.<init>(r4)     // Catch:{ all -> 0x02d7 }
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02d7 }
            java.util.Iterator r10 = X.AnonymousClass000.A0y(r9)     // Catch:{ all -> 0x02d7 }
            r7 = 0
        L_0x00c0:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x0111
            java.util.Map$Entry r9 = X.AnonymousClass000.A0z(r10)     // Catch:{ all -> 0x02d7 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x02d7 }
            r5.<init>(r4)     // Catch:{ all -> 0x02d7 }
            java.lang.Object r1 = r9.getKey()     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "<key "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02d7 }
            r0.append(r7)     // Catch:{ all -> 0x02d7 }
            java.lang.String r8 = ">"
            java.lang.String r0 = X.AnonymousClass000.A0h(r8, r0)     // Catch:{ all -> 0x02d7 }
            android.os.Bundle r1 = A00(r2, r1, r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "tag_1"
            r5.putBundle(r0, r1)     // Catch:{ all -> 0x02d7 }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x010b
            java.lang.Object r1 = r9.getValue()     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "<value "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02d7 }
            r0.append(r7)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r8, r0)     // Catch:{ all -> 0x02d7 }
            android.os.Bundle r1 = A00(r2, r1, r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "tag_2"
            r5.putBundle(r0, r1)     // Catch:{ all -> 0x02d7 }
        L_0x010b:
            int r7 = r7 + 1
            r3.add(r5)     // Catch:{ all -> 0x02d7 }
            goto L_0x00c0
        L_0x0111:
            java.lang.String r0 = "tag_class_type"
            r6.putInt(r0, r4)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "tag_value"
            r6.putParcelableArrayList(r0, r3)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x011d:
            boolean r0 = r9 instanceof java.util.List     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x012f
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x02d7 }
            android.os.Bundle r6 = A01(r2, r9)     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = "tag_class_type"
            r0 = 4
        L_0x012a:
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x012f:
            boolean r0 = r9 instanceof java.util.Set     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x013d
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ all -> 0x02d7 }
            android.os.Bundle r6 = A01(r2, r9)     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = "tag_class_type"
            r0 = 3
            goto L_0x012a
        L_0x013d:
            java.lang.Class r3 = r9.getClass()     // Catch:{ all -> 0x02d7 }
            boolean r0 = r3.isEnum()     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x017c
            r0 = 3
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02d7 }
            r6.<init>(r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = "tag_class_type"
            r0 = 7
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "name"
            java.lang.reflect.Method r1 = A05(r2, r3, r0)     // Catch:{ all -> 0x02d7 }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ ReflectiveOperationException -> 0x0172 }
            java.lang.Object r1 = r1.invoke(r9, r0)     // Catch:{ ReflectiveOperationException -> 0x0172 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ReflectiveOperationException -> 0x0172 }
            java.lang.String r0 = "tag_value"
            r6.putString(r0, r1)     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = r3.getName()     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "tag_class_name"
            r6.putString(r0, r1)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x0172:
            r1 = move-exception
            java.lang.String r0 = "Enum missing name method"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02d7 }
            r3.<init>(r2, r0, r1)     // Catch:{ all -> 0x02d7 }
            goto L_0x02d6
        L_0x017c:
            boolean r0 = r9 instanceof java.lang.Class     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x019a
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x02d7 }
            r0 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02d7 }
            r6.<init>(r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = "tag_class_type"
            r0 = 8
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = r9.getName()     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "tag_value"
            r6.putString(r0, r1)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x019a:
            boolean r0 = r3.isArray()     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x0210
            java.lang.String r4 = r3.getName()     // Catch:{ all -> 0x02d7 }
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x01fe }
            r3.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x01fe }
            java.util.List r3 = A06(r3)     // Catch:{ all -> 0x02d7 }
            int r0 = r3.size()     // Catch:{ all -> 0x02d7 }
            int r0 = r0 + 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02d7 }
            r6.<init>(r0)     // Catch:{ all -> 0x02d7 }
            r1 = 5
            java.lang.String r0 = "tag_class_type"
            r6.putInt(r0, r1)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "tag_class_name"
            r6.putString(r0, r4)     // Catch:{ all -> 0x02d7 }
            java.util.Iterator r5 = r3.iterator()     // Catch:{ all -> 0x02d7 }
        L_0x01c8:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x02a6
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x02d7 }
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch:{ all -> 0x02d7 }
            r0 = 1
            r4.setAccessible(r0)     // Catch:{ all -> 0x02d7 }
            java.lang.Class r0 = r4.getDeclaringClass()     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = r4.getName()     // Catch:{ all -> 0x02d7 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r3 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x02d7 }
            java.lang.Object r1 = r4.get(r9)     // Catch:{ IllegalAccessException -> 0x02c6 }
            if (r1 == 0) goto L_0x01c8
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x02d7 }
            android.os.Bundle r0 = A00(r2, r1, r0)     // Catch:{ all -> 0x02d7 }
            r6.putParcelable(r3, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x01c8
        L_0x01fe:
            r1 = move-exception
            java.lang.String r0 = "Class to deserialize is missing a no args constructor: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r0)     // Catch:{ all -> 0x02d7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02d7 }
            r3.<init>(r2, r0, r1)     // Catch:{ all -> 0x02d7 }
            goto L_0x02d6
        L_0x0210:
            java.lang.String r0 = "Object serializing contains an array, use a list or a set instead"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02d7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x02d6
        L_0x0219:
            r0 = 2
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02d7 }
            r6.<init>(r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = "tag_class_type"
            r0 = 0
            r6.putInt(r1, r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r3 = "tag_value"
            if (r4 == 0) goto L_0x0231
            boolean r0 = X.AnonymousClass000.A1X(r9)     // Catch:{ all -> 0x02d7 }
            r6.putBoolean(r3, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x0231:
            boolean r0 = r9 instanceof java.lang.Byte     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x023f
            java.lang.Byte r9 = (java.lang.Byte) r9     // Catch:{ all -> 0x02d7 }
            byte r0 = r9.byteValue()     // Catch:{ all -> 0x02d7 }
            r6.putByte(r3, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x023f:
            boolean r0 = r9 instanceof java.lang.Character     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x024d
            java.lang.Character r9 = (java.lang.Character) r9     // Catch:{ all -> 0x02d7 }
            char r0 = r9.charValue()     // Catch:{ all -> 0x02d7 }
            r6.putChar(r3, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x024d:
            boolean r0 = r9 instanceof java.lang.Short     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x025b
            java.lang.Short r9 = (java.lang.Short) r9     // Catch:{ all -> 0x02d7 }
            short r0 = r9.shortValue()     // Catch:{ all -> 0x02d7 }
            r6.putShort(r3, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x025b:
            boolean r0 = r9 instanceof java.lang.Integer     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x0269
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x02d7 }
            int r0 = r9.intValue()     // Catch:{ all -> 0x02d7 }
            r6.putInt(r3, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x0269:
            boolean r0 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x0277
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x02d7 }
            long r0 = r9.longValue()     // Catch:{ all -> 0x02d7 }
            r6.putLong(r3, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x0277:
            boolean r0 = r9 instanceof java.lang.Double     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x0285
            java.lang.Double r9 = (java.lang.Double) r9     // Catch:{ all -> 0x02d7 }
            double r0 = r9.doubleValue()     // Catch:{ all -> 0x02d7 }
            r6.putDouble(r3, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x0285:
            boolean r0 = r9 instanceof java.lang.Float     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x0293
            java.lang.Float r9 = (java.lang.Float) r9     // Catch:{ all -> 0x02d7 }
            float r0 = r9.floatValue()     // Catch:{ all -> 0x02d7 }
            r6.putFloat(r3, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x0293:
            boolean r0 = r9 instanceof java.lang.String     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x029d
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x02d7 }
            r6.putString(r3, r9)     // Catch:{ all -> 0x02d7 }
            goto L_0x02a6
        L_0x029d:
            boolean r0 = r9 instanceof android.os.Parcelable     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x02aa
            android.os.Parcelable r9 = (android.os.Parcelable) r9     // Catch:{ all -> 0x02d7 }
            r6.putParcelable(r3, r9)     // Catch:{ all -> 0x02d7 }
        L_0x02a6:
            r2.close()
            return r6
        L_0x02aa:
            java.lang.String r0 = "Unsupported primitive type: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = X.AnonymousClass000.A0d(r9)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x02d7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02d7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x02d6
        L_0x02be:
            java.lang.String r0 = "Bundling of null object is not supported"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02d7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x02d6
        L_0x02c6:
            r1 = move-exception
            java.lang.String r0 = "Field is not accessible: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ all -> 0x02d7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02d7 }
            r3.<init>(r2, r0, r1)     // Catch:{ all -> 0x02d7 }
        L_0x02d6:
            throw r3     // Catch:{ all -> 0x02d7 }
        L_0x02d7:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x02db }
        L_0x02db:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XL.A00(X.0ey, java.lang.Object, java.lang.String):android.os.Bundle");
    }

    public static Bundle A01(C09140ey r7, Collection collection) {
        Bundle bundle = new Bundle(2);
        ArrayList A0u = AnonymousClass000.A0u();
        int i2 = 0;
        for (Object next : collection) {
            StringBuilder A0r = AnonymousClass000.A0r("<item ");
            A0r.append(i2);
            A0u.add(A00(r7, next, AnonymousClass000.A0h(">", A0r)));
            i2++;
        }
        bundle.putParcelableArrayList("tag_value", A0u);
        return bundle;
    }

    public static Bundle A02(Object obj) {
        String A04 = A04(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", AnonymousClass000.A0h(A04, AnonymousClass000.A0r("Bundling ")));
        }
        return A00(C09140ey.A00(), obj, A04);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: androidx.core.graphics.drawable.IconCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: ?} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: java.util.HashMap} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c3, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02c6, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02cb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3 = new X.AnonymousClass0Dc(r2, X.AnonymousClass000.A0h(r4, X.AnonymousClass000.A0r("Method to create IInterface from a Binder is not accessible for interface: ")), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        r3 = new X.AnonymousClass0Dc(r2, X.AnonymousClass000.A0h(r4, X.AnonymousClass000.A0r("Binder for unknown IInterface: ")), r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x001e, B:11:0x003d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A03(android.os.Bundle r10, X.C09140ey r11) {
        /*
            java.lang.Class<X.0XL> r0 = X.AnonymousClass0XL.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r10.setClassLoader(r0)
            java.lang.String r0 = "tag_class_type"
            int r3 = r10.getInt(r0)
            java.lang.String r0 = X.C09140ey.A02(r10)
            X.0ey r2 = X.C09140ey.A01(r11, r10, r0)
            switch(r3) {
                case 0: goto L_0x001c;
                case 1: goto L_0x002d;
                case 2: goto L_0x0090;
                case 3: goto L_0x00de;
                case 4: goto L_0x00e8;
                case 5: goto L_0x00f1;
                case 6: goto L_0x01c3;
                case 7: goto L_0x01e3;
                case 8: goto L_0x027a;
                case 9: goto L_0x02a0;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x02b0
        L_0x001c:
            java.lang.String r0 = "tag_value"
            java.lang.Object r5 = r10.get(r0)     // Catch:{ all -> 0x02c7 }
            if (r5 != 0) goto L_0x02c3
            java.lang.String r0 = "Bundle is missing the primitive value"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x002d:
            java.lang.String r0 = "tag_value"
            android.os.IBinder r5 = r10.getBinder(r0)     // Catch:{ all -> 0x02c7 }
            if (r5 == 0) goto L_0x0087
            java.lang.String r0 = "tag_class_name"
            java.lang.String r4 = r10.getString(r0)     // Catch:{ all -> 0x02c7 }
            if (r4 == 0) goto L_0x007e
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x006c, ReflectiveOperationException -> 0x005a }
            java.lang.String r0 = "asInterface"
            java.lang.reflect.Method r3 = A05(r2, r1, r0)     // Catch:{ ClassNotFoundException -> 0x006c, ReflectiveOperationException -> 0x005a }
            r1 = 0
            java.lang.Object[] r0 = X.AnonymousClass000.A1a(r5)     // Catch:{ ClassNotFoundException -> 0x006c, ReflectiveOperationException -> 0x005a }
            java.lang.Object r5 = r3.invoke(r1, r0)     // Catch:{ ClassNotFoundException -> 0x006c, ReflectiveOperationException -> 0x005a }
            if (r5 != 0) goto L_0x02c3
            java.lang.String r1 = "Failed to get interface from binder"
            X.0Dc r0 = new X.0Dc     // Catch:{ ClassNotFoundException -> 0x006c, ReflectiveOperationException -> 0x005a }
            r0.<init>(r2, r1)     // Catch:{ ClassNotFoundException -> 0x006c, ReflectiveOperationException -> 0x005a }
            throw r0     // Catch:{ ClassNotFoundException -> 0x006c, ReflectiveOperationException -> 0x005a }
        L_0x005a:
            r1 = move-exception
            java.lang.String r0 = "Method to create IInterface from a Binder is not accessible for interface: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r0)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0, r1)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x006c:
            r1 = move-exception
            java.lang.String r0 = "Binder for unknown IInterface: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r0)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0, r1)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x007e:
            java.lang.String r0 = "Bundle is missing IInterface class name"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x0087:
            java.lang.String r0 = "Bundle is missing the binder"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x0090:
            java.lang.String r0 = "tag_value"
            java.util.ArrayList r0 = r10.getParcelableArrayList(r0)     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x00d5
            java.util.HashMap r5 = X.AnonymousClass000.A0x()     // Catch:{ all -> 0x02c7 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x02c7 }
        L_0x00a0:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x02c3
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x02c7 }
            android.os.Parcelable r3 = (android.os.Parcelable) r3     // Catch:{ all -> 0x02c7 }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = "tag_1"
            android.os.Bundle r1 = r3.getBundle(r0)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = "tag_2"
            android.os.Bundle r0 = r3.getBundle(r0)     // Catch:{ all -> 0x02c7 }
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r1 = A03(r1, r2)     // Catch:{ all -> 0x02c7 }
            if (r0 != 0) goto L_0x00c4
            r0 = 0
            goto L_0x00c8
        L_0x00c4:
            java.lang.Object r0 = A03(r0, r2)     // Catch:{ all -> 0x02c7 }
        L_0x00c8:
            r5.put(r1, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x00a0
        L_0x00cc:
            java.lang.String r0 = "Bundle is missing key"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x00d5:
            java.lang.String r0 = "Bundle is missing the map"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x00de:
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x02c7 }
            r5.<init>()     // Catch:{ all -> 0x02c7 }
            A08(r10, r2, r5)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c3
        L_0x00e8:
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02c7 }
            A08(r10, r2, r5)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c3
        L_0x00f1:
            java.lang.String r6 = "CarApp.Bun"
            java.lang.String r0 = "tag_class_name"
            java.lang.String r3 = r10.getString(r0)     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x01ba
            java.lang.Class r7 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            r5 = 0
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.reflect.Constructor r1 = r7.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            r4 = 1
            r1.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.Object r5 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.util.List r0 = A06(r7)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
        L_0x0118:
            boolean r0 = r9.hasNext()     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            if (r0 == 0) goto L_0x02c3
            java.lang.Object r7 = r9.next()     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            r7.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.Class r0 = r7.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.String r0 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.String r1 = r7.getName()     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r0)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.String r8 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.Object r1 = r10.get(r8)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            if (r1 != 0) goto L_0x014d
            java.lang.String r1 = "androidx.core.graphics.drawable.IconCompat"
            java.lang.String r0 = "android.support.v4.graphics.drawable.IconCompat"
            java.lang.String r0 = r8.replaceAll(r1, r0)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.Object r1 = r10.get(r0)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
        L_0x014d:
            boolean r0 = r1 instanceof android.os.Bundle     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            if (r0 == 0) goto L_0x015b
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.Object r0 = A03(r1, r2)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            r7.set(r5, r0)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            goto L_0x0118
        L_0x015b:
            if (r1 != 0) goto L_0x0118
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r6, r0)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            if (r0 == 0) goto L_0x0118
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            java.lang.String r0 = "Value is null for field: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r7, r0, r1)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            android.util.Log.d(r6, r0)     // Catch:{ ClassNotFoundException -> 0x01a8, NoSuchMethodException -> 0x0196, ReflectiveOperationException -> 0x0184, IllegalArgumentException -> 0x0172 }
            goto L_0x0118
        L_0x0172:
            r1 = move-exception
            java.lang.String r0 = "Failed to deserialize class: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0, r1)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x0184:
            r1 = move-exception
            java.lang.String r0 = "Constructor or field is not accessible: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0, r1)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x0196:
            r1 = move-exception
            java.lang.String r0 = "Object missing no args constructor: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0, r1)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x01a8:
            r1 = move-exception
            java.lang.String r0 = "Object for unknown class: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0, r1)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x01ba:
            java.lang.String r0 = "Bundle is missing the class name"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x01c3:
            java.lang.String r0 = "tag_value"
            android.os.Bundle r0 = r10.getBundle(r0)     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x01da
            androidx.core.graphics.drawable.IconCompat r5 = androidx.core.graphics.drawable.IconCompat.A03(r0)     // Catch:{ all -> 0x02c7 }
            if (r5 != 0) goto L_0x02c3
            java.lang.String r0 = "Failed to create IconCompat from bundle"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x01da:
            java.lang.String r0 = "IconCompat bundle is null"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x01e3:
            java.lang.String r0 = "tag_value"
            java.lang.String r6 = r10.getString(r0)     // Catch:{ all -> 0x02c7 }
            java.lang.String r5 = "]"
            if (r6 == 0) goto L_0x0267
            java.lang.String r0 = "tag_class_name"
            java.lang.String r3 = r10.getString(r0)     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x0254
            java.lang.Class r1 = java.lang.Class.forName(r3)     // Catch:{ IllegalArgumentException -> 0x0238, ClassNotFoundException -> 0x0221, ReflectiveOperationException -> 0x020a }
            java.lang.String r0 = "valueOf"
            java.lang.reflect.Method r4 = A05(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x0238, ClassNotFoundException -> 0x0221, ReflectiveOperationException -> 0x020a }
            r1 = 0
            java.lang.Object[] r0 = X.AnonymousClass000.A1a(r6)     // Catch:{ IllegalArgumentException -> 0x0238, ClassNotFoundException -> 0x0221, ReflectiveOperationException -> 0x020a }
            java.lang.Object r5 = r4.invoke(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0238, ClassNotFoundException -> 0x0221, ReflectiveOperationException -> 0x020a }
            goto L_0x02c3
        L_0x020a:
            r4 = move-exception
            java.lang.String r0 = "Enum of class ["
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02c7 }
            r1.append(r3)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = "] missing valueOf method"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0, r4)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x0221:
            r4 = move-exception
            java.lang.String r0 = "Enum class ["
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02c7 }
            r1.append(r3)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = "] not found"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0, r4)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x0238:
            r4 = move-exception
            java.lang.String r0 = "Enum value ["
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02c7 }
            r1.append(r6)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = "] does not exist in enum class ["
            r1.append(r0)     // Catch:{ all -> 0x02c7 }
            r1.append(r3)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r1)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0, r4)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x0254:
            java.lang.String r0 = "Missing enum className ["
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02c7 }
            r0.append(r3)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r0)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x0267:
            java.lang.String r0 = "Missing enum name ["
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02c7 }
            r0.append(r6)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r0)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x027a:
            java.lang.String r0 = "tag_value"
            java.lang.String r3 = r10.getString(r0)     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x0298
            java.lang.Class r5 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0287 }
            goto L_0x02c3
        L_0x0287:
            r1 = move-exception
            java.lang.String r0 = "Class name is unknown: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0, r1)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x0298:
            java.lang.String r0 = "Class is missing the class name"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x02a0:
            java.lang.String r0 = "tag_value"
            android.os.IBinder r5 = r10.getBinder(r0)     // Catch:{ all -> 0x02c7 }
            if (r5 != 0) goto L_0x02c3
            java.lang.String r0 = "Bundle is missing the binder"
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c2
        L_0x02b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = "Unsupported class type in bundle: "
            r1.append(r0)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r3)     // Catch:{ all -> 0x02c7 }
            X.0Dc r3 = new X.0Dc     // Catch:{ all -> 0x02c7 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x02c7 }
        L_0x02c2:
            throw r3     // Catch:{ all -> 0x02c7 }
        L_0x02c3:
            r2.close()
            return r5
        L_0x02c7:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x02cb }
        L_0x02cb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XL.A03(android.os.Bundle, X.0ey):java.lang.Object");
    }

    public static String A04(Class cls) {
        String str = (String) A01.get(cls);
        return str == null ? List.class.isAssignableFrom(cls) ? "<List>" : Map.class.isAssignableFrom(cls) ? "<Map>" : Set.class.isAssignableFrom(cls) ? "<Set>" : cls.getSimpleName() : str;
    }

    public static Method A05(C09140ey r5, Class cls, String str) {
        if (cls == null || cls == Object.class) {
            StringBuilder A0r = AnonymousClass000.A0r("No method ");
            A0r.append(str);
            throw new AnonymousClass0Dc(r5, AnonymousClass000.A0e(cls, " in class ", A0r));
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return A05(r5, cls.getSuperclass(), str);
    }

    public static List A06(Class cls) {
        ArrayList A0u = AnonymousClass000.A0u();
        if (!(cls == null || cls == Object.class)) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    A0u.add(field);
                }
            }
            A0u.addAll(A06(cls.getSuperclass()));
        }
        return A0u;
    }

    public static void A07(Bundle bundle) {
        if (Log.isLoggable("CarApp.Bun", 3)) {
            StringBuilder A0r = AnonymousClass000.A0r("Unbundling ");
            String str = (String) AnonymousClass000.A0Y(A00, bundle.getInt("tag_class_type"));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", AnonymousClass000.A0h(str, A0r));
        }
        A03(bundle, C09140ey.A00());
    }

    public static void A08(Bundle bundle, C09140ey r2, Collection collection) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                collection.add(A03((Bundle) ((Parcelable) it.next()), r2));
            }
            return;
        }
        throw new AnonymousClass0Dc(r2, "Bundle is missing the collection");
    }
}
