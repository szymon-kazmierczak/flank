package ftl.handlers;

import io.vertx.core.Handler
import io.vertx.ext.web.api.RequestParameters
import io.vertx.ext.web.RoutingContext

class CreateV1ProjectsTestMatricesByProjectIdHandler : Handler<RoutingContext> {
    override fun handle(routingContext: RoutingContext) {
        var params: RequestParameters = routingContext.get("parsedParameters")
        // Handle CreateV1ProjectsTestMatricesByProjectId
        routingContext.response().setStatusCode(501).setStatusMessage("Not Implemented").end()
    }
}