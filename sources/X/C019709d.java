package X;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* renamed from: X.09d  reason: invalid class name and case insensitive filesystem */
public final class C019709d {
    public static final Bundle A00(C25401Jq... r9) {
        Bundle bundle = new Bundle(r7);
        for (C25401Jq r0 : r9) {
            String str = (String) r0.A01();
            Object A02 = r0.A02();
            if (A02 == null) {
                bundle.putString(str, (String) null);
            } else if (A02 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) A02).booleanValue());
            } else if (A02 instanceof Byte) {
                bundle.putByte(str, ((Number) A02).byteValue());
            } else if (A02 instanceof Character) {
                bundle.putChar(str, ((Character) A02).charValue());
            } else if (A02 instanceof Double) {
                bundle.putDouble(str, ((Number) A02).doubleValue());
            } else if (A02 instanceof Float) {
                bundle.putFloat(str, ((Number) A02).floatValue());
            } else if (A02 instanceof Integer) {
                bundle.putInt(str, ((Number) A02).intValue());
            } else if (A02 instanceof Long) {
                bundle.putLong(str, ((Number) A02).longValue());
            } else if (A02 instanceof Short) {
                bundle.putShort(str, ((Number) A02).shortValue());
            } else if (A02 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) A02);
            } else if (A02 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) A02);
            } else if (A02 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) A02);
            } else if (A02 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) A02);
            } else if (A02 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) A02);
            } else if (A02 instanceof char[]) {
                bundle.putCharArray(str, (char[]) A02);
            } else if (A02 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) A02);
            } else if (A02 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) A02);
            } else if (A02 instanceof int[]) {
                bundle.putIntArray(str, (int[]) A02);
            } else if (A02 instanceof long[]) {
                bundle.putLongArray(str, (long[]) A02);
            } else if (A02 instanceof short[]) {
                bundle.putShortArray(str, (short[]) A02);
            } else {
                if (A02 instanceof Object[]) {
                    Class<?> componentType = A02.getClass().getComponentType();
                    C18450wi.A0F(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        bundle.putParcelableArray(str, (Parcelable[]) A02);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        bundle.putStringArray(str, (String[]) A02);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        bundle.putCharSequenceArray(str, (CharSequence[]) A02);
                    } else if (!Serializable.class.isAssignableFrom(componentType)) {
                        String canonicalName = componentType.getCanonicalName();
                        StringBuilder sb = new StringBuilder("Illegal value array type ");
                        sb.append(canonicalName);
                        sb.append(" for key \"");
                        sb.append(str);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!(A02 instanceof Serializable)) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 18) {
                        if (A02 instanceof IBinder) {
                            C04060La.A00(bundle, (IBinder) A02, str);
                        } else if (i2 >= 21) {
                            if (A02 instanceof Size) {
                                C05560Sb.A00(bundle, (Size) A02, str);
                            } else if (A02 instanceof SizeF) {
                                C05560Sb.A01(bundle, (SizeF) A02, str);
                            }
                        }
                    }
                    String canonicalName2 = A02.getClass().getCanonicalName();
                    StringBuilder sb2 = new StringBuilder("Illegal value type ");
                    sb2.append(canonicalName2);
                    sb2.append(" for key \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString());
                }
                bundle.putSerializable(str, (Serializable) A02);
            }
        }
        return bundle;
    }
}
