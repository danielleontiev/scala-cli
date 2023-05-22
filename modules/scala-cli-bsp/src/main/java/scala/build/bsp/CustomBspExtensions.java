package scala.build.bsp;

import ch.epfl.scala.bsp4j.BuildServer;
import ch.epfl.scala.bsp4j.InitializeBuildParams;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

import java.util.concurrent.CompletableFuture;

public interface CustomBspExtensions {
    @JsonRequest("textDocument/format")
    CompletableFuture<Object> textDocumentFormat(FormatParams params);
}
