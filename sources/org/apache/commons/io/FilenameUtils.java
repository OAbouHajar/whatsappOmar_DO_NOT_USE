package org.apache.commons.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class FilenameUtils {
    public static final char EXTENSION_SEPARATOR = '.';
    public static final String EXTENSION_SEPARATOR_STR = Character.toString(EXTENSION_SEPARATOR);
    private static final char OTHER_SEPARATOR;
    private static final char SYSTEM_SEPARATOR = File.separatorChar;
    private static final char UNIX_SEPARATOR = '/';
    private static final char WINDOWS_SEPARATOR = '\\';

    static {
        if (isSystemWindows()) {
            OTHER_SEPARATOR = '/';
        } else {
            OTHER_SEPARATOR = '\\';
        }
    }

    public static String concat(String str, String str2) {
        int prefixLength = getPrefixLength(str2);
        if (prefixLength < 0) {
            return null;
        }
        if (prefixLength > 0) {
            return normalize(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return normalize(str2);
        }
        if (isSeparator(str.charAt(length - 1))) {
            return normalize(str + str2);
        }
        return normalize(str + '/' + str2);
    }

    public static boolean directoryContains(String str, String str2) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Directory must not be null");
        } else if (str2 != null && !IOCase.SYSTEM.checkEquals(str, str2)) {
            return IOCase.SYSTEM.checkStartsWith(str2, str);
        } else {
            return false;
        }
    }

    private static String doGetFullPath(String str, boolean z2) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        if (prefixLength >= str.length()) {
            return z2 ? getPrefix(str) : str;
        }
        int indexOfLastSeparator = indexOfLastSeparator(str);
        if (indexOfLastSeparator < 0) {
            return str.substring(0, prefixLength);
        }
        int i2 = indexOfLastSeparator + (z2 ? 1 : 0);
        if (i2 == 0) {
            i2++;
        }
        return str.substring(0, i2);
    }

    private static String doGetPath(String str, int i2) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        int indexOfLastSeparator = indexOfLastSeparator(str);
        int i3 = indexOfLastSeparator + i2;
        return (prefixLength >= str.length() || indexOfLastSeparator < 0 || prefixLength >= i3) ? "" : str.substring(prefixLength, i3);
    }

    private static String doNormalize(String str, char c2, boolean z2) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int prefixLength = getPrefixLength(str);
        if (prefixLength < 0) {
            return null;
        }
        char[] cArr = new char[(length + 2)];
        str.getChars(0, str.length(), cArr, 0);
        char c3 = SYSTEM_SEPARATOR;
        if (c2 == c3) {
            c3 = OTHER_SEPARATOR;
        }
        for (int i2 = 0; i2 < cArr.length; i2++) {
            if (cArr[i2] == c3) {
                cArr[i2] = c2;
            }
        }
        boolean z3 = true;
        if (cArr[length - 1] != c2) {
            cArr[length] = c2;
            z3 = false;
            length++;
        }
        int i3 = prefixLength + 1;
        while (i3 < length) {
            if (cArr[i3] == c2 && cArr[i3 - 1] == c2) {
                System.arraycopy(cArr, i3, cArr, i3 - 1, length - i3);
                length--;
                i3--;
            }
            i3++;
        }
        int i4 = prefixLength + 1;
        while (i4 < length) {
            if (cArr[i4] == c2 && cArr[i4 - 1] == '.' && (i4 == prefixLength + 1 || cArr[i4 - 2] == c2)) {
                if (i4 == length - 1) {
                    z3 = true;
                }
                System.arraycopy(cArr, i4 + 1, cArr, i4 - 1, length - i4);
                length -= 2;
                i4--;
            }
            i4++;
        }
        int i5 = prefixLength + 2;
        while (i5 < length) {
            if (cArr[i5] == c2 && cArr[i5 - 1] == '.' && cArr[i5 - 2] == '.' && (i5 == prefixLength + 2 || cArr[i5 - 3] == c2)) {
                if (i5 != prefixLength + 2) {
                    if (i5 == length - 1) {
                        z3 = true;
                    }
                    int i6 = i5 - 4;
                    while (true) {
                        if (i6 < prefixLength) {
                            System.arraycopy(cArr, i5 + 1, cArr, prefixLength, length - i5);
                            length -= (i5 + 1) - prefixLength;
                            i5 = prefixLength + 1;
                            break;
                        } else if (cArr[i6] == c2) {
                            System.arraycopy(cArr, i5 + 1, cArr, i6 + 1, length - i5);
                            length -= i5 - i6;
                            i5 = i6 + 1;
                            break;
                        } else {
                            i6--;
                        }
                    }
                } else {
                    return null;
                }
            }
            i5++;
        }
        return length <= 0 ? "" : length <= prefixLength ? new String(cArr, 0, length) : (!z3 || !z2) ? new String(cArr, 0, length - 1) : new String(cArr, 0, length);
    }

    public static boolean equals(String str, String str2) {
        return equals(str, str2, false, IOCase.SENSITIVE);
    }

    public static boolean equals(String str, String str2, boolean z2, IOCase iOCase) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        if (z2) {
            str = normalize(str);
            str2 = normalize(str2);
            if (str == null || str2 == null) {
                throw new NullPointerException("Error normalizing one or both of the file names");
            }
        }
        if (iOCase == null) {
            iOCase = IOCase.SENSITIVE;
        }
        return iOCase.checkEquals(str, str2);
    }

    public static boolean equalsNormalized(String str, String str2) {
        return equals(str, str2, true, IOCase.SENSITIVE);
    }

    public static boolean equalsNormalizedOnSystem(String str, String str2) {
        return equals(str, str2, true, IOCase.SYSTEM);
    }

    public static boolean equalsOnSystem(String str, String str2) {
        return equals(str, str2, false, IOCase.SYSTEM);
    }

    public static String getBaseName(String str) {
        return removeExtension(getName(str));
    }

    public static String getExtension(String str) {
        if (str == null) {
            return null;
        }
        int indexOfExtension = indexOfExtension(str);
        return indexOfExtension == -1 ? "" : str.substring(indexOfExtension + 1);
    }

    public static String getFullPath(String str) {
        return doGetFullPath(str, true);
    }

    public static String getFullPathNoEndSeparator(String str) {
        return doGetFullPath(str, false);
    }

    public static String getName(String str) {
        if (str == null) {
            return null;
        }
        return str.substring(indexOfLastSeparator(str) + 1);
    }

    public static String getPath(String str) {
        return doGetPath(str, 1);
    }

    public static String getPathNoEndSeparator(String str) {
        return doGetPath(str, 0);
    }

    public static String getPrefix(String str) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        if (prefixLength <= str.length()) {
            return str.substring(0, prefixLength);
        }
        return str + '/';
    }

    public static int getPrefixLength(String str) {
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (charAt == '~') {
                return 2;
            }
            return isSeparator(charAt) ? 1 : 0;
        } else if (charAt == '~') {
            int indexOf = str.indexOf(47, 1);
            int indexOf2 = str.indexOf(92, 1);
            if (indexOf == -1 && indexOf2 == -1) {
                return length + 1;
            }
            int i2 = indexOf == -1 ? indexOf2 : indexOf;
            return Math.min(i2, indexOf2 == -1 ? i2 : indexOf2) + 1;
        } else {
            char charAt2 = str.charAt(1);
            if (charAt2 == ':') {
                char upperCase = Character.toUpperCase(charAt);
                if (upperCase < 'A' || upperCase > 'Z') {
                    return -1;
                }
                return (length == 2 || !isSeparator(str.charAt(2))) ? 2 : 3;
            } else if (!isSeparator(charAt) || !isSeparator(charAt2)) {
                return isSeparator(charAt) ? 1 : 0;
            } else {
                int indexOf3 = str.indexOf(47, 2);
                int indexOf4 = str.indexOf(92, 2);
                if ((indexOf3 == -1 && indexOf4 == -1) || indexOf3 == 2 || indexOf4 == 2) {
                    return -1;
                }
                int i3 = indexOf3 == -1 ? indexOf4 : indexOf3;
                return Math.min(i3, indexOf4 == -1 ? i3 : indexOf4) + 1;
            }
        }
    }

    public static int indexOfExtension(String str) {
        int lastIndexOf;
        if (str != null && indexOfLastSeparator(str) <= (lastIndexOf = str.lastIndexOf(46))) {
            return lastIndexOf;
        }
        return -1;
    }

    public static int indexOfLastSeparator(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static boolean isExtension(String str, String str2) {
        if (str == null) {
            return false;
        }
        return (str2 == null || str2.length() == 0) ? indexOfExtension(str) == -1 : getExtension(str).equals(str2);
    }

    public static boolean isExtension(String str, Collection<String> collection) {
        if (str == null) {
            return false;
        }
        if (collection == null || collection.isEmpty()) {
            return indexOfExtension(str) == -1;
        }
        String extension = getExtension(str);
        for (String equals : collection) {
            if (extension.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExtension(String str, String[] strArr) {
        if (str == null) {
            return false;
        }
        if (strArr == null || strArr.length == 0) {
            return indexOfExtension(str) == -1;
        }
        String extension = getExtension(str);
        for (String equals : strArr) {
            if (extension.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSeparator(char c2) {
        return c2 == '/' || c2 == '\\';
    }

    static boolean isSystemWindows() {
        return SYSTEM_SEPARATOR == '\\';
    }

    public static String normalize(String str) {
        return doNormalize(str, SYSTEM_SEPARATOR, true);
    }

    public static String normalize(String str, boolean z2) {
        return doNormalize(str, z2 ? '/' : '\\', true);
    }

    public static String normalizeNoEndSeparator(String str) {
        return doNormalize(str, SYSTEM_SEPARATOR, false);
    }

    public static String normalizeNoEndSeparator(String str, boolean z2) {
        return doNormalize(str, z2 ? '/' : '\\', false);
    }

    public static String removeExtension(String str) {
        if (str == null) {
            return null;
        }
        int indexOfExtension = indexOfExtension(str);
        return indexOfExtension == -1 ? str : str.substring(0, indexOfExtension);
    }

    public static String separatorsToSystem(String str) {
        if (str == null) {
            return null;
        }
        return isSystemWindows() ? separatorsToWindows(str) : separatorsToUnix(str);
    }

    public static String separatorsToUnix(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace('\\', '/');
    }

    public static String separatorsToWindows(String str) {
        return (str == null || str.indexOf(47) == -1) ? str : str.replace('/', '\\');
    }

    static String[] splitOnTokens(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            if (charArray[i2] == '?' || charArray[i2] == '*') {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (charArray[i2] == '?') {
                    arrayList.add("?");
                } else if (arrayList.isEmpty() || (i2 > 0 && !((String) arrayList.get(arrayList.size() - 1)).equals("*"))) {
                    arrayList.add("*");
                }
            } else {
                sb.append(charArray[i2]);
            }
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean wildcardMatch(String str, String str2) {
        return wildcardMatch(str, str2, IOCase.SENSITIVE);
    }

    public static boolean wildcardMatch(String str, String str2, IOCase iOCase) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        IOCase iOCase2 = iOCase == null ? IOCase.SENSITIVE : iOCase;
        String[] splitOnTokens = splitOnTokens(str2);
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        Stack stack = new Stack();
        do {
            if (stack.size() > 0) {
                int[] iArr = (int[]) stack.pop();
                i3 = iArr[0];
                i2 = iArr[1];
                z2 = true;
            }
            while (i3 < splitOnTokens.length) {
                if (splitOnTokens[i3].equals("?")) {
                    i2++;
                    if (i2 > str.length()) {
                        break;
                    }
                    z2 = false;
                } else if (splitOnTokens[i3].equals("*")) {
                    z2 = true;
                    if (i3 == splitOnTokens.length - 1) {
                        i2 = str.length();
                    }
                } else {
                    if (!z2) {
                        if (!iOCase2.checkRegionMatches(str, i2, splitOnTokens[i3])) {
                            break;
                        }
                    } else {
                        i2 = iOCase2.checkIndexOf(str, i2, splitOnTokens[i3]);
                        if (i2 == -1) {
                            break;
                        }
                        int checkIndexOf = iOCase2.checkIndexOf(str, i2 + 1, splitOnTokens[i3]);
                        if (checkIndexOf >= 0) {
                            stack.push(new int[]{i3, checkIndexOf});
                        }
                    }
                    i2 += splitOnTokens[i3].length();
                    z2 = false;
                }
                i3++;
            }
            if (i3 == splitOnTokens.length && i2 == str.length()) {
                return true;
            }
        } while (stack.size() > 0);
        return false;
    }

    public static boolean wildcardMatchOnSystem(String str, String str2) {
        return wildcardMatch(str, str2, IOCase.SYSTEM);
    }
}
