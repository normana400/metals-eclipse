package com.idiomaticsoft.lsp.scala.metals

import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.lsp4j.jsonrpc.services.JsonNotification
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest
import java.util.concurrent.CompletableFuture


trait MetalsLanguageClient extends LanguageClient {
	
	
	@JsonNotification("metals/status")
	def metalsStatus(status: MetalsStatusParams): Unit

	@JsonRequest("metals/slowTask")
	def metalsSlowTask(status: MetalsSlowTaskParams): CompletableFuture[MetalsSlowTaskResult]

}