package com.obwhatsapp.infra.graphql.generated.mex.missing;

import X.C12220k2;
import X.C13680ns;
import java.util.Set;

public class UpdateUserStatusRequestString implements C12220k2 {
    public final String A00;

    public UpdateUserStatusRequestString(String str, String str2) {
        this.A00 = str;
    }

    public String getCallName() {
        throw C13680ns.A0m();
    }

    public String getQueryName() {
        return this.A00;
    }

    public String getQueryText() {
        return "query UpdateUserStatusQuery($users:[XWA2UserUpdateVersions!]!$updates:[XWA2UserUpdateCategory!]!){xwa2_users_updates_since(users:$users,updates:$updates){jid updates{__typename ...on XWA2UserStatusUpdate{dhash text}}}}";
    }

    public Set getRuntimeDefaultParams() {
        throw C13680ns.A0m();
    }

    public Class getTreeModelType() {
        throw C13680ns.A0m();
    }

    public long getTreeShapeHash() {
        throw C13680ns.A0m();
    }

    public int getTypeTag() {
        throw C13680ns.A0m();
    }

    public boolean hasVirtualRootType() {
        throw C13680ns.A0m();
    }

    public boolean isMutation() {
        throw C13680ns.A0m();
    }

    public boolean isRootedOnOperation() {
        throw C13680ns.A0m();
    }

    public boolean isVarArgsCall() {
        throw C13680ns.A0m();
    }

    public C12220k2 setEnableFullConsistency(boolean z2) {
        throw C13680ns.A0m();
    }

    public C12220k2 setParam_DO_NOT_USE(String str, Object obj) {
        throw C13680ns.A0m();
    }
}
