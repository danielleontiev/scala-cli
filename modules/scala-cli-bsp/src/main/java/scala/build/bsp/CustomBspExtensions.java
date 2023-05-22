package scala.build.bsp;

import ch.epfl.scala.bsp4j.BuildServer;
import ch.epfl.scala.bsp4j.InitializeBuildParams;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

import java.util.concurrent.CompletableFuture;

public interface CustomBspExtensions {
    @JsonRequest("buildTarget/format")
    CompletableFuture<Object> buildTargetFormat(FormatParams params);
}
