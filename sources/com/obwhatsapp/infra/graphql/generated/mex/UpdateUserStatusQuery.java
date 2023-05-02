package com.obwhatsapp.infra.graphql.generated.mex;

import X.C34641kb;
import com.obwhatsapp.infra.graphql.generated.mex.UpdateUserStatusQueryImpl;

public final class UpdateUserStatusQuery {

    public interface Builder extends BuilderForUpdates, BuilderForUsers {

        /* renamed from: com.obwhatsapp.infra.graphql.generated.mex.UpdateUserStatusQuery$Builder$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
        }

        Builder setUpdates(C34641kb r1);

        Builder setUsers(C34641kb r1);

        /* bridge */ /* synthetic */ BuilderForUpdates setUsers(C34641kb r1);
    }

    public interface BuilderForUpdates {
        Builder setUpdates(C34641kb r1);
    }

    public interface BuilderForUsers {
        BuilderForUpdates setUsers(C34641kb r1);
    }

    public static BuilderForUsers create() {
        return new UpdateUserStatusQueryImpl.Builder();
    }
}
