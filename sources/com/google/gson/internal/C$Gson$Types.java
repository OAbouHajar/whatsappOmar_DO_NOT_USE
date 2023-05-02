package com.google.gson.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* renamed from: com.google.gson.internal.$Gson$Types  reason: invalid class name */
/* compiled from: XFMFile */
public final class C$Gson$Types {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f278a = new Type[0];

    public static void a(Type type) {
        C$Gson$Preconditions.checkArgument(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    public static GenericArrayType arrayOf(Type type) {
        return new a(type);
    }

    public static boolean b(Type type, Type type2) {
        return type == type2 || (type != null && type.equals(type2));
    }

    public static Type c(Type type, Class<? super Object> cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return c(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type canonicalize(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(canonicalize(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static Type d(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C$Gson$Preconditions.checkArgument(cls2.isAssignableFrom(cls));
        return resolve(type, cls, c(type, cls, cls2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.reflect.ParameterizedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        if (b(r0, r9) != false) goto L_0x0110;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0110 A[EDGE_INSN: B:75:0x0110->B:70:0x0110 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type e(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            boolean r2 = r11 instanceof java.lang.reflect.TypeVariable
            r3 = 0
            if (r2 == 0) goto L_0x005e
            r2 = r11
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            java.lang.Object r4 = r12.get(r2)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            if (r4 == 0) goto L_0x0019
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r4 != r9) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r11 = r4
        L_0x0018:
            return r11
        L_0x0019:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r2, r11)
            if (r1 != 0) goto L_0x0021
            r1 = r2
        L_0x0021:
            java.lang.reflect.GenericDeclaration r11 = r2.getGenericDeclaration()
            boolean r4 = r11 instanceof java.lang.Class
            if (r4 == 0) goto L_0x002c
            java.lang.Class r11 = (java.lang.Class) r11
            goto L_0x002d
        L_0x002c:
            r11 = r0
        L_0x002d:
            if (r11 != 0) goto L_0x0030
            goto L_0x0059
        L_0x0030:
            java.lang.reflect.Type r4 = c(r9, r10, r11)
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L_0x0059
            java.lang.reflect.TypeVariable[] r11 = r11.getTypeParameters()
            int r5 = r11.length
        L_0x003d:
            if (r3 >= r5) goto L_0x0053
            r6 = r11[r3]
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x0050
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r11 = r4.getActualTypeArguments()
            r11 = r11[r3]
            goto L_0x005a
        L_0x0050:
            int r3 = r3 + 1
            goto L_0x003d
        L_0x0053:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            r9.<init>()
            throw r9
        L_0x0059:
            r11 = r2
        L_0x005a:
            if (r11 != r2) goto L_0x0002
            goto L_0x0110
        L_0x005e:
            boolean r0 = r11 instanceof java.lang.Class
            if (r0 == 0) goto L_0x007c
            r0 = r11
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x007c
            java.lang.Class r11 = r0.getComponentType()
            java.lang.reflect.Type r9 = e(r9, r10, r11, r12)
            boolean r10 = b(r11, r9)
            if (r10 == 0) goto L_0x0092
            r11 = r0
            goto L_0x0110
        L_0x007c:
            boolean r0 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0099
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r0 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = e(r9, r10, r0, r12)
            boolean r10 = b(r0, r9)
            if (r10 == 0) goto L_0x0092
            goto L_0x0110
        L_0x0092:
            java.lang.reflect.GenericArrayType r9 = arrayOf(r9)
        L_0x0096:
            r11 = r9
            goto L_0x0110
        L_0x0099:
            boolean r0 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00dc
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r0 = r11.getOwnerType()
            java.lang.reflect.Type r4 = e(r9, r10, r0, r12)
            boolean r0 = b(r4, r0)
            r0 = r0 ^ r2
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L_0x00b2:
            if (r3 >= r6) goto L_0x00d1
            r7 = r5[r3]
            java.lang.reflect.Type r7 = e(r9, r10, r7, r12)
            r8 = r5[r3]
            boolean r8 = b(r7, r8)
            if (r8 != 0) goto L_0x00ce
            if (r0 != 0) goto L_0x00cc
            java.lang.Object r0 = r5.clone()
            r5 = r0
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r0 = 1
        L_0x00cc:
            r5[r3] = r7
        L_0x00ce:
            int r3 = r3 + 1
            goto L_0x00b2
        L_0x00d1:
            if (r0 == 0) goto L_0x0110
            java.lang.reflect.Type r9 = r11.getRawType()
            java.lang.reflect.ParameterizedType r9 = newParameterizedTypeWithOwner(r4, r9, r5)
            goto L_0x0096
        L_0x00dc:
            boolean r0 = r11 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0110
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r0 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r0.length
            if (r5 != r2) goto L_0x00fc
            r2 = r0[r3]
            java.lang.reflect.Type r9 = e(r9, r10, r2, r12)
            r10 = r0[r3]
            if (r9 == r10) goto L_0x0110
            java.lang.reflect.WildcardType r11 = supertypeOf(r9)
            goto L_0x0110
        L_0x00fc:
            int r0 = r4.length
            if (r0 != r2) goto L_0x0110
            r0 = r4[r3]
            java.lang.reflect.Type r9 = e(r9, r10, r0, r12)     // Catch:{ all -> 0x010e }
            r10 = r4[r3]
            if (r9 == r10) goto L_0x0110
            java.lang.reflect.WildcardType r11 = subtypeOf(r9)
            goto L_0x0110
        L_0x010e:
            r9 = move-exception
            throw r9
        L_0x0110:
            if (r1 == 0) goto L_0x0115
            r12.put(r1, r11)
        L_0x0115:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C$Gson$Types.e(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static boolean equals(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return equals(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    public static Type getArrayComponentType(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type getCollectionElementType(Type type, Class<?> cls) {
        Type d2 = d(type, cls, Collection.class);
        if (d2 instanceof WildcardType) {
            d2 = ((WildcardType) d2).getUpperBounds()[0];
        }
        return d2 instanceof ParameterizedType ? ((ParameterizedType) d2).getActualTypeArguments()[0] : Object.class;
    }

    public static Type[] getMapKeyAndValueTypes(Type type, Class<?> cls) {
        if (type == Properties.class) {
            Class<String> cls2 = String.class;
            return new Type[]{cls2, cls2};
        }
        Type d2 = d(type, cls, Map.class);
        if (d2 instanceof ParameterizedType) {
            return ((ParameterizedType) d2).getActualTypeArguments();
        }
        Class<Object> cls3 = Object.class;
        return new Type[]{cls3, cls3};
    }

    public static Class<?> getRawType(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C$Gson$Preconditions.checkArgument(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return getRawType(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
        return new b(type, type2, typeArr);
    }

    public static Type resolve(Type type, Class<?> cls, Type type2) {
        return e(type, cls, type2, new HashMap());
    }

    public static WildcardType subtypeOf(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(typeArr, f278a);
    }

    public static WildcardType supertypeOf(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(new Type[]{Object.class}, typeArr);
    }

    public static String typeToString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
