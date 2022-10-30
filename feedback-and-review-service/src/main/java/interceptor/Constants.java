package interceptor;

import io.grpc.Context;

public class Constants {

    public static final Context.Key<String> CLIENT_TYPE_CONTEXT_KEY = Context.key("clientType");
}
