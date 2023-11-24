package load_test;

import io.gatling.javaapi.core.ChainBuilder;
import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.http.HttpDsl;

import static io.gatling.javaapi.core.CoreDsl.StringBody;

public class Steps {

    public static ChainBuilder messageReq = CoreDsl.exec(
            HttpDsl.http("sendMessage")
                    .post("/api/message")
                    .header("Content-Type", "application/json")
                    .body(StringBody("Test message"))
                    .check(HttpDsl.status().is(200))
    );

}
