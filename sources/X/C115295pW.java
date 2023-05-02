package X;

import android.text.TextUtils;
import java.text.MessageFormat;

/* renamed from: X.5pW  reason: invalid class name and case insensitive filesystem */
public class C115295pW {
    public static String A00(String str) {
        MessageFormat messageFormat;
        String[] strArr;
        int i2;
        String substring;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String replaceAll = str.replaceAll("[^\\d]", "");
        int length = replaceAll.length();
        int i3 = 4;
        if (replaceAll.startsWith("0800") && length == 11) {
            messageFormat = new MessageFormat("{0}-{1}-{2}");
            strArr = new String[3];
            strArr[0] = replaceAll.substring(0, 4);
            i2 = 7;
            substring = replaceAll.substring(4, 7);
        } else if (length == 10 || length == 11) {
            messageFormat = new MessageFormat("{0} {1}-{2}");
            strArr = new String[3];
            strArr[0] = replaceAll.substring(0, 2);
            i2 = 6;
            substring = replaceAll.substring(2, 6);
        } else {
            if (length == 12) {
                messageFormat = new MessageFormat("{0}-{1}-{2}-{3}");
                strArr = new String[]{replaceAll.substring(0, 2), replaceAll.substring(2, 4), replaceAll.substring(4, 8), replaceAll.substring(8)};
            } else if (length != 8 && length != 9) {
                return str;
            } else {
                messageFormat = new MessageFormat("{0}-{1}");
                strArr = new String[2];
                int i4 = 4;
                if (length == 9) {
                    i4 = 5;
                }
                strArr[0] = replaceAll.substring(0, i4);
                if (length == 9) {
                    i3 = 5;
                }
                strArr[1] = replaceAll.substring(i3);
            }
            return messageFormat.format(strArr);
        }
        strArr[1] = substring;
        strArr[2] = replaceAll.substring(i2);
        return messageFormat.format(strArr);
    }
}
