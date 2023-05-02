package x;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import okhttp3.internal.Util;

/* compiled from: XFMFile */
public final class e implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final List f2783a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2784b;

    /* renamed from: c  reason: collision with root package name */
    public String f2785c;

    public e(List list) {
        this.f2783a = list;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = Util.EMPTY_STRING_ARRAY;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (!name.equals("unsupported") || Void.TYPE != returnType) {
            boolean equals = name.equals("protocols");
            List list = this.f2783a;
            if (equals && objArr.length == 0) {
                return list;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 instanceof List) {
                    List list2 = (List) obj3;
                    int size = list2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            obj2 = list.get(0);
                            break;
                        } else if (list.contains(list2.get(i2))) {
                            obj2 = list2.get(i2);
                            break;
                        } else {
                            i2++;
                        }
                    }
                    String str = (String) obj2;
                    this.f2785c = str;
                    return str;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f2785c = (String) objArr[0];
            return null;
        }
        this.f2784b = true;
        return null;
    }
}
