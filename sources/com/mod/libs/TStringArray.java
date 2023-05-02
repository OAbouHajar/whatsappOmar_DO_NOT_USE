package com.mod.libs;

import java.util.ArrayList;
import java.util.Arrays;

public class TStringArray {
    private ArrayList<String> arrList = new ArrayList<>();

    public void Add(String str) {
        this.arrList.add(str);
    }

    public void Clear() {
        this.arrList = new ArrayList<>();
    }

    public int Count() {
        return this.arrList.size();
    }

    public void Delete(int i2) {
        this.arrList.remove(i2);
    }

    public void LoadFromText(String str) {
        this.arrList = new ArrayList<>(Arrays.asList(str.split(",")));
    }

    public String SaveToText() {
        String substring = this.arrList.toString().substring(1);
        return substring.substring(0, substring.length() - 1).replaceAll(", ", ",");
    }

    public String Strings(int i2) {
        return this.arrList.get(i2);
    }

    public void Update(int i2, String str) {
        this.arrList.set(i2, str);
    }
}
