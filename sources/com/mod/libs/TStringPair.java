package com.mod.libs;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class TStringPair {
    private List<NameValuePair> arrList = new ArrayList();

    public void Add(String str, String str2) {
        this.arrList.add(new BasicNameValuePair(str, str2));
    }

    public void Clear() {
        this.arrList.clear();
    }

    public int Count() {
        return this.arrList.size();
    }

    public void Delete(int i2) {
        this.arrList.remove(i2);
    }

    public void Insert(int i2, String str, String str2) {
        this.arrList.add(i2, new BasicNameValuePair(str, str2));
    }

    public String Key(int i2) {
        return this.arrList.get(i2).getName();
    }

    public String Value(int i2) {
        return this.arrList.get(i2).getValue();
    }
}
