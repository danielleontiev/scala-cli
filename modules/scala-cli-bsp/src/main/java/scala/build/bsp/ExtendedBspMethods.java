package scala.build.bsp;

import org.eclipse.lsp4j.jsonrpc.services.JsonNotification;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

import ch.epfl.scala.bsp4j.InitializeBuildParams;

import java.util.concurrent.CompletableFuture;

public interface ExtendedBspMethods {
    @JsonRequest("build/initialize")
    CompletableFuture<ExtendedInitializeBuildResult> buildInitialize(InitializeBuildParams params);
}
