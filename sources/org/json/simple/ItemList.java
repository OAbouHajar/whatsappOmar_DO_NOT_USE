package org.json.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ItemList {
    List items = new ArrayList();
    private String sp = ",";

    public ItemList() {
    }

    public ItemList(String str) {
        split(str, this.sp, this.items);
    }

    public ItemList(String str, String str2) {
        this.sp = str;
        split(str, str2, this.items);
    }

    public ItemList(String str, String str2, boolean z2) {
        split(str, str2, this.items, z2);
    }

    public void add(int i2, String str) {
        if (str != null) {
            this.items.add(i2, str.trim());
        }
    }

    public void add(String str) {
        if (str != null) {
            this.items.add(str.trim());
        }
    }

    public void addAll(String str) {
        split(str, this.sp, this.items);
    }

    public void addAll(String str, String str2) {
        split(str, str2, this.items);
    }

    public void addAll(String str, String str2, boolean z2) {
        split(str, str2, this.items, z2);
    }

    public void addAll(ItemList itemList) {
        this.items.addAll(itemList.items);
    }

    public void clear() {
        this.items.clear();
    }

    public String get(int i2) {
        return (String) this.items.get(i2);
    }

    public String[] getArray() {
        return (String[]) this.items.toArray();
    }

    public List getItems() {
        return this.items;
    }

    public void reset() {
        this.sp = ",";
        this.items.clear();
    }

    public void setSP(String str) {
        this.sp = str;
    }

    public int size() {
        return this.items.size();
    }

    public void split(String str, String str2, List list) {
        int i2;
        if (str != null && str2 != null) {
            int i3 = 0;
            do {
                i2 = i3;
                int indexOf = str.indexOf(str2, i3);
                if (indexOf == -1) {
                    break;
                }
                list.add(str.substring(i2, indexOf).trim());
                i3 = indexOf + str2.length();
            } while (i3 != -1);
            list.add(str.substring(i2).trim());
        }
    }

    public void split(String str, String str2, List list, boolean z2) {
        if (str != null && str2 != null) {
            if (z2) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
                while (stringTokenizer.hasMoreTokens()) {
                    list.add(stringTokenizer.nextToken().trim());
                }
                return;
            }
            split(str, str2, list);
        }
    }

    public String toString() {
        return toString(this.sp);
    }

    public String toString(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < this.items.size(); i2++) {
            if (i2 == 0) {
                stringBuffer.append(this.items.get(i2));
            } else {
                stringBuffer.append(str);
                stringBuffer.append(this.items.get(i2));
            }
        }
        return stringBuffer.toString();
    }
}
