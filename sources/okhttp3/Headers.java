package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;
import org.apache.commons.io.IOUtils;

/* compiled from: XFMFile */
public final class Headers {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f1966a;

    /* compiled from: XFMFile */
    public final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f1967a = new ArrayList(20);

        public static void c(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    int i3 = 0;
                    while (i3 < length2) {
                        char charAt2 = str2.charAt(i3);
                        if ((charAt2 > 31 || charAt2 == 9) && charAt2 < 127) {
                            i3++;
                        } else {
                            throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i3), str, str2));
                        }
                    }
                    return;
                }
                throw new NullPointerException("value for name " + str + " == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        public final void a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                b(str.substring(0, indexOf), str.substring(indexOf + 1));
            } else if (str.startsWith(":")) {
                b("", str.substring(1));
            } else {
                b("", str);
            }
        }

        public Builder add(String str) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                return add(str.substring(0, indexOf).trim(), str.substring(indexOf + 1));
            }
            throw new IllegalArgumentException("Unexpected header: ".concat(str));
        }

        public Builder add(String str, String str2) {
            c(str, str2);
            b(str, str2);
            return this;
        }

        public Builder addAll(Headers headers) {
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(headers.name(i2), headers.value(i2));
            }
            return this;
        }

        public final void b(String str, String str2) {
            ArrayList arrayList = this.f1967a;
            arrayList.add(str);
            arrayList.add(str2.trim());
        }

        public Headers build() {
            return new Headers(this);
        }

        public String get(String str) {
            ArrayList arrayList = this.f1967a;
            int size = arrayList.size();
            do {
                size -= 2;
                if (size < 0) {
                    return null;
                }
            } while (!str.equalsIgnoreCase((String) arrayList.get(size)));
            return (String) arrayList.get(size + 1);
        }

        public Builder removeAll(String str) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f1967a;
                if (i2 >= arrayList.size()) {
                    return this;
                }
                if (str.equalsIgnoreCase((String) arrayList.get(i2))) {
                    arrayList.remove(i2);
                    arrayList.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
        }

        public Builder set(String str, String str2) {
            c(str, str2);
            removeAll(str);
            b(str, str2);
            return this;
        }
    }

    public Headers(Builder builder) {
        ArrayList arrayList = builder.f1967a;
        this.f1966a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public Headers(String[] strArr) {
        this.f1966a = strArr;
    }

    public static Headers of(Map<String, String> map) {
        if (map != null) {
            String[] strArr = new String[(map.size() * 2)];
            int i2 = 0;
            for (Map.Entry next : map.entrySet()) {
                if (next.getKey() == null || next.getValue() == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                String trim = ((String) next.getKey()).trim();
                String trim2 = ((String) next.getValue()).trim();
                if (trim.length() != 0 && trim.indexOf(0) == -1 && trim2.indexOf(0) == -1) {
                    strArr[i2] = trim;
                    strArr[i2 + 1] = trim2;
                    i2 += 2;
                } else {
                    throw new IllegalArgumentException("Unexpected header: " + trim + ": " + trim2);
                }
            }
            return new Headers(strArr);
        }
        throw new NullPointerException("headers == null");
    }

    public static Headers of(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i2 = 0;
            while (i2 < strArr2.length) {
                String str = strArr2[i2];
                if (str != null) {
                    strArr2[i2] = str.trim();
                    i2++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            int i3 = 0;
            while (i3 < strArr2.length) {
                String str2 = strArr2[i3];
                String str3 = strArr2[i3 + 1];
                if (str2.length() != 0 && str2.indexOf(0) == -1 && str3.indexOf(0) == -1) {
                    i3 += 2;
                } else {
                    throw new IllegalArgumentException("Unexpected header: " + str2 + ": " + str3);
                }
            }
            return new Headers(strArr2);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    public long byteCount() {
        String[] strArr = this.f1966a;
        long length = (long) (strArr.length * 2);
        for (String length2 : strArr) {
            length += (long) length2.length();
        }
        return length;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Headers) && Arrays.equals(((Headers) obj).f1966a, this.f1966a);
    }

    @Nullable
    public String get(String str) {
        String[] strArr = this.f1966a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    @Nullable
    public Date getDate(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return HttpDate.parse(str2);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f1966a);
    }

    public String name(int i2) {
        return this.f1966a[i2 * 2];
    }

    public Set<String> names() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(name(i2));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        Collections.addAll(builder.f1967a, this.f1966a);
        return builder;
    }

    public int size() {
        return this.f1966a.length / 2;
    }

    public Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String lowerCase = name(i2).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i2));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(name(i2));
            sb.append(": ");
            sb.append(value(i2));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    public String value(int i2) {
        return this.f1966a[(i2 * 2) + 1];
    }

    public List<String> values(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equalsIgnoreCase(name(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i2));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }
}
